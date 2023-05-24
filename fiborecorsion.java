import java.util.*;
public class fiborecorsion {
    static int n;
void fibo(int N){

    int a=0,b=0;
    int c=0;
    if (N==0)
    System.out.println(c);

    else
    c=a+b;
    System.out.println(c);
a=b;
b=c;
b++;

fibo(N--);
}
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();




    
}
}
