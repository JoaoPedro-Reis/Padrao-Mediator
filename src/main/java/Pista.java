public class Pista implements Setor {

    private static Pista instancia = new Pista();

    private Pista() {}

    public static Pista getInstancia() {
        return instancia;
    }

    public String receberPedidoPouso(String mensagem) {
        return "A Pista esta livre, pouso autorizado para: " + mensagem;
    }

    public String receberPedidoDecolagem(String mensagem) {
        return "A Pista esta livre, decolagem autorizada para: " + mensagem;
    }

    public String receberEmergencia(String mensagem) {
        return "A Pista foi liberada com prioridade para a emergencia: " + mensagem;
    }
}