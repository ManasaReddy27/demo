
public class largestsmallestnumber {

	public static void main(String[] args) {
		
        int numbers[] = new int[]{4,43,32,54,87,65,23,98,43,7};
        int smallest = numbers[0];
        int largest = numbers[0];
        for(int i=1; i< numbers.length; i++)
        {
        if(numbers[i] > largest)
        largest = numbers[i];
        else if (numbers[i] < smallest)
        smallest = numbers[i];
               
        }
       
        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);

	}

}
