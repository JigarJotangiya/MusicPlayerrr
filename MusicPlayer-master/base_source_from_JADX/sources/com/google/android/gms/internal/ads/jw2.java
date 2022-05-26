package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jw2 {

    /* renamed from: c */
    private static final jw2 f18672c = new jw2();

    /* renamed from: a */
    private final ArrayList<yv2> f18673a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<yv2> f18674b = new ArrayList<>();

    private jw2() {
    }

    /* renamed from: a */
    public static jw2 m26008a() {
        return f18672c;
    }

    /* renamed from: b */
    public final Collection<yv2> mo18754b() {
        return Collections.unmodifiableCollection(this.f18674b);
    }

    /* renamed from: c */
    public final Collection<yv2> mo18755c() {
        return Collections.unmodifiableCollection(this.f18673a);
    }

    /* renamed from: d */
    public final void mo18756d(yv2 yv2) {
        this.f18673a.add(yv2);
    }

    /* renamed from: e */
    public final void mo18757e(yv2 yv2) {
        boolean g = mo18759g();
        this.f18673a.remove(yv2);
        this.f18674b.remove(yv2);
        if (g && !mo18759g()) {
            qw2.m29759b().mo20520f();
        }
    }

    /* renamed from: f */
    public final void mo18758f(yv2 yv2) {
        boolean g = mo18759g();
        this.f18674b.add(yv2);
        if (!g) {
            qw2.m29759b().mo20519e();
        }
    }

    /* renamed from: g */
    public final boolean mo18759g() {
        return this.f18674b.size() > 0;
    }
}
