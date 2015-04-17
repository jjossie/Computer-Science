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
		for (int pointer = 1; pointer<in.size(); pointer ++){
			String currentString = in.get(pointer);

			for(int i= 1; i<=pointer; i++){

				if((currentString.compareTo(in.get(i-1)) < 0 && currentString.compareTo(in.get(i)) <= 0 && in.get(i-1).compareTo(in.get(i))<=0)) {
					in.remove(pointer);
					in.add(i-1, currentString);
					break;
				}else if (currentString.compareTo(in.get(0))<=0 ){
					in.remove(pointer);
					in.add(0, currentString);
					break;
				}

			}
		}

		return in;
	}



}
