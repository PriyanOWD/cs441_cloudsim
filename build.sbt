name := "psures5_CS441_HW1"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.28",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "ch.qos.logback" % "logback-core" % "1.2.3",
  "com.typesafe" % "config" % "1.3.4",
  "org.apache.commons" % "commons-math3" % "3.6.1",
  "org.scalactic" %% "scalactic" % "3.0.8",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)

unmanagedBase := file("../cloud2sim/lib")