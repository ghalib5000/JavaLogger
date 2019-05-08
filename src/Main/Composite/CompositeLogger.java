package Main.Composite;
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
/*
public void lister(BaseLogger log)
{
	while(i<=list.length)
	{
		if(list[i]==null)
		{
			list[i] = log;
			return;
		}
		else
		{
			i++;
		}
	}
}
public void lister(String Messege)
{
	for(int i=0;i<list.length;i++)
	{
		if(list[i]!=null)
		{
			list[i].LogInformation(Messege);
		}
	}
}
*/
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
}
