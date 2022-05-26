package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p082e.p099f.p100a.p101k.p102a.C3498b;
import p082e.p099f.p100a.p101k.p102a.C3500c;
import p082e.p099f.p100a.p101k.p102a.C3511j;
import p082e.p099f.p100a.p101k.p102a.C3519p;
import p082e.p099f.p106b.p107a.C3566b;
import p082e.p099f.p106b.p107a.C3580c;
import p082e.p099f.p106b.p107a.C3596d;
import p082e.p099f.p106b.p107a.C3597e;

/* renamed from: androidx.constraintlayout.motion.widget.n */
/* compiled from: MotionController */
public class C0396n {

    /* renamed from: A */
    private HashMap<String, C3597e> f1858A;

    /* renamed from: B */
    private HashMap<String, C3580c> f1859B;

    /* renamed from: C */
    private HashMap<String, C3566b> f1860C;

    /* renamed from: D */
    private C0393l[] f1861D;

    /* renamed from: E */
    private int f1862E;

    /* renamed from: F */
    private int f1863F;

    /* renamed from: G */
    private View f1864G;

    /* renamed from: H */
    private int f1865H;

    /* renamed from: I */
    private float f1866I;

    /* renamed from: J */
    private Interpolator f1867J;

    /* renamed from: K */
    private boolean f1868K;

    /* renamed from: a */
    Rect f1869a = new Rect();

    /* renamed from: b */
    View f1870b;

    /* renamed from: c */
    int f1871c;

    /* renamed from: d */
    boolean f1872d = false;

    /* renamed from: e */
    private int f1873e = -1;

    /* renamed from: f */
    private C0399p f1874f = new C0399p();

    /* renamed from: g */
    private C0399p f1875g = new C0399p();

    /* renamed from: h */
    private C0395m f1876h = new C0395m();

    /* renamed from: i */
    private C0395m f1877i = new C0395m();

    /* renamed from: j */
    private C3498b[] f1878j;

    /* renamed from: k */
    private C3498b f1879k;

    /* renamed from: l */
    float f1880l = Float.NaN;

    /* renamed from: m */
    float f1881m = 0.0f;

    /* renamed from: n */
    float f1882n = 1.0f;

    /* renamed from: o */
    float f1883o;

    /* renamed from: p */
    float f1884p;

    /* renamed from: q */
    private int[] f1885q;

    /* renamed from: r */
    private double[] f1886r;

    /* renamed from: s */
    private double[] f1887s;

    /* renamed from: t */
    private String[] f1888t;

    /* renamed from: u */
    private int[] f1889u;

    /* renamed from: v */
    private int f1890v = 4;

    /* renamed from: w */
    private float[] f1891w = new float[4];

    /* renamed from: x */
    private ArrayList<C0399p> f1892x = new ArrayList<>();

    /* renamed from: y */
    private float[] f1893y = new float[1];

    /* renamed from: z */
    private ArrayList<C0382e> f1894z = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.n$a */
    /* compiled from: MotionController */
    class C0397a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ C3500c f1895a;

        C0397a(C3500c cVar) {
            this.f1895a = cVar;
        }

