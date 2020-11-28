package assignment;

public class Questin36 {

	public static void main(String[] args) {

		int []arr= {3,11,7,99,71,99};
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = i+1; j< arr.length; j++) 
			{
				if(arr[i]==arr[j]) 
				{
					System.out.println("Duplicate number is: "+arr[j]);
				}
			}
		}
	}		

}




