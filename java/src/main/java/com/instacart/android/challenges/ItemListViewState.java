package com.instacart.android.challenges;

import java.util.List;

public class ItemListViewState {
    final String toolbarTitle;
    final List<ItemRow> items;

    public ItemListViewState(String toolbarTitle, List<ItemRow> items) {
        this.toolbarTitle = toolbarTitle;
        this.items = items;
    }

    static class ItemRow {
        final String name;

        ItemRow(String name) {
            this.name = name;
        }
    }
}
