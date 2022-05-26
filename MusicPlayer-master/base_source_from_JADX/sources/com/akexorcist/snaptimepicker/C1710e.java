package com.akexorcist.snaptimepicker;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.akexorcist.snaptimepicker.p028g.C1717b;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.akexorcist.snaptimepicker.e */
/* compiled from: TimeNumberViewHolder.kt */
public final class C1710e extends RecyclerView.C0792c0 {

    /* renamed from: a */
    private final C1717b f6414a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1710e(C1717b bVar) {
        super(bVar.mo7577a());
        C8594l.m46771e(bVar, "binding");
        this.f6414a = bVar;
    }

    /* renamed from: a */
    public final void mo7561a(String str) {
        TextView textView = this.f6414a.f6432b;
        C8594l.m46770d(textView, "binding.textViewNumber");
        if (str == null) {
            str = "-";
        }
        textView.setText(str);
    }
}
