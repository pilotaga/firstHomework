public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean Overcome(Creature creature) {
        return creature.jump(height);
    }
}
