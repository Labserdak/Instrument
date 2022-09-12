public class Main {
    public static void main(String[] args) {
        Gitara gitara = new Gitara();
        gitara.struna = 5;
        Baraban baraban = new Baraban();
        baraban.razmer = "Средний";
        Truba truba = new Truba();
        truba.diametr = 12;
        Instrument[] instrument = {gitara, baraban, truba};
        for(int i = 0; i < instrument.length; i++){
            instrument[i].play();
            System.out.println();
        }
    }
}
