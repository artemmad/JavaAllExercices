package chairs;

public class MultyfunctionChair implements Chair {
    public MultyfunctionChair() {
        System.out.println("Ваш многофункциональный стул");
    }

    @Override
    public void sit() {

            System.out.println("Вы сели на мультифункцианальный стул");
    }
}