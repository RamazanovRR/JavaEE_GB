package ru.Ramazanov.enterprise.servlet.product;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.UUID;

public class Product {

    @Getter
    @Setter
    private String idName;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private double cost;


    public Product(@NonNull String name, @NonNull double cost) {
        this.idName = UUID.randomUUID().toString();
        this.name = name;
        this.cost = cost;
    }
}
