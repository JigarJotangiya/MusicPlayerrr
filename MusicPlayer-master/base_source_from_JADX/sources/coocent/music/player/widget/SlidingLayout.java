package coocent.music.player.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import media.musicplayer.audioplayer.videoplayer.R;

public class SlidingLayout extends FrameLayout {

    /* renamed from: g */
    private Activity f31734g;

    /* renamed from: h */
    private Scroller f31735h;

    /* renamed from: i */
    private Drawable f31736i;

    /* renamed from: j */
    private int f31737j;

    /* renamed from: k */
    private int f31738k;

    /* renamed from: l */
    private int f31739l;

    /* renamed from: m */
    private int f31740m;

    /* renamed from: n */
    private int f31741n;

    /* renamed from: o */
    private int f31742o;

    /* renamed from: p */
    private int f31743p;

    /* renamed from: q */
    private boolean f31744q;

    public SlidingLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private void m40806b(Canvas canvas) {
        this.f31736i.setBounds(0, 0, this.f31737j, getHeight());
        canvas.save();
        canvas.translate((float) (-this.f31737j), 0.0f);
        this.f31736i.draw(canvas);
        canvas.restore();
    }

    /* renamed from: c */
    private void m40807c(Context context) {
        this.f31735h = new Scroller(context);
        this.f31736i = getResources().getDrawable(R.drawable.left_shadow);
        this.f31737j = ((int) getResources().getDisplayMetrics().density) * 16;
    }

    /* renamed from: d */
    private void m40808d() {
        this.f31735h.startScroll(getScrollX(), 0, -getScrollX(), 0, 300);
        invalidate();
    }

    /* renamed from: e */
    private void m40809e() {
        this.f31735h.startScroll(getScrollX(), 0, (-getScrollX()) - getWidth(), 0, 300);
        invalidate();
    }

    /* renamed from: a */
    public void mo27648a(Activity activity) {
        this.f31734g = activity;
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        addView(childAt);
        viewGroup.addView(this);
    }

    public void computeScroll() {
        if (this.f31735h.computeScrollOffset()) {
            scrollTo(this.f31735h.getCurrX(), 0);
            postInvalidate();
        } else if ((-getScrollX()) >= getWidth()) {
            this.f31734g.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m40806b(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.f31738k = x;
            this.f31739l = x;
            this.f31740m = y;
        } else if (action == 1) {
            this.f31740m = 0;
            this.f31739l = 0;
            this.f31738k = 0;
        } else if (action == 2) {
            int i = x - this.f31739l;
            int i2 = y - this.f31740m;
            if (this.f31738k < getWidth() && Math.abs(i) - Math.abs(i2) > 10) {
                z = true;
            }
            this.f31739l = x;
            this.f31740m = y;
        }
        return z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31741n = x;
            this.f31742o = x;
            this.f31743p = y;
        } else if (action == 1) {
            this.f31744q = false;
            this.f31743p = 0;
            this.f31742o = 0;
            this.f31741n = 0;
            if ((-getScrollX()) < getWidth() / 2) {
                m40808d();
            } else {
                m40809e();
            }
        } else if (action == 2) {
            int i = x - this.f31742o;
            int i2 = y - this.f31743p;
            if (!this.f31744q && this.f31741n < getWidth() && Math.abs(i) > Math.abs(i2)) {
                this.f31744q = true;
            }
            if (this.f31744q) {
                int x2 = this.f31742o - ((int) motionEvent.getX());
                if (getScrollX() + x2 >= 0) {
                    scrollTo(0, 0);
                } else {
                    scrollBy(x2, 0);
                }
            }
            this.f31742o = x;
            this.f31743p = y;
        }
        return true;
    }

    public SlidingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31744q = false;
        m40807c(context);
    }
}
