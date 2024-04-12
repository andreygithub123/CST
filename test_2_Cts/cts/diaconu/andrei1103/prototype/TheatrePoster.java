package cts.diaconu.andrei1103.prototype;

public class TheatrePoster implements IPoster{

    String logo;

    public  TheatrePoster() throws InterruptedException {
        System.out.println("Generating logo for theatre");
        Thread.sleep(20000);
        System.out.println("Logo generated");
        this.logo=" Theathre Logo ";
    }
    @Override
    public void print() {
        System.out.println("Theatre Logo: "+logo);
    }

    @Override
    public IPoster clone() {
        TheatrePoster copy=null;
        try {
             copy = new TheatrePoster();
             copy.logo=this.logo;
             return copy;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
