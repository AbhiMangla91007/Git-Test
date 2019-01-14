import java.util.*;
	public class ArrayWithFunction
	{
		int selement;
		int flag=-1;
		int counter=0;
		Scanner scan = new Scanner(System.in);
		int elements[]=new int[10];
		static void enterElement(){
			System.out.println("Enter 10 elements in the array");
			for (counter=0;counter<10;counter++)
		{
			elements[counter]=scan.nextInt();
		}
		}
		static void displayelement(){
            System.out.println("The following elements were entered in the array");
		for (counter=0;counter<10;counter++) {
			System.out.println(elements[counter]);
		}
		}
		static void searchelement(){
			System.out.println("Enter the element you want to find");
		    selement=scan.nextInt();
		}  
		static void findelement(){
			for (counter=0;counter<10;counter++)
		{
			if (elements[counter]==selement)
			{
				flag=1;
				break;
			}
			else
				flag=-1;
		}
			if (flag==1)
				System.out.println("The element is at: "+(counter+1));
			else
				System.out.println(flag);
		}
		
		}
	public static void main(String[] args) {
		enterelement();
        displayelement();
        searchelement();
        findelement();
	}