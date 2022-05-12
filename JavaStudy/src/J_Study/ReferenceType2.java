package J_Study;


class student{
	public String name;
	public String ID;
	public String student_ID;
}

class subject{
	public void output(student st) {
		student stu = new student();
		stu.ID = st.ID;
		System.out.println(st.ID);
	}
}


public class ReferenceType2 {
	public static void main(String[] args) {
		student st = new student();
		subject sb = new subject();
		
		
		st.ID="0123";
		System.out.println(st.toString());
		System.out.println(sb);
		sb.output(st);
	}
}
