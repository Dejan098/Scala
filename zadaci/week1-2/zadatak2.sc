type Set = Int => Boolean

def contains(s: Set, elem: Int): Boolean = s(elem)


def singletonSet(elem: Int): Set = Set(elem)

def union(s: Set, t: Set): Set = x => s(x) || t (x)


def intersect(s: Set, t: Set): Set = x => s(x) && t(x)


def diff(s: Set, t: Set): Set = x => s(x) && !t(x)

def filter(s: Set, p: Int => Boolean): Set = x => p(x)
