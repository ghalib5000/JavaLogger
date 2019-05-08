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
		System.out.println(Messege+" at "+date);
	}
	public void LogInformation(String Messege) 
	{
		System.out.println(Messege);
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
