package proxy_excercise_downloadFile;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader{
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String url, String destination) throws Exception {
        System.out.println("Downloading from: " + url);
        System.out.println("Using User-Agent: " + userAgent);

        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        connection.setRequestProperty("User-Agent", userAgent);

        try (InputStream in = new BufferedInputStream(connection.getInputStream());
             FileOutputStream out = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int count;
            while ((count = in.read(buffer, 0, 1024)) != -1) {
                out.write(buffer, 0, count);
            }
        }

        System.out.println("File saved to: " + destination);
    }
}
