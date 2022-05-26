package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.C0346c;
import com.google.android.gms.internal.ads.n00;
import com.google.android.gms.internal.ads.ns3;
import com.google.android.gms.internal.ads.p00;

/* renamed from: com.google.android.gms.ads.internal.util.t1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C3039t1 implements n00 {

    /* renamed from: a */
    final /* synthetic */ p00 f10104a;

    /* renamed from: b */
    final /* synthetic */ Context f10105b;

    /* renamed from: c */
    final /* synthetic */ Uri f10106c;

    C3039t1(C2979b2 b2Var, p00 p00, Context context, Uri uri) {
        this.f10104a = p00;
        this.f10105b = context;
        this.f10106c = uri;
    }

    public final void zza() {
        C0346c a = new C0346c.C0347a(this.f10104a.mo20162a()).mo2276a();
        a.f1502a.setPackage(ns3.m28062a(this.f10105b));
        a.mo2275a(this.f10105b, this.f10106c);
        this.f10104a.mo20167f((Activity) this.f10105b);
    }
}
