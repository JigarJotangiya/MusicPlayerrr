package com.airbnb.lottie.p015t.p017c;

import android.graphics.Color;
import android.graphics.Paint;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p024x.C1646j;
import com.airbnb.lottie.p027z.C1690c;

/* renamed from: com.airbnb.lottie.t.c.c */
/* compiled from: DropShadowKeyframeAnimation */
public class C1537c implements C1529a.C1531b {

    /* renamed from: a */
    private final C1529a.C1531b f5920a;

    /* renamed from: b */
    private final C1529a<Integer, Integer> f5921b;

    /* renamed from: c */
    private final C1529a<Float, Float> f5922c;

    /* renamed from: d */
    private final C1529a<Float, Float> f5923d;

    /* renamed from: e */
    private final C1529a<Float, Float> f5924e;

    /* renamed from: f */
    private final C1529a<Float, Float> f5925f;

    /* renamed from: g */
    private boolean f5926g = true;

    /* renamed from: com.airbnb.lottie.t.c.c$a */
    /* compiled from: DropShadowKeyframeAnimation */
    class C1538a extends C1690c<Float> {

        /* renamed from: c */
        final /* synthetic */ C1690c f5927c;

        C1538a(C1537c cVar, C1690c cVar2) {
            this.f5927c = cVar2;
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [com.airbnb.lottie.z.b<java.lang.Float>, com.airbnb.lottie.z.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Float mo6997a(com.airbnb.lottie.p027z.C1689b<java.lang.Float> r2) {
            /*
                r1 = this;
                com.airbnb.lottie.z.c r0 = r1.f5927c
                java.lang.Object r2 = r0.mo6997a(r2)
                java.lang.Float r2 = (java.lang.Float) r2
                if (r2 != 0) goto L_0x000c
                r2 = 0
                return r2
            L_0x000c:
                float r2 = r2.floatValue()
                r0 = 1076048691(0x40233333, float:2.55)
                float r2 = r2 * r0
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p015t.p017c.C1537c.C1538a.mo6997a(com.airbnb.lottie.z.b):java.lang.Float");
        }
    }

    public C1537c(C1529a.C1531b bVar, C1604a aVar, C1646j jVar) {
        this.f5920a = bVar;
        C1529a<Integer, Integer> a = jVar.mo7418a().mo7245a();
        this.f5921b = a;
        a.mo7151a(this);
        aVar.mo7366i(a);
        C1529a<Float, Float> a2 = jVar.mo7421d().mo7245a();
        this.f5922c = a2;
        a2.mo7151a(this);
        aVar.mo7366i(a2);
        C1529a<Float, Float> a3 = jVar.mo7419b().mo7245a();
        this.f5923d = a3;
        a3.mo7151a(this);
        aVar.mo7366i(a3);
        C1529a<Float, Float> a4 = jVar.mo7420c().mo7245a();
        this.f5924e = a4;
        a4.mo7151a(this);
        aVar.mo7366i(a4);
        C1529a<Float, Float> a5 = jVar.mo7422e().mo7245a();
        this.f5925f = a5;
        a5.mo7151a(this);
        aVar.mo7366i(a5);
    }

    /* renamed from: a */
    public void mo7132a() {
        this.f5926g = true;
        this.f5920a.mo7132a();
    }

    /* renamed from: b */
    public void mo7173b(Paint paint) {
        if (this.f5926g) {
            this.f5926g = false;
            double floatValue = ((double) this.f5923d.mo7157h().floatValue()) * 0.017453292519943295d;
            float floatValue2 = this.f5924e.mo7157h().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f5921b.mo7157h().intValue();
            paint.setShadowLayer(this.f5925f.mo7157h().floatValue(), sin, cos, Color.argb(Math.round(this.f5922c.mo7157h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    /* renamed from: c */
    public void mo7174c(C1690c<Integer> cVar) {
        this.f5921b.mo7163n(cVar);
    }

    /* renamed from: d */
    public void mo7175d(C1690c<Float> cVar) {
        this.f5923d.mo7163n(cVar);
    }

    /* renamed from: e */
    public void mo7176e(C1690c<Float> cVar) {
        this.f5924e.mo7163n(cVar);
    }

    /* renamed from: f */
    public void mo7177f(C1690c<Float> cVar) {
        if (cVar == null) {
            this.f5922c.mo7163n((C1690c) null);
        } else {
            this.f5922c.mo7163n(new C1538a(this, cVar));
        }
    }

    /* renamed from: g */
    public void mo7178g(C1690c<Float> cVar) {
        this.f5925f.mo7163n(cVar);
    }
}
