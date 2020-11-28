package assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assignment35 {
	public static void main(String[] args) {
	int []arr= {3,11,7,39,71,99};

int lgNumber=0;
int seLgNumber=0;
for (int i = 0; i < arr.length; i++) {
	if( arr[i]>lgNumber) {
		seLgNumber=lgNumber;
		lgNumber=arr[i];
	}else if (arr[i]>seLgNumber) {
		seLgNumber=arr[i];
	}
}
System.out.println(Arrays.toString(arr));
System.out.println("second largest number is: "+seLgNumber);
	}
}
