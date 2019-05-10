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
		System.out.print("INFORMATION: ");
		System.out.println(date+": "+Messege);
	}
	public void LogInformation(String Messege) 
	{
		System.out.print("INFORMATION: ");
		System.out.println(Messege);
	}

	public void LogErrors(String Messege, Date date) 
	{
		System.out.print("ERROR: ");
		System.out.println(date+": "+ Messege );
		
	}
	public void LogErrors(String Messege) 
	{
		System.out.print("ERROR: ");
		System.out.println(Messege);
		
	}

	public void LogWarnings(String Messege, Date date)
	{
		// TODO Auto-generated method stub
		
	}
public void exit()
{
	
}
	
}
