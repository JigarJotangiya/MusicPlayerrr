package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.C0911v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p082e.p109h.p118o.C3699e;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7495g;
import p159f.p243f.p245b.p304b.C7496h;
import p159f.p243f.p245b.p304b.C7498j;

/* renamed from: com.google.android.material.datepicker.e */
/* compiled from: MaterialCalendar */
public final class C5988e<S> extends C6007j<S> {

    /* renamed from: o0 */
    static final Object f28152o0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: p0 */
    static final Object f28153p0 = "NAVIGATION_PREV_TAG";

    /* renamed from: q0 */
    static final Object f28154q0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: r0 */
    static final Object f28155r0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: e0 */
    private int f28156e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public DateSelector<S> f28157f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public CalendarConstraints f28158g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public Month f28159h0;

    /* renamed from: i0 */
    private C5999k f28160i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C5985b f28161j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public RecyclerView f28162k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public RecyclerView f28163l0;

    /* renamed from: m0 */
    private View f28164m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public View f28165n0;

    /* renamed from: com.google.android.material.datepicker.e$a */
    /* compiled from: MaterialCalendar */
    class C5989a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ int f28166g;

        C5989a(int i) {
            this.f28166g = i;
        }

        public void run() {
            C5988e.this.f28163l0.mo4702y1(this.f28166g);
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$b */
    /* compiled from: MaterialCalendar */
    class C5990b extends C3704a {
        C5990b(C5988e eVar) {
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            cVar.mo13117e0((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$c */
    /* compiled from: MaterialCalendar */
    class C5991c extends C6008k {

        /* renamed from: I */
        final /* synthetic */ int f28168I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5991c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f28168I = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: N1 */
        public void mo4478N1(RecyclerView.C0826z zVar, int[] iArr) {
            if (this.f28168I == 0) {
                iArr[0] = C5988e.this.f28163l0.getWidth();
                iArr[1] = C5988e.this.f28163l0.getWidth();
                return;
            }
            iArr[0] = C5988e.this.f28163l0.getHeight();
            iArr[1] = C5988e.this.f28163l0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$d */
    /* compiled from: MaterialCalendar */
    class C5992d implements C6000l {
        C5992d() {
        }

        /* renamed from: a */
        public void mo23737a(long j) {
            if (C5988e.this.f28158g0.mo23634b().mo23644H(j)) {
                C5988e.this.f28157f0.mo23662i0(j);
                Iterator it = C5988e.this.f28199d0.iterator();
                while (it.hasNext()) {
                    ((C6006i) it.next()).mo23762a(C5988e.this.f28157f0.mo23660T());
                }
                C5988e.this.f28163l0.getAdapter().notifyDataSetChanged();
                if (C5988e.this.f28162k0 != null) {
                    C5988e.this.f28162k0.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$e */
    /* compiled from: MaterialCalendar */
    class C5993e extends RecyclerView.C0808o {

        /* renamed from: a */
        private final Calendar f28171a = C6011m.m36112k();

        /* renamed from: b */
        private final Calendar f28172b = C6011m.m36112k();

        C5993e() {
        }

        /* renamed from: f */
        public void mo4876f(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
            int i;
            if ((recyclerView.getAdapter() instanceof C6012n) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C6012n nVar = (C6012n) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C3699e next : C5988e.this.f28157f0.mo23661c()) {
                    F f = next.f11713a;
                    if (!(f == null || next.f11714b == null)) {
                        this.f28171a.setTimeInMillis(((Long) f).longValue());
                        this.f28172b.setTimeInMillis(((Long) next.f11714b).longValue());
                        int e = nVar.mo23765e(this.f28171a.get(1));
                        int e2 = nVar.mo23765e(this.f28172b.get(1));
                        View D = gridLayoutManager.mo4473D(e);
                        View D2 = gridLayoutManager.mo4473D(e2);
                        int W2 = e / gridLayoutManager.mo4440W2();
                        int W22 = e2 / gridLayoutManager.mo4440W2();
                        int i2 = W2;
                        while (i2 <= W22) {
                            View D3 = gridLayoutManager.mo4473D(gridLayoutManager.mo4440W2() * i2);
                            if (D3 != null) {
                                int top = D3.getTop() + C5988e.this.f28161j0.f28143d.mo23721c();
                                int bottom = D3.getBottom() - C5988e.this.f28161j0.f28143d.mo23720b();
                                int left = i2 == W2 ? D.getLeft() + (D.getWidth() / 2) : 0;
                                if (i2 == W22) {
                                    i = D2.getLeft() + (D2.getWidth() / 2);
                                } else {
                                    i = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) left, (float) top, (float) i, (float) bottom, C5988e.this.f28161j0.f28147h);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$f */
    /* compiled from: MaterialCalendar */
    class C5994f extends C3704a {
        C5994f() {
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            String str;
            super.mo3427g(view, cVar);
            if (C5988e.this.f28165n0.getVisibility() == 0) {
                str = C5988e.this.mo3582D0(C7498j.mtrl_picker_toggle_to_year_selection);
            } else {
                str = C5988e.this.mo3582D0(C7498j.mtrl_picker_toggle_to_day_selection);
            }
            cVar.mo13133n0(str);
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$g */
    /* compiled from: MaterialCalendar */
    class C5995g extends RecyclerView.C0817t {

        /* renamed from: a */
        final /* synthetic */ C6003h f28175a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f28176b;

        C5995g(C6003h hVar, MaterialButton materialButton) {
            this.f28175a = hVar;
            this.f28176b = materialButton;
        }

        /* renamed from: a */
        public void mo4984a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f28176b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = C5988e.this.mo23732l3().mo4485Z1();
            } else {
                i3 = C5988e.this.mo23732l3().mo4489c2();
            }
            Month unused = C5988e.this.f28159h0 = this.f28175a.mo23756d(i3);
            this.f28176b.setText(this.f28175a.mo23757e(i3));
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$h */
    /* compiled from: MaterialCalendar */
    class C5996h implements View.OnClickListener {
        C5996h() {
        }

        public void onClick(View view) {
            C5988e.this.mo23735p3();
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$i */
    /* compiled from: MaterialCalendar */
    class C5997i implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ C6003h f28179g;

        C5997i(C6003h hVar) {
            this.f28179g = hVar;
        }

        public void onClick(View view) {
            int Z1 = C5988e.this.mo23732l3().mo4485Z1() + 1;
            if (Z1 < C5988e.this.f28163l0.getAdapter().getItemCount()) {
                C5988e.this.mo23733n3(this.f28179g.mo23756d(Z1));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$j */
    /* compiled from: MaterialCalendar */
    class C5998j implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ C6003h f28181g;

        C5998j(C6003h hVar) {
            this.f28181g = hVar;
        }

        public void onClick(View view) {
            int c2 = C5988e.this.mo23732l3().mo4489c2() - 1;
            if (c2 >= 0) {
                C5988e.this.mo23733n3(this.f28181g.mo23756d(c2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$k */
    /* compiled from: MaterialCalendar */
    enum C5999k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.e$l */
    /* compiled from: MaterialCalendar */
    interface C6000l {
        /* renamed from: a */
        void mo23737a(long j);
    }

    /* renamed from: e3 */
    private void m36050e3(View view, C6003h hVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C7494f.month_navigation_fragment_toggle);
        materialButton.setTag(f28155r0);
        C3774v.m16217o0(materialButton, new C5994f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C7494f.month_navigation_previous);
        materialButton2.setTag(f28153p0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C7494f.month_navigation_next);
        materialButton3.setTag(f28154q0);
        this.f28164m0 = view.findViewById(C7494f.mtrl_calendar_year_selector_frame);
        this.f28165n0 = view.findViewById(C7494f.mtrl_calendar_day_selector_frame);
        mo23734o3(C5999k.DAY);
        materialButton.setText(this.f28159h0.mo23697q(view.getContext()));
        this.f28163l0.mo4634l(new C5995g(hVar, materialButton));
        materialButton.setOnClickListener(new C5996h());
        materialButton3.setOnClickListener(new C5997i(hVar));
        materialButton2.setOnClickListener(new C5998j(hVar));
    }

    /* renamed from: f3 */
    private RecyclerView.C0808o m36051f3() {
        return new C5993e();
    }

    /* renamed from: k3 */
    static int m36052k3(Context context) {
        return context.getResources().getDimensionPixelSize(C7492d.mtrl_calendar_day_height);
    }

    /* renamed from: m3 */
    private void m36053m3(int i) {
        this.f28163l0.post(new C5989a(i));
    }

    /* renamed from: R1 */
    public void mo3626R1(Bundle bundle) {
        super.mo3626R1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f28156e0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f28157f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f28158g0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f28159h0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g3 */
    public CalendarConstraints mo23728g3() {
        return this.f28158g0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h3 */
    public C5985b mo23729h3() {
        return this.f28161j0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i3 */
    public Month mo23730i3() {
        return this.f28159h0;
    }

    /* renamed from: j3 */
    public DateSelector<S> mo23731j3() {
        return this.f28157f0;
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        if (bundle == null) {
            bundle = mo3638V();
        }
        this.f28156e0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f28157f0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f28158g0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f28159h0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l3 */
    public LinearLayoutManager mo23732l3() {
        return (LinearLayoutManager) this.f28163l0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n3 */
    public void mo23733n3(Month month) {
        C6003h hVar = (C6003h) this.f28163l0.getAdapter();
        int f = hVar.mo23758f(month);
        int f2 = f - hVar.mo23758f(this.f28159h0);
        boolean z = true;
        boolean z2 = Math.abs(f2) > 3;
        if (f2 <= 0) {
            z = false;
        }
        this.f28159h0 = month;
        if (z2 && z) {
            this.f28163l0.mo4657q1(f - 3);
            m36053m3(f);
        } else if (z2) {
            this.f28163l0.mo4657q1(f + 3);
            m36053m3(f);
        } else {
            m36053m3(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o3 */
    public void mo23734o3(C5999k kVar) {
        this.f28160i0 = kVar;
        if (kVar == C5999k.YEAR) {
            this.f28162k0.getLayoutManager().mo4507y1(((C6012n) this.f28162k0.getAdapter()).mo23765e(this.f28159h0.f28127i));
            this.f28164m0.setVisibility(0);
            this.f28165n0.setVisibility(8);
        } else if (kVar == C5999k.DAY) {
            this.f28164m0.setVisibility(8);
            this.f28165n0.setVisibility(0);
            mo23733n3(this.f28159h0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p3 */
    public void mo23735p3() {
        C5999k kVar = this.f28160i0;
        C5999k kVar2 = C5999k.YEAR;
        if (kVar == kVar2) {
            mo23734o3(C5999k.DAY);
        } else if (kVar == C5999k.DAY) {
            mo23734o3(kVar2);
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo3651a0(), this.f28156e0);
        this.f28161j0 = new C5985b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month g = this.f28158g0.mo23640g();
        if (C6001f.m36073i3(contextThemeWrapper)) {
            i2 = C7496h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C7496h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C7494f.mtrl_calendar_days_of_week);
        C3774v.m16217o0(gridView, new C5990b(this));
        gridView.setAdapter(new C5987d());
        gridView.setNumColumns(g.f28128j);
        gridView.setEnabled(false);
        this.f28163l0 = (RecyclerView) inflate.findViewById(C7494f.mtrl_calendar_months);
        this.f28163l0.setLayoutManager(new C5991c(mo3651a0(), i, false, i));
        this.f28163l0.setTag(f28152o0);
        C6003h hVar = new C6003h(contextThemeWrapper, this.f28157f0, this.f28158g0, new C5992d());
        this.f28163l0.setAdapter(hVar);
        int integer = contextThemeWrapper.getResources().getInteger(C7495g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C7494f.mtrl_calendar_year_selector_frame);
        this.f28162k0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f28162k0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f28162k0.setAdapter(new C6012n(this));
            this.f28162k0.mo4622h(m36051f3());
        }
        if (inflate.findViewById(C7494f.month_navigation_fragment_toggle) != null) {
            m36050e3(inflate, hVar);
        }
        if (!C6001f.m36073i3(contextThemeWrapper)) {
            new C0911v().mo5429b(this.f28163l0);
        }
        this.f28163l0.mo4657q1(hVar.mo23758f(this.f28159h0));
        return inflate;
    }
}
