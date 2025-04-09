import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		 
       
      
	}

	public static void doInsertionSort(int[] input) {
		System.out.println("The initial array is;" + Arrays.toString(input));
		int keepit;
		
		for(int i = 1; i < input.length; i++) {
			System.out.printf("Array part form [0] to [%d] is sorted, we take out [%d].\n", i-1,i);
			keepit = input[i];
			
			int j;
			
			for(j = i; j > 0 && keepit < input[j-1]; j--) {
				System.out.printf("\tMove[%d] to 9%d].\n", j-1,j);
			}
			
			System.out.printf("\tPut %d int [%d].\n", keepit);
			input[j] = keepit;
			
			
			System.out.printf("Round %d finished, the array is : %s \n", i, Arrays.toString(input));
		}
	}
	
	public void bubbleSort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			boolean change = false;
			for (int j = 0; j< data.length - 1 - i; j++) {
				if(data[j] > data[j+1]) {
					System.out.printf("Switching %d and %d.\n", data[j], data[j+1]);
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
			System.out.print(Arrays.toString(data));
			if (change == false) { break;}
		}
	}
	
	
}
