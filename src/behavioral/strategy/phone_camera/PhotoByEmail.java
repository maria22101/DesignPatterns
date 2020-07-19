package behavioral.strategy.phone_camera;

public class PhotoByEmail implements PhotoShareStrategy{
    @Override
    public void sharePhoto() {
        System.out.println("Emailing the photo");
    }
}
