package J_Study;

abstract class abs{
	public int a =3;
	public abstract void b() ;
	int c;
	static int b =3;
}

class ab extends abs{

	@Override
	public void b() {
		System.out.println("hello");
	}
}

public class Abstrac {
	public static void main(String[] args) {
		ab c =new ab();
		int result =  c.a;
		c.b();
		System.out.println(result);
	}
}
