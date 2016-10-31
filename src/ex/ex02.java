package ex;
import java.util.Scanner;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入m");
long m=scn.nextLong();
System.out.print("請輸入n");
long n=scn.nextLong();

fun1(m,n);

	}
public static void fun1(long m,long n){
Scanner scn=new Scanner(System.in);	

long v=m-n;
long sum=1;
long sum1=1;
long sum2=1;
for(int i=1;i<=m;i++){
sum=sum*i;
}
for(int j=1;j<=n;j++){
sum1=sum1*j;	
}
for(int k=1;k<=v;k++){
sum2=sum2*k;	
}
long ans = sum/(sum1*sum2);
System.out.print(ans);
}

}
