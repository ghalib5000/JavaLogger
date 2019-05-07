package Main.FileLogger;

import java.util.*;

public interface IFileLog {


	void LogInformation(String Messege,Date date);
	void LogErrors(String Messege,Date date);
	void LogWarnings(String Messege,Date date);
	
	
	
}
