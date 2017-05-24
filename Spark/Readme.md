------------Spark----------

Configure and install Spark into the C3.large instance followed by starting the spark shell with the scala code.
The file sparkterasort.scala consists of sorting the dataset using spark framework. Here the input is taken from HDFS.Then this input data is mapped which splits the data into chunks and sorted based on the key value.The reducer combines the theses chunks into one sorted output 


Execution;
$ spark-shell -i sparksort.scala
 
