package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2943b0;
import com.google.android.gms.ads.internal.overlay.C2944c;
import com.google.android.gms.ads.internal.overlay.C2945d;
import com.google.android.gms.ads.internal.overlay.C2962u;
import com.google.android.gms.ads.internal.overlay.C2963v;
import com.google.android.gms.ads.internal.overlay.C2965x;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5204iw;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.C5537rw;
import com.google.android.gms.internal.ads.C5684vv;
import com.google.android.gms.internal.ads.C5833zv;
import com.google.android.gms.internal.ads.cb0;
import com.google.android.gms.internal.ads.en2;
import com.google.android.gms.internal.ads.ih0;
import com.google.android.gms.internal.ads.il2;
import com.google.android.gms.internal.ads.le0;
import com.google.android.gms.internal.ads.mt0;
import com.google.android.gms.internal.ads.ok0;
import com.google.android.gms.internal.ads.ru1;
import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.tj2;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.u60;
import com.google.android.gms.internal.ads.uj2;
import com.google.android.gms.internal.ads.uk1;
import com.google.android.gms.internal.ads.uo2;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.wk1;
import com.google.android.gms.internal.ads.xe0;
import com.google.android.gms.internal.ads.z20;
import com.google.android.gms.internal.ads.z82;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzcjf;
import java.util.HashMap;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class ClientApi extends C5204iw {
    /* renamed from: C2 */
    public final u60 mo10813C2(C4863a aVar, cb0 cb0, int i, s60 s60) {
        Context context = (Context) C4865b.m20502K0(aVar);
        ru1 r = mt0.m27425h(context, cb0, i).mo19524r();
        r.mo18216a(context);
        r.mo18218c(s60);
        return r.mo18217b().mo18753f();
    }

    /* renamed from: C6 */
    public final C5833zv mo10814C6(C4863a aVar, zzbfi zzbfi, String str, cb0 cb0, int i) {
        Context context = (Context) C4865b.m20502K0(aVar);
        tj2 y = mt0.m27425h(context, cb0, i).mo19531y();
        y.mo18511p(str);
        y.mo18509a(context);
        uj2 b = y.mo18510b();
        if (i >= ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22564l3)).intValue()) {
            return b.mo19011a();
        }
        return b.zza();
    }

    /* renamed from: D6 */
    public final ih0 mo10815D6(C4863a aVar, cb0 cb0, int i) {
        Context context = (Context) C4865b.m20502K0(aVar);
        uo2 B = mt0.m27425h(context, cb0, i).mo19507B();
        B.mo21342a(context);
        return B.mo21343b().mo21593a();
    }

    /* renamed from: E5 */
    public final C5833zv mo10816E5(C4863a aVar, zzbfi zzbfi, String str, cb0 cb0, int i) {
        Context context = (Context) C4865b.m20502K0(aVar);
        il2 z = mt0.m27425h(context, cb0, i).mo19532z();
        z.mo18390Q(context);
        z.mo18391a(zzbfi);
        z.mo18393p(str);
        return z.mo18392f().zza();
    }

    /* renamed from: L4 */
    public final ok0 mo10817L4(C4863a aVar, cb0 cb0, int i) {
        return mt0.m27425h((Context) C4865b.m20502K0(aVar), cb0, i).mo19529w();
    }

    /* renamed from: U1 */
    public final le0 mo10818U1(C4863a aVar, cb0 cb0, int i) {
        return mt0.m27425h((Context) C4865b.m20502K0(aVar), cb0, i).mo19526t();
    }

    /* renamed from: V6 */
    public final wh0 mo10819V6(C4863a aVar, String str, cb0 cb0, int i) {
        Context context = (Context) C4865b.m20502K0(aVar);
        uo2 B = mt0.m27425h(context, cb0, i).mo19507B();
        B.mo21342a(context);
        B.mo21344p(str);
        return B.mo21343b().zza();
    }

    /* renamed from: Y1 */
    public final C5833zv mo10820Y1(C4863a aVar, zzbfi zzbfi, String str, int i) {
        return new C2970r((Context) C4865b.m20502K0(aVar), zzbfi, str, new zzcjf(214106000, i, true, false));
    }

    /* renamed from: a0 */
    public final xe0 mo10821a0(C4863a aVar) {
        Activity activity = (Activity) C4865b.m20502K0(aVar);
        AdOverlayInfoParcel Y = AdOverlayInfoParcel.m13079Y(activity.getIntent());
        if (Y == null) {
            return new C2963v(activity);
        }
        int i = Y.f9860q;
        if (i == 1) {
            return new C2962u(activity);
        }
        if (i == 2) {
            return new C2944c(activity);
        }
        if (i == 3) {
            return new C2945d(activity);
        }
        if (i == 4) {
            return new C2965x(activity, Y);
        }
        if (i != 5) {
            return new C2963v(activity);
        }
        return new C2943b0(activity);
    }

    /* renamed from: a5 */
    public final C5833zv mo10822a5(C4863a aVar, zzbfi zzbfi, String str, cb0 cb0, int i) {
        Context context = (Context) C4865b.m20502K0(aVar);
        en2 A = mt0.m27425h(context, cb0, i).mo19506A();
        A.mo17222Q(context);
        A.mo17223a(zzbfi);
        A.mo17225p(str);
        return A.mo17224f().zza();
    }

    /* renamed from: i2 */
    public final C5684vv mo10823i2(C4863a aVar, String str, cb0 cb0, int i) {
        Context context = (Context) C4865b.m20502K0(aVar);
        return new z82(mt0.m27425h(context, cb0, i), context, str);
    }

    /* renamed from: q0 */
    public final C5537rw mo10824q0(C4863a aVar, int i) {
        return mt0.m27424g((Context) C4865b.m20502K0(aVar), i).mo19515i();
    }

    /* renamed from: u6 */
    public final z20 mo10825u6(C4863a aVar, C4863a aVar2, C4863a aVar3) {
        return new uk1((View) C4865b.m20502K0(aVar), (HashMap) C4865b.m20502K0(aVar2), (HashMap) C4865b.m20502K0(aVar3));
    }

    /* renamed from: x0 */
    public final u20 mo10826x0(C4863a aVar, C4863a aVar2) {
        return new wk1((FrameLayout) C4865b.m20502K0(aVar), (FrameLayout) C4865b.m20502K0(aVar2), 214106000);
    }
}
