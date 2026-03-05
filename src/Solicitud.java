public class Solicitud {

    private String nombreInterprete;
    private String fechaSolicitud;
    private String fechaAutorizacion;
    private String companiaGrabacion;

    public Solicitud(String nombreInterprete, String fechaSolicitud, String fechaAutorizacion, String companiaGrabacion) {
        this.nombreInterprete = nombreInterprete;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaAutorizacion = fechaAutorizacion;
        this.companiaGrabacion = companiaGrabacion;
    }
    public boolean validarFechas() {
        return fechaAutorizacion.compareTo(fechaSolicitud) >=0;
    }

    @Override
    public String toString() {
        return "Solicitud de: " + nombreInterprete + ", Compañia: " + companiaGrabacion;
    }
}
