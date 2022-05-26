package coocent.music.player.widget.recyclerview_fastscroll.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import coocent.music.player.widget.p277m.p278a.C7265a;
import coocent.music.player.widget.p277m.p279b.C7266a;
import p082e.p137o.p138a.p139a.C4096a;
import p082e.p137o.p138a.p139a.C4098c;
import p342g.p343a.p344a.C7941a;

public class FastScroller {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public FastScrollRecyclerView f32099a;

    /* renamed from: b */
    private FastScrollPopup f32100b;

    /* renamed from: c */
    private int f32101c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f32102d;

    /* renamed from: e */
    private Paint f32103e;

    /* renamed from: f */
    private Paint f32104f;

    /* renamed from: g */
    private Rect f32105g = new Rect();

    /* renamed from: h */
    private Rect f32106h = new Rect();

    /* renamed from: i */
    private Rect f32107i = new Rect();

    /* renamed from: j */
    private int f32108j;

    /* renamed from: k */
    private int f32109k;

    /* renamed from: l */
    public Point f32110l = new Point(-1, -1);

    /* renamed from: m */
    public Point f32111m = new Point(0, 0);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f32112n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Animator f32113o;

    /* renamed from: p */
    boolean f32114p;

    /* renamed from: q */
    private int f32115q = 1500;

    /* renamed from: r */
    private boolean f32116r = true;

    /* renamed from: s */
    private final Runnable f32117s;

    /* renamed from: t */
    private int f32118t;

    /* renamed from: u */
    private boolean f32119u;

    /* renamed from: coocent.music.player.widget.recyclerview_fastscroll.views.FastScroller$a */
    class C7272a implements Runnable {
        C7272a() {
        }

        public void run() {
            if (!FastScroller.this.f32112n) {
                if (FastScroller.this.f32113o != null) {
                    FastScroller.this.f32113o.cancel();
                }
                FastScroller fastScroller = FastScroller.this;
                int i = 1;
                int[] iArr = new int[1];
                if (C7266a.m41186a(fastScroller.f32099a.getResources())) {
                    i = -1;
                }
                iArr[0] = i * FastScroller.this.f32102d;
                Animator unused = fastScroller.f32113o = ObjectAnimator.ofInt(fastScroller, "offsetX", iArr);
                FastScroller.this.f32113o.setInterpolator(new C4096a());
                FastScroller.this.f32113o.setDuration(200);
                FastScroller.this.f32113o.start();
            }
        }
    }

    /* renamed from: coocent.music.player.widget.recyclerview_fastscroll.views.FastScroller$b */
    class C7273b extends RecyclerView.C0817t {
        C7273b() {
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
            super.mo4985b(recyclerView, i, i2);
            if (!FastScroller.this.f32099a.isInEditMode()) {
                FastScroller.this.mo27909z();
            }
        }
    }

    /* renamed from: coocent.music.player.widget.recyclerview_fastscroll.views.FastScroller$c */
    class C7274c extends AnimatorListenerAdapter {
        C7274c() {
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            FastScroller.this.f32114p = false;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FastScroller.this.f32114p = false;
        }
    }

