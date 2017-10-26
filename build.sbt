import sbt.Keys.libraryDependencies

scalaVersion := "2.12.3"

lazy val commonSetting = Seq(
  organization := "org.psolution.altu",
  version := "0.1.0-SNAPSHOT"
)

resolvers += Resolver.jcenterRepo


lazy val root = project.in(file("."))
.aggregate(core)

lazy val core = project.in(file("core"))
  .settings(
    commonSetting,
    name := "Altu Deploy Core",
    libraryDependencies += "org.jfrog.artifactory.client" % "artifactory-java-client-services" % "2.3.5",
    libraryDependencies += "org.apache.maven.shared" % "maven-jarsigner" % "1.4"
  )