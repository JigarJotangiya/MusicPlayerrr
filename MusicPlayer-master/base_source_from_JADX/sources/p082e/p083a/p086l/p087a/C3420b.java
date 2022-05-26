package p082e.p083a.p086l.p087a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0534a;

/* renamed from: e.a.l.a.b */
/* compiled from: DrawableContainer */
class C3420b extends Drawable implements Drawable.Callback {

    /* renamed from: g */
    private C3423c f10831g;

    /* renamed from: h */
    private Rect f10832h;

    /* renamed from: i */
    private Drawable f10833i;

    /* renamed from: j */
    private Drawable f10834j;

    /* renamed from: k */
    private int f10835k = 255;

    /* renamed from: l */
    private boolean f10836l;

    /* renamed from: m */
    private int f10837m = -1;

    /* renamed from: n */
    private boolean f10838n;

    /* renamed from: o */
    private Runnable f10839o;

    /* renamed from: p */
    private long f10840p;

    /* renamed from: q */
    private long f10841q;

    /* renamed from: r */
    private C3422b f10842r;

    /* renamed from: e.a.l.a.b$a */
    /* compiled from: DrawableContainer */
    class C3421a implements Runnable {
        C3421a() {
        }

        public void run() {
            C3420b.this.mo12048a(true);
            C3420b.this.invalidateSelf();
        }
    }

    /* renamed from: e.a.l.a.b$b */
    /* compiled from: DrawableContainer */
    static class C3422b implements Drawable.Callback {

        /* renamed from: g */
        private Drawable.Callback f10844g;

        C3422b() {
        }

        /* renamed from: a */
        public Drawable.Callback mo12083a() {
            Drawable.Callback callback = this.f10844g;
            this.f10844g = null;
            return callback;
        }

        /* renamed from: b */
        public C3422b mo12084b(Drawable.Callback callback) {
            this.f10844g = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f10844g;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f10844g;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: e.a.l.a.b$c */
    /* compiled from: DrawableContainer */
    static abstract class C3423c extends Drawable.ConstantState {

        /* renamed from: A */
        int f10845A;

        /* renamed from: B */
        int f10846B;

        /* renamed from: C */
        boolean f10847C;

        /* renamed from: D */
        ColorFilter f10848D;

        /* renamed from: E */
        boolean f10849E;

        /* renamed from: F */
        ColorStateList f10850F;

        /* renamed from: G */
        PorterDuff.Mode f10851G;

        /* renamed from: H */
        boolean f10852H;

        /* renamed from: I */
        boolean f10853I;

        /* renamed from: a */
        final C3420b f10854a;

        /* renamed from: b */
        Resources f10855b;

        /* renamed from: c */
        int f10856c = 160;

        /* renamed from: d */
        int f10857d;

        /* renamed from: e */
        int f10858e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f10859f;

        /* renamed from: g */
        Drawable[] f10860g;

        /* renamed from: h */
        int f10861h;

        /* renamed from: i */
        boolean f10862i;

        /* renamed from: j */
        boolean f10863j;

        /* renamed from: k */
        Rect f10864k;

        /* renamed from: l */
        boolean f10865l;

        /* renamed from: m */
        boolean f10866m;

        /* renamed from: n */
        int f10867n;

        /* renamed from: o */
        int f10868o;

        /* renamed from: p */
        int f10869p;

        /* renamed from: q */
        int f10870q;

        /* renamed from: r */
        boolean f10871r;

        /* renamed from: s */
        int f10872s;

        /* renamed from: t */
        boolean f10873t;

        /* renamed from: u */
        boolean f10874u;

        /* renamed from: v */
        boolean f10875v;

        /* renamed from: w */
        boolean f10876w;

        /* renamed from: x */
        boolean f10877x;

        /* renamed from: y */
        boolean f10878y;

        /* renamed from: z */
        int f10879z;

        C3423c(C3423c cVar, C3420b bVar, Resources resources) {
            Resources resources2;
            this.f10862i = false;
            this.f10865l = false;
            this.f10877x = true;
            this.f10845A = 0;
            this.f10846B = 0;
            this.f10854a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.f10855b : null;
            }
            this.f10855b = resources2;
            int f = C3420b.m14584f(resources, cVar != null ? cVar.f10856c : 0);
            this.f10856c = f;
            if (cVar != null) {
                this.f10857d = cVar.f10857d;
                this.f10858e = cVar.f10858e;
                this.f10875v = true;
                this.f10876w = true;
                this.f10862i = cVar.f10862i;
                this.f10865l = cVar.f10865l;
                this.f10877x = cVar.f10877x;
                this.f10878y = cVar.f10878y;
                this.f10879z = cVar.f10879z;
                this.f10845A = cVar.f10845A;
                this.f10846B = cVar.f10846B;
                this.f10847C = cVar.f10847C;
                this.f10848D = cVar.f10848D;
                this.f10849E = cVar.f10849E;
                this.f10850F = cVar.f10850F;
                this.f10851G = cVar.f10851G;
                this.f10852H = cVar.f10852H;
                this.f10853I = cVar.f10853I;
                if (cVar.f10856c == f) {
                    if (cVar.f10863j) {
                        this.f10864k = new Rect(cVar.f10864k);
                        this.f10863j = true;
                    }
                    if (cVar.f10866m) {
                        this.f10867n = cVar.f10867n;
                        this.f10868o = cVar.f10868o;
                        this.f10869p = cVar.f10869p;
                        this.f10870q = cVar.f10870q;
                        this.f10866m = true;
                    }
                }
                if (cVar.f10871r) {
                    this.f10872s = cVar.f10872s;
                    this.f10871r = true;
                }
                if (cVar.f10873t) {
                    this.f10874u = cVar.f10874u;
                    this.f10873t = true;
                }
                Drawable[] drawableArr = cVar.f10860g;
                this.f10860g = new Drawable[drawableArr.length];
                this.f10861h = cVar.f10861h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f10859f;
                if (sparseArray != null) {
                    this.f10859f = sparseArray.clone();
                } else {
                    this.f10859f = new SparseArray<>(this.f10861h);
                }
                int i = this.f10861h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f10859f.put(i2, constantState);
                        } else {
                            this.f10860g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f10860g = new Drawable[10];
            this.f10861h = 0;
        }

        /* renamed from: e */
        private void m14593e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f10859f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f10860g[this.f10859f.keyAt(i)] = m14594s(this.f10859f.valueAt(i).newDrawable(this.f10855b));
                }
                this.f10859f = null;
            }
        }

