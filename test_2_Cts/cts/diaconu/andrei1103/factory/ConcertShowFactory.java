package cts.diaconu.andrei1103.factory;

public class ConcertShowFactory implements ShowFactory{

    @Override
    public IShow createShow() {
        return new ConcertShow();
    }
}
