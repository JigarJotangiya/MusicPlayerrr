package p159f.p334h.p337b.p338z.p340k;

import java.util.Arrays;

/* renamed from: f.h.b.z.k.m */
/* compiled from: Settings */
public final class C7917m {

    /* renamed from: a */
    private int f33560a;

    /* renamed from: b */
    private int f33561b;

    /* renamed from: c */
    private int f33562c;

    /* renamed from: d */
    private final int[] f33563d = new int[10];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29418a() {
        this.f33562c = 0;
        this.f33561b = 0;
        this.f33560a = 0;
        Arrays.fill(this.f33563d, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo29419b(int i) {
        int i2 = mo29424g(i) ? 2 : 0;
        return mo29427j(i) ? i2 | 1 : i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo29420c(int i) {
        return this.f33563d[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo29421d() {
        if ((this.f33560a & 2) != 0) {
            return this.f33563d[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo29422e(int i) {
        return (this.f33560a & 128) != 0 ? this.f33563d[7] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo29423f(int i) {
        return (this.f33560a & 32) != 0 ? this.f33563d[5] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo29424g(int i) {
        return ((1 << i) & this.f33562c) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo29425h(int i) {
        return ((1 << i) & this.f33560a) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo29426i(C7917m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.mo29425h(i)) {
                mo29428k(i, mVar.mo29419b(i), mVar.mo29420c(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo29427j(int i) {
        return ((1 << i) & this.f33561b) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C7917m mo29428k(int i, int i2, int i3) {
        int[] iArr = this.f33563d;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f33560a |= i4;
        if ((i2 & 1) != 0) {
            this.f33561b |= i4;
        } else {
            this.f33561b &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.f33562c |= i4;
        } else {
            this.f33562c &= ~i4;
        }
        iArr[i] = i3;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo29429l() {
        return Integer.bitCount(this.f33560a);
    }
}
