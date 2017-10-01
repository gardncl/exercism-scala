scalaVersion := "2.12.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

lazy val helloWorld = project in file("hello-world")
lazy val sumOfMultiples = project in file("sum-of-multiples")
lazy val leap = project in file("leap")
lazy val bob = project in file("bob")
lazy val spaceAge = project in file("space-age")
lazy val gradeSchool = project in file("grade-school")