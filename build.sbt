import NativePackagerKeys._
import com.typesafe.sbt.SbtNativePackager._

name := """play2-deploy-72"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.4"

maintainer := "ginduc"

dockerExposedPorts in Docker := Seq(9000)

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  "org.webjars" % "jquery" % "2.1.1",
  "org.webjars" % "bootstrap" % "3.3.1"
)     

lazy val root = (project in file(".")).enablePlugins(PlayScala)