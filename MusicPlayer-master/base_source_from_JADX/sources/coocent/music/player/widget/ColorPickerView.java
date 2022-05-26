package coocent.music.player.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p342g.p343a.p344a.C7941a;
import p342g.p343a.p344a.p358i.C8343s;

public class ColorPickerView extends View {

    /* renamed from: A */
    private int f31482A;

    /* renamed from: B */
    private boolean f31483B;

    /* renamed from: C */
    private C7130a f31484C;

    /* renamed from: g */
    private int f31485g;

    /* renamed from: h */
    private boolean f31486h;

    /* renamed from: i */
    private final Paint f31487i;

    /* renamed from: j */
    private final Paint f31488j;

    /* renamed from: k */
    private LinearGradient f31489k;

    /* renamed from: l */
    private int f31490l;

    /* renamed from: m */
    private int f31491m;

    /* renamed from: n */
    private int f31492n;

    /* renamed from: o */
    private int f31493o;

    /* renamed from: p */
    private final Rect f31494p;

    /* renamed from: q */
    private final Rect f31495q;

    /* renamed from: r */
    private int f31496r;

    /* renamed from: s */
    private C7131b f31497s;

    /* renamed from: t */
    private Bitmap f31498t;

    /* renamed from: u */
    private Bitmap f31499u;

    /* renamed from: v */
    private boolean f31500v;

    /* renamed from: w */
    private boolean f31501w;

    /* renamed from: x */
    private int f31502x;

    /* renamed from: y */
    private int f31503y;

    /* renamed from: z */
    private int[] f31504z;

    private class SavedState extends View.BaseSavedState {

        /* renamed from: g */
        int f31505g;

        /* renamed from: h */
        int f31506h;

        /* renamed from: i */
        int[] f31507i;

        /* renamed from: j */
        Bitmap f31508j;

        /* renamed from: k */
        Bitmap f31509k = null;

