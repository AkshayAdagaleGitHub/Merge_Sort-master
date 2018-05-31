import java.util.Scanner;

public class MSort {

	public static void main(String[] args) {

		int i=0,n;
		
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Please enter" + n +" numbers");
		for(i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
		
		sc.close();
		
		MergeSort(arr,0,n-1);
		
		System.out.println("The sorted array is ");
		for(int j=0;j<n;j++){
			System.out.println(arr[j]);
		}
	}
	
      public static void MergeSort(int arr[],int start,int end){
		if(start<end){
    		int mid=(start+end)/2;
			MergeSort(arr,start,mid);
			MergeSort(arr,mid+1,end);
			Merge(arr,start,mid,end);
		}
      }

	private static void Merge(int[] arr1, int start, int mid, int end) {
		
		int p=start, q=mid+1,k=0;
		int arraynew[] = new int[end-start+1];
		
		for(int i=start;i<=end;i++){
			if(p>mid){
				arraynew[k++]= arr1[q++];
			}else if (q> end){
				arraynew[k++] = arr1[p++];
			}else if(arr1[p]<arr1[q]){
				arraynew[k++]=arr1[p++];
			}else{
				arraynew[k++]= arr1[q++];
				}
			}
			for(int j=0;j<k;j++){
				arr1[start++] = arraynew[j];
			}		
	}
	
}
