package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.li */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5301li {

    /* renamed from: a */
    public final String f19438a;

    /* renamed from: b */
    public final boolean f19439b;

    public C5301li(String str, boolean z) {
        this.f19438a = str;
        this.f19439b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C5301li.class) {
            C5301li liVar = (C5301li) obj;
            return TextUtils.equals(this.f19438a, liVar.f19438a) && this.f19439b == liVar.f19439b;
        }
    }

    public final int hashCode() {
        String str = this.f19438a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f19439b ? 1237 : 1231);
    }
}
