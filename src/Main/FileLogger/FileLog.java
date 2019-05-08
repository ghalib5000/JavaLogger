package Main.FileLogger;
import java.io.*;
import java.util.*;

import Main.Base.BaseLogger;
public class FileLog extends BaseLogger implements IFileLog
{
	/*
	 * console can have all logs while the file can only have error logs
	 */
	
	File fil;
	private int logLevel;
	FileWriter f;
	public FileLog(String location)
	{
		super("this is file logger");
		fil = new File(location);
		logLevel = 0;		
		Date d = new Date();
	    d =Calendar.getInstance().getTime();
		try {			
			f = new FileWriter(fil,true);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}		
	}
	public FileLog(String location,int logLevel)
	{
		super("this is file logger");
		fil = new File(location);
		this.logLevel = logLevel;
		Date d = new Date();
	    d =Calendar.getInstance().getTime();
		try {			
			f = new FileWriter(fil);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}		
	}
	public void LogInformation(String Messege, Date date) 
	{
	   try {
			f.write(Messege+" logged at "+date);
			f.close();
	} catch (IOException e)
	   {
		System.out.println(e);
	}
	}
	public void LogInformation(String Messege)
	{
		
	   try {
		   
		   for(int i=0;i<Messege.length();i++)
		   {
			   f.append(Messege.charAt(i));
		   }
		
			//f.write(Messege);
			f.close();
		
			
	} catch (IOException e)
	   {
		System.out.println(e);
	}
	}
	public void LogErrors(String Messege, Date date)
{
		// TODO Auto-generated method stub
		
	}

	public void LogWarnings(String Messege, Date date) 
	{
		// TODO Auto-generated method stub
		
	}

	
	protected void finalize( ) throws Throwable
	{
		System.out.println("finalize");
			f.close();
	}
	}
	

