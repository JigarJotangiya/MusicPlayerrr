package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class gm3 {

    /* renamed from: a */
    private static final dm3<?> f17201a = new em3();

    /* renamed from: b */
    private static final dm3<?> f17202b;

    static {
        dm3<?> dm3;
        try {
            dm3 = (dm3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            dm3 = null;
        }
        f17202b = dm3;
    }

    /* renamed from: a */
    static dm3<?> m24448a() {
        dm3<?> dm3 = f17202b;
        if (dm3 != null) {
            return dm3;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static dm3<?> m24449b() {
        return f17201a;
    }
}
