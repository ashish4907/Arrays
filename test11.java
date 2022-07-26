class test11{
    public static void main(String[] args){
        int[] x = {12,45,67,89,45};
        int index = 1;
       
       if(x==null ||  index <0 || index > x.length){
           System.out.println("Index out of Range");
       }

       int[] y = new int[x.length-1];

    for(int i=0, k=0;i<x.length;i++){
       
       if(i==index){
           continue;
       }
         y[k++] = x[i];
       
           }
System.out.println("user entered array is");
            for(int i=0;i<y.length;i++){
                System.out.print(y[i]+" ");
            }

        
    }
}