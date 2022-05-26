package com.p256kk.taurus.playerbase.p263g;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: com.kk.taurus.playerbase.g.b */
/* compiled from: BaseCover */
public abstract class C6660b extends C6662d implements View.OnAttachStateChangeListener {

    /* renamed from: k */
    private View f30058k;

    public C6660b(Context context) {
        super(context);
        View J = mo10269J(context);
        this.f30058k = J;
        J.addOnAttachStateChangeListener(this);
    }

    /* renamed from: G */
    private int m38272G(int i, int i2) {
        return i + (i2 % 32);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final <T extends View> T mo25974C(int i) {
        return this.f30058k.findViewById(i);
    }

    /* renamed from: D */
    public int mo10293D() {
        return 0;
    }

    /* renamed from: E */
    public final View mo25975E() {
        return this.f30058k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final int mo25976F(int i) {
        return m38272G(32, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo10267H() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo10268I() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract View mo10269J(Context context);

    /* renamed from: K */
    public final void mo25977K() {
        mo25996z(-66015, (Bundle) null);
    }

    /* renamed from: L */
    public final void mo25978L(Bundle bundle) {
        mo25996z(-66001, bundle);
    }

    /* renamed from: M */
    public final void mo25979M(Bundle bundle) {
        mo25996z(-66003, bundle);
    }

    /* renamed from: N */
    public final void mo25980N(Bundle bundle) {
        mo25996z(-66005, bundle);
    }

    /* renamed from: O */
    public final void mo25981O() {
        mo25996z(-66016, (Bundle) null);
    }

    /* renamed from: P */
    public final void mo25982P(int i) {
        this.f30058k.setVisibility(i);
    }

    public final void onViewAttachedToWindow(View view) {
        mo10267H();
    }

    public final void onViewDetachedFromWindow(View view) {
        mo10268I();
    }
}
