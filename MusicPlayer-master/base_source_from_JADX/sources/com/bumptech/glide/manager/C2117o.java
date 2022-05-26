package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1721c;
import com.bumptech.glide.C1727e;
import com.bumptech.glide.C1740k;
import com.bumptech.glide.load.p036p.p037d.C2042r;
import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.C2194k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p082e.p098e.C3465a;

/* renamed from: com.bumptech.glide.manager.o */
/* compiled from: RequestManagerRetriever */
public class C2117o implements Handler.Callback {

    /* renamed from: p */
    private static final C2119b f7219p = new C2118a();

    /* renamed from: g */
    private volatile C1740k f7220g;

    /* renamed from: h */
    final Map<FragmentManager, RequestManagerFragment> f7221h = new HashMap();

    /* renamed from: i */
    final Map<C0602j, C2122r> f7222i = new HashMap();

    /* renamed from: j */
    private final Handler f7223j;

    /* renamed from: k */
    private final C2119b f7224k;

    /* renamed from: l */
    private final C3465a<View, Fragment> f7225l = new C3465a<>();

    /* renamed from: m */
    private final C3465a<View, android.app.Fragment> f7226m = new C3465a<>();

    /* renamed from: n */
    private final Bundle f7227n = new Bundle();

    /* renamed from: o */
    private final C2113k f7228o;

    /* renamed from: com.bumptech.glide.manager.o$a */
    /* compiled from: RequestManagerRetriever */
    class C2118a implements C2119b {
        C2118a() {
        }

        /* renamed from: a */
        public C1740k mo8292a(C1719b bVar, C2114l lVar, C2120p pVar, Context context) {
            return new C1740k(bVar, lVar, pVar, context);
        }
    }

    /* renamed from: com.bumptech.glide.manager.o$b */
    /* compiled from: RequestManagerRetriever */
    public interface C2119b {
        /* renamed from: a */
        C1740k mo8292a(C1719b bVar, C2114l lVar, C2120p pVar, Context context);
    }

    public C2117o(C2119b bVar, C1727e eVar) {
        this.f7224k = bVar == null ? f7219p : bVar;
        this.f7223j = new Handler(Looper.getMainLooper(), this);
        this.f7228o = m9865b(eVar);
    }

    @TargetApi(17)
    /* renamed from: a */
    private static void m9864a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    private static C2113k m9865b(C1727e eVar) {
        if (!C2042r.f7063h || !C2042r.f7062g) {
            return new C2109g();
        }
        if (eVar.mo7609a(C1721c.C1725d.class)) {
            return new C2111i();
        }
        return new C2112j();
    }

