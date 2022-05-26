package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C3237c;
import com.google.android.gms.common.api.C3147a;

/* renamed from: com.google.android.gms.common.internal.a0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3253a0 {

    /* renamed from: a */
    private final SparseIntArray f10567a = new SparseIntArray();

    /* renamed from: b */
    private C3237c f10568b;

    public C3253a0(C3237c cVar) {
        C3292l.m14240h(cVar);
        this.f10568b = cVar;
    }

    /* renamed from: a */
    public final int mo11749a(Context context, C3147a.C3156f fVar) {
        C3292l.m14240h(context);
        C3292l.m14240h(fVar);
        int i = 0;
        if (!fVar.mo11512j()) {
            return 0;
        }
        int l = fVar.mo11513l();
        int b = mo11750b(context, l);
        if (b == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f10567a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f10567a.keyAt(i2);
                if (keyAt > l && this.f10567a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            b = i == -1 ? this.f10568b.mo11680h(context, l) : i;
            this.f10567a.put(l, b);
        }
        return b;
    }

    /* renamed from: b */
    public final int mo11750b(Context context, int i) {
        return this.f10567a.get(i, -1);
    }

    /* renamed from: c */
    public final void mo11751c() {
        this.f10567a.clear();
    }
}
