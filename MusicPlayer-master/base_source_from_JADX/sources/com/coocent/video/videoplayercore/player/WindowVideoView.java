package com.coocent.video.videoplayercore.player;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import com.p256kk.taurus.playerbase.p268l.C6700a;
import com.p256kk.taurus.playerbase.p268l.C6701b;
import com.p256kk.taurus.playerbase.widget.BaseVideoView;

@SuppressLint({"ViewConstructor"})
public class WindowVideoView extends BaseVideoView {
    private C6701b mInternalWindowListener = new C6701b() {
        public void onClose() {
            WindowVideoView.this.stop();
            WindowVideoView.this.resetStyle();
            if (WindowVideoView.this.onWindowListener != null) {
                WindowVideoView.this.onWindowListener.onClose();
            }
        }

        public void onShow() {
            if (WindowVideoView.this.onWindowListener != null) {
                WindowVideoView.this.onWindowListener.onShow();
            }
        }
    };
    private WindowHelper mWindowHelper;
    /* access modifiers changed from: private */
    public C6701b onWindowListener;

    public WindowVideoView(Context context, C6700a aVar) {
        super(context);
        init(context, aVar);
    }

    private void init(Context context, C6700a aVar) {
        WindowHelper windowHelper = new WindowHelper(context, this, aVar);
        this.mWindowHelper = windowHelper;
        windowHelper.setOnWindowListener(this.mInternalWindowListener);
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

    public void setOnWindowListener(C6701b bVar) {
        this.onWindowListener = bVar;
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

    public boolean show(Animator... animatorArr) {
        return this.mWindowHelper.show(animatorArr);
    }

    public void close(Animator... animatorArr) {
        setElevationShadow(0.0f);
        this.mWindowHelper.close(animatorArr);
    }
}
