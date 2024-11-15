package punic;

public interface Warrior extends Cloneable {
    void info();
    int getStrength();
    int getAgility();
    int getSpeed();
    Warrior clone();
    Faction getFaction(); // Добавляем фракцию
}
