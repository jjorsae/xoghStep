package J_Study;

import java.util.Scanner;

public class NullPointerEx {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String[] arr =null;
		int i=0;
		try {
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}catch(NullPointerException e){
			String ExceptionMessege = e.getMessage();
			System.out.println("������ �߻��߽��ϴ� ���� ���� :"+ExceptionMessege);
		}
		System.out.println("���α׷��� ����ִٸ� �̸޼����� ��µǰ� ���� �Է��ϼ���:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(input);
		sc.close();
	}
	
}