    /* renamed from: c */
    private static Activity m9866c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m9866c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: d */
    private void m9867d(FragmentManager fragmentManager, C3465a<View, android.app.Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment next : fragmentManager.getFragments()) {
                if (next.getView() != null) {
                    aVar.put(next.getView(), next);
                    m9867d(next.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        m9868e(fragmentManager, aVar);
    }

    @Deprecated
    /* renamed from: e */
    private void m9868e(FragmentManager fragmentManager, C3465a<View, android.app.Fragment> aVar) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f7227n.putInt("key", i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f7227n, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    if (Build.VERSION.SDK_INT >= 17) {
                        m9867d(fragment.getChildFragmentManager(), aVar);
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m9869f(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment next : collection) {
                if (!(next == null || next.mo3600J0() == null)) {
                    map.put(next.mo3600J0(), next);
                    m9869f(next.mo3642W().mo3956h0(), map);
                }
            }
        }
    }

    @Deprecated
    /* renamed from: g */
    private android.app.Fragment m9870g(View view, Activity activity) {
        this.f7226m.clear();
        m9867d(activity.getFragmentManager(), this.f7226m);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f7226m.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f7226m.clear();
        return fragment;
    }

    /* renamed from: h */
    private Fragment m9871h(View view, FragmentActivity fragmentActivity) {
        this.f7225l.clear();
        m9869f(fragmentActivity.mo3730H1().mo3956h0(), this.f7225l);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f7225l.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f7225l.clear();
        return fragment;
    }

    @Deprecated
    /* renamed from: i */
    private C1740k m9872i(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        RequestManagerFragment r = m9874r(fragmentManager, fragment);
        C1740k e = r.mo8259e();
        if (e == null) {
            e = this.f7224k.mo8292a(C1719b.m8591c(context), r.mo8258c(), r.mo8260f(), context);
            if (z) {
                e.mo7648a();
            }
            r.mo8262k(e);
        }
        return e;
    }

    /* renamed from: p */
    private C1740k m9873p(Context context) {
        if (this.f7220g == null) {
            synchronized (this) {
                if (this.f7220g == null) {
                    this.f7220g = this.f7224k.mo8292a(C1719b.m8591c(context.getApplicationContext()), new C2102b(), new C2110h(), context.getApplicationContext());
                }
            }
        }
        return this.f7220g;
    }

    /* renamed from: r */
    private RequestManagerFragment m9874r(FragmentManager fragmentManager, android.app.Fragment fragment) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment != null) {
            return requestManagerFragment;
        }
        RequestManagerFragment requestManagerFragment2 = this.f7221h.get(fragmentManager);
        if (requestManagerFragment2 != null) {
            return requestManagerFragment2;
        }
        RequestManagerFragment requestManagerFragment3 = new RequestManagerFragment();
        requestManagerFragment3.mo8261j(fragment);
        this.f7221h.put(fragmentManager, requestManagerFragment3);
        fragmentManager.beginTransaction().add(requestManagerFragment3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f7223j.obtainMessage(1, fragmentManager).sendToTarget();
        return requestManagerFragment3;
    }

    /* renamed from: t */
    private C2122r m9875t(C0602j jVar, Fragment fragment) {
        C2122r rVar = (C2122r) jVar.mo3938Y("com.bumptech.glide.manager");
        if (rVar != null) {
            return rVar;
        }
        C2122r rVar2 = this.f7222i.get(jVar);
        if (rVar2 != null) {
            return rVar2;
        }
        C2122r rVar3 = new C2122r();
        rVar3.mo8305h3(fragment);
        this.f7222i.put(jVar, rVar3);
        C0620p i = jVar.mo3957i();
        i.mo4071e(rVar3, "com.bumptech.glide.manager");
        i.mo3816j();
        this.f7223j.obtainMessage(2, jVar).sendToTarget();
        return rVar3;
    }

    /* renamed from: u */
    private static boolean m9876u(Context context) {
        Activity c = m9866c(context);
        return c == null || !c.isFinishing();
    }

    /* renamed from: v */
    private C1740k m9877v(Context context, C0602j jVar, Fragment fragment, boolean z) {
        C2122r t = m9875t(jVar, fragment);
        C1740k b3 = t.mo8303b3();
        if (b3 == null) {
            b3 = this.f7224k.mo8292a(C1719b.m8591c(context), t.mo8302Z2(), t.mo8304c3(), context);
            if (z) {
                b3.mo7648a();
            }
            t.mo8306i3(b3);
        }
        return b3;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = message.what;
        Object obj4 = null;
        boolean z = true;
        if (i == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.f7221h.remove(obj3);
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj3 = (C0602j) message.obj;
            obj2 = this.f7222i.remove(obj3);
        }
        Object obj5 = obj3;
        obj4 = obj2;
        obj = obj5;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    /* renamed from: j */
    public C1740k mo8284j(Activity activity) {
        if (C2194k.m10287q()) {
            return mo8286l(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return mo8289o((FragmentActivity) activity);
        }
        m9864a(activity);
        this.f7228o.mo8279a(activity);
        return m9872i(activity, activity.getFragmentManager(), (android.app.Fragment) null, m9876u(activity));
    }

    @TargetApi(17)
    @Deprecated
    /* renamed from: k */
    public C1740k mo8285k(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C2194k.m10287q() || Build.VERSION.SDK_INT < 17) {
            return mo8286l(fragment.getActivity().getApplicationContext());
        } else {
            if (fragment.getActivity() != null) {
                this.f7228o.mo8279a(fragment.getActivity());
            }
            return m9872i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    /* renamed from: l */
    public C1740k mo8286l(Context context) {
        if (context != null) {
            if (C2194k.m10288r() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return mo8289o((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return mo8284j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo8286l(contextWrapper.getBaseContext());
                    }
                }
            }
            return m9873p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: m */
    public C1740k mo8287m(View view) {
        if (C2194k.m10287q()) {
            return mo8286l(view.getContext().getApplicationContext());
        }
        C2193j.m10269d(view);
        C2193j.m10270e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c = m9866c(view.getContext());
        if (c == null) {
            return mo8286l(view.getContext().getApplicationContext());
        }
        if (c instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) c;
            Fragment h = m9871h(view, fragmentActivity);
            return h != null ? mo8288n(h) : mo8289o(fragmentActivity);
        }
        android.app.Fragment g = m9870g(view, c);
        if (g == null) {
            return mo8284j(c);
        }
        return mo8285k(g);
    }

    /* renamed from: n */
    public C1740k mo8288n(Fragment fragment) {
        C2193j.m10270e(fragment.mo3651a0(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C2194k.m10287q()) {
            return mo8286l(fragment.mo3651a0().getApplicationContext());
        }
        if (fragment.mo3606L() != null) {
            this.f7228o.mo8279a(fragment.mo3606L());
        }
        return m9877v(fragment.mo3651a0(), fragment.mo3642W(), fragment, fragment.mo3652a1());
    }

    /* renamed from: o */
    public C1740k mo8289o(FragmentActivity fragmentActivity) {
        if (C2194k.m10287q()) {
            return mo8286l(fragmentActivity.getApplicationContext());
        }
        m9864a(fragmentActivity);
        this.f7228o.mo8279a(fragmentActivity);
        return m9877v(fragmentActivity, fragmentActivity.mo3730H1(), (Fragment) null, m9876u(fragmentActivity));
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: q */
    public RequestManagerFragment mo8290q(Activity activity) {
        return m9874r(activity.getFragmentManager(), (android.app.Fragment) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C2122r mo8291s(C0602j jVar) {
        return m9875t(jVar, (Fragment) null);
    }
}
