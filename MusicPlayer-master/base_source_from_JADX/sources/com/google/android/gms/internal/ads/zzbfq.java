package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.C3109q;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfq {

    /* renamed from: a */
    private final C2921g[] f27239a;

    /* renamed from: b */
    private final String f27240b;

    public zzbfq(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3109q.AdsAttrs);
        String string = obtainAttributes.getString(C3109q.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(C3109q.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.f27239a = m34955c(string);
        } else if (!z && z2) {
            this.f27239a = m34955c(string2);
        } else if (z) {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        String string3 = obtainAttributes.getString(C3109q.AdsAttrs_adUnitId);
        this.f27240b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: c */
    private static C2921g[] m34955c(String str) {
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        C2921g[] gVarArr = new C2921g[length];
        for (int i3 = 0; i3 < split.length; i3++) {
            String trim = split[i3].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    if ("FULL_WIDTH".equals(split2[0])) {
                        i = -1;
                    } else {
                        i = Integer.parseInt(split2[0]);
                    }
                    if ("AUTO_HEIGHT".equals(split2[1])) {
                        i2 = -2;
                    } else {
                        i2 = Integer.parseInt(split2[1]);
                    }
                    gVarArr[i3] = new C2921g(i, i2);
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(trim);
                    if (valueOf.length() != 0) {
                        str4 = "Could not parse XML attribute \"adSize\": ".concat(valueOf);
                    } else {
                        str4 = new String("Could not parse XML attribute \"adSize\": ");
                    }
                    throw new IllegalArgumentException(str4);
                }
            } else if ("BANNER".equals(trim)) {
                gVarArr[i3] = C2921g.f9793i;
            } else if ("LARGE_BANNER".equals(trim)) {
                gVarArr[i3] = C2921g.f9795k;
            } else if ("FULL_BANNER".equals(trim)) {
                gVarArr[i3] = C2921g.f9794j;
            } else if ("LEADERBOARD".equals(trim)) {
                gVarArr[i3] = C2921g.f9796l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                gVarArr[i3] = C2921g.f9797m;
            } else if ("SMART_BANNER".equals(trim)) {
                gVarArr[i3] = C2921g.f9799o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                gVarArr[i3] = C2921g.f9798n;
            } else if ("FLUID".equals(trim)) {
                gVarArr[i3] = C2921g.f9800p;
            } else if ("ICON".equals(trim)) {
                gVarArr[i3] = C2921g.f9802r;
            } else {
                String valueOf2 = String.valueOf(trim);
                if (valueOf2.length() != 0) {
                    str3 = "Could not parse XML attribute \"adSize\": ".concat(valueOf2);
                } else {
                    str3 = new String("Could not parse XML attribute \"adSize\": ");
                }
                throw new IllegalArgumentException(str3);
            }
        }
        if (length != 0) {
            return gVarArr;
        }
        String valueOf3 = String.valueOf(str);
        if (valueOf3.length() != 0) {
            str2 = "Could not parse XML attribute \"adSize\": ".concat(valueOf3);
        } else {
            str2 = new String("Could not parse XML attribute \"adSize\": ");
        }
        throw new IllegalArgumentException(str2);
    }

    /* renamed from: a */
    public final String mo22543a() {
        return this.f27240b;
    }

    /* renamed from: b */
    public final C2921g[] mo22544b(boolean z) {
        if (z || this.f27239a.length == 1) {
            return this.f27239a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
