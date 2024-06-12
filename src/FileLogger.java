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
		FileWriter myFileWriter = null;//πρεπει να ειναι initialize
		try {
			//int a = 5;
			//int b = 0;
			//int i = a/b;
			myFileWriter = new FileWriter("Z:\\8ο semester-and-previous\\"
							+ "\\eclipse-workspace\\Calculator\\src\\logFile.txt",
							StandardCharsets.UTF_8,true);
			//myFileWriter.append(msg+'\n');
			myFileWriter.close();
			/*Εδώ υπαρχει ένα προβλημα με τον κωδικα μας, ότι το αρχείο μου μπορει 
			να ανοίξει.Δλδ το αρχείο μου να μην είναι στο path και να είναι (στο msg+'\n')
			και τότε δε θα κλείσει. Οποτε, πρεπει να πάω να βάλω finally , αναγκαστικά το 
			fileWriter θα το βγαλω εξω από το try για να φαίνεται και στο finally .*/
		} catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {

			System.out.println(e.getMessage());
			throw e;
		}
		finally {
			if(myFileWriter != null) {
				myFileWriter.close();
				/*οπότε, οτι και να γίνει, δλδ και exception να δημιουργηθεί το αρχείο θα κλείσει.
				Παντα εδω θα κλείνει και οχι μέσα στο try-catch. Οποτε, τρεχοντας το σε debug mode 
				και βλεποντας γραμμη προς γραμμη, πριν κανει το throw, μπαινει στο finally είναι 
				null το myFileWriter γιατι δεν ανοιξε το path και επειτα ενεργοποιείται το throw 
				και πάμε μέσα στην main.*/
				/*Ακόμη και αν κάναμε throw το exception, πιο πριν η finally εκτελειται παντα. 
				Και είναι για τετοια πραγματα, για house keeping(τακτοποίηση εκρεμμοτήτων, να 
				κλεινουμε αρχεία κλπ, είτε τερματιστεί το προγραμμα, ειτε φυγει το exception από 
				πανω και γινει άλλο. */
			}
		}
	}
}
