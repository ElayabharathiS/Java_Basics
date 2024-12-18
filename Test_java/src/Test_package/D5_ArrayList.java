package Test_package;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D5_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Alex");
		a.add("Arun");
		a.add("Lee");
		a.add("Amar");
		a.remove(0);
		System.out.println(a.get(2));
		System.out.println();
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println();
		for (String val : a) {
			System.out.println(val);
		}
		System.out.println();
		System.out.println(a.contains("Amar"));
		
		String[] name = {"Eren","Mikasa","Armin"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Eren"));
	}
}
