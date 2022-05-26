package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.circularreveal.C5967c;

public class CircularRevealFrameLayout extends FrameLayout implements C5967c {

    /* renamed from: g */
    private final C5965b f28087g;

    public CircularRevealFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo23581a() {
        this.f28087g.mo23604a();
    }

    /* renamed from: b */
    public void mo23582b() {
        this.f28087g.mo23605b();
    }

    /* renamed from: c */
    public void mo23583c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public boolean mo23584d() {
        return super.isOpaque();
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C5965b bVar = this.f28087g;
        if (bVar != null) {
            bVar.mo23606c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f28087g.mo23607e();
    }

    public int getCircularRevealScrimColor() {
        return this.f28087g.mo23608f();
    }

    public C5967c.C5972e getRevealInfo() {
        return this.f28087g.mo23609h();
    }

    public boolean isOpaque() {
        C5965b bVar = this.f28087g;
        if (bVar != null) {
            return bVar.mo23610j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f28087g.mo23611k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f28087g.mo23612l(i);
    }

    public void setRevealInfo(C5967c.C5972e eVar) {
        this.f28087g.mo23613m(eVar);
    }

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28087g = new C5965b(this);
    }
}
