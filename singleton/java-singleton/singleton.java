class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("インスタンスを生成しました");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}

class Main {
    public static void main(String[] args) {
        Singleton objex;
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンス");
        } else {
            System.out.println("obj１とobj2は違うインスタンス");
        }
        System.out.println("End.");
    }
}