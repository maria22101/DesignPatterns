package creational.singleton.collection_singleton;

import java.util.Collections;
import java.util.List;

/**
 * Class illustrates UnsupportedOperationException occurrence
 */
public class ResourceManager {

    public static void main(String[] args) {

        Resource resource = new Resource();

        List<Resource> resourceList = Collections.singletonList(resource);

        processResources(resourceList);

        Resource resource2 = new Resource();

        // UnsupportedOperationException exception will be generated as the only one collection element allowed
        resourceList.add(resource2);
    }

    public static <Type> void processResources(List<Type> list) {
        for (Type resource : list) {
            // code to process resources
        }
    }
}
