
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.*;

public class Mapping extends Mapper<Object, Text, Text, Text> {

	private Text in = new Text();

	public void map(Object key, Text value, Context context)
			throws IOException, InterruptedException {
			context.write(value, in);
	}
}
