package programs;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7,8,9,10};

        int len = 10;
        int sum = len*(len+1)/2;
        int arrSum =0;

        for (int i =0; i< arr.length; i++){
            arrSum = arrSum + arr[i];
        }

        System.out.println(sum - arrSum);

    }
}
