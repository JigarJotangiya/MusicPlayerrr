package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.viewpager2.adapter.a */
/* compiled from: FragmentViewHolder */
public final class C1194a extends RecyclerView.C0792c0 {
    private C1194a(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* renamed from: a */
    static C1194a m6708a(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C3774v.m16208k());
        frameLayout.setSaveEnabled(false);
        return new C1194a(frameLayout);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public FrameLayout mo6326b() {
        return (FrameLayout) this.itemView;
    }
}
