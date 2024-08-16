package spectu.items;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Item {

    private int itemId;

    private String itemName;
    private String itemDescription;

    private int amount;

    public abstract void use();

}
