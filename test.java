package test;

public class test{ 
	public static void main(String[] args) {
		int arr[] =new int[] {3,2,1,6,5,4,8,9,10,11};
		int endix = arr.length-1;
		int i=1;

		for (int t = 1,sw=0 ; i <=endix; i++) {
			for (int j = 0; j < endix-i; j++) {
				if (arr[j] > arr[j+1]) {
					t= arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=t;
					sw=1;
				}
				if(sw==0) break;
			}
		}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.print("\n총 버블수" +(i-1));
		}		
	}
