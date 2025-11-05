package Code;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int second =Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				second=max;
				max=arr[i];
			}
			else if(arr[i]>second && arr[i]!=max) {
				second=arr[i];
			}
		}
		if(second==Integer.MIN_VALUE) {
			System.out.println("Not Found");
		}else {
			System.out.println("Second Largest"+second);
		}

	}

}
