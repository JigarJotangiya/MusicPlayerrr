package com.airbnb.lottie.p019v.p022l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.p016b.C1511d;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1550o;
import com.airbnb.lottie.p015t.p017c.C1552q;
import com.airbnb.lottie.p019v.C1556b;
import com.airbnb.lottie.p019v.C1558c;
import com.airbnb.lottie.p019v.C1559d;
import com.airbnb.lottie.p019v.p020j.C1565a;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1575k;
import com.airbnb.lottie.p019v.p021k.C1596o;
import com.airbnb.lottie.p026y.C1683h;
import com.airbnb.lottie.p027z.C1690c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p082e.p098e.C3470d;

/* renamed from: com.airbnb.lottie.v.l.h */
/* compiled from: TextLayer */
public class C1616h extends C1604a {

    /* renamed from: B */
    private final StringBuilder f6198B = new StringBuilder(2);

    /* renamed from: C */
    private final RectF f6199C = new RectF();

    /* renamed from: D */
    private final Matrix f6200D = new Matrix();

    /* renamed from: E */
    private final Paint f6201E = new C1617a(this, 1);

    /* renamed from: F */
    private final Paint f6202F = new C1618b(this, 1);

    /* renamed from: G */
    private final Map<C1559d, List<C1511d>> f6203G = new HashMap();

    /* renamed from: H */
    private final C3470d<String> f6204H = new C3470d<>();

    /* renamed from: I */
    private final C1550o f6205I;

    /* renamed from: J */
    private final C1473f f6206J;

    /* renamed from: K */
    private final C1464d f6207K;

    /* renamed from: L */
    private C1529a<Integer, Integer> f6208L;

    /* renamed from: M */
    private C1529a<Integer, Integer> f6209M;

    /* renamed from: N */
    private C1529a<Integer, Integer> f6210N;

    /* renamed from: O */
    private C1529a<Integer, Integer> f6211O;

    /* renamed from: P */
    private C1529a<Float, Float> f6212P;

    /* renamed from: Q */
    private C1529a<Float, Float> f6213Q;

    /* renamed from: R */
    private C1529a<Float, Float> f6214R;

    /* renamed from: S */
    private C1529a<Float, Float> f6215S;

    /* renamed from: T */
    private C1529a<Float, Float> f6216T;

    /* renamed from: U */
    private C1529a<Float, Float> f6217U;

    /* renamed from: V */
    private C1529a<Typeface, Typeface> f6218V;

