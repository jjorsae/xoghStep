package J_Study;

class Out{
	public String out = "out_print";
	public void print_out() {
		System.out.println(out);
	}
	public class In{
		public String in = "in_print";
		public void print_in() {
			System.out.println(in);
		}
	}
}

class anTest{
	public String test_str = "anTest_str";
	public void pr() {
		System.out.println("졸려죽겠다정말");
	}
	
}

class annony{
	anTest at = new anTest();
	
	public void pr() {
		System.out.println("금방이라도 쓰러지겠어");
	}
	
}


public class InnerClass {
	public static void main(String[] args) {
		Out out = new Out();
		Out.In in = out.new In();
		System.out.println(out.out);
		System.out.println(in.in);
		
		anTest atest=new anTest();
		annony an = new annony();
		atest.pr();
		an.at.pr();
		an.pr();
		
	}
}
