import sbt._

object Dependencies {
  lazy val http4sVersion = "0.20.0-M3"
  lazy val http4sServer = "org.http4s" %% "http4s-server" % http4sVersion
  lazy val http4sBlazeServer = "org.http4s" %% "http4s-blaze-server" % http4sVersion
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
}
