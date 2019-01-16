import java.util.*;
class SortElement {
    public static void main(String[] args) {
    
    int counter;
    Scanner scan = new Scanner(System.in);
	int arr1[] = new int[5];
	System.out.println("Enter 5 sorted elements in array");
	for (counter=0;counter<5;counter++)
		{
			arr1[counter]=scan.nextInt();
		}

	int arr2[] = new int[6];
    
    System.out.println("Enter 6 sorted elements in array");
	for (counter=0;counter<6;counter++)
		{
			arr2[counter]=scan.nextInt();
		}




	int[] arr3 = new int[arr1.length + arr2.length];
	int i = 0; 
	int j = 0; 
	int k = 0;
	while(i < arr1.length && j < arr2.length) {
		if(arr1[i] < arr2[j]) {
			arr3[k] = arr1[i];
			i++;
		} else{
			arr3[k] = arr2[j];
			j++;
		}
		k++;
		
	}

	if(i < arr1.length){
		System.arraycopy(arr1, i, arr3, k, (arr1.length -i));
	}

	if(j <arr2.length){
		System.arraycopy(arr2, j, arr3, k, (arr2.length - j));
	}
	System.out.println("Merged Sorted array" + Arrays.toString(arr3));
}
}