package com.google.android.gms.internal.ads;

import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dr3 extends qm3<dr3, fq3> implements ao3 {
    /* access modifiers changed from: private */
    public static final dr3 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private iq3 zzk;
    private ym3<ar3> zzl = qm3.m29612p();
    private String zzm = BuildConfig.FLAVOR;
    private vq3 zzn;
    private boolean zzo;
    private ym3<String> zzp = qm3.m29612p();
    private String zzq = BuildConfig.FLAVOR;
    private boolean zzr;
    private boolean zzs;
    private kl3 zzt = kl3.zzb;
    private cr3 zzu;
    private ym3<String> zzv = qm3.m29612p();
    private ym3<String> zzw = qm3.m29612p();
    private byte zzx = 2;

    static {
        dr3 dr3 = new dr3();
        zzb = dr3;
        qm3.m29616t(dr3.class, dr3);
    }

    private dr3() {
    }

    /* renamed from: D */
    public static fq3 m22645D() {
        return (fq3) zzb.mo20477v();
    }

    /* renamed from: I */
    static /* synthetic */ void m22647I(dr3 dr3, String str) {
        str.getClass();
        dr3.zze |= 4;
        dr3.zzh = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m22648J(dr3 dr3, String str) {
        str.getClass();
        dr3.zze |= 8;
        dr3.zzi = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m22649K(dr3 dr3, iq3 iq3) {
        iq3.getClass();
        dr3.zzk = iq3;
        dr3.zze |= 32;
    }

    /* renamed from: L */
    static /* synthetic */ void m22650L(dr3 dr3, ar3 ar3) {
        ar3.getClass();
        ym3<ar3> ym3 = dr3.zzl;
        if (!ym3.mo21839b()) {
            dr3.zzl = qm3.m29613q(ym3);
        }
        dr3.zzl.add(ar3);
    }

    /* renamed from: M */
    static /* synthetic */ void m22651M(dr3 dr3, String str) {
        dr3.zze |= 64;
        dr3.zzm = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m22652N(dr3 dr3) {
        dr3.zze &= -65;
        dr3.zzm = zzb.zzm;
    }

    /* renamed from: O */
    static /* synthetic */ void m22653O(dr3 dr3, vq3 vq3) {
        vq3.getClass();
        dr3.zzn = vq3;
        dr3.zze |= 128;
    }

    /* renamed from: P */
    static /* synthetic */ void m22654P(dr3 dr3, cr3 cr3) {
        cr3.getClass();
        dr3.zzu = cr3;
        dr3.zze |= 8192;
    }

    /* renamed from: R */
    static /* synthetic */ void m22655R(dr3 dr3, Iterable iterable) {
        ym3<String> ym3 = dr3.zzv;
        if (!ym3.mo21839b()) {
            dr3.zzv = qm3.m29613q(ym3);
        }
        vk3.m32462i(iterable, dr3.zzv);
    }

    /* renamed from: S */
    static /* synthetic */ void m22656S(dr3 dr3, Iterable iterable) {
        ym3<String> ym3 = dr3.zzw;
        if (!ym3.mo21839b()) {
            dr3.zzw = qm3.m29613q(ym3);
        }
        vk3.m32462i(iterable, dr3.zzw);
    }

    /* renamed from: T */
    static /* synthetic */ void m22657T(dr3 dr3, int i) {
        dr3.zzf = i - 1;
        dr3.zze |= 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzx);
        }
        byte b = 1;
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", ar3.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzf", wq3.f25488a, "zzg", eq3.f16068a, "zzk", "zzm", "zzn", "zzt", "zzu", "zzv", "zzw"});
        } else if (i2 == 3) {
            return new dr3();
        } else {
            if (i2 == 4) {
                return new fq3((dq3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzx = b;
            return null;
        }
    }

    /* renamed from: F */
    public final String mo16998F() {
        return this.zzm;
    }

    /* renamed from: G */
    public final String mo16999G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final List<ar3> mo17000H() {
        return this.zzl;
    }
}
