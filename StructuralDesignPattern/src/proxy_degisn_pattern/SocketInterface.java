package proxy_degisn_pattern;

public interface SocketInterface {
    String readLine();

    void writeLine(String str);

    void dispose();
}
