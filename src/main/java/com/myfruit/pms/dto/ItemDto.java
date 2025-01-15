package com.myfruit.pms.dto;

public class ItemDto {
    // 필드 (속성)
    private String item;

    // 기본 생성자 (필수)
    public ItemDto() {}

    // Getter 와 Setter
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
