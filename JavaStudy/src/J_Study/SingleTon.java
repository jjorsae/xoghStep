package J_Study;


public class SingleTon {
	private static SingleTon instance = new SingleTon();
	private SingleTon() {;};
	public static SingleTon getinstance() {
		return instance;
	}
	
	
	public static void main(String[] args) {
		SingleTon sing1 = SingleTon.getinstance();
		SingleTon sing2 = SingleTon.getinstance();
		
		System.out.println(sing1);
		System.out.println(sing2);
	}
}
