
public class Motorcikl extends Vozilo{

	Motorcikl(){
		speed = 700;
		fuel_capacity = 250;
		
	}
	public void izvediKaskada( ) {
		String tipnamotor="Poloven";
		System.out.println("Motorciklot izvede kaskada");
		System.out.println("Motorciklot so atributi: "+speed+" brzina, "+fuel_capacity+" kapacitet gorivo "+tipnamotor+" tip na motor");

	}
}
