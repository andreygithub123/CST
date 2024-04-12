package cts.diaconu.andrei1103.builder;

public class GamingSystemBuilder implements IGamingSystemBuilder{

    private IGamingSystem gamingSystem;

    public GamingSystemBuilder(){
        this.gamingSystem = new GamingSystem();
    }
    @Override
    public void buildMotherboard() {
        this.gamingSystem.setMotherboard("Gaming System Motherboard");
    }

    @Override
    public void buildRAM() {
        this.gamingSystem.setRAM("Gaming System RAM");
    }

    @Override
    public void buildSSD() {
        this.gamingSystem.setSSD("Gaming System SSD");
    }

    @Override
    public void buildGraphicsBoard() {
        this.gamingSystem.setGraphicsBoard("Gaming System Graphics Board");
    }

    @Override
    public void buildMouse() {
        this.gamingSystem.setMouse("Gaming System Mouse");
    }

    @Override
    public void buildKeyboard() {
        this.gamingSystem.setKeyboard("Gaming System Keyboard");
    }

    @Override
    public void buildCamera() {
        this.gamingSystem.setCamera("Gaming System Camera");
    }

    @Override
    public void buildHeadphones() {
        this.gamingSystem.setHeadphones("Gaming System Headphones");
    }

    @Override
    public void buildGamingChair() {
        this.gamingSystem.setGamingChair("Gaming System Gaming Chair");
    }

    @Override
    public IGamingSystem getGamingSystem() {
        return this.gamingSystem;
    }
}
