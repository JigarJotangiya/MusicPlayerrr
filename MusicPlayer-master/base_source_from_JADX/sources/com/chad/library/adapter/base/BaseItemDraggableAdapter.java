package com.chad.library.adapter.base;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.C0885l;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.chad.library.adapter.base.listener.OnItemSwipeListener;
import java.util.Collections;
import java.util.List;
import p082e.p109h.p119p.C3762j;
import p159f.p164b.p165a.C4302a;

public abstract class BaseItemDraggableAdapter<T, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    private static final String ERROR_NOT_SAME_ITEMTOUCHHELPER = "Item drag and item swipe should pass the same ItemTouchHelper";
    private static final int NO_TOGGLE_VIEW = 0;
    protected boolean itemDragEnabled = false;
    protected boolean itemSwipeEnabled = false;
    protected boolean mDragOnLongPress = true;
    protected C0885l mItemTouchHelper;
    protected OnItemDragListener mOnItemDragListener;
    protected OnItemSwipeListener mOnItemSwipeListener;
    protected View.OnLongClickListener mOnToggleViewLongClickListener;
    protected View.OnTouchListener mOnToggleViewTouchListener;
    protected int mToggleViewId = 0;

    public BaseItemDraggableAdapter(List<T> list) {
        super(list);
    }

    private boolean inRange(int i) {
        return i >= 0 && i < this.mData.size();
    }

    public void disableDragItem() {
        this.itemDragEnabled = false;
        this.mItemTouchHelper = null;
    }

    public void disableSwipeItem() {
        this.itemSwipeEnabled = false;
    }

    public void enableDragItem(C0885l lVar) {
        enableDragItem(lVar, 0, true);
    }

    public void enableSwipeItem() {
        this.itemSwipeEnabled = true;
    }

    public int getViewHolderPosition(RecyclerView.C0792c0 c0Var) {
        return c0Var.getAdapterPosition() - getHeaderLayoutCount();
    }

    public boolean isItemDraggable() {
        return this.itemDragEnabled;
    }

    public boolean isItemSwipeEnable() {
        return this.itemSwipeEnabled;
    }

    public void onItemDragEnd(RecyclerView.C0792c0 c0Var) {
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null && this.itemDragEnabled) {
            onItemDragListener.onItemDragEnd(c0Var, getViewHolderPosition(c0Var));
        }
    }

    public void onItemDragMoving(RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2) {
        int viewHolderPosition = getViewHolderPosition(c0Var);
        int viewHolderPosition2 = getViewHolderPosition(c0Var2);
        if (inRange(viewHolderPosition) && inRange(viewHolderPosition2)) {
            if (viewHolderPosition < viewHolderPosition2) {
                int i = viewHolderPosition;
                while (i < viewHolderPosition2) {
                    int i2 = i + 1;
                    Collections.swap(this.mData, i, i2);
                    i = i2;
                }
            } else {
                for (int i3 = viewHolderPosition; i3 > viewHolderPosition2; i3--) {
                    Collections.swap(this.mData, i3, i3 - 1);
                }
            }
            notifyItemMoved(c0Var.getAdapterPosition(), c0Var2.getAdapterPosition());
        }
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null && this.itemDragEnabled) {
            onItemDragListener.onItemDragMoving(c0Var, viewHolderPosition, c0Var2, viewHolderPosition2);
        }
    }

    public void onItemDragStart(RecyclerView.C0792c0 c0Var) {
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null && this.itemDragEnabled) {
            onItemDragListener.onItemDragStart(c0Var, getViewHolderPosition(c0Var));
        }
    }

    public void onItemSwipeClear(RecyclerView.C0792c0 c0Var) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener != null && this.itemSwipeEnabled) {
            onItemSwipeListener.clearView(c0Var, getViewHolderPosition(c0Var));
        }
    }

    public void onItemSwipeStart(RecyclerView.C0792c0 c0Var) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener != null && this.itemSwipeEnabled) {
            onItemSwipeListener.onItemSwipeStart(c0Var, getViewHolderPosition(c0Var));
        }
    }

    public void onItemSwiped(RecyclerView.C0792c0 c0Var) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener != null && this.itemSwipeEnabled) {
            onItemSwipeListener.onItemSwiped(c0Var, getViewHolderPosition(c0Var));
        }
        int viewHolderPosition = getViewHolderPosition(c0Var);
        if (inRange(viewHolderPosition)) {
            this.mData.remove(viewHolderPosition);
            notifyItemRemoved(c0Var.getAdapterPosition());
        }
    }

    public void onItemSwiping(Canvas canvas, RecyclerView.C0792c0 c0Var, float f, float f2, boolean z) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener != null && this.itemSwipeEnabled) {
            onItemSwipeListener.onItemSwipeMoving(canvas, c0Var, f, f2, z);
        }
    }

    public void setOnItemDragListener(OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    public void setOnItemSwipeListener(OnItemSwipeListener onItemSwipeListener) {
        this.mOnItemSwipeListener = onItemSwipeListener;
    }

    public void setToggleDragOnLongPress(boolean z) {
        this.mDragOnLongPress = z;
        if (z) {
            this.mOnToggleViewTouchListener = null;
            this.mOnToggleViewLongClickListener = new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    BaseItemDraggableAdapter baseItemDraggableAdapter = BaseItemDraggableAdapter.this;
                    C0885l lVar = baseItemDraggableAdapter.mItemTouchHelper;
                    if (lVar == null || !baseItemDraggableAdapter.itemDragEnabled) {
                        return true;
                    }
                    lVar.mo5308E((RecyclerView.C0792c0) view.getTag(C4302a.BaseQuickAdapter_viewholder_support));
                    return true;
                }
            };
            return;
        }
        this.mOnToggleViewTouchListener = new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (C3762j.m16107c(motionEvent) != 0) {
                    return false;
                }
                BaseItemDraggableAdapter baseItemDraggableAdapter = BaseItemDraggableAdapter.this;
                if (baseItemDraggableAdapter.mDragOnLongPress) {
                    return false;
                }
                C0885l lVar = baseItemDraggableAdapter.mItemTouchHelper;
                if (lVar == null || !baseItemDraggableAdapter.itemDragEnabled) {
                    return true;
                }
                lVar.mo5308E((RecyclerView.C0792c0) view.getTag(C4302a.BaseQuickAdapter_viewholder_support));
                return true;
            }
        };
        this.mOnToggleViewLongClickListener = null;
    }

    public void setToggleViewId(int i) {
        this.mToggleViewId = i;
    }

    public void enableDragItem(C0885l lVar, int i, boolean z) {
        this.itemDragEnabled = true;
        this.mItemTouchHelper = lVar;
        setToggleViewId(i);
        setToggleDragOnLongPress(z);
    }

    public void onBindViewHolder(K k, int i) {
        super.onBindViewHolder(k, i);
        int itemViewType = k.getItemViewType();
        if (this.mItemTouchHelper != null && this.itemDragEnabled && itemViewType != 546 && itemViewType != 273 && itemViewType != 1365 && itemViewType != 819) {
            int i2 = this.mToggleViewId;
            if (i2 != 0) {
                View view = k.getView(i2);
                if (view != null) {
                    view.setTag(C4302a.BaseQuickAdapter_viewholder_support, k);
                    if (this.mDragOnLongPress) {
                        view.setOnLongClickListener(this.mOnToggleViewLongClickListener);
                    } else {
                        view.setOnTouchListener(this.mOnToggleViewTouchListener);
                    }
                }
            } else {
                k.itemView.setTag(C4302a.BaseQuickAdapter_viewholder_support, k);
                k.itemView.setOnLongClickListener(this.mOnToggleViewLongClickListener);
            }
        }
    }

    public BaseItemDraggableAdapter(int i, List<T> list) {
        super(i, list);
    }
}
