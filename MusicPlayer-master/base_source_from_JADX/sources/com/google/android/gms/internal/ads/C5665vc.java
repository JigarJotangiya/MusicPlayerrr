package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5665vc extends C5111gd {

    /* renamed from: h */
    private List<Long> f24677h = null;

    public C5665vc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        super(wbVar, "Zsy6wzxKzkvuI5Zg91hlK7lftgUdlMXbkLzI72tnQVNXNUFbyYhuDjwGRJi5QzOf", "/h10yfi8gz82TQ6rp82eUm/z42AeNO79/O3Nlfr8yws=", b8Var, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        this.f17019d.mo16101J(-1);
        this.f17019d.mo16097F(-1);
        if (this.f24677h == null) {
            this.f24677h = (List) this.f17020e.invoke((Object) null, new Object[]{this.f17016a.mo21778b()});
        }
        List<Long> list = this.f24677h;
        if (list != null && list.size() == 2) {
            synchronized (this.f17019d) {
                this.f17019d.mo16101J(this.f24677h.get(0).longValue());
                this.f17019d.mo16097F(this.f24677h.get(1).longValue());
            }
        }
    }
}