    /* JADX INFO: finally extract failed */
    public FastScroller(Context context, FastScrollRecyclerView fastScrollRecyclerView, AttributeSet attributeSet) {
        Resources resources = context.getResources();
        this.f32099a = fastScrollRecyclerView;
        this.f32100b = new FastScrollPopup(resources, fastScrollRecyclerView);
        this.f32101c = C7266a.m41187b(resources, 48.0f);
        this.f32102d = C7266a.m41187b(resources, 8.0f);
        this.f32108j = C7266a.m41187b(resources, -24.0f);
        this.f32103e = new Paint(1);
        this.f32104f = new Paint(1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7941a.FastScrollRecyclerView, 0, 0);
        try {
            this.f32116r = obtainStyledAttributes.getBoolean(0, true);
            this.f32115q = obtainStyledAttributes.getInteger(1, 1500);
            this.f32119u = obtainStyledAttributes.getBoolean(8, false);
            int i = 2030043136;
            this.f32118t = obtainStyledAttributes.getColor(7, 2030043136);
            int color = obtainStyledAttributes.getColor(9, 671088640);
            int color2 = obtainStyledAttributes.getColor(3, -16777216);
            int color3 = obtainStyledAttributes.getColor(5, -1);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, C7266a.m41188c(resources, 44.0f));
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(2, C7266a.m41187b(resources, 88.0f));
            int integer = obtainStyledAttributes.getInteger(4, 0);
            this.f32104f.setColor(color);
            Paint paint = this.f32103e;
            if (!this.f32119u) {
                i = this.f32118t;
            }
            paint.setColor(i);
            this.f32100b.mo27856f(color2);
            this.f32100b.mo27860i(color3);
            this.f32100b.mo27861j(dimensionPixelSize);
            this.f32100b.mo27855e(dimensionPixelSize2);
            this.f32100b.mo27857g(integer);
            obtainStyledAttributes.recycle();
            this.f32117s = new C7272a();
            this.f32099a.mo4634l(new C7273b());
            if (this.f32116r) {
                mo27895m();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: l */
    private boolean m41226l(int i, int i2) {
        Rect rect = this.f32105g;
        Point point = this.f32110l;
        int i3 = point.x;
        int i4 = point.y;
        rect.set(i3, i4, this.f32102d + i3, this.f32101c + i4);
        Rect rect2 = this.f32105g;
        int i5 = this.f32108j;
        rect2.inset(i5, i5);
        return this.f32105g.contains(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo27888f() {
        FastScrollRecyclerView fastScrollRecyclerView = this.f32099a;
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.removeCallbacks(this.f32117s);
        }
    }

    /* renamed from: g */
    public void mo27889g(Canvas canvas) {
        Point point = this.f32110l;
        int i = point.x;
        if (i >= 0 && point.y >= 0) {
            Point point2 = this.f32111m;
            int i2 = point2.x;
            canvas.drawRect((float) (i + i2), (float) point2.y, (float) (i + i2 + this.f32102d), (float) (this.f32099a.getHeight() + this.f32111m.y), this.f32104f);
            Point point3 = this.f32110l;
            int i3 = point3.x;
            Point point4 = this.f32111m;
            int i4 = point4.x;
            int i5 = point3.y;
            int i6 = point4.y;
            canvas.drawRect((float) (i3 + i4), (float) (i5 + i6), (float) (i3 + i4 + this.f32102d), (float) (i5 + i6 + this.f32101c), this.f32103e);
            this.f32100b.mo27853c(canvas);
        }
    }

    @Keep
    public int getOffsetX() {
        return this.f32111m.x;
    }

    /* renamed from: h */
    public int mo27891h() {
        return this.f32101c;
    }

    /* renamed from: i */
    public int mo27892i() {
        return this.f32102d;
    }

    /* renamed from: j */
    public void mo27893j(MotionEvent motionEvent, int i, int i2, int i3, C7265a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f32099a.getContext());
        int action = motionEvent.getAction();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f32112n && m41226l(i, i2) && Math.abs(y - i2) > viewConfiguration.getScaledTouchSlop()) {
                        this.f32099a.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f32112n = true;
                        this.f32109k += i3 - i2;
                        this.f32100b.mo27852a(true);
                        if (aVar != null) {
                            aVar.mo27851b();
                        }
                        if (this.f32119u) {
                            this.f32103e.setColor(this.f32118t);
                        }
                    }
                    if (this.f32112n) {
                        int height = this.f32099a.getHeight() - this.f32101c;
                        String O1 = this.f32099a.mo27868O1((((float) Math.max(0, Math.min(height, y - this.f32109k))) - ((float) 0)) / ((float) (height - 0)));
                        this.f32100b.mo27859h(O1);
                        this.f32100b.mo27852a(!O1.isEmpty());
                        FastScrollRecyclerView fastScrollRecyclerView = this.f32099a;
                        fastScrollRecyclerView.invalidate(this.f32100b.mo27863l(fastScrollRecyclerView, this.f32110l.y));
                        return;
                    }
                    return;
                } else if (action != 3) {
                    return;
                }
            }
            this.f32109k = 0;
            if (this.f32112n) {
                this.f32112n = false;
                this.f32100b.mo27852a(false);
                if (aVar != null) {
                    aVar.mo27850a();
                }
            }
            if (this.f32119u) {
                this.f32103e.setColor(2030043136);
            }
        } else if (m41226l(i, i2)) {
            this.f32109k = i2 - this.f32110l.y;
        }
    }

    /* renamed from: k */
    public boolean mo27894k() {
        return this.f32112n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo27895m() {
        if (this.f32099a != null) {
            mo27888f();
            this.f32099a.postDelayed(this.f32117s, (long) this.f32115q);
        }
    }

    /* renamed from: n */
    public void mo27896n(int i) {
        this.f32115q = i;
        if (this.f32116r) {
            mo27895m();
        }
    }

    /* renamed from: o */
    public void mo27897o(boolean z) {
        this.f32116r = z;
        if (z) {
            mo27895m();
        } else {
            mo27888f();
        }
    }

    /* renamed from: p */
    public void mo27898p(int i, int i2) {
        Point point = this.f32111m;
        int i3 = point.x;
        if (i3 != i || point.y != i2) {
            Rect rect = this.f32106h;
            int i4 = this.f32110l.x;
            rect.set(i4 + i3, point.y, i4 + i3 + this.f32102d, this.f32099a.getHeight() + this.f32111m.y);
            this.f32111m.set(i, i2);
            Rect rect2 = this.f32107i;
            int i5 = this.f32110l.x;
            Point point2 = this.f32111m;
            int i6 = point2.x;
            rect2.set(i5 + i6, point2.y, i5 + i6 + this.f32102d, this.f32099a.getHeight() + this.f32111m.y);
            this.f32106h.union(this.f32107i);
            this.f32099a.invalidate(this.f32106h);
        }
    }

    /* renamed from: q */
    public void mo27899q(int i) {
        this.f32100b.mo27856f(i);
    }

    /* renamed from: r */
    public void mo27900r(int i) {
        this.f32100b.mo27857g(i);
    }

    /* renamed from: s */
    public void mo27901s(int i) {
        this.f32100b.mo27860i(i);
    }

    @Keep
    public void setOffsetX(int i) {
        mo27898p(i, this.f32111m.y);
    }

    /* renamed from: t */
    public void mo27903t(int i) {
        this.f32100b.mo27861j(i);
    }

    /* renamed from: u */
    public void mo27904u(Typeface typeface) {
        this.f32100b.mo27862k(typeface);
    }

    /* renamed from: v */
    public void mo27905v(int i) {
        this.f32103e.setColor(i);
        this.f32099a.invalidate(this.f32106h);
    }

    /* renamed from: w */
    public void mo27906w(boolean z) {
        this.f32119u = z;
        this.f32103e.setColor(z ? 2030043136 : this.f32118t);
    }

    /* renamed from: x */
    public void mo27907x(int i, int i2) {
        Point point = this.f32110l;
        int i3 = point.x;
        if (i3 != i || point.y != i2) {
            Rect rect = this.f32106h;
            Point point2 = this.f32111m;
            int i4 = point2.x;
            rect.set(i3 + i4, point2.y, i3 + i4 + this.f32102d, this.f32099a.getHeight() + this.f32111m.y);
            this.f32110l.set(i, i2);
            Rect rect2 = this.f32107i;
            int i5 = this.f32110l.x;
            Point point3 = this.f32111m;
            int i6 = point3.x;
            rect2.set(i5 + i6, point3.y, i5 + i6 + this.f32102d, this.f32099a.getHeight() + this.f32111m.y);
            this.f32106h.union(this.f32107i);
            this.f32099a.invalidate(this.f32106h);
        }
    }

    /* renamed from: y */
    public void mo27908y(int i) {
        this.f32104f.setColor(i);
        this.f32099a.invalidate(this.f32106h);
    }

    /* renamed from: z */
    public void mo27909z() {
        if (!this.f32114p) {
            Animator animator = this.f32113o;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "offsetX", new int[]{0});
            this.f32113o = ofInt;
            ofInt.setInterpolator(new C4098c());
            this.f32113o.setDuration(150);
            this.f32113o.addListener(new C7274c());
            this.f32114p = true;
            this.f32113o.start();
        }
        if (this.f32116r) {
            mo27895m();
        } else {
            mo27888f();
        }
    }
}
