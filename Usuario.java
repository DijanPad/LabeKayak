/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab4, Polimorfismo
 * 17-11-2323
 * @return Usuario
 */

public class Usuario {
    
    //atributos
protected String fecha;
protected boolean ida;
protected boolean vuelta; 
protected int nBoletos;
protected String aerolinea;
protected String numeroDeTarjeta;
protected int cuotas;
protected String claseVuelo;
protected int nAsiento;
protected int nMaletas;
protected String ususario;
protected String contraseña;


//constructor (reducido por temas de "creacion de usuario nuevo")
public Usuario(String ususario, String contraseña) {
    this.ususario = ususario;
    this.contraseña = contraseña;
}


//metodos (osea solo setters y getters)
public String getFecha() {
    return fecha;
}
public void setFecha(String fecha) {
    this.fecha = fecha;
}
public boolean isIda() {
    return ida;
}
public void setIda(boolean ida) {
    this.ida = ida;
}
public boolean isVuelta() {
    return vuelta;
}
public void setVuelta(boolean vuelta) {
    this.vuelta = vuelta;
}
public int getnBoletos() {
    return nBoletos;
}
public void setnBoletos(int nBoletos) {
    this.nBoletos = nBoletos;
}
public String getAerolinea() {
    return aerolinea;
}
public void setAerolinea(String aerolinea) {
    this.aerolinea = aerolinea;
}
public String getNumeroDeTarjeta() {
    return numeroDeTarjeta;
}
public void setNumeroDeTarjeta(String numeroDeTarjeta) {
    this.numeroDeTarjeta = numeroDeTarjeta;
}
public int getCuotas() {
    return cuotas;
}
public void setCuotas(int cuotas) {
    this.cuotas = cuotas;
}
public String getClaseVuelo() {
    return claseVuelo;
}
public void setClaseVuelo(String claseVuelo) {
    this.claseVuelo = claseVuelo;
}
public int getnAsiento() {
    return nAsiento;
}
public void setnAsiento(int nAsiento) {
    this.nAsiento = nAsiento;
}
public int getnMaletas() {
    return nMaletas;
}
public void setnMaletas(int nMaletas) {
    this.nMaletas = nMaletas;
}
public String getUsusario() {
    return ususario;
}
public void setUsusario(String ususario) {
    this.ususario = ususario;
}
public String getContraseña() {
    return contraseña;
}
public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
}



}
