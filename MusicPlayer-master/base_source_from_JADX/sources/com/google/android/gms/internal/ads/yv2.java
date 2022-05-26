package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yv2 extends uv2 {

    /* renamed from: h */
    private static final Pattern f26561h = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final wv2 f26562a;

    /* renamed from: b */
    private final List<mw2> f26563b = new ArrayList();

    /* renamed from: c */
    private ux2 f26564c;

    /* renamed from: d */
    private xw2 f26565d;

    /* renamed from: e */
    private boolean f26566e = false;

    /* renamed from: f */
    private boolean f26567f = false;

    /* renamed from: g */
    private final String f26568g;

    yv2(vv2 vv2, wv2 wv2) {
        this.f26562a = wv2;
        this.f26568g = UUID.randomUUID().toString();
        m34321k((View) null);
        if (wv2.mo21928d() == xv2.HTML || wv2.mo21928d() == xv2.JAVASCRIPT) {
            this.f26565d = new yw2(wv2.mo21927a());
        } else {
            this.f26565d = new ax2(wv2.mo21933i(), (String) null);
        }
        this.f26565d.mo15985j();
        jw2.m26008a().mo18756d(this);
        pw2.m29249a().mo20327d(this.f26565d.mo22083a(), vv2.mo21603b());
    }

    /* renamed from: k */
    private final void m34321k(View view) {
        this.f26564c = new ux2(view);
    }

    /* renamed from: b */
    public final void mo21380b(View view, aw2 aw2, String str) {
        mw2 mw2;
        if (this.f26567f) {
            return;
        }
        if (f26561h.matcher("Ad overlay").matches()) {
            Iterator<mw2> it = this.f26563b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    mw2 = null;
                    break;
                }
                mw2 = it.next();
                if (mw2.mo19567b().get() == view) {
                    break;
                }
            }
            if (mw2 == null) {
                this.f26563b.add(new mw2(view, aw2, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
    }

    /* renamed from: c */
    public final void mo21381c() {
        if (!this.f26567f) {
            this.f26564c.clear();
            if (!this.f26567f) {
                this.f26563b.clear();
            }
            this.f26567f = true;
            pw2.m29249a().mo20326c(this.f26565d.mo22083a());
            jw2.m26008a().mo18757e(this);
            this.f26565d.mo15983c();
            this.f26565d = null;
        }
    }

    /* renamed from: d */
    public final void mo21382d(View view) {
        if (!this.f26567f && mo22298f() != view) {
            m34321k(view);
            this.f26565d.mo22084b();
            Collection<yv2> c = jw2.m26008a().mo18755c();
            if (c != null && c.size() > 0) {
                for (yv2 next : c) {
                    if (next != this && next.mo22298f() == view) {
                        next.f26564c.clear();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo21383e() {
        if (!this.f26566e) {
            this.f26566e = true;
            jw2.m26008a().mo18758f(this);
            this.f26565d.mo22088h(qw2.m29759b().mo20516a());
            this.f26565d.mo15984f(this, this.f26562a);
        }
    }

    /* renamed from: f */
    public final View mo22298f() {
        return (View) this.f26564c.get();
    }

    /* renamed from: g */
    public final xw2 mo22299g() {
        return this.f26565d;
    }

    /* renamed from: h */
    public final String mo22300h() {
        return this.f26568g;
    }

    /* renamed from: i */
    public final List<mw2> mo22301i() {
        return this.f26563b;
    }

    /* renamed from: j */
    public final boolean mo22302j() {
        return this.f26566e && !this.f26567f;
    }
}
