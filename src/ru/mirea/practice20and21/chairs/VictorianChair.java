package chairs;

public class VictorianChair implements Chair {
    public VictorianChair() {
        System.out.println("Ваш викторианский стул");
    }

    @Override
    public void sit() {
            System.out.println("Вы сели на викторианский стул");
    }
}
