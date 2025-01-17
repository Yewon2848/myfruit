package com.myfruit.pms.service;

import com.myfruit.pms.dto.ItemDto;
import com.myfruit.pms.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public void createItem(ItemDto itemDto) {
        itemMapper.insertItem(itemDto);
    }

    public ItemDto getItem(int id) {
        // NullException 처리
//        ItemDto itemDto = itemMapper.getItemById(id).orElseThrow(
//                () -> new IllegalStateException("파일을 찾을 수 없습니다.")
//        );
        return itemMapper.getItemById(id).orElseThrow(
                () -> new IllegalStateException("파일을 찾을 수 없습니다.")
        );
    }

    public List<ItemDto> getItems() {
        return itemMapper.getItems();
    }

    public void modify(ItemDto itemDto) {
        itemMapper.updateItem(itemDto);
    }

    public void remove(int id) {
        itemMapper.deleteItem(id);
    }

    // 메서드 구문
    // 접근제어자 리턴타입 메서드이름() {}
}

//함수
    //접근제어자 리턴타입 메서드 이름(매개변수){코드블록-클래스일 경우}

