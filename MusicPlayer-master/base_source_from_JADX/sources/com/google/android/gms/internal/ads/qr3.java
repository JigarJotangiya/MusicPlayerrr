package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class qr3 {
    /* renamed from: b */
    public static qr3 m29672b(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new lr3(cls.getSimpleName());
        }
        return new nr3(cls.getSimpleName());
    }

    /* renamed from: a */
    public abstract void mo19279a(String str);
}
