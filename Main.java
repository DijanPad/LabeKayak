import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
public static void main(String[] args){
        ArrayList<Usuario> ususarios = new ArrayList<Usuario>();

        //variables de setteo
        boolean run = true;

        String database = "airplanes.csv";
        String menu = "Aerolinea XD"+"\n"+
        "1. Crear ususario\n" + 
        "2. iniciar sesion"+"\n"+
        "3. Salir";

        Scanner scanner = new Scanner(System.in);
        
try (BufferedReader br = new BufferedReader(new FileReader(database))) {
                String encabezado = br.readLine();
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] valores = linea.split(",");
                    
                    // Extraer los valores del CSV
                    String type = valores[0];
                    String usuario = valores[1];
                    String contrasena = valores[2];
                    String fecha = valores[3];
                    boolean ida = (valores[4].equals("true")) ? true : false;
                    boolean vuelta = (valores[5].equals("true")) ? true : false;
                    int nBoletos = Integer.parseInt(valores[6]);
                    String aerolinea = valores[7]; 
                    String numeroDeTarjeta = valores[8];
                    int cuotas = Integer.parseInt(valores[9]);
                    String claseVuelo = valores[10]; 
                    int nAsiento = Integer.parseInt(valores[10]);
                    int nMaletas = Integer.parseInt(valores[11]);
                    
                    //clasificar por objeto
                    if ("B".equals(type)) {
                        
                        Base usuari = new Base(usuario, contrasena);
                        usuari.setAerolinea(aerolinea);
                        usuari.setFecha(fecha);
                        usuari.setIda(ida);
                        usuari.setVuelta(vuelta);
                        usuari.setnBoletos(nBoletos);
                        usuari.setNumeroDeTarjeta(numeroDeTarjeta);
                        usuari.setCuotas(cuotas);
                        usuari.setClaseVuelo(claseVuelo);
                        usuari.setnAsiento(nAsiento);
                        usuari.setnMaletas(nMaletas);
                        ususarios.add(usuari);

                    } else if ("P".equals(type)) {
                        
                        Premium usuari = new Premium(usuario, contrasena);
                        usuari.setAerolinea(aerolinea);
                        usuari.setFecha(fecha);
                        usuari.setIda(ida);
                        usuari.setVuelta(vuelta);
                        usuari.setnBoletos(nBoletos);
                        usuari.setNumeroDeTarjeta(numeroDeTarjeta);
                        usuari.setCuotas(cuotas);
                        usuari.setClaseVuelo(claseVuelo);
                        usuari.setnAsiento(nAsiento);
                        usuari.setnMaletas(nMaletas);
                        ususarios.add(usuari);}

                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        while(run == true){
            System.out.println(menu);
            System.out.println("Ingrese una opcion: ");
            String opcion = scanner.nextLine();
            if(opcion.equals("1")){
            System.out.println("Modo Registro:");
                System.out.println("Ingrese su usuario: ");
                String user = scanner.nextLine();
                System.out.println("Ingrese su Contrasena: ");
                String password = scanner.nextLine();
                System.out.println("Elija su clase: \n 1.Base\n2.Premium");
                    String choice = scanner.nextLine();
                    boolean flag = false;

                    while (flag == false){
                    if(choice.equals("1")){
                        Base usuari = new Base(user, password);
                        ususarios.add(usuari);
                        flag = true;
                    }if(choice.equals("2")){
                        Premium usuari = new Premium(user, password);
                        ususarios.add(usuari);
                        flag = true;
                    }}
                System.out.println("Su usuario se ha creado exitosamente");
                    


            }if(opcion.equals("2")){
            System.out.println("Iniciar Sesion:");
                System.out.println("Ingrese su usuario: ");
                String user = scanner.nextLine();
                System.out.println("Ingrese su Contrasena: ");
                String password = scanner.nextLine();

                for (int j = 0; j<ususarios.size(); j++){
                if(user.equals(ususarios.get(j).getUsusario()) && password.equals(ususarios.get(j).getContraseña())){
                    Boolean trap = true;
                    while(trap == true){
                        System.out.println("Aerolinea XD"+"\n"+
        "1. Modo reservas\n" + 
        "2. Modo Confirmacion"+"\n"+
        "3. Modoperfil"+"\n"+
        "4. Salir");
                    String pick = scanner.nextLine();
                    if(pick.equals("1")){
                        if(ususarios.get(j) instanceof Base){
                        ((Base)ususarios.get(j)).reservaViaje();
                    }if(ususarios.get(j) instanceof Premium){
                        ((Premium)ususarios.get(j)).reservaViaje();
                    }
                    }if(pick.equals("2")){
                        if(ususarios.get(j) instanceof Base){
                        ((Base)ususarios.get(j)).confirmacionPago();
                    }if(ususarios.get(j) instanceof Premium){
                        ((Premium)ususarios.get(j)).confirmacionPago();
                    }
                    }if(pick.equals("3")){
                        if(ususarios.get(j) instanceof Base){
                        ((Base)ususarios.get(j)).modificarPerfil();
                    }if(ususarios.get(j) instanceof Premium){
                        ((Premium)ususarios.get(j)).modificarPerfil();
                    }
                    }if(pick.equals("4")){
                        trap = false;
                    }
                    }
                }}

            }if(opcion.equals("3")){
            System.out.println("Adios!");
            }else{
                run = true;
            }
            try (FileWriter writer = new FileWriter(database)) {
            
                writer.write("type,usuario,contrasena,fecha,ida,vuelta,nBoletos,aerolinea,numeroDeTarjeta,cuotas,claseVuelo,nAsiento,nMaletas\n");
                
                for (int i = 0; i <ususarios.size(); i++) {
                
                if(ususarios.get(i) instanceof Base){
                    writer.write("B" + ","+
                    ususarios.get(i).getAerolinea() + ","+
                    ususarios.get(i).getFecha() + ","+
                    ususarios.get(i).isIda() + ","+
                    ususarios.get(i).isVuelta() + ","+
                    ususarios.get(i).getnBoletos() + ","+
                    ususarios.get(i).getNumeroDeTarjeta() + ","+
                    ususarios.get(i).getCuotas() + ","+
                    ususarios.get(i).getClaseVuelo() + ","+
                    ususarios.get(i).getnAsiento() + ","+
                    ususarios.get(i).getnMaletas()+ "," +
                    "\n" );
                }
                if(ususarios.get(i) instanceof Premium){
                    writer.write("B" + ","+
                    ususarios.get(i).getAerolinea() + ","+
                    ususarios.get(i).getFecha() + ","+
                    ususarios.get(i).isIda() + ","+
                    ususarios.get(i).isVuelta() + ","+
                    ususarios.get(i).getnBoletos() + ","+
                    ususarios.get(i).getNumeroDeTarjeta() + ","+
                    ususarios.get(i).getCuotas() + ","+
                    ususarios.get(i).getClaseVuelo() + ","+
                    ususarios.get(i).getnAsiento() + ","+
                    ususarios.get(i).getnMaletas()+ "," +
                    "\n" );
                }
            } 
            }catch (IOException e) {
                e.printStackTrace();
                System.out.println("Ocurrio un error al guardar en " + database +"\n");
            }
        }
}
}
