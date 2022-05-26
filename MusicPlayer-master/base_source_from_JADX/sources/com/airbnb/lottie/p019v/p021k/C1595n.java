package com.airbnb.lottie.p019v.p021k;

import android.graphics.Path;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.p015t.p016b.C1510c;
import com.airbnb.lottie.p015t.p016b.C1514g;
import com.airbnb.lottie.p019v.p020j.C1565a;
import com.airbnb.lottie.p019v.p020j.C1568d;
import com.airbnb.lottie.p019v.p022l.C1604a;

/* renamed from: com.airbnb.lottie.v.k.n */
/* compiled from: ShapeFill */
public class C1595n implements C1581c {

    /* renamed from: a */
    private final boolean f6089a;

    /* renamed from: b */
    private final Path.FillType f6090b;

    /* renamed from: c */
    private final String f6091c;

    /* renamed from: d */
    private final C1565a f6092d;

    /* renamed from: e */
    private final C1568d f6093e;

    /* renamed from: f */
    private final boolean f6094f;

    public C1595n(String str, boolean z, Path.FillType fillType, C1565a aVar, C1568d dVar, boolean z2) {
        this.f6091c = str;
        this.f6089a = z;
        this.f6090b = fillType;
        this.f6092d = aVar;
        this.f6093e = dVar;
        this.f6094f = z2;
    }

    /* renamed from: a */
    public C1510c mo7249a(C1473f fVar, C1604a aVar) {
        return new C1514g(fVar, aVar, this);
    }

    /* renamed from: b */
    public C1565a mo7326b() {
        return this.f6092d;
    }

    /* renamed from: c */
    public Path.FillType mo7327c() {
        return this.f6090b;
    }

    /* renamed from: d */
    public String mo7328d() {
        return this.f6091c;
    }

    /* renamed from: e */
    public C1568d mo7329e() {
        return this.f6093e;
    }

    /* renamed from: f */
    public boolean mo7330f() {
        return this.f6094f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f6089a + '}';
    }
}
