package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.x */
/* compiled from: ScrollbarHelper */
class C0915x {
    /* renamed from: a */
    static int m5633a(RecyclerView.C0826z zVar, C0908u uVar, View view, View view2, RecyclerView.C0809p pVar, boolean z) {
        if (pVar.mo4901K() == 0 || zVar.mo5057b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.mo4941i0(view) - pVar.mo4941i0(view2)) + 1;
        }
        return Math.min(uVar.mo5397n(), uVar.mo5387d(view2) - uVar.mo5390g(view));
    }

    /* renamed from: b */
    static int m5634b(RecyclerView.C0826z zVar, C0908u uVar, View view, View view2, RecyclerView.C0809p pVar, boolean z, boolean z2) {
        int i;
        if (pVar.mo4901K() == 0 || zVar.mo5057b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.mo4941i0(view), pVar.mo4941i0(view2));
        int max = Math.max(pVar.mo4941i0(view), pVar.mo4941i0(view2));
        if (z2) {
            i = Math.max(0, (zVar.mo5057b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(uVar.mo5387d(view2) - uVar.mo5390g(view))) / ((float) (Math.abs(pVar.mo4941i0(view) - pVar.mo4941i0(view2)) + 1)))) + ((float) (uVar.mo5396m() - uVar.mo5390g(view))));
    }

    /* renamed from: c */
    static int m5635c(RecyclerView.C0826z zVar, C0908u uVar, View view, View view2, RecyclerView.C0809p pVar, boolean z) {
        if (pVar.mo4901K() == 0 || zVar.mo5057b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zVar.mo5057b();
        }
        return (int) ((((float) (uVar.mo5387d(view2) - uVar.mo5390g(view))) / ((float) (Math.abs(pVar.mo4941i0(view) - pVar.mo4941i0(view2)) + 1))) * ((float) zVar.mo5057b()));
    }
}
