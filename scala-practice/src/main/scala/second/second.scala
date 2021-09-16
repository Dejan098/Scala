package second

object second extends App {
  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)

  def singletonSet(elem: Int): Set = Set(elem)

  val x = singletonSet(5)

  println(x)
  println(Set(5))

  def union(set1: Set, set2: Set): Set = x => set1(x) || set2(x)

  def intersect(set1: Set, set2: Set): Set = x => set1(x) && set2(x)

  def diff(set1: Set, set2: Set): Set = x => set1(x) && !set2(x)

  def filter(s: Set, p: Int => Boolean): Set = x => p(x)

  val limit = 1000

  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iterator(a: Int): Boolean = {
      if (a == limit) true
      else if (contains(s, a) && !p(a)) false
      else iterator(a + 1)
    }

    iterator(0)
  }

  def exists(s: Set, p: Int => Boolean): Boolean = !forall(s, x => !p(x))


}
