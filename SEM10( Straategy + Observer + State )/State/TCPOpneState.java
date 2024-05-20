package State;

public class TCPOpneState implements TCPState{
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Connection already open");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing connection.");
        connection.setState(new TCPClosedState());
    }

    @Override
    public void acnowledge(TCPConnection connection) {
        System.out.println("Acknowledgin data");
    }
}
