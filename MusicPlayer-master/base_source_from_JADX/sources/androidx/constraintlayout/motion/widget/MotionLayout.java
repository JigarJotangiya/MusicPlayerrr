package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.C0400q;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0427b;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.C0439f;
import androidx.constraintlayout.widget.C0442h;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p082e.p099f.p100a.p101k.p102a.C3502d;
import p082e.p099f.p100a.p104m.C3521a;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3530f;
import p082e.p099f.p100a.p104m.C3531g;
import p082e.p099f.p100a.p104m.C3533h;
import p082e.p099f.p100a.p104m.C3535i;
import p082e.p099f.p100a.p104m.C3536j;
import p082e.p099f.p100a.p104m.C3538l;
import p082e.p099f.p100a.p104m.C3539m;
import p082e.p099f.p106b.p107a.C3565a;
import p082e.p099f.p106b.p107a.C3596d;
import p082e.p109h.p119p.C3766n;

public class MotionLayout extends ConstraintLayout implements C3766n {

    /* renamed from: Y0 */
    public static boolean f1622Y0;

    /* renamed from: A */
    C0400q f1623A;

    /* renamed from: A0 */
    int f1624A0;

    /* renamed from: B */
    Interpolator f1625B;

    /* renamed from: B0 */
    int f1626B0;

    /* renamed from: C */
    Interpolator f1627C = null;

    /* renamed from: C0 */
    int f1628C0;

    /* renamed from: D */
    float f1629D = 0.0f;

    /* renamed from: D0 */
    float f1630D0;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f1631E = -1;

    /* renamed from: E0 */
    private C3502d f1632E0 = new C3502d();

    /* renamed from: F */
    int f1633F = -1;

    /* renamed from: F0 */
    private boolean f1634F0 = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f1635G = -1;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public C0375i f1636G0;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f1637H = 0;

    /* renamed from: H0 */
    private Runnable f1638H0 = null;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f1639I = 0;

    /* renamed from: I0 */
    private int[] f1640I0 = null;

    /* renamed from: J */
    private boolean f1641J = true;

    /* renamed from: J0 */
    int f1642J0 = 0;

    /* renamed from: K */
    HashMap<View, C0396n> f1643K = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public boolean f1644K0 = false;

    /* renamed from: L */
    private long f1645L = 0;

    /* renamed from: L0 */
    int f1646L0 = 0;

    /* renamed from: M */
    private float f1647M = 1.0f;

    /* renamed from: M0 */
    HashMap<View, C3596d> f1648M0 = new HashMap<>();

    /* renamed from: N */
    float f1649N = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public int f1650N0;

    /* renamed from: O */
    float f1651O = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public int f1652O0;

    /* renamed from: P */
    private long f1653P;

    /* renamed from: P0 */
    Rect f1654P0 = new Rect();

    /* renamed from: Q */
    float f1655Q = 0.0f;

    /* renamed from: Q0 */
    private boolean f1656Q0 = false;

    /* renamed from: R */
    private boolean f1657R;

    /* renamed from: R0 */
    C0377k f1658R0 = C0377k.UNDEFINED;

    /* renamed from: S */
    boolean f1659S = false;

    /* renamed from: S0 */
    C0372f f1660S0 = new C0372f();

    /* renamed from: T */
    private C0376j f1661T;

    /* renamed from: T0 */
    private boolean f1662T0 = false;

    /* renamed from: U */
    private float f1663U;

    /* renamed from: U0 */
    private RectF f1664U0 = new RectF();

    /* renamed from: V */
    private float f1665V;

    /* renamed from: V0 */
    private View f1666V0 = null;

    /* renamed from: W */
    int f1667W = 0;

    /* renamed from: W0 */
    private Matrix f1668W0 = null;

    /* renamed from: X0 */
    ArrayList<Integer> f1669X0 = new ArrayList<>();

    /* renamed from: a0 */
    C0371e f1670a0;

    /* renamed from: b0 */
    private boolean f1671b0 = false;

    /* renamed from: c0 */
    private C3565a f1672c0 = new C3565a();

    /* renamed from: d0 */
    private C0370d f1673d0 = new C0370d();

    /* renamed from: e0 */
    private C0380c f1674e0;

    /* renamed from: f0 */
    int f1675f0;

    /* renamed from: g0 */
    int f1676g0;

    /* renamed from: h0 */
    boolean f1677h0 = false;

    /* renamed from: i0 */
    float f1678i0;

    /* renamed from: j0 */
    float f1679j0;

    /* renamed from: k0 */
    long f1680k0;

    /* renamed from: l0 */
    float f1681l0;

    /* renamed from: m0 */
    private boolean f1682m0 = false;

    /* renamed from: n0 */
    private ArrayList<MotionHelper> f1683n0 = null;

    /* renamed from: o0 */
    private ArrayList<MotionHelper> f1684o0 = null;

    /* renamed from: p0 */
    private ArrayList<MotionHelper> f1685p0 = null;

    /* renamed from: q0 */
    private CopyOnWriteArrayList<C0376j> f1686q0 = null;

    /* renamed from: r0 */
    private int f1687r0 = 0;

    /* renamed from: s0 */
    private long f1688s0 = -1;

    /* renamed from: t0 */
    private float f1689t0 = 0.0f;

    /* renamed from: u0 */
    private int f1690u0 = 0;

    /* renamed from: v0 */
    private float f1691v0 = 0.0f;

    /* renamed from: w0 */
    protected boolean f1692w0 = false;

    /* renamed from: x0 */
    int f1693x0;

    /* renamed from: y0 */
    int f1694y0;

    /* renamed from: z0 */
    int f1695z0;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    class C0367a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ View f1696g;

        C0367a(MotionLayout motionLayout, View view) {
            this.f1696g = view;
        }

