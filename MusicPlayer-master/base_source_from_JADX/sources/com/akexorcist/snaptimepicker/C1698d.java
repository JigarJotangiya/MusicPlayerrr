package com.akexorcist.snaptimepicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0506a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.recyclerview.widget.C0902q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.akexorcist.snaptimepicker.extension.C1712a;
import com.akexorcist.snaptimepicker.p028g.C1716a;
import java.util.List;
import p369i.C8418f;
import p369i.C8457t;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: com.akexorcist.snaptimepicker.d */
/* compiled from: SnapTimePickerDialog.kt */
public final class C1698d extends C1695a {

    /* renamed from: T0 */
    public static final C1700b f6362T0 = new C1700b((C8589g) null);

    /* renamed from: A0 */
    private TimeRange f6363A0;

    /* renamed from: B0 */
    private TimeValue f6364B0;

    /* renamed from: C0 */
    private boolean f6365C0;

    /* renamed from: D0 */
    private int f6366D0 = -1;

    /* renamed from: E0 */
    private int f6367E0 = -1;

    /* renamed from: F0 */
    private int f6368F0 = -1;

    /* renamed from: G0 */
    private int f6369G0 = -1;

    /* renamed from: H0 */
    private int f6370H0 = -1;

    /* renamed from: I0 */
    private int f6371I0 = -1;

    /* renamed from: J0 */
    private int f6372J0 = -1;

    /* renamed from: K0 */
    private int f6373K0 = -1;

    /* renamed from: L0 */
    private int f6374L0 = -1;

    /* renamed from: M0 */
    private boolean f6375M0 = true;

    /* renamed from: N0 */
    private int f6376N0 = 1;

    /* renamed from: O0 */
    private C1701c f6377O0;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public int f6378P0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public int f6379Q0 = -1;

    /* renamed from: R0 */
    private final C1703e f6380R0 = new C1703e(this);

    /* renamed from: S0 */
    private final C1704f f6381S0 = new C1704f(this);

    /* renamed from: r0 */
    private final C8418f f6382r0 = C8443h.m46573a(new C1702d(this));

    /* renamed from: s0 */
    private C1715f f6383s0;

    /* renamed from: t0 */
    private C1715f f6384t0;

    /* renamed from: u0 */
    private LinearLayoutManager f6385u0;

    /* renamed from: v0 */
    private LinearLayoutManager f6386v0;

    /* renamed from: w0 */
    private C0902q f6387w0;

    /* renamed from: x0 */
    private C0902q f6388x0;

    /* renamed from: y0 */
    private List<Integer> f6389y0;

    /* renamed from: z0 */
    private List<Integer> f6390z0;

    /* renamed from: com.akexorcist.snaptimepicker.d$a */
    /* compiled from: SnapTimePickerDialog.kt */
    public static final class C1699a {

        /* renamed from: a */
        private TimeRange f6391a;

        /* renamed from: b */
        private TimeValue f6392b;

        /* renamed from: c */
        private boolean f6393c;

        /* renamed from: d */
        private int f6394d = -1;

        /* renamed from: e */
        private int f6395e = -1;

        /* renamed from: f */
        private int f6396f = -1;

        /* renamed from: g */
        private int f6397g = -1;

        /* renamed from: h */
        private int f6398h = -1;

        /* renamed from: i */
        private int f6399i = -1;

        /* renamed from: j */
        private int f6400j = -1;

        /* renamed from: k */
        private int f6401k = -1;

        /* renamed from: l */
        private int f6402l = -1;

        /* renamed from: m */
        private boolean f6403m = true;

        /* renamed from: n */
        private int f6404n = 1;

        /* renamed from: a */
        public final C1698d mo7549a() {
            return C1698d.f6362T0.m8562b(this.f6391a, this.f6392b, this.f6393c, this.f6394d, this.f6395e, this.f6396f, this.f6397g, this.f6398h, this.f6399i, this.f6400j, this.f6401k, this.f6402l, this.f6403m, this.f6404n);
        }

        /* renamed from: b */
        public final C1699a mo7550b(int i) {
            this.f6401k = i;
            return this;
        }

        /* renamed from: c */
        public final C1699a mo7551c(int i) {
            this.f6402l = i;
            return this;
        }

        /* renamed from: d */
        public final C1699a mo7552d(int i) {
            this.f6396f = i;
            return this;
        }

        /* renamed from: e */
        public final C1699a mo7553e(int i) {
            this.f6398h = i;
            return this;
        }

        /* renamed from: f */
        public final C1699a mo7554f(int i) {
            this.f6394d = i;
            return this;
        }

        /* renamed from: g */
        public final C1699a mo7555g(int i) {
            this.f6397g = i;
            return this;
        }
    }

    /* renamed from: com.akexorcist.snaptimepicker.d$b */
    /* compiled from: SnapTimePickerDialog.kt */
    public static final class C1700b {
        private C1700b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C1698d m8562b(TimeRange timeRange, TimeValue timeValue, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2, int i10) {
            C1698d dVar = new C1698d();
            dVar.mo3837d3(false);
            Bundle bundle = new Bundle();
            TimeRange timeRange2 = timeRange;
            bundle.putParcelable("com.akexorcist.snaptimepicker.selectable_time_range", timeRange);
            TimeValue timeValue2 = timeValue;
            bundle.putParcelable("com.akexorcist.snaptimepicker.preselected_time", timeValue);
            boolean z3 = z;
            bundle.putBoolean("com.akexorcist.snaptimepicker.is_use_view_model", z);
            int i11 = i;
            bundle.putInt("com.akexorcist.snaptimepicker.title", i);
            int i12 = i2;
            bundle.putInt("com.akexorcist.snaptimepicker.prefix", i2);
            int i13 = i3;
            bundle.putInt("com.akexorcist.snaptimepicker.suffix", i3);
            int i14 = i4;
            bundle.putInt("com.akexorcist.snaptimepicker.title_color", i4);
            int i15 = i5;
            bundle.putInt("com.akexorcist.snaptimepicker.theme_color", i5);
            int i16 = i6;
            bundle.putInt("com.akexorcist.snaptimepicker.negative_button_text", i6);
            int i17 = i7;
            bundle.putInt("com.akexorcist.snaptimepicker.positive_button_text", i7);
            int i18 = i8;
            bundle.putInt("com.akexorcist.snaptimepicker.negative_button_color", i8);
            bundle.putInt("com.akexorcist.snaptimepicker.positive_button_color", i9);
            bundle.putBoolean("com.akexorcist.snaptimepicker.button_text_all_caps", z2);
            bundle.putInt("com.akexorcist.snaptimepicker.time_interval", i10);
            C8457t tVar = C8457t.f34900a;
            dVar.mo3581C2(bundle);
            return dVar;
        }

