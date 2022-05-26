package p082e.p147t.p148e;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p109h.p118o.C3703i;
import p082e.p109h.p119p.C3774v;

/* renamed from: e.t.e.n0 */
/* compiled from: ViewAutoScroller */
final class C4188n0 extends C4144d {

    /* renamed from: a */
    private final float f12540a;

    /* renamed from: b */
    private final C4191c f12541b;

    /* renamed from: c */
    private final Runnable f12542c;

    /* renamed from: d */
    private Point f12543d;

    /* renamed from: e */
    private Point f12544e;

    /* renamed from: f */
    private boolean f12545f;

    /* renamed from: e.t.e.n0$a */
    /* compiled from: ViewAutoScroller */
    class C4189a implements Runnable {
        C4189a() {
        }

        public void run() {
            C4188n0.this.mo14347f();
        }
    }

    /* renamed from: e.t.e.n0$b */
    /* compiled from: ViewAutoScroller */
    private static final class C4190b extends C4191c {

        /* renamed from: a */
        private final RecyclerView f12547a;

        C4190b(RecyclerView recyclerView) {
            this.f12547a = recyclerView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo14349a() {
            Rect rect = new Rect();
            this.f12547a.getGlobalVisibleRect(rect);
            return rect.height();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo14350b(Runnable runnable) {
            this.f12547a.removeCallbacks(runnable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo14351c(Runnable runnable) {
            C3774v.m16201g0(this.f12547a, runnable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo14352d(int i) {
            this.f12547a.scrollBy(0, i);
        }
    }

    /* renamed from: e.t.e.n0$c */
    /* compiled from: ViewAutoScroller */
    static abstract class C4191c {
        C4191c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract int mo14349a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo14350b(Runnable runnable);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo14351c(Runnable runnable);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo14352d(int i);
    }

    C4188n0(C4191c cVar) {
        this(cVar, 0.125f);
    }

    /* renamed from: c */
    private boolean m18436c(Point point) {
        float f = this.f12540a;
        return Math.abs(this.f12543d.y - point.y) >= ((int) ((((float) this.f12541b.mo14349a()) * f) * (f * 2.0f)));
    }

    /* renamed from: e */
    static C4191c m18437e(RecyclerView recyclerView) {
        return new C4190b(recyclerView);
    }

    /* renamed from: g */
    private float m18438g(float f) {
        return (float) Math.pow((double) f, 10.0d);
    }

    /* renamed from: a */
    public void mo14263a() {
        this.f12541b.mo14350b(this.f12542c);
        this.f12543d = null;
        this.f12544e = null;
        this.f12545f = false;
    }

    /* renamed from: b */
    public void mo14264b(Point point) {
        this.f12544e = point;
        if (this.f12543d == null) {
            this.f12543d = point;
        }
        this.f12541b.mo14351c(this.f12542c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo14346d(int i) {
        int signum = (int) Math.signum((float) i);
        int g = (int) (((float) (signum * 70)) * m18438g(Math.min(1.0f, ((float) Math.abs(i)) / ((float) ((int) (((float) this.f12541b.mo14349a()) * this.f12540a))))));
        return g != 0 ? g : signum;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo14347f() {
        int i;
        int a = (int) (((float) this.f12541b.mo14349a()) * this.f12540a);
        int i2 = this.f12544e.y;
        if (i2 <= a) {
            i = i2 - a;
        } else {
            i = i2 >= this.f12541b.mo14349a() - a ? (this.f12544e.y - this.f12541b.mo14349a()) + a : 0;
        }
        if (i != 0) {
            if (this.f12545f || m18436c(this.f12544e)) {
                this.f12545f = true;
                if (i <= a) {
                    a = i;
                }
                this.f12541b.mo14352d(mo14346d(a));
                this.f12541b.mo14350b(this.f12542c);
                this.f12541b.mo14351c(this.f12542c);
            }
        }
    }

    C4188n0(C4191c cVar, float f) {
        C3703i.m15824a(cVar != null);
        this.f12541b = cVar;
        this.f12540a = f;
        this.f12542c = new C4189a();
    }
}
