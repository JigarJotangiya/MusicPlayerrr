package coocent.music.player.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.C0885l;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.C7941a;

public class RippleView extends RelativeLayout {

    /* renamed from: A */
    private Bitmap f31668A;

    /* renamed from: B */
    private int f31669B;

    /* renamed from: C */
    private int f31670C;

    /* renamed from: D */
    private GestureDetector f31671D;

    /* renamed from: E */
    private final Runnable f31672E = new C7160a();

    /* renamed from: F */
    private C7162c f31673F;

    /* renamed from: g */
    private int f31674g;

    /* renamed from: h */
    private int f31675h;

    /* renamed from: i */
    private int f31676i = 10;

    /* renamed from: j */
    private int f31677j = 400;

    /* renamed from: k */
    private int f31678k = 90;

    /* renamed from: l */
    private Handler f31679l;

    /* renamed from: m */
    private float f31680m = 0.0f;

    /* renamed from: n */
    private boolean f31681n = false;

    /* renamed from: o */
    private int f31682o = 0;

    /* renamed from: p */
    private int f31683p = 0;

    /* renamed from: q */
    private int f31684q = -1;

    /* renamed from: r */
    private float f31685r = -1.0f;

    /* renamed from: s */
    private float f31686s = -1.0f;

    /* renamed from: t */
    private int f31687t;

    /* renamed from: u */
    private float f31688u;

    /* renamed from: v */
    private ScaleAnimation f31689v;

    /* renamed from: w */
    private Boolean f31690w;

    /* renamed from: x */
    private Boolean f31691x;

    /* renamed from: y */
    private Integer f31692y;

    /* renamed from: z */
    private Paint f31693z;

    /* renamed from: coocent.music.player.widget.RippleView$a */
    class C7160a implements Runnable {
        C7160a() {
        }

        public void run() {
            RippleView.this.invalidate();
        }
    }

    /* renamed from: coocent.music.player.widget.RippleView$b */
    class C7161b extends GestureDetector.SimpleOnGestureListener {
        C7161b() {
        }

        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            RippleView.this.mo27589b(motionEvent);
            RippleView.this.m40785f(Boolean.TRUE);
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: coocent.music.player.widget.RippleView$c */
    public interface C7162c {
        /* renamed from: a */
        void mo27617a(RippleView rippleView);
    }

    /* renamed from: coocent.music.player.widget.RippleView$d */
    public enum C7163d {
        SIMPLE(0),
        DOUBLE(1),
        RECTANGLE(2);
        
        int type;

        private C7163d(int i) {
            this.type = i;
        }
    }

    public RippleView(Context context) {
        super(context);
    }

    /* renamed from: c */
    private void m40782c(float f, float f2) {
        if (isEnabled() && !this.f31681n) {
            if (this.f31690w.booleanValue()) {
                startAnimation(this.f31689v);
            }
            this.f31680m = (float) Math.max(this.f31674g, this.f31675h);
            if (this.f31692y.intValue() != 2) {
                this.f31680m /= 2.0f;
            }
            this.f31680m -= (float) this.f31670C;
            if (this.f31691x.booleanValue() || this.f31692y.intValue() == 1) {
                this.f31685r = (float) (getMeasuredWidth() / 2);
                this.f31686s = (float) (getMeasuredHeight() / 2);
            } else {
                this.f31685r = f;
                this.f31686s = f2;
            }
            this.f31681n = true;
            if (this.f31692y.intValue() == 1 && this.f31668A == null) {
                this.f31668A = getDrawingCache(true);
            }
            invalidate();
        }
    }

