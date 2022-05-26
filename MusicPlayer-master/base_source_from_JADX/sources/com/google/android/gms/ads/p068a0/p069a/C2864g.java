package com.google.android.gms.ads.p068a0.p069a;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.d93;
import com.google.android.gms.internal.ads.s83;
import com.google.android.gms.internal.ads.y73;
import com.google.android.gms.internal.ads.zzcdq;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

/* renamed from: com.google.android.gms.ads.a0.a.g */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C2864g implements y73 {

    /* renamed from: a */
    public final /* synthetic */ zzcdq f9722a;

    public /* synthetic */ C2864g(zzcdq zzcdq) {
        this.f9722a = zzcdq;
    }

    /* renamed from: b */
    public final d93 mo10692b(Object obj) {
        zzcdq zzcdq = this.f9722a;
        C2870j jVar = new C2870j(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            jVar.f9739b = C2971s.m13214q().mo10978M(zzcdq.f27348g).toString();
        } catch (JSONException unused) {
            jVar.f9739b = "{}";
        }
        return s83.m30607i(jVar);
    }
}
