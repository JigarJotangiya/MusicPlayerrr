package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ko3 implements wn3 {

    /* renamed from: a */
    private final zn3 f18946a;

    /* renamed from: b */
    private final String f18947b;

    /* renamed from: c */
    private final Object[] f18948c;

    /* renamed from: d */
    private final int f18949d;

    ko3(zn3 zn3, String str, Object[] objArr) {
        this.f18946a = zn3;
        this.f18947b = str;
        this.f18948c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f18949d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f18949d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo18474a() {
        return (this.f18949d & 2) == 2;
    }

    /* renamed from: b */
    public final int mo18475b() {
        return (this.f18949d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo18952c() {
        return this.f18947b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Object[] mo18953d() {
        return this.f18948c;
    }

    public final zn3 zza() {
        return this.f18946a;
    }
}
