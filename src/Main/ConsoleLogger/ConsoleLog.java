package Main.ConsoleLogger;

import java.util.Date;

import Main.Base.BaseLogger;

public class ConsoleLog extends BaseLogger implements IConsoleLog
{
	public ConsoleLog()
	{
		super("this is console logger");	
	}

	public void LogInformation(String Messege, Date date) 
	{
		// TODO Auto-generated method stub
		
	}
	public void LogInformation(String Messege) 
	{
		System.out.println(Messege);
		System.out.println("hello");
	}

	public void LogErrors(String Messege, Date date) 
	{
		// TODO Auto-generated method stub
		
	}

	public void LogWarnings(String Messege, Date date)
	{
		// TODO Auto-generated method stub
		
	}

	
}
