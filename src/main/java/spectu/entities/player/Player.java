package spectu.entities.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    private String name;

    // Stats
    private Health health;
    private Mana mana;

    //Attributes
    private int speed;
    private int knowledge;
    private int strength;
    private int defense;
    private int precision;
    private int evasion;

    //level
    private int statPoints;
    private int level;
    private int experience;

    public void action(){

    }

    public void attack() {

    }

    public void useItem(){

    }

    private void useSkill(){

    }

    public void useWeaponSkill(){

    }

    public void useMagic(){

    }

    public void defense(){

    }

    public void run(){

    }

    public void levelUp(){

    }

}
