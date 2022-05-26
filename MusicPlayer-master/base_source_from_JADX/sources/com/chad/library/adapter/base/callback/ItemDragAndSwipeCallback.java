package com.chad.library.adapter.base.callback;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0885l;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import p159f.p164b.p165a.C4302a;

public class ItemDragAndSwipeCallback extends C0885l.C0891f {
    private BaseItemDraggableAdapter mAdapter;
    private int mDragMoveFlags = 15;
    private float mMoveThreshold = 0.1f;
    private int mSwipeMoveFlags = 32;
    private float mSwipeThreshold = 0.7f;

    public ItemDragAndSwipeCallback(BaseItemDraggableAdapter baseItemDraggableAdapter) {
        this.mAdapter = baseItemDraggableAdapter;
    }

    private boolean isViewCreateByAdapter(RecyclerView.C0792c0 c0Var) {
        int itemViewType = c0Var.getItemViewType();
        return itemViewType == 273 || itemViewType == 546 || itemViewType == 819 || itemViewType == 1365;
    }

    public void clearView(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var) {
        super.clearView(recyclerView, c0Var);
        if (!isViewCreateByAdapter(c0Var)) {
            View view = c0Var.itemView;
            int i = C4302a.BaseQuickAdapter_dragging_support;
            if (view.getTag(i) != null && ((Boolean) c0Var.itemView.getTag(i)).booleanValue()) {
                this.mAdapter.onItemDragEnd(c0Var);
                c0Var.itemView.setTag(i, Boolean.FALSE);
            }
            View view2 = c0Var.itemView;
            int i2 = C4302a.BaseQuickAdapter_swiping_support;
            if (view2.getTag(i2) != null && ((Boolean) c0Var.itemView.getTag(i2)).booleanValue()) {
                this.mAdapter.onItemSwipeClear(c0Var);
                c0Var.itemView.setTag(i2, Boolean.FALSE);
            }
        }
    }

    public float getMoveThreshold(RecyclerView.C0792c0 c0Var) {
        return this.mMoveThreshold;
    }

    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var) {
        if (isViewCreateByAdapter(c0Var)) {
            return C0885l.C0891f.makeMovementFlags(0, 0);
        }
        return C0885l.C0891f.makeMovementFlags(this.mDragMoveFlags, this.mSwipeMoveFlags);
    }

    public float getSwipeThreshold(RecyclerView.C0792c0 c0Var) {
        return this.mSwipeThreshold;
    }

    public boolean isItemViewSwipeEnabled() {
        return this.mAdapter.isItemSwipeEnable();
    }

    public boolean isLongPressDragEnabled() {
        return false;
    }

    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, float f, float f2, int i, boolean z) {
        super.onChildDrawOver(canvas, recyclerView, c0Var, f, f2, i, z);
        if (i == 1 && !isViewCreateByAdapter(c0Var)) {
            View view = c0Var.itemView;
            canvas.save();
            if (f > 0.0f) {
                canvas.clipRect((float) view.getLeft(), (float) view.getTop(), ((float) view.getLeft()) + f, (float) view.getBottom());
                canvas.translate((float) view.getLeft(), (float) view.getTop());
            } else {
                canvas.clipRect(((float) view.getRight()) + f, (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
                canvas.translate(((float) view.getRight()) + f, (float) view.getTop());
            }
            this.mAdapter.onItemSwiping(canvas, c0Var, f, f2, z);
            canvas.restore();
        }
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2) {
        return c0Var.getItemViewType() == c0Var2.getItemViewType();
    }

    public void onMoved(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, int i, RecyclerView.C0792c0 c0Var2, int i2, int i3, int i4) {
        super.onMoved(recyclerView, c0Var, i, c0Var2, i2, i3, i4);
        this.mAdapter.onItemDragMoving(c0Var, c0Var2);
    }

    public void onSelectedChanged(RecyclerView.C0792c0 c0Var, int i) {
        if (i == 2 && !isViewCreateByAdapter(c0Var)) {
            this.mAdapter.onItemDragStart(c0Var);
            c0Var.itemView.setTag(C4302a.BaseQuickAdapter_dragging_support, Boolean.TRUE);
        } else if (i == 1 && !isViewCreateByAdapter(c0Var)) {
            this.mAdapter.onItemSwipeStart(c0Var);
            c0Var.itemView.setTag(C4302a.BaseQuickAdapter_swiping_support, Boolean.TRUE);
        }
        super.onSelectedChanged(c0Var, i);
    }

    public void onSwiped(RecyclerView.C0792c0 c0Var, int i) {
        if (!isViewCreateByAdapter(c0Var)) {
            this.mAdapter.onItemSwiped(c0Var);
        }
    }

    public void setDragMoveFlags(int i) {
        this.mDragMoveFlags = i;
    }

    public void setMoveThreshold(float f) {
        this.mMoveThreshold = f;
    }

    public void setSwipeMoveFlags(int i) {
        this.mSwipeMoveFlags = i;
    }

    public void setSwipeThreshold(float f) {
        this.mSwipeThreshold = f;
    }
}
