package com.coocent.marquee;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.content.C0506a;
import com.coocent.marquee.p055y.C2333a;
import java.util.Locale;

public class MarqueeSeekBarView extends View {

    /* renamed from: g */
    private boolean f7734g = true;

    /* renamed from: h */
    private C2260a f7735h;

    /* renamed from: i */
    private float f7736i = 1.0f;

    /* renamed from: j */
    private RectF f7737j = new RectF();

    /* renamed from: k */
    private Bitmap f7738k = null;

    /* renamed from: l */
    private Bitmap f7739l = null;

    /* renamed from: m */
    private Bitmap f7740m = null;

    /* renamed from: n */
    private int f7741n = 0;

    /* renamed from: o */
    private int f7742o = 0;

    /* renamed from: p */
    private float f7743p = 0.0f;

    /* renamed from: q */
    private float f7744q = 0.0f;

    /* renamed from: r */
    private int f7745r = 0;

    /* renamed from: s */
    private boolean f7746s = false;

    /* renamed from: t */
    private int f7747t;

    /* renamed from: u */
    private boolean f7748u = true;

    /* renamed from: v */
    private boolean f7749v = true;

    /* renamed from: w */
    private C2261b f7750w;

    /* renamed from: x */
    private boolean f7751x = false;

    /* renamed from: y */
    private int f7752y = C2298o.m10815x1();

    /* renamed from: z */
    boolean f7753z = false;

    /* renamed from: com.coocent.marquee.MarqueeSeekBarView$a */
    public interface C2260a {
        /* renamed from: a */
        void mo8894a(int i, boolean z, boolean z2);
    }

    /* renamed from: com.coocent.marquee.MarqueeSeekBarView$b */
    public interface C2261b {
        /* renamed from: a */
        void mo8937a(boolean z);
    }