        SavedState(ColorPickerView colorPickerView, Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f31505g);
            parcel.writeInt(this.f31506h);
            parcel.writeParcelable(this.f31508j, i);
            parcel.writeIntArray(this.f31507i);
            Bitmap bitmap = this.f31509k;
            if (bitmap != null) {
                parcel.writeParcelable(bitmap, i);
            }
        }
    }

    /* renamed from: coocent.music.player.widget.ColorPickerView$a */
    public interface C7130a {
        /* renamed from: a */
        void mo26611a(int i);

        /* renamed from: b */
        void mo26612b(ColorPickerView colorPickerView, float f);

        /* renamed from: c */
        void mo26613c(ColorPickerView colorPickerView, int i);

        /* renamed from: d */
        void mo26614d(ColorPickerView colorPickerView);
    }

    /* renamed from: coocent.music.player.widget.ColorPickerView$b */
    public enum C7131b {
        HORIZONTAL,
        VERTICAL
    }

    public ColorPickerView(Context context) {
        super(context);
        this.f31494p = new Rect();
        this.f31495q = new Rect();
        this.f31500v = true;
        this.f31501w = true;
        this.f31504z = null;
        this.f31483B = true;
        this.f31498t = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f31499u = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        setLayerType(1, (Paint) null);
        Paint paint = new Paint();
        this.f31487i = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f31488j = paint2;
        paint2.setAntiAlias(true);
        this.f31503y = Integer.MAX_VALUE;
        this.f31502x = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    private int m40561a() {
        int i;
        int i2 = 1;
        if (this.f31497s == C7131b.HORIZONTAL) {
            Rect rect = this.f31494p;
            i = (rect.bottom - rect.top) / 2;
            int i3 = this.f31502x;
            int i4 = rect.left;
            if (i3 >= i4) {
                i2 = i3 > rect.right ? this.f31498t.getWidth() - 1 : i3 - i4;
            }
        } else {
            Rect rect2 = this.f31494p;
            int i5 = (rect2.right - rect2.left) / 2;
            int i6 = this.f31503y;
            int i7 = rect2.top;
            if (i6 < i7) {
                i2 = i5;
                i = 1;
            } else {
                i2 = i5;
                i = i6 > rect2.bottom ? this.f31498t.getHeight() - 1 : i6 - i7;
            }
        }
        int h = m40566h(this.f31498t.getPixel(i2, i));
        this.f31482A = h;
        return h;
    }

    /* renamed from: b */
    private void m40562b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f31493o - this.f31490l;
        int i6 = this.f31492n - this.f31491m;
        int min = Math.min(i6, i5);
        C7131b bVar = this.f31497s;
        C7131b bVar2 = C7131b.HORIZONTAL;
        if (bVar == bVar2) {
            if (i6 <= i5) {
                min = i6 / 6;
            }
        } else if (i6 >= i5) {
            min = i5 / 6;
        }
        int i7 = min / 15;
        int i8 = i7 * 7;
        this.f31496r = i8;
        int i9 = (i7 * 3) / 2;
        if (bVar == bVar2) {
            i3 = this.f31491m + i8;
            i2 = this.f31492n - i8;
            i4 = (getHeight() / 2) - i9;
            i = (getHeight() / 2) + i9;
        } else {
            int i10 = this.f31490l + i8;
            i = this.f31493o - i8;
            i2 = (getWidth() / 2) + i9;
            int i11 = i10;
            i3 = (getWidth() / 2) - i9;
            i4 = i11;
        }
        this.f31494p.set(i3, i4, i2, i);
    }

    /* renamed from: c */
    private void m40563c() {
        int height = this.f31494p.height();
        int width = this.f31494p.width();
        int i = this.f31496r * 2;
        Bitmap bitmap = this.f31498t;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f31498t.recycle();
            this.f31498t = null;
        }
        Bitmap bitmap2 = this.f31499u;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f31499u.recycle();
            this.f31499u = null;
        }
        this.f31498t = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f31499u = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: d */
    private void m40564d() {
        int i;
        Canvas canvas = new Canvas(this.f31498t);
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f31498t.getWidth(), (float) this.f31498t.getHeight());
        if (this.f31497s == C7131b.HORIZONTAL) {
            i = this.f31498t.getHeight() / 2;
        } else {
            i = this.f31498t.getWidth() / 2;
        }
        this.f31487i.setColor(-16777216);
        float f = (float) i;
        canvas.drawRoundRect(rectF, f, f, this.f31487i);
        this.f31487i.setShader(this.f31489k);
        canvas.drawRoundRect(rectF, f, f, this.f31487i);
        this.f31487i.setShader((Shader) null);
        this.f31500v = false;
    }

    /* renamed from: f */
    private void m40565f() {
        this.f31488j.setColor(this.f31485g);
        this.f31488j.setShadowLayer(1.0f, 0.0f, 0.0f, -7829368);
        Canvas canvas = new Canvas(this.f31499u);
        int i = this.f31496r;
        canvas.drawCircle((float) i, (float) i, (float) (i - 3), this.f31488j);
        this.f31501w = false;
    }

    /* renamed from: h */
    private int m40566h(int i) {
        return Color.argb(Color.alpha(i), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: e */
    public int[] mo27405e() {
        return new int[]{Color.rgb(255, 0, 0), Color.rgb(255, 255, 0), Color.rgb(0, 255, 0), Color.rgb(0, 255, 255), Color.rgb(0, 0, 255), Color.rgb(255, 0, 255), Color.rgb(255, 0, 0)};
    }

    /* renamed from: g */
    public void mo27406g() {
        if (C8343s.m46297e().mo27072e() == -1.0f) {
            this.f31502x = getWidth() / 2;
        } else {
            this.f31502x = (int) C8343s.m46297e().mo27072e();
        }
        this.f31503y = getHeight() / 2;
        invalidate();
    }

    public int getColor() {
        return m40561a();
    }

    public int getIndicatorColor() {
        return this.f31485g;
    }

    public int getIndicatorRadius() {
        return this.f31496r;
    }

    /* renamed from: i */
    public void mo27410i() {
        if (!this.f31483B) {
            m40561a();
            this.f31484C.mo26613c(this, this.f31482A);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f31500v) {
            m40564d();
        }
        canvas.drawBitmap(this.f31498t, (Rect) null, this.f31494p, this.f31487i);
        if (this.f31486h) {
            if (this.f31501w) {
                m40565f();
            }
            Rect rect = this.f31495q;
            int i = this.f31502x;
            int i2 = this.f31496r;
            int i3 = this.f31503y;
            rect.set(i - i2, i3 - i2, i + i2, i3 + i2);
            canvas.drawBitmap(this.f31499u, (Rect) null, this.f31495q, this.f31487i);
        }
        if (this.f31483B) {
            this.f31483B = false;
            if (this.f31484C != null) {
                m40561a();
                this.f31484C.mo26611a(this.f31482A);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f31490l = getPaddingTop();
        this.f31491m = getPaddingLeft();
        this.f31493o = getMeasuredHeight() - getPaddingBottom();
        this.f31492n = getMeasuredWidth() - getPaddingRight();
        int i5 = this.f31502x;
        int i6 = this.f31503y;
        if (i5 == i6 || i6 == Integer.MAX_VALUE) {
            if (C8343s.m46297e().mo27072e() == -1.0f) {
                this.f31502x = getWidth() / 2;
            } else {
                this.f31502x = (int) C8343s.m46297e().mo27072e();
            }
            this.f31503y = getHeight() / 2;
        }
        m40562b();
        int[] iArr = this.f31504z;
        if (iArr == null) {
            setColors(mo27405e());
        } else {
            setColors(iArr);
        }
        m40563c();
        if (this.f31486h) {
            this.f31501w = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        }
        if (mode2 != 1073741824) {
            size2 = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        }
        C7131b bVar = this.f31497s;
        C7131b bVar2 = C7131b.HORIZONTAL;
        int i3 = 420;
        int max = Math.max(size, bVar == bVar2 ? 420 : 70);
        if (this.f31497s == bVar2) {
            i3 = 70;
        }
        setMeasuredDimension(max, Math.max(size2, i3));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f31502x = savedState.f31505g;
        this.f31503y = savedState.f31506h;
        this.f31504z = savedState.f31507i;
        this.f31498t = savedState.f31508j;
        if (this.f31486h) {
            this.f31499u = savedState.f31509k;
            this.f31501w = true;
        }
        this.f31500v = true;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(this, super.onSaveInstanceState());
        savedState.f31505g = this.f31502x;
        savedState.f31506h = this.f31503y;
        savedState.f31508j = this.f31498t;
        if (this.f31486h) {
            savedState.f31509k = this.f31499u;
        }
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C7131b bVar = this.f31497s;
        C7131b bVar2 = C7131b.HORIZONTAL;
        if (bVar == bVar2) {
            int i = this.f31491m;
            int i2 = this.f31496r;
            if (x <= i + i2) {
                x = i + i2;
            }
            int i3 = this.f31492n;
            if (x >= i3 - i2) {
                x = (i3 - i2) - 1;
            }
        } else {
            int i4 = this.f31490l;
            int i5 = this.f31496r;
            if (y <= i4 + i5) {
                y = i4 + i5;
            }
            int i6 = this.f31493o;
            if (y >= i6 - i5) {
                y = (i6 - i5) - 1;
            }
        }
        if (bVar == bVar2) {
            this.f31502x = x;
            this.f31503y = getHeight() / 2;
        } else {
            this.f31502x = getWidth() / 2;
            this.f31503y = y;
        }
        if (motionEvent.getActionMasked() == 0) {
            C7130a aVar = this.f31484C;
            if (aVar != null) {
                aVar.mo26614d(this);
                m40561a();
                this.f31484C.mo26613c(this, this.f31482A);
            }
        } else if (motionEvent.getActionMasked() == 1) {
            C7130a aVar2 = this.f31484C;
            if (aVar2 != null) {
                aVar2.mo26612b(this, (float) (this.f31502x - this.f31496r));
                m40561a();
                this.f31484C.mo26613c(this, this.f31482A);
            }
        } else if (this.f31484C != null) {
            m40561a();
            this.f31484C.mo26613c(this, this.f31482A);
        }
        invalidate();
        return true;
    }

    public void setColors(int... iArr) {
        this.f31489k = null;
        this.f31504z = iArr;
        if (this.f31497s == C7131b.HORIZONTAL) {
            Rect rect = this.f31494p;
            int i = rect.top;
            float f = (float) i;
            this.f31489k = new LinearGradient((float) rect.left, (float) i, (float) rect.right, f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            Rect rect2 = this.f31494p;
            int i2 = rect2.left;
            float f2 = (float) i2;
            this.f31489k = new LinearGradient((float) i2, (float) rect2.top, f2, (float) rect2.bottom, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        this.f31500v = true;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f31485g = i;
        this.f31501w = true;
        invalidate();
    }

    public void setOnColorPickerChangeListener(C7130a aVar) {
        this.f31484C = aVar;
    }

    public void setOrientation(C7131b bVar) {
        this.f31497s = bVar;
        this.f31501w = true;
        this.f31500v = true;
        requestLayout();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31494p = new Rect();
        this.f31495q = new Rect();
        this.f31500v = true;
        this.f31501w = true;
        this.f31504z = null;
        this.f31483B = true;
        this.f31498t = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f31499u = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        setLayerType(1, (Paint) null);
        Paint paint = new Paint();
        this.f31487i = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f31488j = paint2;
        paint2.setAntiAlias(true);
        this.f31503y = Integer.MAX_VALUE;
        this.f31502x = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7941a.ColorPickerView, i, 0);
        this.f31485g = obtainStyledAttributes.getColor(0, -1);
        this.f31497s = obtainStyledAttributes.getInteger(2, 0) == 0 ? C7131b.HORIZONTAL : C7131b.VERTICAL;
        this.f31486h = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
