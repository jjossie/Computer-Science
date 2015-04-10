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
		System.out.println(names);
		System.out.print(sort(names).toString());
	}

	public static String titleCase(String s){
		return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
	}


//------------------------------BEHOLD THE ALMIGHTY NOT-SO-GREAT SORT FUNCTION THAT DOESN'T ACTUALLY WORK----------

/*	public static ArrayList<String> sort(ArrayList<String> in){
		ArrayList<String> in = in;
		for (int pointer = 1; pointer<in.size(); pointer ++){

			String currentString = in.get(pointer);

			System.out.print("Pointer: " + pointer + " Current String: " + currentString + "\t" + in + '\n');
			for(int i= 1; i<=pointer; i++){
				System.out.print("\tIteration: " + i + "  " + currentString + " compared to " + in.get(i-1) + ": " + (currentString.compareTo(in.get(i-1))) + " and compared to "+  in.get(i) + ": " + currentString.compareTo(in.get(i)) + "\n") ;
				if(currentString.compareTo(in.get(i-1)) > 0 && currentString.compareTo(in.get(i)) < 0) {
					in.remove(pointer);
					System.out.print( "    in after remove: " + in.toString() + " ");
					in.add(i-1, currentString);
					System.out.print("in after add: " + in.toString() + "\n");
					break;
				}
			}


		}

		return in;
	}*/

	public static ArrayList<String> sort(ArrayList<String> in){
		for (int pointer = 1; pointer<in.size(); pointer ++){
			String currentString = in.get(pointer);

			for(int i= 1; i<=pointer; i++){

				if(currentString.compareTo(in.get(i-1)) > 0 && currentString.compareTo(in.get(i)) < 0) {
					in.remove(pointer);
					in.add(i-1, currentString);
					break;
				}

			}
		}

		return in;
	}

	//------------CHEATER CODE THAT DOESN'T ACTUALLY WORK THIS IS KINDA BS---------------
	/*public static ArrayList<String> sort(ArrayList<String> inputArray){
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
	}*/

}
