package Test_package;

public class D7_Methods {
	public static void main(String[] args) {
		D7_Methods obj = new D7_Methods();
		String name = obj.getData();
        System.out.println(name);
        System.out.println();
        
        String name3 = getData2();
        System.out.println(name3);
        System.out.println();
        
        D7_Methods2 obj2 = new D7_Methods2();
        String name2 =obj2.getUserData();
        System.out.println(name2);
	   }
       public  String getData() 
       {
       System.out.println("Hello World");
       return "Harry Potter";
       }
       public static String getData2() 
       {
       System.out.println("Tit for tat");
       return "Actions speak louder than words";
       }
}
