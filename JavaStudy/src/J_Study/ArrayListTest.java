package J_Study;
import java.util.*;


public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(12);
		arrList.add(13);
		arrList.add(1);
		for(int for_each:arrList) {
			System.out.println(for_each);
		}
		arrList.remove(0);
		for(int for_each:arrList) {
			System.out.println(for_each);
		}
		System.out.println("size:"+arrList.size());
		
	}
}
