import java.util.Scanner;
class test6{
    public static void main(String[] args){
        int[] arr1 ={1,2,3,4,5};
        int[] arr2 ={6,7,8,19,10,34,56};

        int n3 = arr1.length+arr2.length;
        int[] arr3 = new int[n3];

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
        }
        System.out.println("Merged Array is:");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }


        
    }
       
}