package com.example.application;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.Endpoint;
import com.vaadin.hilla.Nonnull;

import java.util.ArrayList;
import java.util.List;

@Endpoint
@AnonymousAllowed
public class GroceryEndpoint {

    private final List<GroceryItem> groceryList = new ArrayList<>();

    public @Nonnull List<@Nonnull GroceryItem> getGroceries() {
        return groceryList;
    }

    public GroceryItem save(GroceryItem item) {
        groceryList.add(item);
        return item;
    }
}