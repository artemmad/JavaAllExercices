package chairs;

public class MultyfunctionChairFabrika implements Fabrika {
    @Override
    public Chair createChair() {
        return new MultyfunctionChair();
    }
}
