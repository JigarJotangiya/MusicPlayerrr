package androidx.room;

import java.util.ArrayList;
import java.util.List;
import p082e.p149u.p150a.C4220d;

/* renamed from: androidx.room.p0 */
/* compiled from: QueryInterceptorProgram */
final class C0988p0 implements C4220d {

    /* renamed from: g */
    private List<Object> f4217g = new ArrayList();

    C0988p0() {
    }

    /* renamed from: d */
    private void m5808d(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.f4217g.size()) {
            for (int size = this.f4217g.size(); size <= i2; size++) {
                this.f4217g.add((Object) null);
            }
        }
        this.f4217g.set(i2, obj);
    }

    /* renamed from: L */
    public void mo5557L(int i, long j) {
        m5808d(i, Long.valueOf(j));
    }

    /* renamed from: S */
    public void mo5558S(int i, byte[] bArr) {
        m5808d(i, bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<Object> mo5559c() {
        return this.f4217g;
    }

    public void close() {
    }

    /* renamed from: k0 */
    public void mo5561k0(int i) {
        m5808d(i, (Object) null);
    }

    /* renamed from: r */
    public void mo5562r(int i, String str) {
        m5808d(i, str);
    }

    /* renamed from: y */
    public void mo5563y(int i, double d) {
        m5808d(i, Double.valueOf(d));
    }
}
