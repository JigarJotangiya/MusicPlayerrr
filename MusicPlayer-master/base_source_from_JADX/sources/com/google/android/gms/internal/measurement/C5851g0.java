package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.util.C3359d;
import com.google.android.gms.common.util.C3362g;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import p159f.p243f.p245b.p246a.p299d.p300a.C7450a;
import p159f.p243f.p245b.p246a.p299d.p301b.C7451a;
import p159f.p243f.p245b.p246a.p299d.p301b.C7452b;

/* renamed from: com.google.android.gms.internal.measurement.g0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
public final class C5851g0 {

    /* renamed from: i */
    private static volatile C5851g0 f27508i;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f27509a;

    /* renamed from: b */
    protected final C3359d f27510b;

    /* renamed from: c */
    protected final ExecutorService f27511c;

    /* renamed from: d */
    private final C7450a f27512d;

    /* renamed from: e */
    private int f27513e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f27514f;

    /* renamed from: g */
    private final String f27515g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile C5869p0 f27516h;

    protected C5851g0(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m35007r(str2, str3)) {
            this.f27509a = "FA";
        } else {
            this.f27509a = str;
        }
        this.f27510b = C3362g.m14447d();
        boolean z = true;
        this.f27511c = C5861l0.m35044a().mo22688a(new C5874s(this), 1);
        this.f27512d = new C7450a(this);
        new ArrayList();
        try {
            if (C7452b.m41862a(context, "google_app_id", C7451a.m41860a(context)) != null && !m35003n()) {
                this.f27515g = null;
                this.f27514f = true;
                Log.w(this.f27509a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m35007r(str2, str3)) {
            this.f27515g = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z)) {
                    Log.w(this.f27509a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f27509a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.f27515g = str2;
        }
        m35004o(new C5852h(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f27509a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C5849f0(this));
        }
    }

    /* renamed from: n */
    protected static final boolean m35003n() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m35004o(C5879x xVar) {
        this.f27511c.execute(xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m35005p(Exception exc, boolean z, boolean z2) {
        this.f27514f |= z;
        if (z) {
            Log.w(this.f27509a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo22677c(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f27509a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: q */
    private final void m35006q(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m35004o(new C5877v(this, l, str, str2, bundle, z, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m35007r(String str, String str2) {
        return (str2 == null || str == null || m35003n()) ? false : true;
    }

    /* renamed from: s */
    public static C5851g0 m35008s(Context context, String str, String str2, String str3, Bundle bundle) {
        C3292l.m14240h(context);
        if (f27508i == null) {
            synchronized (C5851g0.class) {
                if (f27508i == null) {
                    f27508i = new C5851g0(context, str, str2, str3, bundle);
                }
            }
        }
        return f27508i;
    }

    /* renamed from: A */
    public final void mo22667A(Activity activity, String str, String str2) {
        m35004o(new C5848f(this, activity, str, str2));
    }

    /* renamed from: B */
    public final void mo22668B(Bundle bundle) {
        m35004o(new C5850g(this, bundle));
    }

    /* renamed from: C */
    public final void mo22669C(String str) {
        m35004o(new C5854i(this, str));
    }

    /* renamed from: D */
    public final void mo22670D(String str) {
        m35004o(new C5856j(this, str));
    }

    /* renamed from: E */
    public final String mo22671E() {
        C5863m0 m0Var = new C5863m0();
        m35004o(new C5858k(this, m0Var));
        return m0Var.mo22689C0(500);
    }

    /* renamed from: F */
    public final String mo22672F() {
        C5863m0 m0Var = new C5863m0();
        m35004o(new C5860l(this, m0Var));
        return m0Var.mo22689C0(50);
    }

    /* renamed from: G */
    public final long mo22673G() {
        C5863m0 m0Var = new C5863m0();
        m35004o(new C5862m(this, m0Var));
        Long l = (Long) C5863m0.m35047f2(m0Var.mo22690K0(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f27510b.mo11988a()).nextLong();
        int i = this.f27513e + 1;
        this.f27513e = i;
        return nextLong + ((long) i);
    }

    /* renamed from: H */
    public final String mo22674H() {
        C5863m0 m0Var = new C5863m0();
        m35004o(new C5864n(this, m0Var));
        return m0Var.mo22689C0(500);
    }

    /* renamed from: a */
    public final String mo22675a() {
        C5863m0 m0Var = new C5863m0();
        m35004o(new C5866o(this, m0Var));
        return m0Var.mo22689C0(500);
    }

    /* renamed from: b */
    public final Map<String, Object> mo22676b(String str, String str2, boolean z) {
        C5863m0 m0Var = new C5863m0();
        m35004o(new C5868p(this, str, str2, z, m0Var));
        Bundle K0 = m0Var.mo22690K0(5000);
        if (K0 == null || K0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(K0.size());
        for (String str3 : K0.keySet()) {
            Object obj = K0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public final void mo22677c(int i, String str, Object obj, Object obj2, Object obj3) {
        m35004o(new C5870q(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* renamed from: d */
    public final Bundle mo22678d(Bundle bundle, boolean z) {
        C5863m0 m0Var = new C5863m0();
        m35004o(new C5872r(this, bundle, m0Var));
        if (z) {
            return m0Var.mo22690K0(5000);
        }
        return null;
    }

    /* renamed from: e */
    public final int mo22679e(String str) {
        C5863m0 m0Var = new C5863m0();
        m35004o(new C5875t(this, str, m0Var));
        Integer num = (Integer) C5863m0.m35047f2(m0Var.mo22690K0(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public final String mo22680f() {
        return this.f27515g;
    }

    /* renamed from: t */
    public final C7450a mo22681t() {
        return this.f27512d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C5869p0 mo22682u(Context context, boolean z) {
        try {
            return C5867o0.m35081C0(DynamiteModule.m14489e(context, DynamiteModule.f10793c, "com.google.android.gms.measurement.dynamite").mo11998d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C3379a e) {
            m35005p(e, true, false);
            return null;
        }
    }

    /* renamed from: v */
    public final void mo22683v(String str, String str2, Bundle bundle) {
        m35006q(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: w */
    public final void mo22684w(String str, String str2, Object obj, boolean z) {
        m35004o(new C5878w(this, str, str2, obj, z));
    }

    /* renamed from: x */
    public final void mo22685x(Bundle bundle) {
        m35004o(new C5842c(this, bundle));
    }

    /* renamed from: y */
    public final void mo22686y(String str, String str2, Bundle bundle) {
        m35004o(new C5844d(this, str, str2, bundle));
    }

    /* renamed from: z */
    public final List<Bundle> mo22687z(String str, String str2) {
        C5863m0 m0Var = new C5863m0();
        m35004o(new C5846e(this, str, str2, m0Var));
        List<Bundle> list = (List) C5863m0.m35047f2(m0Var.mo22690K0(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }
}
