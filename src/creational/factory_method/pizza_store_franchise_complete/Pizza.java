package creational.factory_method.pizza_store_franchise_complete;

public abstract class Pizza {
        String name;
        String dough;
        String sauce;

        public String getName() {
            return name;
        }

        public void prepare() {
            System.out.println("Preparing " + name);
        }

        public void bake() {
            System.out.println("Baking " + name);
        }

        public void cut() {
            System.out.println("Cutting " + name);
        }

        public void box() {
            System.out.println("Boxing " + name);
        }

        @Override
        public String toString() {
            return new StringBuffer()
                    .append(name + " with ")
                    .append(dough + " and ")
                    .append(sauce + "\n")
                    .toString();
        }
}
