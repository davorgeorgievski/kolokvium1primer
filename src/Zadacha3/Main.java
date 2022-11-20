package Zadacha3;

public class Main {
	public static void main(String[] args) {
		Servers s = new Servers();
		s.setProcesori("Intel i5 11th gen, Intel i3 10th gen");
		s.setHDD("500 GB");
		s.setNicip("192.194.0.2.124");
		System.out.println(s.getProcesori());
		System.out.println(s.getHDD());
		System.out.println(s.getNicip());
	}
}
