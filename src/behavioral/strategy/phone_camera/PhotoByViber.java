package behavioral.strategy.phone_camera;

public class PhotoByViber implements PhotoShareStrategy{
    @Override
    public void sharePhoto() {
        System.out.println("Sending photo by Viber");
    }
}
