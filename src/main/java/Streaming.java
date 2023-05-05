import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Streaming implements Iterable<Cliente> {
    private List<Cliente> clientes;

    public Streaming(Cliente... clientes) {
        this.clientes = Arrays.asList(clientes);
    }

    @Override
    public Iterator<Cliente> iterator() {
        return clientes.iterator();
    }
}
