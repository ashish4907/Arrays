import java.util.Scanner;
class test5{
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
        System.out.println("\nAverage of element is "+findAverage(arr));
        
    }
    public static int findAverage(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}





  if(index <0 || index > arr.length){
        System.out.println("Index out of Range");
        }
    int[] y = new int[arr.length+1];
    for(int i=0;i<arr.length;i++){
        if(i<index){
            y[i] = arr[i];
        }
        else{
            y[i+1] = arr[i];
        }
        return y;
    }


    }
}