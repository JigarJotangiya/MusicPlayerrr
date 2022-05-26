package com.airbnb.lottie.p019v.p021k;

import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.p015t.p016b.C1510c;
import com.airbnb.lottie.p015t.p016b.C1528s;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p022l.C1604a;

/* renamed from: com.airbnb.lottie.v.k.r */
/* compiled from: ShapeTrimPath */
public class C1602r implements C1581c {

    /* renamed from: a */
    private final String f6116a;

    /* renamed from: b */
    private final C1603a f6117b;

    /* renamed from: c */
    private final C1566b f6118c;

    /* renamed from: d */
    private final C1566b f6119d;

    /* renamed from: e */
    private final C1566b f6120e;

    /* renamed from: f */
    private final boolean f6121f;

    /* renamed from: com.airbnb.lottie.v.k.r$a */
    /* compiled from: ShapeTrimPath */
    public enum C1603a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static C1603a forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public C1602r(String str, C1603a aVar, C1566b bVar, C1566b bVar2, C1566b bVar3, boolean z) {
        this.f6116a = str;
        this.f6117b = aVar;
        this.f6118c = bVar;
        this.f6119d = bVar2;
        this.f6120e = bVar3;
        this.f6121f = z;
    }

    /* renamed from: a */
    public C1510c mo7249a(C1473f fVar, C1604a aVar) {
        return new C1528s(aVar, this);
    }

    /* renamed from: b */
    public C1566b mo7352b() {
        return this.f6119d;
    }

    /* renamed from: c */
    public String mo7353c() {
        return this.f6116a;
    }

    /* renamed from: d */
    public C1566b mo7354d() {
        return this.f6120e;
    }

    /* renamed from: e */
    public C1566b mo7355e() {
        return this.f6118c;
    }

    /* renamed from: f */
    public C1603a mo7356f() {
        return this.f6117b;
    }

    /* renamed from: g */
    public boolean mo7357g() {
        return this.f6121f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f6118c + ", end: " + this.f6119d + ", offset: " + this.f6120e + "}";
    }
}
