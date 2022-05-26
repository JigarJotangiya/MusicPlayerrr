package com.coocent.videoplayer.weidget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

public class VerticalSeekBar extends AppCompatSeekBar {

    /* renamed from: k */
    private static float f9495k = 25.0f;

    /* renamed from: h */
    private SeekBar.OnSeekBarChangeListener f9496h;

    /* renamed from: i */
    private boolean f9497i = false;

    /* renamed from: j */
    private boolean f9498j = false;

    public VerticalSeekBar(Context context) {
        super(context);
    }

    /* renamed from: a */
    private boolean m12545a(MotionEvent motionEvent) {
        float progress = (float) getProgress();
        float f = getResources().getDisplayMetrics().density;
        float height = (float) getHeight();
        float y = motionEvent.getY();
        float max = (float) getMax();
        float f2 = f9495k;
        return progress >= max - ((float) ((int) ((((f2 * f) + y) * max) / height))) && progress <= max - ((float) ((int) (((y - (f2 * f)) * max) / height)));
    }

    public boolean getFromUser() {
        return this.f9498j;
    }

    public Drawable getProgressDrawable() {
        return super.getProgressDrawable();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.rotate(-90.0f);
        canvas.translate((float) (-getHeight()), 0.0f);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i2, i, i4, i3);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else if (!this.f9497i) {
                    return false;
                } else {
                    int max = getMax();
                    setProgress(max - ((int) ((((float) max) * motionEvent.getY()) / ((float) getHeight()))));
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f9497i = false;
            setFromUser(false);
            this.f9496h.onStopTrackingTouch(this);
        } else if (!m12545a(motionEvent)) {
            return false;
        } else {
            setFromUser(true);
            this.f9496h.onStartTrackingTouch(this);
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f9497i = true;
        }
        return true;
    }

    public void setFromUser(boolean z) {
        this.f9498j = z;
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f9496h = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setProgress(int i) {
        super.setProgress(i);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
