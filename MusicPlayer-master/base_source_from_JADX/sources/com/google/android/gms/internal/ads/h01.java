package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h01 {

    /* renamed from: a */
    private final String f17471a;

    /* renamed from: b */
    private final ka0 f17472b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f17473c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public m01 f17474d;

    /* renamed from: e */
    private final y50<Object> f17475e = new d01(this);

    /* renamed from: f */
    private final y50<Object> f17476f = new f01(this);

    public h01(String str, ka0 ka0, Executor executor) {
        this.f17471a = str;
        this.f17472b = ka0;
        this.f17473c = executor;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ boolean m24611g(h01 h01, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(h01.f17471a);
    }

    /* renamed from: c */
    public final void mo18051c(m01 m01) {
        this.f17472b.mo18874b("/updateActiveView", this.f17475e);
        this.f17472b.mo18874b("/untrackActiveViewUnit", this.f17476f);
        this.f17474d = m01;
    }

    /* renamed from: d */
    public final void mo18052d(pr0 pr0) {
        pr0.mo17686d0("/updateActiveView", this.f17475e);
        pr0.mo17686d0("/untrackActiveViewUnit", this.f17476f);
    }

    /* renamed from: e */
    public final void mo18053e() {
        this.f17472b.mo18875c("/updateActiveView", this.f17475e);
        this.f17472b.mo18875c("/untrackActiveViewUnit", this.f17476f);
    }

    /* renamed from: f */
    public final void mo18054f(pr0 pr0) {
        pr0.mo17688e0("/updateActiveView", this.f17475e);
        pr0.mo17688e0("/untrackActiveViewUnit", this.f17476f);
    }
}
