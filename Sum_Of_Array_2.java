import java.util.Scanner;
class test2{
    public static void main(String[] args){
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter "+a+" elements");

        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("user entered array is");
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSum Of Array "+sumOfArray(arr));
        
    }
    public static int sumOfArray(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}