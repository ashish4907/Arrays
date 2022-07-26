class test8{
    public static void main(String[] args){
        int[] x = {12,13,49,69,89};
        int[] y = {16,45,67,90,100};

        int[] z = new int[x.length+y.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<x.length && j<y.length){
            if(x[i]<y[j]){
                z[k++] =x[i++];
            }
            else{
                z[k++] =y[j++];
            }
        }
        while(i<x.length){
            z[k++] = x[i++];
        }
        while(j<y.length){
            z[k++] = y[j++];
        }
        System.out.println("Merged array is");
        for(int l=0;l<z.length;l++){
            System.out.print(z[l]+" ");
        }


    }
}