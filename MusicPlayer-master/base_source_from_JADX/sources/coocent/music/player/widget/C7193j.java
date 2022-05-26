package coocent.music.player.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: coocent.music.player.widget.j */
/* compiled from: SpacesItemDecoration */
public class C7193j extends RecyclerView.C0808o {

    /* renamed from: a */
    private int f31831a;

    public C7193j(int i) {
        this.f31831a = i;
    }

    /* renamed from: d */
    public void mo4874d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        int i = this.f31831a;
        rect.left = i;
        rect.right = i;
        rect.bottom = i;
        if (recyclerView.mo4627i0(view) == 0) {
            rect.top = this.f31831a;
        }
    }
}
