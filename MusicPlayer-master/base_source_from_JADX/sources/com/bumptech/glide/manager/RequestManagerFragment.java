package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1740k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public class RequestManagerFragment extends Fragment {

    /* renamed from: g */
    private final C2101a f7203g;

    /* renamed from: h */
    private final C2120p f7204h;

    /* renamed from: i */
    private final Set<RequestManagerFragment> f7205i;

    /* renamed from: j */
    private C1740k f7206j;

    /* renamed from: k */
    private RequestManagerFragment f7207k;

    /* renamed from: l */
    private Fragment f7208l;

    /* renamed from: com.bumptech.glide.manager.RequestManagerFragment$a */
    private class C2100a implements C2120p {
        C2100a() {
        }

        /* renamed from: a */
        public Set<C1740k> mo8269a() {
            Set<RequestManagerFragment> b = RequestManagerFragment.this.mo8257b();
            HashSet hashSet = new HashSet(b.size());
            for (RequestManagerFragment next : b) {
                if (next.mo8259e() != null) {
                    hashSet.add(next.mo8259e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    public RequestManagerFragment() {
        this(new C2101a());
    }

    /* renamed from: a */
    private void m9825a(RequestManagerFragment requestManagerFragment) {
        this.f7205i.add(requestManagerFragment);
    }

    @TargetApi(17)
    /* renamed from: d */
    private Fragment m9826d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f7208l;
    }

    @TargetApi(17)
    /* renamed from: g */
    private boolean m9827g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    private void m9828h(Activity activity) {
        m9830l();
        RequestManagerFragment q = C1719b.m8591c(activity).mo7589k().mo8290q(activity);
        this.f7207k = q;
        if (!equals(q)) {
            this.f7207k.m9825a(this);
        }
    }

    /* renamed from: i */
    private void m9829i(RequestManagerFragment requestManagerFragment) {
        this.f7205i.remove(requestManagerFragment);
    }

    /* renamed from: l */
    private void m9830l() {
        RequestManagerFragment requestManagerFragment = this.f7207k;
        if (requestManagerFragment != null) {
            requestManagerFragment.m9829i(this);
            this.f7207k = null;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(17)
    /* renamed from: b */
    public Set<RequestManagerFragment> mo8257b() {
        if (equals(this.f7207k)) {
            return Collections.unmodifiableSet(this.f7205i);
        }
        if (this.f7207k == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment next : this.f7207k.mo8257b()) {
            if (m9827g(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2101a mo8258c() {
        return this.f7203g;
    }

    /* renamed from: e */
    public C1740k mo8259e() {
        return this.f7206j;
    }

    /* renamed from: f */
    public C2120p mo8260f() {
        return this.f7204h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8261j(Fragment fragment) {
        this.f7208l = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m9828h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void mo8262k(C1740k kVar) {
        this.f7206j = kVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m9828h(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7203g.mo8273c();
        m9830l();
    }

    public void onDetach() {
        super.onDetach();
        m9830l();
    }

    public void onStart() {
        super.onStart();
        this.f7203g.mo8274d();
    }

    public void onStop() {
        super.onStop();
        this.f7203g.mo8275e();
    }

    public String toString() {
        return super.toString() + "{parent=" + m9826d() + "}";
    }

    @SuppressLint({"ValidFragment"})
    RequestManagerFragment(C2101a aVar) {
        this.f7204h = new C2100a();
        this.f7205i = new HashSet();
        this.f7203g = aVar;
    }
}
