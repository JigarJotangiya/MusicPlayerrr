package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xe3 extends qm3<xe3, we3> implements ao3 {
    /* access modifiers changed from: private */
    public static final xe3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        xe3 xe3 = new xe3();
        zzb = xe3;
        qm3.m29616t(xe3.class, xe3);
    }

    private xe3() {
    }

    /* renamed from: E */
    public static we3 m33684E() {
        return (we3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static xe3 m33686G() {
        return zzb;
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
            return new xe3();
        } else {
            if (i2 == 4) {
                return new we3((ve3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo22028D() {
        return this.zze;
    }
}
