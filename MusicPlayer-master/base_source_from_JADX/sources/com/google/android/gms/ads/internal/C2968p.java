package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C5737xa;
import com.google.android.gms.internal.ads.ul0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.p */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2968p extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    final /* synthetic */ C2970r f9923a;

    /* synthetic */ C2968p(C2970r rVar, C2939o oVar) {
        this.f9923a = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            C2970r rVar = this.f9923a;
            rVar.f9937n = (C5737xa) rVar.f9932i.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            ul0.m31863h(BuildConfig.FLAVOR, e);
        } catch (TimeoutException e2) {
            ul0.m31863h(BuildConfig.FLAVOR, e2);
        }
        return this.f9923a.zzp();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f9923a.f9935l != null && str != null) {
            this.f9923a.f9935l.loadUrl(str);
        }
    }
}
