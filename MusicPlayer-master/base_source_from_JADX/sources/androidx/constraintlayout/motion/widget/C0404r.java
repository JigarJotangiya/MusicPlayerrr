package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0439f;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.r */
/* compiled from: TouchResponse */
class C0404r {

    /* renamed from: G */
    private static final float[][] f1957G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: H */
    private static final float[][] f1958H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: A */
    private float f1959A = 10.0f;

    /* renamed from: B */
    private float f1960B = 1.0f;

    /* renamed from: C */
    private float f1961C = Float.NaN;

    /* renamed from: D */
    private float f1962D = Float.NaN;

    /* renamed from: E */
    private int f1963E = 0;

    /* renamed from: F */
    private int f1964F = 0;

    /* renamed from: a */
    private int f1965a = 0;

    /* renamed from: b */
    private int f1966b = 0;

    /* renamed from: c */
    private int f1967c = 0;

    /* renamed from: d */
    private int f1968d = -1;

    /* renamed from: e */
    private int f1969e = -1;

    /* renamed from: f */
    private int f1970f = -1;

    /* renamed from: g */
    private float f1971g = 0.5f;

    /* renamed from: h */
    private float f1972h = 0.5f;

    /* renamed from: i */
    float f1973i = 0.5f;

    /* renamed from: j */
    float f1974j = 0.5f;

    /* renamed from: k */
    private int f1975k = -1;

    /* renamed from: l */
    boolean f1976l = false;

    /* renamed from: m */
    private float f1977m = 0.0f;

    /* renamed from: n */
    private float f1978n = 1.0f;

    /* renamed from: o */
    private boolean f1979o = false;

    /* renamed from: p */
    private float[] f1980p = new float[2];

    /* renamed from: q */
    private int[] f1981q = new int[2];

    /* renamed from: r */
    private float f1982r;

    /* renamed from: s */
    private float f1983s;

    /* renamed from: t */
    private final MotionLayout f1984t;

    /* renamed from: u */
    private float f1985u = 4.0f;

    /* renamed from: v */
    private float f1986v = 1.2f;

    /* renamed from: w */
    private boolean f1987w = true;

    /* renamed from: x */
    private float f1988x = 1.0f;

    /* renamed from: y */
    private int f1989y = 0;

    /* renamed from: z */
    private float f1990z = 10.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.r$a */
    /* compiled from: TouchResponse */
    class C0405a implements View.OnTouchListener {
        C0405a(C0404r rVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$b */
    /* compiled from: TouchResponse */
    class C0406b implements NestedScrollView.C0542b {
        C0406b(C0404r rVar) {
        }

        /* renamed from: a */
        public void mo451a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    C0404r(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f1984t = motionLayout;
        m2582c(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: b */
    private void m2581b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == C0439f.OnSwipe_touchAnchorId) {
                this.f1968d = typedArray.getResourceId(index, this.f1968d);
            } else if (index == C0439f.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.f1965a);
                this.f1965a = i2;
                float[][] fArr = f1957G;
                this.f1972h = fArr[i2][0];
                this.f1971g = fArr[i2][1];
            } else if (index == C0439f.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.f1966b);
                this.f1966b = i3;
                float[][] fArr2 = f1958H;
                if (i3 < fArr2.length) {
                    this.f1977m = fArr2[i3][0];
                    this.f1978n = fArr2[i3][1];
                } else {
                    this.f1978n = Float.NaN;
                    this.f1977m = Float.NaN;
                    this.f1976l = true;
                }
            } else if (index == C0439f.OnSwipe_maxVelocity) {
                this.f1985u = typedArray.getFloat(index, this.f1985u);
            } else if (index == C0439f.OnSwipe_maxAcceleration) {
                this.f1986v = typedArray.getFloat(index, this.f1986v);
            } else if (index == C0439f.OnSwipe_moveWhenScrollAtTop) {
                this.f1987w = typedArray.getBoolean(index, this.f1987w);
            } else if (index == C0439f.OnSwipe_dragScale) {
                this.f1988x = typedArray.getFloat(index, this.f1988x);
            } else if (index == C0439f.OnSwipe_dragThreshold) {
                this.f1990z = typedArray.getFloat(index, this.f1990z);
            } else if (index == C0439f.OnSwipe_touchRegionId) {
                this.f1969e = typedArray.getResourceId(index, this.f1969e);
            } else if (index == C0439f.OnSwipe_onTouchUp) {
                this.f1967c = typedArray.getInt(index, this.f1967c);
            } else if (index == C0439f.OnSwipe_nestedScrollFlags) {
                this.f1989y = typedArray.getInteger(index, 0);
            } else if (index == C0439f.OnSwipe_limitBoundsTo) {
                this.f1970f = typedArray.getResourceId(index, 0);
            } else if (index == C0439f.OnSwipe_rotationCenterId) {
                this.f1975k = typedArray.getResourceId(index, this.f1975k);
            } else if (index == C0439f.OnSwipe_springDamping) {
                this.f1959A = typedArray.getFloat(index, this.f1959A);
            } else if (index == C0439f.OnSwipe_springMass) {
                this.f1960B = typedArray.getFloat(index, this.f1960B);
            } else if (index == C0439f.OnSwipe_springStiffness) {
                this.f1961C = typedArray.getFloat(index, this.f1961C);
            } else if (index == C0439f.OnSwipe_springStopThreshold) {
                this.f1962D = typedArray.getFloat(index, this.f1962D);
            } else if (index == C0439f.OnSwipe_springBoundary) {
                this.f1963E = typedArray.getInt(index, this.f1963E);
            } else if (index == C0439f.OnSwipe_autoCompleteMode) {
                this.f1964F = typedArray.getInt(index, this.f1964F);
            }
        }
    }

