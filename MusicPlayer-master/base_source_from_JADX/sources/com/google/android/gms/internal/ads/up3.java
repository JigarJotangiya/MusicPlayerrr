package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class up3 {

    /* renamed from: a */
    final Unsafe f24409a;

    up3(Unsafe unsafe) {
        this.f24409a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo20934a(long j);

    /* renamed from: b */
    public abstract double mo20935b(Object obj, long j);

    /* renamed from: c */
    public abstract float mo20936c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo20937d(long j, byte[] bArr, long j2, long j3);

    /* renamed from: e */
    public abstract void mo20938e(Object obj, long j, boolean z);

    /* renamed from: f */
    public abstract void mo20939f(Object obj, long j, byte b);

    /* renamed from: g */
    public abstract void mo20940g(Object obj, long j, double d);

    /* renamed from: h */
    public abstract void mo20941h(Object obj, long j, float f);

    /* renamed from: i */
    public abstract boolean mo20942i(Object obj, long j);

    /* renamed from: j */
    public final int mo21348j(Class<?> cls) {
        return this.f24409a.arrayBaseOffset(cls);
    }

    /* renamed from: k */
    public final int mo21349k(Class<?> cls) {
        return this.f24409a.arrayIndexScale(cls);
    }

    /* renamed from: l */
    public final int mo21350l(Object obj, long j) {
        return this.f24409a.getInt(obj, j);
    }

    /* renamed from: m */
    public final long mo21351m(Object obj, long j) {
        return this.f24409a.getLong(obj, j);
    }

    /* renamed from: n */
    public final long mo21352n(Field field) {
        return this.f24409a.objectFieldOffset(field);
    }

    /* renamed from: o */
    public final Object mo21353o(Object obj, long j) {
        return this.f24409a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo21354p(Object obj, long j, int i) {
        this.f24409a.putInt(obj, j, i);
    }

    /* renamed from: q */
    public final void mo21355q(Object obj, long j, long j2) {
        this.f24409a.putLong(obj, j, j2);
    }

    /* renamed from: r */
    public final void mo21356r(Object obj, long j, Object obj2) {
        this.f24409a.putObject(obj, j, obj2);
    }
}
