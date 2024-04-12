package cts.diaconu.andrei1103.prototype;

public class StandupPoster implements IPoster{
    @Override
    public void print() {
        System.out.println("Standup Logo");
    }

    @Override
    public IPoster clone() {
        return new StandupPoster();
    }
}
