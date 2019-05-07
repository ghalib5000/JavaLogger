package Main.Composite;
import Main.Base.*;
public class CompositeLogger extends BaseLogger
{
	//BaseLogger log;
	static int i=0;
	public CompositeLogger(int n)
	{
	super(n);
	}
	
public void Register(BaseLogger log)
{
//this.log=log;
	lister(log);
}

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
	public void LogInformation(String Messege)
	{
		lister(Messege);
		//log.LogInformation(Messege);
	}
}
