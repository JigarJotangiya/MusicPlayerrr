package com.airbnb.lottie.p019v.p021k;

import android.graphics.PointF;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.p015t.p016b.C1510c;
import com.airbnb.lottie.p015t.p016b.C1522n;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1577m;
import com.airbnb.lottie.p019v.p022l.C1604a;

/* renamed from: com.airbnb.lottie.v.k.j */
/* compiled from: PolystarShape */
public class C1590j implements C1581c {

    /* renamed from: a */
    private final String f6065a;

    /* renamed from: b */
    private final C1591a f6066b;

    /* renamed from: c */
    private final C1566b f6067c;

    /* renamed from: d */
    private final C1577m<PointF, PointF> f6068d;

    /* renamed from: e */
    private final C1566b f6069e;

    /* renamed from: f */
    private final C1566b f6070f;

    /* renamed from: g */
    private final C1566b f6071g;

    /* renamed from: h */
    private final C1566b f6072h;

    /* renamed from: i */
    private final C1566b f6073i;

    /* renamed from: j */
    private final boolean f6074j;

    /* renamed from: com.airbnb.lottie.v.k.j$a */
    /* compiled from: PolystarShape */
    public enum C1591a {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        private C1591a(int i) {
            this.value = i;
        }

        public static C1591a forValue(int i) {
            for (C1591a aVar : values()) {
                if (aVar.value == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C1590j(String str, C1591a aVar, C1566b bVar, C1577m<PointF, PointF> mVar, C1566b bVar2, C1566b bVar3, C1566b bVar4, C1566b bVar5, C1566b bVar6, boolean z) {
        this.f6065a = str;
        this.f6066b = aVar;
        this.f6067c = bVar;
        this.f6068d = mVar;
        this.f6069e = bVar2;
        this.f6070f = bVar3;
        this.f6071g = bVar4;
        this.f6072h = bVar5;
        this.f6073i = bVar6;
        this.f6074j = z;
    }

    /* renamed from: a */
    public C1510c mo7249a(C1473f fVar, C1604a aVar) {
        return new C1522n(fVar, aVar, this);
    }

    /* renamed from: b */
    public C1566b mo7300b() {
        return this.f6070f;
    }

    /* renamed from: c */
    public C1566b mo7301c() {
        return this.f6072h;
    }

    /* renamed from: d */
    public String mo7302d() {
        return this.f6065a;
    }

    /* renamed from: e */
    public C1566b mo7303e() {
        return this.f6071g;
    }

    /* renamed from: f */
    public C1566b mo7304f() {
        return this.f6073i;
    }

    /* renamed from: g */
    public C1566b mo7305g() {
        return this.f6067c;
    }

    /* renamed from: h */
    public C1577m<PointF, PointF> mo7306h() {
        return this.f6068d;
    }

    /* renamed from: i */
    public C1566b mo7307i() {
        return this.f6069e;
    }

    /* renamed from: j */
    public C1591a mo7308j() {
        return this.f6066b;
    }

    /* renamed from: k */
    public boolean mo7309k() {
        return this.f6074j;
    }
}
