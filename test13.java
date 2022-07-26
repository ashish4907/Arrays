class test13{
    public static void main(String[] args){
        int[] x = {12,34,56,78,90};
        int index = 3;
        int[] y ={89,45,67};

       if(index <0 || index > x.length){
            System.out.println("Index out of Range");
        }
        int[] z = new int[x.length+y.length];
        for(int i=0;i<x.length;i++){
            if(i<index){
                z[i] = x[i];
            }
            else{
                z[i+y.length] = x[i];
            }
        }
        for(int i=0;i<y.length;i++){
            z[i+index] = y[i];
        }
        System.out.println("user entered array is");
        for(int i=0;i<z.length;i++){
            System.out.print(z[i]+" ");
        }



    }
}