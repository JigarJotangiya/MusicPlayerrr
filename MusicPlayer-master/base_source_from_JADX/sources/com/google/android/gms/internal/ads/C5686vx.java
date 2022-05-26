package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.C3110r;
import com.google.android.gms.ads.p070b0.C2891a;
import com.google.android.gms.ads.search.C3113a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.vx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5686vx {

    /* renamed from: a */
    private final Date f25034a;

    /* renamed from: b */
    private final String f25035b;

    /* renamed from: c */
    private final List<String> f25036c;

    /* renamed from: d */
    private final int f25037d;

    /* renamed from: e */
    private final Set<String> f25038e;

    /* renamed from: f */
    private final Location f25039f;

    /* renamed from: g */
    private final Bundle f25040g;

    /* renamed from: h */
    private final Map<Class<? extends Object>, Object> f25041h;

    /* renamed from: i */
    private final String f25042i;

    /* renamed from: j */
    private final String f25043j;

    /* renamed from: k */
    private final C3113a f25044k;

    /* renamed from: l */
    private final int f25045l;

    /* renamed from: m */
    private final Set<String> f25046m;

    /* renamed from: n */
    private final Bundle f25047n;

    /* renamed from: o */
    private final Set<String> f25048o;

    /* renamed from: p */
    private final boolean f25049p;

    /* renamed from: q */
    private final C2891a f25050q;

    /* renamed from: r */
    private final String f25051r;

    /* renamed from: s */
    private final int f25052s;

    public C5686vx(C5649ux uxVar, C3113a aVar) {
        this.f25034a = uxVar.f24494g;
        this.f25035b = uxVar.f24495h;
        this.f25036c = uxVar.f24496i;
        this.f25037d = uxVar.f24497j;
        this.f25038e = Collections.unmodifiableSet(uxVar.f24488a);
        this.f25039f = uxVar.f24498k;
        this.f25040g = uxVar.f24489b;
        this.f25041h = Collections.unmodifiableMap(uxVar.f24490c);
        this.f25042i = uxVar.f24499l;
        this.f25043j = uxVar.f24500m;
        this.f25045l = uxVar.f24501n;
        this.f25046m = Collections.unmodifiableSet(uxVar.f24491d);
        this.f25047n = uxVar.f24492e;
        this.f25048o = Collections.unmodifiableSet(uxVar.f24493f);
        this.f25049p = uxVar.f24502o;
        C2891a unused = uxVar.f24503p;
        this.f25051r = uxVar.f24504q;
        this.f25052s = uxVar.f24505r;
    }

    @Deprecated
    /* renamed from: a */
    public final int mo21604a() {
        return this.f25037d;
    }

    /* renamed from: b */
    public final int mo21605b() {
        return this.f25052s;
    }

    /* renamed from: c */
    public final int mo21606c() {
        return this.f25045l;
    }

    /* renamed from: d */
    public final Location mo21607d() {
        return this.f25039f;
    }

    /* renamed from: e */
    public final Bundle mo21608e() {
        return this.f25047n;
    }

    /* renamed from: f */
    public final Bundle mo21609f(Class<? extends Object> cls) {
        return this.f25040g.getBundle(cls.getName());
    }

    /* renamed from: g */
    public final Bundle mo21610g() {
        return this.f25040g;
    }

    /* renamed from: h */
    public final C2891a mo21611h() {
        return this.f25050q;
    }

    /* renamed from: i */
    public final C3113a mo21612i() {
        return this.f25044k;
    }

    /* renamed from: j */
    public final String mo21613j() {
        return this.f25051r;
    }

    /* renamed from: k */
    public final String mo21614k() {
        return this.f25035b;
    }

    /* renamed from: l */
    public final String mo21615l() {
        return this.f25042i;
    }

    /* renamed from: m */
    public final String mo21616m() {
        return this.f25043j;
    }

    @Deprecated
    /* renamed from: n */
    public final Date mo21617n() {
        return this.f25034a;
    }

    /* renamed from: o */
    public final List<String> mo21618o() {
        return new ArrayList(this.f25036c);
    }

    /* renamed from: p */
    public final Map<Class<? extends Object>, Object> mo21619p() {
        return this.f25041h;
    }

    /* renamed from: q */
    public final Set<String> mo21620q() {
        return this.f25048o;
    }

    /* renamed from: r */
    public final Set<String> mo21621r() {
        return this.f25038e;
    }

    @Deprecated
    /* renamed from: s */
    public final boolean mo21622s() {
        return this.f25049p;
    }

    /* renamed from: t */
    public final boolean mo21623t(Context context) {
        C3110r a = C4983cy.m22198d().mo16763a();
        C4980cv.m22123b();
        String t = nl0.m27928t(context);
        return this.f25046m.contains(t) || a.mo11343d().contains(t);
    }
}
