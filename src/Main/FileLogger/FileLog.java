package Main.FileLogger;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
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
		/*
		 * 	try {			
				f = new FileWriter(fil,true);
			}
			catch (IOException e)
			{
				System.out.println(e);
			}	
			*/	
	}
	public FileLog(String location,int logLevel)
	{
		super("this is file logger");
		fil = new File(location);
		this.logLevel = logLevel;
		Date d = new Date();
	    d =Calendar.getInstance().getTime();
	/*
	 * 	try {			
	
			f = new FileWriter(fil,true);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}	
		*/	
	}
	public void LogInformation(String Messege,Date date) 
	{
		synchronized (fil)
		{
		   try {
		   fil.setWritable(true);
		   f = new FileWriter(fil,true);
		   f.write("INFORMATION: ");
		   f.write(date+": "+Messege+"\n");
		   //fil.setReadOnly();
		  //f.close();	
		   } 
		   catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		}
	}
	public void LogInformation(String Messege) 
	{
		synchronized (fil)
		 {
		  try 
		  {
		  // fil.setWritable(true);
		   f = new FileWriter(fil,true);
		   f.write("INFORMATION: ");
		   f.write(Messege+"\n");
		  // fil.setReadOnly();
		   f.close();	
		}
			 catch (IOException e)
			 {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 }
	}
	}
	public void LogErrors(String Messege, Date date)
	{
		synchronized (fil)		 
			{
				//fil.setExecutable(false);
			   try {
				    //fil.setWritable(false);
				   f = new FileWriter(fil,true);
				   f.write("INFORMATION: ");
				   f.write(date+": "+Messege+"\n");
				  // fil.setReadOnly();
				   f.close();	
				}
					 catch (IOException e)
					 {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
	}
		
	public void LogErrors(String Messege)
	{
		synchronized (fil)
		 {
			
				
			   try {
			   //fil.setWritable(true);
			   f = new FileWriter(fil,true);
			   f.write("ERROR: ");
			   f.write(Messege+"\n");
			   
			   //fil.setReadOnly();
			   f.close();	
			   } 
			   catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			   }
		}
			
		}

	public void LogWarnings(String Messege, Date date) 
	{
		// TODO Auto-generated method stub
		
	}
	public void exit()
	{
		try {
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	

