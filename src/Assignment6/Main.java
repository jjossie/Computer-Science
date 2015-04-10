package Assignment6;
import java.util.Arrays;
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
		System.out.println(names);
		System.out.print(sort(names).toString());
	}

	public static String titleCase(String s){
		return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
	}

	/*public static ArrayList<String> sort(ArrayList<String> in){
		ArrayList<String> out = in;
		for (int pointer = 1; pointer<in.size(); pointer ++){

			String currentString = in.get(pointer);

			System.out.print("Pointer: " + pointer + " Current String: " + currentString + "\t" + out + '\n');
			for(int i= 1; i<=pointer; i++){
				System.out.print("\tIteration: " + i + "  " + currentString + " compared to " + out.get(i-1) + ": " + (currentString.compareTo(out.get(i-1))) + " and compared to "+  out.get(i) + ": " + currentString.compareTo(out.get(i)) + "\n") ;
				if(currentString.compareTo(out.get(i-1)) > 0 && currentString.compareTo(out.get(i)) < 0) {
					out.remove(pointer);
					System.out.print( "    Out after remove: " + out.toString() + " ");
					out.add(i-1, currentString);
					System.out.print("Out after add: " + out.toString() + "\n");
					break;
				}
			}


		}

		return out;
	}*/
	public static ArrayList<String> sort(ArrayList<String> inputArray){
		int i,j;
		String key;
		for (j = 1; j < inputArray.size(); j++) {
			key = inputArray.get(j);
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(inputArray.get(i)) > 0) {
					break;
				}
				//inputArray[i + 1] = inputArray.get(i);
				inputArray.add(i+1, inputArray.get(i));
				inputArray.remove(i);
				i--;
			}
			//inputArray[i + 1] = key;
			inputArray.set(i+1, key);
		}
		return inputArray;
	}

}
