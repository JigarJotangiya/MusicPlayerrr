package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.ul0;

/* renamed from: com.google.android.gms.ads.internal.overlay.a */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2940a {
    /* renamed from: a */
    public static final boolean m13080a(Context context, Intent intent, C2966y yVar, C2964w wVar, boolean z) {
        String str;
        if (z) {
            return m13082c(context, intent.getData(), yVar, wVar);
        }
        try {
            String valueOf = String.valueOf(intent.toURI());
            if (valueOf.length() != 0) {
                str = "Launching an intent: ".concat(valueOf);
            } else {
                str = new String("Launching an intent: ");
            }
            C3018m1.m13388k(str);
            C2971s.m13214q();
            C2979b2.m13269q(context, intent);
            if (yVar != null) {
                yVar.mo10912d();
            }
            if (wVar != null) {
                wVar.mo10911B(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            ul0.m31862g(e.getMessage());
            if (wVar != null) {
                wVar.mo10911B(false);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m13081b(Context context, zzc zzc, C2966y yVar, C2964w wVar) {
        int i = 0;
        if (zzc == null) {
            ul0.m31862g("No intent data for launcher overlay.");
            return false;
        }
        C5503qz.m29790c(context);
        Intent intent = zzc.f9920n;
        if (intent != null) {
            return m13080a(context, intent, yVar, wVar, zzc.f9922p);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzc.f9914h)) {
            ul0.m31862g("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzc.f9915i)) {
            intent2.setDataAndType(Uri.parse(zzc.f9914h), zzc.f9915i);
        } else {
            intent2.setData(Uri.parse(zzc.f9914h));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.f9916j)) {
            intent2.setPackage(zzc.f9916j);
        }
        if (!TextUtils.isEmpty(zzc.f9917k)) {
            String[] split = zzc.f9917k.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzc.f9917k);
                ul0.m31862g(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = zzc.f9918l;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                ul0.m31862g("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22333G2)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22325F2)).booleanValue()) {
                C2971s.m13214q();
                C2979b2.m13250c0(context, intent2);
            }
        }
        return m13080a(context, intent2, yVar, wVar, zzc.f9922p);
    }

    /* renamed from: c */
    private static final boolean m13082c(Context context, Uri uri, C2966y yVar, C2964w wVar) {
        int i;
        try {
            i = C2971s.m13214q().mo10988a0(context, uri);
            if (yVar != null) {
                yVar.mo10912d();
            }
        } catch (ActivityNotFoundException e) {
            ul0.m31862g(e.getMessage());
            i = 6;
        }
        if (wVar != null) {
            wVar.mo10910A(i);
        }
        return i == 5;
    }
}