    /* renamed from: com.airbnb.lottie.v.l.h$a */
    /* compiled from: TextLayer */
    class C1617a extends Paint {
        C1617a(C1616h hVar, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: com.airbnb.lottie.v.l.h$b */
    /* compiled from: TextLayer */
    class C1618b extends Paint {
        C1618b(C1616h hVar, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: com.airbnb.lottie.v.l.h$c */
    /* compiled from: TextLayer */
    static /* synthetic */ class C1619c {

        /* renamed from: a */
        static final /* synthetic */ int[] f6219a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.v.b$a[] r0 = com.airbnb.lottie.p019v.C1556b.C1557a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6219a = r0
                com.airbnb.lottie.v.b$a r1 = com.airbnb.lottie.p019v.C1556b.C1557a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6219a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.v.b$a r1 = com.airbnb.lottie.p019v.C1556b.C1557a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6219a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.v.b$a r1 = com.airbnb.lottie.p019v.C1556b.C1557a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p019v.p022l.C1616h.C1619c.<clinit>():void");
        }
    }

    C1616h(C1473f fVar, C1610d dVar) {
        super(fVar, dVar);
        C1566b bVar;
        C1566b bVar2;
        C1565a aVar;
        C1565a aVar2;
        this.f6206J = fVar;
        this.f6207K = dVar.mo7374b();
        C1550o d = dVar.mo7391s().mo7245a();
        this.f6205I = d;
        d.mo7151a(this);
        mo7366i(d);
        C1575k t = dVar.mo7392t();
        if (!(t == null || (aVar2 = t.f6012a) == null)) {
            C1529a<Integer, Integer> a = aVar2.mo7245a();
            this.f6208L = a;
            a.mo7151a(this);
            mo7366i(this.f6208L);
        }
        if (!(t == null || (aVar = t.f6013b) == null)) {
            C1529a<Integer, Integer> a2 = aVar.mo7245a();
            this.f6210N = a2;
            a2.mo7151a(this);
            mo7366i(this.f6210N);
        }
        if (!(t == null || (bVar2 = t.f6014c) == null)) {
            C1529a<Float, Float> a3 = bVar2.mo7245a();
            this.f6212P = a3;
            a3.mo7151a(this);
            mo7366i(this.f6212P);
        }
        if (t != null && (bVar = t.f6015d) != null) {
            C1529a<Float, Float> a4 = bVar.mo7245a();
            this.f6214R = a4;
            a4.mo7151a(this);
            mo7366i(this.f6214R);
        }
    }

    /* renamed from: N */
    private void m8218N(C1556b.C1557a aVar, Canvas canvas, float f) {
        int i = C1619c.f6219a[aVar.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: O */
    private String m8219O(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m8232b0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.f6204H.mo12302e(j)) {
            return this.f6204H.mo12304h(j);
        }
        this.f6198B.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f6198B.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f6198B.toString();
        this.f6204H.mo12309m(j, sb);
        return sb;
    }

    /* renamed from: P */
    private void m8220P(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: Q */
    private void m8221Q(C1559d dVar, Matrix matrix, float f, C1556b bVar, Canvas canvas) {
        List<C1511d> X = m8228X(dVar);
        for (int i = 0; i < X.size(); i++) {
            Path path = X.get(i).getPath();
            path.computeBounds(this.f6199C, false);
            this.f6200D.set(matrix);
            this.f6200D.preTranslate(0.0f, (-bVar.f5983g) * C1683h.m8459e());
            this.f6200D.preScale(f, f);
            path.transform(this.f6200D);
            if (bVar.f5987k) {
                m8224T(path, this.f6201E, canvas);
                m8224T(path, this.f6202F, canvas);
            } else {
                m8224T(path, this.f6202F, canvas);
                m8224T(path, this.f6201E, canvas);
            }
        }
    }

    /* renamed from: R */
    private void m8222R(String str, C1556b bVar, Canvas canvas) {
        if (bVar.f5987k) {
            m8220P(str, this.f6201E, canvas);
            m8220P(str, this.f6202F, canvas);
            return;
        }
        m8220P(str, this.f6202F, canvas);
        m8220P(str, this.f6201E, canvas);
    }

    /* renamed from: S */
    private void m8223S(String str, C1556b bVar, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String O = m8219O(str, i);
            i += O.length();
            m8222R(O, bVar, canvas);
            canvas.translate(this.f6201E.measureText(O) + f, 0.0f);
        }
    }

    /* renamed from: T */
    private void m8224T(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: U */
    private void m8225U(String str, C1556b bVar, Matrix matrix, C1558c cVar, Canvas canvas, float f, float f2) {
        float floatValue;
        for (int i = 0; i < str.length(); i++) {
            C1559d f3 = this.f6207K.mo7004c().mo12409f(C1559d.m7979c(str.charAt(i), cVar.mo7223a(), cVar.mo7225c()));
            if (f3 != null) {
                m8221Q(f3, matrix, f2, bVar, canvas);
                float b = ((float) f3.mo7228b()) * f2 * C1683h.m8459e() * f;
                float f4 = ((float) bVar.f5981e) / 10.0f;
                C1529a<Float, Float> aVar = this.f6215S;
                if (aVar != null) {
                    floatValue = aVar.mo7157h().floatValue();
                } else {
                    C1529a<Float, Float> aVar2 = this.f6214R;
                    if (aVar2 != null) {
                        floatValue = aVar2.mo7157h().floatValue();
                    }
                    canvas.translate(b + (f4 * f), 0.0f);
                }
                f4 += floatValue;
                canvas.translate(b + (f4 * f), 0.0f);
            }
        }
    }

    /* renamed from: V */
    private void m8226V(C1556b bVar, Matrix matrix, C1558c cVar, Canvas canvas) {
        float f;
        C1556b bVar2 = bVar;
        Canvas canvas2 = canvas;
        C1529a<Float, Float> aVar = this.f6217U;
        if (aVar != null) {
            f = aVar.mo7157h().floatValue();
        } else {
            C1529a<Float, Float> aVar2 = this.f6216T;
            if (aVar2 != null) {
                f = aVar2.mo7157h().floatValue();
            } else {
                f = bVar2.f5979c;
            }
        }
        float f2 = f / 100.0f;
        float g = C1683h.m8461g(matrix);
        String str = bVar2.f5977a;
        float e = bVar2.f5982f * C1683h.m8459e();
        List<String> Z = m8230Z(str);
        int size = Z.size();
        for (int i = 0; i < size; i++) {
            String str2 = Z.get(i);
            float Y = m8229Y(str2, cVar, f2, g);
            canvas.save();
            m8218N(bVar2.f5980d, canvas2, Y);
            canvas2.translate(0.0f, (((float) i) * e) - ((((float) (size - 1)) * e) / 2.0f));
            m8225U(str2, bVar, matrix, cVar, canvas, g, f2);
            canvas.restore();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a A[LOOP:0: B:20:0x0098->B:21:0x009a, LOOP_END] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8227W(com.airbnb.lottie.p019v.C1556b r7, com.airbnb.lottie.p019v.C1558c r8, android.graphics.Matrix r9, android.graphics.Canvas r10) {
        /*
            r6 = this;
            android.graphics.Typeface r8 = r6.m8231a0(r8)
            if (r8 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r9 = r7.f5977a
            com.airbnb.lottie.f r0 = r6.f6206J
            com.airbnb.lottie.s r0 = r0.mo7043G()
            if (r0 != 0) goto L_0x00d2
            android.graphics.Paint r0 = r6.f6201E
            r0.setTypeface(r8)
            com.airbnb.lottie.t.c.a<java.lang.Float, java.lang.Float> r8 = r6.f6217U
            if (r8 == 0) goto L_0x0025
            java.lang.Object r8 = r8.mo7157h()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L_0x0036
        L_0x0025:
            com.airbnb.lottie.t.c.a<java.lang.Float, java.lang.Float> r8 = r6.f6216T
            if (r8 == 0) goto L_0x0034
            java.lang.Object r8 = r8.mo7157h()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L_0x0036
        L_0x0034:
            float r8 = r7.f5979c
        L_0x0036:
            android.graphics.Paint r0 = r6.f6201E
            float r1 = com.airbnb.lottie.p026y.C1683h.m8459e()
            float r1 = r1 * r8
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r6.f6202F
            android.graphics.Paint r1 = r6.f6201E
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r6.f6202F
            android.graphics.Paint r1 = r6.f6201E
            float r1 = r1.getTextSize()
            r0.setTextSize(r1)
            float r0 = r7.f5982f
            float r1 = com.airbnb.lottie.p026y.C1683h.m8459e()
            float r0 = r0 * r1
            int r1 = r7.f5981e
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            com.airbnb.lottie.t.c.a<java.lang.Float, java.lang.Float> r2 = r6.f6215S
            if (r2 == 0) goto L_0x0075
            java.lang.Object r2 = r2.mo7157h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L_0x0073:
            float r1 = r1 + r2
            goto L_0x0084
        L_0x0075:
            com.airbnb.lottie.t.c.a<java.lang.Float, java.lang.Float> r2 = r6.f6214R
            if (r2 == 0) goto L_0x0084
            java.lang.Object r2 = r2.mo7157h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L_0x0073
        L_0x0084:
            float r2 = com.airbnb.lottie.p026y.C1683h.m8459e()
            float r1 = r1 * r2
            float r1 = r1 * r8
            r8 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r8
            java.util.List r8 = r6.m8230Z(r9)
            int r9 = r8.size()
            r2 = 0
        L_0x0098:
            if (r2 >= r9) goto L_0x00d1
            java.lang.Object r3 = r8.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            android.graphics.Paint r4 = r6.f6202F
            float r4 = r4.measureText(r3)
            int r5 = r3.length()
            int r5 = r5 + -1
            float r5 = (float) r5
            float r5 = r5 * r1
            float r4 = r4 + r5
            r10.save()
            com.airbnb.lottie.v.b$a r5 = r7.f5980d
            r6.m8218N(r5, r10, r4)
            int r4 = r9 + -1
            float r4 = (float) r4
            float r4 = r4 * r0
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r5 = (float) r2
            float r5 = r5 * r0
            float r5 = r5 - r4
            r4 = 0
            r10.translate(r4, r5)
            r6.m8223S(r3, r7, r10, r1)
            r10.restore()
            int r2 = r2 + 1
            goto L_0x0098
        L_0x00d1:
            return
        L_0x00d2:
            r0.mo7130a(r9)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p019v.p022l.C1616h.m8227W(com.airbnb.lottie.v.b, com.airbnb.lottie.v.c, android.graphics.Matrix, android.graphics.Canvas):void");
    }

    /* renamed from: X */
    private List<C1511d> m8228X(C1559d dVar) {
        if (this.f6203G.containsKey(dVar)) {
            return this.f6203G.get(dVar);
        }
        List<C1596o> a = dVar.mo7227a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C1511d(this.f6206J, this, a.get(i)));
        }
        this.f6203G.put(dVar, arrayList);
        return arrayList;
    }

    /* renamed from: Y */
    private float m8229Y(String str, C1558c cVar, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            C1559d f4 = this.f6207K.mo7004c().mo12409f(C1559d.m7979c(str.charAt(i), cVar.mo7223a(), cVar.mo7225c()));
            if (f4 != null) {
                f3 = (float) (((double) f3) + (f4.mo7228b() * ((double) f) * ((double) C1683h.m8459e()) * ((double) f2)));
            }
        }
        return f3;
    }

    /* renamed from: Z */
    private List<String> m8230Z(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: a0 */
    private Typeface m8231a0(C1558c cVar) {
        Typeface h;
        C1529a<Typeface, Typeface> aVar = this.f6218V;
        if (aVar != null && (h = aVar.mo7157h()) != null) {
            return h;
        }
        Typeface H = this.f6206J.mo7044H(cVar.mo7223a(), cVar.mo7225c());
        if (H != null) {
            return H;
        }
        return cVar.mo7226d();
    }

    /* renamed from: b0 */
    private boolean m8232b0(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        super.mo7135d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f6207K.mo7003b().width(), (float) this.f6207K.mo7003b().height());
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        super.mo7137g(t, cVar);
        if (t == C1493k.f5725a) {
            C1529a<Integer, Integer> aVar = this.f6209M;
            if (aVar != null) {
                mo7360F(aVar);
            }
            if (cVar == null) {
                this.f6209M = null;
                return;
            }
            C1552q qVar = new C1552q(cVar);
            this.f6209M = qVar;
            qVar.mo7151a(this);
            mo7366i(this.f6209M);
        } else if (t == C1493k.f5726b) {
            C1529a<Integer, Integer> aVar2 = this.f6211O;
            if (aVar2 != null) {
                mo7360F(aVar2);
            }
            if (cVar == null) {
                this.f6211O = null;
                return;
            }
            C1552q qVar2 = new C1552q(cVar);
            this.f6211O = qVar2;
            qVar2.mo7151a(this);
            mo7366i(this.f6211O);
        } else if (t == C1493k.f5743s) {
            C1529a<Float, Float> aVar3 = this.f6213Q;
            if (aVar3 != null) {
                mo7360F(aVar3);
            }
            if (cVar == null) {
                this.f6213Q = null;
                return;
            }
            C1552q qVar3 = new C1552q(cVar);
            this.f6213Q = qVar3;
            qVar3.mo7151a(this);
            mo7366i(this.f6213Q);
        } else if (t == C1493k.f5744t) {
            C1529a<Float, Float> aVar4 = this.f6215S;
            if (aVar4 != null) {
                mo7360F(aVar4);
            }
            if (cVar == null) {
                this.f6215S = null;
                return;
            }
            C1552q qVar4 = new C1552q(cVar);
            this.f6215S = qVar4;
            qVar4.mo7151a(this);
            mo7366i(this.f6215S);
        } else if (t == C1493k.f5716F) {
            C1529a<Float, Float> aVar5 = this.f6217U;
            if (aVar5 != null) {
                mo7360F(aVar5);
            }
            if (cVar == null) {
                this.f6217U = null;
                return;
            }
            C1552q qVar5 = new C1552q(cVar);
            this.f6217U = qVar5;
            qVar5.mo7151a(this);
            mo7366i(this.f6217U);
        } else if (t == C1493k.f5723M) {
            C1529a<Typeface, Typeface> aVar6 = this.f6218V;
            if (aVar6 != null) {
                mo7360F(aVar6);
            }
            if (cVar == null) {
                this.f6218V = null;
                return;
            }
            C1552q qVar6 = new C1552q(cVar);
            this.f6218V = qVar6;
            qVar6.mo7151a(this);
            mo7366i(this.f6218V);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo7367t(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f6206J.mo7089n0()) {
            canvas.concat(matrix);
        }
        C1556b bVar = (C1556b) this.f6205I.mo7157h();
        C1558c cVar = this.f6207K.mo7008g().get(bVar.f5978b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        C1529a<Integer, Integer> aVar = this.f6209M;
        if (aVar != null) {
            this.f6201E.setColor(aVar.mo7157h().intValue());
        } else {
            C1529a<Integer, Integer> aVar2 = this.f6208L;
            if (aVar2 != null) {
                this.f6201E.setColor(aVar2.mo7157h().intValue());
            } else {
                this.f6201E.setColor(bVar.f5984h);
            }
        }
        C1529a<Integer, Integer> aVar3 = this.f6211O;
        if (aVar3 != null) {
            this.f6202F.setColor(aVar3.mo7157h().intValue());
        } else {
            C1529a<Integer, Integer> aVar4 = this.f6210N;
            if (aVar4 != null) {
                this.f6202F.setColor(aVar4.mo7157h().intValue());
            } else {
                this.f6202F.setColor(bVar.f5985i);
            }
        }
        int intValue = ((this.f6145v.mo7208h() == null ? 100 : this.f6145v.mo7208h().mo7157h().intValue()) * 255) / 100;
        this.f6201E.setAlpha(intValue);
        this.f6202F.setAlpha(intValue);
        C1529a<Float, Float> aVar5 = this.f6213Q;
        if (aVar5 != null) {
            this.f6202F.setStrokeWidth(aVar5.mo7157h().floatValue());
        } else {
            C1529a<Float, Float> aVar6 = this.f6212P;
            if (aVar6 != null) {
                this.f6202F.setStrokeWidth(aVar6.mo7157h().floatValue());
            } else {
                this.f6202F.setStrokeWidth(bVar.f5986j * C1683h.m8459e() * C1683h.m8461g(matrix));
            }
        }
        if (this.f6206J.mo7089n0()) {
            m8226V(bVar, matrix, cVar, canvas);
        } else {
            m8227W(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }
}
