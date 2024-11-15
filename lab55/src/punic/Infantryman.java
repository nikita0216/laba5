package punic;

public class Infantryman implements Warrior {
    private final int strength = 80;
    private final int agility = 50;
    private final int speed = 40;
    private Faction faction;

    // Конструктор с параметром Faction
    public Infantryman(Faction faction) {
        this.faction = faction;
    }

    @Override
    public void info() {
        System.out.println("Infantryman from " + faction.getName());
    }

    @Override
    public int getStrength() {
        return strength + faction.getBonusStrength();
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public Warrior clone() {
        try {
            return (Warrior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public Faction getFaction() {
        return faction;
    }
}
