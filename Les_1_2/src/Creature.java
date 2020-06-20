abstract class Creature {
    protected String name;
    protected int jumpLim;
    protected int runLim;

    public Creature(String name, int jumpLim, int runLim) {
        this.name = name;
        this.jumpLim = jumpLim;
        this.runLim = runLim;
    }


    boolean goThrough(Obstacle obstacle){
        return obstacle.Overcome(this);
    }

    abstract boolean run(int length);
    abstract boolean jump(int height);

    public String getName() {
        return name;
    }

    public int getJumpLim() {
        return jumpLim;
    }

    public int getRunLim() {
        return runLim;
    }
}
