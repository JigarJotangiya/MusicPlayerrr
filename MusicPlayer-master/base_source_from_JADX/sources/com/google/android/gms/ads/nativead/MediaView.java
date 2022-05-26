package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.C3061m;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class MediaView extends FrameLayout {

    /* renamed from: g */
    private C3061m f10174g;

    /* renamed from: h */
    private boolean f10175h;

    /* renamed from: i */
    private ImageView.ScaleType f10176i;

    /* renamed from: j */
    private boolean f10177j;

    /* renamed from: k */
    private C3105d f10178k;

    /* renamed from: l */
    private C3106e f10179l;

    public MediaView(@RecentlyNonNull Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo11276a(C3105d dVar) {
        this.f10178k = dVar;
        if (this.f10175h) {
            dVar.f10194a.mo11282b(this.f10174g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo11277b(C3106e eVar) {
        this.f10179l = eVar;
        if (this.f10177j) {
            eVar.f10195a.mo11284c(this.f10176i);
        }
    }

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.f10177j = true;
        this.f10176i = scaleType;
        C3106e eVar = this.f10179l;
        if (eVar != null) {
            eVar.f10195a.mo11284c(scaleType);
        }
    }

    public void setMediaContent(@RecentlyNonNull C3061m mVar) {
        this.f10175h = true;
        this.f10174g = mVar;
        C3105d dVar = this.f10178k;
        if (dVar != null) {
            dVar.f10194a.mo11282b(mVar);
        }
    }

    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
