package p082e.p154x.p155a.p156a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p003d.C0515b;
import androidx.core.content.p003d.C0533g;
import androidx.core.graphics.drawable.C0534a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p082e.p098e.C3465a;
import p082e.p109h.p110h.C3623c;

/* renamed from: e.x.a.a.i */
/* compiled from: VectorDrawableCompat */
public class C4247i extends C4246h {

    /* renamed from: p */
    static final PorterDuff.Mode f12653p = PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    private C4255h f12654h;

    /* renamed from: i */
    private PorterDuffColorFilter f12655i;

    /* renamed from: j */
    private ColorFilter f12656j;

    /* renamed from: k */
    private boolean f12657k;

    /* renamed from: l */
    private boolean f12658l;

    /* renamed from: m */
    private final float[] f12659m;

    /* renamed from: n */
    private final Matrix f12660n;

    /* renamed from: o */
    private final Rect f12661o;

    /* renamed from: e.x.a.a.i$b */
    /* compiled from: VectorDrawableCompat */
    private static class C4249b extends C4253f {
        C4249b() {
        }

        /* renamed from: f */
        private void m18669f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f12688b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f12687a = C3623c.m15604d(string2);
            }
            this.f12689c = C0533g.m3248g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: c */
        public boolean mo14508c() {
            return true;
        }

