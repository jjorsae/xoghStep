package J_Study;


class divide{
	public int div(int a, int b) throws ArithmeticException {
		int result= a/b;
		return result;
	}
}


public class ExcepTest {
	public static void main(String[] args) {
		divide d = new divide();
		try {
			throw new NullPointerException();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
		try {			
			int di = d.div(4, 0);
			System.out.println(di);
		}catch (ArithmeticException e) {
			System.out.println("���ܹ߻�");
		}finally {
			System.out.println("finally");
		}
	}
}
