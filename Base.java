import java.util.Random;
import java.util.Scanner;

public class Base extends Usuario implements Paquete {

    Scanner scanner = new Scanner(System.in);

    public void boo() {
        System.out.println("Viaje de ida: \\n" + //
                " 1.Si \\n" + //
                " 2.No  ");
        String op = scanner.nextLine();
        if (op.equals("1")){super.setIda(true); }
        if (op.equals("2")){super.setIda(false); }
        else{boo();}
    }

    public void boo3() {
        System.out.println("Viaje de ida: \\n" + //
                " 1.Si \\n" + //
                " 2.No  ");
        String op = scanner.nextLine();
        if (op.equals("1")){super.setVuelta(true); }
        if (op.equals("2")){super.setVuelta(false); }
        else{boo3();}
    }

    public void boo2() {
        System.out.println("Clase de vuelo: \n 1.Coach \n 2.Primera clase ");
        String op = scanner.nextLine();
        if (op.equals("1")){super.setClaseVuelo("Coach"); }
        if (op.equals("2")){super.setClaseVuelo("Primera Clase"); }
        else{boo2();}
    }

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
            String opcion = scanner.nextLine();
            System.out.println("Perfil:  \n 1.Modificar cliente \n 2.Aplicar cupon" );
            if(opcion.equals("1")){
                
            }
            if(opcion.equals("2")){
                System.out.println("Cupon aplicado");
            }
        }
    }
    public Base(String ususario, String contraseña){
        super(ususario, contraseña);
    }
}
