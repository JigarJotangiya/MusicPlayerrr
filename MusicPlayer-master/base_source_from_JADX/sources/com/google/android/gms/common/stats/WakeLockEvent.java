package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class WakeLockEvent extends StatsEvent {
    @RecentlyNonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C3353b();

    /* renamed from: g */
    final int f10745g;

    /* renamed from: h */
    private final long f10746h;

    /* renamed from: i */
    private int f10747i;

    /* renamed from: j */
    private final String f10748j;

    /* renamed from: k */
    private final String f10749k;

    /* renamed from: l */
    private final String f10750l;

    /* renamed from: m */
    private final int f10751m;

    /* renamed from: n */
    private final List<String> f10752n;

    /* renamed from: o */
    private final String f10753o;

    /* renamed from: p */
    private final long f10754p;

    /* renamed from: q */
    private int f10755q;

    /* renamed from: r */
    private final String f10756r;

    /* renamed from: s */
    private final float f10757s;

    /* renamed from: t */
    private final long f10758t;

    /* renamed from: u */
    private final boolean f10759u;

    /* renamed from: v */
    private long f10760v = -1;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f10745g = i;
        this.f10746h = j;
        this.f10747i = i2;
        this.f10748j = str;
        this.f10749k = str3;
        this.f10750l = str5;
        this.f10751m = i3;
        this.f10752n = list;
        this.f10753o = str2;
        this.f10754p = j2;
        this.f10755q = i4;
        this.f10756r = str4;
        this.f10757s = f;
        this.f10758t = j3;
        this.f10759u = z;
    }

    /* renamed from: Y */
    public final long mo11974Y() {
        return this.f10746h;
    }

    /* renamed from: b */
    public final long mo11975b() {
        return this.f10760v;
    }

    /* renamed from: m0 */
    public final int mo11976m0() {
        return this.f10747i;
    }

    @RecentlyNonNull
    /* renamed from: n0 */
    public final String mo11977n0() {
        List<String> list = this.f10752n;
        String str = this.f10748j;
        int i = this.f10751m;
        String str2 = BuildConfig.FLAVOR;
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i2 = this.f10755q;
        String str3 = this.f10749k;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.f10756r;
        if (str4 == null) {
            str4 = str2;
        }
        float f = this.f10757s;
        String str5 = this.f10750l;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.f10759u;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(join).length();
        StringBuilder sb = new StringBuilder(length + 51 + length2 + str3.length() + str4.length() + str2.length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10745g);
        C3315b.m14319k(parcel, 2, this.f10746h);
        C3315b.m14322n(parcel, 4, this.f10748j, false);
        C3315b.m14316h(parcel, 5, this.f10751m);
        C3315b.m14324p(parcel, 6, this.f10752n, false);
        C3315b.m14319k(parcel, 8, this.f10754p);
        C3315b.m14322n(parcel, 10, this.f10749k, false);
        C3315b.m14316h(parcel, 11, this.f10747i);
        C3315b.m14322n(parcel, 12, this.f10753o, false);
        C3315b.m14322n(parcel, 13, this.f10756r, false);
        C3315b.m14316h(parcel, 14, this.f10755q);
        C3315b.m14314f(parcel, 15, this.f10757s);
        C3315b.m14319k(parcel, 16, this.f10758t);
        C3315b.m14322n(parcel, 17, this.f10750l, false);
        C3315b.m14311c(parcel, 18, this.f10759u);
        C3315b.m14310b(parcel, a);
    }
}
