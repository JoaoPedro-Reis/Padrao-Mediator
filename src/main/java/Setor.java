public interface Setor {
    String receberPedidoPouso(String mensagem);
    String receberPedidoDecolagem(String mensagem);
    String receberEmergencia(String mensagem);
}