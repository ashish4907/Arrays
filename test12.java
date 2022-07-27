class test12{
    public static void main(String[] args){
        int[] x = {12,45,67,90,45};
        int[] y = {12,45,67,89,45};

        boolean result = true;

        if(x.length == y.length){
            for(int i=0;i<x.length;i++){
                if(x[i] != y[i]){
                    result = false;
                }
            }
        }
        else{
            result = false;
        }
        if(result==true){
            System.out.println("Both arrays are equal");
        }
        else{
            System.out.println("Both arrays are not equal");
            System.out.println("hello");
        }

    
    }

} 