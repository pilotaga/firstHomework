public class Cat {
    private String name;
    private int appetite;
    private boolean isNotHungry;

    public boolean isNotHungry() {
        return isNotHungry;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isNotHungry = false;
    }

    public void eat(Plate p) {
        if(p.decreaseFood(appetite)) {
            isNotHungry = false;
        }
    }


}
