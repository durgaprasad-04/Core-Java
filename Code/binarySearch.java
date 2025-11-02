package Code;
import java.util.Scanner;
public class binarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n =sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target");
		int target = sc.nextInt();
		int low=0, high=n-1;
		int result=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				result=mid;
				break;
			}else if(arr[mid]<target) {
				low=mid+1;
				
			}else {
				high=mid-1;
			}
		}
		if(result==-1) {
			System.out.println("Result not found");
		} else {
			System.out.println("element found at the index"+result);
		}
		sc.close();
	}

}
