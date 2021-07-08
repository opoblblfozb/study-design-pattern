package templatemethod;

import jdk.dynalink.support.AbstractRelinkableCallSite;

abstract class AbstractDisplay{
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display(){
        open();
        for (int i=0; i < 5; i++){
            print();
        }
        close();
    }
}

class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch){
        this.ch = ch;
    }
    public void open(){
        System.out.print("<<");
    }
    public void  print() {
        System.out.print(ch);
    }
    public void close(){
        System.out.println(">>");
    }
}

class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;
    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }
    public void open(){
        printLine();
    }
    public void print(){
        System.out.println("|" + string + "|");
    }
    public void close(){
        printLine();
    }
    private void printLine(){
        System.out.print("+");
        for (int i=0; i < width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}

class Main {
    public static void main(String[ ] args){
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("HELLO, WORLD");
        AbstractDisplay d3 = new StringDisplay("こんちには，　世界");

        d1.display();
        d2.display();
        d3.display();
    }
}