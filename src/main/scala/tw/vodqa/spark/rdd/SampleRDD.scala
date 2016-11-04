package tw.vodqa.spark.rdd

import org.apache.spark.{SparkConf, SparkContext}


object SampleRDD {

  def main(args:Array[String]) = {

    // Code Snippets:

    // Code Snippet to start spark app in a local mode.
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("SparkRDDApp")
    val sparkContext = new SparkContext(sparkConf)

    // Code Snippet to create RDD
    val someList: List[String] = List("Vivek", "Dhruv", "Ishaan", "Manjyot")
    val lines = sparkContext.parallelize(someList)

    // Code Snippet to print RDD
    lines.collect().foreach(println)

    // Code Snippet to print RDD
    lines.take(2).foreach(println)
  }

  def someFunc =
  {
    println("some function.")
  }

}
