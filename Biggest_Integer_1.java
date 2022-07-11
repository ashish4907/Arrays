import java.util.Scanner;
class test1{
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
        System.out.println("\nLargest element is "+findLargest(arr));
        
    }
    public static int findLargest(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}