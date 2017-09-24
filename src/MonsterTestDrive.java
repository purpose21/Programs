public class MonsterTestDrive{

	public static void main (String[] args){
	
		
	Monster[] ma= new Monster[3];
	
	
	ma[0]=new Vampire();
	
	ma[1]=new Dragon();
	
	ma[2]=new Monster();
	
	for (int x=0; x<3; x++){
	ma[x].frighten(x);
		
		
	}
	}
	
	
	public static class Monster{
		 public void  frighten(int d){
			System.out.println("kyun yaar");
			
		}
		
		
	}
	static class Vampire extends Monster {
		void scare(int f){
			System.out.println("lle mero");
		
		}
		
	}
	
	
	static class Dragon extends Monster{
		
	public void frighten(int degree){
		System.out.println("breath fire");
		
	}
		
	}
	
}