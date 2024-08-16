package spectu.entities.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spectu.items.Item;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    private List<Item> items;
    private int maxItems;

    public Item getItem(int itemId) {
        for (Item item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }

    public void addItem(Item item) {
        if (items.size() < maxItems) {
            items.add(item);
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void useItem(int itemId) {

        Item item = getItem(itemId);

        if (item != null) {
            item.use();

            item.setAmount(item.getAmount() - 1);

            if (item.getAmount() == 0) {
                removeItem(item);
            }

        }
    }
}

