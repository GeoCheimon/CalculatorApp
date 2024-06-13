import java.io.IOException;

import com.GeoCheimon.exceptions.OverflowException;
import com.GeoCheimon.logger.FileLogger;

public class CalcMain {

	public static void main(String[] args) throws Exception{
		FileLogger l = new FileLogger();
		Calculator c = new Calculator(l);
		try {
			c.add(Integer.MAX_VALUE, 1);
			c.mult(4, 6);
		}
		catch(OverflowException e){
			System.out.println(e.getMessage());//εδω θα τυπωθει το ονομα που ορισα εγω οταν 
			//εκανα overrride την method στο δικο μου exception
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("Catastrophic failure. Please call the helpdesk");
		}

	}

}