
public class rutas {

    public String leerrutas(){

        leerdatos verrutas=new leerdatos();

        String lista=verrutas.leer("rutas\\noroccidente");
        
        return lista;
    }
    
}
