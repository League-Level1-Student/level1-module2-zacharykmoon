package _03_tea_maker;

public class TeaMakerRunner {
	
	public static void main(String[] args) {
		
		TeaBag teabag  = new TeaBag("Green");
		Kettle water = new  Kettle();
		Cup cup = new Cup();
		
		cup.makeTea(teabag, water.getWater());
		water.boil();
		
		cup.makeTea(teabag, water.getWater());
	  
	}

}

