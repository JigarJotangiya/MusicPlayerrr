package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bj3 extends qm3<bj3, aj3> implements ao3 {
    /* access modifiers changed from: private */
    public static final bj3 zzb;
    private int zze;

    static {
        bj3 bj3 = new bj3();
        zzb = bj3;
        qm3.m29616t(bj3.class, bj3);
    }

    private bj3() {
    }

    /* renamed from: E */
    public static bj3 m21343E() {
        return zzb;
    }

    /* renamed from: F */
    public static bj3 m21344F(kl3 kl3, cm3 cm3) throws bn3 {
        return (bj3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new bj3();
        } else {
            if (i2 == 4) {
                return new aj3((zi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
