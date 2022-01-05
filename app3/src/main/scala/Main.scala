import com.typesafe.scalalogging.Logger
import testframework.{_, given}

object Main extends App {

  val logger = Logger("main3")

  log(implicitly[Position])
  log(implicitly[TpeTag[List[String]]])
  log(s"actuallyAnInt: Int as given by ${implicitly[actuallyAnInt.type <:< Int]}")

  logger.info("Hello, World!")

}
