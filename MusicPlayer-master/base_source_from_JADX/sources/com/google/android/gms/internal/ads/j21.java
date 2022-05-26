package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j21 implements yr3<h21> {

    /* renamed from: a */
    private final ms3<f41> f18322a;

    /* renamed from: b */
    private final ms3<Context> f18323b;

    /* renamed from: c */
    private final ms3<cp2> f18324c;

    /* renamed from: d */
    private final ms3<View> f18325d;

    /* renamed from: e */
    private final ms3<pr0> f18326e;

    /* renamed from: f */
    private final ms3<e41> f18327f;

    /* renamed from: g */
    private final ms3<mk1> f18328g;

    /* renamed from: h */
    private final ms3<ag1> f18329h;

    /* renamed from: i */
    private final ms3<w82> f18330i;

    /* renamed from: j */
    private final ms3<Executor> f18331j;

    public j21(ms3<f41> ms3, ms3<Context> ms32, ms3<cp2> ms33, ms3<View> ms34, ms3<pr0> ms35, ms3<e41> ms36, ms3<mk1> ms37, ms3<ag1> ms38, ms3<w82> ms39, ms3<Executor> ms310) {
        this.f18322a = ms3;
        this.f18323b = ms32;
        this.f18324c = ms33;
        this.f18325d = ms34;
        this.f18326e = ms35;
        this.f18327f = ms36;
        this.f18328g = ms37;
        this.f18329h = ms38;
        this.f18330i = ms39;
        this.f18331j = ms310;
    }

    /* renamed from: c */
    public static h21 m25485c(f41 f41, Context context, cp2 cp2, View view, pr0 pr0, e41 e41, mk1 mk1, ag1 ag1, sr3<w82> sr3, Executor executor) {
        return new h21(f41, context, cp2, view, pr0, e41, mk1, ag1, sr3, executor);
    }

    /* renamed from: b */
    public final h21 mo10679a() {
        return new h21(((c61) this.f18322a).mo10679a(), this.f18323b.mo10679a(), ((p21) this.f18324c).mo20179b(), ((o21) this.f18325d).mo19886b(), ((a31) this.f18326e).mo15673b(), ((q21) this.f18327f).mo20359b(), ((ki1) this.f18328g).mo18892b(), this.f18329h.mo10679a(), xr3.m33786b(this.f18330i), this.f18331j.mo10679a());
    }
}
