package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oi3 extends qm3<oi3, ni3> implements ao3 {
    /* access modifiers changed from: private */
    public static final oi3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private ri3 zzf;

    static {
        oi3 oi3 = new oi3();
        zzb = oi3;
        qm3.m29616t(oi3.class, oi3);
    }

    private oi3() {
    }

    /* renamed from: E */
    public static ni3 m28518E() {
        return (ni3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static oi3 m28520G(kl3 kl3, cm3 cm3) throws bn3 {
        return (oi3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: J */
    static /* synthetic */ void m28522J(oi3 oi3, ri3 ri3) {
        ri3.getClass();
        oi3.zzf = ri3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new oi3();
        } else {
            if (i2 == 4) {
                return new ni3((mi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo20005D() {
        return this.zze;
    }

    /* renamed from: H */
    public final ri3 mo20006H() {
        ri3 ri3 = this.zzf;
        return ri3 == null ? ri3.m30149F() : ri3;
    }
}