        public /* synthetic */ C1700b(C8589g gVar) {
            this();
        }
    }

    /* renamed from: com.akexorcist.snaptimepicker.d$c */
    /* compiled from: SnapTimePickerDialog.kt */
    public interface C1701c {
        /* renamed from: a */
        void mo7556a(int i, int i2);
    }

    /* renamed from: com.akexorcist.snaptimepicker.d$d */
    /* compiled from: SnapTimePickerDialog.kt */
    static final class C1702d extends C8595m implements C8559a<C1716a> {
        final /* synthetic */ C1698d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1702d(C1698d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        public final C1716a invoke() {
            C1716a d = C1716a.m8580d(LayoutInflater.from(this.this$0.mo3708v2()));
            C8594l.m46770d(d, "LayoutSnapTimePickerDial…r.from(requireContext()))");
            return d;
        }
    }

    /* renamed from: com.akexorcist.snaptimepicker.d$e */
    /* compiled from: SnapTimePickerDialog.kt */
    public static final class C1703e extends RecyclerView.C0817t {

        /* renamed from: a */
        final /* synthetic */ C1698d f6405a;

        C1703e(C1698d dVar) {
            this.f6405a = dVar;
        }

        /* renamed from: a */
        public void mo4984a(RecyclerView recyclerView, int i) {
            C8594l.m46771e(recyclerView, "recyclerView");
            super.mo4984a(recyclerView, i);
            if (i == 0) {
                int i2 = -1;
                View h = C1698d.m8537t3(this.f6405a).mo5378h(C1698d.m8536s3(this.f6405a));
                if (h != null) {
                    i2 = C1698d.m8535r3(this.f6405a).mo7573d(C1698d.m8536s3(this.f6405a).mo4941i0(h));
                }
                C1698d dVar = this.f6405a;
                dVar.m8532V3(i2, dVar.f6379Q0);
                this.f6405a.f6378P0 = i2;
            }
        }
    }

    /* renamed from: com.akexorcist.snaptimepicker.d$f */
    /* compiled from: SnapTimePickerDialog.kt */
    public static final class C1704f extends RecyclerView.C0817t {

        /* renamed from: a */
        final /* synthetic */ C1698d f6406a;

        C1704f(C1698d dVar) {
            this.f6406a = dVar;
        }

        /* renamed from: a */
        public void mo4984a(RecyclerView recyclerView, int i) {
            C8594l.m46771e(recyclerView, "recyclerView");
            super.mo4984a(recyclerView, i);
            if (i == 0) {
                int i2 = -1;
                View h = C1698d.m8542y3(this.f6406a).mo5378h(C1698d.m8541x3(this.f6406a));
                if (h != null) {
                    i2 = C1698d.m8540w3(this.f6406a).mo7573d(C1698d.m8541x3(this.f6406a).mo4941i0(h));
                }
                C1698d dVar = this.f6406a;
                dVar.m8532V3(dVar.f6378P0, i2);
                this.f6406a.f6379Q0 = i2;
            }
        }
    }

    /* renamed from: com.akexorcist.snaptimepicker.d$g */
    /* compiled from: SnapTimePickerDialog.kt */
    static final class C1705g implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ C1698d f6407g;

        C1705g(C1698d dVar) {
            this.f6407g = dVar;
        }

        public final void onClick(View view) {
            this.f6407g.m8523L3();
        }
    }

    /* renamed from: com.akexorcist.snaptimepicker.d$h */
    /* compiled from: SnapTimePickerDialog.kt */
    static final class C1706h implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ C1698d f6408g;

        C1706h(C1698d dVar) {
            this.f6408g = dVar;
        }

