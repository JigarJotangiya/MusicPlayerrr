package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b */
/* compiled from: AdapterListUpdateCallback */
public final class C0838b implements C0905s {

    /* renamed from: a */
    private final RecyclerView.C0797h f3800a;

    public C0838b(RecyclerView.C0797h hVar) {
        this.f3800a = hVar;
    }

    /* renamed from: a */
    public void mo5173a(int i, int i2) {
        this.f3800a.notifyItemMoved(i, i2);
    }

    /* renamed from: b */
    public void mo5174b(int i, int i2) {
        this.f3800a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: c */
    public void mo5175c(int i, int i2) {
        this.f3800a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: d */
    public void mo5176d(int i, int i2, Object obj) {
        this.f3800a.notifyItemRangeChanged(i, i2, obj);
    }
}
