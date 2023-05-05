import java.util.Iterator;

public class Situacao {
    public static Integer obterTotalClientesAtivosStreaming(Streaming streaming) {
        int quantidade = 0;
        for (Cliente cliente: streaming) {
            if (cliente.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer obterTotalClientesStreaming(Streaming streaming) {
        int quantidade = 0;
        for (Iterator<Cliente> cliente = streaming.iterator(); cliente.hasNext();) {
            quantidade++;
            cliente.next();
        }
        return quantidade;
    }
}
