package com.chad.library.adapter.base.listener;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

public interface OnItemSwipeListener {
    void clearView(RecyclerView.C0792c0 c0Var, int i);

    void onItemSwipeMoving(Canvas canvas, RecyclerView.C0792c0 c0Var, float f, float f2, boolean z);

    void onItemSwipeStart(RecyclerView.C0792c0 c0Var, int i);

    void onItemSwiped(RecyclerView.C0792c0 c0Var, int i);
}
