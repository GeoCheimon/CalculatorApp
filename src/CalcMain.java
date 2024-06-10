
public class CalcMain {

	public static void main(String[] args) {
		Logger l = new Logger();
		Calculator c = new Calculator(l);
		c.add(3, 5);
		c.mult(4, 6);
	}

}
