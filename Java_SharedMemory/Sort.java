import java.io.*;
import java.util.Formatter;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;


public class Sort
{

    public static String file;
    public static ArrayList<String> list_of_elements=null;
    public static Formatter fr;
    
    public static Thread []t=new Thread[8];
    static FileOrg[] dataset;
    static byte[] pas;
	private static class MessageLoop extends  Thread   {
		/* --------------------------- Thread  function for floating point addition  ----------------*/
		public void run() {
			Order.sort(dataset);
					}

	}
    public static void main(String[] args) throws InterruptedException 
    {


        try 
        {	
        	System.out.println("Enter the file name and path ");
        	Scanner sc=new Scanner(System.in);
        	file= sc.next();
           System.out.println(file);
           File f = new File(file);
           FileInputStream f1= new FileInputStream(f);
           // buf_read= new BufferedReader(new FileReader(file));
            list_of_elements = new ArrayList<String>();
    		LineNumberReader lnr = new LineNumberReader(new FileReader(new File(
    				file)));
    		lnr.skip(Long.MAX_VALUE);
        	 dataset = new FileOrg[lnr.getLineNumber() + 1];
        	int  file_size=(int) f.length();
         // Reading for Merge Sort
    		String readLine;
    		String[] readLineSplited;
    		int k=0;
    		Scanner scan2 = new Scanner(f1);
    		//String s =scan2.next();
    		while (scan2.hasNextLine()) {
    			//System.out.println("dfsf"+scan2.nextLine());
    			readLine = scan2.nextLine();
    			readLineSplited = readLine.split("  ");
    			FileOrg student5 = new FileOrg(readLineSplited[0],readLineSplited[1], readLineSplited[2]);
    			dataset[k++] = student5;    			
    		}

    		Scanner sc4=new Scanner(System.in);
    		System.out.println("Enter the number of threads\n");
    		System.out.println("1 ---------------  1 Thread");
    		System.out.println("2 ---------------  2 Threads");
    		System.out.println("3 ---------------  4 Threads");
    		System.out.println("4 ---------------  8 Threads");
    		int m=sc4.nextInt();
    		if(m==1){
    			/*------------ For a single Thread-----------*/

    				System.out
    						.println("-------------------- 1 Thread --------------------");
    				
    				/* Thread initialisation  and starting the thread */
    				Thread t = new Thread(new MessageLoop());
    				long startTime2 = System.nanoTime();
    				t.start();
    				/*To terminate the thread  */
    				t.join();
    	    		
    	    		long elapsedTime2 = System.nanoTime() - startTime2;
    	    		double seconds2 = (double) elapsedTime2 / 1000000000.0;
    	    		System.out.println("Sort of data file takes " + (seconds2) + " seconds");
    	    		System.out.println("Throughput " + (10240/seconds2) + " MB/sec");
    	    		// System.out.println(""+stude);
    	    		scan2.close();

    		}
    		else if (m==2) {
    			/*----------- For a two threads Thread-------------*/

    				System.out
    						.println("-------------------- 2 Threads --------------------");
    				
    				/* Thread initialisation  and starting the thread */
    				Thread t1 = new Thread(new MessageLoop());
    				Thread t2 = new Thread(new MessageLoop());
    				//int PART_SIZE= (file_size/m);
    				//while(file_size>0)
    					//  pas = new byte[PART_SIZE];
    				//int r=f1.read(pas, 0, PART_SIZE);
    				long startTime2 = System.nanoTime();
    				t1.start();		
    				t2.start();
    				/*To terminate the thread  */
    				t1.join();
    				t2.join();
    	    		// System.out.println(Arrays.toString(student2));
    	    		//System.out.println("Merge"+Merge.list_of_elements);
    	    		
    	    		long elapsedTime2 = System.nanoTime() - startTime2;
    	    		double seconds2 = (double) elapsedTime2 / 1000000000.0;
    	    		System.out.println("Sort of data file takes " + (seconds2) + " seconds");
    	    		System.out.println("Throughput " + (10240/seconds2) + " MB/sec");
    	    		scan2.close();

    			}
    		else if (m==3) {
    			
    			/*----------- For a four threads Thread-------------*/
    				System.out
    						.println("-------------------- 4 Threads --------------------");

    				/* Thread initialisation  and starting the thread */
    				Thread a1 = new Thread(new MessageLoop());
    				Thread a2 = new Thread(new MessageLoop());
    				Thread a3 = new Thread(new MessageLoop());
    				Thread a4 = new Thread(new MessageLoop());
    				long startTime2 = System.nanoTime();
    				a1.start();
    				a2.start();
    				a3.start();
    				a4.start();
    				/*To terminate the thread  */
    				a1.join();
    				a2.join();
    				a3.join();
    				a4.join();
    	    		// System.out.println(Arrays.toString(student2));
    	    		//System.out.println("Merge"+Merge.list_of_elements);
    	    		
    	    		long elapsedTime2 = System.nanoTime() - startTime2;
    	    		double seconds2 = (double) elapsedTime2 / 1000000000.0;
    	    		System.out.println("Sort of data file takes " + (seconds2) + " seconds");
    	    		System.out.println("Throughput " + (10240/seconds2) + " MB/sec");
    	    		// System.out.println(""+stude);
    	    		scan2.close();

    		}
else if (m==4) {
    			
    			/*----------- For a four threads Thread-------------*/
    				System.out
    						.println("-------------------- 4 Threads --------------------");

    				/* Thread initialisation  and starting the thread */
    				Thread a1 = new Thread(new MessageLoop());
    				Thread a2 = new Thread(new MessageLoop());
    				Thread a3 = new Thread(new MessageLoop());
    				Thread a4 = new Thread(new MessageLoop());
    				Thread a5 = new Thread(new MessageLoop());
    				Thread a6 = new Thread(new MessageLoop());
    				Thread a7 = new Thread(new MessageLoop());
    				Thread a8 = new Thread(new MessageLoop());
    				long startTime2 = System.nanoTime();
    				a1.start();
    				a2.start();
    				a3.start();
    				a4.start();
    				a5.start();
    				a6.start();
    				a7.start();
    				a8.start();
    				/*To terminate the thread  */
    				a1.join();
    				a2.join();
    				a3.join();
    				a4.join();
       				a5.join();
    				a6.join();
    				a7.join();
    				a8.join();
    	    		
    	    		
    	    		long elapsedTime2 = System.nanoTime() - startTime2;
    	    		double seconds2 = (double) elapsedTime2 / 1000000000.0;
    	    		System.out.println("Sort of data file takes " + (seconds2) + " seconds");
    	    		System.out.println("Throughput " + (10240/seconds2) + " MB/sec");
    	    		// System.out.println(""+stude);
    	    		scan2.close();

    		}
    		else{
    		 System.out.println("Enter proper input");
    		}

                    
                 
                
                try
            	{
        			fr = new Formatter("sort10GB-sharedmemory.txt");
        		}
        		catch(Exception e)	
            	{
        			System.err.println(e);    			
        		}
                
                fr.format("%s",Order.list_of_elements);
                
                fr.close(); 
             
         }	
        catch (FileNotFoundException e) 
        {
            System.err.println(e);
        } 
        catch (IOException e1) 
        {
        	System.err.println(e1);
        }  
    }

       	
}