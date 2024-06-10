
public class Calculator {
	
	private ILogger logger;
	
	public Calculator(ILogger logger)
	{
		this.logger = logger;//Φτιαχνω εναν Logger
	}
	public int add(int a, int b) {
		int result = a+b;//καλυτερα αν θελουμε ακεραιους να use long type
		logger.log("Result = " + result);//προς το παρον logaρει προς την οθονη
		return result;
	}
	public int sub(int a, int b) {
		int result = a-b;
		logger.log("Result = " + result);//προς το παρον logaρει προς την οθονη
		return result;	
	}
	public int mult(int a, int b) {
		int result = a*b;
		logger.log("Result = " + result);//προς το παρον logaρει προς την οθονη
		return result;
	}
	public double div(int a, int b) {
		double result = a/(b+0.0);//We use this because
		//οταν κανουμε απλα α/β με ακεραιους ακομη και αν το result ειναι δεκαδικος
		//η java θα μας επιστρεψει το ακεραιο μερος + 2 μηδενικα. Οποτε, μετατρεπουμε
		//το παρανομαστη σε δεκαδικο αριθμο και ετσι διαιρει εναν ακεραιο με εναν double
		//και επιστρεφει αναγκαστικα double 
		logger.log("Result = " + result);//προς το παρον logaρει προς την οθονη
		return result;
	}
}
