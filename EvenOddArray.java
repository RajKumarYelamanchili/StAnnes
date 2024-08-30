package interview_programs;

public class EvenOddArray {

	public static void main(String[] args) {
		int arr[] = {2,7,4,3,83,100,99,77,64,23};
		System.out.println("length of array: " + arr.length);
		System.out.println("Odd Numbers:");
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 !=0)
			{
				System.out.println(arr[i]);
			}
			
		}
		System.out.println("Even Numbers:");
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 ==0)
			{
				System.out.println(arr[i]);
			}
			
		}

	}

}
