



public class FileOrg implements Comparable<FileOrg> {

	  String id;
	  String key;
	  String data;
	  
	  
	  public FileOrg (String key,String id,String data)
	  {
	    this.id = id;
	    this.key = key;
	    this.data = data;
	    
	  } // constructor
	  
	  public int compareTo (FileOrg FileOrg1)
	  {
	    //final double DELTA = 0.0000001;
	    
			
		    if (key.compareTo (FileOrg1.key) < 0)
		        return -1;
		    if (key.compareTo (FileOrg1.key) > 0)
		        return 1;
		    if (key.compareTo (FileOrg1.key) == 0)
		    return 0;


		       		    else return (Integer) null;
		            
		        		    
		   
	  }
	   
public String toString(){
	return this.key+"  "+this.id+"  "+this.data;
}
}




