package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

/* renamed from: com.google.android.material.datepicker.g */
/* compiled from: MonthAdapter */
class C6002g extends BaseAdapter {

    /* renamed from: l */
    static final int f28184l = C6011m.m36112k().getMaximum(4);

    /* renamed from: g */
    final Month f28185g;

    /* renamed from: h */
    final DateSelector<?> f28186h;

    /* renamed from: i */
    private Collection<Long> f28187i;

    /* renamed from: j */
    C5985b f28188j;

    /* renamed from: k */
    final CalendarConstraints f28189k;

    C6002g(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f28185g = month;
        this.f28186h = dateSelector;
        this.f28189k = calendarConstraints;
        this.f28187i = dateSelector.mo23659K();
    }

    /* renamed from: e */
    private void m36076e(Context context) {
        if (this.f28188j == null) {
            this.f28188j = new C5985b(context);
        }
    }

    /* renamed from: h */
    private boolean m36077h(long j) {
        for (Long longValue : this.f28186h.mo23659K()) {
            if (C6011m.m36102a(j) == C6011m.m36102a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m36078k(TextView textView, long j) {
        C5984a aVar;
        if (textView != null) {
            if (this.f28189k.mo23634b().mo23644H(j)) {
                textView.setEnabled(true);
                if (m36077h(j)) {
                    aVar = this.f28188j.f28141b;
                } else if (C6011m.m36110i().getTimeInMillis() == j) {
                    aVar = this.f28188j.f28142c;
                } else {
                    aVar = this.f28188j.f28140a;
                }
            } else {
                textView.setEnabled(false);
                aVar = this.f28188j.f28146g;
            }
            aVar.mo23722d(textView);
        }
    }

    /* renamed from: l */
    private void m36079l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m36002j(j).equals(this.f28185g)) {
            m36078k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().mo23741a(this.f28185g.mo23696p(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo23741a(int i) {
        return mo23742b() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo23742b() {
        return this.f28185g.mo23694l();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f28185g.mo23694l() || i > mo23752i()) {
            return null;
        }
        return Long.valueOf(this.f28185g.mo23695o(mo23753j(i)));
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m36076e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p159f.p243f.p245b.p304b.C7496h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo23742b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0075
            com.google.android.material.datepicker.Month r8 = r5.f28185g
            int r2 = r8.f28129k
            if (r7 < r2) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f28185g
            long r7 = r8.mo23695o(r7)
            com.google.android.material.datepicker.Month r3 = r5.f28185g
            int r3 = r3.f28127i
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m36003k()
            int r4 = r4.f28127i
            if (r3 != r4) goto L_0x0067
            java.lang.String r7 = com.google.android.material.datepicker.C5986c.m36036a(r7)
            r0.setContentDescription(r7)
            goto L_0x006e
        L_0x0067:
            java.lang.String r7 = com.google.android.material.datepicker.C5986c.m36039d(r7)
            r0.setContentDescription(r7)
        L_0x006e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007d
        L_0x0075:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0084
            return r0
        L_0x0084:
            long r6 = r6.longValue()
            r5.m36078k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C6002g.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo23745f(int i) {
        return i % this.f28185g.f28128j == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo23746g(int i) {
        return (i + 1) % this.f28185g.f28128j == 0;
    }

    public int getCount() {
        return this.f28185g.f28129k + mo23742b();
    }

    public long getItemId(int i) {
        return (long) (i / this.f28185g.f28128j);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo23752i() {
        return (this.f28185g.mo23694l() + this.f28185g.f28129k) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo23753j(int i) {
        return (i - this.f28185g.mo23694l()) + 1;
    }

    /* renamed from: m */
    public void mo23754m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f28187i) {
            m36079l(materialCalendarGridView, longValue.longValue());
        }
        DateSelector<?> dateSelector = this.f28186h;
        if (dateSelector != null) {
            for (Long longValue2 : dateSelector.mo23659K()) {
                m36079l(materialCalendarGridView, longValue2.longValue());
            }
            this.f28187i = this.f28186h.mo23659K();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo23755n(int i) {
        return i >= mo23742b() && i <= mo23752i();
    }
}
