package com.example.hmspring.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.Set;

@Repository
@SessionScope
public class Basket {
    private Set<Integer> items;

    public Basket(Set<Integer> ids) {
        this.items = ids;
    }

    public Set<Integer> getItems() {
        return items;
    }

    public void setItems(Set<Integer> ids) {
        items.addAll(ids);
    }
}
