import java.io.IOException;

public class CalcMain {

	public static void main(String[] args) throws Exception{
		FileLogger l = new FileLogger();
		Calculator c = new Calculator(l);
		try {
			c.add(3, 5);
			c.mult(4, 6);
		} catch (IOException e) {
			System.out.println("Catastrophic failure. Please call the helpdesk");
		}

	}

}