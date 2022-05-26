package com.p256kk.taurus.playerbase.p265i;

import android.graphics.Rect;
import android.view.View;
import p082e.p109h.p119p.C3774v;

/* renamed from: com.kk.taurus.playerbase.i.b */
/* compiled from: StyleSetter */
public final class C6690b implements C6689a {

    /* renamed from: g */
    private View f30087g;

    public C6690b(View view) {
        this.f30087g = view;
    }

    public void clearShapeStyle() {
        this.f30087g.setClipToOutline(false);
    }

    public void setElevationShadow(float f) {
        setElevationShadow(-16777216, f);
    }

    public void setOvalRectShape() {
        setOvalRectShape((Rect) null);
    }

    public void setRoundRectShape(float f) {
        setRoundRectShape((Rect) null, f);
    }

    public void setElevationShadow(int i, float f) {
        this.f30087g.setBackgroundColor(i);
        C3774v.m16231v0(this.f30087g, f);
        this.f30087g.invalidate();
    }

    public void setOvalRectShape(Rect rect) {
        this.f30087g.setClipToOutline(true);
        this.f30087g.setOutlineProvider(new C6691c(rect));
    }

    public void setRoundRectShape(Rect rect, float f) {
        this.f30087g.setClipToOutline(true);
        this.f30087g.setOutlineProvider(new C6692d(f, rect));
    }
}
