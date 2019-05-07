package Main;
import java.io.Console;
import java.util.*;

import Main.Composite.CompositeLogger;
import Main.ConsoleLogger.ConsoleLog;
import Main.FileLogger.*;

public class mainClass {

	public static void main(String[] args) {
	Date d2 = new Date();
		/*
	    d2 =Calendar.getInstance().getTime();
	    System.out.println(Calendar.getInstance().toInstant());
	    
	
	 	IFileLog ff = new  FileLog("D:\\log.txt");
try
{
	ff.LogInformation("this is a log", d2);
		
}
catch(Exception ex)
{ 
	System.out.println(ex);
}*/
		
	
	CompositeLogger cc = new CompositeLogger(2);
	cc.Register(new ConsoleLog());
	cc.Register(new FileLog("D:\\log.txt"));
	cc.LogInformation("this is a log messege");
	
	}
}


