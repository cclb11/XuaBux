
import java.util.Scanner;

public class Inicio{

    public static void main(String[] args){

        System.out.println("1.iniciar sesion\n2.Registrarse");

        Scanner decicion=new Scanner(System.in);

        int iniciar=decicion.nextInt();

        if (iniciar==2) { //Envia a registro.java

            registro cuenta=new registro();

            cuenta.crear_cuenta();
        }
        if(iniciar==1){//El archivo ya debe estar creado, va iniciar sesion 

            registro iniciarsesion=new registro();

            System.out.println("Ingrese su ID: ");//El Id es el mismo nombre de el archivo

            Scanner iniciarnombre=new Scanner(System.in);

            String apodo=iniciarnombre.nextLine();

            String perfil=iniciarsesion.iniciar(apodo);//Busca el archivo con el nombre que dio al sistema

            String[] separador=perfil.split(",");

            System.out.println("Ingrese su contraseña: ");

            String contraseña=iniciarnombre.nextLine();

            String comprobar=separador[1];

            if (contraseña.equals(comprobar)){

                System.out.println("Bienvenido a XuaBux");//Abrir el programa
                
            } else {

                System.out.println("Contraseña Equivocada");

            }

        }

        rutas lasrutas=new rutas();

        // System.out.println(lasrutas.leerrutas());
 
    } 

}
