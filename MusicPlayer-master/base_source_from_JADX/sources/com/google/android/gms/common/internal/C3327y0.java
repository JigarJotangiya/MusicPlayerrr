package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.y0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3327y0 {

    /* renamed from: f */
    private static final Uri f10672f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f10673a;

    /* renamed from: b */
    private final String f10674b;

    /* renamed from: c */
    private final ComponentName f10675c = null;

    /* renamed from: d */
    private final int f10676d;

    /* renamed from: e */
    private final boolean f10677e;

    public C3327y0(String str, String str2, int i, boolean z) {
        C3292l.m14237e(str);
        this.f10673a = str;
        C3292l.m14237e(str2);
        this.f10674b = str2;
        this.f10676d = i;
        this.f10677e = z;
    }

    /* renamed from: a */
    public final String mo11891a() {
        return this.f10674b;
    }

    /* renamed from: b */
    public final ComponentName mo11892b() {
        return this.f10675c;
    }

    /* renamed from: c */
    public final int mo11893c() {
        return this.f10676d;
    }

    /* renamed from: d */
    public final Intent mo11894d(Context context) {
        Bundle bundle;
        String str;
        if (this.f10673a == null) {
            return new Intent().setComponent(this.f10675c);
        }
        Intent intent = null;
        if (this.f10677e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f10673a);
            try {
                bundle = context.getContentResolver().call(f10672f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Dynamic intent resolution failed: ");
                sb.append(valueOf);
                Log.w("ConnectionStatusConfig", sb.toString());
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                String valueOf2 = String.valueOf(this.f10673a);
                if (valueOf2.length() != 0) {
                    str = "Dynamic lookup for intent failed for action: ".concat(valueOf2);
                } else {
                    str = new String("Dynamic lookup for intent failed for action: ");
                }
                Log.w("ConnectionStatusConfig", str);
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f10673a).setPackage(this.f10674b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3327y0)) {
            return false;
        }
        C3327y0 y0Var = (C3327y0) obj;
        return C3289k.m14227a(this.f10673a, y0Var.f10673a) && C3289k.m14227a(this.f10674b, y0Var.f10674b) && C3289k.m14227a(this.f10675c, y0Var.f10675c) && this.f10676d == y0Var.f10676d && this.f10677e == y0Var.f10677e;
    }

    public final int hashCode() {
        return C3289k.m14228b(this.f10673a, this.f10674b, this.f10675c, Integer.valueOf(this.f10676d), Boolean.valueOf(this.f10677e));
    }

    public final String toString() {
        String str = this.f10673a;
        if (str != null) {
            return str;
        }
        C3292l.m14240h(this.f10675c);
        return this.f10675c.flattenToString();
    }
}
