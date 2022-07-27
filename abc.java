import java.util.Scanner;
public class abc
{
       public static boolean isPrime(int x)
{
        for(int i=2;i<x/2;i++)
{
        if(x%i==0)
       return false;
}
return true;
}

public static int countPrime(int[] ar)
{
int count=0;
for(int i=0;i<ar.length;i++)
{
boolean rs = isPrime(ar[i]);
if(rs)
count++;
}
return count;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int ar[] = new int[n];
for(int i=0;i<n;i++)
{
ar[i] = sc.nextInt();
}
int rs=countPrime(ar);
System.out.println(rs);
}
}