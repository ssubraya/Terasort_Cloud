--------Shared Memory ---------

Push the code into the cloud. and perform the following:
Here 3 classes are used:
Sort.java, Order.java, FileOrg.java.
The Sort.java has the main code which threads the 10gb input file based on the number of threads the user desires.
The FileOrg.java consists of the input dataset pattern which helps in splitting the data into key value pairs.
The Order.java class is activiated once the thread is started which performs the sort anfd merge operations. The dataset is split into chunks based on the number of threads being used which improves the time of completion of the sort   
Open in np++ 


Executable:
$ javac <.java>
$ java <>

Eg: javac Sort.java
java Sort
