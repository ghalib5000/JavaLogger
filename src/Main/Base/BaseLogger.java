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
	
	@Override
	public void LogInformation(String Messege, Date date) 
	{
	System.out.println("lol");			
	}
	
	public void LogInformation(String Messege)
	{
		
		
	}

	@Override
	public void LogErrors(String Messege, Date date)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LogWarnings(String Messege, Date date) 
	{
		// TODO Auto-generated method stub
		
		
	}

}
