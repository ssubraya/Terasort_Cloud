------------Hadoop -----------

Single Node:
After configuring hadoop generate the data using gensort. Once that is done place the data in the HDFS. Next complie the code. Make a jar file using the complied .classe files .Then , run your code which fetches that data and provides the o/p result.

For 16 nodes configure the the required files mentioned in the document and perform similar execution steps with the exception that 100gb file is used as the input. 

Execution:
$ ./ gensort -a 107000000 inp10gb
$ start-all.sh
$ hdfs dfs -mkdir /user
$ hdfs dfs -put '<i/p file path>' /user
$ javac -cp <jar file paths> Mapping.java  (similar for other classes)
$ jar -cvf org_ss.jar Mapping.class Reducing.class HadoopTeraSort.class
$ hadoop jar <jar file org_ss.jar path > HadoopTeraSort /user/inp10gb /user/op10gb 

Eg:
$ ./ gensort -a 107000000 inp10gb
$ start-all.sh
$ hdfs dfs -mkdir /user
$ hdfs dfs -put '/usr/local/hadoop/bin/inp10gb' /user
$ javac -cp /usr/local/hadoop/share/hadoop/common/*:/usr/local/hadoop/share/hadoop/mapreduce/* Mapping.java  
$ javac -cp /usr/local/hadoop/share/hadoop/common/*:/usr/local/hadoop/share/hadoop/mapreduce/* Reducing.java
$ jar -cvf org_ss.jar Mapping.class Reducing.class
$ javac -cp /usr/local/hadoop/share/hadoop/common/*:/usr/local/hadoop/share/hadoop/mapreduce/*:/usr/local/hadoop/org_ss.jar HadoopTeraSort.java
$ jar -cvf org_ss.jar Mapping.class Reducing.class HadoopTeraSort.class
$ hadoop jar <jar file org_ss.jar path > HadoopTeraSort /user/inp10gb /user/op10gb
 
