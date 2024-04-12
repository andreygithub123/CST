package cts.diaconu.andrei1103.builder;

public interface IGamingSystem {
    public void printConfiguration();

    //hardware components
    public void setMotherboard(String motherboard);
    public void setRAM(String ram);
    public void setSSD(String ssd);
    public void setGraphicsBoard(String graphicsBoard);

    //accessories components
    public void setMouse(String mouse);
    public void setKeyboard(String keyboard);
    public void setCamera(String camera);

    public void setHeadphones(String headphones);
    public void setGamingChair(String gamingChair);
}
