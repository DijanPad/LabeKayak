/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab4, Polimorfismo
 * 17-11-2323
 * @return Premium
 */


//jajaja este no lo hago B)
import java.util.Random;

public class Premium extends Usuario implements Paquete {
    public void reservaViaje(){
        
        System.out.println("Funcion de Premium");
    }
    
    public void confirmacionPago(){
        
        System.out.println("Funcion de Premium");
    }

    public int seleccionAsiento(){
        System.out.println("Funcion de Premium");
        Random random = new Random();
        int n = random.nextInt(120);
        return n;
    }

    public int cantidadMaletas(){
        System.out.println("Funcion de Premium");
        return super.getnMaletas();
    }

    public void modificarPerfil(){
        
        System.out.println("Funcion de Premium");
    }

    public Premium(String ususario, String contraseña){
        super(ususario, contraseña);
    }
}
