package Service;
import java.util.Scanner;
import Models.User;

public class Registro {
    public static void nuevoRegistro(){
        Scanner sca = new Scanner(System.in);

        String nombre, password, correo;    
        System.out.println("Ingresa tu nombre");
        nombre = sca.nextLine();
        System.out.println("Ingresa tu correo");
        correo = sca.nextLine();
        System.out.println("Ingrese su password");
        password = sca.nextLine();

        User e1 = new User();
        e1.setNombre(nombre);
        e1.setPassword(password);
        e1.setCorreo(correo);

    }
}