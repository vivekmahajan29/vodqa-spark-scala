package tw.vodqa.spark.df

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

object SampleDF {

  case class ThoughtWorker(name: String)

  def main(args:Array[String]) = {

    // Code Snippets:

    // Code Snippet to start spark app in a local mode.
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("SparkRDDApp")
    val sparkContext = new SparkContext(sparkConf)


    //  Code Snippet to create a DataFrame
    val sqlContext = new SQLContext(sparkContext)
    val people = Seq(ThoughtWorker("Vivek"), ThoughtWorker("Dhruv"))
    val peopleDF = sqlContext.createDataFrame(people)

    // Code Snippet to print DataFrame
    peopleDF.show()

  }

  def someFunc =
  {
    println("some function.")
  }




}
