package bohocode

import org.apache.hadoop.hbase.client.{Get, Put}
import org.apache.hadoop.hbase.util.Bytes
import org.apache.hadoop.hbase.{HBaseTestingUtility, MiniHBaseCluster}
import org.scalatest.{BeforeAndAfter, FlatSpec, Matchers}

/**
  * Created by szymek on 10/19/16.
  */
class HBaseMiniClusterSpecs extends FlatSpec with Matchers with BeforeAndAfter {

  val	utility = new HBaseTestingUtility()
  val CF = Bytes.toBytes("CF")
  val CQ1 = Bytes.toBytes("CQ-1")
  val CQ2 = Bytes.toBytes("CQ-2")
  val ROW_STR = "ROWKEY-1"
  val ROW = Bytes.toBytes(ROW_STR)
  var cluster: MiniHBaseCluster = _

  before {
    cluster = utility.startMiniCluster()
  }

  after {
    cluster.shutdown()
  }

  "HBase Mini Cluster" should "do puts and gets" in {
    val table = utility.createTable(Bytes.toBytes("MyTest"), CF)
    val put = new Put(ROW)
    put.addColumn(CF, CQ1, Bytes.toBytes("DATA-1"))
    put.addColumn(CF, CQ2, Bytes.toBytes("DATA-2"))

    table.put(put)
    val get1 = new Get(ROW)
    get1.addColumn(CF, CQ1)
    val result1 = table.get(get1)

    Bytes.toString(result1.getRow) shouldBe ROW_STR
    Bytes.toString(result1.value()) shouldBe "DATA-1"

    val get2 = new Get(ROW)
    get2.addColumn(CF, CQ2)
    val result2 = table.get(get2)
    Bytes.toString(result2.getRow) shouldBe ROW_STR
    Bytes.toString(result2.value()) shouldBe "DATA-2"
  }
}
