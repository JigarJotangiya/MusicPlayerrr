package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C5988e;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7496h;

/* renamed from: com.google.android.material.datepicker.h */
/* compiled from: MonthsPagerAdapter */
class C6003h extends RecyclerView.C0797h<C6005b> {

    /* renamed from: a */
    private final Context f28190a;

    /* renamed from: b */
    private final CalendarConstraints f28191b;

    /* renamed from: c */
    private final DateSelector<?> f28192c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5988e.C6000l f28193d;

    /* renamed from: e */
    private final int f28194e;

    /* renamed from: com.google.android.material.datepicker.h$a */
    /* compiled from: MonthsPagerAdapter */
    class C6004a implements AdapterView.OnItemClickListener {

        /* renamed from: g */
        final /* synthetic */ MaterialCalendarGridView f28195g;

        C6004a(MaterialCalendarGridView materialCalendarGridView) {
            this.f28195g = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f28195g.getAdapter().mo23755n(i)) {
                C6003h.this.f28193d.mo23737a(this.f28195g.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$b */
    /* compiled from: MonthsPagerAdapter */
    public static class C6005b extends RecyclerView.C0792c0 {

        /* renamed from: a */
        final TextView f28197a;

        /* renamed from: b */
        final MaterialCalendarGridView f28198b;

        C6005b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C7494f.month_title);
            this.f28197a = textView;
            C3774v.m16219p0(textView, true);
            this.f28198b = (MaterialCalendarGridView) linearLayout.findViewById(C7494f.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    C6003h(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, C5988e.C6000l lVar) {
        Month g = calendarConstraints.mo23640g();
        Month d = calendarConstraints.mo23635d();
        Month f = calendarConstraints.mo23639f();
        if (g.compareTo(f) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (f.compareTo(d) <= 0) {
            int k3 = C6002g.f28184l * C5988e.m36052k3(context);
            int k32 = C6001f.m36073i3(context) ? C5988e.m36052k3(context) : 0;
            this.f28190a = context;
            this.f28194e = k3 + k32;
            this.f28191b = calendarConstraints;
            this.f28192c = dateSelector;
            this.f28193d = lVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Month mo23756d(int i) {
        return this.f28191b.mo23640g().mo23699s(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public CharSequence mo23757e(int i) {
        return mo23756d(i).mo23697q(this.f28190a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo23758f(Month month) {
        return this.f28191b.mo23640g().mo23700t(month);
    }

    /* renamed from: g */
    public void onBindViewHolder(C6005b bVar, int i) {
        Month s = this.f28191b.mo23640g().mo23699s(i);
        bVar.f28197a.setText(s.mo23697q(bVar.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f28198b.findViewById(C7494f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !s.equals(materialCalendarGridView.getAdapter().f28185g)) {
            C6002g gVar = new C6002g(s, this.f28192c, this.f28191b);
            materialCalendarGridView.setNumColumns(s.f28128j);
            materialCalendarGridView.setAdapter((ListAdapter) gVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().mo23754m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new C6004a(materialCalendarGridView));
    }

    public int getItemCount() {
        return this.f28191b.mo23637e();
    }

    public long getItemId(int i) {
        return this.f28191b.mo23640g().mo23699s(i).mo23698r();
    }

    /* renamed from: h */
    public C6005b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C7496h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C6001f.m36073i3(viewGroup.getContext())) {
            return new C6005b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f28194e));
        return new C6005b(linearLayout, true);
    }
}
