package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o44 extends yp0 {

    /* renamed from: M */
    public static final o44 f20907M = new o44(new q44());

    /* renamed from: A */
    public final boolean f20908A;

    /* renamed from: B */
    public final boolean f20909B;

    /* renamed from: C */
    public final boolean f20910C;

    /* renamed from: D */
    public final boolean f20911D;

    /* renamed from: E */
    public final boolean f20912E;

    /* renamed from: F */
    public final boolean f20913F;

    /* renamed from: G */
    public final boolean f20914G;

    /* renamed from: H */
    public final boolean f20915H;

    /* renamed from: I */
    public final boolean f20916I;

    /* renamed from: J */
    public final boolean f20917J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final SparseArray<Map<uj0, s44>> f20918K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final SparseBooleanArray f20919L;

    /* renamed from: z */
    public final int f20920z;

    static {
        m44 m44 = m44.f19767a;
    }

    private o44(q44 q44) {
        super(q44);
        this.f20908A = q44.f21814k;
        this.f20909B = false;
        this.f20910C = q44.f21815l;
        this.f20911D = q44.f21816m;
        this.f20912E = false;
        this.f20913F = false;
        this.f20914G = false;
        this.f20920z = 0;
        this.f20915H = q44.f21817n;
        this.f20916I = false;
        this.f20917J = q44.f21818o;
        this.f20918K = q44.f21819p;
        this.f20919L = q44.f21820q;
    }

    /* renamed from: c */
    public static o44 m28286c(Context context) {
        return new o44(new q44(context));
    }

    /* renamed from: d */
    public final q44 mo19898d() {
        return new q44(this, (p44) null);
    }

    /* renamed from: e */
    public final s44 mo19899e(int i, uj0 uj0) {
        Map map = this.f20918K.get(i);
        if (map != null) {
            return (s44) map.get(uj0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o44.class == obj.getClass()) {
            o44 o44 = (o44) obj;
            if (super.equals(o44) && this.f20908A == o44.f20908A && this.f20910C == o44.f20910C && this.f20911D == o44.f20911D && this.f20915H == o44.f20915H && this.f20917J == o44.f20917J) {
                SparseBooleanArray sparseBooleanArray = this.f20919L;
                SparseBooleanArray sparseBooleanArray2 = o44.f20919L;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray<Map<uj0, s44>> sparseArray = this.f20918K;
                            SparseArray<Map<uj0, s44>> sparseArray2 = o44.f20918K;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map valueAt = sparseArray.valueAt(i2);
                                        Map valueAt2 = sparseArray2.valueAt(indexOfKey);
                                        if (valueAt2.size() == valueAt.size()) {
                                            for (Map.Entry entry : valueAt.entrySet()) {
                                                uj0 uj0 = (uj0) entry.getKey();
                                                if (valueAt2.containsKey(uj0)) {
                                                    if (!wy2.m33453p(entry.getValue(), valueAt2.get(uj0))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo19901f(int i) {
        return this.f20919L.get(i);
    }

    /* renamed from: g */
    public final boolean mo19902g(int i, uj0 uj0) {
        Map map = this.f20918K.get(i);
        return map != null && map.containsKey(uj0);
    }

    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.f20908A ? 1 : 0)) * 961) + (this.f20910C ? 1 : 0)) * 31) + (this.f20911D ? 1 : 0)) * 28629151) + (this.f20915H ? 1 : 0)) * 961) + (this.f20917J ? 1 : 0);
    }
}
