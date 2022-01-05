import com.typesafe.scalalogging.Logger
import testframework._

object Main extends App {

  val logger = Logger("main2")

  log(implicitly[Position])
  log(implicitly[TpeTag[List[String]]])
  log(s"actuallyAnInt: Int as given by ${implicitly[actuallyAnInt.type <:< Int]}")

  logger.info("Hello, World!")
}
