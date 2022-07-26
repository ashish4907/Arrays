class test9{
     public static void main(String[] args){
        int[] x = {12,2,38,84,25};
        int element = 34;
        int index = 3;

        if(index <0 || index > x.length){
            System.out.println("Index out of Range");
        }
        int[] y = new int[x.length+1];
        y[index] = element;

        for(int i=0;i<x.length;i++){
            if(i<index){
                y[i] = x[i];
            }
            else{
                y[i+1] = x[i];
            }
        }
        System.out.println("user entered array is");
        for(int i=0;i<y.length;i++){
            System.out.print(y[i]+" ");
        }
     }
}