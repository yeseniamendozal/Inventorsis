package pe.com.inventorsis.models;

public class Guias {

    private String correlativo;
    private String descripcion;
    private String tipo;
    private String fecha;
    private String estado;

    public Guias(String correlativo, String descripcion, String tipo, String fecha, String estado) {
        this.correlativo = correlativo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fecha = fecha;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Guias{" +
                "correlativo='" + correlativo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
