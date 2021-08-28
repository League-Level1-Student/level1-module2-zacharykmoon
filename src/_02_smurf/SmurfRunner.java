package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		
		Smurf Smurf1 = new Smurf("Handy","red", "boy");
		Smurf1.eat();
		System.out.println(Smurf1.getName());
		
		Smurf Smurf2 = new Smurf("Papa" ,"White","Boy");
		System.out.println(Smurf2.getName());
		System.out.println(Smurf2.getHatColor());
		System.out.println(Smurf2.isGirlOrBoy());
		
		Smurf Smurf3 = new Smurf("Smurfette" , "White", "Girl");
		System.out.println(Smurf2.getName());
		System.out.println(Smurf2.getHatColor());
		System.out.println(Smurf2.isGirlOrBoy());
		
	}

}
