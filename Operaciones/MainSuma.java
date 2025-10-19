import java.util.Scanner;
class MainSuma{
public static void main (String []args){
Scanner sca = new Scanner (System.in);
    int n1, n2, n3, i=0;
do{
System.out.println("Dame un numero");
n1 = sca.nextInt();
System.out.println("Dame otro numero para sumar");
n2 = sca.nextInt();

Suma e1 = new Suma (n1 , n2);
n3 = e1.Suma ();

System.out.println("El resultado es: " +n3);
System.out.println();
i++;
}while (i<2);
}
}