package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uh3 extends qm3<uh3, th3> implements ao3 {
    /* access modifiers changed from: private */
    public static final uh3 zzb;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;
    private boolean zzh;
    private String zzi = BuildConfig.FLAVOR;

    static {
        uh3 uh3 = new uh3();
        zzb = uh3;
        qm3.m29616t(uh3.class, uh3);
    }

    private uh3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new uh3();
        } else {
            if (i2 == 4) {
                return new th3((sh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo21266D() {
        return this.zzg;
    }

    /* renamed from: F */
    public final String mo21267F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final String mo21268G() {
        return this.zze;
    }

    /* renamed from: H */
    public final String mo21269H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo21270I() {
        return this.zzh;
    }
}
