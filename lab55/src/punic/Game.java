package punic;

public class Game {
    public static void main(String[] args) {
        // Создаем фракции
        Faction romanFaction = new RomanFaction();
        Faction carthaginianFaction = new CarthaginianFaction();

        // Создаем реестры воинов для каждой фракции
        WarriorRegistry romanRegistry = new WarriorRegistry(romanFaction);
        WarriorRegistry carthaginianRegistry = new WarriorRegistry(carthaginianFaction);

        // Создаем легионы
        CompositeWarrior romanLegion = new CompositeWarrior(romanFaction);
        romanLegion.addUnit(romanRegistry.createWarrior(WarriorType.INFANTRYMAN));
        romanLegion.addUnit(romanRegistry.createWarrior(WarriorType.ARCHER));
        romanLegion.addUnit(romanRegistry.createWarrior(WarriorType.HORSEMAN));

        CompositeWarrior carthaginianLegion = new CompositeWarrior(carthaginianFaction);
        carthaginianLegion.addUnit(carthaginianRegistry.createWarrior(WarriorType.INFANTRYMAN));
        carthaginianLegion.addUnit(carthaginianRegistry.createWarrior(WarriorType.ARCHER));
        carthaginianLegion.addUnit(carthaginianRegistry.createWarrior(WarriorType.HORSEMAN));

        // Вывод информации о легионах
        romanLegion.info();
        System.out.println("Roman Legion Strength: " + romanLegion.getStrength());

        carthaginianLegion.info();
        System.out.println("Carthaginian Legion Strength: " + carthaginianLegion.getStrength());
    }
}
