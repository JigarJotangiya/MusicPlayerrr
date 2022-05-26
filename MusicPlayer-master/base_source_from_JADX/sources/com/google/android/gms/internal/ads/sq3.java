package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sq3 extends qm3<sq3, pq3> implements ao3 {
    /* access modifiers changed from: private */
    public static final sq3 zzb;
    private int zze;
    private rq3 zzf;
    private ym3<kq3> zzg = qm3.m29612p();
    private kl3 zzh;
    private kl3 zzi;
    private int zzj;
    private kl3 zzk;
    private byte zzl = 2;

    static {
        sq3 sq3 = new sq3();
        zzb = sq3;
        qm3.m29616t(sq3.class, sq3);
    }

    private sq3() {
        kl3 kl3 = kl3.zzb;
        this.zzh = kl3;
        this.zzi = kl3;
        this.zzk = kl3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b = 1;
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", kq3.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new sq3();
        } else {
            if (i2 == 4) {
                return new pq3((dq3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzl = b;
            return null;
        }
    }
}
