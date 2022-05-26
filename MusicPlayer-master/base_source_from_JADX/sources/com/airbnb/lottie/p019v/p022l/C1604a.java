package com.airbnb.lottie.p019v.p022l;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C1462c;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.p015t.C1505a;
import com.airbnb.lottie.p015t.p016b.C1510c;
import com.airbnb.lottie.p015t.p016b.C1512e;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1539d;
import com.airbnb.lottie.p015t.p017c.C1543h;
import com.airbnb.lottie.p015t.p017c.C1551p;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.C1561f;
import com.airbnb.lottie.p019v.p021k.C1579a;
import com.airbnb.lottie.p019v.p021k.C1586h;
import com.airbnb.lottie.p019v.p021k.C1594m;
import com.airbnb.lottie.p019v.p022l.C1610d;
import com.airbnb.lottie.p024x.C1646j;
import com.airbnb.lottie.p026y.C1679d;
import com.airbnb.lottie.p026y.C1683h;
import com.airbnb.lottie.p027z.C1690c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.l.a */
/* compiled from: BaseLayer */
public abstract class C1604a implements C1512e, C1529a.C1531b, C1561f {

    /* renamed from: A */
    BlurMaskFilter f6123A;

    /* renamed from: a */
    private final Path f6124a = new Path();

    /* renamed from: b */
    private final Matrix f6125b = new Matrix();

    /* renamed from: c */
    private final Paint f6126c = new C1505a(1);

    /* renamed from: d */
    private final Paint f6127d = new C1505a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e */
    private final Paint f6128e = new C1505a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f */
    private final Paint f6129f;

    /* renamed from: g */
    private final Paint f6130g;

    /* renamed from: h */
    private final RectF f6131h;

    /* renamed from: i */
    private final RectF f6132i;

    /* renamed from: j */
    private final RectF f6133j;

    /* renamed from: k */
    private final RectF f6134k;

    /* renamed from: l */
    private final String f6135l;

    /* renamed from: m */
    final Matrix f6136m;

    /* renamed from: n */
    final C1473f f6137n;

    /* renamed from: o */
    final C1610d f6138o;

    /* renamed from: p */
    private C1543h f6139p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1539d f6140q;

    /* renamed from: r */
    private C1604a f6141r;

    /* renamed from: s */
    private C1604a f6142s;

    /* renamed from: t */
    private List<C1604a> f6143t;

    /* renamed from: u */
    private final List<C1529a<?, ?>> f6144u;

    /* renamed from: v */
    final C1551p f6145v;

    /* renamed from: w */
    private boolean f6146w;

    /* renamed from: x */
    private boolean f6147x;

    /* renamed from: y */
    private Paint f6148y;

    /* renamed from: z */
    float f6149z;

    /* renamed from: com.airbnb.lottie.v.l.a$a */
    /* compiled from: BaseLayer */
    class C1605a implements C1529a.C1531b {
        C1605a() {
        }

        /* renamed from: a */
        public void mo7132a() {
            C1604a aVar = C1604a.this;
            aVar.m8137L(aVar.f6140q.mo7180p() == 1.0f);
        }
    }

