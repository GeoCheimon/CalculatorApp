import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileLogger implements ILogger{
	public void log(String msg) {
		try {//θελω να γραψω το log σε file
			FileWriter myFileWriter = new FileWriter
					("Z:\\8ο semester-and-previous\\MAE\\eclipse-workspace"
							+ "\\Calculator\\src\\logFile.txt",StandardCharsets.UTF_8,true);
			myFileWriter.append(msg+'\n');
			myFileWriter.close();
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
