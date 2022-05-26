package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class m21 {

    /* renamed from: a */
    private final e41 f19728a;

    /* renamed from: b */
    private final View f19729b;

    /* renamed from: c */
    private final cp2 f19730c;

    /* renamed from: d */
    private final pr0 f19731d;

    public m21(View view, pr0 pr0, e41 e41, cp2 cp2) {
        this.f19729b = view;
        this.f19731d = pr0;
        this.f19728a = e41;
        this.f19730c = cp2;
    }

    /* renamed from: f */
    public static final qf1<u91> m27096f(Context context, zzcjf zzcjf, bp2 bp2, up2 up2) {
        return new qf1<>(new k21(context, zzcjf, bp2, up2), hm0.f17713f);
    }

    /* renamed from: g */
    public static final Set<qf1<u91>> m27097g(y31 y31) {
        return Collections.singleton(new qf1(y31, hm0.f17713f));
    }

    /* renamed from: h */
    public static final qf1<u91> m27098h(w31 w31) {
        return new qf1<>(w31, hm0.f17712e);
    }

    /* renamed from: a */
    public final View mo19326a() {
        return this.f19729b;
    }

    /* renamed from: b */
    public final pr0 mo19327b() {
        return this.f19731d;
    }

    /* renamed from: c */
    public final e41 mo19328c() {
        return this.f19728a;
    }

    /* renamed from: d */
    public s91 mo19329d(Set<qf1<u91>> set) {
        return new s91(set);
    }

    /* renamed from: e */
    public final cp2 mo19330e() {
        return this.f19730c;
    }
}
