package com.example.item_management.controller;

import com.example.item_management.model.Item;
import com.example.item_management.dao.ItemDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    @PostMapping("/item")
    public Item addItem(@RequestBody Item newItem){
        return ItemDao.addItem(newItem);
    }
    @GetMapping("/item/item{id}")
    public Item getItem(@PathVariable double id){
        return ItemDao.getItem(id);
    }
    @GetMapping("/item/item")
    public List<Item> getAllItems(){
        return ItemDao.getAllItems();
    }
    @PutMapping("/item/{id}")
    public Item updateItem(@PathVariable String id, @RequestBody Item item){
        return ItemDao.updateItem(id, item);
    }
    @DeleteMapping("/item/delete{id}")
    public Item deleteItem(@PathVariable double id){
        return ItemDao.deleteItem(id);
    }
}
