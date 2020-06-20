public class Main {

    public static void main(String[] args) {
        runApplication();
    }

    public static void runApplication(){
        Obstacle[] obs = new Obstacle[3];
        Creature[] cr = new Creature[3];
        cr[0] = new Cat("Vasya",50, 150);
        cr[1] = new Human("Petya",30, 200);
        cr[2] = new Robot("Murka",40, 300);
        obs[0] = new RunningTrack(190);
        obs[1] = new Wall(35);
        obs[2] = new RunningTrack(200);

        for (int i = 0; i < cr.length; i++){
            for (int j = 0; j < obs.length; j++){
                if(!cr[i].goThrough(obs[j])) break;
            }
        }
    }
}
