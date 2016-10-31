package hw;
import java.util.Scanner;
//請設計一個函數fun(v1, type)，讓使用者輸入一個溫度值及計算方式
//(type 為1 時 華氏->攝氏，type為2時攝氏->華氏)，函數算出結果後要回傳至主程式再印出結果。
//(F=C*9/5+32), (C = (F-32) * (5/9)，例如輸入100 1 則輸出 37.77778; 輸入 37.77778 2 時則輸出 100.0

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入溫度");
float v1=scn.nextFloat();
System.out.print("華氏轉攝氏(1)或是攝氏轉華氏(2)");
int type=scn.nextInt();
fun1(v1,type);
}
public static void fun1(float v1,int type){
	if(type==1){
		System.out.print(v1*9/5+32);
	}else{
		System.out.print((v1-32)*(5/9));
	}
	
	}	
}

