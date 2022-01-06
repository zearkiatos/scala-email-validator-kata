package pedrocapriles.scala_email_validator_kata
import scala.util.matching.Regex

final case class EmailValidator(email: String) {
  private val emailPattern = new Regex("""^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$""")
  val isValid = emailPattern.pattern.matcher(email).matches
}
