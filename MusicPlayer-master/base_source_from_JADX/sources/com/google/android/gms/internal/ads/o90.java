package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o90 implements f80, n90 {

    /* renamed from: g */
    private final n90 f20954g;

    /* renamed from: h */
    private final HashSet<AbstractMap.SimpleEntry<String, y50<? super n90>>> f20955h = new HashSet<>();

    public o90(n90 n90) {
        this.f20954g = n90;
    }

    /* renamed from: Y0 */
    public final void mo19655Y0(String str, y50<? super n90> y50) {
        this.f20954g.mo19655Y0(str, y50);
        this.f20955h.remove(new AbstractMap.SimpleEntry(str, y50));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo17508a(String str, String str2) {
        e80.m22859c(this, str, str2);
    }

    /* renamed from: b */
    public final void mo19922b() {
        String str;
        Iterator<AbstractMap.SimpleEntry<String, y50<? super n90>>> it = this.f20955h.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((y50) next.getValue()).toString());
            if (valueOf.length() != 0) {
                str = "Unregistering eventhandler: ".concat(valueOf);
            } else {
                str = new String("Unregistering eventhandler: ");
            }
            C3018m1.m13388k(str);
            this.f20954g.mo19655Y0((String) next.getKey(), (y50) next.getValue());
        }
        this.f20955h.clear();
    }

    /* renamed from: c1 */
    public final /* synthetic */ void mo17684c1(String str, JSONObject jSONObject) {
        e80.m22860d(this, str, jSONObject);
    }

    /* renamed from: n0 */
    public final /* synthetic */ void mo16880n0(String str, Map map) {
        e80.m22857a(this, str, map);
    }

    /* renamed from: p */
    public final void mo17509p(String str) {
        this.f20954g.mo17509p(str);
    }

    /* renamed from: r */
    public final /* synthetic */ void mo16881r(String str, JSONObject jSONObject) {
        e80.m22858b(this, str, jSONObject);
    }

    /* renamed from: z */
    public final void mo19656z(String str, y50<? super n90> y50) {
        this.f20954g.mo19656z(str, y50);
        this.f20955h.add(new AbstractMap.SimpleEntry(str, y50));
    }
}
