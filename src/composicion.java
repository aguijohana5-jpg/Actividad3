import java.util.ArrayList;
import java.util.List;

public class composicion {
    private String titulo;
    private int duracionMinutos;
    private int duracionSegundos;
    private String generoMusical;
    private String fechaRegistro;
    private String fechaEstreno;
    private List<Solicitud> listaSolicitudes;
    public composicion(String titulo,int duracionMinutos, int duracionSegundos, String generoMusical, String fechaRegistro, String fechaEstreno) {

        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.duracionSegundos = duracionSegundos;
        this.generoMusical = generoMusical;
        this.fechaRegistro = fechaRegistro;
        this.fechaEstreno = fechaEstreno;
        this.listaSolicitudes = new ArrayList<>();
    }
    public void agregarSolicitud(Solicitud s) {
        if (s.validarFechas()) {
            listaSolicitudes.add(s);
        }
    }
    public void eliminarSolicitud(Solicitud s) {
        listaSolicitudes.remove(s);
    }
    public int obtenerDuracionTotal() {
        return (duracionMinutos * 60) + duracionSegundos;
    }
    @Override
    public String toString() {
        return "Composicion: " + titulo + ", Duracion total (seg): " + obtenerDuracionTotal();
    }

    private class Solicitud {
        public boolean validarFechas() {
        }
    }
}
