package chairs;

public class MagicChairFabrika implements Fabrika {

    @Override
    public Chair createChair(){
        return new MagicChair();
    }
}
