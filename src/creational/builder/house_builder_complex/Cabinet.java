package creational.builder.house_builder_complex;

public class Cabinet extends Room {
    boolean isSoundProof;
    boolean hasLibraryFurniture;
    int numberOfBooksPossibleToStore;

    public Cabinet(int ceilingHeight, int floorNumber, int numberOfWindows, int squareMeters, String pointOfCompass,
                   boolean isSoundProof, boolean hasLibraryFurniture, int numberOfBooksPossibleToStore) {
        super(ceilingHeight, floorNumber, numberOfWindows, squareMeters, pointOfCompass);
        this.isSoundProof = isSoundProof;
        this.hasLibraryFurniture = hasLibraryFurniture;
        this.numberOfBooksPossibleToStore = numberOfBooksPossibleToStore;
    }
}
