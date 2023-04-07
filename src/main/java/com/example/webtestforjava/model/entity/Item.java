package com.example.webtestforjava.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
public class Item {
    private final String id;
    private String name;
    private Double price;

    /**
     * コンストラクタ
     * @param name 名前
     * @param price 値段
     */
    public Item(String name, Double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
    }
}
