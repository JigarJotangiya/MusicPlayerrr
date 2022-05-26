package com.p256kk.taurus.playerbase.p265i;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.p256kk.taurus.playerbase.p267k.C6699c;

@TargetApi(21)
/* renamed from: com.kk.taurus.playerbase.i.c */
/* compiled from: ViewOvalRectOutlineProvider */
public class C6691c extends ViewOutlineProvider {

    /* renamed from: a */
    private Rect f30088a;

    public C6691c(Rect rect) {
        this.f30088a = rect;
    }

    public void getOutline(View view, Outline outline) {
        Rect rect = this.f30088a;
        if (rect == null) {
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            rect = C6699c.m38417a(rect2);
        }
        outline.setOval(rect);
    }
}
