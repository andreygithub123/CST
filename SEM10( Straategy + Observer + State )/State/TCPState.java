package State;

public interface TCPState {
    void open(TCPConnection connection);
    void close(TCPConnection connection);
    void acnowledge(TCPConnection connection);
}