    /* renamed from: com.airbnb.lottie.v.l.a$b */
    /* compiled from: BaseLayer */
    static /* synthetic */ class C1606b {

        /* renamed from: a */
        static final /* synthetic */ int[] f6151a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6152b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                com.airbnb.lottie.v.k.h$a[] r0 = com.airbnb.lottie.p019v.p021k.C1586h.C1587a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6152b = r0
                r1 = 1
                com.airbnb.lottie.v.k.h$a r2 = com.airbnb.lottie.p019v.p021k.C1586h.C1587a.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6152b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.v.k.h$a r3 = com.airbnb.lottie.p019v.p021k.C1586h.C1587a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6152b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.v.k.h$a r4 = com.airbnb.lottie.p019v.p021k.C1586h.C1587a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f6152b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.v.k.h$a r5 = com.airbnb.lottie.p019v.p021k.C1586h.C1587a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.airbnb.lottie.v.l.d$a[] r4 = com.airbnb.lottie.p019v.p022l.C1610d.C1611a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6151a = r4
                com.airbnb.lottie.v.l.d$a r5 = com.airbnb.lottie.p019v.p022l.C1610d.C1611a.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f6151a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.airbnb.lottie.v.l.d$a r4 = com.airbnb.lottie.p019v.p022l.C1610d.C1611a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f6151a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.airbnb.lottie.v.l.d$a r1 = com.airbnb.lottie.p019v.p022l.C1610d.C1611a.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f6151a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.airbnb.lottie.v.l.d$a r1 = com.airbnb.lottie.p019v.p022l.C1610d.C1611a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f6151a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.airbnb.lottie.v.l.d$a r1 = com.airbnb.lottie.p019v.p022l.C1610d.C1611a.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f6151a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.airbnb.lottie.v.l.d$a r1 = com.airbnb.lottie.p019v.p022l.C1610d.C1611a.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f6151a     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.airbnb.lottie.v.l.d$a r1 = com.airbnb.lottie.p019v.p022l.C1610d.C1611a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p019v.p022l.C1604a.C1606b.<clinit>():void");
        }
    }

    C1604a(C1473f fVar, C1610d dVar) {
        C1505a aVar = new C1505a(1);
        this.f6129f = aVar;
        this.f6130g = new C1505a(PorterDuff.Mode.CLEAR);
        this.f6131h = new RectF();
        this.f6132i = new RectF();
        this.f6133j = new RectF();
        this.f6134k = new RectF();
        this.f6136m = new Matrix();
        this.f6144u = new ArrayList();
        this.f6146w = true;
        this.f6149z = 0.0f;
        this.f6137n = fVar;
        this.f6138o = dVar;
        this.f6135l = dVar.mo7381i() + "#draw";
        if (dVar.mo7380h() == C1610d.C1612b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C1551p b = dVar.mo7396w().mo7250b();
        this.f6145v = b;
        b.mo7203b(this);
        if (dVar.mo7379g() != null && !dVar.mo7379g().isEmpty()) {
            C1543h hVar = new C1543h(dVar.mo7379g());
            this.f6139p = hVar;
            for (C1529a<C1594m, Path> a : hVar.mo7187a()) {
                a.mo7151a(this);
            }
            for (C1529a next : this.f6139p.mo7189c()) {
                mo7366i(next);
                next.mo7151a(this);
            }
        }
        m8138M();
    }

    /* renamed from: B */
    private void m8133B(RectF rectF, Matrix matrix) {
        this.f6132i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (mo7372z()) {
            int size = this.f6139p.mo7188b().size();
            int i = 0;
            while (i < size) {
                C1586h hVar = this.f6139p.mo7188b().get(i);
                this.f6124a.set((Path) this.f6139p.mo7187a().get(i).mo7157h());
                this.f6124a.transform(matrix);
                int i2 = C1606b.f6152b[hVar.mo7292a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if ((i2 != 3 && i2 != 4) || !hVar.mo7295d()) {
                        this.f6124a.computeBounds(this.f6134k, false);
                        if (i == 0) {
                            this.f6132i.set(this.f6134k);
                        } else {
                            RectF rectF2 = this.f6132i;
                            rectF2.set(Math.min(rectF2.left, this.f6134k.left), Math.min(this.f6132i.top, this.f6134k.top), Math.max(this.f6132i.right, this.f6134k.right), Math.max(this.f6132i.bottom, this.f6134k.bottom));
                        }
                        i++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.f6132i)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: C */
    private void m8134C(RectF rectF, Matrix matrix) {
        if (mo7359A() && this.f6138o.mo7380h() != C1610d.C1612b.INVERT) {
            this.f6133j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f6141r.mo7135d(this.f6133j, matrix, true);
            if (!rectF.intersect(this.f6133j)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: D */
    private void m8135D() {
        this.f6137n.invalidateSelf();
    }

    /* renamed from: E */
    private void m8136E(float f) {
        this.f6137n.mo7092q().mo7015n().mo7127a(this.f6138o.mo7381i(), f);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m8137L(boolean z) {
        if (z != this.f6146w) {
            this.f6146w = z;
            m8135D();
        }
    }

    /* renamed from: M */
    private void m8138M() {
        boolean z = true;
        if (!this.f6138o.mo7377e().isEmpty()) {
            C1539d dVar = new C1539d(this.f6138o.mo7377e());
            this.f6140q = dVar;
            dVar.mo7161l();
            this.f6140q.mo7151a(new C1605a());
            if (((Float) this.f6140q.mo7157h()).floatValue() != 1.0f) {
                z = false;
            }
            m8137L(z);
            mo7366i(this.f6140q);
            return;
        }
        m8137L(true);
    }

    /* renamed from: j */
    private void m8141j(Canvas canvas, Matrix matrix, C1586h hVar, C1529a<C1594m, Path> aVar, C1529a<Integer, Integer> aVar2) {
        this.f6124a.set(aVar.mo7157h());
        this.f6124a.transform(matrix);
        this.f6126c.setAlpha((int) (((float) aVar2.mo7157h().intValue()) * 2.55f));
        canvas.drawPath(this.f6124a, this.f6126c);
    }

    /* renamed from: k */
    private void m8142k(Canvas canvas, Matrix matrix, C1586h hVar, C1529a<C1594m, Path> aVar, C1529a<Integer, Integer> aVar2) {
        C1683h.m8467m(canvas, this.f6131h, this.f6127d);
        this.f6124a.set(aVar.mo7157h());
        this.f6124a.transform(matrix);
        this.f6126c.setAlpha((int) (((float) aVar2.mo7157h().intValue()) * 2.55f));
        canvas.drawPath(this.f6124a, this.f6126c);
        canvas.restore();
    }

    /* renamed from: l */
    private void m8143l(Canvas canvas, Matrix matrix, C1586h hVar, C1529a<C1594m, Path> aVar, C1529a<Integer, Integer> aVar2) {
        C1683h.m8467m(canvas, this.f6131h, this.f6126c);
        canvas.drawRect(this.f6131h, this.f6126c);
        this.f6124a.set(aVar.mo7157h());
        this.f6124a.transform(matrix);
        this.f6126c.setAlpha((int) (((float) aVar2.mo7157h().intValue()) * 2.55f));
        canvas.drawPath(this.f6124a, this.f6128e);
        canvas.restore();
    }

    /* renamed from: m */
    private void m8144m(Canvas canvas, Matrix matrix, C1586h hVar, C1529a<C1594m, Path> aVar, C1529a<Integer, Integer> aVar2) {
        C1683h.m8467m(canvas, this.f6131h, this.f6127d);
        canvas.drawRect(this.f6131h, this.f6126c);
        this.f6128e.setAlpha((int) (((float) aVar2.mo7157h().intValue()) * 2.55f));
        this.f6124a.set(aVar.mo7157h());
        this.f6124a.transform(matrix);
        canvas.drawPath(this.f6124a, this.f6128e);
        canvas.restore();
    }

    /* renamed from: n */
    private void m8145n(Canvas canvas, Matrix matrix, C1586h hVar, C1529a<C1594m, Path> aVar, C1529a<Integer, Integer> aVar2) {
        C1683h.m8467m(canvas, this.f6131h, this.f6128e);
        canvas.drawRect(this.f6131h, this.f6126c);
        this.f6128e.setAlpha((int) (((float) aVar2.mo7157h().intValue()) * 2.55f));
        this.f6124a.set(aVar.mo7157h());
        this.f6124a.transform(matrix);
        canvas.drawPath(this.f6124a, this.f6128e);
        canvas.restore();
    }

    /* renamed from: o */
    private void m8146o(Canvas canvas, Matrix matrix) {
        C1462c.m7603a("Layer#saveLayer");
        C1683h.m8468n(canvas, this.f6131h, this.f6127d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m8150s(canvas);
        }
        C1462c.m7604b("Layer#saveLayer");
        for (int i = 0; i < this.f6139p.mo7188b().size(); i++) {
            C1586h hVar = this.f6139p.mo7188b().get(i);
            C1529a aVar = this.f6139p.mo7187a().get(i);
            C1529a aVar2 = this.f6139p.mo7189c().get(i);
            int i2 = C1606b.f6152b[hVar.mo7292a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f6126c.setColor(-16777216);
                        this.f6126c.setAlpha(255);
                        canvas.drawRect(this.f6131h, this.f6126c);
                    }
                    if (hVar.mo7295d()) {
                        m8145n(canvas, matrix, hVar, aVar, aVar2);
                    } else {
                        m8147p(canvas, matrix, hVar, aVar, aVar2);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (hVar.mo7295d()) {
                            m8143l(canvas, matrix, hVar, aVar, aVar2);
                        } else {
                            m8141j(canvas, matrix, hVar, aVar, aVar2);
                        }
                    }
                } else if (hVar.mo7295d()) {
                    m8144m(canvas, matrix, hVar, aVar, aVar2);
                } else {
                    m8142k(canvas, matrix, hVar, aVar, aVar2);
                }
            } else if (m8148q()) {
                this.f6126c.setAlpha(255);
                canvas.drawRect(this.f6131h, this.f6126c);
            }
        }
        C1462c.m7603a("Layer#restoreLayer");
        canvas.restore();
        C1462c.m7604b("Layer#restoreLayer");
    }

    /* renamed from: p */
    private void m8147p(Canvas canvas, Matrix matrix, C1586h hVar, C1529a<C1594m, Path> aVar, C1529a<Integer, Integer> aVar2) {
        this.f6124a.set(aVar.mo7157h());
        this.f6124a.transform(matrix);
        canvas.drawPath(this.f6124a, this.f6128e);
    }

    /* renamed from: q */
    private boolean m8148q() {
        if (this.f6139p.mo7187a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f6139p.mo7188b().size(); i++) {
            if (this.f6139p.mo7188b().get(i).mo7292a() != C1586h.C1587a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private void m8149r() {
        if (this.f6143t == null) {
            if (this.f6142s == null) {
                this.f6143t = Collections.emptyList();
                return;
            }
            this.f6143t = new ArrayList();
            for (C1604a aVar = this.f6142s; aVar != null; aVar = aVar.f6142s) {
                this.f6143t.add(aVar);
            }
        }
    }

    /* renamed from: s */
    private void m8150s(Canvas canvas) {
        C1462c.m7603a("Layer#clearLayer");
        RectF rectF = this.f6131h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f6130g);
        C1462c.m7604b("Layer#clearLayer");
    }

    /* renamed from: u */
    static C1604a m8151u(C1607b bVar, C1610d dVar, C1473f fVar, C1464d dVar2) {
        switch (C1606b.f6151a[dVar.mo7378f().ordinal()]) {
            case 1:
                return new C1614f(fVar, dVar, bVar);
            case 2:
                return new C1607b(fVar, dVar, dVar2.mo7016o(dVar.mo7385m()), dVar2);
            case 3:
                return new C1615g(fVar, dVar);
            case 4:
                return new C1609c(fVar, dVar);
            case 5:
                return new C1613e(fVar, dVar);
            case 6:
                return new C1616h(fVar, dVar);
            default:
                C1679d.m8416c("Unknown layer type " + dVar.mo7378f());
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo7359A() {
        return this.f6141r != null;
    }

    /* renamed from: F */
    public void mo7360F(C1529a<?, ?> aVar) {
        this.f6144u.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo7361G(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo7362H(C1604a aVar) {
        this.f6141r = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo7363I(boolean z) {
        if (z && this.f6148y == null) {
            this.f6148y = new C1505a();
        }
        this.f6147x = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo7364J(C1604a aVar) {
        this.f6142s = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo7365K(float f) {
        this.f6145v.mo7210j(f);
        if (this.f6139p != null) {
            for (int i = 0; i < this.f6139p.mo7187a().size(); i++) {
                this.f6139p.mo7187a().get(i).mo7162m(f);
            }
        }
        C1539d dVar = this.f6140q;
        if (dVar != null) {
            dVar.mo7162m(f);
        }
        C1604a aVar = this.f6141r;
        if (aVar != null) {
            aVar.mo7365K(f);
        }
        for (int i2 = 0; i2 < this.f6144u.size(); i2++) {
            this.f6144u.get(i2).mo7162m(f);
        }
    }

    /* renamed from: a */
    public void mo7132a() {
        m8135D();
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
    }

    /* renamed from: c */
    public void mo7134c(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
        C1604a aVar = this.f6141r;
        if (aVar != null) {
            C1560e a = eVar2.mo7230a(aVar.getName());
            if (eVar.mo7231c(this.f6141r.getName(), i)) {
                list.add(a.mo7236i(this.f6141r));
            }
            if (eVar.mo7235h(getName(), i)) {
                this.f6141r.mo7361G(eVar, eVar.mo7233e(this.f6141r.getName(), i) + i, list, a);
            }
        }
        if (eVar.mo7234g(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo7230a(getName());
                if (eVar.mo7231c(getName(), i)) {
                    list.add(eVar2.mo7236i(this));
                }
            }
            if (eVar.mo7235h(getName(), i)) {
                mo7361G(eVar, i + eVar.mo7233e(getName(), i), list, eVar2);
            }
        }
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        this.f6131h.set(0.0f, 0.0f, 0.0f, 0.0f);
        m8149r();
        this.f6136m.set(matrix);
        if (z) {
            List<C1604a> list = this.f6143t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f6136m.preConcat(this.f6143t.get(size).f6145v.mo7206f());
                }
            } else {
                C1604a aVar = this.f6142s;
                if (aVar != null) {
                    this.f6136m.preConcat(aVar.f6145v.mo7206f());
                }
            }
        }
        this.f6136m.preConcat(this.f6145v.mo7206f());
    }

    /* renamed from: f */
    public void mo7136f(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        C1462c.m7603a(this.f6135l);
        if (!this.f6146w || this.f6138o.mo7397x()) {
            C1462c.m7604b(this.f6135l);
            return;
        }
        m8149r();
        C1462c.m7603a("Layer#parentMatrix");
        this.f6125b.reset();
        this.f6125b.set(matrix);
        for (int size = this.f6143t.size() - 1; size >= 0; size--) {
            this.f6125b.preConcat(this.f6143t.get(size).f6145v.mo7206f());
        }
        C1462c.m7604b("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (this.f6145v.mo7208h() == null ? 100 : this.f6145v.mo7208h().mo7157h().intValue()))) / 100.0f) * 255.0f);
        if (mo7359A() || mo7372z()) {
            C1462c.m7603a("Layer#computeBounds");
            mo7135d(this.f6131h, this.f6125b, false);
            m8134C(this.f6131h, matrix);
            this.f6125b.preConcat(this.f6145v.mo7206f());
            m8133B(this.f6131h, this.f6125b);
            if (!this.f6131h.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f6131h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C1462c.m7604b("Layer#computeBounds");
            if (this.f6131h.width() >= 1.0f && this.f6131h.height() >= 1.0f) {
                C1462c.m7603a("Layer#saveLayer");
                this.f6126c.setAlpha(255);
                C1683h.m8467m(canvas, this.f6131h, this.f6126c);
                C1462c.m7604b("Layer#saveLayer");
                m8150s(canvas);
                C1462c.m7603a("Layer#drawLayer");
                mo7367t(canvas, this.f6125b, intValue);
                C1462c.m7604b("Layer#drawLayer");
                if (mo7372z()) {
                    m8146o(canvas, this.f6125b);
                }
                if (mo7359A()) {
                    C1462c.m7603a("Layer#drawMatte");
                    C1462c.m7603a("Layer#saveLayer");
                    C1683h.m8468n(canvas, this.f6131h, this.f6129f, 19);
                    C1462c.m7604b("Layer#saveLayer");
                    m8150s(canvas);
                    this.f6141r.mo7136f(canvas, matrix, intValue);
                    C1462c.m7603a("Layer#restoreLayer");
                    canvas.restore();
                    C1462c.m7604b("Layer#restoreLayer");
                    C1462c.m7604b("Layer#drawMatte");
                }
                C1462c.m7603a("Layer#restoreLayer");
                canvas.restore();
                C1462c.m7604b("Layer#restoreLayer");
            }
            if (this.f6147x && (paint = this.f6148y) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f6148y.setColor(-251901);
                this.f6148y.setStrokeWidth(4.0f);
                canvas.drawRect(this.f6131h, this.f6148y);
                this.f6148y.setStyle(Paint.Style.FILL);
                this.f6148y.setColor(1357638635);
                canvas.drawRect(this.f6131h, this.f6148y);
            }
            m8136E(C1462c.m7604b(this.f6135l));
            return;
        }
        this.f6125b.preConcat(this.f6145v.mo7206f());
        C1462c.m7603a("Layer#drawLayer");
        mo7367t(canvas, this.f6125b, intValue);
        C1462c.m7604b("Layer#drawLayer");
        m8136E(C1462c.m7604b(this.f6135l));
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        this.f6145v.mo7204c(t, cVar);
    }

    public String getName() {
        return this.f6138o.mo7381i();
    }

    /* renamed from: i */
    public void mo7366i(C1529a<?, ?> aVar) {
        if (aVar != null) {
            this.f6144u.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo7367t(Canvas canvas, Matrix matrix, int i);

    /* renamed from: v */
    public C1579a mo7368v() {
        return this.f6138o.mo7373a();
    }

    /* renamed from: w */
    public BlurMaskFilter mo7369w(float f) {
        if (this.f6149z == f) {
            return this.f6123A;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f6123A = blurMaskFilter;
        this.f6149z = f;
        return blurMaskFilter;
    }

    /* renamed from: x */
    public C1646j mo7370x() {
        return this.f6138o.mo7375c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C1610d mo7371y() {
        return this.f6138o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo7372z() {
        C1543h hVar = this.f6139p;
        return hVar != null && !hVar.mo7187a().isEmpty();
    }
}
