package Main.Composite;
import Main.Base.*;
public class CompositeLogger extends BaseLogger
{
	BaseLogger log;
	public CompositeLogger()
	{
	super();
	}
	
public void Register(BaseLogger log)
{
	this.log=log;
}
	public void LogInformation(String Messege)
	{
		log.LogInformation(Messege);
	}
}
