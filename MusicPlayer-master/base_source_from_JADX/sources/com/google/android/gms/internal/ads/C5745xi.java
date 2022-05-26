package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C5745xi {

    /* renamed from: a */
    public final Uri f25834a;

    /* renamed from: b */
    public final String f25835b = null;

    /* renamed from: c */
    public final C5074fd f25836c;

    /* renamed from: d */
    public final C5729x2 f25837d;

    /* renamed from: e */
    public final List f25838e;

    /* renamed from: f */
    public final String f25839f;

    /* renamed from: g */
    public final g43<C5823zl> f25840g;

    /* renamed from: h */
    public final Object f25841h;

    /* synthetic */ C5745xi(Uri uri, String str, C5074fd fdVar, C5729x2 x2Var, List list, String str2, g43 g43, Object obj, C5004di diVar) {
        this.f25834a = uri;
        this.f25838e = list;
        this.f25839f = null;
        this.f25840g = g43;
        d43 zzi = g43.zzi();
        if (g43.size() <= 0) {
            zzi.mo16856g();
            this.f25841h = null;
            return;
        }
        C5823zl zlVar = (C5823zl) g43.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5745xi)) {
            return false;
        }
        C5745xi xiVar = (C5745xi) obj;
        if (this.f25834a.equals(xiVar.f25834a)) {
            String str = xiVar.f25835b;
            if (wy2.m33453p((Object) null, (Object) null)) {
                C5074fd fdVar = xiVar.f25836c;
                if (wy2.m33453p((Object) null, (Object) null)) {
                    C5729x2 x2Var = xiVar.f25837d;
                    if (wy2.m33453p((Object) null, (Object) null) && this.f25838e.equals(xiVar.f25838e)) {
                        String str2 = xiVar.f25839f;
                        if (wy2.m33453p((Object) null, (Object) null) && this.f25840g.equals(xiVar.f25840g)) {
                            Object obj2 = xiVar.f25841h;
                            if (wy2.m33453p((Object) null, (Object) null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f25834a.hashCode() * 923521) + this.f25838e.hashCode()) * 961) + this.f25840g.hashCode()) * 31;
    }
}
