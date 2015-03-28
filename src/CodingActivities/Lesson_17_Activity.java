package CodingActivities;

public class Lesson_17_Activity {
	public static boolean isSorted(int [] a){
		boolean truth = true;
		for (int i = 1; i<a.length; i++){
			if(!(a[i] >= a[i-1])){
				truth = false;
			}
		}
		return truth;
	}
	public static int binarySearch(int [] a, int b){
		int high, mid, low;
		high = a.length;
		low = 0;
		mid = high/2;
		boolean found = false;
		while(!found){
			if(a[mid] == b){
				found = true;
			}else if(b>a[mid]){
				low = mid;
				mid = (high+low)/2;
			}else if(b<a[mid]){
				high = mid;
				mid = (high + low)/2;
			}
			if(high == low && !found){
				a[mid] = -1;
				break;
			}
		}
		return a[mid];
	}
}
