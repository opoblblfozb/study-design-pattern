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

abstract class Print{
    public abstract void printWeek();
    public abstract void printStrong();
}

class PrintBanner extends Print{
    private Banner banner;
    public PrintBanner(String string){
        this.banner = new Banner(string);
    }
    public void printWeek(){
        banner.showWithParen();
    }
    public void printStrong(){
        banner.showWithAster();
    }
}

class Main{
    public static void main(String[] args){
        Print p = new PrintBanner("HELLO");
        p.printWeek();
        p.printStrong();
    }
}