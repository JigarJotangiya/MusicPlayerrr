package p082e.p147t.p148e;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.C0506a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p109h.p118o.C3703i;
import p082e.p147t.p148e.C4168j0;
import p082e.p147t.p148e.C4197r;

/* renamed from: e.t.e.g */
/* compiled from: DefaultBandHost */
final class C4157g<K> extends C4197r.C4199b<K> {

    /* renamed from: e */
    private static final Rect f12485e = new Rect(0, 0, 0, 0);

    /* renamed from: a */
    private final RecyclerView f12486a;

    /* renamed from: b */
    private final Drawable f12487b;

    /* renamed from: c */
    private final C4206t<K> f12488c;

    /* renamed from: d */
    private final C4168j0.C4175c<K> f12489d;

    /* renamed from: e.t.e.g$a */
    /* compiled from: DefaultBandHost */
    class C4158a extends RecyclerView.C0808o {
        C4158a() {
        }

        /* renamed from: h */
        public void mo4878h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
            C4157g.this.mo14287l(canvas);
        }
    }

    C4157g(RecyclerView recyclerView, int i, C4206t<K> tVar, C4168j0.C4175c<K> cVar) {
        boolean z = true;
        C3703i.m15824a(recyclerView != null);
        this.f12486a = recyclerView;
        Drawable d = C0506a.m3152d(recyclerView.getContext(), i);
        this.f12487b = d;
        C3703i.m15824a(d != null);
        C3703i.m15824a(tVar != null);
        C3703i.m15824a(cVar == null ? false : z);
        this.f12488c = tVar;
        this.f12489d = cVar;
        recyclerView.mo4622h(new C4158a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14271a(RecyclerView.C0817t tVar) {
        this.f12486a.mo4634l(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C4197r<K> mo14272b() {
        return new C4197r<>(this, this.f12488c, this.f12489d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14273c() {
        this.f12487b.setBounds(f12485e);
        this.f12486a.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo14274d(Rect rect) {
        this.f12487b.setBounds(rect);
        this.f12486a.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Point mo14280e(Point point) {
        return new Point(point.x + this.f12486a.computeHorizontalScrollOffset(), point.y + this.f12486a.computeVerticalScrollOffset());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Rect mo14281f(int i) {
        View childAt = this.f12486a.getChildAt(i);
        Rect rect = new Rect();
        childAt.getHitRect(rect);
        rect.left += this.f12486a.computeHorizontalScrollOffset();
        rect.right += this.f12486a.computeHorizontalScrollOffset();
        rect.top += this.f12486a.computeVerticalScrollOffset();
        rect.bottom += this.f12486a.computeVerticalScrollOffset();
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo14282g(int i) {
        RecyclerView recyclerView = this.f12486a;
        return recyclerView.mo4600g0(recyclerView.getChildAt(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo14283h() {
        RecyclerView.C0809p layoutManager = this.f12486a.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).mo4440W2();
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo14284i() {
        return this.f12486a.getChildCount();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo14285j(int i) {
        return this.f12486a.mo4569Z(i) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo14286k(RecyclerView.C0817t tVar) {
        this.f12486a.mo4624h1(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo14287l(Canvas canvas) {
        this.f12487b.draw(canvas);
    }
}
