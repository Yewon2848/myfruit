package com.myfruit.pms.controller;

import com.myfruit.pms.dto.ItemDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class ItemClass {

    @GetMapping("/item")
    public String create(){
        return "shop/create-item";
    }

    @PostMapping
    public void createItem(@RequestBody ItemDto itemDto){
        System.out.println(itemDto.getItem());
    }
}
