package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3158b;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.internal.q */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3206q {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f10441a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C7471i<?>, Boolean> f10442b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: f */
    private final void m13936f(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f10441a) {
            hashMap = new HashMap(this.f10441a);
        }
        synchronized (this.f10442b) {
            hashMap2 = new HashMap(this.f10442b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo11534b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C7471i) entry2.getKey()).mo28355d(new C3158b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <TResult> void mo11619a(C7471i<TResult> iVar, boolean z) {
        this.f10442b.put(iVar, Boolean.valueOf(z));
        iVar.mo28352a().mo28332b(new C3175b1(this, iVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo11620b() {
        return !this.f10441a.isEmpty() || !this.f10442b.isEmpty();
    }

    /* renamed from: c */
    public final void mo11621c() {
        m13936f(false, C3181e.f10374x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11622d(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        m13936f(true, new Status(20, sb.toString()));
    }
}
