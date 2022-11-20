package Zadacha2;

public class VtoraZadacha {
	public void nadgradbaNaMemorija(int preth, int cip) {
		int zbir=preth+cip;
		System.out.println("Nadgradena bese memorijata od " + preth + " GB, sega ima vkupno " + zbir + " GB");
	}
	public static void main(String[] args) {
		VtoraZadacha v = new VtoraZadacha();
		v.nadgradbaNaMemorija(100, 50);
	}
}
