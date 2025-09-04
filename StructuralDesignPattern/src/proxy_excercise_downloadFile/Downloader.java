package proxy_excercise_downloadFile;

public interface Downloader {
    void download(String url, String destination) throws Exception;
}
