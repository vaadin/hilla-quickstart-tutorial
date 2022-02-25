package com.example.application;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

import java.util.ArrayList;
import java.util.List;

@Endpoint
@AnonymousAllowed
public class GroceryEndpoint {

    static final List<GroceryItem> groceryList = new ArrayList<>();

    public @Nonnull List<@Nonnull GroceryItem> getGroceries() {
        return groceryList;
    }

    public GroceryItem save(GroceryItem item) {
        groceryList.add(item);
        return item;
    }
}