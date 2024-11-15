package punic;

import java.util.ArrayList;
import java.util.List;

public class CompositeWarrior implements Warrior {
    private List<Warrior> units = new ArrayList<>();
    private Faction faction;

    public CompositeWarrior(Faction faction) {
        this.faction = faction;
    }

    public void addUnit(Warrior warrior) {
        units.add(warrior);
    }

    @Override
    public void info() {
        System.out.println("Composite unit from " + faction.getName());
    }

    @Override
    public int getStrength() {
        int totalStrength = 0;
        for (Warrior unit : units) {
            totalStrength += unit.getStrength();
        }
        return totalStrength;
    }

    @Override
    public int getAgility() {
        return 0; // Агрегация ловкости не имеет смысла для группы
    }

    @Override
    public int getSpeed() {
        return 0; // Агрегация скорости не имеет смысла для группы
    }

    @Override
    public Warrior clone() {
        CompositeWarrior cloned = new CompositeWarrior(this.faction);
        for (Warrior unit : units) {
            cloned.addUnit(unit.clone());
        }
        return cloned;
    }

    @Override
    public Faction getFaction() {
        return faction;
    }
}
