package State;

public class TCPClosedState implements TCPState{
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Connection established");
        connection.setState(new TCPOpneState());
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Connection already closed");
    }

    @Override
    public void acnowledge(TCPConnection connection) {
        System.out.println("Can't Acknowledgin dtata. Connection is closed");
    }
}
