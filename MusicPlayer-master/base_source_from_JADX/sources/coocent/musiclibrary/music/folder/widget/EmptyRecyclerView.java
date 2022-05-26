package coocent.musiclibrary.music.folder.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class EmptyRecyclerView extends RecyclerView {

    /* renamed from: R0 */
    View f32427R0;

    /* renamed from: S0 */
    final RecyclerView.C0800j f32428S0 = new C7363a();

    /* renamed from: coocent.musiclibrary.music.folder.widget.EmptyRecyclerView$a */
    class C7363a extends RecyclerView.C0800j {
        C7363a() {
        }

        /* renamed from: a */
        public void mo4834a() {
            super.mo4834a();
            EmptyRecyclerView.this.mo28120G1();
        }
    }

    public EmptyRecyclerView(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public void mo28120G1() {
        View view = this.f32427R0;
        if (view != null) {
            view.setVisibility(getAdapter().getItemCount() > 0 ? 8 : 0);
        }
    }

    public void setAdapter(RecyclerView.C0797h hVar) {
        RecyclerView.C0797h adapter = getAdapter();
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f32428S0);
        }
        super.setAdapter(hVar);
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f32428S0);
        }
    }

    public void setEmptyView(View view) {
        this.f32427R0 = view;
        mo28120G1();
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
