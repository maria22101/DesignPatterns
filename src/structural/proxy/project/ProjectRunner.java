package structural.proxy.project;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.somelink.com/realProject");
        project.run();
    }
}
