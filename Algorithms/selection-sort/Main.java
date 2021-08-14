public class Main {

	public static void main(String[] argc){


		int[] arr = {3, 0, 1, 99, -22, 50, 30};

		//for(int i =0; i< arr.length; i++){
	
	//		System.out.println(arr[i]);
	
	//	}

		int temp = 0;
		int largestArrInd = 0;
		
		for(int i =0; i< arr.length-i; i++){
			largestArrInd = i;
			for(int j=0; j < arr.length-i; j++){
				
				if(arr[largestArrInd] < arr[j]){
					largestArrInd = j;

					System.out.println("largestArrInd = " + largestArrInd);
					System.out.println("");
						
				}
			}
			temp = arr[largestArrInd];
			
			arr[largestArrInd] = arr[arr.length-1-i];
			System.out.println(arr[largestArrInd]);
			arr[arr.length-i-1] = temp;
			System.out.println(arr[arr.length-1-i]);

			System.out.println("end");
			
			
		}

		System.out.println("After ordering");

		for(int i =0; i< arr.length; i++){
	
			System.out.println(arr[i]);
	
		}


	}


}