package chairs;

public class VictorianChairFabrika implements Fabrika {


    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}