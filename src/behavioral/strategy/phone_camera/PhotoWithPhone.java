package behavioral.strategy.phone_camera;

import java.util.Scanner;

public class PhotoWithPhone {

    public static void main(String[] args) {

        PhoneCameraApp camera = new SnazzyCamera();
        String photoSharingMode = getPhotoSharingMode();

        switch(photoSharingMode) {
            case("v"): camera.setPhotoShareStrategy(new PhotoByViber()); break;
            case("e"): camera.setPhotoShareStrategy(new PhotoByEmail()); break;
            case("s"): camera.setPhotoShareStrategy(new PhotoBySocialMedia()); break;
            default: camera.setPhotoShareStrategy(new PhotoByViber());
        }

        camera.takePhoto();
        camera.savePhoto();
        camera.editPhoto();
        camera.sharePhoto();

    }

    public static  String getPhotoSharingMode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose photo sharing mode: Viber(v), Email(e), Social media(s):");
        return scanner.next();
    }
}
