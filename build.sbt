
val CommonSettings = Seq(
  organization := "com.example",
  name := "extension-bug",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "3.1.1",
  libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
)

lazy val projectB = project
  .in(file("projectB"))
  .settings(CommonSettings)
