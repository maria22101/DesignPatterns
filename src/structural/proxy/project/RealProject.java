package structural.proxy.project;

public class RealProject implements Project{
    String url;

    public RealProject(String url) {
        this.url = url;
        downLoad();
    }

    public void downLoad() {
        System.out.println("Downloading Project from " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
