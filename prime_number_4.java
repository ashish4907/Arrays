import java.util.Scanner;
class test4{
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
        System.out.println("\nPrime Number is "+findPrimeNumber(arr));
        
    }
     public static int findPrimeNumber(int[] arr){
     int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    count--;
                    break;
                }
            }
            count++;
        }
        return count;
     }

    
}