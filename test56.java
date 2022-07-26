import java.util.Scanner;

public class test56 {
    public static void main(String[] args) {
        System.out.println("Enter the number of element");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Values");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("User entered array element");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(noOfPositiveAndNegative(arr));
     int[] count = noOfPositiveAndNegative(arr);
        System.out.println("No of positive element is "+count[0]);
        System.out.println("No of negative element is "+count[1]);

    }

    private static int[] noOfPositiveAndNegative(int[] arr) {
    int positiveNumber=0;
    int negativeNumber=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>=0){
            positiveNumber++;
        }
        else{
            negativeNumber++;
        }
    }
    int[] count={positiveNumber,negativeNumber};
    return count;
    }
}
