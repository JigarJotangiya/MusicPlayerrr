package com.coocent.video.videoplayercore.player;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p256kk.taurus.playerbase.p265i.C6689a;
import com.p256kk.taurus.playerbase.p265i.C6690b;
import com.p256kk.taurus.playerbase.p268l.C6700a;
import com.p256kk.taurus.playerbase.p268l.C6701b;
import p082e.p109h.p119p.C3774v;

@SuppressLint({"ViewConstructor"})
public class FloatWindow extends FrameLayout implements C6689a {
    private C6701b mInternalWindowListener = new C6701b() {
        public void onClose() {
            FloatWindow.this.resetStyle();
            if (FloatWindow.this.onWindowListener != null) {
                FloatWindow.this.onWindowListener.onClose();
            }
        }

        public void onShow() {
            if (FloatWindow.this.onWindowListener != null) {
                FloatWindow.this.onWindowListener.onShow();
            }
        }
    };
    private C6689a mStyleSetter;
    private WindowHelper mWindowHelper;
    /* access modifiers changed from: private */
    public C6701b onWindowListener;

    public FloatWindow(Context context, View view, C6700a aVar) {
        super(context);
        if (view != null) {
            addView(view);
        }
        this.mStyleSetter = new C6690b(this);
        WindowHelper windowHelper = new WindowHelper(context, this, aVar);
        this.mWindowHelper = windowHelper;
        windowHelper.setOnWindowListener(this.mInternalWindowListener);
    }

    public void clearShapeStyle() {
        this.mStyleSetter.clearShapeStyle();
    }

    public void close() {
        setElevationShadow(0.0f);
        this.mWindowHelper.close();
    }

    public boolean isWindowShow() {
        return this.mWindowHelper.isWindowShow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mWindowHelper.onInterceptTouchEvent(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mWindowHelper.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void resetStyle() {
        setElevationShadow(0.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            clearShapeStyle();
        }
    }

    public void setDragEnable(boolean z) {
        this.mWindowHelper.setDragEnable(z);
    }

    public void setElevationShadow(float f) {
        setElevationShadow(-16777216, f);
    }

    public void setOnWindowListener(C6701b bVar) {
        this.onWindowListener = bVar;
    }

    public void setOvalRectShape() {
        this.mStyleSetter.setOvalRectShape();
    }

    public void setRoundRectShape(float f) {
        this.mStyleSetter.setRoundRectShape(f);
    }

    public boolean show() {
        return this.mWindowHelper.show();
    }

    public void updateWindowViewLayout(int i, int i2) {
        this.mWindowHelper.updateWindowViewLayout(i, i2);
    }

    public void updateWindowViewLayoutSize(int i, int i2) {
        this.mWindowHelper.updateWindowViewLayoutSize(i, i2);
    }

    public void setElevationShadow(int i, float f) {
        setBackgroundColor(i);
        C3774v.m16231v0(this, f);
    }

    public void setOvalRectShape(Rect rect) {
        this.mStyleSetter.setOvalRectShape(rect);
    }

    public void setRoundRectShape(Rect rect, float f) {
        this.mStyleSetter.setRoundRectShape(rect, f);
    }

    public boolean show(Animator... animatorArr) {
        return this.mWindowHelper.show(animatorArr);
    }

    public void close(Animator... animatorArr) {
        setElevationShadow(0.0f);
        this.mWindowHelper.close(animatorArr);
    }
}
