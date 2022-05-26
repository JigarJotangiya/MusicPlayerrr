package com.airbnb.lottie.p019v.p021k;

import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.p015t.p016b.C1510c;
import com.airbnb.lottie.p015t.p016b.C1519l;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p026y.C1679d;

/* renamed from: com.airbnb.lottie.v.k.i */
/* compiled from: MergePaths */
public class C1588i implements C1581c {

    /* renamed from: a */
    private final String f6061a;

    /* renamed from: b */
    private final C1589a f6062b;

    /* renamed from: c */
    private final boolean f6063c;

    /* renamed from: com.airbnb.lottie.v.k.i$a */
    /* compiled from: MergePaths */
    public enum C1589a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static C1589a forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public C1588i(String str, C1589a aVar, boolean z) {
        this.f6061a = str;
        this.f6062b = aVar;
        this.f6063c = z;
    }

    /* renamed from: a */
    public C1510c mo7249a(C1473f fVar, C1604a aVar) {
        if (fVar.mo7090o()) {
            return new C1519l(this);
        }
        C1679d.m8416c("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public C1589a mo7296b() {
        return this.f6062b;
    }

    /* renamed from: c */
    public String mo7297c() {
        return this.f6061a;
    }

    /* renamed from: d */
    public boolean mo7298d() {
        return this.f6063c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f6062b + '}';
    }
}
