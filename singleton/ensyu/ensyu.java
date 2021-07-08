public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker instance = new TicketMaker();

    private TicketMaker() {
        System.out.println("インスタンスを作成");
    }

    public static TicketMaker getinstance() {
        return instance;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}

public class Main {
    public static void main(String[] args) {
        TicketMaker maker1 = TicketMaker.getinstance();
        TicketMaker maker2 = TicketMaker.getinstance();
        System.out.println(maker1.getNextTicketNumber());
        System.out.println(maker2.getNextTicketNumber());
        System.out.println(maker1.getNextTicketNumber());
    }
}