package pedro.capriles.scala_email_validator_kata

import org.scalatest._
import org.scalatest.Matchers._

final class ScalaEmailValidatorKataTest extends WordSpec with GivenWhenThen {
  "ScalaEmailValidatorKata" should {
    "greet" in {
      Given("a ScalaEmailValidatorKata")

      val scalaEmailValidatorKata = new ScalaEmailValidatorKata

      When("we ask him to greet someone")

      val nameToGreet = "CodelyTV"
      val greeting = scalaEmailValidatorKata.greet(nameToGreet)

      Then("it should say hello to someone")

      greeting shouldBe "Hello " + nameToGreet
    }
  }
}
