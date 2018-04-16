import org.scalatest._

class HelloSpec extends WordSpec with MustMatchers {

  "Hello" must {

    "return 1 when given 2" in {
      Hello.apply(2) mustEqual 1
    }

    "return 2 when given 4" in {
      Hello.apply(4) mustEqual 2
    }


    "return 4 when given 9" in {
      Hello.apply(9) mustEqual 4
    }
  }

}
