import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "menudemo"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "com.google.inject" % "guice" % "3.0",
    "com.google.inject.extensions" % "guice-multibindings" % "3.0",
    "de.htwg" % "util" % "1.0-SNAPSHOT",
    "de.htwg.seapal" % "boatdemo" % "1.3-SNAPSHOT" ,
    "de.htwg.seapal" % "persondemo" % "1.1-SNAPSHOT" 
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here  
      
    organization := "de.htwg.seapal", // group id...
    crossPaths := false, // disable using the Scala version in output paths and artifacts
   
    resolvers += "HTWG Resolvers" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local",

    publishTo := Some("HTWG PublishTo" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local;build.timestamp=" + new java.util.Date().getTime),
    
    // setup entry points for sonar code analyzer
  	pomExtra :=
	  <build>
	    <sourceDirectory>app</sourceDirectory>
	    <testSourceDirectory>test</testSourceDirectory>
	    <resources>
	      <resource>
	        <directory>app</directory>
	      </resource>
	    </resources>
	  </build>
    
  )

}
