import java.util.Scanner;
class Srfuncion{
public static void main(String []args){
Scanner sca = new Scanner (System.in);
int a, b;
System.out.println("dame un numero");
a = sca.nextInt();
System.out.println("dame otro numero");
b = sca.nextInt();
int rs = a + b;
int rr = a - b;
System.out.println("la suma es:" +rs+ " la resta es:" +rr);
}
public static int Suma (int n1, int n2){
	return n1 + n2;
}
public static int Resta (int n1, int n2){
	return n1 - n2;
}
}
