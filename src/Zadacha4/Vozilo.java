package Zadacha4;

public class Vozilo implements IAutoHibrid {
	@Override
	public void tipNaPogon(Boolean elektricenPogon, Boolean benziskiPogon) {
		if (elektricenPogon==true) {
			System.out.println("Voziloto ima elektricen pogon.");
		}
		else { 
			System.out.println("Voziloto ima benziski pogon.");
		}
	}
	public static void main(String[] args) {
		Vozilo v = new Vozilo();
		v.tipNaPogon(true, false);
	}

}
