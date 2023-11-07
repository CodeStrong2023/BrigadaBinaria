package domain;

import java.util.Date;

public class Cliente extends Persona {
    //Atributos 
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    //cosntructor
    public  Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion){
        super(nombre, genero,edad,direccion);
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
      private static int contadorCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    public Cliente setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
        return this;
    }

    public boolean isVip() {
        return vip;
    }

    public Cliente setVip(boolean vip) {
        this.vip = vip;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(",  ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
