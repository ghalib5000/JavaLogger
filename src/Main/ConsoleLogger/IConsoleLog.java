package Main.ConsoleLogger;

import java.util.Date;

public interface IConsoleLog
{

	void LogInformation(String Messege,Date date);
	void LogErrors(String Messege,Date date);
	void LogWarnings(String Messege,Date date);
	

}
