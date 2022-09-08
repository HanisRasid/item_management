package com.example.item_management;

import java.util.*;

public class ItemDao {
    private static Map<String, Item> items = new HashMap<String, Item>();

    static{
        Item item1 = new Item("01", "item1", "desc for item1", 1.0);
        Item item2 = new Item("02", "item2", "desc for item2", 2.0);
        items.put("01", item1);
        items.put("02", item2);
    }
    public static List<Item> getAllItems(){
        return new ArrayList<>(items.values());
    }
    public static Item getItemDetails(double itemId){
        return items.get(itemId);
    }
    public static Item updateItem(String itemId, Item item){
        item.setId(itemId);
        items.put(itemId,item);
        return item;
    }
    public static Item deleteItem(double itemId){
        return items.remove(itemId);
    }
}
