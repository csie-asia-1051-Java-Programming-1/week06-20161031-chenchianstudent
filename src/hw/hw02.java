package hw;
import java.util.Scanner;
//���ϥΪ̿�J�ʧO�P�����A�z�L��ƩI�s�A�̾ڨk�k���P, ���o(�L)�p��ÿ�X��з��魫 
//((1)�k�G(����-170)*0.6+62 , (2)�k�G(����-158)*0.5+52)�C
//��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C�Ҧp:��J 1 170 �h��X 62.0, ��J 2 165 �h��X 55.5 

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�J�ʧO(�k1 �k2)");
int s=scn.nextInt();
System.out.print("�п�J����");
int h=scn.nextInt();
fun1(s,h);
	}
	public static void fun1(int s,int h){
if(s==1){
	System.out.print((h-170)*0.6+62);
}else{
	System.out.print((h-158)*0.5+52);
}	
}	
}

