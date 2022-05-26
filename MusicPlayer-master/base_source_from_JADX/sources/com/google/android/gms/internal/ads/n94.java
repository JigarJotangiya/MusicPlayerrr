package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n94 {

    /* renamed from: a */
    public final int f20555a;

    /* renamed from: b */
    public final int f20556b;

    /* renamed from: c */
    public final int f20557c;

    /* renamed from: d */
    public final int f20558d;

    /* renamed from: e */
    public final int f20559e;

    /* renamed from: f */
    public final int f20560f;

    /* renamed from: g */
    public final int f20561g;

    /* renamed from: h */
    public final int f20562h;

    /* renamed from: i */
    public final int f20563i;

    /* renamed from: j */
    public final long f20564j;

    /* renamed from: k */
    public final m94 f20565k;

    /* renamed from: l */
    private final zzdd f20566l;

    private n94(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, m94 m94, zzdd zzdd) {
        this.f20555a = i;
        this.f20556b = i2;
        this.f20557c = i3;
        this.f20558d = i4;
        this.f20559e = i5;
        this.f20560f = m27771i(i5);
        this.f20561g = i6;
        this.f20562h = i7;
        this.f20563i = m27770h(i7);
        this.f20564j = j;
        this.f20565k = m94;
        this.f20566l = zzdd;
    }

    public n94(byte[] bArr, int i) {
        mn2 mn2 = new mn2(bArr, bArr.length);
        mn2.mo19474h(i * 8);
        this.f20555a = mn2.mo19469c(16);
        this.f20556b = mn2.mo19469c(16);
        this.f20557c = mn2.mo19469c(24);
        this.f20558d = mn2.mo19469c(24);
        int c = mn2.mo19469c(20);
        this.f20559e = c;
        this.f20560f = m27771i(c);
        this.f20561g = mn2.mo19469c(3) + 1;
        int c2 = mn2.mo19469c(5) + 1;
        this.f20562h = c2;
        this.f20563i = m27770h(c2);
        this.f20564j = wy2.m33435b0(mn2.mo19469c(4), mn2.mo19469c(32));
        this.f20565k = null;
        this.f20566l = null;
    }

    /* renamed from: h */
    private static int m27770h(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: i */
    private static int m27771i(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: j */
    private static zzdd m27772j(List<String> list, List<zzyz> list2) {
        String str;
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            String[] E = wy2.m33410E(str2, "=");
            if (E.length != 2) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str = "Failed to parse Vorbis comment: ".concat(valueOf);
                } else {
                    str = new String("Failed to parse Vorbis comment: ");
                }
                Log.w("FlacStreamMetadata", str);
            } else {
                arrayList.add(new zzzb(E[0], E[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzdd((List<? extends zzdc>) arrayList);
    }

    /* renamed from: a */
    public final long mo19657a() {
        long j = this.f20564j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f20559e);
    }

    /* renamed from: b */
    public final long mo19658b(long j) {
        return wy2.m33426U((j * ((long) this.f20559e)) / 1000000, 0, this.f20564j - 1);
    }

    /* renamed from: c */
    public final C5689w mo19659c(byte[] bArr, zzdd zzdd) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f20558d;
        if (i <= 0) {
            i = -1;
        }
        zzdd d = mo19660d(zzdd);
        jb4 jb4 = new jb4();
        jb4.mo18599s("audio/flac");
        jb4.mo18592l(i);
        jb4.mo18582e0(this.f20561g);
        jb4.mo18600t(this.f20559e);
        jb4.mo18589i(Collections.singletonList(bArr));
        jb4.mo18593m(d);
        return jb4.mo18605y();
    }

    /* renamed from: d */
    public final zzdd mo19660d(zzdd zzdd) {
        zzdd zzdd2 = this.f20566l;
        return zzdd2 == null ? zzdd : zzdd2.mo22585e(zzdd);
    }

    /* renamed from: e */
    public final n94 mo19661e(List<zzyz> list) {
        return new n94(this.f20555a, this.f20556b, this.f20557c, this.f20558d, this.f20559e, this.f20561g, this.f20562h, this.f20564j, this.f20565k, mo19660d(m27772j(Collections.emptyList(), list)));
    }

    /* renamed from: f */
    public final n94 mo19662f(m94 m94) {
        return new n94(this.f20555a, this.f20556b, this.f20557c, this.f20558d, this.f20559e, this.f20561g, this.f20562h, this.f20564j, m94, this.f20566l);
    }

    /* renamed from: g */
    public final n94 mo19663g(List<String> list) {
        return new n94(this.f20555a, this.f20556b, this.f20557c, this.f20558d, this.f20559e, this.f20561g, this.f20562h, this.f20564j, this.f20565k, mo19660d(m27772j(list, Collections.emptyList())));
    }
}
