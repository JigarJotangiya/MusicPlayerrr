package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mo1 implements y50<Object> {

    /* renamed from: a */
    private final t30 f20106a;

    /* renamed from: b */
    private final bp1 f20107b;

    /* renamed from: c */
    private final sr3<io1> f20108c;

    public mo1(mk1 mk1, bk1 bk1, bp1 bp1, sr3<io1> sr3) {
        this.f20106a = mk1.mo19403c(bk1.mo16287g0());
        this.f20107b = bp1;
        this.f20108c = sr3;
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f20106a.mo20577b5(this.f20108c.mo10679a(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            ul0.m31863h(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public final void mo19481b() {
        if (this.f20106a != null) {
            this.f20107b.mo16355i("/nativeAdCustomClick", this);
        }
    }
}
