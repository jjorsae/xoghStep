package J_Study;

class Meth{ 
	public void methexcep() throws ArithmeticException{
		throw new ArithmeticException();
	}
}

class NullType{
	public void nullExcep() throws NullPointerException {
		throw new NullPointerException();
	}
}


public class ExceptionTest3 {
	public static void main(String[] args) {
		Meth meth = new Meth();
		NullType nullType = new NullType();
		
		
		try {
			meth.methexcep();
		}catch (Exception e) {
			System.out.println("���а��ÿ����޽��� : "+e);
		}
	}
}
