package creational.singleton.printspooler_singleton;

public class PrinterManager {
    public static void main(String[] args) {

        PrintSpooler spooler = PrintSpooler.getInstance();

        Thread firstThread = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});
        Thread secondThread = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});

        firstThread.start();
        secondThread.start();


    }
}
