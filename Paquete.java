/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab4, Polimorfismo
 * 17-11-2323
 * @return Paquete
 */

public interface Paquete{
    //Métodos que se deben incluir en todos los tipos de usuarios
    public void reservaViaje();

    public void confirmacionPago();

    public int seleccionAsiento();

    public int cantidadMaletas();

    public void modificarPerfil();
}
