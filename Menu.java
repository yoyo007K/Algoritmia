import java.util.Scanner;
class Menu{
public static void main(String []args){
Scanner sca = new Scanner(System.in);
//2.	boolean val = true;
//2.	while(val){int opt;
while(true){int opt;
try{
System.out.println("Que hacer?");
System.out.println("1.Un saludo");
System.out.println("2.Despedida");
System.out.println("3.Salir");
System.out.println("______________");
opt = sca.nextInt();
switch(opt){
	case 1:
	System.out.println("Hola");
//1.	System.exit(0);
	break;

	case 2:
	System.out.println("Adios");
//2.	val = false;
	break;

	case 3:
	System.out.println("Saliendo...");
	break;

	default:
	break;
}
//3.	if(opt==3){
//3.	break;
//3.	}
}catch(Exception e){
System.out.println("Error");
}
}
}
}
