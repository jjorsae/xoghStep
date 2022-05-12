package J_Study;

class Demo<T,M>{
	private T brand;
	private M modelNumber;
	
	public T getbrand() {return brand;}
	public void setBrand(T brand) {this.brand=brand;}
	
	public M getmodeNumber() {return modelNumber;}
	public void setmodelNumber(M modelnumber) {this.modelNumber=modelnumber;}
	
	
}

public class GenericDemo2 {
	public static void main(String[] args) {
		Demo<String, Integer> demo = new Demo<>();
		Demo<String, String> demo2 = new Demo<>();
		
		demo.setBrand("samsung");
		System.out.println(demo.getbrand());
		demo.setmodelNumber(12345);
		System.out.println(demo.getmodeNumber());
		
		demo2.setBrand("kia");
		System.out.println(demo2.getbrand());
		demo2.setmodelNumber("model1");
		System.out.println(demo2.getmodeNumber());
	}
}
