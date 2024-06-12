import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
public class FileLogger implements ILogger{
	/*Εξηγηση για απλο throws: Τι εγινε; Φτιαξαμε έναν FileLogger, 
	φτιαξαμε έναν Calculator και του στειλαμε και τον filelogger 
	για να Loggaρει. Όλα καλα. Πηγαμε να κανουμε προσθεση.Εγινε,  
	πηγε ο Calculator να loggaρει.Μπηκαμε στον FileLogger. Ο 
	οποιος πηγε να ανοιξει ένα αρχειο σε ένα path που δεν υπαρχει. 
	Ο οποιος δεν κανει κατι για το exception και τον Κανει throw πισω 
	στον Calculator.*/
	public void log(String msg) throws Exception
	{
		try {
			//int a = 5;
			//int b = 0;
			//int i = a/b;
			FileWriter myFileWriter = 
					new FileWriter("Z:\\8ο semester-and-previous\\"
							+ "\\eclipse-workspace\\Calculator\\src\\logFile.txt",
							StandardCharsets.UTF_8,true);
			myFileWriter.append(msg+'\n');
			myFileWriter.close();
		} catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {

			System.out.println(e.getMessage());
			throw e;
		}

	}
}
