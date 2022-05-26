package com.airbnb.lottie.p015t.p016b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.p021k.C1590j;
import com.airbnb.lottie.p019v.p021k.C1602r;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1690c;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.b.n */
/* compiled from: PolystarContent */
public class C1522n implements C1521m, C1529a.C1531b, C1518k {

    /* renamed from: a */
    private final Path f5854a = new Path();

    /* renamed from: b */
    private final String f5855b;

    /* renamed from: c */
    private final C1473f f5856c;

    /* renamed from: d */
    private final C1590j.C1591a f5857d;

    /* renamed from: e */
    private final boolean f5858e;

    /* renamed from: f */
    private final C1529a<?, Float> f5859f;

    /* renamed from: g */
    private final C1529a<?, PointF> f5860g;

    /* renamed from: h */
    private final C1529a<?, Float> f5861h;

    /* renamed from: i */
    private final C1529a<?, Float> f5862i;

    /* renamed from: j */
    private final C1529a<?, Float> f5863j;

    /* renamed from: k */
    private final C1529a<?, Float> f5864k;

    /* renamed from: l */
    private final C1529a<?, Float> f5865l;

    /* renamed from: m */
    private C1509b f5866m = new C1509b();

    /* renamed from: n */
    private boolean f5867n;

    /* renamed from: com.airbnb.lottie.t.b.n$a */
    /* compiled from: PolystarContent */
    static /* synthetic */ class C1523a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5868a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.v.k.j$a[] r0 = com.airbnb.lottie.p019v.p021k.C1590j.C1591a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5868a = r0
                com.airbnb.lottie.v.k.j$a r1 = com.airbnb.lottie.p019v.p021k.C1590j.C1591a.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5868a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.v.k.j$a r1 = com.airbnb.lottie.p019v.p021k.C1590j.C1591a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p015t.p016b.C1522n.C1523a.<clinit>():void");
        }
    }

    public C1522n(C1473f fVar, C1604a aVar, C1590j jVar) {
        this.f5856c = fVar;
        this.f5855b = jVar.mo7302d();
        C1590j.C1591a j = jVar.mo7308j();
        this.f5857d = j;
        this.f5858e = jVar.mo7309k();
        C1529a<Float, Float> a = jVar.mo7305g().mo7245a();
        this.f5859f = a;
        C1529a<PointF, PointF> a2 = jVar.mo7306h().mo7245a();
        this.f5860g = a2;
        C1529a<Float, Float> a3 = jVar.mo7307i().mo7245a();
        this.f5861h = a3;
        C1529a<Float, Float> a4 = jVar.mo7303e().mo7245a();
        this.f5863j = a4;
        C1529a<Float, Float> a5 = jVar.mo7304f().mo7245a();
        this.f5865l = a5;
        C1590j.C1591a aVar2 = C1590j.C1591a.STAR;
        if (j == aVar2) {
            this.f5862i = jVar.mo7300b().mo7245a();
            this.f5864k = jVar.mo7301c().mo7245a();
        } else {
            this.f5862i = null;
            this.f5864k = null;
        }
        aVar.mo7366i(a);
        aVar.mo7366i(a2);
        aVar.mo7366i(a3);
        aVar.mo7366i(a4);
        aVar.mo7366i(a5);
        if (j == aVar2) {
            aVar.mo7366i(this.f5862i);
            aVar.mo7366i(this.f5864k);
        }
        a.mo7151a(this);
        a2.mo7151a(this);
        a3.mo7151a(this);
        a4.mo7151a(this);
        a5.mo7151a(this);
        if (j == aVar2) {
            this.f5862i.mo7151a(this);
            this.f5864k.mo7151a(this);
        }
    }

    /* renamed from: e */
    private void m7830e() {
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor((double) this.f5859f.mo7157h().floatValue());
        C1529a<?, Float> aVar = this.f5861h;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) aVar.mo7157h().floatValue()) - 90.0d);
        double d4 = (double) floor;
        float floatValue = this.f5865l.mo7157h().floatValue() / 100.0f;
        float floatValue2 = this.f5863j.mo7157h().floatValue();
        double d5 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f5854a.moveTo(cos, sin);
        double d6 = (double) ((float) (6.283185307179586d / d4));
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (((double) i2) < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d3 = d5;
                i = i2;
                d2 = d7;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d = d6;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f = floatValue2 * floatValue * 0.25f;
                this.f5854a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d2 = d7;
                d3 = d5;
                d = d6;
                i = i2;
                this.f5854a.lineTo(cos2, sin2);
            }
            d7 = d2 + d;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d3;
            d6 = d;
        }
        PointF h = this.f5860g.mo7157h();
        this.f5854a.offset(h.x, h.y);
        this.f5854a.close();
    }

    /* renamed from: h */
    private void m7831h() {
        double d;
        int i;
        float f;
        float f2;
        float f3;
        double d2;
        float f4;
        float f5;
        double d3;
        float f6;
        float f7;
        float f8;
        float f9;
        float floatValue = this.f5859f.mo7157h().floatValue();
        C1529a<?, Float> aVar = this.f5861h;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) aVar.mo7157h().floatValue()) - 90.0d);
        double d4 = (double) floatValue;
        float f10 = (float) (6.283185307179586d / d4);
        float f11 = f10 / 2.0f;
        float f12 = floatValue - ((float) ((int) floatValue));
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f12) * f11);
        }
        float floatValue2 = this.f5863j.mo7157h().floatValue();
        float floatValue3 = this.f5862i.mo7157h().floatValue();
        C1529a<?, Float> aVar2 = this.f5864k;
        float floatValue4 = aVar2 != null ? aVar2.mo7157h().floatValue() / 100.0f : 0.0f;
        C1529a<?, Float> aVar3 = this.f5865l;
        float floatValue5 = aVar3 != null ? aVar3.mo7157h().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f = ((floatValue2 - floatValue3) * f12) + floatValue3;
            i = i2;
            double d5 = (double) f;
            d = d4;
            f3 = (float) (d5 * Math.cos(radians));
            f2 = (float) (d5 * Math.sin(radians));
            this.f5854a.moveTo(f3, f2);
            d2 = radians + ((double) ((f10 * f12) / 2.0f));
        } else {
            d = d4;
            i = i2;
            double d6 = (double) floatValue2;
            float cos = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.f5854a.moveTo(cos, sin);
            d2 = radians + ((double) f11);
            f3 = cos;
            f2 = sin;
            f = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        float f13 = floatValue2;
        float f14 = floatValue3;
        int i3 = 0;
        boolean z = false;
        while (true) {
            double d7 = (double) i3;
            if (d7 < ceil) {
                float f15 = z ? f13 : f14;
                int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i4 == 0 || d7 != ceil - 2.0d) {
                    f4 = f10;
                    f5 = f11;
                } else {
                    f4 = f10;
                    f5 = (f10 * f12) / 2.0f;
                }
                if (i4 == 0 || d7 != ceil - 1.0d) {
                    f6 = f11;
                    d3 = d7;
                    f7 = f15;
                } else {
                    f6 = f11;
                    d3 = d7;
                    f7 = f;
                }
                double d8 = (double) f7;
                double d9 = ceil;
                float cos2 = (float) (d8 * Math.cos(d2));
                float sin2 = (float) (d8 * Math.sin(d2));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f5854a.lineTo(cos2, sin2);
                    f9 = floatValue4;
                    f8 = f;
                } else {
                    f9 = floatValue4;
                    f8 = f;
                    double atan2 = (double) ((float) (Math.atan2((double) f2, (double) f3) - 1.5707963267948966d));
                    float sin3 = (float) Math.sin(atan2);
                    float cos3 = (float) Math.cos(atan2);
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f16 = z ? f9 : floatValue5;
                    float f17 = z ? floatValue5 : f9;
                    float f18 = (z ? f14 : f13) * f16 * 0.47829f;
                    float f19 = cos3 * f18;
                    float f20 = f18 * sin3;
                    float f21 = (z ? f13 : f14) * f17 * 0.47829f;
                    float f22 = cos4 * f21;
                    float f23 = f21 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f19 *= f12;
                            f20 *= f12;
                        } else if (d3 == d9 - 1.0d) {
                            f22 *= f12;
                            f23 *= f12;
                        }
                    }
                    this.f5854a.cubicTo(f3 - f19, f2 - f20, cos2 + f22, sin2 + f23, cos2, sin2);
                }
                d2 += (double) f5;
                z = !z;
                i3++;
                f3 = cos2;
                f2 = sin2;
                floatValue4 = f9;
                f = f8;
                f11 = f6;
                f10 = f4;
                ceil = d9;
            } else {
                PointF h = this.f5860g.mo7157h();
                this.f5854a.offset(h.x, h.y);
                this.f5854a.close();
                return;
            }
        }
    }

    /* renamed from: i */
    private void m7832i() {
        this.f5867n = false;
        this.f5856c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo7132a() {
        m7832i();
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1510c cVar = list.get(i);
            if (cVar instanceof C1528s) {
                C1528s sVar = (C1528s) cVar;
                if (sVar.mo7149i() == C1602r.C1603a.SIMULTANEOUSLY) {
                    this.f5866m.mo7138a(sVar);
                    sVar.mo7145c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo7134c(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
        C1682g.m8454m(eVar, i, list, eVar2, this);
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        C1529a<?, Float> aVar;
        C1529a<?, Float> aVar2;
        if (t == C1493k.f5747w) {
            this.f5859f.mo7163n(cVar);
        } else if (t == C1493k.f5748x) {
            this.f5861h.mo7163n(cVar);
        } else if (t == C1493k.f5738n) {
            this.f5860g.mo7163n(cVar);
        } else if (t == C1493k.f5749y && (aVar2 = this.f5862i) != null) {
            aVar2.mo7163n(cVar);
        } else if (t == C1493k.f5750z) {
            this.f5863j.mo7163n(cVar);
        } else if (t == C1493k.f5711A && (aVar = this.f5864k) != null) {
            aVar.mo7163n(cVar);
        } else if (t == C1493k.f5712B) {
            this.f5865l.mo7163n(cVar);
        }
    }

    public String getName() {
        return this.f5855b;
    }

    public Path getPath() {
        if (this.f5867n) {
            return this.f5854a;
        }
        this.f5854a.reset();
        if (this.f5858e) {
            this.f5867n = true;
            return this.f5854a;
        }
        int i = C1523a.f5868a[this.f5857d.ordinal()];
        if (i == 1) {
            m7831h();
        } else if (i == 2) {
            m7830e();
        }
        this.f5854a.close();
        this.f5866m.mo7139b(this.f5854a);
        this.f5867n = true;
        return this.f5854a;
    }
}
