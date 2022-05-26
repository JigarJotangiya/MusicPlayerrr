package coocent.music.player.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: coocent.music.player.widget.i */
/* compiled from: RecyclerItemDecoration */
public class C7192i extends RecyclerView.C0808o {

    /* renamed from: a */
    private int f31829a;

    /* renamed from: b */
    private int f31830b;

    public C7192i(int i, int i2) {
        this.f31829a = i;
        this.f31830b = i2;
    }

    /* renamed from: d */
    public void mo4874d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        super.mo4874d(rect, view, recyclerView, zVar);
        rect.bottom = this.f31829a;
        if (recyclerView.mo4623h0(view) % this.f31830b == 0) {
            rect.left = 0;
        } else {
            rect.left = this.f31829a;
        }
    }
}
