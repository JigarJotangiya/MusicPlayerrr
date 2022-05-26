package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.C0338a;
import androidx.browser.customtabs.C0339b;
import androidx.browser.customtabs.C0348d;
import androidx.browser.customtabs.C0350e;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p00 {

    /* renamed from: a */
    private C0350e f21260a;

    /* renamed from: b */
    private C0339b f21261b;

    /* renamed from: c */
    private C0348d f21262c;

    /* renamed from: d */
    private n00 f21263d;

    /* renamed from: g */
    public static boolean m28808g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(ns3.m28062a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C0350e mo20162a() {
        C0339b bVar = this.f21261b;
        if (bVar == null) {
            this.f21260a = null;
        } else if (this.f21260a == null) {
            this.f21260a = bVar.mo2263b((C0338a) null);
        }
        return this.f21260a;
    }

    /* renamed from: b */
    public final void mo20163b(Activity activity) {
        String a;
        if (this.f21261b == null && (a = ns3.m28062a(activity)) != null) {
            os3 os3 = new os3(this, (byte[]) null);
            this.f21262c = os3;
            C0339b.m1952a(activity, a, os3);
        }
    }

    /* renamed from: c */
    public final void mo20164c(C0339b bVar) {
        this.f21261b = bVar;
        bVar.mo2264c(0);
        n00 n00 = this.f21263d;
        if (n00 != null) {
            n00.zza();
        }
    }

    /* renamed from: d */
    public final void mo20165d() {
        this.f21261b = null;
        this.f21260a = null;
    }

    /* renamed from: e */
    public final void mo20166e(n00 n00) {
        this.f21263d = n00;
    }

    /* renamed from: f */
    public final void mo20167f(Activity activity) {
        C0348d dVar = this.f21262c;
        if (dVar != null) {
            activity.unbindService(dVar);
            this.f21261b = null;
            this.f21260a = null;
            this.f21262c = null;
        }
    }
}