        public final void onClick(View view) {
            this.f6408g.m8522K3();
        }
    }

    /* renamed from: com.akexorcist.snaptimepicker.d$i */
    /* compiled from: SnapTimePickerDialog.kt */
    static final class C1707i implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C1698d f6409g;

        /* renamed from: h */
        final /* synthetic */ int f6410h;

        C1707i(C1698d dVar, int i) {
            this.f6409g = dVar;
            this.f6410h = i;
        }

        public final void run() {
            if (this.f6410h != -1) {
                this.f6409g.m8516E3().f6425d.mo4702y1(this.f6410h);
            }
        }
    }

    /* renamed from: com.akexorcist.snaptimepicker.d$j */
    /* compiled from: SnapTimePickerDialog.kt */
    static final class C1708j implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C1698d f6411g;

        /* renamed from: h */
        final /* synthetic */ int f6412h;

        C1708j(C1698d dVar, int i) {
            this.f6411g = dVar;
            this.f6412h = i;
        }

        public final void run() {
            if (this.f6412h != -1) {
                this.f6411g.m8516E3().f6426e.mo4702y1(this.f6412h);
            }
        }
    }

    /* renamed from: com.akexorcist.snaptimepicker.d$k */
    /* compiled from: SnapTimePickerDialog.kt */
    public static final class C1709k implements C1701c {

        /* renamed from: a */
        final /* synthetic */ C1712a f6413a;

        C1709k(C1712a aVar) {
            this.f6413a = aVar;
        }

        /* renamed from: a */
        public void mo7556a(int i, int i2) {
            this.f6413a.mo7571f(i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public final C1716a m8516E3() {
        return (C1716a) this.f6382r0.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo7517b();
     */
    /* renamed from: F3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8517F3() {
        /*
            r9 = this;
            com.akexorcist.snaptimepicker.TimeRange r0 = r9.f6363A0
            r1 = -1
            if (r0 == 0) goto L_0x0010
            com.akexorcist.snaptimepicker.TimeValue r0 = r0.mo7517b()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.mo7527a()
            goto L_0x0011
        L_0x0010:
            r0 = -1
        L_0x0011:
            com.akexorcist.snaptimepicker.TimeRange r2 = r9.f6363A0
            if (r2 == 0) goto L_0x0020
            com.akexorcist.snaptimepicker.TimeValue r2 = r2.mo7516a()
            if (r2 == 0) goto L_0x0020
            int r2 = r2.mo7527a()
            goto L_0x0021
        L_0x0020:
            r2 = -1
        L_0x0021:
            java.util.List r3 = p369i.p377u.C8482l.m46665f()
            r9.f6389y0 = r3
            boolean r3 = r9.m8519H3()
            r4 = 0
            r5 = 23
            java.lang.String r6 = "hourList"
            r7 = 0
            if (r3 == 0) goto L_0x0066
        L_0x0033:
            if (r4 > r5) goto L_0x00fa
            if (r0 == r1) goto L_0x0051
            if (r2 == r1) goto L_0x0051
            if (r0 <= r4) goto L_0x003c
            goto L_0x005f
        L_0x003c:
            if (r2 < r4) goto L_0x005f
            java.util.List<java.lang.Integer> r3 = r9.f6389y0
            if (r3 == 0) goto L_0x004d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.util.List r3 = p369i.p377u.C8490t.m46685v(r3, r8)
            r9.f6389y0 = r3
            goto L_0x005f
        L_0x004d:
            p369i.p387z.p389d.C8594l.m46783q(r6)
            throw r7
        L_0x0051:
            java.util.List<java.lang.Integer> r3 = r9.f6389y0
            if (r3 == 0) goto L_0x0062
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.util.List r3 = p369i.p377u.C8490t.m46685v(r3, r8)
            r9.f6389y0 = r3
        L_0x005f:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0062:
            p369i.p387z.p389d.C8594l.m46783q(r6)
            throw r7
        L_0x0066:
            boolean r3 = r9.m8521J3()
            if (r3 == 0) goto L_0x00cc
            if (r0 == r1) goto L_0x00b5
            if (r2 == r1) goto L_0x00b5
            r1 = r0
        L_0x0071:
            if (r1 > r5) goto L_0x0092
            if (r0 > r1) goto L_0x0077
            if (r5 >= r1) goto L_0x007c
        L_0x0077:
            if (r1 >= 0) goto L_0x007a
            goto L_0x008f
        L_0x007a:
            if (r2 < r1) goto L_0x008f
        L_0x007c:
            java.util.List<java.lang.Integer> r3 = r9.f6389y0
            if (r3 == 0) goto L_0x008b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.util.List r3 = p369i.p377u.C8490t.m46685v(r3, r8)
            r9.f6389y0 = r3
            goto L_0x008f
        L_0x008b:
            p369i.p387z.p389d.C8594l.m46783q(r6)
            throw r7
        L_0x008f:
            int r1 = r1 + 1
            goto L_0x0071
        L_0x0092:
            if (r2 < 0) goto L_0x00fa
        L_0x0094:
            if (r0 > r4) goto L_0x0098
            if (r5 >= r4) goto L_0x009d
        L_0x0098:
            if (r4 >= 0) goto L_0x009b
            goto L_0x00b0
        L_0x009b:
            if (r2 < r4) goto L_0x00b0
        L_0x009d:
            java.util.List<java.lang.Integer> r1 = r9.f6389y0
            if (r1 == 0) goto L_0x00ac
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.util.List r1 = p369i.p377u.C8490t.m46685v(r1, r3)
            r9.f6389y0 = r1
            goto L_0x00b0
        L_0x00ac:
            p369i.p387z.p389d.C8594l.m46783q(r6)
            throw r7
        L_0x00b0:
            if (r4 == r2) goto L_0x00fa
            int r4 = r4 + 1
            goto L_0x0094
        L_0x00b5:
            if (r4 > r5) goto L_0x00fa
            java.util.List<java.lang.Integer> r0 = r9.f6389y0
            if (r0 == 0) goto L_0x00c8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.util.List r0 = p369i.p377u.C8490t.m46685v(r0, r1)
            r9.f6389y0 = r0
            int r4 = r4 + 1
            goto L_0x00b5
        L_0x00c8:
            p369i.p387z.p389d.C8594l.m46783q(r6)
            throw r7
        L_0x00cc:
            if (r0 == r1) goto L_0x00e3
            if (r2 == r1) goto L_0x00e3
            java.util.List<java.lang.Integer> r1 = r9.f6389y0
            if (r1 == 0) goto L_0x00df
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.List r0 = p369i.p377u.C8490t.m46685v(r1, r0)
            r9.f6389y0 = r0
            goto L_0x00fa
        L_0x00df:
            p369i.p387z.p389d.C8594l.m46783q(r6)
            throw r7
        L_0x00e3:
            if (r4 > r5) goto L_0x00fa
            java.util.List<java.lang.Integer> r0 = r9.f6389y0
            if (r0 == 0) goto L_0x00f6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.util.List r0 = p369i.p377u.C8490t.m46685v(r0, r1)
            r9.f6389y0 = r0
            int r4 = r4 + 1
            goto L_0x00e3
        L_0x00f6:
            p369i.p387z.p389d.C8594l.m46783q(r6)
            throw r7
        L_0x00fa:
            com.akexorcist.snaptimepicker.f r0 = r9.f6383s0
            if (r0 == 0) goto L_0x010a
            java.util.List<java.lang.Integer> r1 = r9.f6389y0
            if (r1 == 0) goto L_0x0106
            r0.mo7576g(r1)
            return
        L_0x0106:
            p369i.p387z.p389d.C8594l.m46783q(r6)
            throw r7
        L_0x010a:
            java.lang.String r0 = "hourAdapter"
            p369i.p387z.p389d.C8594l.m46783q(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akexorcist.snaptimepicker.C1698d.m8517F3():void");
    }

    /* renamed from: G3 */
    private final void m8518G3(boolean z) {
        TimeValue timeValue;
        TimeValue timeValue2;
        this.f6390z0 = C8482l.m46665f();
        int i = 60 / this.f6376N0;
        int i2 = 0;
        while (i2 < i) {
            List<Integer> list = this.f6390z0;
            if (list != null) {
                this.f6390z0 = C8490t.m46685v(list, Integer.valueOf(this.f6376N0 * i2));
                i2++;
            } else {
                C8594l.m46783q("minuteList");
                throw null;
            }
        }
        C1715f fVar = this.f6384t0;
        if (fVar != null) {
            List<Integer> list2 = this.f6390z0;
            if (list2 != null) {
                fVar.mo7576g(list2);
                if (!z && (timeValue = this.f6364B0) != null && m8520I3(timeValue, this.f6363A0) && (timeValue2 = this.f6364B0) != null) {
                    m8532V3(timeValue2.mo7527a(), timeValue2.mo7528b());
                    return;
                }
                return;
            }
            C8594l.m46783q("minuteList");
            throw null;
        }
        C8594l.m46783q("minuteAdapter");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo7517b();
     */
    /* renamed from: H3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m8519H3() {
        /*
            r5 = this;
            com.akexorcist.snaptimepicker.TimeRange r0 = r5.f6363A0
            r1 = -1
            if (r0 == 0) goto L_0x0010
            com.akexorcist.snaptimepicker.TimeValue r0 = r0.mo7517b()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.mo7527a()
            goto L_0x0011
        L_0x0010:
            r0 = -1
        L_0x0011:
            com.akexorcist.snaptimepicker.TimeRange r2 = r5.f6363A0
            if (r2 == 0) goto L_0x0020
            com.akexorcist.snaptimepicker.TimeValue r2 = r2.mo7517b()
            if (r2 == 0) goto L_0x0020
            int r2 = r2.mo7528b()
            goto L_0x0021
        L_0x0020:
            r2 = -1
        L_0x0021:
            com.akexorcist.snaptimepicker.TimeRange r3 = r5.f6363A0
            if (r3 == 0) goto L_0x0030
            com.akexorcist.snaptimepicker.TimeValue r3 = r3.mo7516a()
            if (r3 == 0) goto L_0x0030
            int r3 = r3.mo7527a()
            goto L_0x0031
        L_0x0030:
            r3 = -1
        L_0x0031:
            com.akexorcist.snaptimepicker.TimeRange r4 = r5.f6363A0
            if (r4 == 0) goto L_0x0040
            com.akexorcist.snaptimepicker.TimeValue r4 = r4.mo7516a()
            if (r4 == 0) goto L_0x0040
            int r4 = r4.mo7528b()
            goto L_0x0041
        L_0x0040:
            r4 = -1
        L_0x0041:
            if (r0 == r1) goto L_0x0051
            if (r2 == r1) goto L_0x0051
            if (r3 == r1) goto L_0x0051
            if (r4 == r1) goto L_0x0051
            if (r0 < r3) goto L_0x004f
            if (r0 != r3) goto L_0x0051
            if (r2 >= r4) goto L_0x0051
        L_0x004f:
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akexorcist.snaptimepicker.C1698d.m8519H3():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r10.mo7517b();
     */
    /* renamed from: I3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m8520I3(com.akexorcist.snaptimepicker.TimeValue r9, com.akexorcist.snaptimepicker.TimeRange r10) {
        /*
            r8 = this;
            r0 = -1
            if (r10 == 0) goto L_0x000e
            com.akexorcist.snaptimepicker.TimeValue r1 = r10.mo7517b()
            if (r1 == 0) goto L_0x000e
            int r1 = r1.mo7527a()
            goto L_0x000f
        L_0x000e:
            r1 = -1
        L_0x000f:
            if (r10 == 0) goto L_0x001c
            com.akexorcist.snaptimepicker.TimeValue r2 = r10.mo7517b()
            if (r2 == 0) goto L_0x001c
            int r2 = r2.mo7528b()
            goto L_0x001d
        L_0x001c:
            r2 = -1
        L_0x001d:
            if (r10 == 0) goto L_0x002a
            com.akexorcist.snaptimepicker.TimeValue r3 = r10.mo7516a()
            if (r3 == 0) goto L_0x002a
            int r3 = r3.mo7527a()
            goto L_0x002b
        L_0x002a:
            r3 = -1
        L_0x002b:
            if (r10 == 0) goto L_0x0038
            com.akexorcist.snaptimepicker.TimeValue r4 = r10.mo7516a()
            if (r4 == 0) goto L_0x0038
            int r4 = r4.mo7528b()
            goto L_0x0039
        L_0x0038:
            r4 = -1
        L_0x0039:
            if (r9 == 0) goto L_0x0040
            int r5 = r9.mo7527a()
            goto L_0x0041
        L_0x0040:
            r5 = -1
        L_0x0041:
            if (r9 == 0) goto L_0x0048
            int r6 = r9.mo7528b()
            goto L_0x0049
        L_0x0048:
            r6 = -1
        L_0x0049:
            r7 = 0
            if (r9 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x008d
            if (r1 == r0) goto L_0x008d
            if (r2 == r0) goto L_0x008d
            if (r3 == r0) goto L_0x008d
            if (r4 == r0) goto L_0x008d
            if (r5 == r0) goto L_0x008d
            if (r6 != r0) goto L_0x005b
            goto L_0x008d
        L_0x005b:
            r9 = 1
            if (r1 < r3) goto L_0x007e
            if (r1 != r3) goto L_0x0063
            if (r2 >= r4) goto L_0x0063
            goto L_0x007e
        L_0x0063:
            if (r1 > r3) goto L_0x006f
            if (r1 != r3) goto L_0x006a
            if (r1 <= r3) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            if (r5 != r1) goto L_0x008d
            if (r6 != r2) goto L_0x008d
            goto L_0x008c
        L_0x006f:
            int r10 = r3 + 1
            if (r10 > r5) goto L_0x0075
            if (r1 > r5) goto L_0x008c
        L_0x0075:
            if (r5 != r3) goto L_0x0079
            if (r6 >= r4) goto L_0x008c
        L_0x0079:
            if (r5 != r1) goto L_0x008d
            if (r6 > r2) goto L_0x008d
            goto L_0x008c
        L_0x007e:
            int r10 = r1 + 1
            if (r10 > r5) goto L_0x0084
            if (r3 > r5) goto L_0x008c
        L_0x0084:
            if (r5 != r1) goto L_0x0088
            if (r6 >= r2) goto L_0x008c
        L_0x0088:
            if (r5 != r3) goto L_0x008d
            if (r6 > r4) goto L_0x008d
        L_0x008c:
            r7 = 1
        L_0x008d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akexorcist.snaptimepicker.C1698d.m8520I3(com.akexorcist.snaptimepicker.TimeValue, com.akexorcist.snaptimepicker.TimeRange):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo7517b();
     */
    /* renamed from: J3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m8521J3() {
        /*
            r5 = this;
            com.akexorcist.snaptimepicker.TimeRange r0 = r5.f6363A0
            r1 = -1
            if (r0 == 0) goto L_0x0010
            com.akexorcist.snaptimepicker.TimeValue r0 = r0.mo7517b()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.mo7527a()
            goto L_0x0011
        L_0x0010:
            r0 = -1
        L_0x0011:
            com.akexorcist.snaptimepicker.TimeRange r2 = r5.f6363A0
            if (r2 == 0) goto L_0x0020
            com.akexorcist.snaptimepicker.TimeValue r2 = r2.mo7517b()
            if (r2 == 0) goto L_0x0020
            int r2 = r2.mo7528b()
            goto L_0x0021
        L_0x0020:
            r2 = -1
        L_0x0021:
            com.akexorcist.snaptimepicker.TimeRange r3 = r5.f6363A0
            if (r3 == 0) goto L_0x0030
            com.akexorcist.snaptimepicker.TimeValue r3 = r3.mo7516a()
            if (r3 == 0) goto L_0x0030
            int r3 = r3.mo7527a()
            goto L_0x0031
        L_0x0030:
            r3 = -1
        L_0x0031:
            com.akexorcist.snaptimepicker.TimeRange r4 = r5.f6363A0
            if (r4 == 0) goto L_0x0040
            com.akexorcist.snaptimepicker.TimeValue r4 = r4.mo7516a()
            if (r4 == 0) goto L_0x0040
            int r4 = r4.mo7528b()
            goto L_0x0041
        L_0x0040:
            r4 = -1
        L_0x0041:
            if (r0 == r1) goto L_0x0051
            if (r2 == r1) goto L_0x0051
            if (r3 == r1) goto L_0x0051
            if (r4 == r1) goto L_0x0051
            if (r0 > r3) goto L_0x004f
            if (r0 != r3) goto L_0x0051
            if (r2 <= r4) goto L_0x0051
        L_0x004f:
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akexorcist.snaptimepicker.C1698d.m8521J3():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public final void m8522K3() {
        Fragment F0 = mo3588F0();
        if (F0 != null) {
            F0.mo3662e1(mo3591G0(), 0, (Intent) null);
        }
        mo3831X2();
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public final void m8523L3() {
        int i;
        int i2;
        C0902q qVar = this.f6388x0;
        if (qVar != null) {
            LinearLayoutManager linearLayoutManager = this.f6386v0;
            if (linearLayoutManager != null) {
                View h = qVar.mo5378h(linearLayoutManager);
                if (h != null) {
                    C1715f fVar = this.f6384t0;
                    if (fVar != null) {
                        LinearLayoutManager linearLayoutManager2 = this.f6386v0;
                        if (linearLayoutManager2 != null) {
                            i = fVar.mo7573d(linearLayoutManager2.mo4941i0(h));
                        } else {
                            C8594l.m46783q("minuteLayoutManager");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("minuteAdapter");
                        throw null;
                    }
                } else {
                    i = -1;
                }
                C0902q qVar2 = this.f6387w0;
                if (qVar2 != null) {
                    LinearLayoutManager linearLayoutManager3 = this.f6385u0;
                    if (linearLayoutManager3 != null) {
                        View h2 = qVar2.mo5378h(linearLayoutManager3);
                        if (h2 != null) {
                            C1715f fVar2 = this.f6383s0;
                            if (fVar2 != null) {
                                LinearLayoutManager linearLayoutManager4 = this.f6385u0;
                                if (linearLayoutManager4 != null) {
                                    i2 = fVar2.mo7573d(linearLayoutManager4.mo4941i0(h2));
                                } else {
                                    C8594l.m46783q("hourLayoutManager");
                                    throw null;
                                }
                            } else {
                                C8594l.m46783q("hourAdapter");
                                throw null;
                            }
                        } else {
                            i2 = -1;
                        }
                        C1701c cVar = this.f6377O0;
                        if (cVar != null) {
                            cVar.mo7556a(i2, i);
                        }
                        Fragment F0 = mo3588F0();
                        if (F0 != null) {
                            int G0 = mo3591G0();
                            Intent intent = new Intent();
                            intent.putExtra("com.akexorcist.snaptimepicker.selected_hour", i2);
                            intent.putExtra("com.akexorcist.snaptimepicker.selected_minute", i);
                            C8457t tVar = C8457t.f34900a;
                            F0.mo3662e1(G0, -1, intent);
                        }
                        mo3831X2();
                        return;
                    }
                    C8594l.m46783q("hourLayoutManager");
                    throw null;
                }
                C8594l.m46783q("hourSnapHelper");
                throw null;
            }
            C8594l.m46783q("minuteLayoutManager");
            throw null;
        }
        C8594l.m46783q("minuteSnapHelper");
        throw null;
    }

    /* renamed from: M3 */
    private final void m8524M3() {
        TimeRange timeRange;
        TimeValue b;
        TimeValue timeValue = this.f6364B0;
        if (timeValue != null && (timeRange = this.f6363A0) != null && timeValue != null && timeRange != null && m8528R3() && (b = timeRange.mo7517b()) != null) {
            TimeValue timeValue2 = this.f6364B0;
            if (timeValue2 != null) {
                timeValue2.mo7529d(b.mo7527a());
            }
            TimeValue timeValue3 = this.f6364B0;
            if (timeValue3 != null) {
                timeValue3.mo7531e(b.mo7528b());
            }
        }
    }

    /* renamed from: O3 */
    private final void m8525O3(TimeValue timeValue) {
        m8516E3().f6425d.mo4657q1(1);
        m8516E3().f6426e.mo4657q1(1);
        int i = 0;
        if (timeValue != null) {
            int a = timeValue.mo7527a();
            int b = timeValue.mo7528b();
            C1715f fVar = this.f6383s0;
            if (fVar != null) {
                int c = fVar.mo7572c(a);
                C1715f fVar2 = this.f6384t0;
                if (fVar2 != null) {
                    int c2 = fVar2.mo7572c(b);
                    if (c == -1) {
                        c = 0;
                    }
                    m8529S3(c);
                    if (c2 != -1) {
                        i = c2;
                    }
                    m8531U3(i);
                    return;
                }
                C8594l.m46783q("minuteAdapter");
                throw null;
            }
            C8594l.m46783q("hourAdapter");
            throw null;
        }
        m8529S3(0);
        m8531U3(0);
    }

    /* renamed from: P3 */
    static /* synthetic */ void m8526P3(C1698d dVar, TimeValue timeValue, int i, Object obj) {
        if ((i & 1) != 0) {
            timeValue = dVar.f6364B0;
        }
        dVar.m8525O3(timeValue);
    }

    /* renamed from: Q3 */
    private final void m8527Q3() {
        m8517F3();
        m8518G3(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo7517b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: R3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m8528R3() {
        /*
            r9 = this;
            com.akexorcist.snaptimepicker.TimeRange r0 = r9.f6363A0
            r1 = -1
            if (r0 == 0) goto L_0x0010
            com.akexorcist.snaptimepicker.TimeValue r0 = r0.mo7517b()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.mo7527a()
            goto L_0x0011
        L_0x0010:
            r0 = -1
        L_0x0011:
            com.akexorcist.snaptimepicker.TimeRange r2 = r9.f6363A0
            if (r2 == 0) goto L_0x0020
            com.akexorcist.snaptimepicker.TimeValue r2 = r2.mo7517b()
            if (r2 == 0) goto L_0x0020
            int r2 = r2.mo7528b()
            goto L_0x0021
        L_0x0020:
            r2 = -1
        L_0x0021:
            com.akexorcist.snaptimepicker.TimeRange r3 = r9.f6363A0
            if (r3 == 0) goto L_0x0030
            com.akexorcist.snaptimepicker.TimeValue r3 = r3.mo7516a()
            if (r3 == 0) goto L_0x0030
            int r3 = r3.mo7527a()
            goto L_0x0031
        L_0x0030:
            r3 = -1
        L_0x0031:
            com.akexorcist.snaptimepicker.TimeRange r4 = r9.f6363A0
            if (r4 == 0) goto L_0x0040
            com.akexorcist.snaptimepicker.TimeValue r4 = r4.mo7516a()
            if (r4 == 0) goto L_0x0040
            int r4 = r4.mo7528b()
            goto L_0x0041
        L_0x0040:
            r4 = -1
        L_0x0041:
            com.akexorcist.snaptimepicker.TimeValue r5 = r9.f6364B0
            if (r5 == 0) goto L_0x004a
            int r5 = r5.mo7527a()
            goto L_0x004b
        L_0x004a:
            r5 = -1
        L_0x004b:
            com.akexorcist.snaptimepicker.TimeValue r6 = r9.f6364B0
            if (r6 == 0) goto L_0x0053
            int r1 = r6.mo7528b()
        L_0x0053:
            boolean r6 = r9.m8519H3()
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0068
            if (r5 < r0) goto L_0x007e
            if (r5 > r3) goto L_0x007e
            if (r5 != r0) goto L_0x0063
            if (r1 < r2) goto L_0x007e
        L_0x0063:
            if (r5 != r3) goto L_0x007d
            if (r1 <= r4) goto L_0x007d
            goto L_0x007e
        L_0x0068:
            boolean r6 = r9.m8521J3()
            if (r6 == 0) goto L_0x007d
            int r6 = r3 + 1
            if (r6 > r5) goto L_0x0074
            if (r0 > r5) goto L_0x007e
        L_0x0074:
            if (r5 != r0) goto L_0x0078
            if (r1 < r2) goto L_0x007e
        L_0x0078:
            if (r5 != r3) goto L_0x007d
            if (r1 <= r4) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r7 = 0
        L_0x007e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akexorcist.snaptimepicker.C1698d.m8528R3():boolean");
    }

    /* renamed from: S3 */
    private final void m8529S3(int i) {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new C1707i(this, i), 100);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: T3 */
    private final void m8530T3(int i, int i2) {
        this.f6390z0 = C8482l.m46665f();
        for (int i3 = 0; i3 <= 59; i3++) {
            if (i == -1 || i2 == -1) {
                List<Integer> list = this.f6390z0;
                if (list != null) {
                    this.f6390z0 = C8490t.m46685v(list, Integer.valueOf(i3));
                } else {
                    C8594l.m46783q("minuteList");
                    throw null;
                }
            } else if (i <= i3 && i2 >= i3) {
                List<Integer> list2 = this.f6390z0;
                if (list2 != null) {
                    this.f6390z0 = C8490t.m46685v(list2, Integer.valueOf(i3));
                } else {
                    C8594l.m46783q("minuteList");
                    throw null;
                }
            }
        }
        C1715f fVar = this.f6384t0;
        if (fVar != null) {
            List<Integer> list3 = this.f6390z0;
            if (list3 != null) {
                fVar.mo7576g(list3);
            } else {
                C8594l.m46783q("minuteList");
                throw null;
            }
        } else {
            C8594l.m46783q("minuteAdapter");
            throw null;
        }
    }

    /* renamed from: U3 */
    private final void m8531U3(int i) {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new C1708j(this, i), 100);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public final void m8532V3(int i, int i2) {
        TimeValue a;
        TimeValue b;
        TimeValue a2;
        TimeValue a3;
        TimeValue b2;
        TimeValue b3;
        int i3 = -1;
        if (i != -1 && i2 != -1) {
            TimeRange timeRange = this.f6363A0;
            if (timeRange == null || (b2 = timeRange.mo7517b()) == null || i != b2.mo7527a()) {
                TimeRange timeRange2 = this.f6363A0;
                if (timeRange2 == null || (a2 = timeRange2.mo7516a()) == null || i != a2.mo7527a()) {
                    TimeRange timeRange3 = this.f6363A0;
                    if (timeRange3 == null || (b = timeRange3.mo7517b()) == null || i != b.mo7527a()) {
                        TimeRange timeRange4 = this.f6363A0;
                        if (timeRange4 == null || (a = timeRange4.mo7516a()) == null || i != a.mo7527a()) {
                            List<Integer> list = this.f6390z0;
                            if (list == null) {
                                C8594l.m46783q("minuteList");
                                throw null;
                            } else if (list.size() < 60) {
                                m8518G3(true);
                            }
                        }
                    }
                } else {
                    TimeRange timeRange5 = this.f6363A0;
                    if (!(timeRange5 == null || (a3 = timeRange5.mo7516a()) == null)) {
                        i3 = a3.mo7528b();
                    }
                    m8530T3(0, i3);
                    if (i2 > i3) {
                        m8531U3(i2);
                    }
                }
            } else {
                TimeRange timeRange6 = this.f6363A0;
                if (!(timeRange6 == null || (b3 = timeRange6.mo7517b()) == null)) {
                    i3 = b3.mo7528b();
                }
                m8530T3(i3, 59);
                C1715f fVar = this.f6384t0;
                if (fVar != null) {
                    int c = fVar.mo7572c(i2);
                    if (i2 < i3) {
                        m8531U3(c);
                        return;
                    }
                    return;
                }
                C8594l.m46783q("minuteAdapter");
                throw null;
            }
        }
    }

    /* renamed from: W3 */
    private final void m8533W3() {
        if (mo3606L() != null) {
            C0696m0 a = new C0703o0(this).mo4262a(C1712a.class);
            C8594l.m46770d(a, "ViewModelProvider(this).…kerViewModel::class.java)");
            this.f6377O0 = new C1709k((C1712a) a);
        }
    }

    /* renamed from: r3 */
    public static final /* synthetic */ C1715f m8535r3(C1698d dVar) {
        C1715f fVar = dVar.f6383s0;
        if (fVar != null) {
            return fVar;
        }
        C8594l.m46783q("hourAdapter");
        throw null;
    }

    /* renamed from: s3 */
    public static final /* synthetic */ LinearLayoutManager m8536s3(C1698d dVar) {
        LinearLayoutManager linearLayoutManager = dVar.f6385u0;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        C8594l.m46783q("hourLayoutManager");
        throw null;
    }

    /* renamed from: t3 */
    public static final /* synthetic */ C0902q m8537t3(C1698d dVar) {
        C0902q qVar = dVar.f6387w0;
        if (qVar != null) {
            return qVar;
        }
        C8594l.m46783q("hourSnapHelper");
        throw null;
    }

    /* renamed from: w3 */
    public static final /* synthetic */ C1715f m8540w3(C1698d dVar) {
        C1715f fVar = dVar.f6384t0;
        if (fVar != null) {
            return fVar;
        }
        C8594l.m46783q("minuteAdapter");
        throw null;
    }

    /* renamed from: x3 */
    public static final /* synthetic */ LinearLayoutManager m8541x3(C1698d dVar) {
        LinearLayoutManager linearLayoutManager = dVar.f6386v0;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        C8594l.m46783q("minuteLayoutManager");
        throw null;
    }

    /* renamed from: y3 */
    public static final /* synthetic */ C0902q m8542y3(C1698d dVar) {
        C0902q qVar = dVar.f6388x0;
        if (qVar != null) {
            return qVar;
        }
        C8594l.m46783q("minuteSnapHelper");
        throw null;
    }

    /* renamed from: N3 */
    public final void mo7548N3(C1701c cVar) {
        this.f6377O0 = cVar;
    }

    /* renamed from: i3 */
    public void mo7540i3() {
        m8526P3(this, (TimeValue) null, 1, (Object) null);
    }

    /* renamed from: j3 */
    public void mo7541j3() {
        Context a0;
        Context a02;
        Context a03;
        Context a04;
        this.f6383s0 = new C1715f();
        this.f6384t0 = new C1715f();
        this.f6385u0 = new LinearLayoutManager(mo3651a0());
        this.f6386v0 = new LinearLayoutManager(mo3651a0());
        this.f6387w0 = new C0902q();
        this.f6388x0 = new C0902q();
        RecyclerView recyclerView = m8516E3().f6425d;
        C8594l.m46770d(recyclerView, "binding.recyclerViewHour");
        LinearLayoutManager linearLayoutManager = this.f6385u0;
        if (linearLayoutManager != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            RecyclerView recyclerView2 = m8516E3().f6425d;
            C8594l.m46770d(recyclerView2, "binding.recyclerViewHour");
            C1715f fVar = this.f6383s0;
            if (fVar != null) {
                recyclerView2.setAdapter(fVar);
                C0902q qVar = this.f6387w0;
                if (qVar != null) {
                    qVar.mo5429b(m8516E3().f6425d);
                    RecyclerView recyclerView3 = m8516E3().f6426e;
                    C8594l.m46770d(recyclerView3, "binding.recyclerViewMinute");
                    LinearLayoutManager linearLayoutManager2 = this.f6386v0;
                    if (linearLayoutManager2 != null) {
                        recyclerView3.setLayoutManager(linearLayoutManager2);
                        RecyclerView recyclerView4 = m8516E3().f6426e;
                        C8594l.m46770d(recyclerView4, "binding.recyclerViewMinute");
                        C1715f fVar2 = this.f6384t0;
                        if (fVar2 != null) {
                            recyclerView4.setAdapter(fVar2);
                            C0902q qVar2 = this.f6388x0;
                            if (qVar2 != null) {
                                qVar2.mo5429b(m8516E3().f6426e);
                                if (this.f6366D0 != -1) {
                                    TextView textView = m8516E3().f6429h;
                                    C8594l.m46770d(textView, "binding.textViewTitle");
                                    textView.setText(mo3582D0(this.f6366D0));
                                }
                                if (this.f6367E0 != -1) {
                                    TextView textView2 = m8516E3().f6427f;
                                    C8594l.m46770d(textView2, "binding.textViewTimePrefix");
                                    textView2.setText(mo3582D0(this.f6367E0));
                                }
                                if (this.f6368F0 != -1) {
                                    TextView textView3 = m8516E3().f6428g;
                                    C8594l.m46770d(textView3, "binding.textViewTimeSuffix");
                                    textView3.setText(mo3582D0(this.f6368F0));
                                }
                                if (!(this.f6369G0 == -1 || (a04 = mo3651a0()) == null)) {
                                    m8516E3().f6429h.setTextColor(C0506a.m3150b(a04, this.f6369G0));
                                }
                                if (!(this.f6370H0 == -1 || (a03 = mo3651a0()) == null)) {
                                    m8516E3().f6424c.setTextColor(C0506a.m3150b(a03, this.f6370H0));
                                    m8516E3().f6423b.setTextColor(C0506a.m3150b(a03, this.f6370H0));
                                    m8516E3().f6429h.setBackgroundColor(C0506a.m3150b(a03, this.f6370H0));
                                }
                                if (this.f6372J0 != -1) {
                                    Button button = m8516E3().f6424c;
                                    C8594l.m46770d(button, "binding.buttonConfirm");
                                    button.setText(mo3582D0(this.f6372J0));
                                }
                                if (this.f6371I0 != -1) {
                                    Button button2 = m8516E3().f6423b;
                                    C8594l.m46770d(button2, "binding.buttonCancel");
                                    button2.setText(mo3582D0(this.f6371I0));
                                }
                                if (!(this.f6373K0 == -1 || (a02 = mo3651a0()) == null)) {
                                    m8516E3().f6423b.setTextColor(C0506a.m3150b(a02, this.f6373K0));
                                }
                                if (!(this.f6374L0 == -1 || (a0 = mo3651a0()) == null)) {
                                    m8516E3().f6424c.setTextColor(C0506a.m3150b(a0, this.f6374L0));
                                }
                                Button button3 = m8516E3().f6424c;
                                C8594l.m46770d(button3, "binding.buttonConfirm");
                                button3.setAllCaps(this.f6375M0);
                                Button button4 = m8516E3().f6423b;
                                C8594l.m46770d(button4, "binding.buttonCancel");
                                button4.setAllCaps(this.f6375M0);
                                m8516E3().f6424c.setOnClickListener(new C1705g(this));
                                m8516E3().f6423b.setOnClickListener(new C1706h(this));
                                m8516E3().f6425d.mo4634l(this.f6380R0);
                                m8516E3().f6426e.mo4634l(this.f6381S0);
                                m8524M3();
                                m8527Q3();
                                if (this.f6365C0) {
                                    m8533W3();
                                    return;
                                }
                                return;
                            }
                            C8594l.m46783q("minuteSnapHelper");
                            throw null;
                        }
                        C8594l.m46783q("minuteAdapter");
                        throw null;
                    }
                    C8594l.m46783q("minuteLayoutManager");
                    throw null;
                }
                C8594l.m46783q("hourSnapHelper");
                throw null;
            }
            C8594l.m46783q("hourAdapter");
            throw null;
        }
        C8594l.m46783q("hourLayoutManager");
        throw null;
    }

    /* renamed from: k3 */
    public void mo7542k3() {
        m8525O3(new TimeValue(this.f6378P0, this.f6379Q0));
        m8532V3(this.f6378P0, this.f6379Q0);
    }

    /* renamed from: l3 */
    public void mo7543l3(Bundle bundle) {
        TimeValue timeValue = null;
        this.f6363A0 = bundle != null ? (TimeRange) bundle.getParcelable("com.akexorcist.snaptimepicker.selectable_time_range") : null;
        if (bundle != null) {
            timeValue = (TimeValue) bundle.getParcelable("com.akexorcist.snaptimepicker.preselected_time");
        }
        this.f6364B0 = timeValue;
        this.f6365C0 = bundle != null ? bundle.getBoolean("com.akexorcist.snaptimepicker.is_use_view_model") : false;
        int i = -1;
        this.f6366D0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.title", -1) : -1;
        this.f6367E0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.prefix", -1) : -1;
        this.f6368F0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.suffix", -1) : -1;
        this.f6370H0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.theme_color", -1) : -1;
        this.f6369G0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.title_color", -1) : -1;
        this.f6371I0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.negative_button_text", -1) : -1;
        this.f6372J0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.positive_button_text", -1) : -1;
        this.f6373K0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.negative_button_color", -1) : -1;
        if (bundle != null) {
            i = bundle.getInt("com.akexorcist.snaptimepicker.positive_button_color", -1);
        }
        this.f6374L0 = i;
        int i2 = 1;
        this.f6375M0 = bundle != null ? bundle.getBoolean("com.akexorcist.snaptimepicker.button_text_all_caps", true) : true;
        if (bundle != null) {
            i2 = bundle.getInt("com.akexorcist.snaptimepicker.time_interval", 1);
        }
        this.f6376N0 = i2;
    }

    /* renamed from: m3 */
    public void mo7544m3(Bundle bundle) {
        TimeValue timeValue = null;
        this.f6363A0 = bundle != null ? (TimeRange) bundle.getParcelable("com.akexorcist.snaptimepicker.selectable_time_range") : null;
        if (bundle != null) {
            timeValue = (TimeValue) bundle.getParcelable("com.akexorcist.snaptimepicker.preselected_time");
        }
        this.f6364B0 = timeValue;
        int i = -1;
        this.f6378P0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.selected_hour", -1) : -1;
        this.f6379Q0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.selected_minute", -1) : -1;
        this.f6365C0 = bundle != null ? bundle.getBoolean("com.akexorcist.snaptimepicker.is_use_view_model") : false;
        this.f6366D0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.title", -1) : -1;
        this.f6367E0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.prefix", -1) : -1;
        this.f6368F0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.suffix", -1) : -1;
        this.f6370H0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.theme_color", -1) : -1;
        this.f6369G0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.title_color", -1) : -1;
        this.f6371I0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.negative_button_text", -1) : -1;
        this.f6372J0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.positive_button_text", -1) : -1;
        this.f6373K0 = bundle != null ? bundle.getInt("com.akexorcist.snaptimepicker.negative_button_color", -1) : -1;
        if (bundle != null) {
            i = bundle.getInt("com.akexorcist.snaptimepicker.positive_button_color", -1);
        }
        this.f6374L0 = i;
        int i2 = 1;
        this.f6375M0 = bundle != null ? bundle.getBoolean("com.akexorcist.snaptimepicker.button_text_all_caps", true) : true;
        if (bundle != null) {
            i2 = bundle.getInt("com.akexorcist.snaptimepicker.time_interval", 1);
        }
        this.f6376N0 = i2;
    }

    /* renamed from: n3 */
    public void mo7545n3(Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("com.akexorcist.snaptimepicker.selectable_time_range", this.f6363A0);
        }
        if (bundle != null) {
            bundle.putParcelable("com.akexorcist.snaptimepicker.preselected_time", this.f6364B0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.selected_hour", this.f6378P0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.selected_minute", this.f6379Q0);
        }
        if (bundle != null) {
            bundle.putBoolean("com.akexorcist.snaptimepicker.is_use_view_model", this.f6365C0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.title", this.f6366D0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.prefix", this.f6367E0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.suffix", this.f6368F0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.theme_color", this.f6370H0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.title_color", this.f6369G0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.negative_button_text", this.f6371I0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.positive_button_text", this.f6372J0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.negative_button_color", this.f6373K0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.positive_button_color", this.f6374L0);
        }
        if (bundle != null) {
            bundle.putBoolean("com.akexorcist.snaptimepicker.button_text_all_caps", this.f6375M0);
        }
        if (bundle != null) {
            bundle.putInt("com.akexorcist.snaptimepicker.time_interval", this.f6376N0);
        }
    }

    /* renamed from: o3 */
    public void mo7546o3() {
    }

    /* renamed from: p3 */
    public View mo7547p3() {
        FrameLayout c = m8516E3().mo7577a();
        C8594l.m46770d(c, "binding.root");
        return c;
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        m8516E3().f6425d.mo4624h1(this.f6380R0);
        m8516E3().f6426e.mo4624h1(this.f6381S0);
    }
}
