
import java.io.*;
import java.util.Scanner;

public class leerdatos {

    String alias;

    public void Escribir(){

        // Ingresar los datos del usuario

        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un alias");
        alias=entrada.nextLine();
        System.out.println("Ingrese una contraseña");
        String contraseña=entrada.nextLine();

        // Escribir en el archivo

        String nombre_archivo="Base_de_Datos\\"+alias+".txt"; //el archivo tiene el mismo nombre del usuario
        File archivo;
        FileWriter escritor;
        BufferedWriter muestra;
        PrintWriter wr;

        try {
            archivo=new File(nombre_archivo);
            escritor= new FileWriter(archivo);
            muestra=new BufferedWriter(escritor);
            wr=new PrintWriter(muestra);

            wr.append(alias+",");
            wr.append(contraseña);


            wr.close();
            muestra.close();

        } catch (Exception e) {
            System.out.println("Ha susedido un error" + e);
        }
    }

    public String leer(String id){ //Leer los datos del archivo
        String nombre=id;
        String texto="";
        String bf;
        FileReader lector;
        BufferedReader grabar;

        try {

            lector=new FileReader("Base_de_Datos\\"+nombre+".txt");
            grabar=new BufferedReader(lector);
            String datos="";

            while ((bf=grabar.readLine())!=null) {
                datos=bf+datos;
            }
            texto=datos;
            
        } catch (Exception e) {
            System.out.println("El usuario No existe");
        }
        return texto;
    }

}
