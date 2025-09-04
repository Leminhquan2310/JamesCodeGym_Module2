package proxy_excercise_downloadFile;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Downloader downloader = new FileDownloaderProxy();

        try {
            System.out.println("Enter url: ");
            String url = scanner.nextLine();
            System.out.println("Enter destination file path: ");
            String destination = scanner.nextLine();

            downloader.download(url, destination);
        } catch (Exception e ) {
            System.out.println("Error while downloading: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
