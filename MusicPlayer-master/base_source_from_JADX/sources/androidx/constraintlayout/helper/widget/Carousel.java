package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0400q;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.C0439f;
import androidx.recyclerview.widget.C0885l;
import java.util.ArrayList;

public class Carousel extends MotionHelper {

    /* renamed from: A */
    private int f1555A = -1;

    /* renamed from: B */
    private int f1556B = -1;

    /* renamed from: C */
    private int f1557C = -1;

    /* renamed from: D */
    private int f1558D = -1;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public float f1559E = 0.9f;

    /* renamed from: F */
    private int f1560F = 0;

    /* renamed from: G */
    private int f1561G = 4;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f1562H = 1;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public float f1563I = 2.0f;

    /* renamed from: J */
    private int f1564J = -1;

    /* renamed from: K */
    private int f1565K = C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION;

    /* renamed from: L */
    Runnable f1566L = new C0363a();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C0365b f1567t = null;

    /* renamed from: u */
    private final ArrayList<View> f1568u = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f1569v = 0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f1570w = 0;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public MotionLayout f1571x;

    /* renamed from: y */
    private int f1572y = -1;

    /* renamed from: z */
    private boolean f1573z = false;

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a */
    class C0363a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a */
        class C0364a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ float f1575g;

            C0364a(float f) {
                this.f1575g = f;
            }

