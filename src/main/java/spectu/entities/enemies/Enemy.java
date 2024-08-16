package spectu.entities.enemies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spectu.entities.player.Health;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Enemy {

    private String name;
    private String type;

    //Stats
    private Health health;
    private int level;

    //Attributes
    private int damage;
    private int speed;
    private int knowledge;
    private int strength;
    private int defense;
    private int precision;
    private int evasion;
    private int criticalChance;
    private int criticalDamage;

    public abstract void attack();

    public abstract void defense();

}
