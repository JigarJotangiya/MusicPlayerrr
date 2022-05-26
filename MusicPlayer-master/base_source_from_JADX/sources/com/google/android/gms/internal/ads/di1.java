package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class di1 implements e81, if1 {

    /* renamed from: g */
    private final kj0 f15615g;

    /* renamed from: h */
    private final Context f15616h;

    /* renamed from: i */
    private final ck0 f15617i;

    /* renamed from: j */
    private final View f15618j;

    /* renamed from: k */
    private String f15619k;

    /* renamed from: l */
    private final C5124gq f15620l;

    public di1(kj0 kj0, Context context, ck0 ck0, View view, C5124gq gqVar) {
        this.f15615g = kj0;
        this.f15616h = context;
        this.f15617i = ck0;
        this.f15618j = view;
        this.f15620l = gqVar;
    }

    /* renamed from: c */
    public final void mo16875c() {
        String i = this.f15617i.mo16656i(this.f15616h);
        this.f15619k = i;
        String valueOf = String.valueOf(i);
        String str = this.f15620l == C5124gq.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f15619k = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    /* renamed from: d */
    public final void mo15612d(fh0 fh0, String str, String str2) {
        if (this.f15617i.mo16673z(this.f15616h)) {
            try {
                ck0 ck0 = this.f15617i;
                Context context = this.f15616h;
                ck0.mo16667t(context, ck0.mo16653f(context), this.f15615g.mo18893a(), fh0.mo16633b(), fh0.mo16632a());
            } catch (RemoteException e) {
                ul0.m31863h("Remote Exception to get reward item.", e);
            }
        }
    }

    /* renamed from: h */
    public final void mo15613h() {
        this.f15615g.mo18894b(false);
    }

    /* renamed from: l */
    public final void mo15616l() {
        View view = this.f15618j;
        if (!(view == null || this.f15619k == null)) {
            this.f15617i.mo16671x(view.getContext(), this.f15619k);
        }
        this.f15615g.mo18894b(true);
    }

    /* renamed from: m */
    public final void mo15617m() {
    }

    /* renamed from: n */
    public final void mo15618n() {
    }

    public final void zze() {
    }

    public final void zzr() {
    }
}
