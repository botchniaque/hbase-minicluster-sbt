HBase Integration test using `MiniHBaseCluster` with scala and sbt

[HBase tutorial][hbase-tutorial] shows how to write integration tests using maven, but sbt does not seem to support transitive dependencies of type `test-jar`. 
Therefore a working sbt setup is much more complex.  
This is an example project showing how to do it. 

run the test with:
```shell
sbt test
```

[hbase-tutorial]: https://github.com/apache/hbase/blob/master/src/main/asciidoc/_chapters/unit_testing.adoc#4-integration-testing-with-an-hbase-mini-cluster