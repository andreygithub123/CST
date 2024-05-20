package State;

public class TCPConnection {
    private TCPState currentState;

    public TCPConnection() {
        this.currentState = new TCPClosedState();
    }

    public void setState(TCPState state){
        this.currentState=state;
    }

    public void open(){
        this.currentState.open(this);
    }

    public void close(){
        this.currentState.close(this);
    }

    public void acknowledge(){
        this.currentState.acnowledge(this);
    }

}
