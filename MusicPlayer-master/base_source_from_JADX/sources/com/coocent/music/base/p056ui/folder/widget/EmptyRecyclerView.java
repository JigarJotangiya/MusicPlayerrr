package com.coocent.music.base.p056ui.folder.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.coocent.music.base.ui.folder.widget.EmptyRecyclerView */
public class EmptyRecyclerView extends RecyclerView {

    /* renamed from: R0 */
    View f8300R0;

    /* renamed from: S0 */
    final RecyclerView.C0800j f8301S0 = new C2373a();

    /* renamed from: com.coocent.music.base.ui.folder.widget.EmptyRecyclerView$a */
    class C2373a extends RecyclerView.C0800j {
        C2373a() {
        }

        /* renamed from: a */
        public void mo4834a() {
            super.mo4834a();
            EmptyRecyclerView.this.mo9319G1();
        }
    }

    public EmptyRecyclerView(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public void mo9319G1() {
        View view = this.f8300R0;
        if (view != null) {
            view.setVisibility(getAdapter().getItemCount() > 0 ? 8 : 0);
        }
    }

    public void setAdapter(RecyclerView.C0797h hVar) {
        RecyclerView.C0797h adapter = getAdapter();
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f8301S0);
        }
        super.setAdapter(hVar);
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f8301S0);
        }
    }

    public void setEmptyView(View view) {
        this.f8300R0 = view;
        mo9319G1();
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
