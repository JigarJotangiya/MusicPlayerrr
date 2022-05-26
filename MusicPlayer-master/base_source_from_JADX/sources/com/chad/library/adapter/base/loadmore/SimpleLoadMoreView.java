package com.chad.library.adapter.base.loadmore;

import p159f.p164b.p165a.C4302a;
import p159f.p164b.p165a.C4303b;

public final class SimpleLoadMoreView extends LoadMoreView {
    public int getLayoutId() {
        return C4303b.quick_view_load_more;
    }

    /* access modifiers changed from: protected */
    public int getLoadEndViewId() {
        return C4302a.load_more_load_end_view;
    }

    /* access modifiers changed from: protected */
    public int getLoadFailViewId() {
        return C4302a.load_more_load_fail_view;
    }

    /* access modifiers changed from: protected */
    public int getLoadingViewId() {
        return C4302a.load_more_loading_view;
    }
}
