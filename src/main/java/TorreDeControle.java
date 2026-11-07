public class TorreDeControle {

    private static TorreDeControle instancia = new TorreDeControle();

    private TorreDeControle() {}

    public static TorreDeControle getInstancia() {
        return instancia;
    }

    public String receberPedidoPouso(String mensagem) {
        return "A Torre de Controle recebeu seu contato.\n" +
                "A Pista respondeu sua solicitacao conforme mensagem a seguir.\n" +
                ">>" + Pista.getInstancia().receberPedidoPouso(mensagem);
    }

    public String receberPedidoDecolagem(String mensagem) {
        return "A Torre de Controle recebeu seu contato.\n" +
                "A Pista respondeu sua solicitacao conforme mensagem a seguir.\n" +
                ">>" + Pista.getInstancia().receberPedidoDecolagem(mensagem);
    }

    public String receberEmergencia(String mensagem) {
        return "A Torre de Controle recebeu seu contato.\n" +
                "A Pista respondeu sua solicitacao conforme mensagem a seguir.\n" +
                ">>" + Pista.getInstancia().receberEmergencia(mensagem);
    }

}