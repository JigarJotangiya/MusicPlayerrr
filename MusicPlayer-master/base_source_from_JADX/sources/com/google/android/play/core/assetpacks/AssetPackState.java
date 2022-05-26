package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.p250d.C6336b;

/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class AssetPackState {
    /* renamed from: h */
    public static AssetPackState m37540h(String str, int i, int i2, long j, long j2, double d, int i3, String str2, String str3) {
        return new C6380l0(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2, str3);
    }

    /* renamed from: i */
    static AssetPackState m37541i(Bundle bundle, String str, C6381l1 l1Var, C6432v2 v2Var, C6337d0 d0Var) {
        Bundle bundle2 = bundle;
        String str2 = str;
        int a = d0Var.mo25221a(bundle2.getInt(C6336b.m37592a("status", str2)), str2);
        int i = bundle2.getInt(C6336b.m37592a("error_code", str2));
        long j = bundle2.getLong(C6336b.m37592a("bytes_downloaded", str2));
        long j2 = bundle2.getLong(C6336b.m37592a("total_bytes_to_download", str2));
        double a2 = l1Var.mo25306a(str2);
        long j3 = bundle2.getLong(C6336b.m37592a("pack_version", str2));
        long j4 = bundle2.getLong(C6336b.m37592a("pack_base_version", str2));
        int i2 = 1;
        int i3 = 4;
        if (a != 4) {
            i3 = a;
        } else if (!(j4 == 0 || j4 == j3)) {
            i2 = 2;
        }
        return m37540h(str, i3, i, j, j2, a2, i2, bundle2.getString(C6336b.m37592a("pack_version_tag", str2), String.valueOf(bundle2.getInt("app_version_code"))), v2Var.mo25369a(str2));
    }

    /* renamed from: a */
    public abstract long mo25183a();

    /* renamed from: b */
    public abstract int mo25184b();

    /* renamed from: c */
    public abstract String mo25185c();

    /* renamed from: d */
    public abstract int mo25186d();

    /* renamed from: e */
    public abstract long mo25187e();

    /* renamed from: f */
    public abstract int mo25188f();

    /* renamed from: g */
    public abstract int mo25189g();

    /* renamed from: j */
    public abstract String mo25190j();

    /* renamed from: k */
    public abstract String mo25191k();
}
