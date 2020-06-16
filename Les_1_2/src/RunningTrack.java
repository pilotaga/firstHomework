public class RunningTrack implements Obstacle {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean Overcome(Creature creature) {
        return creature.run(length);
    }
}
