package com.chad.library.adapter.base.util;

import android.util.SparseIntArray;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import java.util.List;

public abstract class MultiTypeDelegate<T> {
    private static final int DEFAULT_VIEW_TYPE = -255;
    private boolean autoMode;
    private SparseIntArray layouts;
    private boolean selfMode;

    public MultiTypeDelegate(SparseIntArray sparseIntArray) {
        this.layouts = sparseIntArray;
    }

    private void addItemType(int i, int i2) {
        if (this.layouts == null) {
            this.layouts = new SparseIntArray();
        }
        this.layouts.put(i, i2);
    }

    private void checkMode(boolean z) {
        if (z) {
            throw new RuntimeException("Don't mess two register mode");
        }
    }

    public final int getDefItemViewType(List<T> list, int i) {
        T t = list.get(i);
        return t != null ? getItemType(t) : DEFAULT_VIEW_TYPE;
    }

    /* access modifiers changed from: protected */
    public abstract int getItemType(T t);

    public final int getLayoutId(int i) {
        return this.layouts.get(i, BaseMultiItemQuickAdapter.TYPE_NOT_FOUND);
    }

    public MultiTypeDelegate registerItemType(int i, int i2) {
        this.selfMode = true;
        checkMode(this.autoMode);
        addItemType(i, i2);
        return this;
    }

    public MultiTypeDelegate registerItemTypeAutoIncrease(int... iArr) {
        this.autoMode = true;
        checkMode(this.selfMode);
        for (int i = 0; i < iArr.length; i++) {
            addItemType(i, iArr[i]);
        }
        return this;
    }

    public MultiTypeDelegate() {
    }
}
