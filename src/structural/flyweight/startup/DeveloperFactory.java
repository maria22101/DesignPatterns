package structural.flyweight.startup;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    public static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialization(String specialization) {
        Developer developer = developers.get(specialization);

        if(developer == null) {
            switch (specialization) {
                case "java":
                    System.out.println("Hiring java developer");
                    developer = new JavaDeveloper();
                    break;
                case "angular":
                    System.out.println("Hiring angular developer");
                    developer = new AngularDeveloper();
                    break;
            }
            developers.put(specialization, developer);
        }

        return developer;
    }
}