        /* renamed from: e */
        public void mo14509e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0533g.m3251j(xmlPullParser, "pathData")) {
                TypedArray k = C0533g.m3252k(resources, theme, attributeSet, C4235a.f12628d);
                m18669f(k, xmlPullParser);
                k.recycle();
            }
        }

        C4249b(C4249b bVar) {
            super(bVar);
        }
    }

    /* renamed from: e.x.a.a.i$e */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C4252e {
        private C4252e() {
        }

        /* renamed from: a */
        public boolean mo14510a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo14511b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: e.x.a.a.i$h */
    /* compiled from: VectorDrawableCompat */
    private static class C4255h extends Drawable.ConstantState {

        /* renamed from: a */
        int f12708a;

        /* renamed from: b */
        C4254g f12709b;

        /* renamed from: c */
        ColorStateList f12710c;

        /* renamed from: d */
        PorterDuff.Mode f12711d;

        /* renamed from: e */
        boolean f12712e;

        /* renamed from: f */
        Bitmap f12713f;

        /* renamed from: g */
        ColorStateList f12714g;

        /* renamed from: h */
        PorterDuff.Mode f12715h;

        /* renamed from: i */
        int f12716i;

        /* renamed from: j */
        boolean f12717j;

        /* renamed from: k */
        boolean f12718k;

        /* renamed from: l */
        Paint f12719l;

        public C4255h(C4255h hVar) {
            this.f12710c = null;
            this.f12711d = C4247i.f12653p;
            if (hVar != null) {
                this.f12708a = hVar.f12708a;
                C4254g gVar = new C4254g(hVar.f12709b);
                this.f12709b = gVar;
                if (hVar.f12709b.f12696e != null) {
                    gVar.f12696e = new Paint(hVar.f12709b.f12696e);
                }
                if (hVar.f12709b.f12695d != null) {
                    this.f12709b.f12695d = new Paint(hVar.f12709b.f12695d);
                }
                this.f12710c = hVar.f12710c;
                this.f12711d = hVar.f12711d;
                this.f12712e = hVar.f12712e;
            }
        }

        /* renamed from: a */
        public boolean mo14557a(int i, int i2) {
            return i == this.f12713f.getWidth() && i2 == this.f12713f.getHeight();
        }

        /* renamed from: b */
        public boolean mo14558b() {
            return !this.f12718k && this.f12714g == this.f12710c && this.f12715h == this.f12711d && this.f12717j == this.f12712e && this.f12716i == this.f12709b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo14559c(int i, int i2) {
            if (this.f12713f == null || !mo14557a(i, i2)) {
                this.f12713f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f12718k = true;
            }
        }

        /* renamed from: d */
        public void mo14560d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f12713f, (Rect) null, rect, mo14561e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo14561e(ColorFilter colorFilter) {
            if (!mo14562f() && colorFilter == null) {
                return null;
            }
            if (this.f12719l == null) {
                Paint paint = new Paint();
                this.f12719l = paint;
                paint.setFilterBitmap(true);
            }
            this.f12719l.setAlpha(this.f12709b.getRootAlpha());
            this.f12719l.setColorFilter(colorFilter);
            return this.f12719l;
        }

        /* renamed from: f */
        public boolean mo14562f() {
            return this.f12709b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo14563g() {
            return this.f12709b.mo14551f();
        }

        public int getChangingConfigurations() {
            return this.f12708a;
        }

        /* renamed from: h */
        public boolean mo14565h(int[] iArr) {
            boolean g = this.f12709b.mo14552g(iArr);
            this.f12718k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo14566i() {
            this.f12714g = this.f12710c;
            this.f12715h = this.f12711d;
            this.f12716i = this.f12709b.getRootAlpha();
            this.f12717j = this.f12712e;
            this.f12718k = false;
        }

        /* renamed from: j */
        public void mo14567j(int i, int i2) {
            this.f12713f.eraseColor(0);
            this.f12709b.mo14550b(new Canvas(this.f12713f), i, i2, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new C4247i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C4247i(this);
        }

        public C4255h() {
            this.f12710c = null;
            this.f12711d = C4247i.f12653p;
            this.f12709b = new C4254g();
        }
    }

    C4247i() {
        this.f12658l = true;
        this.f12659m = new float[9];
        this.f12660n = new Matrix();
        this.f12661o = new Rect();
        this.f12654h = new C4255h();
    }

    /* renamed from: a */
    static int m18659a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p082e.p154x.p155a.p156a.C4247i m18660b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            e.x.a.a.i r0 = new e.x.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.p003d.C0524f.m3225f(r6, r7, r8)
            r0.f12652g = r6
            e.x.a.a.i$i r6 = new e.x.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f12652g
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            e.x.a.a.i r6 = m18661c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004c
        L_0x0048:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p154x.p155a.p156a.C4247i.m18660b(android.content.res.Resources, int, android.content.res.Resources$Theme):e.x.a.a.i");
    }

    /* renamed from: c */
    public static C4247i m18661c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C4247i iVar = new C4247i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: e */
    private void m18662e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C4255h hVar = this.f12654h;
        C4254g gVar = hVar.f12709b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f12699h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C4251d dVar = (C4251d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C4250c cVar = new C4250c();
                    cVar.mo14512g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12675b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f12707p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f12708a = cVar.f12690d | hVar.f12708a;
                } else if ("clip-path".equals(name)) {
                    C4249b bVar = new C4249b();
                    bVar.mo14509e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12675b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f12707p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f12708a = bVar.f12690d | hVar.f12708a;
                } else if ("group".equals(name)) {
                    C4251d dVar2 = new C4251d();
                    dVar2.mo14529c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12675b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f12707p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f12708a = dVar2.f12684k | hVar.f12708a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m18663f() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || C0534a.m3280f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m18664g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m18665i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C4255h hVar = this.f12654h;
        C4254g gVar = hVar.f12709b;
        hVar.f12711d = m18664g(C0533g.m3248g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c = C0533g.m3244c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c != null) {
            hVar.f12710c = c;
        }
        hVar.f12712e = C0533g.m3242a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f12712e);
        gVar.f12702k = C0533g.m3247f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f12702k);
        float f = C0533g.m3247f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f12703l);
        gVar.f12703l = f;
        if (gVar.f12702k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f > 0.0f) {
            gVar.f12700i = typedArray.getDimension(3, gVar.f12700i);
            float dimension = typedArray.getDimension(2, gVar.f12701j);
            gVar.f12701j = dimension;
            if (gVar.f12700i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C0533g.m3247f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f12705n = string;
                    gVar.f12707p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f12652g;
        if (drawable == null) {
            return false;
        }
        C0534a.m3276b(drawable);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo14483d(String str) {
        return this.f12654h.f12709b.f12707p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f12661o);
        if (this.f12661o.width() > 0 && this.f12661o.height() > 0) {
            ColorFilter colorFilter = this.f12656j;
            if (colorFilter == null) {
                colorFilter = this.f12655i;
            }
            canvas.getMatrix(this.f12660n);
            this.f12660n.getValues(this.f12659m);
            float abs = Math.abs(this.f12659m[0]);
            float abs2 = Math.abs(this.f12659m[4]);
            float abs3 = Math.abs(this.f12659m[1]);
            float abs4 = Math.abs(this.f12659m[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f12661o.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f12661o.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f12661o;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m18663f()) {
                    canvas.translate((float) this.f12661o.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f12661o.offsetTo(0, 0);
                this.f12654h.mo14559c(min, min2);
                if (!this.f12658l) {
                    this.f12654h.mo14567j(min, min2);
                } else if (!this.f12654h.mo14558b()) {
                    this.f12654h.mo14567j(min, min2);
                    this.f12654h.mo14566i();
                }
                this.f12654h.mo14560d(canvas, colorFilter, this.f12661o);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return C0534a.m3278d(drawable);
        }
        return this.f12654h.f12709b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f12654h.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return C0534a.m3279e(drawable);
        }
        return this.f12656j;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f12652g != null && Build.VERSION.SDK_INT >= 24) {
            return new C4256i(this.f12652g.getConstantState());
        }
        this.f12654h.f12708a = getChangingConfigurations();
        return this.f12654h;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f12654h.f12709b.f12701j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f12654h.f12709b.f12700i;
    }

    public int getOpacity() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14492h(boolean z) {
        this.f12658l = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return C0534a.m3282h(drawable);
        }
        return this.f12654h.f12712e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f12654h.f12710c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f12654h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f12652g
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            e.x.a.a.i$h r0 = r1.f12654h
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo14563g()
            if (r0 != 0) goto L_0x0028
            e.x.a.a.i$h r0 = r1.f12654h
            android.content.res.ColorStateList r0 = r0.f12710c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p154x.p155a.p156a.C4247i.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public PorterDuffColorFilter mo14498j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public Drawable mutate() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f12657k && super.mutate() == this) {
            this.f12654h = new C4255h(this.f12654h);
            this.f12657k = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C4255h hVar = this.f12654h;
        ColorStateList colorStateList = hVar.f12710c;
        if (!(colorStateList == null || (mode = hVar.f12711d) == null)) {
            this.f12655i = mo14498j(this.f12655i, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo14563g() || !hVar.mo14565h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f12654h.f12709b.getRootAlpha() != i) {
            this.f12654h.f12709b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3284j(drawable, z);
        } else {
            this.f12654h.f12712e = z;
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3288n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3289o(drawable, colorStateList);
            return;
        }
        C4255h hVar = this.f12654h;
        if (hVar.f12710c != colorStateList) {
            hVar.f12710c = colorStateList;
            this.f12655i = mo14498j(this.f12655i, colorStateList, hVar.f12711d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3290p(drawable, mode);
            return;
        }
        C4255h hVar = this.f12654h;
        if (hVar.f12711d != mode) {
            hVar.f12711d = mode;
            this.f12655i = mo14498j(this.f12655i, hVar.f12710c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: e.x.a.a.i$i */
    /* compiled from: VectorDrawableCompat */
    private static class C4256i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f12720a;

        public C4256i(Drawable.ConstantState constantState) {
            this.f12720a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f12720a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f12720a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C4247i iVar = new C4247i();
            iVar.f12652g = (VectorDrawable) this.f12720a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C4247i iVar = new C4247i();
            iVar.f12652g = (VectorDrawable) this.f12720a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C4247i iVar = new C4247i();
            iVar.f12652g = (VectorDrawable) this.f12720a.newDrawable(resources, theme);
            return iVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f12656j = colorFilter;
        invalidateSelf();
    }

    /* renamed from: e.x.a.a.i$f */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C4253f extends C4252e {

        /* renamed from: a */
        protected C3623c.C3625b[] f12687a = null;

        /* renamed from: b */
        String f12688b;

        /* renamed from: c */
        int f12689c = 0;

        /* renamed from: d */
        int f12690d;

        public C4253f() {
            super();
        }

        /* renamed from: c */
        public boolean mo14508c() {
            return false;
        }

        /* renamed from: d */
        public void mo14546d(Path path) {
            path.reset();
            C3623c.C3625b[] bVarArr = this.f12687a;
            if (bVarArr != null) {
                C3623c.C3625b.m15614e(bVarArr, path);
            }
        }

        public C3623c.C3625b[] getPathData() {
            return this.f12687a;
        }

        public String getPathName() {
            return this.f12688b;
        }

        public void setPathData(C3623c.C3625b[] bVarArr) {
            if (!C3623c.m15602b(this.f12687a, bVarArr)) {
                this.f12687a = C3623c.m15606f(bVarArr);
            } else {
                C3623c.m15610j(this.f12687a, bVarArr);
            }
        }

        public C4253f(C4253f fVar) {
            super();
            this.f12688b = fVar.f12688b;
            this.f12690d = fVar.f12690d;
            this.f12687a = C3623c.m15606f(fVar.f12687a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3281g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C4255h hVar = this.f12654h;
        hVar.f12709b = new C4254g();
        TypedArray k = C0533g.m3252k(resources, theme, attributeSet, C4235a.f12625a);
        m18665i(k, xmlPullParser, theme);
        k.recycle();
        hVar.f12708a = getChangingConfigurations();
        hVar.f12718k = true;
        m18662e(resources, xmlPullParser, attributeSet, theme);
        this.f12655i = mo14498j(this.f12655i, hVar.f12710c, hVar.f12711d);
    }

    C4247i(C4255h hVar) {
        this.f12658l = true;
        this.f12659m = new float[9];
        this.f12660n = new Matrix();
        this.f12661o = new Rect();
        this.f12654h = hVar;
        this.f12655i = mo14498j(this.f12655i, hVar.f12710c, hVar.f12711d);
    }

    /* renamed from: e.x.a.a.i$c */
    /* compiled from: VectorDrawableCompat */
    private static class C4250c extends C4253f {

        /* renamed from: e */
        private int[] f12662e;

        /* renamed from: f */
        C0515b f12663f;

        /* renamed from: g */
        float f12664g = 0.0f;

        /* renamed from: h */
        C0515b f12665h;

        /* renamed from: i */
        float f12666i = 1.0f;

        /* renamed from: j */
        float f12667j = 1.0f;

        /* renamed from: k */
        float f12668k = 0.0f;

        /* renamed from: l */
        float f12669l = 1.0f;

        /* renamed from: m */
        float f12670m = 0.0f;

        /* renamed from: n */
        Paint.Cap f12671n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f12672o = Paint.Join.MITER;

        /* renamed from: p */
        float f12673p = 4.0f;

        C4250c() {
        }

        /* renamed from: e */
        private Paint.Cap m18672e(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        /* renamed from: f */
        private Paint.Join m18673f(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        /* renamed from: h */
        private void m18674h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f12662e = null;
            if (C0533g.m3251j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f12688b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f12687a = C3623c.m15604d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f12665h = C0533g.m3246e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f12667j = C0533g.m3247f(typedArray, xmlPullParser, "fillAlpha", 12, this.f12667j);
                this.f12671n = m18672e(C0533g.m3248g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f12671n);
                this.f12672o = m18673f(C0533g.m3248g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f12672o);
                this.f12673p = C0533g.m3247f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f12673p);
                this.f12663f = C0533g.m3246e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f12666i = C0533g.m3247f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f12666i);
                this.f12664g = C0533g.m3247f(typedArray, xmlPullParser, "strokeWidth", 4, this.f12664g);
                this.f12669l = C0533g.m3247f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f12669l);
                this.f12670m = C0533g.m3247f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f12670m);
                this.f12668k = C0533g.m3247f(typedArray, xmlPullParser, "trimPathStart", 5, this.f12668k);
                this.f12689c = C0533g.m3248g(typedArray, xmlPullParser, "fillType", 13, this.f12689c);
            }
        }

        /* renamed from: a */
        public boolean mo14510a() {
            return this.f12665h.mo3272i() || this.f12663f.mo3272i();
        }

        /* renamed from: b */
        public boolean mo14511b(int[] iArr) {
            return this.f12663f.mo3273j(iArr) | this.f12665h.mo3273j(iArr);
        }

        /* renamed from: g */
        public void mo14512g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C0533g.m3252k(resources, theme, attributeSet, C4235a.f12627c);
            m18674h(k, xmlPullParser, theme);
            k.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f12667j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f12665h.mo3269e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f12666i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f12663f.mo3269e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f12664g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f12669l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f12670m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f12668k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f12667j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f12665h.mo3274k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f12666i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f12663f.mo3274k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f12664g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f12669l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f12670m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f12668k = f;
        }

        C4250c(C4250c cVar) {
            super(cVar);
            this.f12662e = cVar.f12662e;
            this.f12663f = cVar.f12663f;
            this.f12664g = cVar.f12664g;
            this.f12666i = cVar.f12666i;
            this.f12665h = cVar.f12665h;
            this.f12689c = cVar.f12689c;
            this.f12667j = cVar.f12667j;
            this.f12668k = cVar.f12668k;
            this.f12669l = cVar.f12669l;
            this.f12670m = cVar.f12670m;
            this.f12671n = cVar.f12671n;
            this.f12672o = cVar.f12672o;
            this.f12673p = cVar.f12673p;
        }
    }

    /* renamed from: e.x.a.a.i$g */
    /* compiled from: VectorDrawableCompat */
    private static class C4254g {

        /* renamed from: q */
        private static final Matrix f12691q = new Matrix();

        /* renamed from: a */
        private final Path f12692a;

        /* renamed from: b */
        private final Path f12693b;

        /* renamed from: c */
        private final Matrix f12694c;

        /* renamed from: d */
        Paint f12695d;

        /* renamed from: e */
        Paint f12696e;

        /* renamed from: f */
        private PathMeasure f12697f;

        /* renamed from: g */
        private int f12698g;

        /* renamed from: h */
        final C4251d f12699h;

        /* renamed from: i */
        float f12700i;

        /* renamed from: j */
        float f12701j;

        /* renamed from: k */
        float f12702k;

        /* renamed from: l */
        float f12703l;

        /* renamed from: m */
        int f12704m;

        /* renamed from: n */
        String f12705n;

        /* renamed from: o */
        Boolean f12706o;

        /* renamed from: p */
        final C3465a<String, Object> f12707p;

        public C4254g() {
            this.f12694c = new Matrix();
            this.f12700i = 0.0f;
            this.f12701j = 0.0f;
            this.f12702k = 0.0f;
            this.f12703l = 0.0f;
            this.f12704m = 255;
            this.f12705n = null;
            this.f12706o = null;
            this.f12707p = new C3465a<>();
            this.f12699h = new C4251d();
            this.f12692a = new Path();
            this.f12693b = new Path();
        }

        /* renamed from: a */
        private static float m18687a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m18688c(C4251d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f12674a.set(matrix);
            dVar.f12674a.preConcat(dVar.f12683j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f12675b.size(); i3++) {
                C4252e eVar = dVar.f12675b.get(i3);
                if (eVar instanceof C4251d) {
                    m18688c((C4251d) eVar, dVar.f12674a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C4253f) {
                    m18689d(dVar, (C4253f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m18689d(C4251d dVar, C4253f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f12702k;
            float f2 = ((float) i2) / this.f12703l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f12674a;
            this.f12694c.set(matrix);
            this.f12694c.postScale(f, f2);
            float e = m18690e(matrix);
            if (e != 0.0f) {
                fVar.mo14546d(this.f12692a);
                Path path = this.f12692a;
                this.f12693b.reset();
                if (fVar.mo14508c()) {
                    this.f12693b.setFillType(fVar.f12689c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f12693b.addPath(path, this.f12694c);
                    canvas.clipPath(this.f12693b);
                    return;
                }
                C4250c cVar = (C4250c) fVar;
                float f3 = cVar.f12668k;
                if (!(f3 == 0.0f && cVar.f12669l == 1.0f)) {
                    float f4 = cVar.f12670m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f12669l + f4) % 1.0f;
                    if (this.f12697f == null) {
                        this.f12697f = new PathMeasure();
                    }
                    this.f12697f.setPath(this.f12692a, false);
                    float length = this.f12697f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f12697f.getSegment(f7, length, path, true);
                        this.f12697f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f12697f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f12693b.addPath(path, this.f12694c);
                if (cVar.f12665h.mo3275l()) {
                    C0515b bVar = cVar.f12665h;
                    if (this.f12696e == null) {
                        Paint paint = new Paint(1);
                        this.f12696e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f12696e;
                    if (bVar.mo3271h()) {
                        Shader f9 = bVar.mo3270f();
                        f9.setLocalMatrix(this.f12694c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f12667j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C4247i.m18659a(bVar.mo3269e(), cVar.f12667j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f12693b.setFillType(cVar.f12689c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f12693b, paint2);
                }
                if (cVar.f12663f.mo3275l()) {
                    C0515b bVar2 = cVar.f12663f;
                    if (this.f12695d == null) {
                        Paint paint3 = new Paint(1);
                        this.f12695d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f12695d;
                    Paint.Join join = cVar.f12672o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f12671n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f12673p);
                    if (bVar2.mo3271h()) {
                        Shader f10 = bVar2.mo3270f();
                        f10.setLocalMatrix(this.f12694c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f12666i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(C4247i.m18659a(bVar2.mo3269e(), cVar.f12666i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f12664g * min * e);
                    canvas.drawPath(this.f12693b, paint4);
                }
            }
        }

        /* renamed from: e */
        private float m18690e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m18687a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void mo14550b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m18688c(this.f12699h, f12691q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo14551f() {
            if (this.f12706o == null) {
                this.f12706o = Boolean.valueOf(this.f12699h.mo14510a());
            }
            return this.f12706o.booleanValue();
        }

        /* renamed from: g */
        public boolean mo14552g(int[] iArr) {
            return this.f12699h.mo14511b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f12704m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f12704m = i;
        }

        public C4254g(C4254g gVar) {
            this.f12694c = new Matrix();
            this.f12700i = 0.0f;
            this.f12701j = 0.0f;
            this.f12702k = 0.0f;
            this.f12703l = 0.0f;
            this.f12704m = 255;
            this.f12705n = null;
            this.f12706o = null;
            C3465a<String, Object> aVar = new C3465a<>();
            this.f12707p = aVar;
            this.f12699h = new C4251d(gVar.f12699h, aVar);
            this.f12692a = new Path(gVar.f12692a);
            this.f12693b = new Path(gVar.f12693b);
            this.f12700i = gVar.f12700i;
            this.f12701j = gVar.f12701j;
            this.f12702k = gVar.f12702k;
            this.f12703l = gVar.f12703l;
            this.f12698g = gVar.f12698g;
            this.f12704m = gVar.f12704m;
            this.f12705n = gVar.f12705n;
            String str = gVar.f12705n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f12706o = gVar.f12706o;
        }
    }

    /* renamed from: e.x.a.a.i$d */
    /* compiled from: VectorDrawableCompat */
    private static class C4251d extends C4252e {

        /* renamed from: a */
        final Matrix f12674a;

        /* renamed from: b */
        final ArrayList<C4252e> f12675b;

        /* renamed from: c */
        float f12676c;

        /* renamed from: d */
        private float f12677d;

        /* renamed from: e */
        private float f12678e;

        /* renamed from: f */
        private float f12679f;

        /* renamed from: g */
        private float f12680g;

        /* renamed from: h */
        private float f12681h;

        /* renamed from: i */
        private float f12682i;

        /* renamed from: j */
        final Matrix f12683j;

        /* renamed from: k */
        int f12684k;

        /* renamed from: l */
        private int[] f12685l;

        /* renamed from: m */
        private String f12686m;

        public C4251d(C4251d dVar, C3465a<String, Object> aVar) {
            super();
            C4253f fVar;
            this.f12674a = new Matrix();
            this.f12675b = new ArrayList<>();
            this.f12676c = 0.0f;
            this.f12677d = 0.0f;
            this.f12678e = 0.0f;
            this.f12679f = 1.0f;
            this.f12680g = 1.0f;
            this.f12681h = 0.0f;
            this.f12682i = 0.0f;
            Matrix matrix = new Matrix();
            this.f12683j = matrix;
            this.f12686m = null;
            this.f12676c = dVar.f12676c;
            this.f12677d = dVar.f12677d;
            this.f12678e = dVar.f12678e;
            this.f12679f = dVar.f12679f;
            this.f12680g = dVar.f12680g;
            this.f12681h = dVar.f12681h;
            this.f12682i = dVar.f12682i;
            this.f12685l = dVar.f12685l;
            String str = dVar.f12686m;
            this.f12686m = str;
            this.f12684k = dVar.f12684k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f12683j);
            ArrayList<C4252e> arrayList = dVar.f12675b;
            for (int i = 0; i < arrayList.size(); i++) {
                C4252e eVar = arrayList.get(i);
                if (eVar instanceof C4251d) {
                    this.f12675b.add(new C4251d((C4251d) eVar, aVar));
                } else {
                    if (eVar instanceof C4250c) {
                        fVar = new C4250c((C4250c) eVar);
                    } else if (eVar instanceof C4249b) {
                        fVar = new C4249b((C4249b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f12675b.add(fVar);
                    String str2 = fVar.f12688b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m18678d() {
            this.f12683j.reset();
            this.f12683j.postTranslate(-this.f12677d, -this.f12678e);
            this.f12683j.postScale(this.f12679f, this.f12680g);
            this.f12683j.postRotate(this.f12676c, 0.0f, 0.0f);
            this.f12683j.postTranslate(this.f12681h + this.f12677d, this.f12682i + this.f12678e);
        }

        /* renamed from: e */
        private void m18679e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f12685l = null;
            this.f12676c = C0533g.m3247f(typedArray, xmlPullParser, "rotation", 5, this.f12676c);
            this.f12677d = typedArray.getFloat(1, this.f12677d);
            this.f12678e = typedArray.getFloat(2, this.f12678e);
            this.f12679f = C0533g.m3247f(typedArray, xmlPullParser, "scaleX", 3, this.f12679f);
            this.f12680g = C0533g.m3247f(typedArray, xmlPullParser, "scaleY", 4, this.f12680g);
            this.f12681h = C0533g.m3247f(typedArray, xmlPullParser, "translateX", 6, this.f12681h);
            this.f12682i = C0533g.m3247f(typedArray, xmlPullParser, "translateY", 7, this.f12682i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f12686m = string;
            }
            m18678d();
        }

        /* renamed from: a */
        public boolean mo14510a() {
            for (int i = 0; i < this.f12675b.size(); i++) {
                if (this.f12675b.get(i).mo14510a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo14511b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f12675b.size(); i++) {
                z |= this.f12675b.get(i).mo14511b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo14529c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C0533g.m3252k(resources, theme, attributeSet, C4235a.f12626b);
            m18679e(k, xmlPullParser);
            k.recycle();
        }

        public String getGroupName() {
            return this.f12686m;
        }

        public Matrix getLocalMatrix() {
            return this.f12683j;
        }

        public float getPivotX() {
            return this.f12677d;
        }

        public float getPivotY() {
            return this.f12678e;
        }

        public float getRotation() {
            return this.f12676c;
        }

        public float getScaleX() {
            return this.f12679f;
        }

        public float getScaleY() {
            return this.f12680g;
        }

        public float getTranslateX() {
            return this.f12681h;
        }

        public float getTranslateY() {
            return this.f12682i;
        }

        public void setPivotX(float f) {
            if (f != this.f12677d) {
                this.f12677d = f;
                m18678d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f12678e) {
                this.f12678e = f;
                m18678d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f12676c) {
                this.f12676c = f;
                m18678d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f12679f) {
                this.f12679f = f;
                m18678d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f12680g) {
                this.f12680g = f;
                m18678d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f12681h) {
                this.f12681h = f;
                m18678d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f12682i) {
                this.f12682i = f;
                m18678d();
            }
        }

        public C4251d() {
            super();
            this.f12674a = new Matrix();
            this.f12675b = new ArrayList<>();
            this.f12676c = 0.0f;
            this.f12677d = 0.0f;
            this.f12678e = 0.0f;
            this.f12679f = 1.0f;
            this.f12680g = 1.0f;
            this.f12681h = 0.0f;
            this.f12682i = 0.0f;
            this.f12683j = new Matrix();
            this.f12686m = null;
        }
    }
}
