package hello;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/webtables");
       // driver.findElement(By.name("q")).sendKeys("test");
       // driver.findElement(By.name("q")).submit();
        
        //No of columns
        
        List<WebElement> f_name = driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-td'][1]"));
        List<WebElement> l_name = driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-td'][2]"));
        List<WebElement> agelisted = driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-td'][3]"));
        List<WebElement> email = driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-td'][4]"));
        List<WebElement> sal = driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-td'][5]"));
        List<WebElement> dept = driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-td'][6]"));
        List<WebElement> edit = driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-td'][7]//span[@title='Edit']"));
        List<WebElement> delete = driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-td'][7]//span[@title='Delete']"));
        List<Integer> Minsalary = new ArrayList<Integer>();
        
        for (int i=0; i<edit.size();i++)
        {
         int allsalary = Integer.parseInt(sal.get(i).getText());

         Minsalary.add(allsalary);        
        }
        System.out.println("Before sorting"+'\n'+Minsalary+'\n');  
        Collections.sort(Minsalary);
        System.out.println("After sorting"+'\n'+Minsalary+'\n');
         
       for (int sal1: Minsalary) 
       {
     
       }
       
      
       System.out.println("Minimun number on the Webtable is: "+ '\n'+ Minsalary.get(0)+'\n');
       
       for (int i=0; i<edit.size();i++) {
    	   int salrow= Integer.parseInt(sal.get(i).getText());
    	   
        	   if (salrow==Minsalary.get(0)) 
        	   {
        		   String firstname = f_name.get(i).getText();
        		   String lastname = l_name.get(i).getText();
        		   String age = agelisted.get(i).getText();
        		   String mail = email.get(i).getText();
        		   String salary = sal.get(i).getText();
        		   String department = dept.get(i).getText();
        		   
        		   System.out.println("firstname"+ " "+"lastname"+" "+"age" +" "+"mail"+" "+"mail"+" "+"salary"+" "+"department"+'\n'); 
        		   
        		   System.out.println(firstname+ " "+lastname+" "+age +" "+mail+" "+mail+" "+salary+" "+department+'\n');    		   
    	   }
    	   
    	   
       }
       
       

       for (int i=0;i<edit.size();i++)
       {
    	   String firstname1 = f_name.get(i).getText();
    	  // String firstname2 = "Cierra";
    	  
    	   if (firstname1.equals("Cierra"))
    	   {
    		   String firstname3 = f_name.get(i).getText();
    		   String lastname = l_name.get(i).getText();
    		   String age = agelisted.get(i).getText();
    		   String mail = email.get(i).getText();
    		   String salary = sal.get(i).getText();
    		   String department = dept.get(i).getText();
    		   
    		   System.out.println("firstname"+ " "+"lastname"+" "+"age" +" "+"mail"+" "+"mail"+" "+"salary"+" "+"department"+'\n'); 
    		   
    		   System.out.println(firstname1+ " "+lastname+" "+age +" "+mail+" "+mail+" "+salary+" "+department);
    		   
    	   }
    	   
    	   
       }
       
       
         driver.quit();
        
        }
	
        
        
}

	


