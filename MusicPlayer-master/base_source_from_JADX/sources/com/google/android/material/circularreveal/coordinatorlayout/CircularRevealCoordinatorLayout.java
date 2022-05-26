package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.C5965b;
import com.google.android.material.circularreveal.C5967c;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements C5967c {

    /* renamed from: F */
    private final C5965b f28110F;

    public CircularRevealCoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo23581a() {
        this.f28110F.mo23604a();
    }

    /* renamed from: b */
    public void mo23582b() {
        this.f28110F.mo23605b();
    }

    /* renamed from: c */
    public void mo23583c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public boolean mo23584d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        C5965b bVar = this.f28110F;
        if (bVar != null) {
            bVar.mo23606c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f28110F.mo23607e();
    }

    public int getCircularRevealScrimColor() {
        return this.f28110F.mo23608f();
    }

    public C5967c.C5972e getRevealInfo() {
        return this.f28110F.mo23609h();
    }

    public boolean isOpaque() {
        C5965b bVar = this.f28110F;
        if (bVar != null) {
            return bVar.mo23610j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f28110F.mo23611k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f28110F.mo23612l(i);
    }

    public void setRevealInfo(C5967c.C5972e eVar) {
        this.f28110F.mo23613m(eVar);
    }

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28110F = new C5965b(this);
    }
}
