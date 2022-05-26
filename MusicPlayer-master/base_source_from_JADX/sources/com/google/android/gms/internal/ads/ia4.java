package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ia4 {
    /* renamed from: a */
    public static int m25125a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static fa4 m25126b(no2 no2, boolean z, boolean z2) throws C5464px {
        if (z) {
            m25127c(3, no2, false);
        }
        String F = no2.mo19771F((int) no2.mo19798y(), g13.f16857b);
        long y = no2.mo19798y();
        String[] strArr = new String[((int) y)];
        int length = F.length() + 15;
        for (int i = 0; ((long) i) < y; i++) {
            String F2 = no2.mo19771F((int) no2.mo19798y(), g13.f16857b);
            strArr[i] = F2;
            length = length + 4 + F2.length();
        }
        if (!z2 || (no2.mo19792s() & 1) != 0) {
            return new fa4(F, strArr, length + 1);
        }
        throw C5464px.zza("framing bit expected to be set", (Throwable) null);
    }

    /* renamed from: c */
    public static boolean m25127c(int i, no2 no2, boolean z) throws C5464px {
        String str;
        if (no2.mo19782i() < 7) {
            if (z) {
                return false;
            }
            int i2 = no2.mo19782i();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(i2);
            throw C5464px.zza(sb.toString(), (Throwable) null);
        } else if (no2.mo19792s() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            if (valueOf.length() != 0) {
                str = "expected header type ".concat(valueOf);
            } else {
                str = new String("expected header type ");
            }
            throw C5464px.zza(str, (Throwable) null);
        } else if (no2.mo19792s() == 118 && no2.mo19792s() == 111 && no2.mo19792s() == 114 && no2.mo19792s() == 98 && no2.mo19792s() == 105 && no2.mo19792s() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw C5464px.zza("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
