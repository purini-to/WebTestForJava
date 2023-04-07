package com.example.webtestforjava.controller;

import com.example.webtestforjava.model.entity.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final List<Item> items = new ArrayList<>(Arrays.asList(
            new Item("リーダブルコード", 2640D),
            new Item("プリンシプル オブ プログラミング", 1860D),
            new Item("Clean Architecture 達人に学ぶソフトウェアの構造と設計", 3520D)
    ));

    // curl -X GET http://localhost:8080/items
    @GetMapping
    public List<Item> getItems() {
        return items;
    }
}
