package sub02;



public class Calc {

	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int Plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) throws Exception {
		
		if(y <=0) {
			//예외 강제발생
			Exception e = new Exception("y는 0보다 작은면 안됩니다.");
			throw e;
		}
		
		int z = x * y;
		
		return x * y;
	}
	public int div(int x, int y) throws ArithmeticException{
		
		int z= x/y;
		
		return z;
	}
}

