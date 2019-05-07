package Main.Base;

import java.util.Date;

public class BaseLogger extends BaseAbs implements IBaseLogger 
{

	
	//public BaseLogger(LogOptions options){}
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
