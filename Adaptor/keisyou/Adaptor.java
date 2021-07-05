class Banner {
    private String string;
    public Banner(String string){
        this.string = string;
    }
    public void showWithParen(){
        System.out.println("(" + string + ")");
    }
    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}

interface Print{
    public abstract void printWeek();
    public abstract void printStrong();
}

class PrintBanner extends Banner implements Print {
    public PrintBanner(String string){
        super(string);
    }
    public void printWeek(){
        showWithParen();
    }
    public void printStrong(){
        showWithAster();
    }
}

class Main{
    public static void main(String[] args){
        Print p = new PrintBanner("HELLO");
        p.printWeek();
        p.printStrong();
    }
}