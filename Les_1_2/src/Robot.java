public class Robot extends Creature {
    public Robot(String name, int jumpLim, int runLim) {
        super(name, jumpLim, runLim);
    }

    @Override
    public boolean run(int length) {
        if (length < runLim) {
            System.out.printf("Robot[%s] is running %d", name, length);
        } else {
            System.out.printf("Robot[%s] isn't running", name);
        }
        System.out.println();
        return length < runLim;
    }

    @Override
    public boolean jump(int height) {
        if (height < jumpLim) {
            System.out.printf("Robot[%s] is jumping %d", name, height);
        } else {
            System.out.printf("Robot[%s] isn't jumping", name);
        }
        System.out.println();
        return height < jumpLim;
    }
}

