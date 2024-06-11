public class CalcMain {

	public static void main(String[] args) throws Exception{
		FileLogger l = new FileLogger();
		Calculator c = new Calculator(l);
		c.add(3, 5);
		c.mult(4, 6);
	}

}