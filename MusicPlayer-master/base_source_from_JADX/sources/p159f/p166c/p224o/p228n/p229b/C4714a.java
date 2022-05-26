package p159f.p166c.p224o.p228n.p229b;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p159f.p166c.p224o.p226l.C4648c;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.n.b.a */
/* compiled from: GridItemDecoration.kt */
public final class C4714a extends RecyclerView.C0808o {

    /* renamed from: a */
    private final int f13508a;

    /* renamed from: b */
    private final boolean f13509b;

    /* renamed from: c */
    private int f13510c = 1;

    public C4714a(Context context, int i) {
        C8594l.m46771e(context, "context");
        this.f13508a = context.getResources().getDimensionPixelSize(i);
        this.f13509b = C4648c.m20154a(context);
    }

    /* renamed from: d */
    public void mo4874d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        C8594l.m46771e(rect, "outRect");
        C8594l.m46771e(view, "view");
        C8594l.m46771e(recyclerView, "parent");
        C8594l.m46771e(zVar, "state");
        super.mo4874d(rect, view, recyclerView, zVar);
        RecyclerView.C0809p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            this.f13510c = ((GridLayoutManager) layoutManager).mo4440W2();
            int g0 = recyclerView.mo4600g0(view);
            int i = this.f13510c;
            int i2 = g0 % i;
            int i3 = this.f13508a;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            rect.bottom = i3;
            if (g0 < i) {
                rect.top = i3;
                return;
            }
            return;
        }
        this.f13510c = 1;
        if (!this.f13509b) {
            rect.left = 0;
            rect.right = 0;
            rect.bottom = 0;
            rect.top = 0;
        }
    }
}
