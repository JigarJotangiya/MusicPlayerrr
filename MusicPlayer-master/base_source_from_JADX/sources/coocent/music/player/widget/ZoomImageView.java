package coocent.music.player.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

public class ZoomImageView extends ImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f31768g;

    /* renamed from: h */
    private boolean f31769h;

    /* renamed from: i */
    private final float[] f31770i;

    /* renamed from: j */
    private ScaleGestureDetector f31771j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Matrix f31772k;

    /* renamed from: l */
    private GestureDetector f31773l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f31774m;

    /* renamed from: n */
    private int f31775n;

    /* renamed from: o */
    private float f31776o;

    /* renamed from: p */
    private float f31777p;

    /* renamed from: q */
    private boolean f31778q;

    /* renamed from: r */
    private int f31779r;

    /* renamed from: s */
    private boolean f31780s;

    /* renamed from: t */
    private boolean f31781t;

    /* renamed from: coocent.music.player.widget.ZoomImageView$a */
    class C7175a extends GestureDetector.SimpleOnGestureListener {
        C7175a() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ZoomImageView.this.f31774m) {
                return true;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (ZoomImageView.this.getScale() < 2.0f) {
                ZoomImageView zoomImageView = ZoomImageView.this;
                zoomImageView.postDelayed(new C7176b(2.0f, x, y), 16);
                boolean unused = ZoomImageView.this.f31774m = true;
            } else if (ZoomImageView.this.getScale() < 2.0f || ZoomImageView.this.getScale() >= 4.0f) {
                ZoomImageView zoomImageView2 = ZoomImageView.this;
                zoomImageView2.postDelayed(new C7176b(zoomImageView2.f31768g, x, y), 16);
                boolean unused2 = ZoomImageView.this.f31774m = true;
            } else {
                ZoomImageView zoomImageView3 = ZoomImageView.this;
                zoomImageView3.postDelayed(new C7176b(4.0f, x, y), 16);
                boolean unused3 = ZoomImageView.this.f31774m = true;
            }
            return true;
        }
    }

    /* renamed from: coocent.music.player.widget.ZoomImageView$b */
    private class C7176b implements Runnable {

        /* renamed from: g */
        private float f31783g;

        /* renamed from: h */
        private float f31784h;

        /* renamed from: i */
        private float f31785i;

        /* renamed from: j */
        private float f31786j;

        public C7176b(float f, float f2, float f3) {
            this.f31783g = f;
            this.f31785i = f2;
            this.f31786j = f3;
            if (ZoomImageView.this.getScale() < this.f31783g) {
                this.f31784h = 1.07f;
            } else {
                this.f31784h = 0.93f;
            }
        }

        public void run() {
            Matrix f = ZoomImageView.this.f31772k;
            float f2 = this.f31784h;
            f.postScale(f2, f2, this.f31785i, this.f31786j);
            ZoomImageView.this.m40833o();
            ZoomImageView zoomImageView = ZoomImageView.this;
            zoomImageView.setImageMatrix(zoomImageView.f31772k);
            float scale = ZoomImageView.this.getScale();
            float f3 = this.f31784h;
            if ((f3 <= 1.0f || scale >= this.f31783g) && (f3 >= 1.0f || this.f31783g >= scale)) {
                float f4 = this.f31783g / scale;
                ZoomImageView.this.f31772k.postScale(f4, f4, this.f31785i, this.f31786j);
                ZoomImageView.this.m40833o();
                ZoomImageView zoomImageView2 = ZoomImageView.this;
                zoomImageView2.setImageMatrix(zoomImageView2.f31772k);
                boolean unused = ZoomImageView.this.f31774m = false;
                return;
            }
            ZoomImageView.this.postDelayed(this, 16);
        }
    }

    static {
        Class<ZoomImageView> cls = ZoomImageView.class;
    }

    public ZoomImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    private RectF getMatrixRectF() {
        Matrix matrix = this.f31772k;
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m40833o() {
        float f;
        RectF matrixRectF = getMatrixRectF();
        int width = getWidth();
        int height = getHeight();
        float f2 = (float) width;
        float f3 = 0.0f;
        if (matrixRectF.width() >= f2) {
            float f4 = matrixRectF.left;
            f = f4 > 0.0f ? -f4 : 0.0f;
            float f5 = matrixRectF.right;
            if (f5 < f2) {
                f = f2 - f5;
            }
        } else {
            f = 0.0f;
        }
        float f6 = (float) height;
        if (matrixRectF.height() >= f6) {
            float f7 = matrixRectF.top;
            if (f7 > 0.0f) {
                f3 = -f7;
            }
            float f8 = matrixRectF.bottom;
            if (f8 < f6) {
                f3 = f6 - f8;
            }
        }
        if (matrixRectF.width() < f2) {
            f = (matrixRectF.width() * 0.5f) + ((f2 * 0.5f) - matrixRectF.right);
        }
        if (matrixRectF.height() < f6) {
            f3 = ((f6 * 0.5f) - matrixRectF.bottom) + (matrixRectF.height() * 0.5f);
        }
        this.f31772k.postTranslate(f, f3);
    }

    /* renamed from: p */
    private void m40834p() {
        RectF matrixRectF = getMatrixRectF();
        float width = (float) getWidth();
        float height = (float) getHeight();
        float f = matrixRectF.top;
        float f2 = 0.0f;
        float f3 = (f <= 0.0f || !this.f31780s) ? 0.0f : -f;
        float f4 = matrixRectF.bottom;
        if (f4 < height && this.f31780s) {
            f3 = height - f4;
        }
        float f5 = matrixRectF.left;
        if (f5 > 0.0f && this.f31781t) {
            f2 = -f5;
        }
        float f6 = matrixRectF.right;
        if (f6 < width && this.f31781t) {
            f2 = width - f6;
        }
        this.f31772k.postTranslate(f2, f3);
    }

    /* renamed from: q */
    private boolean m40835q(float f, float f2) {
        return Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f31775n);
    }

    public final float getScale() {
        this.f31772k.getValues(this.f31770i);
        return this.f31770i[0];
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    public void onGlobalLayout() {
        Drawable drawable;
        if (this.f31769h && (drawable = getDrawable()) != null) {
            int width = getWidth();
            int height = getHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f = (intrinsicWidth <= width || intrinsicHeight > height) ? 1.0f : (((float) width) * 1.0f) / ((float) intrinsicWidth);
            if (intrinsicHeight > height && intrinsicWidth <= width) {
                f = (((float) height) * 1.0f) / ((float) intrinsicHeight);
            }
            if (intrinsicWidth > width && intrinsicHeight > height) {
                f = Math.min((((float) width) * 1.0f) / ((float) intrinsicWidth), (((float) height) * 1.0f) / ((float) intrinsicHeight));
            }
            this.f31768g = f;
            this.f31772k.postTranslate((float) ((width - intrinsicWidth) / 2), (float) ((height - intrinsicHeight) / 2));
            this.f31772k.postScale(f, f, (float) (getWidth() / 2), (float) (getHeight() / 2));
            setImageMatrix(this.f31772k);
            this.f31769h = false;
        }
    }

    @SuppressLint({"NewApi"})
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (getDrawable() == null) {
            return true;
        }
        if ((scale < 4.0f && scaleFactor > 1.0f) || (scale > this.f31768g && scaleFactor < 1.0f)) {
            float f = this.f31768g;
            if (scaleFactor * scale < f) {
                scaleFactor = f / scale;
            }
            if (scaleFactor * scale > 4.0f) {
                scaleFactor = 4.0f / scale;
            }
            this.f31772k.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            m40833o();
            setImageMatrix(this.f31772k);
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r10 != 3) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            android.view.GestureDetector r9 = r8.f31773l
            boolean r9 = r9.onTouchEvent(r10)
            r0 = 1
            if (r9 == 0) goto L_0x000a
            return r0
        L_0x000a:
            android.view.ScaleGestureDetector r9 = r8.f31771j
            r9.onTouchEvent(r10)
            int r9 = r10.getPointerCount()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0018:
            if (r3 >= r9) goto L_0x0027
            float r6 = r10.getX(r3)
            float r4 = r4 + r6
            float r6 = r10.getY(r3)
            float r5 = r5 + r6
            int r3 = r3 + 1
            goto L_0x0018
        L_0x0027:
            float r3 = (float) r9
            float r4 = r4 / r3
            float r5 = r5 / r3
            int r3 = r8.f31779r
            if (r9 == r3) goto L_0x0034
            r8.f31778q = r2
            r8.f31776o = r4
            r8.f31777p = r5
        L_0x0034:
            r8.f31779r = r9
            android.graphics.RectF r9 = r8.getMatrixRectF()
            int r10 = r10.getAction()
            if (r10 == 0) goto L_0x00c1
            if (r10 == r0) goto L_0x00be
            r3 = 2
            if (r10 == r3) goto L_0x004a
            r9 = 3
            if (r10 == r9) goto L_0x00be
            goto L_0x00e2
        L_0x004a:
            float r10 = r9.width()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x0064
            float r10 = r9.height()
            int r3 = r8.getHeight()
            float r3 = (float) r3
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x006b
        L_0x0064:
            android.view.ViewParent r10 = r8.getParent()
            r10.requestDisallowInterceptTouchEvent(r0)
        L_0x006b:
            float r10 = r8.f31776o
            float r10 = r4 - r10
            float r3 = r8.f31777p
            float r3 = r5 - r3
            boolean r6 = r8.f31778q
            if (r6 != 0) goto L_0x007d
            boolean r6 = r8.m40835q(r10, r3)
            r8.f31778q = r6
        L_0x007d:
            boolean r6 = r8.f31778q
            if (r6 == 0) goto L_0x00b9
            android.graphics.drawable.Drawable r6 = r8.getDrawable()
            if (r6 == 0) goto L_0x00b9
            r8.f31780s = r0
            r8.f31781t = r0
            float r6 = r9.width()
            int r7 = r8.getWidth()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x009b
            r8.f31781t = r2
            r10 = 0
        L_0x009b:
            float r9 = r9.height()
            int r6 = r8.getHeight()
            float r6 = (float) r6
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x00ab
            r8.f31780s = r2
            goto L_0x00ac
        L_0x00ab:
            r1 = r3
        L_0x00ac:
            android.graphics.Matrix r9 = r8.f31772k
            r9.postTranslate(r10, r1)
            r8.m40834p()
            android.graphics.Matrix r9 = r8.f31772k
            r8.setImageMatrix(r9)
        L_0x00b9:
            r8.f31776o = r4
            r8.f31777p = r5
            goto L_0x00e2
        L_0x00be:
            r8.f31779r = r2
            goto L_0x00e2
        L_0x00c1:
            float r10 = r9.width()
            int r1 = r8.getWidth()
            float r1 = (float) r1
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 > 0) goto L_0x00db
            float r9 = r9.height()
            int r10 = r8.getHeight()
            float r10 = (float) r10
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e2
        L_0x00db:
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r0)
        L_0x00e2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.widget.ZoomImageView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public ZoomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31768g = 1.0f;
        this.f31769h = true;
        this.f31770i = new float[9];
        this.f31771j = null;
        this.f31772k = new Matrix();
        this.f31780s = true;
        this.f31781t = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        this.f31773l = new GestureDetector(context, new C7175a());
        this.f31771j = new ScaleGestureDetector(context, this);
        setOnTouchListener(this);
    }
}
