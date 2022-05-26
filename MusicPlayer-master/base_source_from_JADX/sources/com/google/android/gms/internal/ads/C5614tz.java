package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.tz */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5614tz {

    /* renamed from: a */
    private final String f24063a = a10.f13718b.mo20989e();

    /* renamed from: b */
    private final Map<String, String> f24064b;

    /* renamed from: c */
    private final Context f24065c;

    /* renamed from: d */
    private final String f24066d;

    public C5614tz(Context context, String str) {
        String str2;
        this.f24065c = context;
        this.f24066d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f24064b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        C2971s.m13214q();
        linkedHashMap.put("device", C2979b2.m13256f0());
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        linkedHashMap.put("app", str2);
        C2971s.m13214q();
        linkedHashMap.put("is_lite_sdk", true != C2979b2.m13261i(context) ? "0" : "1");
        Future<tg0> b = C2971s.m13211n().mo21816b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(b.get().f23861j));
            linkedHashMap.put("network_fine", Integer.toString(b.get().f23862k));
        } catch (Exception e) {
            C2971s.m13213p().mo17571s(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo21191a() {
        return this.f24065c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo21192b() {
        return this.f24066d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo21193c() {
        return this.f24063a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<String, String> mo21194d() {
        return this.f24064b;
    }
}
