package p159f.p243f.p245b.p304b.p312t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p003d.C0524f;
import p159f.p243f.p245b.p304b.C7500l;

/* renamed from: f.f.b.b.t.d */
/* compiled from: TextAppearance */
public class C7523d {

    /* renamed from: a */
    public final ColorStateList f32732a;

    /* renamed from: b */
    public final ColorStateList f32733b;

    /* renamed from: c */
    public final String f32734c;

    /* renamed from: d */
    public final int f32735d;

    /* renamed from: e */
    public final int f32736e;

    /* renamed from: f */
    public final float f32737f;

    /* renamed from: g */
    public final float f32738g;

    /* renamed from: h */
    public final float f32739h;

    /* renamed from: i */
    public final boolean f32740i;

    /* renamed from: j */
    public final float f32741j;

    /* renamed from: k */
    public float f32742k;

    /* renamed from: l */
    private final int f32743l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f32744m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Typeface f32745n;

    /* renamed from: f.f.b.b.t.d$a */
    /* compiled from: TextAppearance */
    class C7524a extends C0524f.C0527c {

        /* renamed from: a */
        final /* synthetic */ C7527f f32746a;

        C7524a(C7527f fVar) {
            this.f32746a = fVar;
        }

        /* renamed from: d */
        public void mo2084d(int i) {
            boolean unused = C7523d.this.f32744m = true;
            this.f32746a.mo23420a(i);
        }

        /* renamed from: e */
        public void mo2085e(Typeface typeface) {
            C7523d dVar = C7523d.this;
            Typeface unused = dVar.f32745n = Typeface.create(typeface, dVar.f32735d);
            boolean unused2 = C7523d.this.f32744m = true;
            this.f32746a.mo23421b(C7523d.this.f32745n, false);
        }
    }

    /* renamed from: f.f.b.b.t.d$b */
    /* compiled from: TextAppearance */
    class C7525b extends C7527f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f32748a;

        /* renamed from: b */
        final /* synthetic */ C7527f f32749b;

        C7525b(TextPaint textPaint, C7527f fVar) {
            this.f32748a = textPaint;
            this.f32749b = fVar;
        }

        /* renamed from: a */
        public void mo23420a(int i) {
            this.f32749b.mo23420a(i);
        }

        /* renamed from: b */
        public void mo23421b(Typeface typeface, boolean z) {
            C7523d.this.mo28419l(this.f32748a, typeface);
            this.f32749b.mo23421b(typeface, z);
        }
    }

    public C7523d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7500l.TextAppearance);
        this.f32742k = obtainStyledAttributes.getDimension(C7500l.TextAppearance_android_textSize, 0.0f);
        this.f32732a = C7522c.m42014a(context, obtainStyledAttributes, C7500l.TextAppearance_android_textColor);
        C7522c.m42014a(context, obtainStyledAttributes, C7500l.TextAppearance_android_textColorHint);
        C7522c.m42014a(context, obtainStyledAttributes, C7500l.TextAppearance_android_textColorLink);
        this.f32735d = obtainStyledAttributes.getInt(C7500l.TextAppearance_android_textStyle, 0);
        this.f32736e = obtainStyledAttributes.getInt(C7500l.TextAppearance_android_typeface, 1);
        int e = C7522c.m42018e(obtainStyledAttributes, C7500l.TextAppearance_fontFamily, C7500l.TextAppearance_android_fontFamily);
        this.f32743l = obtainStyledAttributes.getResourceId(e, 0);
        this.f32734c = obtainStyledAttributes.getString(e);
        obtainStyledAttributes.getBoolean(C7500l.TextAppearance_textAllCaps, false);
        this.f32733b = C7522c.m42014a(context, obtainStyledAttributes, C7500l.TextAppearance_android_shadowColor);
        this.f32737f = obtainStyledAttributes.getFloat(C7500l.TextAppearance_android_shadowDx, 0.0f);
        this.f32738g = obtainStyledAttributes.getFloat(C7500l.TextAppearance_android_shadowDy, 0.0f);
        this.f32739h = obtainStyledAttributes.getFloat(C7500l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C7500l.MaterialTextAppearance);
            int i2 = C7500l.MaterialTextAppearance_android_letterSpacing;
            this.f32740i = obtainStyledAttributes2.hasValue(i2);
            this.f32741j = obtainStyledAttributes2.getFloat(i2, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.f32740i = false;
        this.f32741j = 0.0f;
    }

    /* renamed from: d */
    private void m42025d() {
        String str;
        if (this.f32745n == null && (str = this.f32734c) != null) {
            this.f32745n = Typeface.create(str, this.f32735d);
        }
        if (this.f32745n == null) {
            int i = this.f32736e;
            if (i == 1) {
                this.f32745n = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f32745n = Typeface.SERIF;
            } else if (i != 3) {
                this.f32745n = Typeface.DEFAULT;
            } else {
                this.f32745n = Typeface.MONOSPACE;
            }
            this.f32745n = Typeface.create(this.f32745n, this.f32735d);
        }
    }

    /* renamed from: i */
    private boolean m42026i(Context context) {
        if (C7526e.m42038a()) {
            return true;
        }
        int i = this.f32743l;
        if ((i != 0 ? C0524f.m3222c(context, i) : null) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public Typeface mo28413e() {
        m42025d();
        return this.f32745n;
    }

    /* renamed from: f */
    public Typeface mo28414f(Context context) {
        if (this.f32744m) {
            return this.f32745n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g = C0524f.m3226g(context, this.f32743l);
                this.f32745n = g;
                if (g != null) {
                    this.f32745n = Typeface.create(g, this.f32735d);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f32734c, e);
            }
        }
        m42025d();
        this.f32744m = true;
        return this.f32745n;
    }

    /* renamed from: g */
    public void mo28415g(Context context, TextPaint textPaint, C7527f fVar) {
        mo28419l(textPaint, mo28413e());
        mo28416h(context, new C7525b(textPaint, fVar));
    }

    /* renamed from: h */
    public void mo28416h(Context context, C7527f fVar) {
        if (m42026i(context)) {
            mo28414f(context);
        } else {
            m42025d();
        }
        int i = this.f32743l;
        if (i == 0) {
            this.f32744m = true;
        }
        if (this.f32744m) {
            fVar.mo23421b(this.f32745n, true);
            return;
        }
        try {
            C0524f.m3228i(context, i, new C7524a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f32744m = true;
            fVar.mo23420a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f32734c, e);
            this.f32744m = true;
            fVar.mo23420a(-3);
        }
    }

    /* renamed from: j */
    public void mo28417j(Context context, TextPaint textPaint, C7527f fVar) {
        mo28418k(context, textPaint, fVar);
        ColorStateList colorStateList = this.f32732a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f32739h;
        float f2 = this.f32737f;
        float f3 = this.f32738g;
        ColorStateList colorStateList2 = this.f32733b;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: k */
    public void mo28418k(Context context, TextPaint textPaint, C7527f fVar) {
        if (m42026i(context)) {
            mo28419l(textPaint, mo28414f(context));
        } else {
            mo28415g(context, textPaint, fVar);
        }
    }

    /* renamed from: l */
    public void mo28419l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f32735d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f32742k);
        if (Build.VERSION.SDK_INT >= 21 && this.f32740i) {
            textPaint.setLetterSpacing(this.f32741j);
        }
    }
}
