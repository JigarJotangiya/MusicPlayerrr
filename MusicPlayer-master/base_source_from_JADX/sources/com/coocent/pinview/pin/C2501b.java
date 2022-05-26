package com.coocent.pinview.pin;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.coocent.pinview.pin.b */
/* compiled from: ItemSpaceDecoration */
public class C2501b extends RecyclerView.C0808o {

    /* renamed from: a */
    private final int f8858a;

    /* renamed from: b */
    private final int f8859b;

    /* renamed from: c */
    private final int f8860c;

    /* renamed from: d */
    private final boolean f8861d;

    public C2501b(int i, int i2, int i3, boolean z) {
        this.f8858a = i;
        this.f8859b = i2;
        this.f8860c = i3;
        this.f8861d = z;
    }

    /* renamed from: d */
    public void mo4874d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        int g0 = recyclerView.mo4600g0(view);
        int i = this.f8860c;
        int i2 = g0 % i;
        if (this.f8861d) {
            int i3 = this.f8858a;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (g0 < i) {
                rect.top = this.f8859b;
            }
            rect.bottom = this.f8859b;
            return;
        }
        int i4 = this.f8858a;
        rect.left = (i2 * i4) / i;
        rect.right = i4 - (((i2 + 1) * i4) / i);
        if (g0 >= i) {
            rect.top = this.f8859b;
        }
    }
}
