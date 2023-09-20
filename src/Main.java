public class Main {
    public static void main(String[] args) {
        ReprodutorMusical player = new ReprodutorMusical();
        player.tocar();
        player.pausar();
        player.selecionarMusica();

        AparelhoTelefonico phone = new AparelhoTelefonico();
        phone.ligar();
        phone.atender();

        Browser browser = new Browser();
        browser.atualizarPagina();
        browser.adicionarNovaAba();
    }
}