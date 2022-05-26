package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class iy3 implements kx3 {

    /* renamed from: b */
    protected ix3 f18277b;

    /* renamed from: c */
    protected ix3 f18278c;

    /* renamed from: d */
    private ix3 f18279d;

    /* renamed from: e */
    private ix3 f18280e;

    /* renamed from: f */
    private ByteBuffer f18281f;

    /* renamed from: g */
    private ByteBuffer f18282g;

    /* renamed from: h */
    private boolean f18283h;

    public iy3() {
        ByteBuffer byteBuffer = kx3.f19102a;
        this.f18281f = byteBuffer;
        this.f18282g = byteBuffer;
        ix3 ix3 = ix3.f18270e;
        this.f18279d = ix3;
        this.f18280e = ix3;
        this.f18277b = ix3;
        this.f18278c = ix3;
    }

    /* renamed from: a */
    public ByteBuffer mo17059a() {
        ByteBuffer byteBuffer = this.f18282g;
        this.f18282g = kx3.f19102a;
        return byteBuffer;
    }

    /* renamed from: b */
    public final void mo17060b() {
        this.f18282g = kx3.f19102a;
        this.f18283h = false;
        this.f18277b = this.f18279d;
        this.f18278c = this.f18280e;
        mo16433k();
    }

    /* renamed from: c */
    public final void mo17061c() {
        mo17060b();
        this.f18281f = kx3.f19102a;
        ix3 ix3 = ix3.f18270e;
        this.f18279d = ix3;
        this.f18280e = ix3;
        this.f18277b = ix3;
        this.f18278c = ix3;
        mo16435m();
    }

    /* renamed from: d */
    public boolean mo16432d() {
        return this.f18280e != ix3.f18270e;
    }

    /* renamed from: e */
    public boolean mo17062e() {
        return this.f18283h && this.f18282g == kx3.f19102a;
    }

    /* renamed from: f */
    public final void mo17063f() {
        this.f18283h = true;
        mo16434l();
    }

    /* renamed from: g */
    public final ix3 mo17064g(ix3 ix3) throws jx3 {
        this.f18279d = ix3;
        this.f18280e = mo15992i(ix3);
        return mo16432d() ? this.f18280e : ix3.f18270e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract ix3 mo15992i(ix3 ix3) throws jx3;

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final ByteBuffer mo18520j(int i) {
        if (this.f18281f.capacity() < i) {
            this.f18281f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f18281f.clear();
        }
        ByteBuffer byteBuffer = this.f18281f;
        this.f18282g = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo16433k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo16434l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo16435m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo18521n() {
        return this.f18282g.hasRemaining();
    }
}
