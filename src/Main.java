public class Main {
    public static void main(String[] args) {
        Home home = new Home("Manas 344");
        GrandFather grandFather = new GrandFather("Jusup", 80, home, HobbyEnum.GARDENING);
        System.out.println(grandFather.getInfo());
        System.out.println("\n");
        Father father = new Father("Musa", 49, home, HobbyEnum.READING_BOOKS, "Teacher");
        System.out.println(father.getInfo());
        father.goWork();
        father.goWork("в 8 утра");
        System.out.println("\n");
        Son son = new Son("Isa", 18, home, HobbyEnum.PAINTING, "waiter", "KGTU");
        System.out.println(son.getInfo());
        son.goWork("after university");
        System.out.println("\n");
        Son son1 = new Son("Usman", 20, home, HobbyEnum.PLAYING_BOARD_GAMES, "taxi", "MANAS");
        System.out.println(son1.getInfo());
        son1.goWork("after university");
    }

    }
