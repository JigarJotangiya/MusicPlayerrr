package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tx2 extends ox2 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: long} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.HashSet] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tx2(com.google.android.gms.internal.ads.hx2 r8, com.google.android.gms.internal.ads.hx2 r9, java.util.HashSet<java.lang.String> r10, org.json.JSONObject r11, long r12) {
        /*
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tx2.<init>(com.google.android.gms.internal.ads.hx2, java.util.HashSet, org.json.JSONObject, long, byte[]):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20332a(String str) {
        jw2 a;
        if (!TextUtils.isEmpty(str) && (a = jw2.m26008a()) != null) {
            for (yv2 next : a.mo18755c()) {
                if (this.f21226c.contains(next.mo22300h())) {
                    next.mo22299g().mo22086e(str, this.f21228e);
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (bx2.m21588i(this.f21227d, this.f21751b.mo18223a())) {
            return null;
        }
        this.f21751b.mo18227e(this.f21227d);
        return this.f21227d.toString();
    }
}
