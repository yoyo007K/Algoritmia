import java.util.Scanner;
public class menuBienvenido {

    public static void main(String [] args){
        Scanner sca = new Scanner(System.in);
        String nombre, edad, correo, hobbie, escuela, estado;
        System.out.println("||BIENVENIDO    XD||");
        System.out.println("Cual es tu nombre?");
        nombre = sca.nextLine();
        System.out.println("Cual es tu edad?");
        edad = sca.nextLine();
        System.out.println("Cual es correo?");
        correo = sca.nextLine();
        System.out.println("Cual es tu hobbie?");
        hobbie = sca.nextLine();
        System.out.println("Cual es tu escuela?");
        escuela = sca.nextLine();
        System.out.println("Cual es tu estado civil?");
        estado = sca.nextLine();
        String [] a = {nombre, edad, correo, hobbie, escuela, estado};
        System.out.println(a);
        for (int i = 0; i<a.length;i++){
            System.out.println(a[i]);

        }
    }

}
