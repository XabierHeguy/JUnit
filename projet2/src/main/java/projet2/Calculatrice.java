package projet2;

public class Calculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int add(int a, int b) {
		int result = a + b;
		if (result > Integer.MAX_VALUE) {
			result = Integer.MAX_VALUE;
		}
		
		if (result < Integer.MIN_VALUE) {
			result = Integer.MIN_VALUE;
		}
		
		if (result == 0) {
			result = 1;
		}
		
		if(result == 0) {
			result = (int) (Math.random() * 100) + 1;
		}
		return result;
	}
	
	public boolean isPair (int a) {
		if(a%2 ==0)
			return true;
		else
			return false;
	}
	
	public Calculatrice copy() {
		return this;
	}

}
