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
			System.out.println("에러가 발생했습니다 에러 내용 :"+ExceptionMessege);
		}
		System.out.println("프로그램이 살아있다면 이메세지가 출력되고 정수 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(input);
		sc.close();
	}
	
}
