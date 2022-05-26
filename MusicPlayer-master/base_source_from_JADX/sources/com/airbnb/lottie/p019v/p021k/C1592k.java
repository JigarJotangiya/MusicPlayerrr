package com.airbnb.lottie.p019v.p021k;

import android.graphics.PointF;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.p015t.p016b.C1510c;
import com.airbnb.lottie.p015t.p016b.C1524o;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1577m;
import com.airbnb.lottie.p019v.p022l.C1604a;

/* renamed from: com.airbnb.lottie.v.k.k */
/* compiled from: RectangleShape */
public class C1592k implements C1581c {

    /* renamed from: a */
    private final String f6076a;

    /* renamed from: b */
    private final C1577m<PointF, PointF> f6077b;

    /* renamed from: c */
    private final C1577m<PointF, PointF> f6078c;

    /* renamed from: d */
    private final C1566b f6079d;

    /* renamed from: e */
    private final boolean f6080e;

    public C1592k(String str, C1577m<PointF, PointF> mVar, C1577m<PointF, PointF> mVar2, C1566b bVar, boolean z) {
        this.f6076a = str;
        this.f6077b = mVar;
        this.f6078c = mVar2;
        this.f6079d = bVar;
        this.f6080e = z;
    }

    /* renamed from: a */
    public C1510c mo7249a(C1473f fVar, C1604a aVar) {
        return new C1524o(fVar, aVar, this);
    }

    /* renamed from: b */
    public C1566b mo7310b() {
        return this.f6079d;
    }

    /* renamed from: c */
    public String mo7311c() {
        return this.f6076a;
    }

    /* renamed from: d */
    public C1577m<PointF, PointF> mo7312d() {
        return this.f6077b;
    }

    /* renamed from: e */
    public C1577m<PointF, PointF> mo7313e() {
        return this.f6078c;
    }

    /* renamed from: f */
    public boolean mo7314f() {
        return this.f6080e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f6077b + ", size=" + this.f6078c + '}';
    }
}
