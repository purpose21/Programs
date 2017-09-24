interface Nose {
	
	public int oiMethod();

}

abstract class Of76 implements Nose  {
	
	
abstract int iMethod();
}
class Acts extends Of76 {

	@Override
	public int oiMethod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int iMethod() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

interface human {
	
	int man ();
}

abstract class hllo {
abstract	int num();
}

	class Clowns extends Of76 {
		 public int iMethod(){
		
	return 5;
}

		@Override
		public int oiMethod() {
			// TODO Auto-generated method stub
			return 4;
		}
	}

public class InterfaceExampleHFJ extends hllo implements Nose {
	
	public static void main (String[] args){
		
		
		Nose[]i = new Nose[3];
i[0] = new Acts();
i[1] = new Clowns();
i[2] = new InterfaceExampleHFJ();

		for (int x =0;x<3;x++){
			
			System.out.println(i[x].oiMethod()+" "+i[x].getClass());
		}	
	
		
	
	
	
}

	@Override
	public int oiMethod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int num() {
		// TODO Auto-generated method stub
		return 0;
	}}