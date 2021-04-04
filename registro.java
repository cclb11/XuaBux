
public class registro {
    
    public void crear_cuenta(){

        leerdatos registrarse=new leerdatos();

        registrarse.Escribir(); //llama al metodo escribir() en leerdatos.java

    }

    public String iniciar(String b){

        leerdatos iniciar=new leerdatos();//abre el archivo que tiene el mismo nombre de el usuario

        return iniciar.leer(b);
    }

}
