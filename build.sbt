name := "hbase-test"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.hbase" % "hbase-common" % "1.2.2" % Test classifier "tests",
  "org.apache.hbase" % "hbase-common" % "1.2.2" % Test,
  "org.apache.hbase" % "hbase-server" % "1.2.2" % Test classifier "tests",
  "org.apache.hbase" % "hbase-server" % "1.2.2" % Test,
  "org.apache.hbase" % "hbase-hadoop-compat" % "1.2.2" % Test classifier "tests",
  "org.apache.hbase" % "hbase-hadoop-compat" % "1.2.2" % Test,
  "org.apache.hbase" % "hbase-hadoop2-compat" % "1.2.2" % Test classifier "tests",
  "org.apache.hbase" % "hbase-hadoop2-compat" % "1.2.2" % Test,
  "org.apache.hadoop" % "hadoop-hdfs" % "2.7.3" % Test classifier "tests",
  "org.apache.hadoop" % "hadoop-hdfs" % "2.7.3" % Test,
  "org.apache.hadoop" % "hadoop-common" % "2.7.3" % Test,
  "org.apache.hadoop" % "hadoop-common" % "2.7.3" % Test classifier "tests",
  "org.apache.hadoop" % "hadoop-mapreduce-client-jobclient" % "2.7.3" % Test classifier "tests",
  "org.scalactic" %% "scalactic" % "3.0.0",
  "org.scalatest" %% "scalatest" % "3.0.0" % Test
)
