import java.io.*;

class Javaline
{
   public static void main(String args[]){
      try{
    // Open the file that is the first
    // command line parameter
    //the text file is in the project
    FileInputStream fstream = new FileInputStream("D:\\Appium\\MobileWorkspace\\Mobile\\src\\Launching.java");
    // Get the object of DataInputStream
    DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String strLine;
    int count = 0;
    int count2 = 0;
    //Read File Line By Line
    while((strLine = br.readLine())!= null ){
    	if (strLine.trim().length() != 0){
            
    		if(strLine.contains("//div[@id='rohith']")) {
    			String[] var = strLine.split(" ");
    			System.out.println(var[4]);
    			
    		}
    	}
    	
    }
   
    in.close();
    }catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
    }
}
}