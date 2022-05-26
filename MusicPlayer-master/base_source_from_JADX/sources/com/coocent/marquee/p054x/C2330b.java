package com.coocent.marquee.p054x;

import androidx.recyclerview.widget.C0885l;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.coocent.marquee.x.b */
/* compiled from: EQItemTouchHelperCallback */
public class C2330b extends C0885l.C0891f {

    /* renamed from: a */
    private C2331a f8187a;

    /* renamed from: b */
    private boolean f8188b = false;

    /* renamed from: c */
    private boolean f8189c = false;

    /* renamed from: com.coocent.marquee.x.b$a */
    /* compiled from: EQItemTouchHelperCallback */
    public interface C2331a {
        /* renamed from: B0 */
        boolean mo9086B0(int i, int i2);

        /* renamed from: S0 */
        void mo9087S0();

        /* renamed from: p0 */
        void mo9090p0(int i);
    }

    public C2330b(C2331a aVar) {
        this.f8187a = aVar;
    }

    /* renamed from: a */
    public void mo9127a(boolean z) {
        this.f8188b = z;
    }

    /* renamed from: b */
    public void mo9128b(boolean z) {
        this.f8189c = z;
    }

    public void clearView(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var) {
        super.clearView(recyclerView, c0Var);
        C2331a aVar = this.f8187a;
        if (aVar != null) {
            aVar.mo9087S0();
        }
    }

    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var) {
        RecyclerView.C0809p layoutManager = recyclerView.getLayoutManager();
        int i = 0;
        if (layoutManager instanceof GridLayoutManager) {
            return C0885l.C0891f.makeMovementFlags(15, 0);
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        int n2 = ((LinearLayoutManager) layoutManager).mo4498n2();
        int i2 = 12;
        if (n2 == 0) {
            i2 = 3;
            i = 12;
        } else if (n2 == 1) {
            i = 3;
        } else {
            i2 = 0;
        }
        return C0885l.C0891f.makeMovementFlags(i, i2);
    }

    public boolean isItemViewSwipeEnabled() {
        return this.f8189c;
    }

    public boolean isLongPressDragEnabled() {
        return this.f8188b;
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2) {
        C2331a aVar = this.f8187a;
        if (aVar != null) {
            return aVar.mo9086B0(c0Var.getAdapterPosition(), c0Var2.getAdapterPosition());
        }
        return false;
    }

    public void onSwiped(RecyclerView.C0792c0 c0Var, int i) {
        C2331a aVar = this.f8187a;
        if (aVar != null) {
            aVar.mo9090p0(c0Var.getAdapterPosition());
        }
    }
}
