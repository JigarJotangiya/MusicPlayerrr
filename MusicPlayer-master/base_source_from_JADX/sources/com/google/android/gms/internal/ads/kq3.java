package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kq3 extends qm3<kq3, jq3> implements ao3 {
    /* access modifiers changed from: private */
    public static final kq3 zzb;
    private int zze;
    private kl3 zzf;
    private kl3 zzg;
    private byte zzh = 2;

    static {
        kq3 kq3 = new kq3();
        zzb = kq3;
        qm3.m29616t(kq3.class, kq3);
    }

    private kq3() {
        kl3 kl3 = kl3.zzb;
        this.zzf = kl3;
        this.zzg = kl3;
    }

    /* renamed from: D */
    public static jq3 m26390D() {
        return (jq3) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m26392F(kq3 kq3, kl3 kl3) {
        kq3.zze |= 1;
        kq3.zzf = kl3;
    }

    /* renamed from: G */
    static /* synthetic */ void m26393G(kq3 kq3, kl3 kl3) {
        kq3.zze |= 2;
        kq3.zzg = kl3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new kq3();
        } else {
            if (i2 == 4) {
                return new jq3((dq3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
