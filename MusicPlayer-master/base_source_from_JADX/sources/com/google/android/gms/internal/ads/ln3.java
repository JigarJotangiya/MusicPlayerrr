package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ln3 extends nn3 {
    /* synthetic */ ln3(kn3 kn3) {
        super((mn3) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo18686a(Object obj, long j) {
        ym3 ym3 = (ym3) vp3.m32648p(obj, j);
        if (ym3.mo21839b()) {
            return ym3;
        }
        int size = ym3.size();
        ym3 f = ym3.mo15868f(size == 0 ? 10 : size + size);
        vp3.m32628D(obj, j, f);
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18687b(Object obj, long j) {
        ((ym3) vp3.m32648p(obj, j)).mo21838a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final <E> void mo18688c(Object obj, Object obj2, long j) {
        ym3 ym3 = (ym3) vp3.m32648p(obj, j);
        ym3 ym32 = (ym3) vp3.m32648p(obj2, j);
        int size = ym3.size();
        int size2 = ym32.size();
        if (size > 0 && size2 > 0) {
            if (!ym3.mo21839b()) {
                ym3 = ym3.mo15868f(size2 + size);
            }
            ym3.addAll(ym32);
        }
        if (size > 0) {
            ym32 = ym3;
        }
        vp3.m32628D(obj, j, ym32);
    }
}
