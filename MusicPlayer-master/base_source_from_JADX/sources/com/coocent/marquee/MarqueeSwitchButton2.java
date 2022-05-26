package com.coocent.marquee;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class MarqueeSwitchButton2 extends View implements View.OnTouchListener {

    /* renamed from: g */
    private boolean f7797g = false;

    /* renamed from: h */
    private int f7798h;

    /* renamed from: i */
    private int f7799i;

    /* renamed from: j */
    private int f7800j;

    /* renamed from: k */
    private int f7801k;

    /* renamed from: l */
    private C2263a f7802l = null;

    /* renamed from: m */
    Bitmap f7803m;

    /* renamed from: n */
    Drawable f7804n;

    /* renamed from: com.coocent.marquee.MarqueeSwitchButton2$a */
    public interface C2263a {
        /* renamed from: a */
        void mo8980a(boolean z);
    }

    public MarqueeSwitchButton2(Context context) {
        super(context);
        m10564a();
    }

    /* renamed from: a */
    private void m10564a() {
        setOnTouchListener(this);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7797g) {
            Drawable drawable = this.f7804n;
            if (drawable != null && Build.VERSION.SDK_INT >= 16) {
                setBackground(drawable);
                return;
            }
            return;
        }
        setBackgroundResource(this.f7799i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f7800j, this.f7801k);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f7797g) {
                this.f7797g = false;
            } else {
                this.f7797g = true;
            }
            C2263a aVar = this.f7802l;
            if (aVar != null) {
                aVar.mo8980a(this.f7797g);
            }
        }
        invalidate();
        return true;
    }

    public void setIsShow(boolean z) {
        this.f7797g = z;
        invalidate();
    }

    public void setOnchangeListener(C2263a aVar) {
        this.f7802l = aVar;
    }

    public MarqueeSwitchButton2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2328w.MarqueeSwitchButton2);
        this.f7798h = obtainStyledAttributes.getResourceId(C2328w.MarqueeSwitchButton2_marqueeOnImage2, C2307r.marquee_eq_button_on_bg);
        this.f7799i = obtainStyledAttributes.getResourceId(C2328w.MarqueeSwitchButton2_marqueeOffImage2, C2307r.marquee_eq_button_off_bg);
        this.f7797g = obtainStyledAttributes.getBoolean(C2328w.MarqueeSwitchButton2_marqueeDefaultState, true);
        Drawable g = C2274d.m10595g(getResources().getDrawable(this.f7798h), ColorStateList.valueOf(C2298o.m10718Q1()));
        this.f7804n = g;
        Bitmap a = C2274d.m10589a(g);
        this.f7803m = a;
        this.f7800j = a.getWidth();
        this.f7801k = this.f7803m.getHeight();
        this.f7803m.recycle();
        this.f7803m = null;
        obtainStyledAttributes.recycle();
        m10564a();
    }
}
