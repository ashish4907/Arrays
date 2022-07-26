class test10{
    public static void main(String[] args){
        int[] x = {12,2,38,84,25};
        int[] y = {19,34,38,87,25,84};

        for(int i=0;i<x.length;i++){
         for(int j=0;j<y.length;j++){
             if(x[i]==y[j]){
                 System.out.println("Element "+x[i]+" is present in both arrays");
             }
         }
        }

    } 
}