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
		/*Επειδη ο κώδικας γίνεται περίπλοκος, η java από την εκδοση 8 και επειτα 
		εχει ενεργοποιήσει ένα σχημα που λεγεται try with resources.Δλδ μπορω να 
		δηλώσω το αρχείο μου μέσα σε παρένθεση. Οπότε, σε 1 τέτοια περίπτωση δεν 
		χρειάζομαι finally για το κλείσιμο, μπορει να χρειαστώ το finally για άλλα 
		πράγματα αλλά όχι για το κλείσιμο.To resource=myFileWriter εχει ανοίξει 
		μέσα στην παρένθεση του try, θα το κλείσει(close()) η java ότι και να γινει, 
		ακομη και αν συμβει exception νωριτερα.*/
		try(FileWriter myFileWriter = new FileWriter("Z:\\8ο semester-and-previous\\"
							+ "\\eclipse-workspace\\Calculator\\src\\logFile.txt",
							StandardCharsets.UTF_8,true))
		{	
			myFileWriter.append(msg+'\n');
		} 
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {

			System.out.println(e.getMessage());
			throw e;
		}
	}
}
