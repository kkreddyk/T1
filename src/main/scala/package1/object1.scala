package package1

import org.apache.spark.sql.SparkSession

object object1 {
  
  
  def main(args: Array[String])
  {
    println("----")
    
    var spark=SparkSession.builder.master("local[1]").getOrCreate()
    
    spark.sql("show databases").show()
    
  }
}