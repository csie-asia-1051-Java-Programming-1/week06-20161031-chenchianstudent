package ex;
import java.util.Scanner;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021007 陳麒安
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入m");
long m=scn.nextLong();
System.out.print("請輸入n");
long n=scn.nextLong();
long k=m-n;

fun1(m);
fun2(n);
fun3(k);
long fun4=fun1(m)/(fun2(n)*fun3(k));
System.out.print(fun4);
	}
public static long fun1(long m){
	long x=1;
	
	for(long i=m;i>0;i--){
	x*=i;
	}
	return x;
}
public static long fun2(long n){
	long y=1;
	for(long i=n;i>0;i--){
	y*=i;	
	}
	return y;
}
public static long fun3(long k){
	long s=1;
for(long i=k;i>0;i--){
	s*=i;
}
return s;
}

}
