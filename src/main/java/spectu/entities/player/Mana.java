package spectu.entities.player;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Mana {

    private int currentMagicPoints;
    private int maxMagicPoints;

}
