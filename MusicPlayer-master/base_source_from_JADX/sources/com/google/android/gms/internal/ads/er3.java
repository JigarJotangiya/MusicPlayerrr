package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class er3 implements C5142h7 {

    /* renamed from: n */
    private static final qr3 f16075n = qr3.m29672b(er3.class);

    /* renamed from: g */
    protected final String f16076g;

    /* renamed from: h */
    boolean f16077h;

    /* renamed from: i */
    boolean f16078i;

    /* renamed from: j */
    private ByteBuffer f16079j;

    /* renamed from: k */
    long f16080k;

    /* renamed from: l */
    long f16081l = -1;

    /* renamed from: m */
    kr3 f16082m;

    protected er3(String str) {
        this.f16076g = str;
        this.f16078i = true;
        this.f16077h = true;
    }

    /* renamed from: a */
    private final synchronized void m23112a() {
        String str;
        if (!this.f16078i) {
            try {
                qr3 qr3 = f16075n;
                String str2 = this.f16076g;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                qr3.mo19279a(str);
                this.f16079j = this.f16082m.mo19004G0(this.f16080k, this.f16081l);
                this.f16078i = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo17277b(ByteBuffer byteBuffer);

    /* renamed from: c */
    public final synchronized void mo17278c() {
        String str;
        m23112a();
        qr3 qr3 = f16075n;
        String str2 = this.f16076g;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        qr3.mo19279a(str);
        ByteBuffer byteBuffer = this.f16079j;
        if (byteBuffer != null) {
            this.f16077h = true;
            byteBuffer.rewind();
            mo17277b(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.f16079j = null;
        }
    }

    /* renamed from: d */
    public final void mo17279d(C5179i7 i7Var) {
    }

    /* renamed from: p */
    public final void mo17280p(kr3 kr3, ByteBuffer byteBuffer, long j, C5030e7 e7Var) throws IOException {
        this.f16080k = kr3.mo19005a();
        byteBuffer.remaining();
        this.f16081l = j;
        this.f16082m = kr3;
        kr3.mo19007g(kr3.mo19005a() + j);
        this.f16078i = false;
        this.f16077h = false;
        mo17278c();
    }

    public final String zza() {
        return this.f16076g;
    }
}
