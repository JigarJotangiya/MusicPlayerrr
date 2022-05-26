package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p082e.p096c.C3459a;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: g */
    private final int f1474g = getResources().getDimensionPixelOffset(C3459a.browser_actions_context_menu_min_padding);

    /* renamed from: h */
    private final int f1475h = getResources().getDimensionPixelOffset(C3459a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1474g * 2), this.f1475h), 1073741824), i2);
    }
}