    /* renamed from: c */
    private void m2582c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.OnSwipe);
        m2581b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo2683A() {
        View view;
        int i = this.f1968d;
        if (i != -1) {
            view = this.f1984t.findViewById(i);
            if (view == null) {
                String valueOf = String.valueOf(C0379b.m2241c(this.f1984t.getContext(), this.f1968d));
                Log.e("TouchResponse", valueOf.length() != 0 ? "cannot find TouchAnchorId @id/".concat(valueOf) : new String("cannot find TouchAnchorId @id/"));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new C0405a(this));
            nestedScrollView.setOnScrollChangeListener(new C0406b(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo2684a(float f, float f2) {
        return (f * this.f1977m) + (f2 * this.f1978n);
    }

    /* renamed from: d */
    public int mo2685d() {
        return this.f1964F;
    }

    /* renamed from: e */
    public int mo2686e() {
        return this.f1989y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public RectF mo2687f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f1970f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo2688g() {
        return this.f1986v;
    }

    /* renamed from: h */
    public float mo2689h() {
        return this.f1985u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo2690i() {
        return this.f1987w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo2691j(float f, float f2) {
        this.f1984t.mo2470l0(this.f1968d, this.f1984t.getProgress(), this.f1972h, this.f1971g, this.f1980p);
        float f3 = this.f1977m;
        if (f3 != 0.0f) {
            float[] fArr = this.f1980p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f1980p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f1978n) / fArr2[1];
    }

    /* renamed from: k */
    public int mo2692k() {
        return this.f1963E;
    }

    /* renamed from: l */
    public float mo2693l() {
        return this.f1959A;
    }

    /* renamed from: m */
    public float mo2694m() {
        return this.f1960B;
    }

    /* renamed from: n */
    public float mo2695n() {
        return this.f1961C;
    }

    /* renamed from: o */
    public float mo2696o() {
        return this.f1962D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public RectF mo2697p(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f1969e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo2698q() {
        return this.f1969e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo2699r() {
        return this.f1979o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2700s(MotionEvent motionEvent, MotionLayout.C0373g gVar, int i, C0400q qVar) {
        float f;
        int i2;
        float f2;
        MotionLayout.C0373g gVar2 = gVar;
        if (this.f1976l) {
            mo2701t(motionEvent, gVar, i, qVar);
            return;
        }
        gVar2.mo2525b(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1982r = motionEvent.getRawX();
            this.f1983s = motionEvent.getRawY();
            this.f1979o = false;
        } else if (action == 1) {
            this.f1979o = false;
            gVar2.mo2528e(1000);
            float d = gVar.mo2527d();
            float c = gVar.mo2526c();
            float progress = this.f1984t.getProgress();
            int i3 = this.f1968d;
            if (i3 != -1) {
                this.f1984t.mo2470l0(i3, progress, this.f1972h, this.f1971g, this.f1980p);
            } else {
                float min = (float) Math.min(this.f1984t.getWidth(), this.f1984t.getHeight());
                float[] fArr = this.f1980p;
                fArr[1] = this.f1978n * min;
                fArr[0] = min * this.f1977m;
            }
            float f3 = this.f1977m;
            float[] fArr2 = this.f1980p;
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            if (f3 != 0.0f) {
                f = d / fArr2[0];
            } else {
                f = c / fArr2[1];
            }
            float f6 = !Float.isNaN(f) ? (f / 3.0f) + progress : progress;
            if (f6 != 0.0f && f6 != 1.0f && (i2 = this.f1967c) != 3) {
                float f7 = ((double) f6) < 0.5d ? 0.0f : 1.0f;
                if (i2 == 6) {
                    if (progress + f < 0.0f) {
                        f = Math.abs(f);
                    }
                    f7 = 1.0f;
                }
                if (this.f1967c == 7) {
                    if (progress + f > 1.0f) {
                        f = -Math.abs(f);
                    }
                    f7 = 0.0f;
                }
                this.f1984t.mo2438C0(this.f1967c, f7, f);
                if (0.0f >= progress || 1.0f <= progress) {
                    this.f1984t.setState(MotionLayout.C0377k.FINISHED);
                }
            } else if (0.0f >= f6 || 1.0f <= f6) {
                this.f1984t.setState(MotionLayout.C0377k.FINISHED);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.f1983s;
            float rawX = motionEvent.getRawX() - this.f1982r;
            if (Math.abs((this.f1977m * rawX) + (this.f1978n * rawY)) > this.f1990z || this.f1979o) {
                float progress2 = this.f1984t.getProgress();
                if (!this.f1979o) {
                    this.f1979o = true;
                    this.f1984t.setProgress(progress2);
                }
                int i4 = this.f1968d;
                if (i4 != -1) {
                    this.f1984t.mo2470l0(i4, progress2, this.f1972h, this.f1971g, this.f1980p);
                } else {
                    float min2 = (float) Math.min(this.f1984t.getWidth(), this.f1984t.getHeight());
                    float[] fArr3 = this.f1980p;
                    fArr3[1] = this.f1978n * min2;
                    fArr3[0] = min2 * this.f1977m;
                }
                float f8 = this.f1977m;
                float[] fArr4 = this.f1980p;
                if (((double) Math.abs(((f8 * fArr4[0]) + (this.f1978n * fArr4[1])) * this.f1988x)) < 0.01d) {
                    float[] fArr5 = this.f1980p;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.f1977m != 0.0f) {
                    f2 = rawX / this.f1980p[0];
                } else {
                    f2 = rawY / this.f1980p[1];
                }
                float max = Math.max(Math.min(progress2 + f2, 1.0f), 0.0f);
                if (this.f1967c == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.f1967c == 7) {
                    max = Math.min(max, 0.99f);
                }
                float progress3 = this.f1984t.getProgress();
                if (max != progress3) {
                    int i5 = (progress3 > 0.0f ? 1 : (progress3 == 0.0f ? 0 : -1));
                    if (i5 == 0 || progress3 == 1.0f) {
                        this.f1984t.mo2452f0(i5 == 0);
                    }
                    this.f1984t.setProgress(max);
                    gVar2.mo2528e(1000);
                    this.f1984t.f1629D = this.f1977m != 0.0f ? gVar.mo2527d() / this.f1980p[0] : gVar.mo2526c() / this.f1980p[1];
                } else {
                    this.f1984t.f1629D = 0.0f;
                }
                this.f1982r = motionEvent.getRawX();
                this.f1983s = motionEvent.getRawY();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0326  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2701t(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.C0373g r25, int r26, androidx.constraintlayout.motion.widget.C0400q r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r24
            r1.mo2525b(r2)
            int r3 = r24.getAction()
            r4 = 0
            if (r3 == 0) goto L_0x0339
            r5 = 1135869952(0x43b40000, float:360.0)
            r6 = -1
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1
            if (r3 == r10) goto L_0x01c4
            r11 = 2
            if (r3 == r11) goto L_0x001d
            goto L_0x0347
        L_0x001d:
            r24.getRawY()
            r24.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1984t
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f1984t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.f1975k
            if (r12 == r6) goto L_0x006c
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1984t
            android.view.View r3 = r3.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f1984t
            int[] r12 = r0.f1981q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f1981q
            r11 = r11[r4]
            float r11 = (float) r11
            int r12 = r3.getLeft()
            int r13 = r3.getRight()
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 / r9
            float r11 = r11 + r12
            int[] r12 = r0.f1981q
            r12 = r12[r10]
            float r12 = (float) r12
            int r13 = r3.getTop()
            int r3 = r3.getBottom()
            int r13 = r13 + r3
            float r3 = (float) r13
            float r3 = r3 / r9
            float r3 = r3 + r12
            r22 = r11
            r11 = r3
            r3 = r22
            goto L_0x00b3
        L_0x006c:
            int r12 = r0.f1968d
            if (r12 == r6) goto L_0x00b3
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.f1984t
            androidx.constraintlayout.motion.widget.n r12 = r13.mo2472n0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.f1984t
            int r12 = r12.mo2589h()
            android.view.View r12 = r13.findViewById(r12)
            if (r12 != 0) goto L_0x008a
            java.lang.String r9 = "TouchResponse"
            java.lang.String r12 = "could not find view to animate to"
            android.util.Log.e(r9, r12)
            goto L_0x00b3
        L_0x008a:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1984t
            int[] r11 = r0.f1981q
            r3.getLocationOnScreen(r11)
            int[] r3 = r0.f1981q
            r3 = r3[r4]
            float r3 = (float) r3
            int r11 = r12.getLeft()
            int r13 = r12.getRight()
            int r11 = r11 + r13
            float r11 = (float) r11
            float r11 = r11 / r9
            float r3 = r3 + r11
            int[] r11 = r0.f1981q
            r11 = r11[r10]
            float r11 = (float) r11
            int r13 = r12.getTop()
            int r12 = r12.getBottom()
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 / r9
            float r11 = r11 + r12
        L_0x00b3:
            float r9 = r24.getRawX()
            float r9 = r9 - r3
            float r12 = r24.getRawY()
            float r12 = r12 - r11
            float r13 = r24.getRawY()
            float r13 = r13 - r11
            double r13 = (double) r13
            float r15 = r24.getRawX()
            float r15 = r15 - r3
            r27 = r9
            double r8 = (double) r15
            double r8 = java.lang.Math.atan2(r13, r8)
            float r13 = r0.f1983s
            float r13 = r13 - r11
            double r13 = (double) r13
            float r11 = r0.f1982r
            float r11 = r11 - r3
            double r6 = (double) r11
            double r6 = java.lang.Math.atan2(r13, r6)
            double r6 = r8 - r6
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r6 = r6 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 / r13
            float r6 = (float) r6
            r7 = 1134886912(0x43a50000, float:330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f3
            float r6 = r6 - r5
            goto L_0x00fa
        L_0x00f3:
            r7 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00fa
            float r6 = r6 + r5
        L_0x00fa:
            float r7 = java.lang.Math.abs(r6)
            double r13 = (double) r7
            r16 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x010c
            boolean r7 = r0.f1979o
            if (r7 == 0) goto L_0x0347
        L_0x010c:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f1984t
            float r7 = r7.getProgress()
            boolean r11 = r0.f1979o
            if (r11 != 0) goto L_0x011d
            r0.f1979o = r10
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f1984t
            r11.setProgress(r7)
        L_0x011d:
            int r11 = r0.f1968d
            r3 = -1
            if (r11 == r3) goto L_0x0146
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1984t
            float r5 = r0.f1972h
            float r13 = r0.f1971g
            float[] r14 = r0.f1980p
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r13
            r21 = r14
            r16.mo2470l0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f1980p
            r5 = r3[r10]
            double r13 = (double) r5
            double r13 = java.lang.Math.toDegrees(r13)
            float r5 = (float) r13
            r3[r10] = r5
            goto L_0x014a
        L_0x0146:
            float[] r3 = r0.f1980p
            r3[r10] = r5
        L_0x014a:
            float r3 = r0.f1988x
            float r6 = r6 * r3
            float[] r3 = r0.f1980p
            r3 = r3[r10]
            float r6 = r6 / r3
            float r7 = r7 + r6
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r7, r3)
            r6 = 0
            float r5 = java.lang.Math.max(r5, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f1984t
            float r7 = r7.getProgress()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x01b1
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0171
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0179
        L_0x0171:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1984t
            if (r6 != 0) goto L_0x0176
            r4 = 1
        L_0x0176:
            r3.mo2452f0(r4)
        L_0x0179:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1984t
            r3.setProgress(r5)
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.mo2528e(r3)
            float r3 = r25.mo2527d()
            float r1 = r25.mo2526c()
            double r4 = (double) r1
            double r6 = (double) r3
            double r10 = java.lang.Math.hypot(r4, r6)
            double r3 = java.lang.Math.atan2(r4, r6)
            double r3 = r3 - r8
            double r3 = java.lang.Math.sin(r3)
            double r10 = r10 * r3
            r9 = r27
            double r3 = (double) r9
            double r5 = (double) r12
            double r3 = java.lang.Math.hypot(r3, r5)
            double r10 = r10 / r3
            float r1 = (float) r10
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1984t
            double r4 = (double) r1
            double r4 = java.lang.Math.toDegrees(r4)
            float r1 = (float) r4
            r3.f1629D = r1
            goto L_0x01b6
        L_0x01b1:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1984t
            r3 = 0
            r1.f1629D = r3
        L_0x01b6:
            float r1 = r24.getRawX()
            r0.f1982r = r1
            float r1 = r24.getRawY()
            r0.f1983s = r1
            goto L_0x0347
        L_0x01c4:
            r0.f1979o = r4
            r6 = 16
            r1.mo2528e(r6)
            float r6 = r25.mo2527d()
            float r1 = r25.mo2526c()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f1984t
            float r7 = r7.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f1984t
            int r8 = r8.getWidth()
            float r8 = (float) r8
            float r8 = r8 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f1984t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.f1975k
            r3 = -1
            if (r12 == r3) goto L_0x021f
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f1984t
            android.view.View r8 = r8.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f1984t
            int[] r12 = r0.f1981q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f1981q
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.f1981q
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
        L_0x0219:
            int r12 = r12 + r8
            float r8 = (float) r12
            float r8 = r8 / r9
            float r11 = r11 + r8
            r8 = r4
            goto L_0x025a
        L_0x021f:
            int r12 = r0.f1968d
            r3 = -1
            if (r12 == r3) goto L_0x025a
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f1984t
            androidx.constraintlayout.motion.widget.n r8 = r8.mo2472n0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f1984t
            int r8 = r8.mo2589h()
            android.view.View r8 = r11.findViewById(r8)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f1984t
            int[] r12 = r0.f1981q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f1981q
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.f1981q
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
            goto L_0x0219
        L_0x025a:
            float r4 = r24.getRawX()
            float r4 = r4 - r8
            float r2 = r24.getRawY()
            float r2 = r2 - r11
            double r8 = (double) r2
            double r11 = (double) r4
            double r8 = java.lang.Math.atan2(r8, r11)
            double r8 = java.lang.Math.toDegrees(r8)
            int r11 = r0.f1968d
            r3 = -1
            if (r11 == r3) goto L_0x0297
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1984t
            float r5 = r0.f1972h
            float r12 = r0.f1971g
            float[] r13 = r0.f1980p
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r12
            r21 = r13
            r16.mo2470l0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f1980p
            r5 = r3[r10]
            double r11 = (double) r5
            double r11 = java.lang.Math.toDegrees(r11)
            float r5 = (float) r11
            r3[r10] = r5
            goto L_0x029b
        L_0x0297:
            float[] r3 = r0.f1980p
            r3[r10] = r5
        L_0x029b:
            float r1 = r1 + r2
            double r1 = (double) r1
            float r6 = r6 + r4
            double r3 = (double) r6
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 - r8
            float r1 = (float) r1
            r2 = 1115291648(0x427a0000, float:62.5)
            float r1 = r1 * r2
            boolean r2 = java.lang.Float.isNaN(r1)
            r3 = 1077936128(0x40400000, float:3.0)
            if (r2 != 0) goto L_0x02c2
            float r2 = r1 * r3
            float r4 = r0.f1988x
            float r2 = r2 * r4
            float[] r4 = r0.f1980p
            r4 = r4[r10]
            float r2 = r2 / r4
            float r2 = r2 + r7
            goto L_0x02c3
        L_0x02c2:
            r2 = r7
        L_0x02c3:
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0326
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0326
            int r4 = r0.f1967c
            r5 = 3
            if (r4 == r5) goto L_0x0326
            float r5 = r0.f1988x
            float r1 = r1 * r5
            float[] r5 = r0.f1980p
            r5 = r5[r10]
            float r1 = r1 / r5
            double r5 = (double) r2
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x02e5
            r2 = 0
            goto L_0x02e7
        L_0x02e5:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02e7:
            r5 = 6
            if (r4 != r5) goto L_0x02f7
            float r2 = r7 + r1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x02f5
            float r1 = java.lang.Math.abs(r1)
        L_0x02f5:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02f7:
            int r4 = r0.f1967c
            r5 = 7
            if (r4 != r5) goto L_0x030a
            float r2 = r7 + r1
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0309
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
        L_0x0309:
            r2 = 0
        L_0x030a:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.f1984t
            int r5 = r0.f1967c
            float r1 = r1 * r3
            r4.mo2438C0(r5, r2, r1)
            r1 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x031e
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0347
        L_0x031e:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1984t
            androidx.constraintlayout.motion.widget.MotionLayout$k r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.FINISHED
            r1.setState(r2)
            goto L_0x0347
        L_0x0326:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0331
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0347
        L_0x0331:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1984t
            androidx.constraintlayout.motion.widget.MotionLayout$k r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0377k.FINISHED
            r1.setState(r2)
            goto L_0x0347
        L_0x0339:
            float r1 = r24.getRawX()
            r0.f1982r = r1
            float r1 = r24.getRawY()
            r0.f1983s = r1
            r0.f1979o = r4
        L_0x0347:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0404r.mo2701t(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$g, int, androidx.constraintlayout.motion.widget.q):void");
    }

    public String toString() {
        if (Float.isNaN(this.f1977m)) {
            return "rotation";
        }
        float f = this.f1977m;
        float f2 = this.f1978n;
        StringBuilder sb = new StringBuilder(33);
        sb.append(f);
        sb.append(" , ");
        sb.append(f2);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2703u(float f, float f2) {
        float f3;
        float progress = this.f1984t.getProgress();
        if (!this.f1979o) {
            this.f1979o = true;
            this.f1984t.setProgress(progress);
        }
        this.f1984t.mo2470l0(this.f1968d, progress, this.f1972h, this.f1971g, this.f1980p);
        float f4 = this.f1977m;
        float[] fArr = this.f1980p;
        if (((double) Math.abs((f4 * fArr[0]) + (this.f1978n * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f1980p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f1977m;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.f1980p[0];
        } else {
            f3 = (f2 * this.f1978n) / this.f1980p[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.f1984t.getProgress()) {
            this.f1984t.setProgress(max);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2704v(float f, float f2) {
        float f3;
        boolean z = false;
        this.f1979o = false;
        float progress = this.f1984t.getProgress();
        this.f1984t.mo2470l0(this.f1968d, progress, this.f1972h, this.f1971g, this.f1980p);
        float f4 = this.f1977m;
        float[] fArr = this.f1980p;
        float f5 = fArr[0];
        float f6 = this.f1978n;
        float f7 = fArr[1];
        float f8 = 0.0f;
        if (f4 != 0.0f) {
            f3 = (f * f4) / fArr[0];
        } else {
            f3 = (f2 * f6) / fArr[1];
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z2 = progress != 1.0f;
            int i = this.f1967c;
            if (i != 3) {
                z = true;
            }
            if (z && z2) {
                MotionLayout motionLayout = this.f1984t;
                if (((double) progress) >= 0.5d) {
                    f8 = 1.0f;
                }
                motionLayout.mo2438C0(i, f8, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2705w(float f, float f2) {
        this.f1982r = f;
        this.f1983s = f2;
    }

    /* renamed from: x */
    public void mo2706x(boolean z) {
        if (z) {
            float[][] fArr = f1958H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f1957G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f1958H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f1957G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = f1957G;
        int i = this.f1965a;
        this.f1972h = fArr5[i][0];
        this.f1971g = fArr5[i][1];
        int i2 = this.f1966b;
        float[][] fArr6 = f1958H;
        if (i2 < fArr6.length) {
            this.f1977m = fArr6[i2][0];
            this.f1978n = fArr6[i2][1];
        }
    }

    /* renamed from: y */
    public void mo2707y(int i) {
        this.f1967c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo2708z(float f, float f2) {
        this.f1982r = f;
        this.f1983s = f2;
        this.f1979o = false;
    }
}
