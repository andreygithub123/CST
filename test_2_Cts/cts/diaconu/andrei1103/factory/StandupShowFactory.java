package cts.diaconu.andrei1103.factory;

public class StandupShowFactory implements ShowFactory{
    @Override
    public IShow createShow() {
        return new StandupShow();
    }
}
