public class Human extends Creature {

//    public Human(String name, int jumpLim, int runLim) {
//        super.name = name;
//        super.jumpLim = jumpLim;
//        super.runLim = runLim;
//    }

    public Human(String name, int jumpLim, int runLim){
        super(name, jumpLim, runLim);
    }

    @Override
    public boolean run(int length){
        if(length < runLim) {
            System.out.printf("Human[%s] is running %d", name, length);
        } else {
            System.out.printf("Human[%s] isn't running", name);
        }
        System.out.println();
        return length < runLim;
    }

    @Override
    public boolean jump(int height){
        if(height < jumpLim) {
            System.out.printf("Human[%s] is jumping %d", name, height);
        } else {
            System.out.printf("Human[%s] isn't jumping", name);
        }
        System.out.println();
        return height < jumpLim;
    }
}
