package Main.Composite;
import java.io.IOException;
import java.util.*;

import Main.Base.*;
public class CompositeLogger extends BaseLogger
{
	List listing = new ArrayList();
	BaseLogger temp;
	//BaseLogger log;
	static int i=0;
	public CompositeLogger(int n)
	{
	super(n);
	}
	public CompositeLogger()
	{
		
	}
	
public void Register(BaseLogger log)
{
//this.log=log;
//	lister(log);
	listing.add(log);
}
public void LogInformation(String Messege) 
{
	for(int i=0;i<listing.size();i++)
	{
		temp = (BaseLogger) listing.get(i);
		temp.LogInformation(Messege);
	}
	//lister(Messege);
	//log.LogInformation(Messege);
}

public void LogInformation(String Messege,Date date) 
{
	for(int i=0;i<listing.size();i++)
	{
		temp = (BaseLogger) listing.get(i);
		temp.LogInformation(Messege,date);
	}
	//lister(Messege);
	//log.LogInformation(Messege);
}

public void LogErrors(String Messege,Date date) 
{
	for(int i=0;i<listing.size();i++)
	{
		temp = (BaseLogger) listing.get(i);
		temp.LogErrors(Messege,date);
	}
	//lister(Messege);
	//log.LogInformation(Messege);
}
public void LogErrors(String Messege) 
{
	for(int i=0;i<listing.size();i++)
	{
		temp = (BaseLogger) listing.get(i);
		temp.LogErrors(Messege);
	}
	//lister(Messege);
	//log.LogInformation(Messege);
}


}
