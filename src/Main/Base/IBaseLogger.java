package Main.Base;
import java.util.Date;

public interface IBaseLogger {
	
	
	void LogInformation(String Messege,Date date);
	void LogErrors(String Messege,Date date);
	void LogWarnings(String Messege,Date date);
	
}
