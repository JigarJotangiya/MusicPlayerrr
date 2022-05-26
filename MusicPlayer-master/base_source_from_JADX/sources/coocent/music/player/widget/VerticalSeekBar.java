package coocent.music.player.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import p342g.p343a.p344a.p358i.C8345u;

public class VerticalSeekBar extends AppCompatSeekBar {

    /* renamed from: h */
    int f31754h;

    /* renamed from: i */
    int f31755i;

    /* renamed from: j */
    private SeekBar.OnSeekBarChangeListener f31756j;

    public VerticalSeekBar(Context context) {
        super(context);
        m40820a();
    }

    /* renamed from: a */
    private void m40820a() {
        if (Build.VERSION.SDK_INT >= 21) {
            setSplitTrack(false);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            getParent().requestDisallowInterceptTouchEvent(true);
            int action = motionEvent.getAction();
            if (action == 0) {
                int abs = Math.abs(getProgress() - getMax());
                float height = ((((float) abs) * ((float) getHeight())) / ((float) getMax())) + getY();
                float y = motionEvent.getY();
                if (y < height - ((float) C8345u.m46323d(50)) || y > height + ((float) C8345u.m46323d(30))) {
                    return false;
                }
            } else if (action != 1) {
            }
        } catch (Exception unused) {
        }
        return super.dispatchTouchEvent(motionEvent);
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
        try {
            if (!isEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f31754h = (int) motionEvent.getRawX();
                this.f31755i = (int) motionEvent.getRawY();
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f31756j;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(this);
                }
            } else if (action == 1) {
                setProgress(getMax() - ((int) ((((float) getMax()) * motionEvent.getY()) / ((float) getHeight()))));
                onSizeChanged(getWidth(), getHeight(), 0, 0);
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.f31756j;
                if (onSeekBarChangeListener2 != null) {
                    onSeekBarChangeListener2.onStopTrackingTouch(this);
                }
            } else if (action != 2) {
                if (action == 3) {
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener3 = this.f31756j;
                    if (onSeekBarChangeListener3 != null) {
                        onSeekBarChangeListener3.onStopTrackingTouch(this);
                    }
                }
            } else if (Math.abs(((int) motionEvent.getRawX()) - this.f31754h) - Math.abs(((int) motionEvent.getRawY()) - this.f31755i) > 20) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
                setProgress(getMax() - ((int) ((((float) getMax()) * motionEvent.getY()) / ((float) getHeight()))));
                onSizeChanged(getWidth(), getHeight(), 0, 0);
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f31756j = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public synchronized void setProgress(int i) {
        super.setProgress(i);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40820a();
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40820a();
    }
}
