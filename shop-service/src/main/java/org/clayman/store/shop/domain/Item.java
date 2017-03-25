package org.clayman.store.shop.domain;

public class Item {

    private Integer itemId;
    private String name;

    public Item() {}

    public Item(Integer itemId, String name) {
        this.itemId = itemId;
        this.name = name;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Item setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }
}
