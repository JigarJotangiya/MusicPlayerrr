package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3024o1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hz0 implements wy0 {

    /* renamed from: a */
    private final Context f17823a;

    /* renamed from: b */
    private final C3024o1 f17824b = C2971s.m13213p().mo17562h();

    public hz0(Context context) {
        this.f17823a = context;
    }

    /* renamed from: a */
    public final void mo15988a(Map<String, String> map) {
        if (!map.isEmpty()) {
            String str = map.get("gad_idless");
            if (str != null) {
                boolean parseBoolean = Boolean.parseBoolean(str);
                map.remove("gad_idless");
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22553k0)).booleanValue()) {
                    this.f17824b.mo11087c0(parseBoolean);
                    if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22469Z3)).booleanValue() && parseBoolean) {
                        this.f17823a.deleteDatabase("OfflineUpload.db");
                    }
                }
            }
            Bundle bundle = new Bundle();
            for (Map.Entry next : map.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22521g0)).booleanValue()) {
                C2971s.m13212o().mo16670w(bundle);
            }
        }
    }
}
