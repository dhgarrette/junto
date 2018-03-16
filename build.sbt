// import AssemblyKeys._

// import com.typesafe.sbt.SbtStartScript

name := "junto"

version := "1.6.2-SNAPSHOT"

organization := "org.scalanlp"

scalaVersion := "2.12.4"

//crossPaths := false

libraryDependencies ++= Seq(
  "org.jgrapht" % "jgrapht-jdk1.5" % "0.7.3",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.5.11",
  "org.rogach" %% "scallop" % "3.1.2",
  "net.sf.trove4j" % "trove4j" % "3.0.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.8.0",
  "ch.qos.logback" % "logback-classic" % "1.2.3")

// seq(assemblySettings: _*)

// jarName in assembly := "junto-assembly.jar"

// seq(SbtStartScript.startScriptForClassesSettings: _*)

// publishTo <<= version { v: String =>
//   val nexus = "https://oss.sonatype.org/"
//   if (v.trim.endsWith("SNAPSHOT"))
//     Some("snapshots" at nexus + "content/repositories/snapshots")
//   else
//     Some("releases" at nexus + "service/local/staging/deploy/maven2")
// }

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>http://scalanlp.org/</url>
  <licenses>
    <license>
      <name>Apache License 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:scalanlp/junto.git</url>
    <connection>scm:git:git@github.com:scalanlp/junto.git</connection>
  </scm>
  <developers>
    <developer>
      <id>parthatalukdar</id>
      <name>Partha Talukdar</name>
      <url>http://talukdar.net</url>
    </developer>
    <developer>
      <id>jasonbaldridge</id>
      <name>Jason Baldridge</name>
      <url>http://www.jasonbaldridge.com</url>
    </developer>
  </developers>
)
