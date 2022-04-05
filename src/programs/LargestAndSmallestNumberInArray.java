package programs;

public class LargestAndSmallestNumberInArray {

    public static void main(String[] args) {

        int arr[] = {123,432}, largest=arr[0], smallest=arr[0];

        for(int i : arr){
            if(i>largest)
                largest=i;
            else if(i<smallest)
                smallest=i;
        }

        System.out.println("largest: " + largest + " ::: smallest: " + smallest);
    }
}
