import java.util.Scanner;

public class test57 {
    public static void main(String[] args) {
        System.out.println("Enter the number of element for first array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter "+n+" Values");
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of element for second array ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter "+m+" Values");
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
        arr3[i] = arr1[i];
    }
        for(int i=0;i<arr2.length;i++){
            arr3[i+arr1.length] = arr2[i];
        }
        System.out.println("The merged array is ");
    for(int i=0;i<arr3.length;i++){
        System.out.println(arr3[i]);
    }
}
}
        


