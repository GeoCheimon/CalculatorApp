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
			FileWriter myFileWriter = 
					new FileWriter("Z:/8ο semester-and-previous/previous/"
							+ "eclipse-workspace/Calculator/src/logFile.txt\r\n"
					+ "",StandardCharsets.UTF_8,true);
			myFileWriter.append(msg+'\n');
			myFileWriter.close();
		} catch (Exception e) {
			/*Εστω ότι ο FileLogger αποφασιζει να κάνει κατι για το exception.
			Για να κανει κατι για το exception, πρεπει να τσιμπισει το exception 
			εκει που δημιουργείται. Αυτό γινεται με try-catch. To καλο με το 
			try-catch είναι ότι διαχωριζει τον κωδικα που κανει την δουλεια από 
			τον κωδικα που χειριζεται τα λαθη. Προς το παρον επειδη το exception 
			είναι αντικειμενο, απλως θα τυπωσουμε ένα μηνυμα. Οποτε, τρεχοντας 
			το προγραμμα μας βγαζει ένα μηνυμα σχετικα φιλικο προς τον χρηστη. 
			MHNYMA:
			"Z:\8ο semester-and-previous\previous\eclipse-workspace\Calculator\
			src\logFile.txt
			(The system cannot find the path specified)"
			 */
			System.out.println(e.getMessage());
			/*Υπαρχουν και μεικτες περιπτωσεις οπου εγω θελω να κανω καποιο 
			χειρισμό, αλλα θεωρω ότι πρεπει να ενημερωσω και αυτους που με 
			καλεσανε για να κανουν καποιο χειρισμο και αυτοι το exception. 
			Αρα, θα εχω και throw.Μπαινω μεσα στον fileLogger και δειχνω με 
			το getMessage() , ότι εγω αυτό μπορω να κανω μονο. Αλλα, μπορει 
			αυτος που με καλεσε να μπορει να κανει κατι καλυτερο. Η΄ αν δε 
			μπορει να κανει κατι καλυτερο πρεπει να ενημερωθει και αυτος ότι 
			κατι πηγε στραβα με μενα. Οποτε, χειριζομαι το exception και επειτα 
			το πεταω από πανω μου.Αρα, τρεχοντας το εκτελείται μονο το c.add(3, 5);
			απο την CalcMain και έπειτα λόγω του exception που πεταξε το ιδιο 
			με το throw e το επομενο (c.mult(4, 6);) δεν εκτελείται. 
			Με το που παει να ανοιξει αυτό το αρχειο, επειδη δεν υπαρχει το path 
			πηδαει στο catch και οι εντολες: myFileWriter.append(msg+'\n');
											 myFileWriter.close(); 
			δεν εκτελουνται γτ εχει συμβει exception στο FileWriter.*/
			throw e;
		}

	}
}
