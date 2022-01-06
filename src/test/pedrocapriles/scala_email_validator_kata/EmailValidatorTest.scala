package pedrocapriles.scala_email_validator_kata
import org.scalatest.{Matchers, WordSpec}

final class EmailValidatorTest extends WordSpec with Matchers {
  private val emailMock = "caprilespe@outlook.com"
  private val emailValidation  = EmailValidator(email = emailMock)

  "Email validator class" should {
    "should be compile" in {
      "EmailValidator(email = emailMock)" should compile
    }
    "the email should be valid" in {
      val isValid = emailValidation.isValid

      isValid shouldBe true
    }

    "the email should not be valid if not match with the email format" in {
        val wrongEmailMock = "wrongemail"
        val wrongEmailValidation = emailValidation.copy(email = wrongEmailMock)

        wrongEmailValidation.isValid shouldBe false


      }
  }
}
