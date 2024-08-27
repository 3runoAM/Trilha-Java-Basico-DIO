public class Iphone implements Telephone, InternetBrowser, MusicPlayer {
    public static void main(String[] args) {
        System.out.println("Boas vindas ao Iphone!");
    }

    @Override
    public void showPage(String url) {
        System.out.println("Mostrando página em %s".formatted(url));
    }

    @Override
    public void addNewTab() {
        System.out.println("Nova tab adicionada ao navegador");
    }

    @Override
    public void refreshPage() {
        System.out.println("Página recarregada");
    }

    @Override
    public void play() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Música selecionada: %s".formatted(music));
    }

    @Override
    public void call(String number) {
        System.out.println("Ligando para: %s".formatted(number));
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void voiceMail() {
        System.out.println("Ouvindo recados");
    }
}