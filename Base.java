import java.util.Random;
import java.util.Scanner;

public class Base extends Usuario implements Paquete {

    Scanner scanner = new Scanner(System.in);

    public void reservaViaje(){

    }

    public void confirmacionPago(){
        System.out.println("Seleccione el numero de cuotas en las que desea pagar el boleto: ");
        int cuotas = scanner.nextInt();
        super.setCuotas(cuotas); 
    }

    public int seleccionAsiento(){
        Random random = new Random();
        int n = random.nextInt(120);
        return n;
    }

    public int cantidadMaletas(){
        return super.getnMaletas();
    }

    public void modificarPerfil(){
        boolean modificar = true;

        while (modificar == true){
            String opcion = scanner.nextLine();
            if(opcion.equals("1")){

            }
        }
    }
    Base(String ususario, String contraseña){
        super(ususario, contraseña);
    }
}