            public void run() {
                Carousel.this.f1571x.mo2438C0(5, 1.0f, this.f1575g);
            }
        }

        C0363a() {
        }

        public void run() {
            Carousel.this.f1571x.setProgress(0.0f);
            Carousel.this.m2076R();
            Carousel.this.f1567t.mo2375a(Carousel.this.f1570w);
            float velocity = Carousel.this.f1571x.getVelocity();
            if (Carousel.this.f1562H == 2 && velocity > Carousel.this.f1563I && Carousel.this.f1570w < Carousel.this.f1567t.mo2377c() - 1) {
                float L = velocity * Carousel.this.f1559E;
                if (Carousel.this.f1570w == 0 && Carousel.this.f1569v > Carousel.this.f1570w) {
                    return;
                }
                if (Carousel.this.f1570w != Carousel.this.f1567t.mo2377c() - 1 || Carousel.this.f1569v >= Carousel.this.f1570w) {
                    Carousel.this.f1571x.post(new C0364a(L));
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$b */
    public interface C0365b {
        /* renamed from: a */
        void mo2375a(int i);

        /* renamed from: b */
        void mo2376b(View view, int i);

        /* renamed from: c */
        int mo2377c();
    }

    public Carousel(Context context) {
        super(context);
    }

    /* renamed from: N */
    private boolean m2073N(int i, boolean z) {
        MotionLayout motionLayout;
        C0400q.C0402b o0;
        if (i == -1 || (motionLayout = this.f1571x) == null || (o0 = motionLayout.mo2473o0(i)) == null || z == o0.mo2667C()) {
            return false;
        }
        o0.mo2670F(z);
        return true;
    }

    /* renamed from: O */
    private void m2074O(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.Carousel_carousel_firstView) {
                    this.f1572y = obtainStyledAttributes.getResourceId(index, this.f1572y);
                } else if (index == C0439f.Carousel_carousel_backwardTransition) {
                    this.f1555A = obtainStyledAttributes.getResourceId(index, this.f1555A);
                } else if (index == C0439f.Carousel_carousel_forwardTransition) {
                    this.f1556B = obtainStyledAttributes.getResourceId(index, this.f1556B);
                } else if (index == C0439f.Carousel_carousel_emptyViewsBehavior) {
                    this.f1561G = obtainStyledAttributes.getInt(index, this.f1561G);
                } else if (index == C0439f.Carousel_carousel_previousState) {
                    this.f1557C = obtainStyledAttributes.getResourceId(index, this.f1557C);
                } else if (index == C0439f.Carousel_carousel_nextState) {
                    this.f1558D = obtainStyledAttributes.getResourceId(index, this.f1558D);
                } else if (index == C0439f.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f1559E = obtainStyledAttributes.getFloat(index, this.f1559E);
                } else if (index == C0439f.Carousel_carousel_touchUpMode) {
                    this.f1562H = obtainStyledAttributes.getInt(index, this.f1562H);
                } else if (index == C0439f.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f1563I = obtainStyledAttributes.getFloat(index, this.f1563I);
                } else if (index == C0439f.Carousel_carousel_infinite) {
                    this.f1573z = obtainStyledAttributes.getBoolean(index, this.f1573z);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void mo2366Q() {
        this.f1571x.setTransitionDuration(this.f1565K);
        if (this.f1564J < this.f1570w) {
            this.f1571x.mo2443H0(this.f1557C, this.f1565K);
        } else {
            this.f1571x.mo2443H0(this.f1558D, this.f1565K);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m2076R() {
        C0365b bVar = this.f1567t;
        if (bVar != null && this.f1571x != null && bVar.mo2377c() != 0) {
            int size = this.f1568u.size();
            for (int i = 0; i < size; i++) {
                View view = this.f1568u.get(i);
                int i2 = (this.f1570w + i) - this.f1560F;
                if (this.f1573z) {
                    if (i2 < 0) {
                        int i3 = this.f1561G;
                        if (i3 != 4) {
                            m2078T(view, i3);
                        } else {
                            m2078T(view, 0);
                        }
                        if (i2 % this.f1567t.mo2377c() == 0) {
                            this.f1567t.mo2376b(view, 0);
                        } else {
                            C0365b bVar2 = this.f1567t;
                            bVar2.mo2376b(view, bVar2.mo2377c() + (i2 % this.f1567t.mo2377c()));
                        }
                    } else if (i2 >= this.f1567t.mo2377c()) {
                        if (i2 == this.f1567t.mo2377c()) {
                            i2 = 0;
                        } else if (i2 > this.f1567t.mo2377c()) {
                            i2 %= this.f1567t.mo2377c();
                        }
                        int i4 = this.f1561G;
                        if (i4 != 4) {
                            m2078T(view, i4);
                        } else {
                            m2078T(view, 0);
                        }
                        this.f1567t.mo2376b(view, i2);
                    } else {
                        m2078T(view, 0);
                        this.f1567t.mo2376b(view, i2);
                    }
                } else if (i2 < 0) {
                    m2078T(view, this.f1561G);
                } else if (i2 >= this.f1567t.mo2377c()) {
                    m2078T(view, this.f1561G);
                } else {
                    m2078T(view, 0);
                    this.f1567t.mo2376b(view, i2);
                }
            }
            int i5 = this.f1564J;
            if (i5 != -1 && i5 != this.f1570w) {
                this.f1571x.post(new C0366a(this));
            } else if (i5 == this.f1570w) {
                this.f1564J = -1;
            }
            if (this.f1555A == -1 || this.f1556B == -1) {
                Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
            } else if (!this.f1573z) {
                int c = this.f1567t.mo2377c();
                if (this.f1570w == 0) {
                    m2073N(this.f1555A, false);
                } else {
                    m2073N(this.f1555A, true);
                    this.f1571x.setTransition(this.f1555A);
                }
                if (this.f1570w == c - 1) {
                    m2073N(this.f1556B, false);
                    return;
                }
                m2073N(this.f1556B, true);
                this.f1571x.setTransition(this.f1556B);
            }
        }
    }

    /* renamed from: S */
    private boolean m2077S(int i, View view, int i2) {
        C0430c.C0431a w;
        C0430c m0 = this.f1571x.mo2471m0(i);
        if (m0 == null || (w = m0.mo2965w(view.getId())) == null) {
            return false;
        }
        w.f2327c.f2430c = 1;
        view.setVisibility(i2);
        return true;
    }

    /* renamed from: T */
    private boolean m2078T(View view, int i) {
        MotionLayout motionLayout = this.f1571x;
        if (motionLayout == null) {
            return false;
        }
        int[] constraintSetIds = motionLayout.getConstraintSetIds();
        boolean z = false;
        for (int S : constraintSetIds) {
            z |= m2077S(S, view, i);
        }
        return z;
    }

    /* renamed from: a */
    public void mo2367a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    /* renamed from: d */
    public void mo2368d(MotionLayout motionLayout, int i) {
        int i2 = this.f1570w;
        this.f1569v = i2;
        if (i == this.f1558D) {
            this.f1570w = i2 + 1;
        } else if (i == this.f1557C) {
            this.f1570w = i2 - 1;
        }
        if (this.f1573z) {
            if (this.f1570w >= this.f1567t.mo2377c()) {
                this.f1570w = 0;
            }
            if (this.f1570w < 0) {
                this.f1570w = this.f1567t.mo2377c() - 1;
            }
        } else {
            if (this.f1570w >= this.f1567t.mo2377c()) {
                this.f1570w = this.f1567t.mo2377c() - 1;
            }
            if (this.f1570w < 0) {
                this.f1570w = 0;
            }
        }
        if (this.f1569v != this.f1570w) {
            this.f1571x.post(this.f1566L);
        }
    }

    public int getCount() {
        C0365b bVar = this.f1567t;
        if (bVar != null) {
            return bVar.mo2377c();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f1570w;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.f2156h; i++) {
                int i2 = this.f2155g[i];
                View i3 = motionLayout.mo2873i(i2);
                if (this.f1572y == i2) {
                    this.f1560F = i;
                }
                this.f1568u.add(i3);
            }
            this.f1571x = motionLayout;
            if (this.f1562H == 2) {
                C0400q.C0402b o0 = motionLayout.mo2473o0(this.f1556B);
                if (o0 != null) {
                    o0.mo2672H(5);
                }
                C0400q.C0402b o02 = this.f1571x.mo2473o0(this.f1555A);
                if (o02 != null) {
                    o02.mo2672H(5);
                }
            }
            m2076R();
        }
    }

    public void setAdapter(C0365b bVar) {
        this.f1567t = bVar;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2074O(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2074O(context, attributeSet);
    }
}
