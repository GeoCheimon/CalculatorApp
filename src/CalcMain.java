import java.io.IOException;

public class CalcMain {

	public static void main(String[] args) throws IOException {
		FileLogger l = new FileLogger();
		Calculator c = new Calculator(l);
		c.add(3, 5);
		c.mult(4, 6);
	}

}