
package _01_sea_creature;

public class SeaCreatureRunner {
	
	public static void main(String[] args) {
		
		SeaCreature spongebob = new SeaCreature("Spongebob");
		System.out.println(spongebob.getName());
		spongebob.eat();
		spongebob.laugh();
		
		
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		
		
	}
	

}
 

