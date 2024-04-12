package cts.diaconu.andrei1103.factory;

public class TheatreShowFactory implements ShowFactory{
    @Override
    public IShow createShow() {
        return new TheatreShow();
    }
}
