package Main;
import java.io.*;
import java.util.*;

import Main.Composite.CompositeLogger;
import Main.ConsoleLogger.ConsoleLog;
import Main.FileLogger.*;

public class mainClass {
	//static 	CompositeLogger cc = new CompositeLogger();
	public static void main(String[] args) {
	Date d2 = new Date();
		
	    d2 =Calendar.getInstance().getTime();
	    //System.out.println(Calendar.getInstance().toInstant());
	    //System.out.println(Calendar.getInstance().getTime());
	
	CompositeLogger cc = new CompositeLogger();
	try {
		int[] aa = new int[2];
	cc.Register(new ConsoleLog());
	cc.Register(new FileLog("D:\\log.txt"));
	//cc.Register(new FileLog("D:\\log2.txt"));
	cc.LogInformation("this is a log message");
	cc.LogInformation("this is a log message",d2);
	System.out.println(aa[5]);
	}
	catch(Exception ex)
	{
		d2 =Calendar.getInstance().getTime();
		cc.LogErrors(ex+" this is an error message ",d2);
	}
	}
}