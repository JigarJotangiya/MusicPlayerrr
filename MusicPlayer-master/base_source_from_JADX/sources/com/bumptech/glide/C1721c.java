package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1727e;
import com.bumptech.glide.load.p030n.C1877k;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p030n.p031a0.C1808f;
import com.bumptech.glide.load.p030n.p031a0.C1813j;
import com.bumptech.glide.load.p030n.p031a0.C1816k;
import com.bumptech.glide.load.p030n.p032b0.C1826a;
import com.bumptech.glide.load.p030n.p032b0.C1836f;
import com.bumptech.glide.load.p030n.p032b0.C1838g;
import com.bumptech.glide.load.p030n.p032b0.C1839h;
import com.bumptech.glide.load.p030n.p032b0.C1841i;
import com.bumptech.glide.load.p030n.p033c0.C1849a;
import com.bumptech.glide.manager.C2105d;
import com.bumptech.glide.manager.C2108f;
import com.bumptech.glide.manager.C2117o;
import com.bumptech.glide.p047q.C2152g;
import com.bumptech.glide.p047q.C2153h;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p082e.p098e.C3465a;

/* renamed from: com.bumptech.glide.c */
/* compiled from: GlideBuilder */
public final class C1721c {

    /* renamed from: a */
    private final Map<Class<?>, C1743l<?, ?>> f6443a = new C3465a();

    /* renamed from: b */
    private final C1727e.C1728a f6444b = new C1727e.C1728a();

    /* renamed from: c */
    private C1877k f6445c;

    /* renamed from: d */
    private C1807e f6446d;

    /* renamed from: e */
    private C1802b f6447e;

    /* renamed from: f */
    private C1839h f6448f;

    /* renamed from: g */
    private C1849a f6449g;

    /* renamed from: h */
    private C1849a f6450h;

    /* renamed from: i */
    private C1826a.C1827a f6451i;

    /* renamed from: j */
    private C1841i f6452j;

    /* renamed from: k */
    private C2105d f6453k;

    /* renamed from: l */
    private int f6454l = 4;

    /* renamed from: m */
    private C1719b.C1720a f6455m = new C1722a(this);

    /* renamed from: n */
    private C2117o.C2119b f6456n;

    /* renamed from: o */
    private C1849a f6457o;

    /* renamed from: p */
    private boolean f6458p;

    /* renamed from: q */
    private List<C2152g<Object>> f6459q;

    /* renamed from: com.bumptech.glide.c$a */
    /* compiled from: GlideBuilder */
    class C1722a implements C1719b.C1720a {
        C1722a(C1721c cVar) {
        }

        /* renamed from: d */
        public C2153h mo7597d() {
            return new C2153h();
        }
    }

    /* renamed from: com.bumptech.glide.c$b */
    /* compiled from: GlideBuilder */
    static final class C1723b {
        C1723b() {
        }
    }

    /* renamed from: com.bumptech.glide.c$c */
    /* compiled from: GlideBuilder */
    public static final class C1724c {
    }

    /* renamed from: com.bumptech.glide.c$d */
    /* compiled from: GlideBuilder */
    public static final class C1725d {
        private C1725d() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1719b mo7598a(Context context) {
        if (this.f6449g == null) {
            this.f6449g = C1849a.m9017g();
        }
        if (this.f6450h == null) {
            this.f6450h = C1849a.m9015e();
        }
        if (this.f6457o == null) {
            this.f6457o = C1849a.m9013c();
        }
        if (this.f6452j == null) {
            this.f6452j = new C1841i.C1842a(context).mo7843a();
        }
        if (this.f6453k == null) {
            this.f6453k = new C2108f();
        }
        if (this.f6446d == null) {
            int b = this.f6452j.mo7841b();
            if (b > 0) {
                this.f6446d = new C1816k((long) b);
            } else {
                this.f6446d = new C1808f();
            }
        }
        if (this.f6447e == null) {
            this.f6447e = new C1813j(this.f6452j.mo7840a());
        }
        if (this.f6448f == null) {
            this.f6448f = new C1838g((long) this.f6452j.mo7842d());
        }
        if (this.f6451i == null) {
            this.f6451i = new C1836f(context);
        }
        if (this.f6445c == null) {
            this.f6445c = new C1877k(this.f6448f, this.f6451i, this.f6450h, this.f6449g, C1849a.m9018h(), this.f6457o, this.f6458p);
        }
        List<C2152g<Object>> list = this.f6459q;
        if (list == null) {
            this.f6459q = Collections.emptyList();
        } else {
            this.f6459q = Collections.unmodifiableList(list);
        }
        C1727e b2 = this.f6444b.mo7610b();
        return new C1719b(context, this.f6445c, this.f6448f, this.f6446d, this.f6447e, new C2117o(this.f6456n, b2), this.f6453k, this.f6454l, this.f6455m, this.f6443a, this.f6459q, b2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7599b(C2117o.C2119b bVar) {
        this.f6456n = bVar;
    }
}
