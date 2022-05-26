package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wr3<T> implements yr3<T> {

    /* renamed from: a */
    private ms3<T> f25522a;

    /* renamed from: b */
    public static <T> void m33322b(ms3<T> ms3, ms3<T> ms32) {
        wr3 wr3 = (wr3) ms3;
        if (wr3.f25522a == null) {
            wr3.f25522a = ms32;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final T mo10679a() {
        ms3<T> ms3 = this.f25522a;
        if (ms3 != null) {
            return ms3.mo10679a();
        }
        throw new IllegalStateException();
    }
}
