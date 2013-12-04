name := "walkAmongUs"

version := "1.0"

resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases",
  "repo.codahale.com" at "http://repo.codahale.com"
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.14" % "test",
  "com.codahale" % "jerkson_2.9.1" % "0.5.0"
)
