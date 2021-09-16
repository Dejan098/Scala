import java.security.KeyStore.TrustedCertificateEntry

import scala.Char.char2double
import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.reflect.internal.util.TriState.True

//zadatak 1
  def pascal(c: Int, r: Int): Int = {
    if(c==0 || r==0 || c==r) 1
    else pascal(c-1,r-1) + pascal(c,r-1)
  }
  pascal(0,2)

  pascal(2,4)

  pascal(1,3)

  pascal(1,2)
// zadatak2
def balance(chars: List[Char]): Boolean ={
  def calculateBrackets(b:Int,firstCharacter:Char,otherCharacters:List[Char]):Int={
    if(otherCharacters.isEmpty){
      if(firstCharacter =='(') b+1
      else if(firstCharacter ==')') b-1
      else b
    } else{
      if(firstCharacter =='(')
        calculateBrackets(b+1,otherCharacters.head,otherCharacters.tail)
      else if( firstCharacter ==')')
        calculateBrackets(b-1,otherCharacters.head,otherCharacters.tail)
      else calculateBrackets(b,otherCharacters.head,otherCharacters.tail)

    }

  }
  if (chars.isEmpty) true
  else calculateBrackets(0,chars.head,chars.tail)==0
}

val a = "(".toList
balance(a)

//zadatak 3

def countChange(money: Int, coins: List[Int]): Int = {
  if (money == 0) 1
  else if (coins.isEmpty && money != 0) 0
  else countChange(money - coins.head, coins) + countChange(money, coins.tail)
}
