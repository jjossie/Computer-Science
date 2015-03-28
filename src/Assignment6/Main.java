package Assignment6;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	static ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String in = "poop";
		while(!in.toUpperCase().equals("STOP")){
			System.out.println("Enter the next name:");
			in = s.nextLine();
			if(!in.toUpperCase().equals("STOP")){
				names.add(titleCase(in));
			}
		}
		System.out.print(names.toString());
	}

	public static String titleCase(String s){
		String n = "";
		n.toCharArray()[0] = s.toUpperCase().charAt(0);
		for(int i = 1; i<s.length(); i++){
			n.toCharArray()[i] = s.toLowerCase().charAt(i);
		}
		return n;
	}
	public static ArrayList<String> sort(ArrayList<String> in){
		ArrayList<String> out = new ArrayList<String>();
		int pointer = 0;
		boolean sorted = false;
		while(!sorted){

		}

		return out;
	}
}
