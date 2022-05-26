package com.p256kk.taurus.playerbase.p263g;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.p256kk.taurus.playerbase.p261e.C6640b;

/* renamed from: com.kk.taurus.playerbase.g.d */
/* compiled from: BaseReceiver */
public abstract class C6662d implements C6667i, C6676n {

    /* renamed from: g */
    private Context f30059g;

    /* renamed from: h */
    private C6673k f30060h;

    /* renamed from: i */
    private C6668j f30061i;

    /* renamed from: j */
    private C6676n f30062j;

    public C6662d(Context context) {
        this.f30059g = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Bundle mo25987A(String str, int i, Bundle bundle) {
        if (this.f30061i == null || TextUtils.isEmpty(str)) {
            return null;
        }
        C6667i e = this.f30061i.mo26009e(str);
        if (e != null) {
            return e.mo10286v(i, bundle);
        }
        C6640b.m38217b("BaseReceiver", "not found receiver use you incoming key.");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo25988B(String str) {
    }

    /* renamed from: f */
    public final void mo25989f(C6676n nVar) {
        this.f30062j = nVar;
    }

    /* renamed from: o */
    public void mo25990o(String str, Object obj) {
    }

    /* renamed from: p */
    public void mo10283p() {
    }

    /* renamed from: q */
    public final void mo25991q(C6673k kVar) {
        this.f30060h = kVar;
    }

    /* renamed from: r */
    public final C6674l mo25879r() {
        C6676n nVar = this.f30062j;
        if (nVar != null) {
            return nVar.mo25879r();
        }
        return null;
    }

    /* renamed from: s */
    public final void mo25992s(C6668j jVar) {
        this.f30061i = jVar;
    }

    /* renamed from: t */
    public void mo10284t() {
    }

    /* renamed from: v */
    public Bundle mo10286v(int i, Bundle bundle) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Context mo25993w() {
        return this.f30059g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final C6665g mo25994x() {
        return this.f30061i.mo26005a();
    }

    /* renamed from: y */
    public Object mo25995y() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo25996z(int i, Bundle bundle) {
        C6673k kVar = this.f30060h;
        if (kVar != null) {
            kVar.mo10237d(i, bundle);
        }
    }
}
