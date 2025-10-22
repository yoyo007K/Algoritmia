package UI;
import Service.Registro;
import java.util.Scanner;
public class MainMenu {
public static void Menu(){

    System.out.println("|||||BIENVENIDO|||||");
    System.out.println("_____________________________________");
    System.out.println("0.Registrarce ");
    System.out.println("1.Iniciar con una cuenta ya creada");
    System.out.println("2.Salir");
    System.out.println("-------------------------------------");

int opt;
Scanner sca = new Scanner(System.in);
System.out.println("Que deseas hacer");
opt = sca.nextInt();
switch (opt) {
    case 0:
        Registro.nuevoRegistro();
        break;
    case 1:

        break;
    case 2:
        break;
    
    default:
        break;
}

}
}
