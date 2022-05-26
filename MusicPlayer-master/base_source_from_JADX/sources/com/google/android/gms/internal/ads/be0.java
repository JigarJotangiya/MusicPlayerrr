package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class be0 extends ce0 implements y50<pr0> {

    /* renamed from: c */
    private final pr0 f14412c;

    /* renamed from: d */
    private final Context f14413d;

    /* renamed from: e */
    private final WindowManager f14414e;

    /* renamed from: f */
    private final C5836zy f14415f;

    /* renamed from: g */
    DisplayMetrics f14416g;

    /* renamed from: h */
    private float f14417h;

    /* renamed from: i */
    int f14418i = -1;

    /* renamed from: j */
    int f14419j = -1;

    /* renamed from: k */
    private int f14420k;

    /* renamed from: l */
    int f14421l = -1;

    /* renamed from: m */
    int f14422m = -1;

    /* renamed from: n */
    int f14423n = -1;

    /* renamed from: o */
    int f14424o = -1;

    public be0(pr0 pr0, Context context, C5836zy zyVar) {
        super(pr0, BuildConfig.FLAVOR);
        this.f14412c = pr0;
        this.f14413d = context;
        this.f14415f = zyVar;
        this.f14414e = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo15685a(Object obj, Map map) {
        JSONObject jSONObject;
        pr0 pr0 = (pr0) obj;
        this.f14416g = new DisplayMetrics();
        Display defaultDisplay = this.f14414e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f14416g);
        this.f14417h = this.f14416g.density;
        this.f14420k = defaultDisplay.getRotation();
        C4980cv.m22123b();
        DisplayMetrics displayMetrics = this.f14416g;
        this.f14418i = nl0.m27925q(displayMetrics, displayMetrics.widthPixels);
        C4980cv.m22123b();
        DisplayMetrics displayMetrics2 = this.f14416g;
        this.f14419j = nl0.m27925q(displayMetrics2, displayMetrics2.heightPixels);
        Activity i = this.f14412c.mo17241i();
        if (i == null || i.getWindow() == null) {
            this.f14421l = this.f14418i;
            this.f14422m = this.f14419j;
        } else {
            C2971s.m13214q();
            int[] u = C2979b2.m13273u(i);
            C4980cv.m22123b();
            this.f14421l = nl0.m27925q(this.f14416g, u[0]);
            C4980cv.m22123b();
            this.f14422m = nl0.m27925q(this.f14416g, u[1]);
        }
        if (this.f14412c.mo17717y().mo18020i()) {
            this.f14423n = this.f14418i;
            this.f14424o = this.f14419j;
        } else {
            this.f14412c.measure(0, 0);
        }
        mo16612e(this.f14418i, this.f14419j, this.f14421l, this.f14422m, this.f14417h, this.f14420k);
        ae0 ae0 = new ae0();
        C5836zy zyVar = this.f14415f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        ae0.mo15762e(zyVar.mo22447a(intent));
        C5836zy zyVar2 = this.f14415f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        ae0.mo15760c(zyVar2.mo22447a(intent2));
        ae0.mo15758a(this.f14415f.mo22448b());
        ae0.mo15761d(this.f14415f.mo22449c());
        ae0.mo15759b(true);
        boolean h = ae0.f13853a;
        boolean j = ae0.f13854b;
        boolean f = ae0.f13855c;
        boolean i2 = ae0.f13856d;
        boolean g = ae0.f13857e;
        pr0 pr02 = this.f14412c;
        try {
            jSONObject = new JSONObject().put("sms", h).put("tel", j).put("calendar", f).put("storePicture", i2).put("inlineVideo", g);
        } catch (JSONException e) {
            ul0.m31860e("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        pr02.mo16881r("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f14412c.getLocationOnScreen(iArr);
        mo16221h(C4980cv.m22123b().mo19749b(this.f14413d, iArr[0]), C4980cv.m22123b().mo19749b(this.f14413d, iArr[1]));
        if (ul0.m31865j(2)) {
            ul0.m31861f("Dispatching Ready Event.");
        }
        mo16611d(this.f14412c.zzp().f27376g);
    }

    /* renamed from: h */
    public final void mo16221h(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.f14413d instanceof Activity) {
            C2971s.m13214q();
            i3 = C2979b2.m13275w((Activity) this.f14413d)[0];
        } else {
            i3 = 0;
        }
        if (this.f14412c.mo17717y() == null || !this.f14412c.mo17717y().mo18020i()) {
            int width = this.f14412c.getWidth();
            int height = this.f14412c.getHeight();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22353J)).booleanValue()) {
                if (width == 0) {
                    width = this.f14412c.mo17717y() != null ? this.f14412c.mo17717y().f17247c : 0;
                }
                if (height == 0) {
                    if (this.f14412c.mo17717y() != null) {
                        i4 = this.f14412c.mo17717y().f17246b;
                    }
                    this.f14423n = C4980cv.m22123b().mo19749b(this.f14413d, width);
                    this.f14424o = C4980cv.m22123b().mo19749b(this.f14413d, i4);
                }
            }
            i4 = height;
            this.f14423n = C4980cv.m22123b().mo19749b(this.f14413d, width);
            this.f14424o = C4980cv.m22123b().mo19749b(this.f14413d, i4);
        }
        mo16609b(i, i2 - i3, this.f14423n, this.f14424o);
        this.f14412c.mo17673Q0().mo17298a0(i, i2);
    }
}
