package first

import org.scalatest.verbs.MustVerb
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper

class FirstSpec extends AnyWordSpec with MustVerb {
  "Pascal" when {
    "something" should {
      "do" in {
        "x" mustBe "x"
      }
    }
  }


}
