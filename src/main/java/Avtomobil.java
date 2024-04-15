
public class Avtomobil extends Vozilo {

	Avtomobil() {
		speed = 1000;
		fuel_capacity = 500;
		//int brojNaVrati=4;
	}
	
public void Zapali() {
	int brojNaVrati=4;
	System.out.println("Kolata e zapalena");
	System.out.println("Kolata so atributi: "+speed+" brzina, "+fuel_capacity+" kapacitet gorivo "+brojNaVrati+" vrati");
	}
}
