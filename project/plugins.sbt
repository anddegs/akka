resolvers += Classpaths.typesafeResolver

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

// these comment markers are for including code into the docs
//#sbt-multi-jvm
addSbtPlugin("com.typesafe.sbt" % "sbt-multi-jvm" % "0.3.8")
//#sbt-multi-jvm

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "0.7.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.6.0")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.6")

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-s3" % "0.5")

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.3.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.2")

addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.1.6")

// stats reporting
libraryDependencies += "com.timgroup" % "java-statsd-client" % "2.0.0"

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.0-RC1")

// for advanced PR validation features
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

libraryDependencies += "org.kohsuke" % "github-api" % "1.68"
