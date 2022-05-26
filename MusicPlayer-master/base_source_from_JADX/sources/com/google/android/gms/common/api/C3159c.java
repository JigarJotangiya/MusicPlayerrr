package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.internal.C3173b;
import com.google.android.gms.common.internal.C3292l;
import java.util.ArrayList;
import p082e.p098e.C3465a;

/* renamed from: com.google.android.gms.common.api.c */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C3159c extends Exception {
    private final C3465a<C3173b<?>, ConnectionResult> zaa;

    public C3159c(@RecentlyNonNull C3465a<C3173b<?>, ConnectionResult> aVar) {
        this.zaa = aVar;
    }

    public ConnectionResult getConnectionResult(@RecentlyNonNull C3161e<? extends C3147a.C3151d> eVar) {
        C3173b<? extends C3147a.C3151d> c = eVar.mo11523c();
        boolean z = this.zaa.get(c) != null;
        String b = c.mo11552b();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 58);
        sb.append("The given API (");
        sb.append(b);
        sb.append(") was not part of the availability request.");
        C3292l.m14234b(z, sb.toString());
        ConnectionResult connectionResult = this.zaa.get(c);
        C3292l.m14240h(connectionResult);
        return connectionResult;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C3173b next : this.zaa.keySet()) {
            ConnectionResult connectionResult = this.zaa.get(next);
            C3292l.m14240h(connectionResult);
            ConnectionResult connectionResult2 = connectionResult;
            z &= !connectionResult2.mo11450v0();
            String b = next.mo11552b();
            String valueOf = String.valueOf(connectionResult2);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + String.valueOf(valueOf).length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public ConnectionResult getConnectionResult(@RecentlyNonNull C3166h<? extends C3147a.C3151d> hVar) {
        C3173b<? extends C3147a.C3151d> c = hVar.mo11523c();
        boolean z = this.zaa.get(c) != null;
        String b = c.mo11552b();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 58);
        sb.append("The given API (");
        sb.append(b);
        sb.append(") was not part of the availability request.");
        C3292l.m14234b(z, sb.toString());
        ConnectionResult connectionResult = this.zaa.get(c);
        C3292l.m14240h(connectionResult);
        return connectionResult;
    }
}
