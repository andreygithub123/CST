package cts.diaconu.andrei1103.builder;

public class GamingSystem implements IGamingSystem{

    private String motherboard;
    private String RAM;
    private String SSD;
    private String graphicsBoard;
    private String mouse;
    private String keyboard;
    private String camera;
    private String headphones;
    private String gamingChair;

    @Override
    public void printConfiguration() {
        System.out.println("GamingSystem{" +
                "motherboard='" + motherboard + '\'' +
                ", RAM='" + RAM + '\'' +
                ", SSD='" + SSD + '\'' +
                ", graphicsBoard='" + graphicsBoard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", camera='" + camera + '\'' +
                ", headphones='" + headphones + '\'' +
                ", gamingChair='" + gamingChair + '\'' +
                '}');
    }


    @Override
    public void setMotherboard(String motherboard) {
            this.motherboard=motherboard;
    }

    @Override
    public void setRAM(String ram) {
            this.RAM  =ram;
    }

    @Override
    public void setSSD(String ssd) {
        this.SSD=ssd;
    }

    @Override
    public void setGraphicsBoard(String graphicsBoard) {
        this.graphicsBoard=graphicsBoard;
    }

    @Override
    public void setMouse(String mouse) {
        this.mouse=mouse;
    }

    @Override
    public void setKeyboard(String keyboard) {
        this.keyboard=keyboard;
    }

    @Override
    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public void setHeadphones(String headphones) {
        this.headphones=headphones;
    }

    @Override
    public void setGamingChair(String gamingChair) {
        this.gamingChair=gamingChair;
    }
}
