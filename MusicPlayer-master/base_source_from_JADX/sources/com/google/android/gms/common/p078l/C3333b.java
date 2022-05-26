package com.google.android.gms.common.p078l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.C3369n;
import p082e.p109h.p118o.C3699e;

/* renamed from: com.google.android.gms.common.l.b */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3333b {
    @RecentlyNonNull

    /* renamed from: a */
    protected final Context f10702a;

    public C3333b(@RecentlyNonNull Context context) {
        this.f10702a = context;
    }

    /* renamed from: a */
    public int mo11908a(@RecentlyNonNull String str) {
        return this.f10702a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int mo11909b(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.f10702a.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    /* renamed from: c */
    public ApplicationInfo mo11910c(@RecentlyNonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f10702a.getPackageManager().getApplicationInfo(str, i);
    }

    @RecentlyNonNull
    /* renamed from: d */
    public CharSequence mo11911d(@RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        return this.f10702a.getPackageManager().getApplicationLabel(this.f10702a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    /* renamed from: e */
    public C3699e<CharSequence, Drawable> mo11912e(@RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f10702a.getPackageManager().getApplicationInfo(str, 0);
        return C3699e.m15816a(this.f10702a.getPackageManager().getApplicationLabel(applicationInfo), this.f10702a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @RecentlyNonNull
    /* renamed from: f */
    public PackageInfo mo11913f(@RecentlyNonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f10702a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: g */
    public boolean mo11914g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C3332a.m14360a(this.f10702a);
        }
        if (!C3369n.m14478j() || (nameForUid = this.f10702a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f10702a.getPackageManager().isInstantApp(nameForUid);
    }
}
