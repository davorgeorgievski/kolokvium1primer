package Zadacha1;
import java.text.DecimalFormat;

public class PrvaZadaca {
	public static void main(String[] args) {
		
		String question="How much gallons are in 60 liters?";
		String litersQuantity="60";
		String answerText="liters makes";
		String gallonsQuantity="gallons";
		
		double galoni = 60/3.7854;
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println(question + " " + litersQuantity + " " + answerText + " " + df.format(galoni) + " " + gallonsQuantity);
	}
}