        /* renamed from: s */
        private Drawable m14594s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f10879z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f10854a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo12088a(Drawable drawable) {
            int i = this.f10861h;
            if (i >= this.f10860g.length) {
                mo12103o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f10854a);
            this.f10860g[i] = drawable;
            this.f10861h++;
            this.f10858e = drawable.getChangingConfigurations() | this.f10858e;
            mo12104p();
            this.f10864k = null;
            this.f10863j = false;
            this.f10866m = false;
            this.f10875v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo12089b(Resources.Theme theme) {
            if (theme != null) {
                m14593e();
                int i = this.f10861h;
                Drawable[] drawableArr = this.f10860g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f10858e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo12111y(theme.getResources());
            }
        }

        /* renamed from: c */
        public synchronized boolean mo12090c() {
            if (this.f10875v) {
                return this.f10876w;
            }
            m14593e();
            this.f10875v = true;
            int i = this.f10861h;
            Drawable[] drawableArr = this.f10860g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f10876w = false;
                    return false;
                }
            }
            this.f10876w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f10861h;
            Drawable[] drawableArr = this.f10860g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f10859f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo12092d() {
            this.f10866m = true;
            m14593e();
            int i = this.f10861h;
            Drawable[] drawableArr = this.f10860g;
            this.f10868o = -1;
            this.f10867n = -1;
            this.f10870q = 0;
            this.f10869p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f10867n) {
                    this.f10867n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f10868o) {
                    this.f10868o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f10869p) {
                    this.f10869p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f10870q) {
                    this.f10870q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo12093f() {
            return this.f10860g.length;
        }

        /* renamed from: g */
        public final Drawable mo12094g(int i) {
            int indexOfKey;
            Drawable drawable = this.f10860g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f10859f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m14594s(this.f10859f.valueAt(indexOfKey).newDrawable(this.f10855b));
            this.f10860g[i] = s;
            this.f10859f.removeAt(indexOfKey);
            if (this.f10859f.size() == 0) {
                this.f10859f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f10857d | this.f10858e;
        }

        /* renamed from: h */
        public final int mo12096h() {
            return this.f10861h;
        }

        /* renamed from: i */
        public final int mo12097i() {
            if (!this.f10866m) {
                mo12092d();
            }
            return this.f10868o;
        }

        /* renamed from: j */
        public final int mo12098j() {
            if (!this.f10866m) {
                mo12092d();
            }
            return this.f10870q;
        }

        /* renamed from: k */
        public final int mo12099k() {
            if (!this.f10866m) {
                mo12092d();
            }
            return this.f10869p;
        }

        /* renamed from: l */
        public final Rect mo12100l() {
            Rect rect = null;
            if (this.f10862i) {
                return null;
            }
            Rect rect2 = this.f10864k;
            if (rect2 != null || this.f10863j) {
                return rect2;
            }
            m14593e();
            Rect rect3 = new Rect();
            int i = this.f10861h;
            Drawable[] drawableArr = this.f10860g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f10863j = true;
            this.f10864k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo12101m() {
            if (!this.f10866m) {
                mo12092d();
            }
            return this.f10867n;
        }

        /* renamed from: n */
        public final int mo12102n() {
            if (this.f10871r) {
                return this.f10872s;
            }
            m14593e();
            int i = this.f10861h;
            Drawable[] drawableArr = this.f10860g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f10872s = opacity;
            this.f10871r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo12103o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f10860g, 0, drawableArr, 0, i);
            this.f10860g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo12104p() {
            this.f10871r = false;
            this.f10873t = false;
        }

        /* renamed from: q */
        public final boolean mo12105q() {
            return this.f10865l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo12042r();

        /* renamed from: t */
        public final void mo12106t(boolean z) {
            this.f10865l = z;
        }

        /* renamed from: u */
        public final void mo12107u(int i) {
            this.f10845A = i;
        }

        /* renamed from: v */
        public final void mo12108v(int i) {
            this.f10846B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final boolean mo12109w(int i, int i2) {
            int i3 = this.f10861h;
            Drawable[] drawableArr = this.f10860g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f10879z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo12110x(boolean z) {
            this.f10862i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo12111y(Resources resources) {
            if (resources != null) {
                this.f10855b = resources;
                int f = C3420b.m14584f(resources, this.f10856c);
                int i = this.f10856c;
                this.f10856c = f;
                if (i != f) {
                    this.f10866m = false;
                    this.f10863j = false;
                }
            }
        }
    }

    C3420b() {
    }

    /* renamed from: d */
    private void m14582d(Drawable drawable) {
        if (this.f10842r == null) {
            this.f10842r = new C3422b();
        }
        C3422b bVar = this.f10842r;
        bVar.mo12084b(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f10831g.f10845A <= 0 && this.f10836l) {
                drawable.setAlpha(this.f10835k);
            }
            C3423c cVar = this.f10831g;
            if (cVar.f10849E) {
                drawable.setColorFilter(cVar.f10848D);
            } else {
                if (cVar.f10852H) {
                    C0534a.m3289o(drawable, cVar.f10850F);
                }
                C3423c cVar2 = this.f10831g;
                if (cVar2.f10853I) {
                    C0534a.m3290p(drawable, cVar2.f10851G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f10831g.f10877x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                drawable.setAutoMirrored(this.f10831g.f10847C);
            }
            Rect rect = this.f10832h;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f10842r.mo12083a());
        }
    }

    /* renamed from: e */
    private boolean m14583e() {
        if (!isAutoMirrored() || C0534a.m3280f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    static int m14584f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12048a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f10836l = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f10833i
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f10840p
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f10835k
            r3.setAlpha(r9)
            r13.f10840p = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            e.a.l.a.b$c r9 = r13.f10831g
            int r9 = r9.f10845A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f10835k
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f10840p = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f10834j
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f10841q
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f10834j = r0
            r13.f10841q = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.a.l.a.b$c r4 = r13.f10831g
            int r4 = r4.f10846B
            int r3 = r3 / r4
            int r4 = r13.f10835k
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f10841q = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f10839o
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p083a.p086l.p087a.C3420b.mo12048a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f10831g.mo12089b(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3423c mo12021b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo12050c() {
        return this.f10837m;
    }

    public boolean canApplyTheme() {
        return this.f10831g.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f10833i;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f10834j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12053g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f10837m
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.a.l.a.b$c r0 = r9.f10831g
            int r0 = r0.f10846B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f10834j
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f10833i
            if (r0 == 0) goto L_0x0029
            r9.f10834j = r0
            e.a.l.a.b$c r0 = r9.f10831g
            int r0 = r0.f10846B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f10841q = r0
            goto L_0x0035
        L_0x0029:
            r9.f10834j = r4
            r9.f10841q = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f10833i
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            e.a.l.a.b$c r0 = r9.f10831g
            int r1 = r0.f10861h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo12094g(r10)
            r9.f10833i = r0
            r9.f10837m = r10
            if (r0 == 0) goto L_0x005a
            e.a.l.a.b$c r10 = r9.f10831g
            int r10 = r10.f10845A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f10840p = r2
        L_0x0051:
            r9.m14582d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f10833i = r4
            r10 = -1
            r9.f10837m = r10
        L_0x005a:
            long r0 = r9.f10840p
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f10841q
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f10839o
            if (r0 != 0) goto L_0x0073
            e.a.l.a.b$a r0 = new e.a.l.a.b$a
            r0.<init>()
            r9.f10839o = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo12048a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p083a.p086l.p087a.C3420b.mo12053g(int):boolean");
    }

    public int getAlpha() {
        return this.f10835k;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f10831g.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f10831g.mo12090c()) {
            return null;
        }
        this.f10831g.f10857d = getChangingConfigurations();
        return this.f10831g;
    }

    public Drawable getCurrent() {
        return this.f10833i;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f10832h;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f10831g.mo12105q()) {
            return this.f10831g.mo12097i();
        }
        Drawable drawable = this.f10833i;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f10831g.mo12105q()) {
            return this.f10831g.mo12101m();
        }
        Drawable drawable = this.f10833i;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f10831g.mo12105q()) {
            return this.f10831g.mo12098j();
        }
        Drawable drawable = this.f10833i;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f10831g.mo12105q()) {
            return this.f10831g.mo12099k();
        }
        Drawable drawable = this.f10833i;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f10833i;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f10831g.mo12102n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f10833i;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f10831g.mo12100l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f10833i;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (m14583e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo12022h(C3423c cVar) {
        this.f10831g = cVar;
        int i = this.f10837m;
        if (i >= 0) {
            Drawable g = cVar.mo12094g(i);
            this.f10833i = g;
            if (g != null) {
                m14582d(g);
            }
        }
        this.f10834j = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12066i(Resources resources) {
        this.f10831g.mo12111y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        C3423c cVar = this.f10831g;
        if (cVar != null) {
            cVar.mo12104p();
        }
        if (drawable == this.f10833i && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f10831g.f10847C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f10834j;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f10834j = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f10833i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f10836l) {
                this.f10833i.setAlpha(this.f10835k);
            }
        }
        if (this.f10841q != 0) {
            this.f10841q = 0;
            z = true;
        }
        if (this.f10840p != 0) {
            this.f10840p = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f10838n && super.mutate() == this) {
            C3423c b = mo12021b();
            b.mo12042r();
            mo12022h(b);
            this.f10838n = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10834j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f10833i;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f10831g.mo12109w(i, mo12050c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f10834j;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f10833i;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10834j;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f10833i;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f10833i && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f10836l || this.f10835k != i) {
            this.f10836l = true;
            this.f10835k = i;
            Drawable drawable = this.f10833i;
            if (drawable == null) {
                return;
            }
            if (this.f10840p == 0) {
                drawable.setAlpha(i);
            } else {
                mo12048a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C3423c cVar = this.f10831g;
        if (cVar.f10847C != z) {
            cVar.f10847C = z;
            Drawable drawable = this.f10833i;
            if (drawable != null) {
                C0534a.m3284j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C3423c cVar = this.f10831g;
        cVar.f10849E = true;
        if (cVar.f10848D != colorFilter) {
            cVar.f10848D = colorFilter;
            Drawable drawable = this.f10833i;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C3423c cVar = this.f10831g;
        if (cVar.f10877x != z) {
            cVar.f10877x = z;
            Drawable drawable = this.f10833i;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f10833i;
        if (drawable != null) {
            C0534a.m3285k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f10832h;
        if (rect == null) {
            this.f10832h = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f10833i;
        if (drawable != null) {
            C0534a.m3286l(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C3423c cVar = this.f10831g;
        cVar.f10852H = true;
        if (cVar.f10850F != colorStateList) {
            cVar.f10850F = colorStateList;
            C0534a.m3289o(this.f10833i, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C3423c cVar = this.f10831g;
        cVar.f10853I = true;
        if (cVar.f10851G != mode) {
            cVar.f10851G = mode;
            C0534a.m3290p(this.f10833i, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f10834j;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f10833i;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f10833i && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
