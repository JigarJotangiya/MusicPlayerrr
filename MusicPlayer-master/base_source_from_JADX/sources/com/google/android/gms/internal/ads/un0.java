package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class un0 {

    /* renamed from: g */
    protected static final AtomicInteger f24379g = new AtomicInteger(0);

    /* renamed from: h */
    protected static final AtomicInteger f24380h = new AtomicInteger(0);

    /* renamed from: S */
    public static int m31901S() {
        return f24379g.get();
    }

    /* renamed from: U */
    public static int m31902U() {
        return f24380h.get();
    }

    /* renamed from: A */
    public abstract void mo17604A(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    /* renamed from: C */
    public abstract void mo17605C();

    /* renamed from: D */
    public abstract void mo17606D(long j);

    /* renamed from: E */
    public abstract void mo17607E(int i);

    /* renamed from: F */
    public abstract void mo17608F(int i);

    /* renamed from: G */
    public abstract void mo17609G(tn0 tn0);

    /* renamed from: H */
    public abstract void mo17610H(int i);

    /* renamed from: I */
    public abstract void mo17611I(int i);

    /* renamed from: J */
    public abstract void mo17612J(boolean z);

    /* renamed from: K */
    public abstract void mo17613K(boolean z);

    /* renamed from: L */
    public abstract void mo17614L(int i);

    /* renamed from: M */
    public abstract void mo17615M(Surface surface, boolean z) throws IOException;

    /* renamed from: N */
    public abstract void mo17616N(float f, boolean z) throws IOException;

    /* renamed from: O */
    public abstract void mo17617O();

    /* renamed from: P */
    public abstract boolean mo17618P();

    /* renamed from: Q */
    public abstract boolean mo17619Q();

    /* renamed from: R */
    public abstract int mo17620R();

    /* renamed from: T */
    public abstract int mo17621T();

    /* renamed from: V */
    public abstract long mo17622V();

    /* renamed from: W */
    public abstract long mo17623W();

    /* renamed from: X */
    public abstract long mo17624X();

    /* renamed from: Y */
    public abstract long mo17625Y();

    /* renamed from: Z */
    public abstract long mo17626Z();

    /* renamed from: a0 */
    public abstract long mo17628a0();

    /* renamed from: b0 */
    public abstract long mo17630b0();

    /* renamed from: z */
    public abstract void mo17648z(Uri[] uriArr, String str);
}
