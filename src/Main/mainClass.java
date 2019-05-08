package Main;
import java.io.*;
import java.util.*;

import Main.Composite.CompositeLogger;
import Main.ConsoleLogger.ConsoleLog;
import Main.FileLogger.*;

public class mainClass {

	public static void main(String[] args) {
	Date d2 = new Date();
		
	    d2 =Calendar.getInstance().getTime();
	    //System.out.println(Calendar.getInstance().toInstant());
	    //System.out.println(Calendar.getInstance().getTime());
	
	
	CompositeLogger cc = new CompositeLogger();
	cc.Register(new ConsoleLog());
	cc.Register(new FileLog("D:\\log.txt"));
	//cc.Register(new FileLog("D:\\log2.txt"));
	cc.LogInformation("this is a log messege");
	cc.LogInformation("this is a log messege",d2);
	for(int i=0;i<=10;i++)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cc.LogInformation("hello "+ i+ Calendar.getInstance().getTime());
	}
	
	}
}