        public float getInterpolation(float f) {
            return (float) this.f1895a.mo12523a((double) f);
        }
    }

    C0396n(View view) {
        int i = C0382e.f1738f;
        this.f1862E = i;
        this.f1863F = i;
        this.f1864G = null;
        this.f1865H = i;
        this.f1866I = Float.NaN;
        this.f1867J = null;
        this.f1868K = false;
        mo2580H(view);
    }

    /* renamed from: g */
    private float m2432g(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f1882n;
            if (((double) f4) != 1.0d) {
                float f5 = this.f1881m;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        C3500c cVar = this.f1874f.f1897g;
        float f6 = Float.NaN;
        Iterator<C0399p> it = this.f1892x.iterator();
        while (it.hasNext()) {
            C0399p next = it.next();
            C3500c cVar2 = next.f1897g;
            if (cVar2 != null) {
                float f7 = next.f1899i;
                if (f7 < f) {
                    cVar = cVar2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f1899i;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) cVar.mo12523a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) cVar.mo12524b(d);
            }
        }
        return f;
    }

    /* renamed from: p */
    private static Interpolator m2433p(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            return new C0397a(C3500c.m15017c(str));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    /* renamed from: s */
    private float m2434s() {
        char c;
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        float f3 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f4 = ((float) i) * f2;
            double d3 = (double) f4;
            C3500c cVar = this.f1874f.f1897g;
            Iterator<C0399p> it = this.f1892x.iterator();
            float f5 = Float.NaN;
            float f6 = 0.0f;
            while (it.hasNext()) {
                C0399p next = it.next();
                C3500c cVar2 = next.f1897g;
                if (cVar2 != null) {
                    float f7 = next.f1899i;
                    if (f7 < f4) {
                        cVar = cVar2;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.f1899i;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                float f8 = f5 - f6;
                d3 = (double) ((((float) cVar.mo12523a((double) ((f4 - f6) / f8))) * f8) + f6);
            }
            this.f1878j[0].mo12508d(d3, this.f1886r);
            float f9 = f3;
            int i2 = i;
            this.f1874f.mo2612l(d3, this.f1885q, this.f1886r, fArr, 0);
            if (i2 > 0) {
                c = 0;
                f = (float) (((double) f9) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            } else {
                c = 0;
                f = f9;
            }
            d = (double) fArr[c];
            i = i2 + 1;
            f3 = f;
            d2 = (double) fArr[1];
        }
        return f3;
    }

    /* renamed from: w */
    private void m2435w(C0399p pVar) {
        int binarySearch = Collections.binarySearch(this.f1892x, pVar);
        if (binarySearch == 0) {
            float f = pVar.f1900j;
            StringBuilder sb = new StringBuilder(52);
            sb.append(" KeyPath position \"");
            sb.append(f);
            sb.append("\" outside of range");
            Log.e("MotionController", sb.toString());
        }
        this.f1892x.add((-binarySearch) - 1, pVar);
    }

    /* renamed from: y */
    private void m2436y(C0399p pVar) {
        pVar.mo2622x((float) ((int) this.f1870b.getX()), (float) ((int) this.f1870b.getY()), (float) this.f1870b.getWidth(), (float) this.f1870b.getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo2573A(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((i4 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 3) {
            int i6 = rect.left + rect.right;
            int i7 = rect.top;
            int i8 = rect.bottom;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((i6 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 4) {
            int i9 = rect.left + rect.right;
            rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
            rect2.top = (i9 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo2574B(View view) {
        C0399p pVar = this.f1874f;
        pVar.f1899i = 0.0f;
        pVar.f1900j = 0.0f;
        this.f1868K = true;
        pVar.mo2622x(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f1875g.mo2622x(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f1876h.mo2572r(view);
        this.f1877i.mo2572r(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo2575C(Rect rect, C0430c cVar, int i, int i2) {
        int i3 = cVar.f2321c;
        if (i3 != 0) {
            mo2573A(rect, this.f1869a, i3, i, i2);
            rect = this.f1869a;
        }
        C0399p pVar = this.f1875g;
        pVar.f1899i = 1.0f;
        pVar.f1900j = 1.0f;
        m2436y(pVar);
        this.f1875g.mo2622x((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f1875g.mo2607c(cVar.mo2968z(this.f1871c));
        this.f1877i.mo2571q(rect, cVar, i3, this.f1871c);
    }

    /* renamed from: D */
    public void mo2576D(int i) {
        this.f1862E = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo2577E(View view) {
        C0399p pVar = this.f1874f;
        pVar.f1899i = 0.0f;
        pVar.f1900j = 0.0f;
        pVar.mo2622x(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f1876h.mo2572r(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo2578F(Rect rect, C0430c cVar, int i, int i2) {
        int i3 = cVar.f2321c;
        if (i3 != 0) {
            mo2573A(rect, this.f1869a, i3, i, i2);
        }
        C0399p pVar = this.f1874f;
        pVar.f1899i = 0.0f;
        pVar.f1900j = 0.0f;
        m2436y(pVar);
        this.f1874f.mo2622x((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        C0430c.C0431a z = cVar.mo2968z(this.f1871c);
        this.f1874f.mo2607c(z);
        this.f1880l = z.f2328d.f2420g;
        this.f1876h.mo2571q(rect, cVar, i3, this.f1871c);
        this.f1863F = z.f2330f.f2442i;
        C0430c.C0434c cVar2 = z.f2328d;
        this.f1865H = cVar2.f2424k;
        this.f1866I = cVar2.f2423j;
        Context context = this.f1870b.getContext();
        C0430c.C0434c cVar3 = z.f2328d;
        this.f1867J = m2433p(context, cVar3.f2426m, cVar3.f2425l, cVar3.f2427n);
    }

    /* renamed from: G */
    public void mo2579G(C3596d dVar, View view, int i, int i2, int i3) {
        C0399p pVar = this.f1874f;
        pVar.f1899i = 0.0f;
        pVar.f1900j = 0.0f;
        Rect rect = new Rect();
        if (i == 1) {
            int i4 = dVar.f11577b + dVar.f11579d;
            rect.left = ((dVar.f11578c + dVar.f11580e) - dVar.mo12873b()) / 2;
            rect.top = i2 - ((i4 + dVar.mo12872a()) / 2);
            rect.right = rect.left + dVar.mo12873b();
            rect.bottom = rect.top + dVar.mo12872a();
        } else if (i == 2) {
            int i5 = dVar.f11577b + dVar.f11579d;
            rect.left = i3 - (((dVar.f11578c + dVar.f11580e) + dVar.mo12873b()) / 2);
            rect.top = (i5 - dVar.mo12872a()) / 2;
            rect.right = rect.left + dVar.mo12873b();
            rect.bottom = rect.top + dVar.mo12872a();
        }
        this.f1874f.mo2622x((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f1876h.mo2570p(rect, view, i, dVar.f11576a);
    }

    /* renamed from: H */
    public void mo2580H(View view) {
        this.f1870b = view;
        this.f1871c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).mo2889a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        r11 = (java.lang.Integer) r5.get(r8);
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2581I(int r18, int r19, float r20, long r21) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<double> r1 = double.class
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r6 = r0.f1862E
            int r7 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            if (r6 == r7) goto L_0x0027
            androidx.constraintlayout.motion.widget.p r7 = r0.f1874f
            r7.f1906p = r6
        L_0x0027:
            androidx.constraintlayout.motion.widget.m r6 = r0.f1876h
            androidx.constraintlayout.motion.widget.m r7 = r0.f1877i
            r6.mo2568l(r7, r3)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.e> r6 = r0.f1894z
            if (r6 == 0) goto L_0x008e
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
        L_0x0037:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r6.next()
            androidx.constraintlayout.motion.widget.e r9 = (androidx.constraintlayout.motion.widget.C0382e) r9
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.C0388i
            if (r10 == 0) goto L_0x0066
            androidx.constraintlayout.motion.widget.i r9 = (androidx.constraintlayout.motion.widget.C0388i) r9
            androidx.constraintlayout.motion.widget.p r10 = new androidx.constraintlayout.motion.widget.p
            androidx.constraintlayout.motion.widget.p r15 = r0.f1874f
            androidx.constraintlayout.motion.widget.p r14 = r0.f1875g
            r11 = r10
            r12 = r18
            r13 = r19
            r16 = r14
            r14 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r0.m2435w(r10)
            int r9 = r9.f1798g
            int r10 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            if (r9 == r10) goto L_0x0037
            r0.f1873e = r9
            goto L_0x0037
        L_0x0066:
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.C0385g
            if (r10 == 0) goto L_0x006e
            r9.mo2543d(r4)
            goto L_0x0037
        L_0x006e:
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.C0391k
            if (r10 == 0) goto L_0x0076
            r9.mo2543d(r2)
            goto L_0x0037
        L_0x0076:
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.C0393l
            if (r10 == 0) goto L_0x0087
            if (r8 != 0) goto L_0x0081
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0081:
            androidx.constraintlayout.motion.widget.l r9 = (androidx.constraintlayout.motion.widget.C0393l) r9
            r8.add(r9)
            goto L_0x0037
        L_0x0087:
            r9.mo2547h(r5)
            r9.mo2543d(r3)
            goto L_0x0037
        L_0x008e:
            r8 = 0
        L_0x008f:
            r6 = 0
            if (r8 == 0) goto L_0x009c
            androidx.constraintlayout.motion.widget.l[] r9 = new androidx.constraintlayout.motion.widget.C0393l[r6]
            java.lang.Object[] r8 = r8.toArray(r9)
            androidx.constraintlayout.motion.widget.l[] r8 = (androidx.constraintlayout.motion.widget.C0393l[]) r8
            r0.f1861D = r8
        L_0x009c:
            boolean r8 = r3.isEmpty()
            java.lang.String r9 = ","
            java.lang.String r10 = "CUSTOM,"
            r11 = 1
            if (r8 != 0) goto L_0x0173
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0.f1859B = r8
            java.util.Iterator r8 = r3.iterator()
        L_0x00b2:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x010d
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r12.startsWith(r10)
            if (r13 == 0) goto L_0x00fc
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>()
            java.lang.String[] r14 = r12.split(r9)
            r14 = r14[r11]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.e> r15 = r0.f1894z
            java.util.Iterator r15 = r15.iterator()
        L_0x00d5:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00f7
            java.lang.Object r16 = r15.next()
            r7 = r16
            androidx.constraintlayout.motion.widget.e r7 = (androidx.constraintlayout.motion.widget.C0382e) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r11 = r7.f1743e
            if (r11 != 0) goto L_0x00e9
        L_0x00e7:
            r11 = 1
            goto L_0x00d5
        L_0x00e9:
            java.lang.Object r11 = r11.get(r14)
            androidx.constraintlayout.widget.a r11 = (androidx.constraintlayout.widget.C0424a) r11
            if (r11 == 0) goto L_0x00e7
            int r7 = r7.f1739a
            r13.append(r7, r11)
            goto L_0x00e7
        L_0x00f7:
            e.f.b.a.c r7 = p082e.p099f.p106b.p107a.C3580c.m15538f(r12, r13)
            goto L_0x0100
        L_0x00fc:
            e.f.b.a.c r7 = p082e.p099f.p106b.p107a.C3580c.m15539g(r12)
        L_0x0100:
            if (r7 != 0) goto L_0x0103
            goto L_0x010b
        L_0x0103:
            r7.mo12554d(r12)
            java.util.HashMap<java.lang.String, e.f.b.a.c> r11 = r0.f1859B
            r11.put(r12, r7)
        L_0x010b:
            r11 = 1
            goto L_0x00b2
        L_0x010d:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.e> r7 = r0.f1894z
            if (r7 == 0) goto L_0x012b
            java.util.Iterator r7 = r7.iterator()
        L_0x0115:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x012b
            java.lang.Object r8 = r7.next()
            androidx.constraintlayout.motion.widget.e r8 = (androidx.constraintlayout.motion.widget.C0382e) r8
            boolean r11 = r8 instanceof androidx.constraintlayout.motion.widget.C0383f
            if (r11 == 0) goto L_0x0115
            java.util.HashMap<java.lang.String, e.f.b.a.c> r11 = r0.f1859B
            r8.mo2539a(r11)
            goto L_0x0115
        L_0x012b:
            androidx.constraintlayout.motion.widget.m r7 = r0.f1876h
            java.util.HashMap<java.lang.String, e.f.b.a.c> r8 = r0.f1859B
            r7.mo2563c(r8, r6)
            androidx.constraintlayout.motion.widget.m r7 = r0.f1877i
            java.util.HashMap<java.lang.String, e.f.b.a.c> r8 = r0.f1859B
            r11 = 100
            r7.mo2563c(r8, r11)
            java.util.HashMap<java.lang.String, e.f.b.a.c> r7 = r0.f1859B
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0145:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0173
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r11 = r5.containsKey(r8)
            if (r11 == 0) goto L_0x0164
            java.lang.Object r11 = r5.get(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L_0x0164
            int r11 = r11.intValue()
            goto L_0x0165
        L_0x0164:
            r11 = 0
        L_0x0165:
            java.util.HashMap<java.lang.String, e.f.b.a.c> r12 = r0.f1859B
            java.lang.Object r8 = r12.get(r8)
            e.f.a.k.a.j r8 = (p082e.p099f.p100a.p101k.p102a.C3511j) r8
            if (r8 == 0) goto L_0x0145
            r8.mo12555e(r11)
            goto L_0x0145
        L_0x0173:
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L_0x0241
            java.util.HashMap<java.lang.String, e.f.b.a.e> r7 = r0.f1858A
            if (r7 != 0) goto L_0x0184
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.f1858A = r7
        L_0x0184:
            java.util.Iterator r2 = r2.iterator()
        L_0x0188:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01ed
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, e.f.b.a.e> r8 = r0.f1858A
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x019d
            goto L_0x0188
        L_0x019d:
            boolean r8 = r7.startsWith(r10)
            if (r8 == 0) goto L_0x01db
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
            java.lang.String[] r11 = r7.split(r9)
            r12 = 1
            r11 = r11[r12]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.e> r12 = r0.f1894z
            java.util.Iterator r12 = r12.iterator()
        L_0x01b5:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01d4
            java.lang.Object r13 = r12.next()
            androidx.constraintlayout.motion.widget.e r13 = (androidx.constraintlayout.motion.widget.C0382e) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r14 = r13.f1743e
            if (r14 != 0) goto L_0x01c6
            goto L_0x01b5
        L_0x01c6:
            java.lang.Object r14 = r14.get(r11)
            androidx.constraintlayout.widget.a r14 = (androidx.constraintlayout.widget.C0424a) r14
            if (r14 == 0) goto L_0x01b5
            int r13 = r13.f1739a
            r8.append(r13, r14)
            goto L_0x01b5
        L_0x01d4:
            e.f.b.a.e r8 = p082e.p099f.p106b.p107a.C3597e.m15562g(r7, r8)
            r11 = r21
            goto L_0x01e1
        L_0x01db:
            r11 = r21
            e.f.b.a.e r8 = p082e.p099f.p106b.p107a.C3597e.m15563h(r7, r11)
        L_0x01e1:
            if (r8 != 0) goto L_0x01e4
            goto L_0x0188
        L_0x01e4:
            r8.mo12566d(r7)
            java.util.HashMap<java.lang.String, e.f.b.a.e> r13 = r0.f1858A
            r13.put(r7, r8)
            goto L_0x0188
        L_0x01ed:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.e> r2 = r0.f1894z
            if (r2 == 0) goto L_0x020d
            java.util.Iterator r2 = r2.iterator()
        L_0x01f5:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x020d
            java.lang.Object r7 = r2.next()
            androidx.constraintlayout.motion.widget.e r7 = (androidx.constraintlayout.motion.widget.C0382e) r7
            boolean r8 = r7 instanceof androidx.constraintlayout.motion.widget.C0391k
            if (r8 == 0) goto L_0x01f5
            androidx.constraintlayout.motion.widget.k r7 = (androidx.constraintlayout.motion.widget.C0391k) r7
            java.util.HashMap<java.lang.String, e.f.b.a.e> r8 = r0.f1858A
            r7.mo2561U(r8)
            goto L_0x01f5
        L_0x020d:
            java.util.HashMap<java.lang.String, e.f.b.a.e> r2 = r0.f1858A
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0217:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0241
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r5.containsKey(r7)
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r5.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x0235
        L_0x0234:
            r8 = 0
        L_0x0235:
            java.util.HashMap<java.lang.String, e.f.b.a.e> r9 = r0.f1858A
            java.lang.Object r7 = r9.get(r7)
            e.f.b.a.e r7 = (p082e.p099f.p106b.p107a.C3597e) r7
            r7.mo12567e(r8)
            goto L_0x0217
        L_0x0241:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r2 = r0.f1892x
            int r2 = r2.size()
            r5 = 2
            int r2 = r2 + r5
            androidx.constraintlayout.motion.widget.p[] r7 = new androidx.constraintlayout.motion.widget.C0399p[r2]
            androidx.constraintlayout.motion.widget.p r8 = r0.f1874f
            r7[r6] = r8
            int r8 = r2 + -1
            androidx.constraintlayout.motion.widget.p r9 = r0.f1875g
            r7[r8] = r9
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r8 = r0.f1892x
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0264
            int r8 = r0.f1873e
            r9 = -1
            if (r8 != r9) goto L_0x0264
            r0.f1873e = r6
        L_0x0264:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r8 = r0.f1892x
            java.util.Iterator r8 = r8.iterator()
            r9 = 1
        L_0x026b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x027d
            java.lang.Object r11 = r8.next()
            androidx.constraintlayout.motion.widget.p r11 = (androidx.constraintlayout.motion.widget.C0399p) r11
            int r12 = r9 + 1
            r7[r9] = r11
            r9 = r12
            goto L_0x026b
        L_0x027d:
            r8 = 18
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            androidx.constraintlayout.motion.widget.p r11 = r0.f1875g
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r11 = r11.f1910t
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0290:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x02c4
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            androidx.constraintlayout.motion.widget.p r13 = r0.f1874f
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r13 = r13.f1910t
            boolean r13 = r13.containsKey(r12)
            if (r13 == 0) goto L_0x0290
            java.lang.String r13 = java.lang.String.valueOf(r12)
            int r14 = r13.length()
            if (r14 == 0) goto L_0x02b5
            java.lang.String r13 = r10.concat(r13)
            goto L_0x02ba
        L_0x02b5:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r10)
        L_0x02ba:
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L_0x0290
            r9.add(r12)
            goto L_0x0290
        L_0x02c4:
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.Object[] r3 = r9.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.f1888t = r3
            int r3 = r3.length
            int[] r3 = new int[r3]
            r0.f1889u = r3
            r3 = 0
        L_0x02d4:
            java.lang.String[] r9 = r0.f1888t
            int r10 = r9.length
            if (r3 >= r10) goto L_0x030a
            r9 = r9[r3]
            int[] r10 = r0.f1889u
            r10[r3] = r6
            r10 = 0
        L_0x02e0:
            if (r10 >= r2) goto L_0x0307
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r11 = r11.f1910t
            boolean r11 = r11.containsKey(r9)
            if (r11 == 0) goto L_0x0304
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r11 = r11.f1910t
            java.lang.Object r11 = r11.get(r9)
            androidx.constraintlayout.widget.a r11 = (androidx.constraintlayout.widget.C0424a) r11
            if (r11 == 0) goto L_0x0304
            int[] r9 = r0.f1889u
            r10 = r9[r3]
            int r11 = r11.mo2936h()
            int r10 = r10 + r11
            r9[r3] = r10
            goto L_0x0307
        L_0x0304:
            int r10 = r10 + 1
            goto L_0x02e0
        L_0x0307:
            int r3 = r3 + 1
            goto L_0x02d4
        L_0x030a:
            r3 = r7[r6]
            int r3 = r3.f1906p
            int r10 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            if (r3 == r10) goto L_0x0314
            r3 = 1
            goto L_0x0315
        L_0x0314:
            r3 = 0
        L_0x0315:
            int r9 = r9.length
            int r8 = r8 + r9
            boolean[] r9 = new boolean[r8]
            r10 = 1
        L_0x031a:
            if (r10 >= r2) goto L_0x032a
            r11 = r7[r10]
            int r12 = r10 + -1
            r12 = r7[r12]
            java.lang.String[] r13 = r0.f1888t
            r11.mo2610j(r12, r9, r13, r3)
            int r10 = r10 + 1
            goto L_0x031a
        L_0x032a:
            r3 = 1
            r10 = 0
        L_0x032c:
            if (r3 >= r8) goto L_0x0337
            boolean r11 = r9[r3]
            if (r11 == 0) goto L_0x0334
            int r10 = r10 + 1
        L_0x0334:
            int r3 = r3 + 1
            goto L_0x032c
        L_0x0337:
            int[] r3 = new int[r10]
            r0.f1885q = r3
            int r3 = java.lang.Math.max(r5, r10)
            double[] r10 = new double[r3]
            r0.f1886r = r10
            double[] r3 = new double[r3]
            r0.f1887s = r3
            r3 = 1
            r10 = 0
        L_0x0349:
            if (r3 >= r8) goto L_0x0359
            boolean r11 = r9[r3]
            if (r11 == 0) goto L_0x0356
            int[] r11 = r0.f1885q
            int r12 = r10 + 1
            r11[r10] = r3
            r10 = r12
        L_0x0356:
            int r3 = r3 + 1
            goto L_0x0349
        L_0x0359:
            int[] r3 = r0.f1885q
            int r3 = r3.length
            int[] r8 = new int[r5]
            r9 = 1
            r8[r9] = r3
            r8[r6] = r2
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r8)
            double[][] r3 = (double[][]) r3
            double[] r8 = new double[r2]
            r9 = 0
        L_0x036c:
            if (r9 >= r2) goto L_0x0381
            r10 = r7[r9]
            r11 = r3[r9]
            int[] r12 = r0.f1885q
            r10.mo2611k(r11, r12)
            r10 = r7[r9]
            float r10 = r10.f1899i
            double r10 = (double) r10
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x036c
        L_0x0381:
            r9 = 0
        L_0x0382:
            int[] r10 = r0.f1885q
            int r11 = r10.length
            if (r9 >= r11) goto L_0x03c6
            r11 = r10[r9]
            java.lang.String[] r12 = androidx.constraintlayout.motion.widget.C0399p.f1896x
            int r13 = r12.length
            if (r11 >= r13) goto L_0x03c3
            r10 = r10[r9]
            r10 = r12[r10]
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = " ["
            java.lang.String r10 = r10.concat(r11)
            r11 = 0
        L_0x039d:
            if (r11 >= r2) goto L_0x03c3
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r12 = r3[r11]
            r13 = r12[r9]
            java.lang.String r12 = java.lang.String.valueOf(r10)
            int r12 = r12.length()
            int r12 = r12 + 24
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r12)
            r15.append(r10)
            r15.append(r13)
            java.lang.String r10 = r15.toString()
            int r11 = r11 + 1
            goto L_0x039d
        L_0x03c3:
            int r9 = r9 + 1
            goto L_0x0382
        L_0x03c6:
            java.lang.String[] r9 = r0.f1888t
            int r9 = r9.length
            r10 = 1
            int r9 = r9 + r10
            e.f.a.k.a.b[] r9 = new p082e.p099f.p100a.p101k.p102a.C3498b[r9]
            r0.f1878j = r9
            r9 = 0
        L_0x03d0:
            java.lang.String[] r10 = r0.f1888t
            int r11 = r10.length
            if (r9 >= r11) goto L_0x042c
            r10 = r10[r9]
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x03db:
            if (r11 >= r2) goto L_0x0413
            r15 = r7[r11]
            boolean r15 = r15.mo2617s(r10)
            if (r15 == 0) goto L_0x040e
            if (r14 != 0) goto L_0x03fd
            double[] r12 = new double[r2]
            r14 = r7[r11]
            int r14 = r14.mo2615q(r10)
            int[] r15 = new int[r5]
            r16 = 1
            r15[r16] = r14
            r15[r6] = r2
            java.lang.Object r14 = java.lang.reflect.Array.newInstance(r1, r15)
            double[][] r14 = (double[][]) r14
        L_0x03fd:
            r15 = r7[r11]
            float r15 = r15.f1899i
            double r5 = (double) r15
            r12[r13] = r5
            r5 = r7[r11]
            r6 = r14[r13]
            r15 = 0
            r5.mo2614p(r10, r6, r15)
            int r13 = r13 + 1
        L_0x040e:
            int r11 = r11 + 1
            r5 = 2
            r6 = 0
            goto L_0x03db
        L_0x0413:
            double[] r5 = java.util.Arrays.copyOf(r12, r13)
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r14, r13)
            double[][] r6 = (double[][]) r6
            e.f.a.k.a.b[] r10 = r0.f1878j
            int r9 = r9 + 1
            int r11 = r0.f1873e
            e.f.a.k.a.b r5 = p082e.p099f.p100a.p101k.p102a.C3498b.m15003a(r11, r5, r6)
            r10[r9] = r5
            r5 = 2
            r6 = 0
            goto L_0x03d0
        L_0x042c:
            e.f.a.k.a.b[] r5 = r0.f1878j
            int r6 = r0.f1873e
            e.f.a.k.a.b r3 = p082e.p099f.p100a.p101k.p102a.C3498b.m15003a(r6, r8, r3)
            r6 = 0
            r5[r6] = r3
            r3 = r7[r6]
            int r3 = r3.f1906p
            int r5 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            if (r3 == r5) goto L_0x047e
            int[] r3 = new int[r2]
            double[] r5 = new double[r2]
            r8 = 2
            int[] r9 = new int[r8]
            r10 = 1
            r9[r10] = r8
            r9[r6] = r2
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r9)
            double[][] r1 = (double[][]) r1
            r15 = 0
        L_0x0452:
            if (r15 >= r2) goto L_0x0478
            r6 = r7[r15]
            int r6 = r6.f1906p
            r3[r15] = r6
            r6 = r7[r15]
            float r6 = r6.f1899i
            double r8 = (double) r6
            r5[r15] = r8
            r6 = r1[r15]
            r8 = r7[r15]
            float r8 = r8.f1901k
            double r8 = (double) r8
            r10 = 0
            r6[r10] = r8
            r6 = r1[r15]
            r8 = r7[r15]
            float r8 = r8.f1902l
            double r8 = (double) r8
            r11 = 1
            r6[r11] = r8
            int r15 = r15 + 1
            goto L_0x0452
        L_0x0478:
            e.f.a.k.a.b r1 = p082e.p099f.p100a.p101k.p102a.C3498b.m15004b(r3, r5, r1)
            r0.f1879k = r1
        L_0x047e:
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.f1860C = r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.e> r2 = r0.f1894z
            if (r2 == 0) goto L_0x04f3
            java.util.Iterator r2 = r4.iterator()
        L_0x048f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04bb
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            e.f.b.a.b r4 = p082e.p099f.p106b.p107a.C3566b.m15521i(r3)
            if (r4 != 0) goto L_0x04a2
            goto L_0x048f
        L_0x04a2:
            boolean r5 = r4.mo12535h()
            if (r5 == 0) goto L_0x04b2
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L_0x04b2
            float r1 = r17.m2434s()
        L_0x04b2:
            r4.mo12533f(r3)
            java.util.HashMap<java.lang.String, e.f.b.a.b> r5 = r0.f1860C
            r5.put(r3, r4)
            goto L_0x048f
        L_0x04bb:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.e> r2 = r0.f1894z
            java.util.Iterator r2 = r2.iterator()
        L_0x04c1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d9
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.e r3 = (androidx.constraintlayout.motion.widget.C0382e) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.motion.widget.C0385g
            if (r4 == 0) goto L_0x04c1
            androidx.constraintlayout.motion.widget.g r3 = (androidx.constraintlayout.motion.widget.C0385g) r3
            java.util.HashMap<java.lang.String, e.f.b.a.b> r4 = r0.f1860C
            r3.mo2553Y(r4)
            goto L_0x04c1
        L_0x04d9:
            java.util.HashMap<java.lang.String, e.f.b.a.b> r2 = r0.f1860C
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x04e3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04f3
            java.lang.Object r3 = r2.next()
            e.f.b.a.b r3 = (p082e.p099f.p106b.p107a.C3566b) r3
            r3.mo12534g(r1)
            goto L_0x04e3
        L_0x04f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0396n.mo2581I(int, int, float, long):void");
    }

    /* renamed from: J */
    public void mo2582J(C0396n nVar) {
        this.f1874f.mo2606A(nVar, nVar.f1874f);
        this.f1875g.mo2606A(nVar, nVar.f1875g);
    }

    /* renamed from: a */
    public void mo2583a(C0382e eVar) {
        this.f1894z.add(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2584b(ArrayList<C0382e> arrayList) {
        this.f1894z.addAll(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo2585c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f1878j[0].mo12512h();
        if (iArr != null) {
            Iterator<C0399p> it = this.f1892x.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f1911u;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < h.length; i3++) {
            this.f1878j[0].mo12508d(h[i3], this.f1886r);
            this.f1874f.mo2612l(h[i3], this.f1885q, this.f1886r, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2586d(float[] fArr, int i) {
        double d;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i2 - 1));
        HashMap<String, C3580c> hashMap = this.f1859B;
        C3566b bVar = null;
        C3511j jVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, C3580c> hashMap2 = this.f1859B;
        C3511j jVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, C3566b> hashMap3 = this.f1860C;
        C3566b bVar2 = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, C3566b> hashMap4 = this.f1860C;
        if (hashMap4 != null) {
            bVar = hashMap4.get("translationY");
        }
        C3566b bVar3 = bVar;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = ((float) i3) * f2;
            float f4 = this.f1882n;
            if (f4 != f) {
                float f5 = this.f1881m;
                if (f3 < f5) {
                    f3 = 0.0f;
                }
                if (f3 > f5 && ((double) f3) < 1.0d) {
                    f3 = Math.min((f3 - f5) * f4, f);
                }
            }
            float f6 = f3;
            double d2 = (double) f6;
            C3500c cVar = this.f1874f.f1897g;
            float f7 = Float.NaN;
            Iterator<C0399p> it = this.f1892x.iterator();
            float f8 = 0.0f;
            while (it.hasNext()) {
                C0399p next = it.next();
                C3500c cVar2 = next.f1897g;
                double d3 = d2;
                if (cVar2 != null) {
                    float f9 = next.f1899i;
                    if (f9 < f6) {
                        f8 = f9;
                        cVar = cVar2;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.f1899i;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (cVar != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f10 = f7 - f8;
                d = (double) ((((float) cVar.mo12523a((double) ((f6 - f8) / f10))) * f10) + f8);
            } else {
                d = d4;
            }
            this.f1878j[0].mo12508d(d, this.f1886r);
            C3498b bVar4 = this.f1879k;
            if (bVar4 != null) {
                double[] dArr = this.f1886r;
                if (dArr.length > 0) {
                    bVar4.mo12508d(d, dArr);
                }
            }
            int i4 = i3 * 2;
            float f11 = f6;
            int i5 = i3;
            this.f1874f.mo2612l(d, this.f1885q, this.f1886r, fArr, i4);
            if (bVar2 != null) {
                fArr[i4] = fArr[i4] + bVar2.mo12528a(f11);
            } else if (jVar != null) {
                fArr[i4] = fArr[i4] + jVar.mo12551a(f11);
            }
            if (bVar3 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + bVar3.mo12528a(f11);
            } else if (jVar2 != null) {
                int i7 = i4 + 1;
                fArr[i7] = fArr[i7] + jVar2.mo12551a(f11);
            }
            i3 = i5 + 1;
            f = 1.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2587e(float f, float[] fArr, int i) {
        this.f1878j[0].mo12508d((double) m2432g(f, (float[]) null), this.f1886r);
        this.f1874f.mo2616r(this.f1885q, this.f1886r, fArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2588f(boolean z) {
        if ("button".equals(C0379b.m2242d(this.f1870b)) && this.f1861D != null) {
            int i = 0;
            while (true) {
                C0393l[] lVarArr = this.f1861D;
                if (i < lVarArr.length) {
                    lVarArr[i].mo2562y(z ? -100.0f : 100.0f, this.f1870b);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public int mo2589h() {
        return this.f1874f.f1907q;
    }

    /* renamed from: i */
    public void mo2590i(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f1878j[0].mo12508d(d, dArr);
        this.f1878j[0].mo12511g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f1874f.mo2613o(d, this.f1885q, dArr, fArr, dArr2, fArr2);
    }

    /* renamed from: j */
    public float mo2591j() {
        return this.f1883o;
    }

    /* renamed from: k */
    public float mo2592k() {
        return this.f1884p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2593l(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float g = m2432g(f, this.f1893y);
        C3498b[] bVarArr = this.f1878j;
        int i = 0;
        if (bVarArr != null) {
            double d = (double) g;
            bVarArr[0].mo12511g(d, this.f1887s);
            this.f1878j[0].mo12508d(d, this.f1886r);
            float f4 = this.f1893y[0];
            while (true) {
                dArr = this.f1887s;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            C3498b bVar = this.f1879k;
            if (bVar != null) {
                double[] dArr2 = this.f1886r;
                if (dArr2.length > 0) {
                    bVar.mo12508d(d, dArr2);
                    this.f1879k.mo12511g(d, this.f1887s);
                    this.f1874f.mo2623y(f2, f3, fArr, this.f1885q, this.f1887s, this.f1886r);
                    return;
                }
                return;
            }
            this.f1874f.mo2623y(f2, f3, fArr, this.f1885q, dArr, this.f1886r);
            return;
        }
        C0399p pVar = this.f1875g;
        float f5 = pVar.f1901k;
        C0399p pVar2 = this.f1874f;
        float f6 = f5 - pVar2.f1901k;
        float f7 = pVar.f1902l - pVar2.f1902l;
        float f8 = (pVar.f1903m - pVar2.f1903m) + f6;
        float f9 = (pVar.f1904n - pVar2.f1904n) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    /* renamed from: m */
    public int mo2594m() {
        int i = this.f1874f.f1898h;
        Iterator<C0399p> it = this.f1892x.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().f1898h);
        }
        return Math.max(i, this.f1875g.f1898h);
    }

    /* renamed from: n */
    public float mo2595n() {
        return this.f1875g.f1901k;
    }

    /* renamed from: o */
    public float mo2596o() {
        return this.f1875g.f1902l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C0399p mo2597q(int i) {
        return this.f1892x.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2598r(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float g = m2432g(f, this.f1893y);
        HashMap<String, C3580c> hashMap = this.f1859B;
        C3566b bVar = null;
        C3511j jVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, C3580c> hashMap2 = this.f1859B;
        C3511j jVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, C3580c> hashMap3 = this.f1859B;
        C3511j jVar3 = hashMap3 == null ? null : hashMap3.get("rotation");
        HashMap<String, C3580c> hashMap4 = this.f1859B;
        C3511j jVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, C3580c> hashMap5 = this.f1859B;
        C3511j jVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, C3566b> hashMap6 = this.f1860C;
        C3566b bVar2 = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, C3566b> hashMap7 = this.f1860C;
        C3566b bVar3 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, C3566b> hashMap8 = this.f1860C;
        C3566b bVar4 = hashMap8 == null ? null : hashMap8.get("rotation");
        HashMap<String, C3566b> hashMap9 = this.f1860C;
        C3566b bVar5 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, C3566b> hashMap10 = this.f1860C;
        if (hashMap10 != null) {
            bVar = hashMap10.get("scaleY");
        }
        C3519p pVar = new C3519p();
        pVar.mo12570b();
        pVar.mo12572d(jVar3, g);
        pVar.mo12576h(jVar, jVar2, g);
        pVar.mo12574f(jVar4, jVar5, g);
        pVar.mo12571c(bVar4, g);
        pVar.mo12575g(bVar2, bVar3, g);
        pVar.mo12573e(bVar5, bVar, g);
        C3498b bVar6 = this.f1879k;
        if (bVar6 != null) {
            double[] dArr = this.f1886r;
            if (dArr.length > 0) {
                double d = (double) g;
                bVar6.mo12508d(d, dArr);
                this.f1879k.mo12511g(d, this.f1887s);
                this.f1874f.mo2623y(f2, f3, fArr, this.f1885q, this.f1887s, this.f1886r);
            }
            pVar.mo12569a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f1878j != null) {
            double g2 = (double) m2432g(g, this.f1893y);
            this.f1878j[0].mo12511g(g2, this.f1887s);
            this.f1878j[0].mo12508d(g2, this.f1886r);
            float f4 = this.f1893y[0];
            while (true) {
                double[] dArr2 = this.f1887s;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * ((double) f4);
                    i3++;
                } else {
                    float f5 = f2;
                    float f6 = f3;
                    this.f1874f.mo2623y(f5, f6, fArr, this.f1885q, dArr2, this.f1886r);
                    pVar.mo12569a(f5, f6, i, i2, fArr);
                    return;
                }
            }
        } else {
            C0399p pVar2 = this.f1875g;
            float f7 = pVar2.f1901k;
            C0399p pVar3 = this.f1874f;
            float f8 = f7 - pVar3.f1901k;
            float f9 = pVar2.f1902l - pVar3.f1902l;
            C3566b bVar7 = bVar5;
            float f10 = (pVar2.f1904n - pVar3.f1904n) + f9;
            fArr[0] = (f8 * (1.0f - f2)) + (((pVar2.f1903m - pVar3.f1903m) + f8) * f2);
            fArr[1] = (f9 * (1.0f - f3)) + (f10 * f3);
            pVar.mo12570b();
            pVar.mo12572d(jVar3, g);
            pVar.mo12576h(jVar, jVar2, g);
            pVar.mo12574f(jVar4, jVar5, g);
            pVar.mo12571c(bVar4, g);
            pVar.mo12575g(bVar2, bVar3, g);
            pVar.mo12573e(bVar7, bVar, g);
            pVar.mo12569a(f2, f3, i, i2, fArr);
        }
    }

    /* renamed from: t */
    public float mo2599t() {
        return this.f1874f.f1901k;
    }

    public String toString() {
        C0399p pVar = this.f1874f;
        float f = pVar.f1901k;
        float f2 = pVar.f1902l;
        C0399p pVar2 = this.f1875g;
        float f3 = pVar2.f1901k;
        float f4 = pVar2.f1902l;
        StringBuilder sb = new StringBuilder(88);
        sb.append(" start: x: ");
        sb.append(f);
        sb.append(" y: ");
        sb.append(f2);
        sb.append(" end: x: ");
        sb.append(f3);
        sb.append(" y: ");
        sb.append(f4);
        return sb.toString();
    }

    /* renamed from: u */
    public float mo2601u() {
        return this.f1874f.f1902l;
    }

    /* renamed from: v */
    public View mo2602v() {
        return this.f1870b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: e.f.b.a.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: e.f.b.a.e$d} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2603x(android.view.View r21, float r22, long r23, p082e.p099f.p100a.p101k.p102a.C3502d r25) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = 0
            r2 = r22
            float r2 = r0.m2432g(r2, r1)
            int r3 = r0.f1865H
            int r4 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x0045
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.f1866I
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x002e
            float r5 = r0.f1866I
            float r2 = r2 + r5
            float r2 = r2 % r13
        L_0x002e:
            android.view.animation.Interpolator r5 = r0.f1867J
            if (r5 == 0) goto L_0x0037
            float r2 = r5.getInterpolation(r2)
            goto L_0x0042
        L_0x0037:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0041
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L_0x0045:
            r14 = r2
            java.util.HashMap<java.lang.String, e.f.b.a.c> r2 = r0.f1859B
            if (r2 == 0) goto L_0x0062
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r2.next()
            e.f.b.a.c r3 = (p082e.p099f.p106b.p107a.C3580c) r3
            r3.mo12869h(r11, r14)
            goto L_0x0052
        L_0x0062:
            java.util.HashMap<java.lang.String, e.f.b.a.e> r2 = r0.f1858A
            r15 = 0
            if (r2 == 0) goto L_0x0096
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = 0
        L_0x0071:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r7.next()
            e.f.b.a.e r1 = (p082e.p099f.p106b.p107a.C3597e) r1
            boolean r2 = r1 instanceof p082e.p099f.p106b.p107a.C3597e.C3601d
            if (r2 == 0) goto L_0x0085
            r8 = r1
            e.f.b.a.e$d r8 = (p082e.p099f.p106b.p107a.C3597e.C3601d) r8
            goto L_0x0071
        L_0x0085:
            r2 = r21
            r3 = r14
            r4 = r23
            r6 = r25
            boolean r1 = r1.mo12875i(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x0071
        L_0x0092:
            r16 = r9
            r9 = r8
            goto L_0x0099
        L_0x0096:
            r9 = r1
            r16 = 0
        L_0x0099:
            e.f.a.k.a.b[] r1 = r0.f1878j
            r10 = 1
            if (r1 == 0) goto L_0x01f3
            r1 = r1[r15]
            double r7 = (double) r14
            double[] r2 = r0.f1886r
            r1.mo12508d(r7, r2)
            e.f.a.k.a.b[] r1 = r0.f1878j
            r1 = r1[r15]
            double[] r2 = r0.f1887s
            r1.mo12511g(r7, r2)
            e.f.a.k.a.b r1 = r0.f1879k
            if (r1 == 0) goto L_0x00c2
            double[] r2 = r0.f1886r
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00c2
            r1.mo12508d(r7, r2)
            e.f.a.k.a.b r1 = r0.f1879k
            double[] r2 = r0.f1887s
            r1.mo12511g(r7, r2)
        L_0x00c2:
            boolean r1 = r0.f1868K
            if (r1 != 0) goto L_0x00e2
            androidx.constraintlayout.motion.widget.p r1 = r0.f1874f
            int[] r4 = r0.f1885q
            double[] r5 = r0.f1886r
            double[] r6 = r0.f1887s
            r17 = 0
            boolean r3 = r0.f1872d
            r2 = r14
            r18 = r3
            r3 = r21
            r12 = r7
            r7 = r17
            r8 = r18
            r1.mo2624z(r2, r3, r4, r5, r6, r7, r8)
            r0.f1872d = r15
            goto L_0x00e3
        L_0x00e2:
            r12 = r7
        L_0x00e3:
            int r1 = r0.f1863F
            int r2 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            if (r1 == r2) goto L_0x0145
            android.view.View r1 = r0.f1864G
            if (r1 != 0) goto L_0x00fb
            android.view.ViewParent r1 = r21.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.f1863F
            android.view.View r1 = r1.findViewById(r2)
            r0.f1864G = r1
        L_0x00fb:
            android.view.View r1 = r0.f1864G
            if (r1 == 0) goto L_0x0145
            int r1 = r1.getTop()
            android.view.View r2 = r0.f1864G
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.f1864G
            int r3 = r3.getLeft()
            android.view.View r4 = r0.f1864G
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r21.getRight()
            int r4 = r21.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0145
            int r2 = r21.getBottom()
            int r4 = r21.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0145
            int r2 = r21.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r21.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L_0x0145:
            java.util.HashMap<java.lang.String, e.f.b.a.c> r1 = r0.f1859B
            if (r1 == 0) goto L_0x0173
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0151:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0173
            java.lang.Object r1 = r8.next()
            e.f.a.k.a.j r1 = (p082e.p099f.p100a.p101k.p102a.C3511j) r1
            boolean r2 = r1 instanceof p082e.p099f.p106b.p107a.C3580c.C3584d
            if (r2 == 0) goto L_0x0151
            double[] r2 = r0.f1887s
            int r3 = r2.length
            if (r3 <= r10) goto L_0x0151
            e.f.b.a.c$d r1 = (p082e.p099f.p106b.p107a.C3580c.C3584d) r1
            r4 = r2[r15]
            r6 = r2[r10]
            r2 = r21
            r3 = r14
            r1.mo12871i(r2, r3, r4, r6)
            goto L_0x0151
        L_0x0173:
            if (r9 == 0) goto L_0x0190
            double[] r1 = r0.f1887s
            r7 = r1[r15]
            r17 = r1[r10]
            r1 = r9
            r2 = r21
            r3 = r25
            r4 = r14
            r5 = r23
            r19 = 1
            r9 = r17
            boolean r1 = r1.mo12877j(r2, r3, r4, r5, r7, r9)
            r1 = r16 | r1
            r16 = r1
            goto L_0x0192
        L_0x0190:
            r19 = 1
        L_0x0192:
            r10 = 1
        L_0x0193:
            e.f.a.k.a.b[] r1 = r0.f1878j
            int r2 = r1.length
            if (r10 >= r2) goto L_0x01b7
            r1 = r1[r10]
            float[] r2 = r0.f1891w
            r1.mo12509e(r12, r2)
            androidx.constraintlayout.motion.widget.p r1 = r0.f1874f
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r1 = r1.f1910t
            java.lang.String[] r2 = r0.f1888t
            int r3 = r10 + -1
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.C0424a) r1
            float[] r2 = r0.f1891w
            r1.mo2937k(r11, r2)
            int r10 = r10 + 1
            goto L_0x0193
        L_0x01b7:
            androidx.constraintlayout.motion.widget.m r1 = r0.f1876h
            int r2 = r1.f1841h
            if (r2 != 0) goto L_0x01e1
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c8
            int r1 = r1.f1842i
            r11.setVisibility(r1)
            goto L_0x01e1
        L_0x01c8:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01d6
            androidx.constraintlayout.motion.widget.m r1 = r0.f1877i
            int r1 = r1.f1842i
            r11.setVisibility(r1)
            goto L_0x01e1
        L_0x01d6:
            androidx.constraintlayout.motion.widget.m r2 = r0.f1877i
            int r2 = r2.f1842i
            int r1 = r1.f1842i
            if (r2 == r1) goto L_0x01e1
            r11.setVisibility(r15)
        L_0x01e1:
            androidx.constraintlayout.motion.widget.l[] r1 = r0.f1861D
            if (r1 == 0) goto L_0x0247
            r1 = 0
        L_0x01e6:
            androidx.constraintlayout.motion.widget.l[] r2 = r0.f1861D
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0247
            r2 = r2[r1]
            r2.mo2562y(r14, r11)
            int r1 = r1 + 1
            goto L_0x01e6
        L_0x01f3:
            r19 = 1
            androidx.constraintlayout.motion.widget.p r1 = r0.f1874f
            float r2 = r1.f1901k
            androidx.constraintlayout.motion.widget.p r3 = r0.f1875g
            float r4 = r3.f1901k
            float r4 = r4 - r2
            float r4 = r4 * r14
            float r2 = r2 + r4
            float r4 = r1.f1902l
            float r5 = r3.f1902l
            float r5 = r5 - r4
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r5 = r1.f1903m
            float r6 = r3.f1903m
            float r7 = r6 - r5
            float r7 = r7 * r14
            float r7 = r7 + r5
            float r1 = r1.f1904n
            float r3 = r3.f1904n
            float r8 = r3 - r1
            float r8 = r8 * r14
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0235
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0235
            boolean r1 = r0.f1872d
            if (r1 == 0) goto L_0x0244
        L_0x0235:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
            r0.f1872d = r15
        L_0x0244:
            r11.layout(r10, r9, r2, r4)
        L_0x0247:
            java.util.HashMap<java.lang.String, e.f.b.a.b> r1 = r0.f1860C
            if (r1 == 0) goto L_0x0276
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0253:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0276
            java.lang.Object r1 = r8.next()
            e.f.b.a.b r1 = (p082e.p099f.p106b.p107a.C3566b) r1
            boolean r2 = r1 instanceof p082e.p099f.p106b.p107a.C3566b.C3570d
            if (r2 == 0) goto L_0x0272
            e.f.b.a.b$d r1 = (p082e.p099f.p106b.p107a.C3566b.C3570d) r1
            double[] r2 = r0.f1887s
            r4 = r2[r15]
            r6 = r2[r19]
            r2 = r21
            r3 = r14
            r1.mo12868k(r2, r3, r4, r6)
            goto L_0x0253
        L_0x0272:
            r1.mo12867j(r11, r14)
            goto L_0x0253
        L_0x0276:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0396n.mo2603x(android.view.View, float, long, e.f.a.k.a.d):boolean");
    }

    /* renamed from: z */
    public void mo2604z() {
        this.f1872d = true;
    }
}
