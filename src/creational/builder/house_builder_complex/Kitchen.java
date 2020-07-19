package creational.builder.house_builder_complex;

public class Kitchen extends Room {
    private boolean hasDiningArea;
    private boolean isStudio;

    public Kitchen(int ceilingHeight, int floorNumber, int numberOfWindows, int squareMeters, String pointOfCompass,
                   boolean hasDiningArea, boolean isStudio) {
        super(ceilingHeight, floorNumber, numberOfWindows, squareMeters, pointOfCompass);
        this.hasDiningArea = hasDiningArea;
        this.isStudio = isStudio;
    }
}
