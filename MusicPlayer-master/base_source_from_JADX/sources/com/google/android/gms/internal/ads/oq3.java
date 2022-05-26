package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oq3 extends qm3<oq3, lq3> implements ao3 {
    /* access modifiers changed from: private */
    public static final oq3 zzb;
    private int zze;
    private nq3 zzf;
    private ym3<kq3> zzg = qm3.m29612p();
    private kl3 zzh;
    private kl3 zzi;
    private int zzj;
    private byte zzk = 2;

    static {
        oq3 oq3 = new oq3();
        zzb = oq3;
        qm3.m29616t(oq3.class, oq3);
    }

    private oq3() {
        kl3 kl3 = kl3.zzb;
        this.zzh = kl3;
        this.zzi = kl3;
    }

    /* renamed from: D */
    public static lq3 m28658D() {
        return (lq3) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m28660F(oq3 oq3, kq3 kq3) {
        kq3.getClass();
        ym3<kq3> ym3 = oq3.zzg;
        if (!ym3.mo21839b()) {
            oq3.zzg = qm3.m29613q(ym3);
        }
        oq3.zzg.add(kq3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b = 1;
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", kq3.class, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new oq3();
        } else {
            if (i2 == 4) {
                return new lq3((dq3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzk = b;
            return null;
        }
    }
}
