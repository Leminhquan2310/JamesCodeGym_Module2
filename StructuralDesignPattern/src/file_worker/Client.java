package file_worker;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String filePath){
        long size = fileCalculator.calculateSize(filePath);
        System.out.println("Size: " + size);
    }
}
