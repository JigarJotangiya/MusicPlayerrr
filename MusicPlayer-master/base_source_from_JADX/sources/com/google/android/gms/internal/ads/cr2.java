package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cr2 {

    /* renamed from: a */
    private final LinkedList<lr2<?, ?>> f15138a = new LinkedList<>();

    /* renamed from: b */
    private final int f15139b;

    /* renamed from: c */
    private final int f15140c;

    /* renamed from: d */
    private final bs2 f15141d;

    public cr2(int i, int i2) {
        this.f15139b = i;
        this.f15140c = i2;
        this.f15141d = new bs2();
    }

    /* renamed from: i */
    private final void m22079i() {
        while (!this.f15138a.isEmpty() && C2971s.m13198a().mo11988a() - this.f15138a.getFirst().f19515d >= ((long) this.f15140c)) {
            this.f15141d.mo16380g();
            this.f15138a.remove();
        }
    }

    /* renamed from: a */
    public final int mo16724a() {
        return this.f15141d.mo16374a();
    }

    /* renamed from: b */
    public final int mo16725b() {
        m22079i();
        return this.f15138a.size();
    }

    /* renamed from: c */
    public final long mo16726c() {
        return this.f15141d.mo16375b();
    }

    /* renamed from: d */
    public final long mo16727d() {
        return this.f15141d.mo16376c();
    }

    /* renamed from: e */
    public final lr2<?, ?> mo16728e() {
        this.f15141d.mo16379f();
        m22079i();
        if (this.f15138a.isEmpty()) {
            return null;
        }
        lr2<?, ?> remove = this.f15138a.remove();
        if (remove != null) {
            this.f15141d.mo16381h();
        }
        return remove;
    }

    /* renamed from: f */
    public final as2 mo16729f() {
        return this.f15141d.mo16377d();
    }

    /* renamed from: g */
    public final String mo16730g() {
        return this.f15141d.mo16378e();
    }

    /* renamed from: h */
    public final boolean mo16731h(lr2<?, ?> lr2) {
        this.f15141d.mo16379f();
        m22079i();
        if (this.f15138a.size() == this.f15139b) {
            return false;
        }
        this.f15138a.add(lr2);
        return true;
    }
}
