package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ar3 extends qm3<ar3, zq3> implements ao3 {
    /* access modifiers changed from: private */
    public static final ar3 zzb;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private oq3 zzh;
    private sq3 zzi;
    private int zzj;
    private um3 zzk = qm3.m29609m();
    private String zzl = BuildConfig.FLAVOR;
    private int zzm;
    private ym3<String> zzn = qm3.m29612p();
    private byte zzo = 2;

    static {
        ar3 ar3 = new ar3();
        zzb = ar3;
        qm3.m29616t(ar3.class, ar3);
    }

    private ar3() {
    }

    /* renamed from: E */
    public static zq3 m20933E() {
        return (zq3) zzb.mo20477v();
    }

    /* renamed from: H */
    static /* synthetic */ void m20935H(ar3 ar3, int i) {
        ar3.zze |= 1;
        ar3.zzf = i;
    }

    /* renamed from: I */
    static /* synthetic */ void m20936I(ar3 ar3, String str) {
        str.getClass();
        ar3.zze |= 2;
        ar3.zzg = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m20937J(ar3 ar3, oq3 oq3) {
        oq3.getClass();
        ar3.zzh = oq3;
        ar3.zze |= 4;
    }

    /* renamed from: K */
    static /* synthetic */ void m20938K(ar3 ar3, String str) {
        str.getClass();
        ym3<String> ym3 = ar3.zzn;
        if (!ym3.mo21839b()) {
            ar3.zzn = qm3.m29613q(ym3);
        }
        ar3.zzn.add(str);
    }

    /* renamed from: L */
    static /* synthetic */ void m20939L(ar3 ar3, int i) {
        ar3.zzm = i - 1;
        ar3.zze |= 64;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        byte b = 1;
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", xq3.f25933a, "zzn"});
        } else if (i2 == 3) {
            return new ar3();
        } else {
            if (i2 == 4) {
                return new zq3((dq3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzo = b;
            return null;
        }
    }

    /* renamed from: D */
    public final int mo15933D() {
        return this.zzn.size();
    }

    /* renamed from: G */
    public final String mo15934G() {
        return this.zzg;
    }
}