        public void run() {
            this.f1696g.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    class C0368b implements Runnable {
        C0368b() {
        }

        public void run() {
            MotionLayout.this.f1636G0.mo2529a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    static /* synthetic */ class C0369c {

        /* renamed from: a */
        static final /* synthetic */ int[] f1698a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$k[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1698a = r0
                androidx.constraintlayout.motion.widget.MotionLayout$k r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1698a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$k r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1698a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$k r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1698a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$k r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C0369c.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    class C0370d extends C0398o {

        /* renamed from: a */
        float f1699a = 0.0f;

        /* renamed from: b */
        float f1700b = 0.0f;

        /* renamed from: c */
        float f1701c;

        C0370d() {
        }

        /* renamed from: a */
        public float mo2510a() {
            return MotionLayout.this.f1629D;
        }

        /* renamed from: b */
        public void mo2511b(float f, float f2, float f3) {
            this.f1699a = f;
            this.f1700b = f2;
            this.f1701c = f3;
        }

        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f1699a;
            if (f4 > 0.0f) {
                float f5 = this.f1701c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.f1629D = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.f1700b;
            } else {
                float f6 = this.f1701c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.f1629D = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.f1700b;
            }
            return f2 + f3;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    private class C0371e {

        /* renamed from: a */
        float[] f1703a;

        /* renamed from: b */
        int[] f1704b;

        /* renamed from: c */
        float[] f1705c;

        /* renamed from: d */
        Path f1706d;

        /* renamed from: e */
        Paint f1707e;

        /* renamed from: f */
        Paint f1708f;

        /* renamed from: g */
        Paint f1709g;

        /* renamed from: h */
        Paint f1710h;

        /* renamed from: i */
        Paint f1711i;

        /* renamed from: j */
        private float[] f1712j;

        /* renamed from: k */
        DashPathEffect f1713k;

        /* renamed from: l */
        int f1714l;

        /* renamed from: m */
        Rect f1715m = new Rect();

        /* renamed from: n */
        boolean f1716n = false;

        /* renamed from: o */
        int f1717o = 1;

        public C0371e() {
            Paint paint = new Paint();
            this.f1707e = paint;
            paint.setAntiAlias(true);
            this.f1707e.setColor(-21965);
            this.f1707e.setStrokeWidth(2.0f);
            this.f1707e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f1708f = paint2;
            paint2.setAntiAlias(true);
            this.f1708f.setColor(-2067046);
            this.f1708f.setStrokeWidth(2.0f);
            this.f1708f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f1709g = paint3;
            paint3.setAntiAlias(true);
            this.f1709g.setColor(-13391360);
            this.f1709g.setStrokeWidth(2.0f);
            this.f1709g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f1710h = paint4;
            paint4.setAntiAlias(true);
            this.f1710h.setColor(-13391360);
            this.f1710h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1712j = new float[8];
            Paint paint5 = new Paint();
            this.f1711i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f1713k = dashPathEffect;
            this.f1709g.setPathEffect(dashPathEffect);
            this.f1705c = new float[100];
            this.f1704b = new int[50];
            if (this.f1716n) {
                this.f1707e.setStrokeWidth(8.0f);
                this.f1711i.setStrokeWidth(8.0f);
                this.f1708f.setStrokeWidth(8.0f);
                this.f1717o = 4;
            }
        }

        /* renamed from: c */
        private void m2193c(Canvas canvas) {
            canvas.drawLines(this.f1703a, this.f1707e);
        }

        /* renamed from: d */
        private void m2194d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f1714l; i++) {
                int[] iArr = this.f1704b;
                if (iArr[i] == 1) {
                    z = true;
                }
                if (iArr[i] == 0) {
                    z2 = true;
                }
            }
            if (z) {
                m2197g(canvas);
            }
            if (z2) {
                m2195e(canvas);
            }
        }

        /* renamed from: e */
        private void m2195e(Canvas canvas) {
            float[] fArr = this.f1703a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f1709g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f1709g);
        }

        /* renamed from: f */
        private void m2196f(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f1703a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder sb = new StringBuilder(15);
            sb.append(((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            String sb2 = sb.toString();
            mo2515l(sb2, this.f1710h);
            canvas2.drawText(sb2, ((min2 / 2.0f) - ((float) (this.f1715m.width() / 2))) + min, f2 - 20.0f, this.f1710h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f1709g);
            StringBuilder sb3 = new StringBuilder(15);
            sb3.append(((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            String sb4 = sb3.toString();
            mo2515l(sb4, this.f1710h);
            canvas2.drawText(sb4, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f1715m.height() / 2))), this.f1710h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f1709g);
        }

        /* renamed from: g */
        private void m2197g(Canvas canvas) {
            float[] fArr = this.f1703a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f1709g);
        }

        /* renamed from: h */
        private void m2198h(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1703a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f3 - f5), (double) (f4 - f6));
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot((double) (f10 - f), (double) (f11 - f2));
            StringBuilder sb = new StringBuilder(15);
            sb.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String sb2 = sb.toString();
            mo2515l(sb2, this.f1710h);
            canvas.drawTextOnPath(sb2, path, (hypot2 / 2.0f) - ((float) (this.f1715m.width() / 2)), -20.0f, this.f1710h);
            canvas.drawLine(f, f2, f10, f11, this.f1709g);
        }

        /* renamed from: i */
        private void m2199i(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            StringBuilder sb = new StringBuilder(15);
            sb.append(((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            String sb2 = sb.toString();
            mo2515l(sb2, this.f1710h);
            canvas2.drawText(sb2, ((f / 2.0f) - ((float) (this.f1715m.width() / 2))) + 0.0f, f2 - 20.0f, this.f1710h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f1709g);
            StringBuilder sb3 = new StringBuilder(15);
            sb3.append(((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            String sb4 = sb3.toString();
            mo2515l(sb4, this.f1710h);
            canvas2.drawText(sb4, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.f1715m.height() / 2))), this.f1710h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f1709g);
        }

        /* renamed from: j */
        private void m2200j(Canvas canvas, C0396n nVar) {
            this.f1706d.reset();
            for (int i = 0; i <= 50; i++) {
                nVar.mo2587e(((float) i) / ((float) 50), this.f1712j, 0);
                Path path = this.f1706d;
                float[] fArr = this.f1712j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f1706d;
                float[] fArr2 = this.f1712j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f1706d;
                float[] fArr3 = this.f1712j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f1706d;
                float[] fArr4 = this.f1712j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f1706d.close();
            }
            this.f1707e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f1706d, this.f1707e);
            canvas.translate(-2.0f, -2.0f);
            this.f1707e.setColor(-65536);
            canvas.drawPath(this.f1706d, this.f1707e);
        }

        /* renamed from: k */
        private void m2201k(Canvas canvas, int i, int i2, C0396n nVar) {
            int i3;
            int i4;
            float f;
            float f2;
            Canvas canvas2 = canvas;
            int i5 = i;
            C0396n nVar2 = nVar;
            View view = nVar2.f1870b;
            if (view != null) {
                i4 = view.getWidth();
                i3 = nVar2.f1870b.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            for (int i6 = 1; i6 < i2 - 1; i6++) {
                if (i5 != 4 || this.f1704b[i6 - 1] != 0) {
                    float[] fArr = this.f1705c;
                    int i7 = i6 * 2;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + 1];
                    this.f1706d.reset();
                    this.f1706d.moveTo(f3, f4 + 10.0f);
                    this.f1706d.lineTo(f3 + 10.0f, f4);
                    this.f1706d.lineTo(f3, f4 - 10.0f);
                    this.f1706d.lineTo(f3 - 10.0f, f4);
                    this.f1706d.close();
                    int i8 = i6 - 1;
                    nVar2.mo2597q(i8);
                    if (i5 == 4) {
                        int[] iArr = this.f1704b;
                        if (iArr[i8] == 1) {
                            m2198h(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i8] == 0) {
                            m2196f(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i8] == 2) {
                            f2 = f4;
                            f = f3;
                            m2199i(canvas, f3 - 0.0f, f4 - 0.0f, i4, i3);
                            canvas2.drawPath(this.f1706d, this.f1711i);
                        }
                        f2 = f4;
                        f = f3;
                        canvas2.drawPath(this.f1706d, this.f1711i);
                    } else {
                        f2 = f4;
                        f = f3;
                    }
                    if (i5 == 2) {
                        m2198h(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i5 == 3) {
                        m2196f(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i5 == 6) {
                        m2199i(canvas, f - 0.0f, f2 - 0.0f, i4, i3);
                    }
                    canvas2.drawPath(this.f1706d, this.f1711i);
                }
            }
            float[] fArr2 = this.f1703a;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f1708f);
                float[] fArr3 = this.f1703a;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f1708f);
            }
        }

        /* renamed from: a */
        public void mo2513a(Canvas canvas, HashMap<View, C0396n> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String resourceName = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f1635G);
                    float progress = MotionLayout.this.getProgress();
                    StringBuilder sb = new StringBuilder(String.valueOf(resourceName).length() + 16);
                    sb.append(resourceName);
                    sb.append(":");
                    sb.append(progress);
                    String sb2 = sb.toString();
                    canvas.drawText(sb2, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f1710h);
                    canvas.drawText(sb2, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f1707e);
                }
                for (C0396n next : hashMap.values()) {
                    int m = next.mo2594m();
                    if (i2 > 0 && m == 0) {
                        m = 1;
                    }
                    if (m != 0) {
                        this.f1714l = next.mo2585c(this.f1705c, this.f1704b);
                        if (m >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.f1703a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.f1703a = new float[(i3 * 2)];
                                this.f1706d = new Path();
                            }
                            int i4 = this.f1717o;
                            canvas.translate((float) i4, (float) i4);
                            this.f1707e.setColor(1996488704);
                            this.f1711i.setColor(1996488704);
                            this.f1708f.setColor(1996488704);
                            this.f1709g.setColor(1996488704);
                            next.mo2586d(this.f1703a, i3);
                            mo2514b(canvas, m, this.f1714l, next);
                            this.f1707e.setColor(-21965);
                            this.f1708f.setColor(-2067046);
                            this.f1711i.setColor(-2067046);
                            this.f1709g.setColor(-13391360);
                            int i5 = this.f1717o;
                            canvas.translate((float) (-i5), (float) (-i5));
                            mo2514b(canvas, m, this.f1714l, next);
                            if (m == 5) {
                                m2200j(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: b */
        public void mo2514b(Canvas canvas, int i, int i2, C0396n nVar) {
            if (i == 4) {
                m2194d(canvas);
            }
            if (i == 2) {
                m2197g(canvas);
            }
            if (i == 3) {
                m2195e(canvas);
            }
            m2193c(canvas);
            m2201k(canvas, i, i2, nVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo2515l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f1715m);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    class C0372f {

        /* renamed from: a */
        C3530f f1719a = new C3530f();

        /* renamed from: b */
        C3530f f1720b = new C3530f();

        /* renamed from: c */
        C0430c f1721c = null;

        /* renamed from: d */
        C0430c f1722d = null;

        /* renamed from: e */
        int f1723e;

        /* renamed from: f */
        int f1724f;

        C0372f() {
        }

        /* renamed from: b */
        private void m2205b(int i, int i2) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f1633F == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                C3530f fVar = this.f1720b;
                C0430c cVar = this.f1722d;
                motionLayout2.mo2886v(fVar, optimizationLevel, (cVar == null || cVar.f2321c == 0) ? i : i2, (cVar == null || cVar.f2321c == 0) ? i2 : i);
                C0430c cVar2 = this.f1721c;
                if (cVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    C3530f fVar2 = this.f1719a;
                    int i3 = cVar2.f2321c;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout3.mo2886v(fVar2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            C0430c cVar3 = this.f1721c;
            if (cVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                C3530f fVar3 = this.f1719a;
                int i5 = cVar3.f2321c;
                motionLayout4.mo2886v(fVar3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            C3530f fVar4 = this.f1720b;
            C0430c cVar4 = this.f1722d;
            int i6 = (cVar4 == null || cVar4.f2321c == 0) ? i : i2;
            if (cVar4 == null || cVar4.f2321c == 0) {
                i = i2;
            }
            motionLayout5.mo2886v(fVar4, optimizationLevel, i6, i);
        }

        /* renamed from: j */
        private void m2206j(C3530f fVar, C0430c cVar) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, fVar);
            sparseArray.put(MotionLayout.this.getId(), fVar);
            if (!(cVar == null || cVar.f2321c == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.mo2886v(this.f1720b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<C3527e> it = fVar.mo12814o1().iterator();
            while (it.hasNext()) {
                C3527e next = it.next();
                sparseArray.put(((View) next.mo12710u()).getId(), next);
            }
            Iterator<C3527e> it2 = fVar.mo12814o1().iterator();
            while (it2.hasNext()) {
                C3527e next2 = it2.next();
                View view = (View) next2.mo12710u();
                cVar.mo2958l(view.getId(), layoutParams);
                next2.mo12683h1(cVar.mo2946C(view.getId()));
                next2.mo12632I0(cVar.mo2966x(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cVar.mo2956j((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).mo2858w();
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                MotionLayout.this.mo2860d(false, view, next2, layoutParams, sparseArray);
                if (cVar.mo2945B(view.getId()) == 1) {
                    next2.mo12681g1(view.getVisibility());
                } else {
                    next2.mo12681g1(cVar.mo2944A(view.getId()));
                }
            }
            Iterator<C3527e> it3 = fVar.mo12814o1().iterator();
            while (it3.hasNext()) {
                C3527e next3 = it3.next();
                if (next3 instanceof C3539m) {
                    C3535i iVar = (C3535i) next3;
                    ((ConstraintHelper) next3.mo12710u()).mo2426u(fVar, iVar, sparseArray);
                    ((C3539m) iVar).mo12805r1();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0177 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2516a() {
            /*
                r19 = this;
                r0 = r19
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r1 = r1.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.n> r2 = r2.f1643K
                r2.clear()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                int[] r3 = new int[r1]
                r5 = 0
            L_0x0017:
                if (r5 >= r1) goto L_0x0037
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.n r7 = new androidx.constraintlayout.motion.widget.n
                r7.<init>(r6)
                int r8 = r6.getId()
                r3[r5] = r8
                r2.put(r8, r7)
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.n> r8 = r8.f1643K
                r8.put(r6, r7)
                int r5 = r5 + 1
                goto L_0x0017
            L_0x0037:
                r5 = 0
            L_0x0038:
                if (r5 >= r1) goto L_0x017d
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.n> r7 = r7.f1643K
                java.lang.Object r7 = r7.get(r6)
                r13 = r7
                androidx.constraintlayout.motion.widget.n r13 = (androidx.constraintlayout.motion.widget.C0396n) r13
                if (r13 != 0) goto L_0x0051
                r18 = r2
                goto L_0x0177
            L_0x0051:
                androidx.constraintlayout.widget.c r7 = r0.f1721c
                java.lang.String r14 = ")"
                java.lang.String r15 = " ("
                java.lang.String r12 = "no widget for  "
                java.lang.String r11 = "MotionLayout"
                if (r7 == 0) goto L_0x00d1
                e.f.a.m.f r7 = r0.f1719a
                e.f.a.m.e r7 = r0.mo2518d(r7, r6)
                if (r7 == 0) goto L_0x007e
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r7 = r8.m2121B0(r7)
                androidx.constraintlayout.widget.c r8 = r0.f1721c
                androidx.constraintlayout.motion.widget.MotionLayout r9 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r9 = r9.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r10.getHeight()
                r13.mo2578F(r7, r8, r9, r10)
                goto L_0x00ff
            L_0x007e:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.f1667W
                if (r7 == 0) goto L_0x00ff
                java.lang.String r7 = androidx.constraintlayout.motion.widget.C0379b.m2240b()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.C0379b.m2242d(r6)
                java.lang.Class r9 = r6.getClass()
                java.lang.String r9 = r9.getName()
                java.lang.String r10 = java.lang.String.valueOf(r7)
                int r10 = r10.length()
                int r10 = r10 + 18
                java.lang.String r16 = java.lang.String.valueOf(r8)
                int r16 = r16.length()
                int r10 = r10 + r16
                java.lang.String r16 = java.lang.String.valueOf(r9)
                int r16 = r16.length()
                int r10 = r10 + r16
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r10)
                r4.append(r7)
                r4.append(r12)
                r4.append(r8)
                r4.append(r15)
                r4.append(r9)
                r4.append(r14)
                java.lang.String r4 = r4.toString()
                android.util.Log.e(r11, r4)
                goto L_0x00ff
            L_0x00d1:
                androidx.constraintlayout.motion.widget.MotionLayout r4 = androidx.constraintlayout.motion.widget.MotionLayout.this
                boolean r4 = r4.f1644K0
                if (r4 == 0) goto L_0x00ff
                androidx.constraintlayout.motion.widget.MotionLayout r4 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, e.f.b.a.d> r4 = r4.f1648M0
                java.lang.Object r4 = r4.get(r6)
                r8 = r4
                e.f.b.a.d r8 = (p082e.p099f.p106b.p107a.C3596d) r8
                androidx.constraintlayout.motion.widget.MotionLayout r4 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r4.f1646L0
                int r4 = r4.f1650N0
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r17 = r7.f1652O0
                r7 = r13
                r9 = r6
                r18 = r2
                r2 = r11
                r11 = r4
                r4 = r12
                r12 = r17
                r7.mo2579G(r8, r9, r10, r11, r12)
                goto L_0x0103
            L_0x00ff:
                r18 = r2
                r2 = r11
                r4 = r12
            L_0x0103:
                androidx.constraintlayout.widget.c r7 = r0.f1722d
                if (r7 == 0) goto L_0x0177
                e.f.a.m.f r7 = r0.f1720b
                e.f.a.m.e r7 = r0.mo2518d(r7, r6)
                if (r7 == 0) goto L_0x0127
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r2 = r2.m2121B0(r7)
                androidx.constraintlayout.widget.c r4 = r0.f1722d
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r6 = r6.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.getHeight()
                r13.mo2575C(r2, r4, r6, r7)
                goto L_0x0177
            L_0x0127:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.f1667W
                if (r7 == 0) goto L_0x0177
                java.lang.String r7 = androidx.constraintlayout.motion.widget.C0379b.m2240b()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.C0379b.m2242d(r6)
                java.lang.Class r6 = r6.getClass()
                java.lang.String r6 = r6.getName()
                java.lang.String r9 = java.lang.String.valueOf(r7)
                int r9 = r9.length()
                int r9 = r9 + 18
                java.lang.String r10 = java.lang.String.valueOf(r8)
                int r10 = r10.length()
                int r9 = r9 + r10
                java.lang.String r10 = java.lang.String.valueOf(r6)
                int r10 = r10.length()
                int r9 = r9 + r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>(r9)
                r10.append(r7)
                r10.append(r4)
                r10.append(r8)
                r10.append(r15)
                r10.append(r6)
                r10.append(r14)
                java.lang.String r4 = r10.toString()
                android.util.Log.e(r2, r4)
            L_0x0177:
                int r5 = r5 + 1
                r2 = r18
                goto L_0x0038
            L_0x017d:
                r18 = r2
                r4 = 0
            L_0x0180:
                if (r4 >= r1) goto L_0x01a1
                r2 = r3[r4]
                r5 = r18
                java.lang.Object r2 = r5.get(r2)
                androidx.constraintlayout.motion.widget.n r2 = (androidx.constraintlayout.motion.widget.C0396n) r2
                int r6 = r2.mo2589h()
                r7 = -1
                if (r6 == r7) goto L_0x019c
                java.lang.Object r6 = r5.get(r6)
                androidx.constraintlayout.motion.widget.n r6 = (androidx.constraintlayout.motion.widget.C0396n) r6
                r2.mo2582J(r6)
            L_0x019c:
                int r4 = r4 + 1
                r18 = r5
                goto L_0x0180
            L_0x01a1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C0372f.mo2516a():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2517c(C3530f fVar, C3530f fVar2) {
            C3527e eVar;
            ArrayList<C3527e> o1 = fVar.mo12814o1();
            HashMap hashMap = new HashMap();
            hashMap.put(fVar, fVar2);
            fVar2.mo12814o1().clear();
            fVar2.mo12580n(fVar, hashMap);
            Iterator<C3527e> it = o1.iterator();
            while (it.hasNext()) {
                C3527e next = it.next();
                if (next instanceof C3521a) {
                    eVar = new C3521a();
                } else if (next instanceof C3533h) {
                    eVar = new C3533h();
                } else if (next instanceof C3531g) {
                    eVar = new C3531g();
                } else if (next instanceof C3538l) {
                    eVar = new C3538l();
                } else if (next instanceof C3535i) {
                    eVar = new C3536j();
                } else {
                    eVar = new C3527e();
                }
                fVar2.mo12813b(eVar);
                hashMap.put(next, eVar);
            }
            Iterator<C3527e> it2 = o1.iterator();
            while (it2.hasNext()) {
                C3527e next2 = it2.next();
                ((C3527e) hashMap.get(next2)).mo12580n(next2, hashMap);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3527e mo2518d(C3530f fVar, View view) {
            if (fVar.mo12710u() == view) {
                return fVar;
            }
            ArrayList<C3527e> o1 = fVar.mo12814o1();
            int size = o1.size();
            for (int i = 0; i < size; i++) {
                C3527e eVar = o1.get(i);
                if (eVar.mo12710u() == view) {
                    return eVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2519e(C3530f fVar, C0430c cVar, C0430c cVar2) {
            this.f1721c = cVar;
            this.f1722d = cVar2;
            this.f1719a = new C3530f();
            this.f1720b = new C3530f();
            this.f1719a.mo12738S1(MotionLayout.this.f2167i.mo12727F1());
            this.f1720b.mo12738S1(MotionLayout.this.f2167i.mo12727F1());
            this.f1719a.mo12816r1();
            this.f1720b.mo12816r1();
            mo2517c(MotionLayout.this.f2167i, this.f1719a);
            mo2517c(MotionLayout.this.f2167i, this.f1720b);
            if (((double) MotionLayout.this.f1651O) > 0.5d) {
                if (cVar != null) {
                    m2206j(this.f1719a, cVar);
                }
                m2206j(this.f1720b, cVar2);
            } else {
                m2206j(this.f1720b, cVar2);
                if (cVar != null) {
                    m2206j(this.f1719a, cVar);
                }
            }
            this.f1719a.mo12741V1(MotionLayout.this.mo2875r());
            this.f1719a.mo12743X1();
            this.f1720b.mo12741V1(MotionLayout.this.mo2875r());
            this.f1720b.mo12743X1();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C3530f fVar2 = this.f1719a;
                    C3527e.C3529b bVar = C3527e.C3529b.WRAP_CONTENT;
                    fVar2.mo12640M0(bVar);
                    this.f1720b.mo12640M0(bVar);
                }
                if (layoutParams.height == -2) {
                    C3530f fVar3 = this.f1719a;
                    C3527e.C3529b bVar2 = C3527e.C3529b.WRAP_CONTENT;
                    fVar3.mo12674d1(bVar2);
                    this.f1720b.mo12674d1(bVar2);
                }
            }
        }

        /* renamed from: f */
        public boolean mo2520f(int i, int i2) {
            return (i == this.f1723e && i2 == this.f1724f) ? false : true;
        }

        /* renamed from: g */
        public void mo2521g(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f1626B0 = mode;
            motionLayout.f1628C0 = mode2;
            motionLayout.getOptimizationLevel();
            m2205b(i, i2);
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                m2205b(i, i2);
                MotionLayout.this.f1693x0 = this.f1719a.mo12657V();
                MotionLayout.this.f1694y0 = this.f1719a.mo12720z();
                MotionLayout.this.f1695z0 = this.f1720b.mo12657V();
                MotionLayout.this.f1624A0 = this.f1720b.mo12720z();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.f1692w0 = (motionLayout2.f1693x0 == motionLayout2.f1695z0 && motionLayout2.f1694y0 == motionLayout2.f1624A0) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.f1693x0;
            int i4 = motionLayout3.f1694y0;
            int i5 = motionLayout3.f1626B0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (((float) i3) + (motionLayout3.f1630D0 * ((float) (motionLayout3.f1695z0 - i3))));
            }
            int i6 = i3;
            int i7 = motionLayout3.f1628C0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (((float) i4) + (motionLayout3.f1630D0 * ((float) (motionLayout3.f1624A0 - i4))));
            }
            MotionLayout.this.mo2885u(i, i2, i6, i4, this.f1719a.mo12735N1() || this.f1720b.mo12735N1(), this.f1719a.mo12733L1() || this.f1720b.mo12733L1());
        }

        /* renamed from: h */
        public void mo2522h() {
            mo2521g(MotionLayout.this.f1637H, MotionLayout.this.f1639I);
            MotionLayout.this.m2119A0();
        }

        /* renamed from: i */
        public void mo2523i(int i, int i2) {
            this.f1723e = i;
            this.f1724f = i2;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    protected interface C0373g {
        /* renamed from: a */
        void mo2524a();

        /* renamed from: b */
        void mo2525b(MotionEvent motionEvent);

        /* renamed from: c */
        float mo2526c();

        /* renamed from: d */
        float mo2527d();

        /* renamed from: e */
        void mo2528e(int i);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    private static class C0374h implements C0373g {

        /* renamed from: b */
        private static C0374h f1726b = new C0374h();

        /* renamed from: a */
        VelocityTracker f1727a;

        private C0374h() {
        }

        /* renamed from: f */
        public static C0374h m2220f() {
            f1726b.f1727a = VelocityTracker.obtain();
            return f1726b;
        }

        /* renamed from: a */
        public void mo2524a() {
            VelocityTracker velocityTracker = this.f1727a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1727a = null;
            }
        }

        /* renamed from: b */
        public void mo2525b(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f1727a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        /* renamed from: c */
        public float mo2526c() {
            VelocityTracker velocityTracker = this.f1727a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        /* renamed from: d */
        public float mo2527d() {
            VelocityTracker velocityTracker = this.f1727a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        /* renamed from: e */
        public void mo2528e(int i) {
            VelocityTracker velocityTracker = this.f1727a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    class C0375i {

        /* renamed from: a */
        float f1728a = Float.NaN;

        /* renamed from: b */
        float f1729b = Float.NaN;

        /* renamed from: c */
        int f1730c = -1;

        /* renamed from: d */
        int f1731d = -1;

        C0375i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2529a() {
            int i = this.f1730c;
            if (!(i == -1 && this.f1731d == -1)) {
                if (i == -1) {
                    MotionLayout.this.mo2442G0(this.f1731d);
                } else {
                    int i2 = this.f1731d;
                    if (i2 == -1) {
                        MotionLayout.this.mo2506y0(i, -1, -1);
                    } else {
                        MotionLayout.this.mo2507z0(i, i2);
                    }
                }
                MotionLayout.this.setState(C0377k.SETUP);
            }
            if (!Float.isNaN(this.f1729b)) {
                MotionLayout.this.mo2505x0(this.f1728a, this.f1729b);
                this.f1728a = Float.NaN;
                this.f1729b = Float.NaN;
                this.f1730c = -1;
                this.f1731d = -1;
            } else if (!Float.isNaN(this.f1728a)) {
                MotionLayout.this.setProgress(this.f1728a);
            }
        }

        /* renamed from: b */
        public Bundle mo2530b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1728a);
            bundle.putFloat("motion.velocity", this.f1729b);
            bundle.putInt("motion.StartState", this.f1730c);
            bundle.putInt("motion.EndState", this.f1731d);
            return bundle;
        }

        /* renamed from: c */
        public void mo2531c() {
            this.f1731d = MotionLayout.this.f1635G;
            this.f1730c = MotionLayout.this.f1631E;
            this.f1729b = MotionLayout.this.getVelocity();
            this.f1728a = MotionLayout.this.getProgress();
        }

        /* renamed from: d */
        public void mo2532d(int i) {
            this.f1731d = i;
        }

        /* renamed from: e */
        public void mo2533e(float f) {
            this.f1728a = f;
        }

        /* renamed from: f */
        public void mo2534f(int i) {
            this.f1730c = i;
        }

        /* renamed from: g */
        public void mo2535g(Bundle bundle) {
            this.f1728a = bundle.getFloat("motion.progress");
            this.f1729b = bundle.getFloat("motion.velocity");
            this.f1730c = bundle.getInt("motion.StartState");
            this.f1731d = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void mo2536h(float f) {
            this.f1729b = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$j */
    public interface C0376j {
        /* renamed from: a */
        void mo2367a(MotionLayout motionLayout, int i, int i2, float f);

        /* renamed from: b */
        void mo2432b(MotionLayout motionLayout, int i, int i2);

        /* renamed from: c */
        void mo2433c(MotionLayout motionLayout, int i, boolean z, float f);

        /* renamed from: d */
        void mo2368d(MotionLayout motionLayout, int i);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$k */
    enum C0377k {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context) {
        super(context);
        m2153r0((AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m2119A0() {
        int childCount = getChildCount();
        this.f1660S0.mo2516a();
        boolean z = true;
        this.f1659S = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.f1643K.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int j = this.f1623A.mo2649j();
        if (j != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0396n nVar = this.f1643K.get(getChildAt(i3));
                if (nVar != null) {
                    nVar.mo2576D(j);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f1643K.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            C0396n nVar2 = this.f1643K.get(getChildAt(i5));
            if (nVar2.mo2589h() != -1) {
                sparseBooleanArray.put(nVar2.mo2589h(), true);
                iArr[i4] = nVar2.mo2589h();
                i4++;
            }
        }
        if (this.f1685p0 != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                C0396n nVar3 = this.f1643K.get(findViewById(iArr[i6]));
                if (nVar3 != null) {
                    this.f1623A.mo2658t(nVar3);
                }
            }
            Iterator<MotionHelper> it = this.f1685p0.iterator();
            while (it.hasNext()) {
                it.next().mo2424D(this, this.f1643K);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                C0396n nVar4 = this.f1643K.get(findViewById(iArr[i7]));
                if (nVar4 != null) {
                    nVar4.mo2581I(width, height, this.f1647M, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                C0396n nVar5 = this.f1643K.get(findViewById(iArr[i8]));
                if (nVar5 != null) {
                    this.f1623A.mo2658t(nVar5);
                    nVar5.mo2581I(width, height, this.f1647M, getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            C0396n nVar6 = this.f1643K.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && nVar6 != null) {
                this.f1623A.mo2658t(nVar6);
                nVar6.mo2581I(width, height, this.f1647M, getNanoTime());
            }
        }
        float E = this.f1623A.mo2629E();
        if (E != 0.0f) {
            boolean z2 = ((double) E) < 0.0d;
            float abs = Math.abs(E);
            float f = -3.4028235E38f;
            float f2 = Float.MAX_VALUE;
            int i10 = 0;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            while (true) {
                if (i10 >= childCount) {
                    z = false;
                    break;
                }
                C0396n nVar7 = this.f1643K.get(getChildAt(i10));
                if (!Float.isNaN(nVar7.f1880l)) {
                    break;
                }
                float n = nVar7.mo2595n();
                float o = nVar7.mo2596o();
                float f5 = z2 ? o - n : o + n;
                f3 = Math.min(f3, f5);
                f4 = Math.max(f4, f5);
                i10++;
            }
            if (z) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    C0396n nVar8 = this.f1643K.get(getChildAt(i11));
                    if (!Float.isNaN(nVar8.f1880l)) {
                        f2 = Math.min(f2, nVar8.f1880l);
                        f = Math.max(f, nVar8.f1880l);
                    }
                }
                while (i < childCount) {
                    C0396n nVar9 = this.f1643K.get(getChildAt(i));
                    if (!Float.isNaN(nVar9.f1880l)) {
                        nVar9.f1882n = 1.0f / (1.0f - abs);
                        if (z2) {
                            nVar9.f1881m = abs - (((f - nVar9.f1880l) / (f - f2)) * abs);
                        } else {
                            nVar9.f1881m = abs - (((nVar9.f1880l - f2) * abs) / (f - f2));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                C0396n nVar10 = this.f1643K.get(getChildAt(i));
                float n2 = nVar10.mo2595n();
                float o2 = nVar10.mo2596o();
                float f6 = z2 ? o2 - n2 : o2 + n2;
                nVar10.f1882n = 1.0f / (1.0f - abs);
                nVar10.f1881m = abs - (((f6 - f3) * abs) / (f4 - f3));
                i++;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public Rect m2121B0(C3527e eVar) {
        this.f1654P0.top = eVar.mo12661X();
        this.f1654P0.left = eVar.mo12659W();
        Rect rect = this.f1654P0;
        int V = eVar.mo12657V();
        Rect rect2 = this.f1654P0;
        rect.right = V + rect2.left;
        int z = eVar.mo12720z();
        Rect rect3 = this.f1654P0;
        rect2.bottom = z + rect3.top;
        return rect3;
    }

    /* renamed from: N0 */
    private static boolean m2134N0(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    /* renamed from: a0 */
    private boolean m2145a0(View view, MotionEvent motionEvent, float f, float f2) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f, f2);
        if (this.f1668W0 == null) {
            this.f1668W0 = new Matrix();
        }
        matrix.invert(this.f1668W0);
        obtain.transform(this.f1668W0);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    /* renamed from: b0 */
    private void m2146b0() {
        C0400q qVar = this.f1623A;
        if (qVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int F = qVar.mo2630F();
        C0400q qVar2 = this.f1623A;
        m2147c0(F, qVar2.mo2651l(qVar2.mo2630F()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<C0400q.C0402b> it = this.f1623A.mo2654o().iterator();
        while (it.hasNext()) {
            C0400q.C0402b next = it.next();
            if (next == this.f1623A.f1916c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            m2148d0(next);
            int A = next.mo2665A();
            int y = next.mo2677y();
            String c = C0379b.m2241c(getContext(), A);
            String c2 = C0379b.m2241c(getContext(), y);
            if (sparseIntArray.get(A) == y) {
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 53 + String.valueOf(c2).length());
                sb.append("CHECK: two transitions with the same start and end ");
                sb.append(c);
                sb.append("->");
                sb.append(c2);
                Log.e("MotionLayout", sb.toString());
            }
            if (sparseIntArray2.get(y) == A) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 43 + String.valueOf(c2).length());
                sb2.append("CHECK: you can't have reverse transitions");
                sb2.append(c);
                sb2.append("->");
                sb2.append(c2);
                Log.e("MotionLayout", sb2.toString());
            }
            sparseIntArray.put(A, y);
            sparseIntArray2.put(y, A);
            if (this.f1623A.mo2651l(A) == null) {
                String valueOf = String.valueOf(c);
                Log.e("MotionLayout", valueOf.length() != 0 ? " no such constraintSetStart ".concat(valueOf) : new String(" no such constraintSetStart "));
            }
            if (this.f1623A.mo2651l(y) == null) {
                String valueOf2 = String.valueOf(c);
                Log.e("MotionLayout", valueOf2.length() != 0 ? " no such constraintSetEnd ".concat(valueOf2) : new String(" no such constraintSetEnd "));
            }
        }
    }

    /* renamed from: c0 */
    private void m2147c0(int i, C0430c cVar) {
        String c = C0379b.m2241c(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                String name = childAt.getClass().getName();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 45 + String.valueOf(name).length());
                sb.append("CHECK: ");
                sb.append(c);
                sb.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb.append(name);
                sb.append(" does not!");
                Log.w("MotionLayout", sb.toString());
            }
            if (cVar.mo2965w(id) == null) {
                String d = C0379b.m2242d(childAt);
                StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 27 + String.valueOf(d).length());
                sb2.append("CHECK: ");
                sb2.append(c);
                sb2.append(" NO CONSTRAINTS for ");
                sb2.append(d);
                Log.w("MotionLayout", sb2.toString());
            }
        }
        int[] y = cVar.mo2967y();
        for (int i3 = 0; i3 < y.length; i3++) {
            int i4 = y[i3];
            String c2 = C0379b.m2241c(getContext(), i4);
            if (findViewById(y[i3]) == null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 27 + String.valueOf(c2).length());
                sb3.append("CHECK: ");
                sb3.append(c);
                sb3.append(" NO View matches id ");
                sb3.append(c2);
                Log.w("MotionLayout", sb3.toString());
            }
            if (cVar.mo2966x(i4) == -1) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(c).length() + 26 + String.valueOf(c2).length());
                sb4.append("CHECK: ");
                sb4.append(c);
                sb4.append("(");
                sb4.append(c2);
                sb4.append(") no LAYOUT_HEIGHT");
                Log.w("MotionLayout", sb4.toString());
            }
            if (cVar.mo2946C(i4) == -1) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(c).length() + 26 + String.valueOf(c2).length());
                sb5.append("CHECK: ");
                sb5.append(c);
                sb5.append("(");
                sb5.append(c2);
                sb5.append(") no LAYOUT_HEIGHT");
                Log.w("MotionLayout", sb5.toString());
            }
        }
    }

    /* renamed from: d0 */
    private void m2148d0(C0400q.C0402b bVar) {
        if (bVar.mo2665A() == bVar.mo2677y()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    /* renamed from: e0 */
    private void m2149e0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0396n nVar = this.f1643K.get(childAt);
            if (nVar != null) {
                nVar.mo2577E(childAt);
            }
        }
    }

    /* renamed from: h0 */
    private void m2150h0() {
        boolean z;
        float signum = Math.signum(this.f1655Q - this.f1651O);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f1625B;
        float f = this.f1651O + (!(interpolator instanceof C3565a) ? ((((float) (nanoTime - this.f1653P)) * signum) * 1.0E-9f) / this.f1647M : 0.0f);
        if (this.f1657R) {
            f = this.f1655Q;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f < this.f1655Q) && (signum > 0.0f || f > this.f1655Q)) {
            z = false;
        } else {
            f = this.f1655Q;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.f1671b0) {
                f = interpolator.getInterpolation(((float) (nanoTime - this.f1645L)) * 1.0E-9f);
            } else {
                f = interpolator.getInterpolation(f);
            }
        }
        if ((i > 0 && f >= this.f1655Q) || (signum <= 0.0f && f <= this.f1655Q)) {
            f = this.f1655Q;
        }
        this.f1630D0 = f;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f1627C;
        if (interpolator2 != null) {
            f = interpolator2.getInterpolation(f);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0396n nVar = this.f1643K.get(childAt);
            if (nVar != null) {
                nVar.mo2603x(childAt, f, nanoTime2, this.f1632E0);
            }
        }
        if (this.f1692w0) {
            requestLayout();
        }
    }

    /* renamed from: i0 */
    private void m2151i0() {
        CopyOnWriteArrayList<C0376j> copyOnWriteArrayList;
        if ((this.f1661T != null || ((copyOnWriteArrayList = this.f1686q0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1691v0 != this.f1649N) {
            if (this.f1690u0 != -1) {
                C0376j jVar = this.f1661T;
                if (jVar != null) {
                    jVar.mo2432b(this, this.f1631E, this.f1635G);
                }
                CopyOnWriteArrayList<C0376j> copyOnWriteArrayList2 = this.f1686q0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0376j> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo2432b(this, this.f1631E, this.f1635G);
                    }
                }
            }
            this.f1690u0 = -1;
            float f = this.f1649N;
            this.f1691v0 = f;
            C0376j jVar2 = this.f1661T;
            if (jVar2 != null) {
                jVar2.mo2367a(this, this.f1631E, this.f1635G, f);
            }
            CopyOnWriteArrayList<C0376j> copyOnWriteArrayList3 = this.f1686q0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<C0376j> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2367a(this, this.f1631E, this.f1635G, this.f1649N);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2152q0(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.m2152q0(r4, r5, r3, r11)
            if (r3 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x0075
            android.graphics.RectF r2 = r7.f1664U0
            int r3 = r10.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r10.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r10.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r10.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r11.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.f1664U0
            float r3 = r11.getX()
            float r4 = r11.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0075
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            boolean r8 = r7.m2145a0(r10, r11, r8, r9)
            if (r8 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = r0
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.m2152q0(float, float, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: r0 */
    private void m2153r0(AttributeSet attributeSet) {
        C0400q qVar;
        f1622Y0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.MotionLayout_layoutDescription) {
                    this.f1623A = new C0400q(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C0439f.MotionLayout_currentState) {
                    this.f1633F = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C0439f.MotionLayout_motionProgress) {
                    this.f1655Q = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f1659S = true;
                } else if (index == C0439f.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == C0439f.MotionLayout_showPaths) {
                    if (this.f1667W == 0) {
                        this.f1667W = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == C0439f.MotionLayout_motionDebug) {
                    this.f1667W = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f1623A == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f1623A = null;
            }
        }
        if (this.f1667W != 0) {
            m2146b0();
        }
        if (this.f1633F == -1 && (qVar = this.f1623A) != null) {
            this.f1633F = qVar.mo2630F();
            this.f1631E = this.f1623A.mo2630F();
            this.f1635G = this.f1623A.mo2656q();
        }
    }

    /* renamed from: v0 */
    private void m2154v0() {
        CopyOnWriteArrayList<C0376j> copyOnWriteArrayList;
        if (this.f1661T != null || ((copyOnWriteArrayList = this.f1686q0) != null && !copyOnWriteArrayList.isEmpty())) {
            Iterator<Integer> it = this.f1669X0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                C0376j jVar = this.f1661T;
                if (jVar != null) {
                    jVar.mo2368d(this, next.intValue());
                }
                CopyOnWriteArrayList<C0376j> copyOnWriteArrayList2 = this.f1686q0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0376j> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo2368d(this, next.intValue());
                    }
                }
            }
            this.f1669X0.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r10 != 7) goto L_0x00f1;
     */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2438C0(int r10, float r11, float r12) {
        /*
            r9 = this;
            androidx.constraintlayout.motion.widget.q r0 = r9.f1623A
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            float r0 = r9.f1651O
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r9.f1671b0 = r0
            long r1 = r9.getNanoTime()
            r9.f1645L = r1
            androidx.constraintlayout.motion.widget.q r1 = r9.f1623A
            int r1 = r1.mo2655p()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r9.f1647M = r1
            r9.f1655Q = r11
            r9.f1659S = r0
            r1 = 0
            r2 = 7
            r3 = 6
            r4 = 2
            if (r10 == 0) goto L_0x0093
            if (r10 == r0) goto L_0x0093
            if (r10 == r4) goto L_0x0093
            r5 = 4
            if (r10 == r5) goto L_0x0081
            r5 = 5
            if (r10 == r5) goto L_0x003b
            if (r10 == r3) goto L_0x0093
            if (r10 == r2) goto L_0x0093
            goto L_0x00f1
        L_0x003b:
            float r10 = r9.f1651O
            androidx.constraintlayout.motion.widget.q r0 = r9.f1623A
            float r0 = r0.mo2659u()
            boolean r10 = m2134N0(r12, r10, r0)
            if (r10 == 0) goto L_0x005c
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f1673d0
            float r11 = r9.f1651O
            androidx.constraintlayout.motion.widget.q r0 = r9.f1623A
            float r0 = r0.mo2659u()
            r10.mo2511b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f1673d0
            r9.f1625B = r10
            goto L_0x00f1
        L_0x005c:
            e.f.b.a.a r2 = r9.f1672c0
            float r3 = r9.f1651O
            float r6 = r9.f1647M
            androidx.constraintlayout.motion.widget.q r10 = r9.f1623A
            float r7 = r10.mo2659u()
            androidx.constraintlayout.motion.widget.q r10 = r9.f1623A
            float r8 = r10.mo2660v()
            r4 = r11
            r5 = r12
            r2.mo12863b(r3, r4, r5, r6, r7, r8)
            r9.f1629D = r1
            int r10 = r9.f1633F
            r9.f1655Q = r11
            r9.f1633F = r10
            e.f.b.a.a r10 = r9.f1672c0
            r9.f1625B = r10
            goto L_0x00f1
        L_0x0081:
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f1673d0
            float r11 = r9.f1651O
            androidx.constraintlayout.motion.widget.q r0 = r9.f1623A
            float r0 = r0.mo2659u()
            r10.mo2511b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f1673d0
            r9.f1625B = r10
            goto L_0x00f1
        L_0x0093:
            if (r10 == r0) goto L_0x009f
            if (r10 != r2) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            if (r10 == r4) goto L_0x009c
            if (r10 != r3) goto L_0x00a0
        L_0x009c:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a0
        L_0x009f:
            r11 = 0
        L_0x00a0:
            androidx.constraintlayout.motion.widget.q r10 = r9.f1623A
            int r10 = r10.mo2650k()
            if (r10 != 0) goto L_0x00c0
            e.f.b.a.a r0 = r9.f1672c0
            float r1 = r9.f1651O
            float r4 = r9.f1647M
            androidx.constraintlayout.motion.widget.q r10 = r9.f1623A
            float r5 = r10.mo2659u()
            androidx.constraintlayout.motion.widget.q r10 = r9.f1623A
            float r6 = r10.mo2660v()
            r2 = r11
            r3 = r12
            r0.mo12863b(r1, r2, r3, r4, r5, r6)
            goto L_0x00e7
        L_0x00c0:
            e.f.b.a.a r0 = r9.f1672c0
            float r1 = r9.f1651O
            androidx.constraintlayout.motion.widget.q r10 = r9.f1623A
            float r4 = r10.mo2626B()
            androidx.constraintlayout.motion.widget.q r10 = r9.f1623A
            float r5 = r10.mo2627C()
            androidx.constraintlayout.motion.widget.q r10 = r9.f1623A
            float r6 = r10.mo2625A()
            androidx.constraintlayout.motion.widget.q r10 = r9.f1623A
            float r7 = r10.mo2628D()
            androidx.constraintlayout.motion.widget.q r10 = r9.f1623A
            int r8 = r10.mo2663z()
            r2 = r11
            r3 = r12
            r0.mo12865d(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00e7:
            int r10 = r9.f1633F
            r9.f1655Q = r11
            r9.f1633F = r10
            e.f.b.a.a r10 = r9.f1672c0
            r9.f1625B = r10
        L_0x00f1:
            r10 = 0
            r9.f1657R = r10
            long r10 = r9.getNanoTime()
            r9.f1645L = r10
            r9.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo2438C0(int, float, float):void");
    }

    /* renamed from: D0 */
    public void mo2439D0() {
        mo2449Y(1.0f);
        this.f1638H0 = null;
    }

    /* renamed from: E0 */
    public void mo2440E0(Runnable runnable) {
        mo2449Y(1.0f);
        this.f1638H0 = runnable;
    }

    /* renamed from: F0 */
    public void mo2441F0() {
        mo2449Y(0.0f);
    }

    /* renamed from: G0 */
    public void mo2442G0(int i) {
        if (!isAttachedToWindow()) {
            if (this.f1636G0 == null) {
                this.f1636G0 = new C0375i();
            }
            this.f1636G0.mo2532d(i);
            return;
        }
        mo2444I0(i, -1, -1);
    }

    /* renamed from: H0 */
    public void mo2443H0(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f1636G0 == null) {
                this.f1636G0 = new C0375i();
            }
            this.f1636G0.mo2532d(i);
            return;
        }
        mo2445J0(i, -1, -1, i2);
    }

    /* renamed from: I0 */
    public void mo2444I0(int i, int i2, int i3) {
        mo2445J0(i, i2, i3, -1);
    }

    /* renamed from: J0 */
    public void mo2445J0(int i, int i2, int i3, int i4) {
        C0442h hVar;
        int a;
        C0400q qVar = this.f1623A;
        if (!(qVar == null || (hVar = qVar.f1915b) == null || (a = hVar.mo2990a(this.f1633F, i, (float) i2, (float) i3)) == -1)) {
            i = a;
        }
        int i5 = this.f1633F;
        if (i5 != i) {
            if (this.f1631E == i) {
                mo2449Y(0.0f);
                if (i4 > 0) {
                    this.f1647M = ((float) i4) / 1000.0f;
                }
            } else if (this.f1635G == i) {
                mo2449Y(1.0f);
                if (i4 > 0) {
                    this.f1647M = ((float) i4) / 1000.0f;
                }
            } else {
                this.f1635G = i;
                if (i5 != -1) {
                    mo2507z0(i5, i);
                    mo2449Y(1.0f);
                    this.f1651O = 0.0f;
                    mo2439D0();
                    if (i4 > 0) {
                        this.f1647M = ((float) i4) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.f1671b0 = false;
                this.f1655Q = 1.0f;
                this.f1649N = 0.0f;
                this.f1651O = 0.0f;
                this.f1653P = getNanoTime();
                this.f1645L = getNanoTime();
                this.f1657R = false;
                this.f1625B = null;
                if (i4 == -1) {
                    this.f1647M = ((float) this.f1623A.mo2655p()) / 1000.0f;
                }
                this.f1631E = -1;
                this.f1623A.mo2640X(-1, this.f1635G);
                SparseArray sparseArray = new SparseArray();
                if (i4 == 0) {
                    this.f1647M = ((float) this.f1623A.mo2655p()) / 1000.0f;
                } else if (i4 > 0) {
                    this.f1647M = ((float) i4) / 1000.0f;
                }
                int childCount = getChildCount();
                this.f1643K.clear();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    this.f1643K.put(childAt, new C0396n(childAt));
                    sparseArray.put(childAt.getId(), this.f1643K.get(childAt));
                }
                this.f1659S = true;
                this.f1660S0.mo2519e(this.f2167i, (C0430c) null, this.f1623A.mo2651l(i));
                mo2504w0();
                this.f1660S0.mo2516a();
                m2149e0();
                int width = getWidth();
                int height = getHeight();
                if (this.f1685p0 != null) {
                    for (int i7 = 0; i7 < childCount; i7++) {
                        C0396n nVar = this.f1643K.get(getChildAt(i7));
                        if (nVar != null) {
                            this.f1623A.mo2658t(nVar);
                        }
                    }
                    Iterator<MotionHelper> it = this.f1685p0.iterator();
                    while (it.hasNext()) {
                        it.next().mo2424D(this, this.f1643K);
                    }
                    for (int i8 = 0; i8 < childCount; i8++) {
                        C0396n nVar2 = this.f1643K.get(getChildAt(i8));
                        if (nVar2 != null) {
                            nVar2.mo2581I(width, height, this.f1647M, getNanoTime());
                        }
                    }
                } else {
                    for (int i9 = 0; i9 < childCount; i9++) {
                        C0396n nVar3 = this.f1643K.get(getChildAt(i9));
                        if (nVar3 != null) {
                            this.f1623A.mo2658t(nVar3);
                            nVar3.mo2581I(width, height, this.f1647M, getNanoTime());
                        }
                    }
                }
                float E = this.f1623A.mo2629E();
                if (E != 0.0f) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        C0396n nVar4 = this.f1643K.get(getChildAt(i10));
                        float o = nVar4.mo2596o() + nVar4.mo2595n();
                        f = Math.min(f, o);
                        f2 = Math.max(f2, o);
                    }
                    for (int i11 = 0; i11 < childCount; i11++) {
                        C0396n nVar5 = this.f1643K.get(getChildAt(i11));
                        float n = nVar5.mo2595n();
                        float o2 = nVar5.mo2596o();
                        nVar5.f1882n = 1.0f / (1.0f - E);
                        nVar5.f1881m = E - ((((n + o2) - f) * E) / (f2 - f));
                    }
                }
                this.f1649N = 0.0f;
                this.f1651O = 0.0f;
                this.f1659S = true;
                invalidate();
            }
        }
    }

    /* renamed from: K0 */
    public void mo2446K0() {
        this.f1660S0.mo2519e(this.f2167i, this.f1623A.mo2651l(this.f1631E), this.f1623A.mo2651l(this.f1635G));
        mo2504w0();
    }

    /* renamed from: L0 */
    public void mo2447L0(int i, C0430c cVar) {
        C0400q qVar = this.f1623A;
        if (qVar != null) {
            qVar.mo2637U(i, cVar);
        }
        mo2446K0();
        if (this.f1633F == i) {
            cVar.mo2955i(this);
        }
    }

    /* renamed from: M0 */
    public void mo2448M0(int i, View... viewArr) {
        C0400q qVar = this.f1623A;
        if (qVar != null) {
            qVar.mo2644c0(i, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo2449Y(float f) {
        C0400q qVar = this.f1623A;
        if (qVar != null) {
            float f2 = this.f1651O;
            float f3 = this.f1649N;
            if (f2 != f3 && this.f1657R) {
                this.f1651O = f3;
            }
            float f4 = this.f1651O;
            if (f4 != f) {
                this.f1671b0 = false;
                this.f1655Q = f;
                this.f1647M = ((float) qVar.mo2655p()) / 1000.0f;
                setProgress(this.f1655Q);
                this.f1625B = null;
                this.f1627C = this.f1623A.mo2657s();
                this.f1657R = false;
                this.f1645L = getNanoTime();
                this.f1659S = true;
                this.f1649N = f4;
                this.f1651O = f4;
                invalidate();
            }
        }
    }

    /* renamed from: Z */
    public boolean mo2450Z(int i, C0396n nVar) {
        C0400q qVar = this.f1623A;
        if (qVar != null) {
            return qVar.mo2646g(i, nVar);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C0410t tVar;
        ArrayList<MotionHelper> arrayList = this.f1685p0;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2430C(canvas);
            }
        }
        mo2453g0(false);
        C0400q qVar = this.f1623A;
        if (!(qVar == null || (tVar = qVar.f1932s) == null)) {
            tVar.mo2730c();
        }
        super.dispatchDraw(canvas);
        if (this.f1623A != null) {
            if ((this.f1667W & 1) == 1 && !isInEditMode()) {
                this.f1687r0++;
                long nanoTime = getNanoTime();
                long j = this.f1688s0;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.f1689t0 = ((float) ((int) ((((float) this.f1687r0) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.f1687r0 = 0;
                        this.f1688s0 = nanoTime;
                    }
                } else {
                    this.f1688s0 = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                float progress = ((float) ((int) (getProgress() * 1000.0f))) / 10.0f;
                float f = this.f1689t0;
                String e = C0379b.m2243e(this, this.f1631E);
                StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 24);
                sb.append(f);
                sb.append(" fps ");
                sb.append(e);
                sb.append(" -> ");
                String valueOf = String.valueOf(sb.toString());
                String e2 = C0379b.m2243e(this, this.f1635G);
                int i = this.f1633F;
                String e3 = i == -1 ? "undefined" : C0379b.m2243e(this, i);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(e2).length() + String.valueOf(e3).length());
                sb2.append(valueOf);
                sb2.append(e2);
                sb2.append(" (progress: ");
                sb2.append(progress);
                sb2.append(" ) state=");
                sb2.append(e3);
                String sb3 = sb2.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb3, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb3, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.f1667W > 1) {
                if (this.f1670a0 == null) {
                    this.f1670a0 = new C0371e();
                }
                this.f1670a0.mo2513a(canvas, this.f1643K, this.f1623A.mo2655p(), this.f1667W);
            }
            ArrayList<MotionHelper> arrayList2 = this.f1685p0;
            if (arrayList2 != null) {
                Iterator<MotionHelper> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2429B(canvas);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo2452f0(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0396n nVar = this.f1643K.get(getChildAt(i));
            if (nVar != null) {
                nVar.mo2588f(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0174  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2453g0(boolean r24) {
        /*
            r23 = this;
            r0 = r23
            long r1 = r0.f1653P
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            long r1 = r23.getNanoTime()
            r0.f1653P = r1
        L_0x0010:
            float r1 = r0.f1651O
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0020
            r0.f1633F = r2
        L_0x0020:
            boolean r5 = r0.f1682m0
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0032
            boolean r5 = r0.f1659S
            if (r5 == 0) goto L_0x0244
            if (r24 != 0) goto L_0x0032
            float r5 = r0.f1655Q
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0244
        L_0x0032:
            float r5 = r0.f1655Q
            float r5 = r5 - r1
            float r1 = java.lang.Math.signum(r5)
            long r8 = r23.getNanoTime()
            android.view.animation.Interpolator r5 = r0.f1625B
            boolean r10 = r5 instanceof androidx.constraintlayout.motion.widget.C0398o
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0053
            long r12 = r0.f1653P
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.f1647M
            float r10 = r10 / r12
            goto L_0x0054
        L_0x0053:
            r10 = 0
        L_0x0054:
            float r12 = r0.f1651O
            float r12 = r12 + r10
            boolean r13 = r0.f1657R
            if (r13 == 0) goto L_0x005d
            float r12 = r0.f1655Q
        L_0x005d:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x0067
            float r14 = r0.f1655Q
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x0071
        L_0x0067:
            int r14 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
            float r14 = r0.f1655Q
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
        L_0x0071:
            float r12 = r0.f1655Q
            r0.f1659S = r7
            r14 = 1
            goto L_0x0078
        L_0x0077:
            r14 = 0
        L_0x0078:
            r0.f1651O = r12
            r0.f1649N = r12
            r0.f1653P = r8
            r15 = 2
            r16 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r5 == 0) goto L_0x0108
            if (r14 != 0) goto L_0x0108
            boolean r14 = r0.f1671b0
            if (r14 == 0) goto L_0x00e8
            long r2 = r0.f1645L
            long r2 = r8 - r2
            float r2 = (float) r2
            float r2 = r2 * r11
            float r2 = r5.getInterpolation(r2)
            android.view.animation.Interpolator r3 = r0.f1625B
            e.f.b.a.a r5 = r0.f1672c0
            if (r3 != r5) goto L_0x00a5
            boolean r3 = r5.mo12864c()
            if (r3 == 0) goto L_0x00a3
            r3 = 2
            goto L_0x00a6
        L_0x00a3:
            r3 = 1
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            r0.f1651O = r2
            r0.f1653P = r8
            android.view.animation.Interpolator r5 = r0.f1625B
            boolean r8 = r5 instanceof androidx.constraintlayout.motion.widget.C0398o
            if (r8 == 0) goto L_0x00e6
            androidx.constraintlayout.motion.widget.o r5 = (androidx.constraintlayout.motion.widget.C0398o) r5
            float r5 = r5.mo2510a()
            r0.f1629D = r5
            float r8 = java.lang.Math.abs(r5)
            float r9 = r0.f1647M
            float r8 = r8 * r9
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x00c8
            if (r3 != r15) goto L_0x00c8
            r0.f1659S = r7
        L_0x00c8:
            int r8 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d8
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x00d8
            r0.f1651O = r8
            r0.f1659S = r7
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00d8:
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e6
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 > 0) goto L_0x00e6
            r0.f1651O = r4
            r0.f1659S = r7
            r12 = 0
            goto L_0x010b
        L_0x00e6:
            r12 = r2
            goto L_0x010b
        L_0x00e8:
            float r2 = r5.getInterpolation(r12)
            android.view.animation.Interpolator r3 = r0.f1625B
            boolean r5 = r3 instanceof androidx.constraintlayout.motion.widget.C0398o
            if (r5 == 0) goto L_0x00fb
            androidx.constraintlayout.motion.widget.o r3 = (androidx.constraintlayout.motion.widget.C0398o) r3
            float r3 = r3.mo2510a()
            r0.f1629D = r3
            goto L_0x0106
        L_0x00fb:
            float r12 = r12 + r10
            float r3 = r3.getInterpolation(r12)
            float r3 = r3 - r2
            float r3 = r3 * r1
            float r3 = r3 / r10
            r0.f1629D = r3
        L_0x0106:
            r12 = r2
            goto L_0x010a
        L_0x0108:
            r0.f1629D = r10
        L_0x010a:
            r3 = 0
        L_0x010b:
            float r2 = r0.f1629D
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x011a
            androidx.constraintlayout.motion.widget.MotionLayout$k r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.MOVING
            r0.setState(r2)
        L_0x011a:
            if (r3 == r6) goto L_0x0143
            if (r13 <= 0) goto L_0x0124
            float r2 = r0.f1655Q
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x012e
        L_0x0124:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0132
            float r2 = r0.f1655Q
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0132
        L_0x012e:
            float r12 = r0.f1655Q
            r0.f1659S = r7
        L_0x0132:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x013c
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0143
        L_0x013c:
            r0.f1659S = r7
            androidx.constraintlayout.motion.widget.MotionLayout$k r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.FINISHED
            r0.setState(r2)
        L_0x0143:
            int r2 = r23.getChildCount()
            r0.f1682m0 = r7
            long r8 = r23.getNanoTime()
            r0.f1630D0 = r12
            android.view.animation.Interpolator r3 = r0.f1627C
            if (r3 != 0) goto L_0x0155
            r3 = r12
            goto L_0x0159
        L_0x0155:
            float r3 = r3.getInterpolation(r12)
        L_0x0159:
            android.view.animation.Interpolator r5 = r0.f1627C
            if (r5 == 0) goto L_0x0171
            float r10 = r0.f1647M
            float r10 = r1 / r10
            float r10 = r10 + r12
            float r5 = r5.getInterpolation(r10)
            r0.f1629D = r5
            android.view.animation.Interpolator r10 = r0.f1627C
            float r10 = r10.getInterpolation(r12)
            float r5 = r5 - r10
            r0.f1629D = r5
        L_0x0171:
            r5 = 0
        L_0x0172:
            if (r5 >= r2) goto L_0x019a
            android.view.View r10 = r0.getChildAt(r5)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.n> r11 = r0.f1643K
            java.lang.Object r11 = r11.get(r10)
            r17 = r11
            androidx.constraintlayout.motion.widget.n r17 = (androidx.constraintlayout.motion.widget.C0396n) r17
            if (r17 == 0) goto L_0x0197
            boolean r11 = r0.f1682m0
            e.f.a.k.a.d r15 = r0.f1632E0
            r18 = r10
            r19 = r3
            r20 = r8
            r22 = r15
            boolean r10 = r17.mo2603x(r18, r19, r20, r22)
            r10 = r10 | r11
            r0.f1682m0 = r10
        L_0x0197:
            int r5 = r5 + 1
            goto L_0x0172
        L_0x019a:
            if (r13 <= 0) goto L_0x01a2
            float r2 = r0.f1655Q
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x01ac
        L_0x01a2:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x01ae
            float r2 = r0.f1655Q
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01ae
        L_0x01ac:
            r2 = 1
            goto L_0x01af
        L_0x01ae:
            r2 = 0
        L_0x01af:
            boolean r3 = r0.f1682m0
            if (r3 != 0) goto L_0x01be
            boolean r3 = r0.f1659S
            if (r3 != 0) goto L_0x01be
            if (r2 == 0) goto L_0x01be
            androidx.constraintlayout.motion.widget.MotionLayout$k r3 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.FINISHED
            r0.setState(r3)
        L_0x01be:
            boolean r3 = r0.f1692w0
            if (r3 == 0) goto L_0x01c5
            r23.requestLayout()
        L_0x01c5:
            boolean r3 = r0.f1682m0
            r2 = r2 ^ r6
            r2 = r2 | r3
            r0.f1682m0 = r2
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x01e9
            int r2 = r0.f1631E
            r3 = -1
            if (r2 == r3) goto L_0x01e9
            int r3 = r0.f1633F
            if (r3 == r2) goto L_0x01e9
            r0.f1633F = r2
            androidx.constraintlayout.motion.widget.q r3 = r0.f1623A
            androidx.constraintlayout.widget.c r2 = r3.mo2651l(r2)
            r2.mo2953g(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$k r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.FINISHED
            r0.setState(r2)
            r7 = 1
        L_0x01e9:
            double r2 = (double) r12
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0207
            int r2 = r0.f1633F
            int r3 = r0.f1635G
            if (r2 == r3) goto L_0x0207
            r0.f1633F = r3
            androidx.constraintlayout.motion.widget.q r2 = r0.f1623A
            androidx.constraintlayout.widget.c r2 = r2.mo2651l(r3)
            r2.mo2953g(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$k r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.FINISHED
            r0.setState(r2)
            r7 = 1
        L_0x0207:
            boolean r2 = r0.f1682m0
            if (r2 != 0) goto L_0x0226
            boolean r2 = r0.f1659S
            if (r2 == 0) goto L_0x0210
            goto L_0x0226
        L_0x0210:
            if (r13 <= 0) goto L_0x0218
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0220
        L_0x0218:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0229
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0229
        L_0x0220:
            androidx.constraintlayout.motion.widget.MotionLayout$k r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.FINISHED
            r0.setState(r2)
            goto L_0x0229
        L_0x0226:
            r23.invalidate()
        L_0x0229:
            boolean r2 = r0.f1682m0
            if (r2 != 0) goto L_0x0244
            boolean r2 = r0.f1659S
            if (r2 != 0) goto L_0x0244
            if (r13 <= 0) goto L_0x0239
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0241
        L_0x0239:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0244
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0244
        L_0x0241:
            r23.mo2503u0()
        L_0x0244:
            float r1 = r0.f1651O
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0258
            int r1 = r0.f1633F
            int r2 = r0.f1635G
            if (r1 == r2) goto L_0x0253
            goto L_0x0254
        L_0x0253:
            r6 = r7
        L_0x0254:
            r0.f1633F = r2
        L_0x0256:
            r7 = r6
            goto L_0x0267
        L_0x0258:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0267
            int r1 = r0.f1633F
            int r2 = r0.f1631E
            if (r1 == r2) goto L_0x0263
            goto L_0x0264
        L_0x0263:
            r6 = r7
        L_0x0264:
            r0.f1633F = r2
            goto L_0x0256
        L_0x0267:
            boolean r1 = r0.f1662T0
            r1 = r1 | r7
            r0.f1662T0 = r1
            if (r7 == 0) goto L_0x0275
            boolean r1 = r0.f1634F0
            if (r1 != 0) goto L_0x0275
            r23.requestLayout()
        L_0x0275:
            float r1 = r0.f1651O
            r0.f1649N = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo2453g0(boolean):void");
    }

    public int[] getConstraintSetIds() {
        C0400q qVar = this.f1623A;
        if (qVar == null) {
            return null;
        }
        return qVar.mo2653n();
    }

    public int getCurrentState() {
        return this.f1633F;
    }

    public ArrayList<C0400q.C0402b> getDefinedTransitions() {
        C0400q qVar = this.f1623A;
        if (qVar == null) {
            return null;
        }
        return qVar.mo2654o();
    }

    public C0380c getDesignTool() {
        if (this.f1674e0 == null) {
            this.f1674e0 = new C0380c(this);
        }
        return this.f1674e0;
    }

    public int getEndState() {
        return this.f1635G;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f1651O;
    }

    public C0400q getScene() {
        return this.f1623A;
    }

    public int getStartState() {
        return this.f1631E;
    }

    public float getTargetPosition() {
        return this.f1655Q;
    }

    public Bundle getTransitionState() {
        if (this.f1636G0 == null) {
            this.f1636G0 = new C0375i();
        }
        this.f1636G0.mo2531c();
        return this.f1636G0.mo2530b();
    }

    public long getTransitionTimeMs() {
        C0400q qVar = this.f1623A;
        if (qVar != null) {
            this.f1647M = ((float) qVar.mo2655p()) / 1000.0f;
        }
        return (long) (this.f1647M * 1000.0f);
    }

    public float getVelocity() {
        return this.f1629D;
    }

    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    /* renamed from: j */
    public void mo1214j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.f1677h0 && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f1677h0 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo2468j0() {
        int i;
        CopyOnWriteArrayList<C0376j> copyOnWriteArrayList;
        if ((this.f1661T != null || ((copyOnWriteArrayList = this.f1686q0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1690u0 == -1) {
            this.f1690u0 = this.f1633F;
            if (!this.f1669X0.isEmpty()) {
                ArrayList<Integer> arrayList = this.f1669X0;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f1633F;
            if (!(i == i2 || i2 == -1)) {
                this.f1669X0.add(Integer.valueOf(i2));
            }
        }
        m2154v0();
        Runnable runnable = this.f1638H0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f1640I0;
        if (iArr != null && this.f1642J0 > 0) {
            mo2442G0(iArr[0]);
            int[] iArr2 = this.f1640I0;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f1642J0--;
        }
    }

    /* renamed from: k */
    public void mo1215k(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* renamed from: k0 */
    public void mo2469k0(int i, boolean z, float f) {
        C0376j jVar = this.f1661T;
        if (jVar != null) {
            jVar.mo2433c(this, i, z, f);
        }
        CopyOnWriteArrayList<C0376j> copyOnWriteArrayList = this.f1686q0;
        if (copyOnWriteArrayList != null) {
            Iterator<C0376j> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2433c(this, i, z, f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.f1916c;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1216l(android.view.View r1, android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            androidx.constraintlayout.motion.widget.q r1 = r0.f1623A
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.q$b r1 = r1.f1916c
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.r r1 = r1.mo2666B()
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.q r1 = r0.f1623A
            androidx.constraintlayout.motion.widget.q$b r1 = r1.f1916c
            androidx.constraintlayout.motion.widget.r r1 = r1.mo2666B()
            int r1 = r1.mo2686e()
            r1 = r1 & 2
            if (r1 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 1
            return r1
        L_0x0021:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo1216l(android.view.View, android.view.View, int, int):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo2470l0(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        HashMap<View, C0396n> hashMap = this.f1643K;
        View i2 = mo2873i(i);
        C0396n nVar = hashMap.get(i2);
        if (nVar != null) {
            nVar.mo2593l(f, f2, f3, fArr);
            float y = i2.getY();
            int i3 = ((f - this.f1663U) > 0.0f ? 1 : ((f - this.f1663U) == 0.0f ? 0 : -1));
            this.f1663U = f;
            this.f1665V = y;
            return;
        }
        if (i2 == null) {
            StringBuilder sb = new StringBuilder(11);
            sb.append(i);
            str = sb.toString();
        } else {
            str = i2.getContext().getResources().getResourceName(i);
        }
        String valueOf = String.valueOf(str);
        Log.w("MotionLayout", valueOf.length() != 0 ? "WARNING could not find view id ".concat(valueOf) : new String("WARNING could not find view id "));
    }

    /* renamed from: m */
    public void mo1217m(View view, View view2, int i, int i2) {
        this.f1680k0 = getNanoTime();
        this.f1681l0 = 0.0f;
        this.f1678i0 = 0.0f;
        this.f1679j0 = 0.0f;
    }

    /* renamed from: m0 */
    public C0430c mo2471m0(int i) {
        C0400q qVar = this.f1623A;
        if (qVar == null) {
            return null;
        }
        return qVar.mo2651l(i);
    }

    /* renamed from: n */
    public void mo1218n(View view, int i) {
        C0400q qVar = this.f1623A;
        if (qVar != null) {
            float f = this.f1681l0;
            if (f != 0.0f) {
                qVar.mo2634Q(this.f1678i0 / f, this.f1679j0 / f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public C0396n mo2472n0(int i) {
        return this.f1643K.get(findViewById(i));
    }

    /* renamed from: o */
    public void mo1219o(View view, int i, int i2, int[] iArr, int i3) {
        C0400q.C0402b bVar;
        C0404r B;
        int q;
        C0400q qVar = this.f1623A;
        if (qVar != null && (bVar = qVar.f1916c) != null && bVar.mo2667C()) {
            int i4 = -1;
            if (!bVar.mo2667C() || (B = bVar.mo2666B()) == null || (q = B.mo2698q()) == -1 || view.getId() == q) {
                if (qVar.mo2661w()) {
                    C0404r B2 = bVar.mo2666B();
                    if (!(B2 == null || (B2.mo2686e() & 4) == 0)) {
                        i4 = i2;
                    }
                    float f = this.f1649N;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(i4)) {
                        return;
                    }
                }
                if (!(bVar.mo2666B() == null || (bVar.mo2666B().mo2686e() & 1) == 0)) {
                    float x = qVar.mo2662x((float) i, (float) i2);
                    float f2 = this.f1651O;
                    if ((f2 <= 0.0f && x < 0.0f) || (f2 >= 1.0f && x > 0.0f)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            view.setNestedScrollingEnabled(false);
                            view.post(new C0367a(this, view));
                            return;
                        }
                        return;
                    }
                }
                float f3 = this.f1649N;
                long nanoTime = getNanoTime();
                float f4 = (float) i;
                this.f1678i0 = f4;
                float f5 = (float) i2;
                this.f1679j0 = f5;
                this.f1681l0 = (float) (((double) (nanoTime - this.f1680k0)) * 1.0E-9d);
                this.f1680k0 = nanoTime;
                qVar.mo2633P(f4, f5);
                if (f3 != this.f1649N) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                mo2453g0(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.f1677h0 = true;
                }
            }
        }
    }

    /* renamed from: o0 */
    public C0400q.C0402b mo2473o0(int i) {
        return this.f1623A.mo2631G(i);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        C0400q.C0402b bVar;
        int i;
        Display display;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 17 && (display = getDisplay()) != null) {
            display.getRotation();
        }
        C0400q qVar = this.f1623A;
        if (!(qVar == null || (i = this.f1633F) == -1)) {
            C0430c l = qVar.mo2651l(i);
            this.f1623A.mo2636T(this);
            ArrayList<MotionHelper> arrayList = this.f1685p0;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo2428A(this);
                }
            }
            if (l != null) {
                l.mo2955i(this);
            }
            this.f1631E = this.f1633F;
        }
        mo2503u0();
        C0375i iVar = this.f1636G0;
        if (iVar == null) {
            C0400q qVar2 = this.f1623A;
            if (qVar2 != null && (bVar = qVar2.f1916c) != null && bVar.mo2676x() == 4) {
                mo2439D0();
                setState(C0377k.SETUP);
                setState(C0377k.MOVING);
            }
        } else if (this.f1656Q0) {
            post(new C0368b());
        } else {
            iVar.mo2529a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0404r B;
        int q;
        RectF p;
        C0400q qVar = this.f1623A;
        if (qVar != null && this.f1641J) {
            C0410t tVar = qVar.f1932s;
            if (tVar != null) {
                tVar.mo2734h(motionEvent);
            }
            C0400q.C0402b bVar = this.f1623A.f1916c;
            if (bVar != null && bVar.mo2667C() && (B = bVar.mo2666B()) != null && ((motionEvent.getAction() != 0 || (p = B.mo2697p(this, new RectF())) == null || p.contains(motionEvent.getX(), motionEvent.getY())) && (q = B.mo2698q()) != -1)) {
                View view = this.f1666V0;
                if (view == null || view.getId() != q) {
                    this.f1666V0 = findViewById(q);
                }
                View view2 = this.f1666V0;
                if (view2 != null) {
                    this.f1664U0.set((float) view2.getLeft(), (float) this.f1666V0.getTop(), (float) this.f1666V0.getRight(), (float) this.f1666V0.getBottom());
                    if (this.f1664U0.contains(motionEvent.getX(), motionEvent.getY()) && !m2152q0((float) this.f1666V0.getLeft(), (float) this.f1666V0.getTop(), this.f1666V0, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1634F0 = true;
        try {
            if (this.f1623A == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.f1675f0 == i5 && this.f1676g0 == i6)) {
                mo2504w0();
                mo2453g0(true);
            }
            this.f1675f0 = i5;
            this.f1676g0 = i6;
            this.f1634F0 = false;
        } finally {
            this.f1634F0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1623A == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.f1637H == i && this.f1639I == i2) ? false : true;
        if (this.f1662T0) {
            this.f1662T0 = false;
            mo2503u0();
            m2154v0();
            z2 = true;
        }
        if (this.f2172n) {
            z2 = true;
        }
        this.f1637H = i;
        this.f1639I = i2;
        int F = this.f1623A.mo2630F();
        int q = this.f1623A.mo2656q();
        if ((z2 || this.f1660S0.mo2520f(F, q)) && this.f1631E != -1) {
            super.onMeasure(i, i2);
            this.f1660S0.mo2519e(this.f2167i, this.f1623A.mo2651l(F), this.f1623A.mo2651l(q));
            this.f1660S0.mo2522h();
            this.f1660S0.mo2523i(F, q);
        } else {
            if (z2) {
                super.onMeasure(i, i2);
            }
            z = true;
        }
        if (this.f1692w0 || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int V = this.f2167i.mo12657V() + getPaddingLeft() + getPaddingRight();
            int z3 = this.f2167i.mo12720z() + paddingTop;
            int i3 = this.f1626B0;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.f1693x0;
                V = (int) (((float) i4) + (this.f1630D0 * ((float) (this.f1695z0 - i4))));
                requestLayout();
            }
            int i5 = this.f1628C0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.f1694y0;
                z3 = (int) (((float) i6) + (this.f1630D0 * ((float) (this.f1624A0 - i6))));
                requestLayout();
            }
            setMeasuredDimension(V, z3);
        }
        m2150h0();
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onRtlPropertiesChanged(int i) {
        C0400q qVar = this.f1623A;
        if (qVar != null) {
            qVar.mo2639W(mo2875r());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0400q qVar = this.f1623A;
        if (qVar == null || !this.f1641J || !qVar.mo2643b0()) {
            return super.onTouchEvent(motionEvent);
        }
        C0400q.C0402b bVar = this.f1623A.f1916c;
        if (bVar != null && !bVar.mo2667C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1623A.mo2635R(motionEvent, getCurrentState(), this);
        if (this.f1623A.f1916c.mo2668D(4)) {
            return this.f1623A.f1916c.mo2666B().mo2699r();
        }
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f1686q0 == null) {
                this.f1686q0 = new CopyOnWriteArrayList<>();
            }
            this.f1686q0.add(motionHelper);
            if (motionHelper.mo2437z()) {
                if (this.f1683n0 == null) {
                    this.f1683n0 = new ArrayList<>();
                }
                this.f1683n0.add(motionHelper);
            }
            if (motionHelper.mo2436y()) {
                if (this.f1684o0 == null) {
                    this.f1684o0 = new ArrayList<>();
                }
                this.f1684o0.add(motionHelper);
            }
            if (motionHelper.mo2425x()) {
                if (this.f1685p0 == null) {
                    this.f1685p0 = new ArrayList<>();
                }
                this.f1685p0.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f1683n0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f1684o0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* renamed from: p0 */
    public void mo2482p0(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.f1629D;
        float f5 = this.f1651O;
        if (this.f1625B != null) {
            float signum = Math.signum(this.f1655Q - f5);
            float interpolation = this.f1625B.getInterpolation(this.f1651O + 1.0E-5f);
            float interpolation2 = this.f1625B.getInterpolation(this.f1651O);
            f4 = (signum * ((interpolation - interpolation2) / 1.0E-5f)) / this.f1647M;
            f3 = interpolation2;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.f1625B;
        if (interpolator instanceof C0398o) {
            f4 = ((C0398o) interpolator).mo2510a();
        }
        C0396n nVar = this.f1643K.get(view);
        if ((i & 1) == 0) {
            nVar.mo2598r(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            nVar.mo2593l(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    public void requestLayout() {
        C0400q qVar;
        C0400q.C0402b bVar;
        if (!this.f1692w0 && this.f1633F == -1 && (qVar = this.f1623A) != null && (bVar = qVar.f1916c) != null) {
            int z = bVar.mo2678z();
            if (z != 0) {
                if (z == 2) {
                    int childCount = getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        this.f1643K.get(getChildAt(i)).mo2604z();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    /* renamed from: s0 */
    public boolean mo2484s0() {
        return this.f1641J;
    }

    public void setDebugMode(int i) {
        this.f1667W = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f1656Q0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f1641J = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f1623A != null) {
            setState(C0377k.MOVING);
            Interpolator s = this.f1623A.mo2657s();
            if (s != null) {
                setProgress(s.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f1684o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1684o0.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f1683n0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1683n0.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f1636G0 == null) {
                this.f1636G0 = new C0375i();
            }
            this.f1636G0.mo2533e(f);
            return;
        }
        if (i <= 0) {
            if (this.f1651O == 1.0f && this.f1633F == this.f1635G) {
                setState(C0377k.MOVING);
            }
            this.f1633F = this.f1631E;
            if (this.f1651O == 0.0f) {
                setState(C0377k.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.f1651O == 0.0f && this.f1633F == this.f1631E) {
                setState(C0377k.MOVING);
            }
            this.f1633F = this.f1635G;
            if (this.f1651O == 1.0f) {
                setState(C0377k.FINISHED);
            }
        } else {
            this.f1633F = -1;
            setState(C0377k.MOVING);
        }
        if (this.f1623A != null) {
            this.f1657R = true;
            this.f1655Q = f;
            this.f1649N = f;
            this.f1653P = -1;
            this.f1645L = -1;
            this.f1625B = null;
            this.f1659S = true;
            invalidate();
        }
    }

    public void setScene(C0400q qVar) {
        this.f1623A = qVar;
        qVar.mo2639W(mo2875r());
        mo2504w0();
    }

    /* access modifiers changed from: package-private */
    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.f1636G0 == null) {
                this.f1636G0 = new C0375i();
            }
            this.f1636G0.mo2534f(i);
            this.f1636G0.mo2532d(i);
            return;
        }
        this.f1633F = i;
    }

    /* access modifiers changed from: package-private */
    public void setState(C0377k kVar) {
        C0377k kVar2 = C0377k.FINISHED;
        if (kVar != kVar2 || this.f1633F != -1) {
            C0377k kVar3 = this.f1658R0;
            this.f1658R0 = kVar;
            C0377k kVar4 = C0377k.MOVING;
            if (kVar3 == kVar4 && kVar == kVar4) {
                m2151i0();
            }
            int i = C0369c.f1698a[kVar3.ordinal()];
            if (i == 1 || i == 2) {
                if (kVar == kVar4) {
                    m2151i0();
                }
                if (kVar == kVar2) {
                    mo2468j0();
                }
            } else if (i == 3 && kVar == kVar2) {
                mo2468j0();
            }
        }
    }

    public void setTransition(int i) {
        if (this.f1623A != null) {
            C0400q.C0402b o0 = mo2473o0(i);
            this.f1631E = o0.mo2665A();
            this.f1635G = o0.mo2677y();
            if (!isAttachedToWindow()) {
                if (this.f1636G0 == null) {
                    this.f1636G0 = new C0375i();
                }
                this.f1636G0.mo2534f(this.f1631E);
                this.f1636G0.mo2532d(this.f1635G);
                return;
            }
            float f = Float.NaN;
            int i2 = this.f1633F;
            float f2 = 0.0f;
            if (i2 == this.f1631E) {
                f = 0.0f;
            } else if (i2 == this.f1635G) {
                f = 1.0f;
            }
            this.f1623A.mo2641Y(o0);
            this.f1660S0.mo2519e(this.f2167i, this.f1623A.mo2651l(this.f1631E), this.f1623A.mo2651l(this.f1635G));
            mo2504w0();
            if (this.f1651O != f) {
                if (f == 0.0f) {
                    mo2452f0(true);
                    this.f1623A.mo2651l(this.f1631E).mo2955i(this);
                } else if (f == 1.0f) {
                    mo2452f0(false);
                    this.f1623A.mo2651l(this.f1635G).mo2955i(this);
                }
            }
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.f1651O = f2;
            if (Float.isNaN(f)) {
                Log.v("MotionLayout", String.valueOf(C0379b.m2240b()).concat(" transitionToStart "));
                mo2441F0();
                return;
            }
            setProgress(f);
        }
    }

    public void setTransitionDuration(int i) {
        C0400q qVar = this.f1623A;
        if (qVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            qVar.mo2638V(i);
        }
    }

    public void setTransitionListener(C0376j jVar) {
        this.f1661T = jVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1636G0 == null) {
            this.f1636G0 = new C0375i();
        }
        this.f1636G0.mo2535g(bundle);
        if (isAttachedToWindow()) {
            this.f1636G0.mo2529a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo2500t(int i) {
        this.f2175q = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public C0373g mo2501t0() {
        return C0374h.m2220f();
    }

    public String toString() {
        Context context = getContext();
        String c = C0379b.m2241c(context, this.f1631E);
        String c2 = C0379b.m2241c(context, this.f1635G);
        float f = this.f1651O;
        float f2 = this.f1629D;
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 47 + String.valueOf(c2).length());
        sb.append(c);
        sb.append("->");
        sb.append(c2);
        sb.append(" (pos:");
        sb.append(f);
        sb.append(" Dpos/Dt:");
        sb.append(f2);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo2503u0() {
        C0400q qVar = this.f1623A;
        if (qVar != null) {
            if (qVar.mo2647h(this, this.f1633F)) {
                requestLayout();
                return;
            }
            int i = this.f1633F;
            if (i != -1) {
                this.f1623A.mo2645f(this, i);
            }
            if (this.f1623A.mo2643b0()) {
                this.f1623A.mo2642Z();
            }
        }
    }

    /* renamed from: w0 */
    public void mo2504w0() {
        this.f1660S0.mo2522h();
        invalidate();
    }

    /* renamed from: x0 */
    public void mo2505x0(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.f1636G0 == null) {
                this.f1636G0 = new C0375i();
            }
            this.f1636G0.mo2533e(f);
            this.f1636G0.mo2536h(f2);
            return;
        }
        setProgress(f);
        setState(C0377k.MOVING);
        this.f1629D = f2;
        float f3 = 1.0f;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i != 0) {
            if (i <= 0) {
                f3 = 0.0f;
            }
            mo2449Y(f3);
        } else if (f != 0.0f && f != 1.0f) {
            if (f <= 0.5f) {
                f3 = 0.0f;
            }
            mo2449Y(f3);
        }
    }

    /* renamed from: y0 */
    public void mo2506y0(int i, int i2, int i3) {
        setState(C0377k.SETUP);
        this.f1633F = i;
        this.f1631E = -1;
        this.f1635G = -1;
        C0427b bVar = this.f2175q;
        if (bVar != null) {
            bVar.mo2940d(i, (float) i2, (float) i3);
            return;
        }
        C0400q qVar = this.f1623A;
        if (qVar != null) {
            qVar.mo2651l(i).mo2955i(this);
        }
    }

    /* renamed from: z0 */
    public void mo2507z0(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f1636G0 == null) {
                this.f1636G0 = new C0375i();
            }
            this.f1636G0.mo2534f(i);
            this.f1636G0.mo2532d(i2);
            return;
        }
        C0400q qVar = this.f1623A;
        if (qVar != null) {
            this.f1631E = i;
            this.f1635G = i2;
            qVar.mo2640X(i, i2);
            this.f1660S0.mo2519e(this.f2167i, this.f1623A.mo2651l(i), this.f1623A.mo2651l(i2));
            mo2504w0();
            this.f1651O = 0.0f;
            mo2441F0();
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(C0400q.C0402b bVar) {
        this.f1623A.mo2641Y(bVar);
        setState(C0377k.SETUP);
        if (this.f1633F == this.f1623A.mo2656q()) {
            this.f1651O = 1.0f;
            this.f1649N = 1.0f;
            this.f1655Q = 1.0f;
        } else {
            this.f1651O = 0.0f;
            this.f1649N = 0.0f;
            this.f1655Q = 0.0f;
        }
        this.f1653P = bVar.mo2668D(1) ? -1 : getNanoTime();
        int F = this.f1623A.mo2630F();
        int q = this.f1623A.mo2656q();
        if (F != this.f1631E || q != this.f1635G) {
            this.f1631E = F;
            this.f1635G = q;
            this.f1623A.mo2640X(F, q);
            this.f1660S0.mo2519e(this.f2167i, this.f1623A.mo2651l(this.f1631E), this.f1623A.mo2651l(this.f1635G));
            this.f1660S0.mo2523i(this.f1631E, this.f1635G);
            this.f1660S0.mo2522h();
            mo2504w0();
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2153r0(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2153r0(attributeSet);
    }
}