    public MarqueeSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10545c();
    }

    /* renamed from: a */
    private static Bitmap m10543a(Drawable drawable) {
        Bitmap.Config config;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: b */
    private Bitmap m10544b(int i, int i2) {
        Drawable d = C0506a.m3152d(getContext(), i);
        C2333a.C2334a aVar = C2333a.f8191a;
        aVar.mo9133d(d, i2);
        return aVar.mo9130a(d);
    }

    /* renamed from: c */
    private void m10545c() {
        this.f7749v = true;
        String simpleName = getClass().getSimpleName();
        Log.d(simpleName, "#init#hasTouchFromUser=" + this.f7746s);
        if (this.f7734g) {
            this.f7740m = BitmapFactory.decodeResource(getResources(), C2298o.m10684F0());
        } else {
            this.f7740m = BitmapFactory.decodeResource(getResources(), C2298o.m10724S1());
        }
    }

    /* renamed from: d */
    private void m10546d() {
        Bitmap f;
        if (getWidth() > 0 && getHeight() > 0) {
            try {
                String simpleName = getClass().getSimpleName();
                Log.d(simpleName, "#initBitmap2#hasTouchFromUser=" + this.f7746s);
                this.f7740m = BitmapFactory.decodeResource(getResources(), (!this.f7734g || this.f7751x) ? C2298o.m10724S1() : C2298o.m10684F0());
                if (!this.f7734g || this.f7751x) {
                    if (C2298o.m10809v1() != -1) {
                        this.f7740m = m10544b(C2307r.marquee_seek_bar_thumb, C2298o.m10809v1());
                    } else if (C2298o.m10727T1() != null) {
                        this.f7740m = m10543a(C2298o.m10727T1());
                    } else {
                        this.f7740m = BitmapFactory.decodeResource(getResources(), C2298o.m10724S1());
                    }
                } else if (C2298o.m10812w1() != -1) {
                    this.f7740m = m10544b(C2307r.marquee_seek_bar_thumb, C2298o.m10812w1());
                } else if (C2298o.m10687G0() != null) {
                    this.f7740m = m10543a(C2298o.m10687G0());
                } else {
                    this.f7740m = BitmapFactory.decodeResource(getResources(), C2298o.m10684F0());
                }
                if (!this.f7734g || this.f7751x) {
                    if (C2298o.m10803t1() != -1) {
                        this.f7739l = m10544b(C2307r.marquee_seek_bar_progress, C2298o.m10803t1());
                    } else if (C2298o.m10818y1() != null) {
                        this.f7739l = m10548f(C2298o.m10752c1(), C2274d.m10589a(C2298o.m10670A1()));
                    } else {
                        this.f7739l = m10548f(C2298o.m10752c1(), BitmapFactory.decodeResource(getResources(), this.f7752y));
                    }
                } else if (C2298o.m10806u1() != -1) {
                    this.f7739l = m10544b(C2307r.marquee_seek_bar_progress, C2298o.m10806u1());
                } else if (C2298o.m10735W0() != null) {
                    this.f7739l = m10548f(C2298o.m10752c1(), C2274d.m10589a(C2298o.m10735W0()));
                } else {
                    this.f7739l = m10548f(C2298o.m10752c1(), BitmapFactory.decodeResource(getResources(), this.f7752y));
                }
                if (C2298o.m10736W1() && C2298o.m10718Q1() != 0 && this.f7734g && !this.f7751x) {
                    this.f7739l = C2274d.m10594f(this.f7739l, C2298o.m10718Q1());
                }
                Matrix matrix = new Matrix();
                matrix.postScale((((float) this.f7742o) * 1.0f) / ((float) this.f7739l.getWidth()), 1.0f);
                if (this.f7739l.getWidth() > 0 && this.f7739l.getHeight() > 0) {
                    Bitmap bitmap = this.f7739l;
                    this.f7739l = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f7739l.getHeight(), matrix, false);
                }
                if (C2298o.m10800s1() != -1) {
                    f = m10544b(C2307r.marquee_seek_bar_progress, C2298o.m10800s1());
                } else if (C2298o.m10818y1() != null) {
                    f = m10548f(C2298o.m10752c1(), C2274d.m10589a(C2298o.m10818y1()));
                } else {
                    f = m10548f(C2298o.m10752c1(), BitmapFactory.decodeResource(getResources(), C2298o.m10815x1()));
                }
                Bitmap bitmap2 = f;
                this.f7738k = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, false);
                bitmap2.recycle();
                this.f7741n = (getHeight() - this.f7739l.getHeight()) / 2;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private boolean m10547e() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* renamed from: f */
    public static Bitmap m10548f(boolean z, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postRotate(z ? 90.0f : 0.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (!(createBitmap == bitmap || bitmap == null || bitmap.isRecycled())) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: g */
    public void mo8922g(int i, boolean z) {
        this.f7753z = true;
        if (!z) {
            i = C2298o.m10821z1();
        }
        this.f7752y = i;
        m10546d();
        this.f7749v = true;
        invalidate();
    }

    public boolean getLink() {
        return this.f7751x;
    }

    public int getPaddingEndcompatible() {
        if (Build.VERSION.SDK_INT >= 17) {
            return getPaddingEnd();
        }
        return getPaddingRight();
    }

    public int getPaddingStartcompatible() {
        if (Build.VERSION.SDK_INT >= 17) {
            return getPaddingStart();
        }
        return getPaddingLeft();
    }

    public int getValue() {
        return this.f7745r;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        int paddingStartcompatible;
        float f2;
        int paddingEndcompatible;
        super.onDraw(canvas);
        try {
            Bitmap bitmap = this.f7738k;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (float) getPaddingStartcompatible(), (float) this.f7741n, (Paint) null);
            }
            if (!this.f7753z) {
                if (m10547e()) {
                    RectF rectF = this.f7737j;
                    if (rectF.left + this.f7744q < ((float) getPaddingEndcompatible())) {
                        paddingEndcompatible = getPaddingEndcompatible();
                    } else if (this.f7737j.left + this.f7744q > ((float) (this.f7742o + getPaddingEndcompatible()))) {
                        paddingEndcompatible = this.f7742o + getPaddingEndcompatible();
                    } else {
                        f2 = this.f7737j.left + this.f7744q;
                        rectF.left = f2;
                        this.f7745r = (int) Math.rint((double) ((((float) (this.f7742o + getPaddingEndcompatible())) - this.f7737j.left) / this.f7736i));
                    }
                    f2 = (float) paddingEndcompatible;
                    rectF.left = f2;
                    this.f7745r = (int) Math.rint((double) ((((float) (this.f7742o + getPaddingEndcompatible())) - this.f7737j.left) / this.f7736i));
                } else {
                    RectF rectF2 = this.f7737j;
                    if (rectF2.right + this.f7744q < ((float) getPaddingStartcompatible())) {
                        paddingStartcompatible = getPaddingStartcompatible();
                    } else if (this.f7737j.right + this.f7744q > ((float) (this.f7742o + getPaddingStartcompatible()))) {
                        paddingStartcompatible = this.f7742o + getPaddingStartcompatible();
                    } else {
                        f = this.f7737j.right + this.f7744q;
                        rectF2.right = f;
                        this.f7745r = (int) Math.rint((double) ((this.f7737j.right - ((float) getPaddingStartcompatible())) / this.f7736i));
                    }
                    f = (float) paddingStartcompatible;
                    rectF2.right = f;
                    this.f7745r = (int) Math.rint((double) ((this.f7737j.right - ((float) getPaddingStartcompatible())) / this.f7736i));
                }
                C2260a aVar = this.f7735h;
                if (aVar != null) {
                    if (this.f7749v) {
                        aVar.mo8894a(this.f7745r, this.f7746s, this.f7748u);
                    }
                    this.f7748u = true;
                }
            }
            this.f7746s = false;
            if (this.f7739l != null) {
                canvas.save();
                canvas.clipRect(this.f7737j);
                canvas.drawBitmap(this.f7739l, (float) getPaddingStartcompatible(), (float) this.f7741n, (Paint) null);
                canvas.restore();
            }
            if (this.f7740m != null) {
                if (m10547e()) {
                    Bitmap bitmap2 = this.f7740m;
                    canvas.drawBitmap(bitmap2, this.f7737j.left - (((float) bitmap2.getWidth()) / 2.0f), ((float) (getHeight() - this.f7740m.getHeight())) / 2.0f, (Paint) null);
                } else {
                    Bitmap bitmap3 = this.f7740m;
                    canvas.drawBitmap(bitmap3, this.f7737j.right - (((float) bitmap3.getWidth()) / 2.0f), ((float) (getHeight() - this.f7740m.getHeight())) / 2.0f, (Paint) null);
                }
            }
            this.f7753z = false;
            this.f7749v = false;
        } catch (RuntimeException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f7748u = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.f7737j;
        rectF.top = 0.0f;
        rectF.bottom = (float) i2;
        if (Build.VERSION.SDK_INT >= 17) {
            if (m10547e()) {
                this.f7737j.left = (float) (getWidth() - getPaddingStart());
                this.f7737j.right = (float) (getWidth() - getPaddingStart());
            } else {
                this.f7737j.left = (float) getPaddingStart();
                this.f7737j.right = (float) getPaddingStart();
            }
            this.f7742o = (getWidth() - getPaddingStart()) - getPaddingEnd();
        } else {
            if (m10547e()) {
                this.f7737j.left = (float) (getWidth() - getPaddingLeft());
                this.f7737j.right = (float) (getWidth() - getPaddingLeft());
            } else {
                this.f7737j.left = (float) getPaddingLeft();
                this.f7737j.right = (float) getPaddingLeft();
            }
            this.f7742o = (getWidth() - getPaddingLeft()) - getPaddingRight();
        }
        this.f7736i = (((float) this.f7742o) * 1.0f) / ((float) this.f7747t);
        setCurrentValue(this.f7745r);
        m10546d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r7 != 3) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.f7734g
            r1 = 0
            if (r0 == 0) goto L_0x0132
            boolean r0 = r6.f7751x
            if (r0 == 0) goto L_0x000b
            goto L_0x0132
        L_0x000b:
            r0 = 1
            r6.f7746s = r0
            float r2 = r7.getX()
            int r7 = r7.getAction()
            r3 = -1
            if (r7 == 0) goto L_0x0079
            if (r7 == r0) goto L_0x0032
            r4 = 2
            if (r7 == r4) goto L_0x0023
            r2 = 3
            if (r7 == r2) goto L_0x0032
            goto L_0x012a
        L_0x0023:
            float r7 = r6.f7743p
            float r7 = r2 - r7
            r6.f7744q = r7
            r6.f7743p = r2
            r6.f7749v = r0
            r6.invalidate()
            goto L_0x012a
        L_0x0032:
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            int r7 = com.coocent.marquee.C2298o.m10812w1()
            if (r7 == r3) goto L_0x004c
            int r7 = com.coocent.marquee.C2307r.marquee_seek_bar_thumb
            int r2 = com.coocent.marquee.C2298o.m10812w1()
            android.graphics.Bitmap r7 = r6.m10544b(r7, r2)
            r6.f7740m = r7
            goto L_0x006b
        L_0x004c:
            android.graphics.drawable.Drawable r7 = com.coocent.marquee.C2298o.m10687G0()
            if (r7 == 0) goto L_0x005d
            android.graphics.drawable.Drawable r7 = com.coocent.marquee.C2298o.m10687G0()
            android.graphics.Bitmap r7 = m10543a(r7)
            r6.f7740m = r7
            goto L_0x006b
        L_0x005d:
            android.content.res.Resources r7 = r6.getResources()
            int r2 = com.coocent.marquee.C2298o.m10684F0()
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r7, r2)
            r6.f7740m = r7
        L_0x006b:
            r6.f7749v = r0
            r6.invalidate()
            com.coocent.marquee.MarqueeSeekBarView$b r7 = r6.f7750w
            if (r7 == 0) goto L_0x012a
            r7.mo8937a(r1)
            goto L_0x012a
        L_0x0079:
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r0)
            boolean r7 = r6.m10547e()
            if (r7 == 0) goto L_0x009d
            android.graphics.RectF r7 = r6.f7737j
            float r7 = r7.left
            android.graphics.Bitmap r4 = r6.f7740m
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r7 = r7 - r4
            android.graphics.RectF r4 = r6.f7737j
            float r4 = r4.left
            android.graphics.Bitmap r5 = r6.f7740m
            int r5 = r5.getWidth()
            goto L_0x00b3
        L_0x009d:
            android.graphics.RectF r7 = r6.f7737j
            float r7 = r7.right
            android.graphics.Bitmap r4 = r6.f7740m
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r7 = r7 - r4
            android.graphics.RectF r4 = r6.f7737j
            float r4 = r4.right
            android.graphics.Bitmap r5 = r6.f7740m
            int r5 = r5.getWidth()
        L_0x00b3:
            float r5 = (float) r5
            float r4 = r4 + r5
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x012b
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x00be
            goto L_0x012b
        L_0x00be:
            com.coocent.marquee.MarqueeSeekBarView$b r7 = r6.f7750w
            if (r7 == 0) goto L_0x00c5
            r7.mo8937a(r0)
        L_0x00c5:
            android.graphics.drawable.Drawable r7 = com.coocent.marquee.C2298o.m10693I0()
            if (r7 == 0) goto L_0x00d6
            android.graphics.drawable.Drawable r7 = com.coocent.marquee.C2298o.m10693I0()
            android.graphics.Bitmap r7 = m10543a(r7)
            r6.f7740m = r7
            goto L_0x0123
        L_0x00d6:
            int r7 = com.coocent.marquee.C2298o.m10690H0()
            if (r7 == 0) goto L_0x00eb
            android.content.res.Resources r7 = r6.getResources()
            int r1 = com.coocent.marquee.C2298o.m10690H0()
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r7, r1)
            r6.f7740m = r7
            goto L_0x0123
        L_0x00eb:
            int r7 = com.coocent.marquee.C2298o.m10812w1()
            if (r7 == r3) goto L_0x00fe
            int r7 = com.coocent.marquee.C2307r.marquee_seek_bar_thumb
            int r1 = com.coocent.marquee.C2298o.m10812w1()
            android.graphics.Bitmap r7 = r6.m10544b(r7, r1)
            r6.f7740m = r7
            goto L_0x0123
        L_0x00fe:
            android.graphics.drawable.Drawable r7 = com.coocent.marquee.C2298o.m10687G0()
            if (r7 == 0) goto L_0x010f
            android.graphics.drawable.Drawable r7 = com.coocent.marquee.C2298o.m10687G0()
            android.graphics.Bitmap r7 = m10543a(r7)
            r6.f7740m = r7
            goto L_0x0123
        L_0x010f:
            int r7 = com.coocent.marquee.C2298o.m10684F0()
            if (r7 == 0) goto L_0x0123
            android.content.res.Resources r7 = r6.getResources()
            int r1 = com.coocent.marquee.C2298o.m10684F0()
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r7, r1)
            r6.f7740m = r7
        L_0x0123:
            r6.f7743p = r2
            r6.f7749v = r0
            r6.invalidate()
        L_0x012a:
            return r0
        L_0x012b:
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
        L_0x0132:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.marquee.MarqueeSeekBarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentValue(int i) {
        this.f7748u = false;
        this.f7745r = i;
        if (Build.VERSION.SDK_INT >= 17) {
            if (m10547e()) {
                this.f7737j.left = ((float) (getPaddingEnd() + this.f7742o)) - (((float) i) * this.f7736i);
            } else {
                this.f7737j.right = ((float) getPaddingStart()) + (((float) i) * this.f7736i);
            }
        } else if (m10547e()) {
            this.f7737j.left = ((float) (getPaddingRight() + this.f7742o)) - (((float) i) * this.f7736i);
        } else {
            this.f7737j.right = ((float) getPaddingLeft()) + (((float) i) * this.f7736i);
        }
        this.f7744q = 0.0f;
        this.f7749v = true;
        invalidate();
    }

    public void setEnable(boolean z) {
        this.f7734g = z;
    }

    public void setLink(boolean z) {
        this.f7751x = z;
        this.f7753z = true;
        m10546d();
        this.f7749v = true;
        invalidate();
    }

    public void setMaxValue(int i) {
        this.f7747t = i;
    }

    public void setOnSeekBarChangeListener(C2260a aVar) {
        this.f7735h = aVar;
    }

    public void setOnSeekBarTouchListener(C2261b bVar) {
        this.f7750w = bVar;
    }

    public MarqueeSeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10545c();
    }
}
