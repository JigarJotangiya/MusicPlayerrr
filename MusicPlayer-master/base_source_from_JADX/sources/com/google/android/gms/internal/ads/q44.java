package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q44 extends vm0 {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f21814k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f21815l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f21816m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f21817n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f21818o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final SparseArray<Map<uj0, s44>> f21819p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final SparseBooleanArray f21820q;

    @Deprecated
    public q44() {
        this.f21819p = new SparseArray<>();
        this.f21820q = new SparseBooleanArray();
        m29361u();
    }

    /* renamed from: u */
    private final void m29361u() {
        this.f21814k = true;
        this.f21815l = true;
        this.f21816m = true;
        this.f21817n = true;
        this.f21818o = true;
    }

    /* renamed from: e */
    public final /* synthetic */ vm0 mo20395e(int i, int i2, boolean z) {
        super.mo20395e(i, i2, true);
        return this;
    }

    /* renamed from: o */
    public final q44 mo20396o(int i, boolean z) {
        if (this.f21820q.get(i) == z) {
            return this;
        }
        if (z) {
            this.f21820q.put(i, true);
        } else {
            this.f21820q.delete(i);
        }
        return this;
    }

    public q44(Context context) {
        super.mo21563d(context);
        Point d0 = wy2.m33439d0(context);
        mo20395e(d0.x, d0.y, true);
        this.f21819p = new SparseArray<>();
        this.f21820q = new SparseBooleanArray();
        m29361u();
    }

    /* synthetic */ q44(o44 o44, p44 p44) {
        super(o44);
        this.f21814k = o44.f20908A;
        this.f21815l = o44.f20910C;
        this.f21816m = o44.f20911D;
        this.f21817n = o44.f20915H;
        this.f21818o = o44.f20917J;
        SparseArray a = o44.f20918K;
        SparseArray<Map<uj0, s44>> sparseArray = new SparseArray<>();
        for (int i = 0; i < a.size(); i++) {
            sparseArray.put(a.keyAt(i), new HashMap((Map) a.valueAt(i)));
        }
        this.f21819p = sparseArray;
        this.f21820q = o44.f20919L.clone();
    }
}
