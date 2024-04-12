package cts.diaconu.andrei1103.builder;

public interface IGamingSystemBuilder {
    public void buildMotherboard();

    public void buildRAM();
    public void buildSSD();

    public void buildGraphicsBoard();

    public void buildMouse();
    public void buildKeyboard();
    public void buildCamera();
    public void buildHeadphones();
    public void buildGamingChair();

    public IGamingSystem getGamingSystem();

}
