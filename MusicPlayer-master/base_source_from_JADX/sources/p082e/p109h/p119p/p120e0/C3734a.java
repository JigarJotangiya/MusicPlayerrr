package p082e.p109h.p119p.p120e0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: e.h.p.e0.a */
/* compiled from: AccessibilityClickableSpanCompat */
public final class C3734a extends ClickableSpan {

    /* renamed from: g */
    private final int f11785g;

    /* renamed from: h */
    private final C3736c f11786h;

    /* renamed from: i */
    private final int f11787i;

    public C3734a(int i, C3736c cVar, int i2) {
        this.f11785g = i;
        this.f11786h = cVar;
        this.f11787i = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f11785g);
        this.f11786h.mo13102R(this.f11787i, bundle);
    }
}
