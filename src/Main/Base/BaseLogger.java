package Main.Base;

import java.io.*;
import java.util.Date;

public abstract class BaseLogger extends BaseAbs implements IBaseLogger 
{

	protected BaseLogger[] list;
	//public BaseLogger(LogOptions options){}
	//experimental thing
	public BaseLogger(int opt)
	{
		list = new BaseLogger[opt];
	}
	
	public BaseLogger(String text)
	{
	System.out.println(text);
	}
	public BaseLogger()
	{
		
	}
	public void LogInformation(String Messege, Date date) 
	{		
	}
	public void LogInformation(String Messege)
	{
	}
	public void LogErrors(String Messege, Date date)
	{
		// TODO Auto-generated method stub
		
	}public void LogErrors(String Messege)
	{
		// TODO Auto-generated method stub
	}

	public void LogWarnings(String Messege, Date date) 
	{
		// TODO Auto-generated method stub
	}
public void exit()
{
	
}
}
