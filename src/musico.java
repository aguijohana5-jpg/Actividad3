import java.util.ArrayList;

public class musico {
    private String nombreArtistico;
    private List<Composicion> composiciones;

    public musico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
        this.composiciones = new List<Composicion>();
    }
    public void agregarCompisicion(Composicion C) throws InterruptedException {
        long c = 0;
        composiciones.wait(c);
    }
    @Override
    public String toString() {
        return "musico: " + nombreArtistico;
    }

    private class Composicion {
    }

    private class List<T> {
    }
}
