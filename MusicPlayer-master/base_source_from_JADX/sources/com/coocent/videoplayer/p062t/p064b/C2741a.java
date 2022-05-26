package com.coocent.videoplayer.p062t.p064b;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.videoplayer.p061s.C2722b;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.t.b.a */
/* compiled from: PresetItemDecoration.kt */
public final class C2741a extends RecyclerView.C0808o {

    /* renamed from: a */
    private final int f9415a;

    /* renamed from: b */
    private int f9416b = 1;

    public C2741a(int i) {
        this.f9415a = i;
    }

    /* renamed from: d */
    public void mo4874d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        int i;
        C8594l.m46771e(rect, "outRect");
        C8594l.m46771e(view, "view");
        C8594l.m46771e(recyclerView, "parent");
        C8594l.m46771e(zVar, "state");
        RecyclerView.C0809p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.f9416b = gridLayoutManager.mo4440W2();
            i = gridLayoutManager.mo4498n2();
        } else if (layoutManager instanceof LinearLayoutManager) {
            this.f9416b = 1;
            i = ((LinearLayoutManager) layoutManager).mo4498n2();
        } else {
            i = 1;
        }
        int g0 = recyclerView.mo4600g0(view);
        int i2 = this.f9416b;
        int i3 = g0 % i2;
        if (i == 1) {
            int i4 = this.f9415a;
            rect.left = i4 - ((i3 * i4) / i2);
            rect.right = ((i3 + 1) * i4) / i2;
            rect.bottom = i4;
            if (g0 < i2) {
                rect.top = i4;
                return;
            }
            return;
        }
        int i5 = this.f9415a;
        rect.top = i5;
        rect.bottom = i5;
        if (g0 >= i2) {
            Context context = recyclerView.getContext();
            C8594l.m46770d(context, "parent.context");
            if (C2722b.m12313a(context)) {
                int i6 = this.f9415a;
                rect.right = i6 - ((i3 * i6) / this.f9416b);
                return;
            }
            int i7 = this.f9415a;
            rect.left = i7 - ((i3 * i7) / this.f9416b);
        }
    }
}
