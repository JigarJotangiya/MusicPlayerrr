package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class tp3 extends up3 {
    tp3(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final byte mo20934a(long j) {
        return Memory.peekByte(j);
    }

    /* renamed from: b */
    public final double mo20935b(Object obj, long j) {
        return Double.longBitsToDouble(mo21351m(obj, j));
    }

    /* renamed from: c */
    public final float mo20936c(Object obj, long j) {
        return Float.intBitsToFloat(mo21350l(obj, j));
    }

    /* renamed from: d */
    public final void mo20937d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    /* renamed from: e */
    public final void mo20938e(Object obj, long j, boolean z) {
        if (vp3.f24905j) {
            vp3.m32639g(obj, j, r3 ? (byte) 1 : 0);
        } else {
            vp3.m32640h(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: f */
    public final void mo20939f(Object obj, long j, byte b) {
        if (vp3.f24905j) {
            vp3.m32639g(obj, j, b);
        } else {
            vp3.m32640h(obj, j, b);
        }
    }

    /* renamed from: g */
    public final void mo20940g(Object obj, long j, double d) {
        mo21355q(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: h */
    public final void mo20941h(Object obj, long j, float f) {
        mo21354p(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: i */
    public final boolean mo20942i(Object obj, long j) {
        if (vp3.f24905j) {
            return vp3.m32629E(obj, j);
        }
        return vp3.m32630F(obj, j);
    }
}
