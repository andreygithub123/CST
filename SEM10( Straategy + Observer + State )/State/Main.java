package State;

public class Main {
    public static void main(String[] args) {
        TCPConnection tcpConnection = new TCPConnection();
        tcpConnection.open();
        tcpConnection.open();
        tcpConnection.acknowledge();
        tcpConnection.close();
    }
}
