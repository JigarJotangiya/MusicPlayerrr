package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.C3359d;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class el1 implements View.OnClickListener {

    /* renamed from: g */
    private final bp1 f15989g;

    /* renamed from: h */
    private final C3359d f15990h;

    /* renamed from: i */
    private j40 f15991i;

    /* renamed from: j */
    private y50<Object> f15992j;

    /* renamed from: k */
    String f15993k;

    /* renamed from: l */
    Long f15994l;

    /* renamed from: m */
    WeakReference<View> f15995m;

    public el1(bp1 bp1, C3359d dVar) {
        this.f15989g = bp1;
        this.f15990h = dVar;
    }

    /* renamed from: f */
    private final void m23031f() {
        View view;
        this.f15993k = null;
        this.f15994l = null;
        WeakReference<View> weakReference = this.f15995m;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.f15995m = null;
        }
    }

    /* renamed from: a */
    public final j40 mo17203a() {
        return this.f15991i;
    }

    /* renamed from: b */
    public final void mo17204b() {
        if (this.f15991i != null && this.f15994l != null) {
            m23031f();
            try {
                this.f15991i.zze();
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo17205d(j40 j40) {
        this.f15991i = j40;
        y50<Object> y50 = this.f15992j;
        if (y50 != null) {
            this.f15989g.mo16357k("/unconfirmedClick", y50);
        }
        dl1 dl1 = new dl1(this, j40);
        this.f15992j = dl1;
        this.f15989g.mo16355i("/unconfirmedClick", dl1);
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f15995m;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f15993k == null || this.f15994l == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.f15993k);
                hashMap.put("time_interval", String.valueOf(this.f15990h.mo11988a() - this.f15994l.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f15989g.mo16353g("sendMessageToNativeJs", hashMap);
            }
            m23031f();
        }
    }
}
