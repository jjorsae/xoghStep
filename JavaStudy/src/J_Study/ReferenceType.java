package J_Study;

class A{
    public int id;
    A(int id){
        this.id = id;
    }
}

public class ReferenceType {

   static int _value(int b){
       b = 2;
       return b;
   }

   public static void runValue(){
       int a = 1;
      int result= _value(a);
       System.out.println("runValue, "+result);
   }
    
   static void _reference1(A b){
       b = new A(2);
   }
    
   public static void runReference1(){
       A a = new A(1);
       _reference1(a);
       System.out.println("runReference1, "+a.id);     
   }
    
   static void _reference2(A b){
       b.id = 2;
   }

   public static void runReference2(){
       A a = new A(1);
       _reference2(a);
       System.out.println("runReference2, "+a.id);     
   }
    
   public static void main(String[] args) {
       runValue(); // runValue, 1
       runReference1(); // runReference1, 1
       runReference2(); // runReference2, 2
   }
}
  