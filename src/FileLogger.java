import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileLogger implements ILogger{
	/*Εξηγηση για απλο throws: Τι εγινε; Φτιαξαμε έναν FileLogger, 
	φτιαξαμε έναν Calculator και του στειλαμε και τον filelogger 
	για να Loggaρει. Όλα καλα. Πηγαμε να κανουμε προσθεση.Εγινε,  
	πηγε ο Calculator να loggaρει.Μπηκαμε στον FileLogger. Ο 
	οποιος πηγε να ανοιξει ένα αρχειο σε ένα path που δεν υπαρχει. 
	Ο οποιος δεν κανει κατι για το exception και τον Κανει throw πισω 
	στον Calculator.*/
	public void log(String msg) throws IOException{
			FileWriter myFileWriter = 
					new FileWriter("Z:/8ο semester-and-previous/previous/"
							+ "eclipse-workspace/Calculator/src/logFile.txt\r\n"
					+ "",StandardCharsets.UTF_8,true);
			myFileWriter.append(msg+'\n');
			myFileWriter.close();
	}
}
