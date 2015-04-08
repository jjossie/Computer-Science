package Assignment6;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	static ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String in = "";
		while(!in.toUpperCase().equals("STOP")){
			System.out.println("Enter the next name:");
			in = s.nextLine();
			if(!in.toUpperCase().equals("STOP")){
				names.add(titleCase(in));
			}
		}
		System.out.print(sort(names).toString());
	}

	public static String titleCase(String s){
		return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
	}

	public static ArrayList<String> sort(ArrayList<String> in){
		ArrayList<String> out = new ArrayList<String>();
		out = in;
		int pointer = 1;
		boolean sorted = false;
		for (pointer = 1; pointer<in.size(); pointer ++){

			String currentString = in.get(pointer);

			System.out.print("Pointer: " + pointer + " Current String: " + currentString + '\n');
			for(int i = 0; i<=pointer; i++){
				if(currentString.compareTo(out.get(i)) < 0 && currentString.compareTo(out.get(i+1)) >= 0) {
					out.remove(pointer);
					System.out.print( "Iteration: " + i + " Out after remove: " + out.toString() + " ");
					out.add(i, currentString);
					System.out.print("Out after add: " + out.toString() + "\n");
					break;
				}
			}


		}

		return out;
	}
	public static boolean sorted(ArrayList<String> ss){
		boolean truth = true;
		for (int i = 0; i<ss.size(); i++){
			if(i>0){
				if(ss.get(i).compareTo(ss.get(i-1)) < 0){
					truth = false;
				}

			}
		}
		return truth;
	}
}
