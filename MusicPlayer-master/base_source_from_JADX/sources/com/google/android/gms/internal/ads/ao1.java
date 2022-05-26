package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.internal.C3292l;
import java.util.Collections;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ao1 extends u70 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, c20 {

    /* renamed from: g */
    private View f14004g;

    /* renamed from: h */
    private C5427ox f14005h;

    /* renamed from: i */
    private vj1 f14006i;

    /* renamed from: j */
    private boolean f14007j = false;

    /* renamed from: k */
    private boolean f14008k = false;

    public ao1(vj1 vj1, bk1 bk1) {
        this.f14004g = bk1.mo16262N();
        this.f14005h = bk1.mo16266R();
        this.f14006i = vj1;
        if (bk1.mo16274Z() != null) {
            bk1.mo16274Z().mo17700o0(this);
        }
    }

    /* renamed from: d */
    private final void m20880d() {
        View view;
        vj1 vj1 = this.f14006i;
        if (vj1 != null && (view = this.f14004g) != null) {
            vj1.mo21537O(view, Collections.emptyMap(), Collections.emptyMap(), vj1.m32418w(this.f14004g));
        }
    }

    /* renamed from: e */
    private final void m20881e() {
        View view = this.f14004g;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f14004g);
            }
        }
    }

    /* renamed from: e7 */
    private static final void m20882e7(y70 y70, int i) {
        try {
            y70.mo21736y(i);
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: H4 */
    public final void mo15904H4(C4863a aVar, y70 y70) throws RemoteException {
        String str;
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        if (this.f14007j) {
            ul0.m31859d("Instream ad can not be shown after destroy().");
            m20882e7(y70, 2);
            return;
        }
        View view = this.f14004g;
        if (view == null || this.f14005h == null) {
            String str2 = view == null ? "can not get video view." : "can not get video controller.";
            if (str2.length() != 0) {
                str = "Instream internal error: ".concat(str2);
            } else {
                str = new String("Instream internal error: ");
            }
            ul0.m31859d(str);
            m20882e7(y70, 0);
        } else if (this.f14008k) {
            ul0.m31859d("Instream ad should not be used again.");
            m20882e7(y70, 1);
        } else {
            this.f14008k = true;
            m20881e();
            ((ViewGroup) C4865b.m20502K0(aVar)).addView(this.f14004g, new ViewGroup.LayoutParams(-1, -1));
            C2971s.m13222y();
            um0.m31897a(this.f14004g, this);
            C2971s.m13222y();
            um0.m31898b(this.f14004g, this);
            m20880d();
            try {
                y70.mo21735c();
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final C5427ox mo15905a() throws RemoteException {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        if (!this.f14007j) {
            return this.f14005h;
        }
        ul0.m31859d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    /* renamed from: b */
    public final n20 mo15906b() {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        if (this.f14007j) {
            ul0.m31859d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        vj1 vj1 = this.f14006i;
        if (vj1 == null || vj1.mo21526A() == null) {
            return null;
        }
        return this.f14006i.mo21526A().mo22042a();
    }

    /* renamed from: f */
    public final void mo15907f() throws RemoteException {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        m20881e();
        vj1 vj1 = this.f14006i;
        if (vj1 != null) {
            vj1.mo17837a();
        }
        this.f14006i = null;
        this.f14004g = null;
        this.f14005h = null;
        this.f14007j = true;
    }

    public final void onGlobalLayout() {
        m20880d();
    }

    public final void onScrollChanged() {
        m20880d();
    }

    public final void zze(C4863a aVar) throws RemoteException {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        mo15904H4(aVar, new zn1(this));
    }
}
