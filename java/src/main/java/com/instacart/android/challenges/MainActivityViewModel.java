package com.instacart.android.challenges;

import android.app.Application;

import com.instacart.android.challenges.ItemListViewState.ItemRow;

import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {
    private ItemListViewState itemListViewState;
    private UpdateListener listener;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        List<ItemRow> items = Arrays.asList(
                new ItemRow("Cabbage"),
                new ItemRow("Apple"),
                new ItemRow("Bread")
        );

        itemListViewState = new ItemListViewState("Delivery Items", items);
    }

    public void setStateUpdateListener(@Nullable UpdateListener listener) {
        this.listener = listener;
    }

    interface UpdateListener {
        void onUpdate(ItemListViewState state);
    }
}
