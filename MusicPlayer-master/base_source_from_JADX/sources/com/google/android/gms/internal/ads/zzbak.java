package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbak> CREATOR = new C5308lp();

    /* renamed from: g */
    public final String f27174g;

    /* renamed from: h */
    public final long f27175h;

    /* renamed from: i */
    public final String f27176i;

    /* renamed from: j */
    public final String f27177j;

    /* renamed from: k */
    public final String f27178k;

    /* renamed from: l */
    public final Bundle f27179l;

    /* renamed from: m */
    public final boolean f27180m;

    /* renamed from: n */
    public long f27181n;

    /* renamed from: o */
    public String f27182o;

    /* renamed from: p */
    public int f27183p;

    zzbak(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.f27174g = str;
        this.f27175h = j;
        this.f27176i = str2 == null ? BuildConfig.FLAVOR : str2;
        this.f27177j = str3 == null ? BuildConfig.FLAVOR : str3;
        this.f27178k = str4 == null ? BuildConfig.FLAVOR : str4;
        this.f27179l = bundle == null ? new Bundle() : bundle;
        this.f27180m = z;
        this.f27181n = j2;
        this.f27182o = str5;
        this.f27183p = i;
    }

    /* renamed from: Y */
    public static zzbak m34945Y(Uri uri) {
        long parseLong;
        Uri uri2 = uri;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                ul0.m31862g(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri2.getQueryParameter("url");
            boolean equals = "1".equals(uri2.getQueryParameter("read_only"));
            String queryParameter2 = uri2.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j = parseLong;
            Bundle bundle = new Bundle();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri2.getQueryParameter(next));
                }
            }
            return new zzbak(queryParameter, j, host, str, str2, bundle, equals, 0, BuildConfig.FLAVOR, 0);
        } catch (NullPointerException | NumberFormatException e) {
            ul0.m31863h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 2, this.f27174g, false);
        C3315b.m14319k(parcel, 3, this.f27175h);
        C3315b.m14322n(parcel, 4, this.f27176i, false);
        C3315b.m14322n(parcel, 5, this.f27177j, false);
        C3315b.m14322n(parcel, 6, this.f27178k, false);
        C3315b.m14312d(parcel, 7, this.f27179l, false);
        C3315b.m14311c(parcel, 8, this.f27180m);
        C3315b.m14319k(parcel, 9, this.f27181n);
        C3315b.m14322n(parcel, 10, this.f27182o, false);
        C3315b.m14316h(parcel, 11, this.f27183p);
        C3315b.m14310b(parcel, a);
    }
}
