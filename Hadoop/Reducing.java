
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Reducing extends
		Reducer<Text, Text, Text, Text> {

	public void reduce(Text key,Text val,
			Context context) throws IOException, InterruptedException {
		context.write(key, val);
	}
}
