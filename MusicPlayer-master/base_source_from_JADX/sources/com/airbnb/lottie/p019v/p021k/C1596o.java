package com.airbnb.lottie.p019v.p021k;

import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.p015t.p016b.C1510c;
import com.airbnb.lottie.p015t.p016b.C1511d;
import com.airbnb.lottie.p019v.p022l.C1604a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.k.o */
/* compiled from: ShapeGroup */
public class C1596o implements C1581c {

    /* renamed from: a */
    private final String f6095a;

    /* renamed from: b */
    private final List<C1581c> f6096b;

    /* renamed from: c */
    private final boolean f6097c;

    public C1596o(String str, List<C1581c> list, boolean z) {
        this.f6095a = str;
        this.f6096b = list;
        this.f6097c = z;
    }

    /* renamed from: a */
    public C1510c mo7249a(C1473f fVar, C1604a aVar) {
        return new C1511d(fVar, aVar, this);
    }

    /* renamed from: b */
    public List<C1581c> mo7332b() {
        return this.f6096b;
    }

    /* renamed from: c */
    public String mo7333c() {
        return this.f6095a;
    }

    /* renamed from: d */
    public boolean mo7334d() {
        return this.f6097c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f6095a + "' Shapes: " + Arrays.toString(this.f6096b.toArray()) + '}';
    }
}
