package com.coocent.videoplayer.p062t.p063a;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.core.content.C0506a;
import com.coocent.videoplayer.C2703j;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import com.p256kk.taurus.playerbase.p263g.C6660b;
import com.p256kk.taurus.playerbase.p263g.C6674l;

/* renamed from: com.coocent.videoplayer.t.a.f */
/* compiled from: LoadingCover */
public class C2736f extends C6660b {
    public C2736f(Context context) {
        super(context);
    }

    /* renamed from: Q */
    private boolean m12372Q(C6674l lVar) {
        int state = lVar.getState();
        return (state == -2 || state == -1 || state == 0 || state == 1 || state == 5) ? false : true;
    }

    /* renamed from: D */
    public int mo10293D() {
        return mo25976F(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo10267H() {
        super.mo10267H();
        C6674l r = mo25879r();
        if (r != null && m12372Q(r)) {
            mo25982P(r.mo25882c() ? 0 : 8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo10268I() {
        super.mo10268I();
        mo25982P(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public View mo10269J(Context context) {
        return LayoutInflater.from(context).inflate(C2707n.video_layout_cover_loading, (ViewGroup) null);
    }

    /* renamed from: a */
    public void mo10270a(int i, Bundle bundle) {
        mo25982P(8);
    }

    /* renamed from: b */
    public void mo10271b(int i, Bundle bundle) {
        switch (i) {
            case -99052:
            case -99015:
            case -99011:
            case -99007:
            case -99005:
                mo25982P(8);
                return;
            case -99050:
            case -99010:
            case -99001:
                mo25982P(0);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public void mo10272d(int i, Bundle bundle) {
    }

    /* renamed from: t */
    public void mo10284t() {
        super.mo10284t();
        ((ProgressBar) mo25974C(C2706m.progress_bar_loading)).getIndeterminateDrawable().setColorFilter(C0506a.m3150b(mo25993w(), C2703j.videoColorAccent), PorterDuff.Mode.MULTIPLY);
    }
}
