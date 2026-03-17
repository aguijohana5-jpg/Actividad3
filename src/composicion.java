import java.util.ArrayList;

public class composicion {
   String titulo;
    int duracionMinutos;
    int duracionSegundos;
    String generoMusical;
    String fechaRegistro;
    String fechaEstreno;

    ArrayList<Solicitud> listaSolicitudes = new ArrayList<>();

    public composicion(String t, int m, int s, String g, String fr, String fe) {
        titulo = t;
        duracionMinutos = m;
        duracionSegundos = s;
        generoMusical = g;
        fechaRegistro = fr;
        fechaEstreno = fe;
    }

    public void agregarSolicitud(Solicitud s) {
        listaSolicitudes.add(s);
    }

    public int obtenerDuracionTotal() {
        return duracionMinutos * 60 + duracionSegundos;
    }
}
