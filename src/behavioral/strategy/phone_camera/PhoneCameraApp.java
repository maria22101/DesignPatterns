package behavioral.strategy.phone_camera;

public abstract class PhoneCameraApp {
    PhotoShareStrategy photoShareStrategy;

    public void setPhotoShareStrategy(PhotoShareStrategy photoShareStrategy) {
        this.photoShareStrategy = photoShareStrategy;
    }

    public void sharePhoto() {
        photoShareStrategy.sharePhoto();
    }

    public void takePhoto() {
        System.out.println("Taking the photo");
    }

    public void savePhoto() {
        System.out.println("Saving the photo");
    }

    public abstract void editPhoto();
}
