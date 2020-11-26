package chairs;

public class MagicChair implements Chair{
    public MagicChair() {
        System.out.println("Ваш волшебный стул");
    }

    @Override
    public void sit() {
        System.out.println("Вы сели на магический стул");
    }
}
