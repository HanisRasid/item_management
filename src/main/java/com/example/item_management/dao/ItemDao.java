package com.example.item_management.dao;

import com.example.item_management.model.Item;

import java.util.*;

public class ItemDao {
    private static Map<Double, Item> items = new HashMap<Double, Item>();

    static{
        Item item1 = new Item("01", "item1", "desc for item1", 1.0);
        Item item2 = new Item("02", "item2", "desc for item2", 2.0);
        items.put(Double.parseDouble(item1.getId()), item1);
        items.put(Double.parseDouble(item2.getId()), item2);
    }
    public static List<Item> getAllItems(){
        return new ArrayList<>(items.values());
    }
    public static Item getItemDetails(double itemId){
        return items.get(itemId);
    }
    public static Item updateItem(String itemId, Item item){
        item.setId(itemId);
        items.put(Double.parseDouble(item.getId()),item);
        return item;
    }
    public static Item deleteItem(double itemId){
        return items.remove(itemId);
    }
    public static Item addItem(Item newItem){
        items.put(Double.parseDouble(newItem.getId()), newItem);
        return newItem;
    }
}
