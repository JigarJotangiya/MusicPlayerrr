package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C5988e;
import java.util.Calendar;
import java.util.Locale;
import p159f.p243f.p245b.p304b.C7496h;
import p159f.p243f.p245b.p304b.C7498j;

/* renamed from: com.google.android.material.datepicker.n */
/* compiled from: YearGridAdapter */
class C6012n extends RecyclerView.C0797h<C6014b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5988e<?> f28204a;

    /* renamed from: com.google.android.material.datepicker.n$a */
    /* compiled from: YearGridAdapter */
    class C6013a implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ int f28205g;

        C6013a(int i) {
            this.f28205g = i;
        }

        public void onClick(View view) {
            C6012n.this.f28204a.mo23733n3(C6012n.this.f28204a.mo23728g3().mo23633a(Month.m36001h(this.f28205g, C6012n.this.f28204a.mo23730i3().f28126h)));
            C6012n.this.f28204a.mo23734o3(C5988e.C5999k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    /* compiled from: YearGridAdapter */
    public static class C6014b extends RecyclerView.C0792c0 {

        /* renamed from: a */
        final TextView f28207a;

        C6014b(TextView textView) {
            super(textView);
            this.f28207a = textView;
        }
    }

    C6012n(C5988e<?> eVar) {
        this.f28204a = eVar;
    }

    /* renamed from: d */
    private View.OnClickListener m36116d(int i) {
        return new C6013a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo23765e(int i) {
        return i - this.f28204a.mo23728g3().mo23640g().f28127i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo23766f(int i) {
        return this.f28204a.mo23728g3().mo23640g().f28127i + i;
    }

    /* renamed from: g */
    public void onBindViewHolder(C6014b bVar, int i) {
        int f = mo23766f(i);
        String string = bVar.f28207a.getContext().getString(C7498j.mtrl_picker_navigate_to_year_description);
        bVar.f28207a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(f)}));
        bVar.f28207a.setContentDescription(String.format(string, new Object[]{Integer.valueOf(f)}));
        C5985b h3 = this.f28204a.mo23729h3();
        Calendar i2 = C6011m.m36110i();
        C5984a aVar = i2.get(1) == f ? h3.f28145f : h3.f28143d;
        for (Long longValue : this.f28204a.mo23731j3().mo23659K()) {
            i2.setTimeInMillis(longValue.longValue());
            if (i2.get(1) == f) {
                aVar = h3.f28144e;
            }
        }
        aVar.mo23722d(bVar.f28207a);
        bVar.f28207a.setOnClickListener(m36116d(f));
    }

    public int getItemCount() {
        return this.f28204a.mo23728g3().mo23641h();
    }

    /* renamed from: h */
    public C6014b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6014b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C7496h.mtrl_calendar_year, viewGroup, false));
    }
}
