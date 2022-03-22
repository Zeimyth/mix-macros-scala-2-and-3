import com.typesafe.scalalogging.Logger
// import org.log4s.getLogger

package object testframework:

  private def logger = Logger("testframework")
  // private def logger = getLogger("testframework")

  import scala.language.experimental.macros

  implicit def pos: Position = macro Scala2Macros.posImpl
  inline given pos: Position = ${ Macros.posImpl }

  implicit def mkTpeTag[T]: TpeTag[T] = macro Scala2Macros.TpeTagImpl.mkTag[T]
  inline given mkTpeTag[T]: TpeTag[T] = ${ Macros.mkTpeTagImpl[T] }

  def actuallyAnInt: Any = macro Scala2Macros.Whitebox.actuallyAnIntImpl
  transparent inline def actuallyAnInt: Any = ${ Macros.actuallyAnIntImpl }

  def log(str: Any): Unit = logger.info(str.toString)
