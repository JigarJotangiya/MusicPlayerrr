package androidx.room;

import androidx.room.C0994s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.room.q0 */
/* compiled from: QueryInterceptorStatement */
final class C0990q0 implements C4222f {

    /* renamed from: g */
    private final C4222f f4219g;

    /* renamed from: h */
    private final C0994s0.C1000f f4220h;

    /* renamed from: i */
    private final String f4221i;

    /* renamed from: j */
    private final List<Object> f4222j = new ArrayList();

    /* renamed from: k */
    private final Executor f4223k;

    C0990q0(C4222f fVar, C0994s0.C1000f fVar2, String str, Executor executor) {
        this.f4219g = fVar;
        this.f4220h = fVar2;
        this.f4221i = str;
        this.f4223k = executor;
    }

    /* renamed from: E */
    private void m5815E(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.f4222j.size()) {
            for (int size = this.f4222j.size(); size <= i2; size++) {
                this.f4222j.add((Object) null);
            }
        }
        this.f4222j.set(i2, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void mo5567d() {
        this.f4220h.mo5609a(this.f4221i, this.f4222j);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void mo5569x() {
        this.f4220h.mo5609a(this.f4221i, this.f4222j);
    }

    /* renamed from: I0 */
    public long mo5565I0() {
        this.f4223k.execute(new C0989q(this));
        return this.f4219g.mo5565I0();
    }

    /* renamed from: L */
    public void mo5557L(int i, long j) {
        m5815E(i, Long.valueOf(j));
        this.f4219g.mo5557L(i, j);
    }

    /* renamed from: S */
    public void mo5558S(int i, byte[] bArr) {
        m5815E(i, bArr);
        this.f4219g.mo5558S(i, bArr);
    }

    public void close() throws IOException {
        this.f4219g.close();
    }

    /* renamed from: k0 */
    public void mo5561k0(int i) {
        m5815E(i, this.f4222j.toArray());
        this.f4219g.mo5561k0(i);
    }

    /* renamed from: r */
    public void mo5562r(int i, String str) {
        m5815E(i, str);
        this.f4219g.mo5562r(i, str);
    }

    /* renamed from: u */
    public int mo5568u() {
        this.f4223k.execute(new C0991r(this));
        return this.f4219g.mo5568u();
    }

    /* renamed from: y */
    public void mo5563y(int i, double d) {
        m5815E(i, Double.valueOf(d));
        this.f4219g.mo5563y(i, d);
    }
}
