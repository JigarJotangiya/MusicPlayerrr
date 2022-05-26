package com.p256kk.taurus.playerbase.p265i;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

@TargetApi(21)
/* renamed from: com.kk.taurus.playerbase.i.d */
/* compiled from: ViewRoundRectOutlineProvider */
public class C6692d extends ViewOutlineProvider {

    /* renamed from: a */
    private float f30089a;

    /* renamed from: b */
    private Rect f30090b;

    public C6692d(float f, Rect rect) {
        this.f30089a = f;
        this.f30090b = rect;
    }

    public void getOutline(View view, Outline outline) {
        Rect rect = this.f30090b;
        if (rect == null) {
            rect = new Rect();
            view.getDrawingRect(rect);
        }
        outline.setRoundRect(rect, this.f30089a);
    }
}
