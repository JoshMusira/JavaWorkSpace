package garbageCollection;

public class garbage {
	String josh;
	
	garbage ( String josh){
		this.josh = josh;
	}
	
	@Override
	
	protected void finalize() throws Throwable{
		System.out.println(this.josh + "" + "Successfully Garbage Collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		garbage g1 = new garbage("Musira");
		g1 = null;
		
		System.gc();
		
		
	}

}
