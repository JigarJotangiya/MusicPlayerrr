package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5328m8 extends qm3<C5328m8, C5291l8> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5328m8 zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        C5328m8 m8Var = new C5328m8();
        zzb = m8Var;
        qm3.m29616t(C5328m8.class, m8Var);
    }

    private C5328m8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", C5735x8.f25709a});
        } else if (i2 == 3) {
            return new C5328m8();
        } else {
            if (i2 == 4) {
                return new C5291l8((C4883a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
