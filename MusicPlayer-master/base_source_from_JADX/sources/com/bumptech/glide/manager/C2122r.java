package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1740k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.r */
/* compiled from: SupportRequestManagerFragment */
public class C2122r extends Fragment {

    /* renamed from: d0 */
    private final C2101a f7232d0;

    /* renamed from: e0 */
    private final C2120p f7233e0;

    /* renamed from: f0 */
    private final Set<C2122r> f7234f0;

    /* renamed from: g0 */
    private C2122r f7235g0;

    /* renamed from: h0 */
    private C1740k f7236h0;

    /* renamed from: i0 */
    private Fragment f7237i0;

    /* renamed from: com.bumptech.glide.manager.r$a */
    /* compiled from: SupportRequestManagerFragment */
    private class C2123a implements C2120p {
        C2123a() {
        }

        /* renamed from: a */
        public Set<C1740k> mo8269a() {
            Set<C2122r> Y2 = C2122r.this.mo8301Y2();
            HashSet hashSet = new HashSet(Y2.size());
            for (C2122r next : Y2) {
                if (next.mo8303b3() != null) {
                    hashSet.add(next.mo8303b3());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C2122r.this + "}";
        }
    }

    public C2122r() {
        this(new C2101a());
    }

    /* renamed from: X2 */
    private void m9896X2(C2122r rVar) {
        this.f7234f0.add(rVar);
    }

    /* renamed from: a3 */
    private Fragment m9897a3() {
        Fragment p0 = mo3690p0();
        return p0 != null ? p0 : this.f7237i0;
    }

    /* renamed from: d3 */
    private static C0602j m9898d3(Fragment fragment) {
        while (fragment.mo3690p0() != null) {
            fragment = fragment.mo3690p0();
        }
        return fragment.mo3668h0();
    }

    /* renamed from: e3 */
    private boolean m9899e3(Fragment fragment) {
        Fragment a3 = m9897a3();
        while (true) {
            Fragment p0 = fragment.mo3690p0();
            if (p0 == null) {
                return false;
            }
            if (p0.equals(a3)) {
                return true;
            }
            fragment = fragment.mo3690p0();
        }
    }

    /* renamed from: f3 */
    private void m9900f3(Context context, C0602j jVar) {
        m9902j3();
        C2122r s = C1719b.m8591c(context).mo7589k().mo8291s(jVar);
        this.f7235g0 = s;
        if (!equals(s)) {
            this.f7235g0.m9896X2(this);
        }
    }

    /* renamed from: g3 */
    private void m9901g3(C2122r rVar) {
        this.f7234f0.remove(rVar);
    }

    /* renamed from: j3 */
    private void m9902j3() {
        C2122r rVar = this.f7235g0;
        if (rVar != null) {
            rVar.m9901g3(this);
            this.f7235g0 = null;
        }
    }

    /* renamed from: D1 */
    public void mo3583D1() {
        super.mo3583D1();
        this.f7237i0 = null;
        m9902j3();
    }

    /* renamed from: S1 */
    public void mo3630S1() {
        super.mo3630S1();
        this.f7232d0.mo8274d();
    }

    /* renamed from: T1 */
    public void mo3633T1() {
        super.mo3633T1();
        this.f7232d0.mo8275e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y2 */
    public Set<C2122r> mo8301Y2() {
        C2122r rVar = this.f7235g0;
        if (rVar == null) {
            return Collections.emptySet();
        }
        if (equals(rVar)) {
            return Collections.unmodifiableSet(this.f7234f0);
        }
        HashSet hashSet = new HashSet();
        for (C2122r next : this.f7235g0.mo8301Y2()) {
            if (m9899e3(next.m9897a3())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z2 */
    public C2101a mo8302Z2() {
        return this.f7232d0;
    }

    /* renamed from: b3 */
    public C1740k mo8303b3() {
        return this.f7236h0;
    }

    /* renamed from: c3 */
    public C2120p mo8304c3() {
        return this.f7233e0;
    }

    /* renamed from: h1 */
    public void mo3669h1(Context context) {
        super.mo3669h1(context);
        C0602j d3 = m9898d3(this);
        if (d3 != null) {
            try {
                m9900f3(mo3651a0(), d3);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h3 */
    public void mo8305h3(Fragment fragment) {
        C0602j d3;
        this.f7237i0 = fragment;
        if (fragment != null && fragment.mo3651a0() != null && (d3 = m9898d3(fragment)) != null) {
            m9900f3(fragment.mo3651a0(), d3);
        }
    }

    /* renamed from: i3 */
    public void mo8306i3(C1740k kVar) {
        this.f7236h0 = kVar;
    }

    public String toString() {
        return super.toString() + "{parent=" + m9897a3() + "}";
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        this.f7232d0.mo8273c();
        m9902j3();
    }

    @SuppressLint({"ValidFragment"})
    public C2122r(C2101a aVar) {
        this.f7233e0 = new C2123a();
        this.f7234f0 = new HashSet();
        this.f7232d0 = aVar;
    }
}
