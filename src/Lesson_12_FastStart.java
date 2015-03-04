import java.util.ArrayList;
import java.lang.Math;
public class Lesson_12_FastStart {
	public static void main(String[] args){
		ArrayList<String> str = new ArrayList<String>(10);
		str.add("asdfj");
		str.add("slkdjfo");
		str.add("2983ei");
		str.add("293d");
		str.add("3");
		str.add("6+5s4dv");
		str.add("sdfkj");
		str.add("29idk");
		str.add("woiefj");
		str.add("YOMOMMA");
		System.out.println(str.get((int)(Math.random()*10)));
		System.out.println(str.get((int)(Math.random()*10)));
	}
}
