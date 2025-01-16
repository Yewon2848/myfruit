package com.myfruit.pms.controller;

import com.myfruit.pms.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/items")
public class ItemController {

    @GetMapping("/create")
    public String create(){
        return "shop/create-item";
    }

//    @GetMapping
//    public void createItem2(@RequestBody ItemDto itemDto){
//        System.out.println(itemDto.getItem());
//    }

    @PostMapping
    public void createItem(@RequestBody ItemDto itemDto){
        System.out.println(itemDto.getItem());
    }
}
