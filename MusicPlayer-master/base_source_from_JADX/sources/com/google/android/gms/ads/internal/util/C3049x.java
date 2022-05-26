package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.aw1;
import com.google.android.gms.internal.ads.e93;
import com.google.android.gms.internal.ads.ew1;
import com.google.android.gms.internal.ads.hm0;
import com.google.android.gms.internal.ads.ul0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.util.x */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3049x {

    /* renamed from: a */
    private final Context f10118a;

    /* renamed from: b */
    private final ew1 f10119b;

    /* renamed from: c */
    private String f10120c;

    /* renamed from: d */
    private String f10121d;

    /* renamed from: e */
    private String f10122e;

    /* renamed from: f */
    private String f10123f;

    /* renamed from: g */
    private int f10124g;

    /* renamed from: h */
    private int f10125h;

    /* renamed from: i */
    private PointF f10126i;

    /* renamed from: j */
    private PointF f10127j;

    /* renamed from: k */
    private Handler f10128k;

    /* renamed from: l */
    private Runnable f10129l;

    public C3049x(Context context) {
        this.f10124g = 0;
        this.f10129l = new C3007j(this);
        this.f10118a = context;
        this.f10125h = ViewConfiguration.get(context).getScaledTouchSlop();
        C2971s.m13218u().mo11123b();
        this.f10128k = C2971s.m13218u().mo11122a();
        this.f10119b = C2971s.m13217t().mo10990a();
    }

    /* renamed from: s */
    private final void m13491s(Context context) {
        ArrayList arrayList = new ArrayList();
        int u = m13493u(arrayList, "None", true);
        int u2 = m13493u(arrayList, "Shake", true);
        int u3 = m13493u(arrayList, "Flick", true);
        aw1 aw1 = aw1.NONE;
        int ordinal = this.f10119b.mo17362a().ordinal();
        int i = ordinal != 1 ? ordinal != 2 ? u : u3 : u2;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, C2971s.m13215r().mo11021k());
        AtomicInteger atomicInteger = new AtomicInteger(i);
        builder.setTitle("Setup gesture");
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new C3034s(atomicInteger));
        builder.setNegativeButton("Dismiss", new C3022o(this));
        builder.setPositiveButton("Save", new C3031r(this, atomicInteger, i, u2, u3));
        builder.setOnCancelListener(new C3000h(this));
        builder.create().show();
    }

    /* renamed from: t */
    private final boolean m13492t(float f, float f2, float f3, float f4) {
        return Math.abs(this.f10126i.x - f) < ((float) this.f10125h) && Math.abs(this.f10126i.y - f2) < ((float) this.f10125h) && Math.abs(this.f10127j.x - f3) < ((float) this.f10125h) && Math.abs(this.f10127j.y - f4) < ((float) this.f10125h);
    }

    /* renamed from: u */
    private static final int m13493u(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo11126a() {
        m13491s(this.f10118a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo11127b() {
        m13491s(this.f10118a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo11128c(e93 e93) {
        if (!C2971s.m13217t().mo10999j(this.f10118a, this.f10121d, this.f10122e)) {
            C2971s.m13217t().mo10993d(this.f10118a, this.f10121d, this.f10122e);
        } else {
            e93.execute(new C3043v(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo11129d(e93 e93) {
        if (!C2971s.m13217t().mo10999j(this.f10118a, this.f10121d, this.f10122e)) {
            C2971s.m13217t().mo10993d(this.f10118a, this.f10121d, this.f10122e);
        } else {
            e93.execute(new C3004i(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo11130e() {
        C2971s.m13217t().mo10992c(this.f10118a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo11131f() {
        C2971s.m13217t().mo10992c(this.f10118a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo11132g() {
        this.f10124g = 4;
        mo11143r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo11133h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.f10119b.mo17371j(aw1.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.f10119b.mo17371j(aw1.FLICK);
            } else {
                this.f10119b.mo17371j(aw1.NONE);
            }
        }
        mo11143r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo11134i(String str, DialogInterface dialogInterface, int i) {
        C2971s.m13214q();
        C2979b2.m13269q(this.f10118a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo11135j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 == i) {
            if (!(this.f10118a instanceof Activity)) {
                ul0.m31861f("Can not create dialog without Activity Context");
                return;
            }
            String str = this.f10120c;
            String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                C2971s.m13214q();
                Map<String, String> s = C2979b2.m13271s(build);
                for (String next : s.keySet()) {
                    sb.append(next);
                    sb.append(" = ");
                    sb.append(s.get(next));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f10118a);
            builder.setMessage(str2);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new C3028q(this, str2));
            builder.setNegativeButton("Close", C3037t.f10103g);
            builder.create().show();
        } else if (i6 == i2) {
            ul0.m31857b("Debug mode [Creative Preview] selected.");
            hm0.f17708a.execute(new C3013l(this));
        } else if (i6 == i3) {
            ul0.m31857b("Debug mode [Troubleshooting] selected.");
            hm0.f17708a.execute(new C3010k(this));
        } else if (i6 == i4) {
            e93 e93 = hm0.f17712e;
            e93 e932 = hm0.f17708a;
            if (this.f10119b.mo17374m()) {
                e93.execute(new C3046w(this));
            } else {
                e932.execute(new C3019n(this, e93));
            }
        } else if (i6 == i5) {
            e93 e933 = hm0.f17712e;
            e93 e934 = hm0.f17708a;
            if (this.f10119b.mo17374m()) {
                e933.execute(new C3040u(this));
            } else {
                e934.execute(new C3016m(this, e933));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo11136k() {
        C2981c0 t = C2971s.m13217t();
        Context context = this.f10118a;
        String str = this.f10121d;
        String str2 = this.f10122e;
        String str3 = this.f10123f;
        boolean m = t.mo11002m();
        t.mo10997h(t.mo10999j(context, str, str2));
        if (t.mo11002m()) {
            if (!m && !TextUtils.isEmpty(str3)) {
                t.mo10994e(context, str2, str3, str);
            }
            ul0.m31857b("Device is linked for debug signals.");
            t.mo10998i(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        t.mo10993d(context, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo11137l() {
        C2981c0 t = C2971s.m13217t();
        Context context = this.f10118a;
        String str = this.f10121d;
        String str2 = this.f10122e;
        if (!t.mo11000k(context, str, str2)) {
            t.mo10998i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(t.f9996f)) {
            ul0.m31857b("Creative is not pushed for this device.");
            t.mo10998i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(t.f9996f)) {
            ul0.m31857b("The app is not linked for creative preview.");
            t.mo10993d(context, str, str2);
        } else if ("0".equals(t.f9996f)) {
            ul0.m31857b("Device is linked for in app preview.");
            t.mo10998i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: m */
    public final void mo11138m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f10124g = 0;
            this.f10126i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f10124g;
        if (i != -1) {
            if (i == 0) {
                if (actionMasked == 5) {
                    this.f10124g = 5;
                    this.f10127j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.f10128k.postDelayed(this.f10129l, ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22391O2)).longValue());
                }
            } else if (i == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z = false;
                        for (int i2 = 0; i2 < historySize; i2++) {
                            z |= !m13492t(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                        }
                        if (m13492t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f10124g = -1;
                this.f10128k.removeCallbacks(this.f10129l);
            }
        }
    }

    /* renamed from: n */
    public final void mo11139n(String str) {
        this.f10121d = str;
    }

    /* renamed from: o */
    public final void mo11140o(String str) {
        this.f10122e = str;
    }

    /* renamed from: p */
    public final void mo11141p(String str) {
        this.f10120c = str;
    }

    /* renamed from: q */
    public final void mo11142q(String str) {
        this.f10123f = str;
    }

    /* renamed from: r */
    public final void mo11143r() {
        try {
            if (!(this.f10118a instanceof Activity)) {
                ul0.m31861f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(C2971s.m13217t().mo10991b())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != C2971s.m13217t().mo11002m()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            int u = m13493u(arrayList, "Ad information", true);
            int u2 = m13493u(arrayList, str, true);
            int u3 = m13493u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22535h6)).booleanValue();
            int u4 = m13493u(arrayList, "Open ad inspector", booleanValue);
            int u5 = m13493u(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f10118a, C2971s.m13215r().mo11021k());
            builder.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new C3025p(this, u, u2, u3, u4, u5));
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            C3018m1.m13389l(BuildConfig.FLAVOR, e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f10120c);
        sb.append(",DebugSignal: ");
        sb.append(this.f10123f);
        sb.append(",AFMA Version: ");
        sb.append(this.f10122e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f10121d);
        sb.append("}");
        return sb.toString();
    }

    public C3049x(Context context, String str) {
        this(context);
        this.f10120c = str;
    }
}