    /* renamed from: d */
    private Bitmap m40783d(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(this.f31668A.getWidth(), this.f31668A.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f = this.f31685r;
        float f2 = (float) i;
        float f3 = this.f31686s;
        Rect rect = new Rect((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(this.f31685r, this.f31686s, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.f31668A, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: e */
    private void m40784e(Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7941a.RippleView);
            this.f31669B = obtainStyledAttributes.getColor(2, getResources().getColor(R.color.rippelColor));
            this.f31692y = Integer.valueOf(obtainStyledAttributes.getInt(6, 0));
            this.f31690w = Boolean.valueOf(obtainStyledAttributes.getBoolean(7, false));
            this.f31691x = Boolean.valueOf(obtainStyledAttributes.getBoolean(1, false));
            this.f31677j = obtainStyledAttributes.getInteger(4, this.f31677j);
            this.f31676i = obtainStyledAttributes.getInteger(3, this.f31676i);
            this.f31678k = obtainStyledAttributes.getInteger(0, this.f31678k);
            this.f31670C = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f31679l = new Handler();
            this.f31688u = obtainStyledAttributes.getFloat(9, 1.03f);
            this.f31687t = obtainStyledAttributes.getInt(8, C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.f31693z = paint;
            paint.setAntiAlias(true);
            this.f31693z.setStyle(Paint.Style.FILL);
            this.f31693z.setColor(this.f31669B);
            this.f31693z.setAlpha(this.f31678k);
            setWillNotDraw(false);
            this.f31671D = new GestureDetector(context, new C7161b());
            setDrawingCacheEnabled(true);
            setClickable(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m40785f(Boolean bool) {
        if (getParent() instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) getParent();
            int positionForView = adapterView.getPositionForView(this);
            long itemIdAtPosition = adapterView.getItemIdAtPosition(positionForView);
            if (bool.booleanValue()) {
                if (adapterView.getOnItemLongClickListener() != null) {
                    adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition);
                }
            } else if (adapterView.getOnItemClickListener() != null) {
                adapterView.getOnItemClickListener().onItemClick(adapterView, this, positionForView, itemIdAtPosition);
            }
        }
    }

    /* renamed from: b */
    public void mo27589b(MotionEvent motionEvent) {
        m40782c(motionEvent.getX(), motionEvent.getY());
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f31681n) {
            canvas.save();
            int i = this.f31677j;
            int i2 = this.f31682o;
            int i3 = this.f31676i;
            if (i <= i2 * i3) {
                this.f31681n = false;
                this.f31682o = 0;
                this.f31684q = -1;
                this.f31683p = 0;
                if (Build.VERSION.SDK_INT != 23) {
                    canvas.restore();
                }
                invalidate();
                C7162c cVar = this.f31673F;
                if (cVar != null) {
                    cVar.mo27617a(this);
                    return;
                }
                return;
            }
            this.f31679l.postDelayed(this.f31672E, (long) i3);
            if (this.f31682o == 0) {
                canvas.save();
            }
            canvas.drawCircle(this.f31685r, this.f31686s, this.f31680m * ((((float) this.f31682o) * ((float) this.f31676i)) / ((float) this.f31677j)), this.f31693z);
            this.f31693z.setColor(Color.parseColor("#ffff4444"));
            if (this.f31692y.intValue() == 1 && this.f31668A != null) {
                int i4 = this.f31682o;
                int i5 = this.f31676i;
                float f = ((float) i4) * ((float) i5);
                int i6 = this.f31677j;
                if (f / ((float) i6) > 0.4f) {
                    if (this.f31684q == -1) {
                        this.f31684q = i6 - (i4 * i5);
                    }
                    int i7 = this.f31683p + 1;
                    this.f31683p = i7;
                    Bitmap d = m40783d((int) (this.f31680m * ((((float) i7) * ((float) i5)) / ((float) this.f31684q))));
                    canvas.drawBitmap(d, 0.0f, 0.0f, this.f31693z);
                    d.recycle();
                }
            }
            this.f31693z.setColor(this.f31669B);
            if (this.f31692y.intValue() == 1) {
                int i8 = this.f31676i;
                if ((((float) this.f31682o) * ((float) i8)) / ((float) this.f31677j) > 0.6f) {
                    Paint paint = this.f31693z;
                    int i9 = this.f31678k;
                    paint.setAlpha((int) (((float) i9) - (((float) i9) * ((((float) this.f31683p) * ((float) i8)) / ((float) this.f31684q)))));
                } else {
                    this.f31693z.setAlpha(this.f31678k);
                }
            } else {
                Paint paint2 = this.f31693z;
                int i10 = this.f31678k;
                paint2.setAlpha((int) (((float) i10) - (((float) i10) * ((((float) this.f31682o) * ((float) this.f31676i)) / ((float) this.f31677j)))));
            }
            this.f31682o++;
        }
    }

    public int getFrameRate() {
        return this.f31676i;
    }

    public int getRippleAlpha() {
        return this.f31678k;
    }

    public int getRippleColor() {
        return this.f31669B;
    }

    public int getRippleDuration() {
        return this.f31677j;
    }

    public int getRipplePadding() {
        return this.f31670C;
    }

    public C7163d getRippleType() {
        return C7163d.values()[this.f31692y.intValue()];
    }

    public int getZoomDuration() {
        return this.f31687t;
    }

    public float getZoomScale() {
        return this.f31688u;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f31674g = i;
        this.f31675h = i2;
        float f = this.f31688u;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f, (float) (i / 2), (float) (i2 / 2));
        this.f31689v = scaleAnimation;
        scaleAnimation.setDuration((long) this.f31687t);
        this.f31689v.setRepeatMode(2);
        this.f31689v.setRepeatCount(1);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f31671D.onTouchEvent(motionEvent)) {
            mo27589b(motionEvent);
            m40785f(Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCentered(Boolean bool) {
        this.f31691x = bool;
    }

    public void setFrameRate(int i) {
        this.f31676i = i;
    }

    public void setOnRippleCompleteListener(C7162c cVar) {
        this.f31673F = cVar;
    }

    public void setRippleAlpha(int i) {
        this.f31678k = i;
    }

    public void setRippleColor(int i) {
        this.f31669B = getResources().getColor(i);
    }

    public void setRippleDuration(int i) {
        this.f31677j = i;
    }

    public void setRipplePadding(int i) {
        this.f31670C = i;
    }

    public void setRippleType(C7163d dVar) {
        this.f31692y = Integer.valueOf(dVar.ordinal());
    }

    public void setZoomDuration(int i) {
        this.f31687t = i;
    }

    public void setZoomScale(float f) {
        this.f31688u = f;
    }

    public void setZooming(Boolean bool) {
        this.f31690w = bool;
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40784e(context, attributeSet);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40784e(context, attributeSet);
    }
}
