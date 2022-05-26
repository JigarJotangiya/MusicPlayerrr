package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.p */
/* compiled from: LinearSmoothScroller */
public class C0901p extends RecyclerView.C0823y {

    /* renamed from: i */
    protected final LinearInterpolator f4038i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f4039j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f4040k;

    /* renamed from: l */
    private final DisplayMetrics f4041l;

    /* renamed from: m */
    private boolean f4042m = false;

    /* renamed from: n */
    private float f4043n;

    /* renamed from: o */
    protected int f4044o = 0;

    /* renamed from: p */
    protected int f4045p = 0;

    public C0901p(Context context) {
        this.f4041l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m5516A() {
        if (!this.f4042m) {
            this.f4043n = mo5373v(this.f4041l);
            this.f4042m = true;
        }
        return this.f4043n;
    }

    /* renamed from: y */
    private int m5517y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo5368B() {
        PointF pointF = this.f4040k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo5369C(RecyclerView.C0823y.C0824a aVar) {
        PointF a = mo5034a(mo5039f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo5053b(mo5039f());
            mo5051r();
            return;
        }
        mo5042i(a);
        this.f4040k = a;
        this.f4044o = (int) (a.x * 10000.0f);
        this.f4045p = (int) (a.y * 10000.0f);
        aVar.mo5055d((int) (((float) this.f4044o) * 1.2f), (int) (((float) this.f4045p) * 1.2f), (int) (((float) mo5375x(10000)) * 1.2f), this.f4038i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo5045l(int i, int i2, RecyclerView.C0826z zVar, RecyclerView.C0823y.C0824a aVar) {
        if (mo5036c() == 0) {
            mo5051r();
            return;
        }
        this.f4044o = m5517y(this.f4044o, i);
        int y = m5517y(this.f4045p, i2);
        this.f4045p = y;
        if (this.f4044o == 0 && y == 0) {
            mo5369C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo5046m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo5047n() {
        this.f4045p = 0;
        this.f4044o = 0;
        this.f4040k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5048o(View view, RecyclerView.C0826z zVar, RecyclerView.C0823y.C0824a aVar) {
        int t = mo5371t(view, mo5376z());
        int u = mo5372u(view, mo5368B());
        int w = mo5374w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.mo5055d(-t, -u, w, this.f4039j);
        }
    }

    /* renamed from: s */
    public int mo5370s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: t */
    public int mo5371t(View view, int i) {
        RecyclerView.C0809p e = mo5038e();
        if (e == null || !e.mo4495l()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return mo5370s(e.mo4911R(view) - layoutParams.leftMargin, e.mo4915U(view) + layoutParams.rightMargin, e.mo4934f0(), e.mo4955p0() - e.mo4936g0(), i);
    }

    /* renamed from: u */
    public int mo5372u(View view, int i) {
        RecyclerView.C0809p e = mo5038e();
        if (e == null || !e.mo4496m()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return mo5370s(e.mo4916V(view) - layoutParams.topMargin, e.mo4908P(view) + layoutParams.bottomMargin, e.mo4938h0(), e.mo4919X() - e.mo4932e0(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public float mo5373v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo5374w(int i) {
        return (int) Math.ceil(((double) mo5375x(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo5375x(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m5516A()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo5376z() {
        PointF pointF = this.f4040k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
