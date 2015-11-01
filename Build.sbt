name := "Akka Remoting"

version := "1.0"

scalaVersion := "2.10.4"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

libraryDependencies ++= Seq(
			"com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT",
			"com.typesafe.akka" %% "akka-cluster" % "2.4-SNAPSHOT",
			"com.typesafe.akka" %% "akka-slf4j" % "2.4-SNAPSHOT"
			)


