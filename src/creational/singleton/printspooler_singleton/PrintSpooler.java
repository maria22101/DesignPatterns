package creational.singleton.printspooler_singleton;

public class PrintSpooler {

    // initializing an instance here is example of eager initialization - the instance creation before
    // we are certain that the instance is needed
    private static final PrintSpooler spooler = new PrintSpooler();

    private static boolean initialized = false;

    private PrintSpooler() {
    }

    private void init() {
        // some initialization may come here
    }

    // if initializing an instance is moved here - it would be an example of lazy initialization: the instance
    // is created when it is going to be used.
    // However, moving the initialization out of getInstance() method out from this method, is not an issue for java,
    // as java already uses lazy loading: it is unlikely the PrintSpooler class will be loaded in JVM
    // unless betInstance() method is called
    public static synchronized PrintSpooler getInstance() {

        if(initialized) {
            return spooler;
        }
        spooler.init();
        initialized = true;
        return spooler;
    }
}
