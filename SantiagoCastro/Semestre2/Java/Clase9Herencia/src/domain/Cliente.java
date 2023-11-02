
package domain;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date registroFecha;
    private boolean vip;
    private static int contadorCliente;
    //Constructores
    public Cliente(Date registroFecha, boolean vip, String nombre,char genero,int edad,String direccion){
        super(nombre,genero,edad,direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.registroFecha = registroFecha;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getRegistroFecha() {
        return this.registroFecha;
    }

    public void setRegistroFecha(Date registroFecha) {
        this.registroFecha = registroFecha;
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
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", registroFecha=").append(registroFecha);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}

