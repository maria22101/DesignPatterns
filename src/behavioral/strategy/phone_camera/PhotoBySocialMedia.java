package behavioral.strategy.phone_camera;

public class PhotoBySocialMedia implements PhotoShareStrategy{
    @Override
    public void sharePhoto() {
        System.out.println("Posting the photo on social media");
    }
}
