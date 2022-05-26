package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gx2 {

    /* renamed from: a */
    private final HashMap<View, String> f17453a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, fx2> f17454b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f17455c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f17456d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f17457e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f17458f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f17459g = new HashMap<>();

    /* renamed from: h */
    private boolean f17460h;

    /* renamed from: a */
    public final View mo18035a(String str) {
        return this.f17455c.get(str);
    }

    /* renamed from: b */
    public final fx2 mo18036b(View view) {
        fx2 fx2 = this.f17454b.get(view);
        if (fx2 != null) {
            this.f17454b.remove(view);
        }
        return fx2;
    }

    /* renamed from: c */
    public final String mo18037c(String str) {
        return this.f17459g.get(str);
    }

    /* renamed from: d */
    public final String mo18038d(View view) {
        if (this.f17453a.size() == 0) {
            return null;
        }
        String str = this.f17453a.get(view);
        if (str != null) {
            this.f17453a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public final HashSet<String> mo18039e() {
        return this.f17458f;
    }

    /* renamed from: f */
    public final HashSet<String> mo18040f() {
        return this.f17457e;
    }

    /* renamed from: g */
    public final void mo18041g() {
        this.f17453a.clear();
        this.f17454b.clear();
        this.f17455c.clear();
        this.f17456d.clear();
        this.f17457e.clear();
        this.f17458f.clear();
        this.f17459g.clear();
        this.f17460h = false;
    }

    /* renamed from: h */
    public final void mo18042h() {
        this.f17460h = true;
    }

    /* renamed from: i */
    public final void mo18043i() {
        jw2 a = jw2.m26008a();
        if (a != null) {
            for (yv2 next : a.mo18754b()) {
                View f = next.mo22298f();
                if (next.mo22302j()) {
                    String h = next.mo22300h();
                    if (f != null) {
                        String str = null;
                        if (!f.hasWindowFocus()) {
                            str = "noWindowFocus";
                        } else {
                            HashSet hashSet = new HashSet();
                            View view = f;
                            while (true) {
                                if (view == null) {
                                    this.f17456d.addAll(hashSet);
                                    break;
                                }
                                String b = ex2.m23309b(view);
                                if (b != null) {
                                    str = b;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        }
                        if (str == null) {
                            this.f17457e.add(h);
                            this.f17453a.put(f, h);
                            for (mw2 next2 : next.mo22301i()) {
                                View view2 = (View) next2.mo19567b().get();
                                if (view2 != null) {
                                    fx2 fx2 = this.f17454b.get(view2);
                                    if (fx2 != null) {
                                        fx2.mo17764c(next.mo22300h());
                                    } else {
                                        this.f17454b.put(view2, new fx2(next2, next.mo22300h()));
                                    }
                                }
                            }
                        } else {
                            this.f17458f.add(h);
                            this.f17455c.put(h, f);
                            this.f17459g.put(h, str);
                        }
                    } else {
                        this.f17458f.add(h);
                        this.f17459g.put(h, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final int mo18044j(View view) {
        if (this.f17456d.contains(view)) {
            return 1;
        }
        return this.f17460h ? 2 : 3;
    }
}
