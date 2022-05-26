package com.airbnb.lottie.p019v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.e */
/* compiled from: KeyPath */
public class C1560e {

    /* renamed from: c */
    public static final C1560e f5998c = new C1560e("COMPOSITION");

    /* renamed from: a */
    private final List<String> f5999a;

    /* renamed from: b */
    private C1561f f6000b;

    public C1560e(String... strArr) {
        this.f5999a = Arrays.asList(strArr);
    }

    /* renamed from: b */
    private boolean m7982b() {
        List<String> list = this.f5999a;
        return list.get(list.size() - 1).equals("**");
    }

    /* renamed from: f */
    private boolean m7983f(String str) {
        return "__container".equals(str);
    }

    /* renamed from: a */
    public C1560e mo7230a(String str) {
        C1560e eVar = new C1560e(this);
        eVar.f5999a.add(str);
        return eVar;
    }

    /* renamed from: c */
    public boolean mo7231c(String str, int i) {
        if (i >= this.f5999a.size()) {
            return false;
        }
        boolean z = i == this.f5999a.size() - 1;
        String str2 = this.f5999a.get(i);
        if (!str2.equals("**")) {
            boolean z2 = str2.equals(str) || str2.equals("*");
            if ((z || (i == this.f5999a.size() - 2 && m7982b())) && z2) {
                return true;
            }
            return false;
        }
        if (!z && this.f5999a.get(i + 1).equals(str)) {
            if (i == this.f5999a.size() - 2 || (i == this.f5999a.size() - 3 && m7982b())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f5999a.size() - 1) {
                return false;
            }
            return this.f5999a.get(i2).equals(str);
        }
    }

    /* renamed from: d */
    public C1561f mo7232d() {
        return this.f6000b;
    }

    /* renamed from: e */
    public int mo7233e(String str, int i) {
        if (m7983f(str)) {
            return 0;
        }
        if (!this.f5999a.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f5999a.size() - 1 && this.f5999a.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: g */
    public boolean mo7234g(String str, int i) {
        if (m7983f(str)) {
            return true;
        }
        if (i >= this.f5999a.size()) {
            return false;
        }
        if (this.f5999a.get(i).equals(str) || this.f5999a.get(i).equals("**") || this.f5999a.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo7235h(String str, int i) {
        if (!"__container".equals(str) && i >= this.f5999a.size() - 1 && !this.f5999a.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public C1560e mo7236i(C1561f fVar) {
        C1560e eVar = new C1560e(this);
        eVar.f6000b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f5999a);
        sb.append(",resolved=");
        sb.append(this.f6000b != null);
        sb.append('}');
        return sb.toString();
    }

    private C1560e(C1560e eVar) {
        this.f5999a = new ArrayList(eVar.f5999a);
        this.f6000b = eVar.f6000b;
    }
}
