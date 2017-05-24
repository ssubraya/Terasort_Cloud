import java.lang.*;
import java.io.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class HadoopTeraSort {

	public static void main(String[] args) throws Exception {
		 Configuration c = new Configuration();
		 Job j = Job.getInstance(c, "HadoopTeraSort");
		 j.setJarByClass(HadoopTeraSort.class);
		 j.setMapperClass(Mapping.class);
		 j.setCombinerClass(Reducing.class);
		 j.setReducerClass(Reducing.class);
		 j.setOutputKeyClass(Text.class);
		 j.setOutputValueClass(Text.class);
		 j.setJarByClass(HadoopTeraSort.class);
		 FileInputFormat.addInputPath(j, new Path(args[0]));
		 FileOutputFormat.setOutputPath(j, new Path(args[1]));
		 System.exit(j.waitForCompletion(true) ? 0 : 1);
}
}
