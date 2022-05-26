package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: g */
    boolean f2752g;

    /* renamed from: h */
    private final Runnable f2753h;

    /* renamed from: i */
    private final Runnable f2754i;

    public ContentLoadingProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void mo3351b() {
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void mo3352d() {
        if (!this.f2752g) {
            System.currentTimeMillis();
            setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m3306e() {
        removeCallbacks(this.f2753h);
        removeCallbacks(this.f2754i);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3306e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3306e();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2752g = false;
        this.f2753h = new C0543a(this);
        this.f2754i = new C0544b(this);
    }
}
