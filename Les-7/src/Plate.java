public class Plate {

    private int food;

    public void addFood(int food) {
        this.food += food;
    }

    public Plate(int food) {
        this.food = food;
    }


    public boolean decreaseFood(int n) {
        if(n < food) {
            food -= n;
            return true;
        } else {
            System.out.printf("There're only %d food on the plate", food);
            System.out.println();
            return false;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
