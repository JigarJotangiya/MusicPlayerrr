package com.coocent.videoplayer.weidget.view.seekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.coocent.videoplayer.C2710q;
import java.lang.reflect.Method;
import p082e.p109h.p119p.C3774v;

public class VerticalSeekBar extends AppCompatSeekBar {

    /* renamed from: m */
    private static float f9509m = 25.0f;

    /* renamed from: h */
    private boolean f9510h;

    /* renamed from: i */
    private Method f9511i;

    /* renamed from: j */
    private int f9512j = 90;

    /* renamed from: k */
    private boolean f9513k = false;

    /* renamed from: l */
    private SeekBar.OnSeekBarChangeListener f9514l;

    public VerticalSeekBar(Context context) {
        super(context);
        m12548c(context, (AttributeSet) null, 0, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|(3:5|6|7)|8|9|(2:11|12)(2:13|14)|15|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[SYNTHETIC, Splitter:B:11:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[SYNTHETIC, Splitter:B:13:0x0035] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m12546a(int r8, boolean r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.reflect.Method r0 = r7.f9511i     // Catch:{ all -> 0x003d }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L_0x001f
            java.lang.Class<android.widget.ProgressBar> r0 = android.widget.ProgressBar.class
            java.lang.String r4 = "setProgress"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001f }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x001f }
            r5[r1] = r6     // Catch:{ NoSuchMethodException -> 0x001f }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x001f }
            r5[r3] = r6     // Catch:{ NoSuchMethodException -> 0x001f }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x001f }
            r0.setAccessible(r3)     // Catch:{ NoSuchMethodException -> 0x001f }
            r7.f9511i = r0     // Catch:{ NoSuchMethodException -> 0x001f }
        L_0x001f:
            java.lang.reflect.Method r0 = r7.f9511i     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0038 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0038 }
            r2[r1] = r8     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0038 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0038 }
            r2[r3] = r8     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0038 }
            r0.invoke(r7, r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0038 }
            goto L_0x0038
        L_0x0035:
            super.setProgress(r8)     // Catch:{ all -> 0x003d }
        L_0x0038:
            r7.m12555k()     // Catch:{ all -> 0x003d }
            monitor-exit(r7)
            return
        L_0x003d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.videoplayer.weidget.view.seekbar.VerticalSeekBar.m12546a(int, boolean):void");
    }

    /* renamed from: b */
    private void m12547b(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private void m12548c(Context context, AttributeSet attributeSet, int i, int i2) {
        C3774v.m16152B0(this, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2710q.VerticalSeekBar, i, i2);
            int integer = obtainStyledAttributes.getInteger(C2710q.VerticalSeekBar_seekBarRotation, 0);
            if (m12549d(integer)) {
                this.f9512j = integer;
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    private static boolean m12549d(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: e */
    private boolean m12550e(MotionEvent motionEvent) {
        float progress = (float) getProgress();
        float f = getResources().getDisplayMetrics().density;
        float height = (float) getHeight();
        float y = motionEvent.getY();
        float max = (float) getMax();
        float f2 = f9509m;
        return progress >= max - ((float) ((int) ((((f2 * f) + y) * max) / height))) && progress <= max - ((float) ((int) (((y - (f2 * f)) * max) / height)));
    }

    /* renamed from: g */
    private void m12551g() {
        this.f9510h = true;
    }

    private VerticalSeekBarWrapper getWrapper() {
        ViewParent parent = getParent();
        if (parent instanceof VerticalSeekBarWrapper) {
            return (VerticalSeekBarWrapper) parent;
        }
        return null;
    }

    /* renamed from: h */
    private void m12552h() {
        this.f9510h = false;
    }

    /* renamed from: i */
    private boolean m12553i(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressed(true);
            m12551g();
            m12556l(motionEvent);
            m12547b(true);
            invalidate();
        } else if (action == 1) {
            if (this.f9510h) {
                m12556l(motionEvent);
                m12552h();
                setPressed(false);
            } else {
                m12551g();
                m12556l(motionEvent);
                m12552h();
                m12547b(false);
            }
            invalidate();
        } else if (action != 2) {
            if (action == 3) {
                if (this.f9510h) {
                    m12552h();
                    setPressed(false);
                }
                invalidate();
            }
        } else if (this.f9510h) {
            m12556l(motionEvent);
        }
        return true;
    }

    /* renamed from: j */
    private boolean m12554j(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (m12550e(motionEvent)) {
                    setFromUser(true);
                }
                this.f9514l.onStartTrackingTouch(this);
                m12547b(true);
            } else if (action == 1 || action == 3) {
                setFromUser(false);
                this.f9514l.onStopTrackingTouch(this);
                m12547b(false);
            }
        }
        return onTouchEvent;
    }

    /* renamed from: k */
    private void m12555k() {
        onSizeChanged(super.getWidth(), super.getHeight(), 0, 0);
    }

    /* renamed from: l */
    private void m12556l(MotionEvent motionEvent) {
        int paddingLeft = super.getPaddingLeft();
        int paddingRight = super.getPaddingRight();
        int height = getHeight() - paddingLeft;
        int i = height - paddingRight;
        int y = (int) motionEvent.getY();
        int i2 = this.f9512j;
        float f = 0.0f;
        float f2 = i2 != 90 ? i2 != 270 ? 0.0f : (float) (height - y) : (float) (y - paddingLeft);
        if (f2 >= 0.0f && i != 0) {
            float f3 = (float) i;
            f = f2 > f3 ? 1.0f : f2 / f3;
        }
        m12546a((int) (f * ((float) getMax())), true);
    }

    public boolean getFromUser() {
        return this.f9513k;
    }

    public int getRotationAngle() {
        return this.f9512j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10376m() {
        return !isInEditMode();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        if (!mo10376m()) {
            int i = this.f9512j;
            if (i == 90) {
                canvas.rotate(90.0f);
                canvas.translate(0.0f, (float) (-super.getWidth()));
            } else if (i == 270) {
                canvas.rotate(-90.0f);
                canvas.translate((float) (-super.getHeight()), 0.0f);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r1 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r6 = getProgress() + (r0 * getKeyProgressIncrement());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r6 < 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r6 > getMax()) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        m12546a(r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r4.f9512j == 90) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r4.f9512j == 270) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0037
            r0 = -1
            r1 = 0
            r2 = 1
            switch(r5) {
                case 19: goto L_0x0016;
                case 20: goto L_0x000f;
                case 21: goto L_0x000e;
                case 22: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            r0 = 0
            goto L_0x001e
        L_0x000e:
            return r1
        L_0x000f:
            int r1 = r4.f9512j
            r3 = 90
            if (r1 != r3) goto L_0x001d
            goto L_0x001c
        L_0x0016:
            int r1 = r4.f9512j
            r3 = 270(0x10e, float:3.78E-43)
            if (r1 != r3) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r1 = 1
        L_0x001e:
            if (r1 == 0) goto L_0x0037
            int r5 = r4.getKeyProgressIncrement()
            int r6 = r4.getProgress()
            int r0 = r0 * r5
            int r6 = r6 + r0
            if (r6 < 0) goto L_0x0036
            int r5 = r4.getMax()
            if (r6 > r5) goto L_0x0036
            r4.m12546a(r6, r2)
        L_0x0036:
            return r2
        L_0x0037:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.videoplayer.weidget.view.seekbar.VerticalSeekBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        if (mo10376m()) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (!isInEditMode() || layoutParams == null || layoutParams.height < 0) {
                setMeasuredDimension(super.getMeasuredHeight(), super.getMeasuredWidth());
            } else {
                setMeasuredDimension(super.getMeasuredHeight(), layoutParams.height);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (mo10376m()) {
            super.onSizeChanged(i, i2, i3, i4);
        } else {
            super.onSizeChanged(i2, i, i4, i3);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (mo10376m()) {
            return m12554j(motionEvent);
        }
        return m12553i(motionEvent);
    }

    public void setFromUser(boolean z) {
        this.f9513k = z;
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f9514l = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public synchronized void setProgress(int i) {
        super.setProgress(i);
        if (!mo10376m()) {
            m12555k();
        }
    }

    public void setRotationAngle(int i) {
        if (!m12549d(i)) {
            throw new IllegalArgumentException("Invalid angle specified :" + i);
        } else if (this.f9512j != i) {
            this.f9512j = i;
            if (mo10376m()) {
                VerticalSeekBarWrapper wrapper = getWrapper();
                if (wrapper != null) {
                    wrapper.mo10386a();
                    return;
                }
                return;
            }
            requestLayout();
        }
    }

    public void setThumb(Drawable drawable) {
        super.setThumb(drawable);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12548c(context, attributeSet, 0, 0);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12548c(context, attributeSet, i, 0);
    }
}
