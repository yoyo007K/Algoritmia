import java.util.Scanner;
class MainUser{
public static void main(String []args){
Scanner sca = new Scanner(System.in);

System.out.println("Dame tu nombre");
String nombre = sca.nextLine();
System.out.println("Dame tu edad");
int edad = sca.nextInt();
sca.nextLine();
System.out.println("Dame tu correo");
String correo = sca.nextLine();


Usuario e1 = new Usuario (nombre, edad, correo);

e1.setNombre(nombre);
e1.setEdad(edad);
e1.setCorreo(correo);
System.out.println("Nombre:" +e1.getNombre()+ " ||Edad:" +e1.getEdad()+ " ||Correo:" +e1.getCorreo());
}
}
