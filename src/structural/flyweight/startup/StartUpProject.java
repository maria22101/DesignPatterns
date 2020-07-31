package structural.flyweight.startup;

import java.util.ArrayList;
import java.util.List;

public class StartUpProject {

    public static void main(String[] args) {

        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> projectTeam = new ArrayList<>();

        projectTeam.add(developerFactory.getDeveloperBySpecialization("java"));
        projectTeam.add(developerFactory.getDeveloperBySpecialization("java"));
        projectTeam.add(developerFactory.getDeveloperBySpecialization("java"));
        projectTeam.add(developerFactory.getDeveloperBySpecialization("java"));
        projectTeam.add(developerFactory.getDeveloperBySpecialization("angular"));
        projectTeam.add(developerFactory.getDeveloperBySpecialization("angular"));
        projectTeam.add(developerFactory.getDeveloperBySpecialization("angular"));

        projectTeam.forEach(d -> d.writeCode());

    }

}
