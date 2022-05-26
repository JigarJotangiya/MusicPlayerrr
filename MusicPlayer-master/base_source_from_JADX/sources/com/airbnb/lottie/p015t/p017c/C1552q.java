package com.airbnb.lottie.p015t.p017c;

import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1690c;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.t.c.q */
/* compiled from: ValueCallbackKeyframeAnimation */
public class C1552q<K, A> extends C1529a<K, A> {

    /* renamed from: i */
    private final A f5962i;

    public C1552q(C1690c<A> cVar) {
        this(cVar, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo7153c() {
        return 1.0f;
    }

    /* renamed from: h */
    public A mo7157h() {
        C1690c<A> cVar = this.f5910e;
        A a = this.f5962i;
        return cVar.mo7508b(0.0f, 0.0f, a, a, mo7156f(), mo7156f(), mo7156f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public A mo7158i(C1688a<K> aVar, float f) {
        return mo7157h();
    }

    /* renamed from: k */
    public void mo7160k() {
        if (this.f5910e != null) {
            super.mo7160k();
        }
    }

    /* renamed from: m */
    public void mo7162m(float f) {
        this.f5909d = f;
    }

    public C1552q(C1690c<A> cVar, A a) {
        super(Collections.emptyList());
        mo7163n(cVar);
        this.f5962i = a;
    }
}
