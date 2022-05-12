package ImpleTest;

class checkType{
	
	public int chek(checkType[] checkT) {
		int i =0;
		int count =0;
		for(i=0;i<checkT.length;i++) {
			if(checkT[i] instanceof AniMarker) {
				count++;
			}
		}
		return count;
	}
}


class Test extends checkType{
	checkType check = new checkType();
	public void result(checkType[] ch) {
		System.out.println(check.chek(ch));
	}
	
}

public class TV {

	public static int checkAni(TV[]tv){
		int i =0;
		int count =0;
		for(i=0;i<tv.length;i++) {
			if(tv[i] instanceof AniMarker) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		/*
		TV[] CT = {
				new Demonslayer(), 
				new DoctorStrange(),
				new Titanic(),
				new zzanggu()
		};
		

		int result = TV.checkAni(CT);
		System.out.println("애니의 갯수는 "+result+"입니다");
		*/
		Test test = new Test();
		checkType[] type = {
			new Demonslayer(),
			new DoctorStrange(),
			new zzanggu(),
			new Titanic()
		};
		test.result(type);
		
	}
}
