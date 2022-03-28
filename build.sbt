ThisBuild / scalaVersion := "3.0.2"
val scala213 = "2.13.8"

lazy val scala2macros = project
  .dependsOn(shared)
  .settings(
    name := "testframework-scala2macros",
    scalaVersion := scala213,
    scalacOptions += "-Ytasty-reader",
    libraryDependencies += "org.scala-lang" % "scala-reflect" % scala213
  )

lazy val testframework = project
  .dependsOn(shared, scala2macros)
  .settings(
    name := "testframework",
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.10", 
    libraryDependencies += "com.typesafe.scala-logging" % "scala-logging_3" % "3.9.4",
    // libraryDependencies += "org.log4s" % "log4s_3" % "1.10.0",
    // libraryDependencies += "org.clapper" % "grizzled-slf4j_3"
  )

lazy val shared = project
  .settings(
    name := "testframework-shared",
  )

lazy val app2 = project
  .dependsOn(testframework)
  .settings(
    name := "mix-macros-demo-scala2",
    scalaVersion := scala213,
    scalacOptions += "-Ytasty-reader",
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.10", 
    libraryDependencies += "com.typesafe.scala-logging" % "scala-logging_3" % "3.9.4",
    // libraryDependencies += "org.log4s" % "log4s_3" % "1.10.0",
    // libraryDependencies += "org.clapper" % "grizzled-slf4j_3"
  )

lazy val app3 = project
  .dependsOn(testframework)
  .settings(
    name := "mix-macros-demo-scala3",
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.10", 
    libraryDependencies += "com.typesafe.scala-logging" % "scala-logging_3" % "3.9.4",
    // libraryDependencies += "org.log4s" % "log4s_3" % "1.10.0",
    // libraryDependencies += "org.clapper" % "grizzled-slf4j_3"
  )

