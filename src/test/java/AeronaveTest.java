import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AeronaveTest {

    @Test
    void deveSolicitarPouso() {
        Aeronave aeronave = new Aeronave();
        assertEquals("A Torre de Controle recebeu seu contato.\nA Pista respondeu sua solicitacao conforme mensagem a seguir.\n" +
                        ">>A Pista esta livre, pouso autorizado para: Voo LA123",
                aeronave.solicitarPouso("Voo LA123"));
    }

    @Test
    void deveSolicitarDecolagem() {
        Aeronave aeronave = new Aeronave();
        assertEquals("A Torre de Controle recebeu seu contato.\nA Pista respondeu sua solicitacao conforme mensagem a seguir.\n" +
                        ">>A Pista esta livre, decolagem autorizada para: Voo AD456",
                aeronave.solicitarDecolagem("Voo AD456"));
    }

    @Test
    void deveComunicarEmergencia() {
        Aeronave aeronave = new Aeronave();
        assertEquals("A Torre de Controle recebeu seu contato.\nA Pista respondeu sua solicitacao conforme mensagem a seguir.\n" +
                        ">>A Pista foi liberada com prioridade para a emergencia: Voo G3789 com falha no motor",
                aeronave.comunicarEmergencia("Voo G3789 com falha no motor"));
    }

}