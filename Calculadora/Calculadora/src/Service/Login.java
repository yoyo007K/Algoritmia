package Service;
import java.util.Scanner;
import Models.User;

public class Login {
    public static void nuevoLogin(){
        Scanner sca = new Scanner(System.in);

        String correo, password;
        System.out.println("Dame tu correo:");
        correo = sca.nextLine();
        System.out.println("Dame tu password:");
        password = sca.nextLine();

        if(e1.equals(correo) && e1.equals (password)){
                System.out.println("BIENVENIDO");
        }else{
            System.out.println("No eres el de la cuenta");
            
        User e2 = new User();
        e2.setCorreo(correo);
        e2.setPassword(password);
        }
    }
}

