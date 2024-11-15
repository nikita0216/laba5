package punic;

import java.util.HashMap;
import java.util.Map;

public class WarriorRegistry {
    private Map<WarriorType, Warrior> prototypes = new HashMap<>();

    public WarriorRegistry(Faction faction) {
        prototypes.put(WarriorType.INFANTRYMAN, new Infantryman(faction));
        prototypes.put(WarriorType.ARCHER, new Archer(faction));
        prototypes.put(WarriorType.HORSEMAN, new Horseman(faction));
    }

    public Warrior createWarrior(WarriorType type) {
        Warrior prototype = prototypes.get(type);
        if (prototype == null) {
            throw new IllegalArgumentException("Warrior type " + type + " is not registered.");
        }
        return prototype.clone();
    }
}
