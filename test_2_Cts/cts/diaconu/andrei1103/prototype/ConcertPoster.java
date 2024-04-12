package cts.diaconu.andrei1103.prototype;

public class ConcertPoster implements IPoster{

    private String logo;

    public ConcertPoster() throws InterruptedException {
        System.out.println("Logo generation started....");
        Thread.sleep(2000);
        System.out.println("Logo generation finished....");
        this.logo="CONCERT SHOW";
    }
    @Override
    public void print() {
        System.out.println("Concert Logo : " + logo);
    }

    @Override
    public IPoster clone() {
        ConcertPoster copy = null;
        try {
            copy = new ConcertPoster();
            copy.logo=this.logo;
            return copy;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
