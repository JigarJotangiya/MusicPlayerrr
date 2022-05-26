package org.jsoup.nodes;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class BooleanAttribute extends Attribute {
    public BooleanAttribute(String str) {
        super(str, BuildConfig.FLAVOR);
    }

    /* access modifiers changed from: protected */
    public boolean isBooleanAttribute() {
        return true;
    }
}
