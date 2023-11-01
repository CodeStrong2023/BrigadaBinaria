package domain;
import java.util.Date; // Importa la clase Date

public class Cliente extends Persona{
    //Clase hija de Persona
    private int idCliente;
    private Date fechaRegistro; //debemos importar la clase Date
    private boolean vip; 
    private static int contadorCliente; 

    //Constructor 
    public Cliente(Date fehaRegistro, boolean vip, String nombre,
    char genero, int edad, String direccion){
    super(nombre, genero, edad, direccion);
    this.idCliente = ++Cliente.contadorCliente; 
    this.fechaRegistro = fehaRegistro;
    this.vip=vip;
    }
    //Metodos Getters y Setters
    public int getIdCliente() {
        return this.idCliente;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public boolean isVip() {
        return this.vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); 
        sb.append("Cliente {idCliente=}").append(idCliente); 
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString()); 
        sb.append('}');
        return sb.toString(); 
    }
}