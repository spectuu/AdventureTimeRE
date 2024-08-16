package spectu.weapons;

import lombok.Data;

@Data
public abstract class Weapon {

    private String weaponName;
    private String weaponType;

    private int damage;
    private int manaCost;

    private int durability;
    private int weight;

    private int criticalChance;
    private int criticalDamage;

    public void repair() {

    }

    public void upgrade() {

    }

    public abstract void specialAbility();

}
