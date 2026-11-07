public class Aeronave {

    public String solicitarPouso(String mensagem) {
        return TorreDeControle.getInstancia().receberPedidoPouso(mensagem);
    }

    public String solicitarDecolagem(String mensagem) {
        return TorreDeControle.getInstancia().receberPedidoDecolagem(mensagem);
    }

    public String comunicarEmergencia(String mensagem) {
        return TorreDeControle.getInstancia().receberEmergencia(mensagem);
    }

}