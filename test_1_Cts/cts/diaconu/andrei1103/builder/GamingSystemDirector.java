package cts.diaconu.andrei1103.builder;

public class GamingSystemDirector {
    private IGamingSystemBuilder builder;
    public GamingSystemDirector(IGamingSystemBuilder builder){
        this.builder=builder;
    }

    public void buildGamingSystem(){
        builder.buildMotherboard();
        builder.buildSSD();
        builder.buildRAM();
        builder.buildGraphicsBoard();
        builder.buildMouse();
        builder.buildKeyboard();
        builder.buildCamera();
        builder.buildHeadphones();
        builder.buildGamingChair();

        //no case of instanceof
    }

    public IGamingSystem getGamingSystem(){
        return builder.getGamingSystem();
    }
}
