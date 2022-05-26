package com.airbnb.lottie;

import com.airbnb.lottie.p026y.C1681f;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p082e.p098e.C3467b;

/* renamed from: com.airbnb.lottie.n */
/* compiled from: PerformanceTracker */
public class C1498n {

    /* renamed from: a */
    private boolean f5760a = false;

    /* renamed from: b */
    private final Set<C1499a> f5761b = new C3467b();

    /* renamed from: c */
    private final Map<String, C1681f> f5762c = new HashMap();

    /* renamed from: com.airbnb.lottie.n$a */
    /* compiled from: PerformanceTracker */
    public interface C1499a {
        /* renamed from: a */
        void mo7129a(float f);
    }

    /* renamed from: a */
    public void mo7127a(String str, float f) {
        if (this.f5760a) {
            C1681f fVar = this.f5762c.get(str);
            if (fVar == null) {
                fVar = new C1681f();
                this.f5762c.put(str, fVar);
            }
            fVar.mo7489a(f);
            if (str.equals("__container")) {
                for (C1499a a : this.f5761b) {
                    a.mo7129a(f);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7128b(boolean z) {
        this.f5760a = z;
    }
}
