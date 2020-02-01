public class Main {
    public static void main(String[] args) {
        Putable cola1 = new Cilindricheskoe("Koka-Kola");
        Putable cola2 = new Cilindricheskoe("Koka-Kola");
        Putable water = new Cilindricheskoe("Aksu");

        Krugloe[] apple1 = new Krugloe[20];
        for(int i = 0; i < 50; i++){
            apple1[i] = new Krugloe("Apple");
        }
        Krugloe[] apple2 = new Krugloe[10];
        for(int i = 0; i < 10; i++){
            apple2[i] = new Krugloe("Apple");
        }
        Krugloe[] balls = new Krugloe[50];
        for(int i = 0; i < 50; i++){
            balls[i] = new Krugloe("Balls");
        }

        Putable book = new Ploskoe("Kniga");
        Putable papka = new Ploskoe("papka");
        Putable papka2 = new Ploskoe("papka");

        Bag bag1 = new Bag(cola1, book, apple1);
        Bag bag2 = new Bag(water, papka, balls);
        Bag bag3 = new Bag(cola2, papka2, apple2);
    }
}
