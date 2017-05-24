import java.io._
import java.lang._
import java.util._
val rdd=sc.textFile("hdfs://localhost:54310/user/inp10gb")
val sf=rdd.map(s=>(s.substring(0,10),s.substring(11,98)))
val st: Double=System.currentTimeMillis()
val so=sf.sortByKey()
val en: Double=System.currentTimeMillis()
val total: Double= (en-st)/1000
val Thr: Double= 10240/total
System.out.println("Throughput is : "+Thr)
val rd=so.reduceByKey(_+_)
val out=rd.saveAsTextFile("hdfs://localhost:54310/user/op10g")
