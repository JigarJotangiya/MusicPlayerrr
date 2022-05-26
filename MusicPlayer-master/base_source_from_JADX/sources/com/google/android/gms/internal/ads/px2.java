package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class px2 extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private qx2 f21750a;

    /* renamed from: b */
    protected final hx2 f21751b;

    public px2(hx2 hx2, byte[] bArr) {
        this.f21751b = hx2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        qx2 qx2 = this.f21750a;
        if (qx2 != null) {
            qx2.mo20526a(this);
        }
    }

    /* renamed from: b */
    public final void mo20333b(qx2 qx2) {
        this.f21750a = qx2;
    }
}
