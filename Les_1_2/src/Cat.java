public class Cat extends Creature {


//    public Cat(String name, int jumpLim, int runLim) {
//        super.name = name;
//        super.jumpLim = jumpLim;
//        super.runLim = runLim;
//    }

    public Cat(String name, int jumpLim, int runLim){
        super(name, jumpLim, runLim);
    }

    @Override
    public boolean run(int length){
        if(length < runLim) {
            System.out.printf("Cat[%s] is running %d", name, length);
        } else {
            System.out.printf("Cat[%s] isn't running", name);
        }
        System.out.println();
        return length < runLim;
    }

    @Override
    public boolean jump(int height){
        if(height < jumpLim) {
            System.out.printf("Cat[%s] is jumping %d", name, height);
        } else {
            System.out.printf("Cat[%s] isn't jumping", name);
        }
        System.out.println();
        return height < jumpLim;
    }


}
