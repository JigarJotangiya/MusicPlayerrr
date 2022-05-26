package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0901p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.k */
/* compiled from: SmoothCalendarLayoutManager */
class C6008k extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.k$a */
    /* compiled from: SmoothCalendarLayoutManager */
    class C6009a extends C0901p {
        C6009a(C6008k kVar, Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo5373v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    C6008k(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: J1 */
    public void mo4476J1(RecyclerView recyclerView, RecyclerView.C0826z zVar, int i) {
        C6009a aVar = new C6009a(this, recyclerView.getContext());
        aVar.mo5049p(i);
        mo4902K1(aVar);
    }
}
