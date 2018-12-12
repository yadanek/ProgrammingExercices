package zoo;


public class TeddyBear extends Bear {

    @Override
    public void eat() throws IDontEatException {
        throw new IDontEatException();
    }

    @Override
    public int getWeight() {
        return 1;
    }

    @Override
    public String showMeBear() {
        return "Hello! I'm a Teddy Bear. I love you!";
    }

    @Override
    public String display() {
        return "Teddy-Bear";
    }

    @Override
    public boolean isAlive(){
        return false;
    }


}
