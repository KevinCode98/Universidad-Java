package Section17_FundamentosJava_Sobrecarga;

import Section16_FundamentosJava_Herencia.Persona;

import java.time.Instant;
import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente() {
    }

    public Cliente(String nombre, char genero, int edad, String direccion,
                   boolean vip) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = Date.from(Instant.now());
        this.vip = vip;
    }

    public Cliente(String nombre, boolean vip) {
        super(nombre);
        this.vip = vip;
        this.fechaRegistro = Date.from(Instant.now());
        this.idCliente = ++Cliente.contadorCliente;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
