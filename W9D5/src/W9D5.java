
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;
/**
 * 
 * @author Sahas
 * this was implemented by the @sahas kiran on 09-03-2018
 *
 */
public class W9D5 {
	
		public static void main(String args[]) {
			System.out.println("Exponetial from of error terms : this program was implemented by the Sahas Kiran");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Fisrt enter the measuredvalue of 1st term");
			double MeasuredValue1 = keyboard.nextDouble();                        // this was print on the console here we can enter 1st measuredvalue 
			System.out.println("Now enter the Error term of the 1st term");
			double ErrorValue1 = keyboard.nextDouble();                           // this was print on the console here we can enter 1st Errorvalue 
			System.out.println("");
			keyboard.close();
			
            //here the program for to execute the code for the square
            double power2 = Math.pow(MeasuredValue1, 2);
            double valueErrorFraction = ErrorValue1/Math.abs(MeasuredValue1);
            double sahaserror1  = (2)*valueErrorFraction*Math.abs(power2);
            System.out.println("The Square  of the error term  "+ MeasuredValue1+"± "+ ErrorValue1+ "     =    "+ power2+"  ±  "+ getSignificant(sahaserror1 ,1));
            System.out.println("");
            
            //here the program for to execute the code for the square root
            double power1 =  Math.sqrt(MeasuredValue1);
            double sahaserror11 = (0.5)*valueErrorFraction*Math.abs(power1);
            System.out.println("The Square root of the error term  "+ MeasuredValue1+"± "+ ErrorValue1+ "     =    "+ power1+"  ±  "+ getSignificant(sahaserror11,1));
            System.out.println("");
            
            //here the program for to execute the code for the root
            
            double power= Math.cbrt(MeasuredValue1);
            double sahaserror= Math.abs(0.33333333333333333333333333333333)*valueErrorFraction*Math.abs(power);
            System.out.println("The cube root of the error term  "+ MeasuredValue1+"± "+ ErrorValue1+ "     =    "+ power+"  ±  "+ getSignificant(sahaserror,1));
}
            // here by this we show the output round up value with one significante figure
            public static String getSignificant(double value, int sigFigs) {
                            MathContext mc = new MathContext(sigFigs, RoundingMode.DOWN);
                            BigDecimal bigDecimal = new BigDecimal(value, mc);
                            return bigDecimal.toPlainString();
            }


}
