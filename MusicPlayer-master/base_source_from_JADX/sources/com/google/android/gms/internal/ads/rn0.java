package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.common.internal.C3292l;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rn0 extends FrameLayout implements jn0 {

    /* renamed from: g */
    private final eo0 f22917g;

    /* renamed from: h */
    private final FrameLayout f22918h;

    /* renamed from: i */
    private final View f22919i;

    /* renamed from: j */
    private final f00 f22920j;

    /* renamed from: k */
    private final go0 f22921k;

    /* renamed from: l */
    private final long f22922l;

    /* renamed from: m */
    private final kn0 f22923m;

    /* renamed from: n */
    private boolean f22924n;

    /* renamed from: o */
    private boolean f22925o;

    /* renamed from: p */
    private boolean f22926p;

    /* renamed from: q */
    private boolean f22927q;

    /* renamed from: r */
    private long f22928r;

    /* renamed from: s */
    private long f22929s;

    /* renamed from: t */
    private String f22930t;

    /* renamed from: u */
    private String[] f22931u;

    /* renamed from: v */
    private Bitmap f22932v;

    /* renamed from: w */
    private final ImageView f22933w;

    /* renamed from: x */
    private boolean f22934x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rn0(Context context, eo0 eo0, int i, boolean z, f00 f00, do0 do0) {
        super(context);
        kn0 kn0;
        Context context2 = context;
        f00 f002 = f00;
        this.f22917g = eo0;
        this.f22920j = f002;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f22918h = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        C3292l.m14240h(eo0.mo17245m());
        ln0 ln0 = eo0.mo17245m().f9813a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            fo0 fo0 = new fo0(context, eo0.zzp(), eo0.mo17250u(), f00, eo0.mo17242k());
            if (i == 2) {
                kn0 = new vo0(context, fo0, eo0, z, ln0.m26792a(eo0), do0);
            } else {
                Context context3 = context;
                kn0 = new in0(context3, eo0, z, ln0.m26792a(eo0), do0, new fo0(context3, eo0.zzp(), eo0.mo17250u(), f00, eo0.mo17242k()));
            }
        } else {
            kn0 = null;
        }
        this.f22923m = kn0;
        View view = new View(context2);
        this.f22919i = view;
        view.setBackgroundColor(0);
        if (kn0 != null) {
            frameLayout.addView(kn0, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22656x)).booleanValue()) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(view);
            }
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22632u)).booleanValue()) {
                mo20715t();
            }
        }
        this.f22933w = new ImageView(context2);
        this.f22922l = ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22672z)).longValue();
        boolean booleanValue = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22648w)).booleanValue();
        this.f22927q = booleanValue;
        if (f002 != null) {
            f002.mo17448d("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.f22921k = new go0(this);
        if (kn0 != null) {
            kn0.mo18442v(this);
        }
        if (kn0 == null) {
            mo18674a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: p */
    private final void m30238p() {
        if (this.f22917g.mo17241i() != null && this.f22925o && !this.f22926p) {
            this.f22917g.mo17241i().getWindow().clearFlags(128);
            this.f22925o = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m30239q(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f22917g.mo16880n0("onVideoEvent", hashMap);
    }

    /* renamed from: r */
    private final boolean m30240r() {
        return this.f22933w.getParent() != null;
    }

    /* renamed from: A */
    public final void mo20699A() {
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            kn0.mo18439s();
        }
    }

    /* renamed from: B */
    public final void mo20700B(int i) {
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            kn0.mo18441u(i);
        }
    }

    @TargetApi(14)
    /* renamed from: C */
    public final void mo20701C(MotionEvent motionEvent) {
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            kn0.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: D */
    public final void mo20702D(int i) {
        this.f22923m.mo18934z(i);
    }

    /* renamed from: E */
    public final void mo20703E(int i) {
        this.f22923m.mo18929A(i);
    }

    /* renamed from: F */
    public final void mo20704F(int i) {
        this.f22923m.mo18930B(i);
    }

    /* renamed from: G */
    public final void mo20705G(int i) {
        this.f22923m.mo18931C(i);
    }

    /* renamed from: H0 */
    public final void mo18673H0(String str, String str2) {
        m30239q("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    /* renamed from: a */
    public final void mo18674a(String str, String str2) {
        m30239q("error", "what", str, "extra", str2);
    }

    /* renamed from: b */
    public final void mo18675b(int i, int i2) {
        if (this.f22927q) {
            C5207iz izVar = C5503qz.f22664y;
            int max = Math.max(i / ((Integer) C5054ev.m23225c().mo20153b(izVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) C5054ev.m23225c().mo20153b(izVar)).intValue(), 1);
            Bitmap bitmap = this.f22932v;
            if (bitmap == null || bitmap.getWidth() != max || this.f22932v.getHeight() != max2) {
                this.f22932v = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.f22934x = false;
            }
        }
    }

    /* renamed from: c */
    public final void mo18676c() {
        kn0 kn0 = this.f22923m;
        if (kn0 != null && this.f22929s == 0) {
            m30239q("canplaythrough", "duration", String.valueOf(((float) kn0.mo18419j()) / 1000.0f), "videoWidth", String.valueOf(this.f22923m.mo18421m()), "videoHeight", String.valueOf(this.f22923m.mo18420l()));
        }
    }

    /* renamed from: d */
    public final void mo18677d() {
        this.f22919i.setVisibility(4);
    }

    /* renamed from: e */
    public final void mo18678e() {
        this.f22921k.mo17999b();
        C2979b2.f9980i.post(new on0(this));
    }

    /* renamed from: f */
    public final void mo18679f() {
        m30239q("pause", new String[0]);
        m30238p();
        this.f22924n = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.f22921k.mo17998a();
            kn0 kn0 = this.f22923m;
            if (kn0 != null) {
                hm0.f17712e.execute(new mn0(kn0));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo18680g() {
        if (this.f22934x && this.f22932v != null && !m30240r()) {
            this.f22933w.setImageBitmap(this.f22932v);
            this.f22933w.invalidate();
            this.f22918h.addView(this.f22933w, new FrameLayout.LayoutParams(-1, -1));
            this.f22918h.bringChildToFront(this.f22933w);
        }
        this.f22921k.mo17998a();
        this.f22929s = this.f22928r;
        C2979b2.f9980i.post(new pn0(this));
    }

    /* renamed from: h */
    public final void mo20707h(int i) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22656x)).booleanValue()) {
            this.f22918h.setBackgroundColor(i);
            this.f22919i.setBackgroundColor(i);
        }
    }

    /* renamed from: i */
    public final void mo18681i() {
        if (this.f22924n && m30240r()) {
            this.f22918h.removeView(this.f22933w);
        }
        if (this.f22932v != null) {
            long b = C2971s.m13198a().mo11989b();
            if (this.f22923m.getBitmap(this.f22932v) != null) {
                this.f22934x = true;
            }
            long b2 = C2971s.m13198a().mo11989b() - b;
            if (C3018m1.m13390m()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b2);
                sb.append("ms");
                C3018m1.m13388k(sb.toString());
            }
            if (b2 > this.f22922l) {
                ul0.m31862g("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f22927q = false;
                this.f22932v = null;
                f00 f00 = this.f22920j;
                if (f00 != null) {
                    f00.mo17448d("spinner_jank", Long.toString(b2));
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo20708j(int i) {
        this.f22923m.mo18932a(i);
    }

    /* renamed from: k */
    public final void mo20709k(String str, String[] strArr) {
        this.f22930t = str;
        this.f22931u = strArr;
    }

    /* renamed from: l */
    public final void mo20710l(int i, int i2, int i3, int i4) {
        if (C3018m1.m13390m()) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Set video bounds to x:");
            sb.append(i);
            sb.append(";y:");
            sb.append(i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            C3018m1.m13388k(sb.toString());
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f22918h.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* renamed from: m */
    public final void mo20711m(float f) {
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            kn0.f18929h.mo18453e(f);
            kn0.mo18178k();
        }
    }

    /* renamed from: n */
    public final void mo20712n(float f, float f2) {
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            kn0.mo18445y(f, f2);
        }
    }

    /* renamed from: o */
    public final void mo20713o() {
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            kn0.f18929h.mo18452d(false);
            kn0.mo18178k();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f22921k.mo17999b();
        } else {
            this.f22921k.mo17998a();
            this.f22929s = this.f22928r;
        }
        C2979b2.f9980i.post(new nn0(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f22921k.mo17999b();
            z = true;
        } else {
            this.f22921k.mo17998a();
            this.f22929s = this.f22928r;
            z = false;
        }
        C2979b2.f9980i.post(new qn0(this, z));
    }

    @TargetApi(14)
    /* renamed from: t */
    public final void mo20715t() {
        String str;
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            TextView textView = new TextView(kn0.getContext());
            String valueOf = String.valueOf(this.f22923m.mo18437q());
            if (valueOf.length() != 0) {
                str = "AdMob - ".concat(valueOf);
            } else {
                str = new String("AdMob - ");
            }
            textView.setText(str);
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f22918h.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f22918h.bringChildToFront(textView);
        }
    }

    /* renamed from: u */
    public final void mo20716u() {
        this.f22921k.mo17998a();
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            kn0.mo18444x();
        }
        m30238p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo20717v(boolean z) {
        m30239q("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    /* renamed from: w */
    public final void mo20718w() {
        if (this.f22923m != null) {
            if (!TextUtils.isEmpty(this.f22930t)) {
                this.f22923m.mo18933g(this.f22930t, this.f22931u);
            } else {
                m30239q("no_src", new String[0]);
            }
        }
    }

    /* renamed from: x */
    public final void mo20719x() {
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            kn0.f18929h.mo18452d(true);
            kn0.mo18178k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo20720y() {
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            long h = (long) kn0.mo18417h();
            if (this.f22928r != h && h > 0) {
                float f = ((float) h) / 1000.0f;
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue()) {
                    m30239q("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.f22923m.mo18436p()), "qoeCachedBytes", String.valueOf(this.f22923m.mo18422n()), "qoeLoadedBytes", String.valueOf(this.f22923m.mo18423o()), "droppedFrames", String.valueOf(this.f22923m.mo18418i()), "reportTime", String.valueOf(C2971s.m13198a().mo11988a()));
                } else {
                    m30239q("timeupdate", "time", String.valueOf(f));
                }
                this.f22928r = h;
            }
        }
    }

    /* renamed from: z */
    public final void mo20721z() {
        kn0 kn0 = this.f22923m;
        if (kn0 != null) {
            kn0.mo18438r();
        }
    }

    public final void zza() {
        m30239q("ended", new String[0]);
        m30238p();
    }

    public final void zze() {
        if (this.f22917g.mo17241i() != null && !this.f22925o) {
            boolean z = (this.f22917g.mo17241i().getWindow().getAttributes().flags & 128) != 0;
            this.f22926p = z;
            if (!z) {
                this.f22917g.mo17241i().getWindow().addFlags(128);
                this.f22925o = true;
            }
        }
        this.f22924n = true;
    }
}
