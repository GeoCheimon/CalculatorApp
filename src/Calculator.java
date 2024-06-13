import com.GeoCheimon.exceptions.OverflowException;
import com.GeoCheimon.logger.ILogger;
class Calculator {
	
	private ILogger logger;
	
	public Calculator(ILogger logger)
	{
		this.logger = logger;//Φτιαχνω εναν Logger
	}
	public int add(int a, int b) throws Exception, OverflowException
	{//πρεπει να βαλουμε οτι κανει throws και το OverflowException γιατι δεν το χειριζεται
		long result = (long)a+ (long)b;//καλυτερα αν θελουμε ακεραιους να use long type
		if(result>Integer.MAX_VALUE)//Δλδ εχει γινει overflow, γτ το result ειναι long,
									//ενω ο έλεγχος ειναι Interger
		{
			//εδω θελει new για αυτο το exception, θα κάνει και import και το πακετο.
			//throw new OverflowException();//και θα διακοπεί η εκτέλεση
			//αυτό το exception θα σκασει μέσα στην main
			throw new OverflowException("Overflow");//Περιπτωση που φτιαξουμε κατασκευαστη 
			//OverflowException και περναμε απο εκει το δικο μας msg
		}
		
		logger.log("Result = " + result);//προς το παρον logaρει προς την οθονη
		return (int)result;
	}
	public int sub(int a, int b) throws Exception{
		int result = a-b;
		logger.log("Result = " + result);//προς το παρον logaρει προς την οθονη
		return result;	
	}
	public int mult(int a, int b) throws Exception{
		int result = a*b;
		logger.log("Result = " + result);//προς το παρον logaρει προς την οθονη
		return result;
	}
	public double div(int a, int b) throws Exception{
		double result = a/(b+0.0);//We use this because
		//οταν κανουμε απλα α/β με ακεραιους ακομη και αν το result ειναι δεκαδικος
		//η java θα μας επιστρεψει το ακεραιο μερος + 2 μηδενικα. Οποτε, μετατρεπουμε
		//το παρανομαστη σε δεκαδικο αριθμο και ετσι διαιρει εναν ακεραιο με εναν double
		//και επιστρεφει αναγκαστικα double 
		logger.log("Result = " + result);//προς το παρον logaρει προς την οθονη
		return result;
	}
}
