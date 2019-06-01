import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo extends object{
	
	public static void main(String[] args) throws IOException {
		
		try {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(object.search_txt_xpath)).sendKeys("rohith");
		}
		catch(Exception e) {
			StringWriter sw=new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
		    String s=sw.toString();
		    
		    String[] a = s.split("\n");//spliting the exceptions lines

			String[] ar = a[0].split(":");//spliting the values in 1st line of exception

			String[] aj = ar[5].split("}");//again spliting } symbol
			
			 FileInputStream fstream = new FileInputStream("D:\\Appium\\MobileWorkspace\\Mobile\\src\\object.java");
			 DataInputStream in = new DataInputStream(fstream);
			 BufferedReader br = new BufferedReader(new InputStreamReader(in));
			    String strLine;
			    while((strLine = br.readLine())!= null ){
			    	if (strLine.trim().length() != 0) {
			    		if(strLine.contains(aj[0])){
			    			String[] al = strLine.split(" ");
			    			System.out.println(al[3]);
			    		}
			    		
			    	}
			    }
		}
		
	}

}
