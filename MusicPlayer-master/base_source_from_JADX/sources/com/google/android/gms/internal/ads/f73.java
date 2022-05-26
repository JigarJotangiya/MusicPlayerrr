package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class f73 extends w63 {

    /* renamed from: a */
    static final Unsafe f16469a;

    /* renamed from: b */
    static final long f16470b;

    /* renamed from: c */
    static final long f16471c;

    /* renamed from: d */
    static final long f16472d;

    /* renamed from: e */
    static final long f16473e;

    /* renamed from: f */
    static final long f16474f;

    /* renamed from: com.google.android.gms.internal.ads.f73$a */
    /* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
    class C5068a implements PrivilegedExceptionAction<Unsafe> {
        C5068a() {
        }

        /* renamed from: a */
        public static final Unsafe m23527a() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public final /* bridge */ /* synthetic */ Object run() throws Exception {
            return m23527a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.f73.C5068a());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.g73> r0 = com.google.android.gms.internal.ads.g73.class
            sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
            goto L_0x0012
        L_0x0007:
            com.google.android.gms.internal.ads.f73$a r1 = new com.google.android.gms.internal.ads.f73$a     // Catch:{ PrivilegedActionException -> 0x005d }
            r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
            sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
        L_0x0012:
            java.lang.Class<com.google.android.gms.internal.ads.h73> r2 = com.google.android.gms.internal.ads.h73.class
            java.lang.String r3 = "i"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
            long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
            f16471c = r3     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "h"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
            long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
            f16470b = r3     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "g"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
            long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
            f16472d = r2     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = "a"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
            long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
            f16473e = r2     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = "b"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
            long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            f16474f = r2     // Catch:{ Exception -> 0x0053 }
            f16469a = r1     // Catch:{ Exception -> 0x0053 }
            return
        L_0x0053:
            r0 = move-exception
            com.google.android.gms.internal.ads.f23.m23432b(r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x005d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f73.<clinit>():void");
    }

    /* synthetic */ f73(j73 j73) {
        super((v63) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15703a(g73 g73, g73 g732) {
        f16469a.putObject(g73, f16474f, g732);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15704b(g73 g73, Thread thread) {
        f16469a.putObject(g73, f16473e, thread);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo15705c(h73<?> h73, z63 z63, z63 z632) {
        return f16469a.compareAndSwapObject(h73, f16470b, z63, z632);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo15706d(h73<?> h73, Object obj, Object obj2) {
        return f16469a.compareAndSwapObject(h73, f16472d, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo15707e(h73<?> h73, g73 g73, g73 g732) {
        return f16469a.compareAndSwapObject(h73, f16471c, g73, g732);
    }
}
