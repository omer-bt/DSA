public class Main {

	public static void main(String[] args){
		int temp = 0;
		int[] arr = new int[5];
		arr[0] = 50;
		arr[1] = 3;
		arr[2] = 10;
		arr[3] = -2;
		arr[4] = 20;
		for(int i = 0; i < arr.length; i++){

			System.out.println(arr[i]);			
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length - i; j++) {
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];	
					arr[j] = temp;

				}


			}


		}


		System.out.println("After changing");

		for(int i = 0; i < arr.length; i++){

			System.out.println(arr[i]);			
		}
	}	





}