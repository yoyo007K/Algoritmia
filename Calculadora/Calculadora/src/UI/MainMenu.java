package UI;
import Service.Registro;
import Service.Login;
import java.util.Scanner;
public class MainMenu {
public static void Menu(){

    
int opt;
Scanner sca = new Scanner(System.in);
while (true){
try{
    System.out.println("|||||BIENVENIDO|||||");
    System.out.println("_____________________________________");
    System.out.println("0.Salir ");
    System.out.println("1.Registrarce");
    System.out.println("2.Iniciar secion con una cuenta ya creada");
    System.out.println("_____________________________________");

    System.out.println("Que deseas hacer");
    opt = sca.nextInt();
    sca.nextLine();
switch (opt) {
    case 0:
        System.out.println("Saliendo...");
        System.exit(0);
        break;
    case 1:
        Registro.nuevoRegistro();
        break;
    case 2:
        Login.nuevoLogin();
        System.out.println("Hola");
        break;
    default:
        System.out.println("Esta opcion no es compatible");
        break;
}
}catch(Exception e){
    System.out.println("Error");
    
}
}
}
}
