import java.util.Scanner;
class Mdfuncion{
public static void main (String []args){
Scanner sca = new Scanner (System.in);
int a;
System.out.println("**Que deseas hacer?**");
System.out.println("1. Multiplicar");
System.out.println("2. Dividir");
System.out.println("3. salir");
a = sca.nextInt();
	do{
	if (a==3){
	System.out.println("Saliendo...");
	break;
}
	if (a==1){
	System.out.println("Dame un numero");
	int n1 = sca.nextInt();
	System.out.println("Dame otro numero");
	int n2 = sca.nextInt();
	int Multiplicacion = Multiplicacion(n1, n2);
	break;
}
	System.out.println("resultado:" + Multiplicacion);
	if (a==2){
	System.out.println("Dame un numero");
	double n1 = sca.nextInt();
	System.out.println("Dame otro numero");
	double n2 = sca.nextInt();
	double Divicion = Divicion(n1, n2);
	System.out.println("resultado:" +Divicion);
	break;
}
}while(true);
}

public static int Multiplicacion(int n1, int n2){
	return n1 * n2;
}
public static double Divicion(int n1, int n2){
	return n1 / n2;
}
}
