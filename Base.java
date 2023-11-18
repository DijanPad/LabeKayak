/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab4, Polimorfismo
 * 17-11-2323
 * @return Base
 */

import java.util.Random;
import java.util.Scanner;

public class Base extends Usuario implements Paquete {

    Scanner scanner = new Scanner(System.in);


    //bucles y validaciones
    public void boo() {
        boolean a = true;
        while (a == true) {
            System.out.println("Viaje de ida: \n" +
                    " 1.Si \n" +
                    " 2.No  ");
            String op = scanner.nextLine();
            
            if (op.equals("1")) {
                super.setIda(true);
                a = false; 
            } else if (op.equals("2")) {
                super.setIda(false);
                a = false; 
            } else {
                System.out.println("Ingrese una opcion valida");
            }
        }
    }
    public void boo3() {
        boolean a = true;
        while (a == true) {
            System.out.println("Viaje de vuelta: \n" +
                    " 1.Si \n" +
                    " 2.No  ");
            String op = scanner.nextLine();
            
            if (op.equals("1")) {
                super.setVuelta(true);
                a = false; 
            } else if (op.equals("2")) {
                super.setVuelta(false);
                a = false; 
            } else {
                System.out.println("Ingrese una opcion valida");
            }
        }
    }

    public void boo2() {
        boolean a = true;
        while (a == true) {
            System.out.println("En que clase desea volar: \n" +
                    " 1.Coach\n" +
                    " 2.Primera clase  ");
            String op = scanner.nextLine();
            
            if (op.equals("1")) {super.setClaseVuelo("Coach");
                super.setIda(true);
                a = false; 
            } else if (op.equals("2")){super.setClaseVuelo("Primera Clase"); 
                a = false; 
            } else {
                System.out.println("Ingrese una opcion valida");
            }
        }
    }
    
   
//metodos interfaz
    public void reservaViaje(){
        System.out.println("ingrese la fecha de su viaje: ");
        String fecha = scanner.nextLine();
        super.setFecha(fecha); 
        boo();
        boo3();
        System.out.println("Ingrese la cantidad de boletos: ");
        int nBol = scanner.nextInt();
        super.setnBoletos(nBol); 
        System.out.println("Ingrese Su aereolina: ");
        String aerolinea = scanner.nextLine();
        super.setAerolinea(aerolinea);
    }

    public void confirmacionPago(){
        System.out.println("ingrese su numero de tarjeta: ");
        String tarjeta = scanner.nextLine();
        super.setNumeroDeTarjeta(tarjeta);
        System.out.println("Seleccione el numero de cuotas en las que desea pagar el boleto: ");
        int cuotas = scanner.nextInt();
        super.setCuotas(cuotas); 
        boo2();
        System.out.println("|"+ super.getFecha() + " |"+ super.isIda()+ " |"+ super.isVuelta()+ " |"+ super.getnBoletos() + " |"+ super.getAerolinea()+ " |"+super.getCuotas());
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
            
            System.out.println("Perfil:  \n 1.Modificar cliente \n 2.Aplicar cupon \n 3.Salir" );
            String opcion = scanner.nextLine();
            if(opcion.equals("1")){
                System.out.println("te has vuelto Premium!");
                trunPremium();
            }
            if(opcion.equals("2")){
                System.out.println("Cupon aplicado");
            }
            if(opcion.equals("3")){
                modificar = false;
            }
        }
    }
    public Base(String ususario, String contraseña){
        super(ususario, contraseña);
    }

    public Premium trunPremium(){
        Premium premium = new Premium(this.ususario,this.contraseña);
        return premium; //funcion definida 
    }
}
