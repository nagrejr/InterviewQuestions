import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements here: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int large = arr[0];
		int small = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("the largest number is: "+large);
		System.out.println("the smallest number is: "+small);

	}

}
