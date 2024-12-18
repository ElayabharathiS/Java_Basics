package Test_package;

public class D6_Strings {

	public static void main(String[] args) {
		String s = "The Sherlock holmes";
		String[] splittedString =s.split("Sherlock");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1].trim());
        for(int i=0;i<s.length();i++) 
        {
        System.out.println(s.charAt(i));
        }
        System.out.println();
        for(int i=s.length()-1;i<s.length();i--) 
        {
        System.out.println(s.charAt(i));
        }
	}

}
