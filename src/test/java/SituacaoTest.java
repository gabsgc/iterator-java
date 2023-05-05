import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SituacaoTest {

    @Test
    void deveObterClientesAtivosStreaming() {
        Streaming streaming = new Streaming(
          new Cliente("Mary", true),
          new Cliente("Peter", false),
          new Cliente("James", true)
        );
        assertEquals(2, Situacao.obterTotalClientesAtivosStreaming(streaming));
    }

    @Test
    void deveObterTotalClientesStreaming() {
        Streaming streaming = new Streaming(
                new Cliente("Mary", true),
                new Cliente("Peter", false),
                new Cliente("James", true)
        );
        assertEquals(3, Situacao.obterTotalClientesStreaming(streaming));
    }
}