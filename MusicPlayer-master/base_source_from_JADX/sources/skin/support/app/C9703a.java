package skin.support.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p082e.p109h.p119p.C3759g;
import p443m.p444a.C9317b;
import p443m.p444a.p445c.C9321a;
import p443m.p444a.p447e.p448a.C9332d;
import p443m.p444a.p447e.p448a.C9333e;
import p443m.p444a.p451h.C9343a;
import p443m.p444a.p451h.C9344b;
import p443m.p444a.p452i.C9348d;
import skin.support.widget.C9712c;
import skin.support.widget.C9716g;

/* renamed from: skin.support.app.a */
/* compiled from: SkinActivityLifecycle */
public class C9703a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: j */
    private static volatile C9703a f36734j;

    /* renamed from: g */
    private WeakHashMap<Context, C9705b> f36735g;

    /* renamed from: h */
    private WeakHashMap<Context, C9704a> f36736h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public WeakReference<Activity> f36737i;

    /* renamed from: skin.support.app.a$a */
    /* compiled from: SkinActivityLifecycle */
    private class C9704a implements C9344b {

        /* renamed from: g */
        private final Context f36738g;

        /* renamed from: h */
        private boolean f36739h = false;

        C9704a(Context context) {
            this.f36738g = context;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo33823a() {
            if (C9348d.f36128a) {
                C9348d.m49503a("SkinActivityLifecycle", "Context: " + this.f36738g + " updateSkinForce");
            }
            Context context = this.f36738g;
            if (context != null) {
                if ((context instanceof Activity) && C9703a.this.m50235i(context)) {
                    C9703a.this.m50236j((Activity) this.f36738g);
                }
                C9703a.this.m50232f(this.f36738g).mo33825a();
                Context context2 = this.f36738g;
                if (context2 instanceof C9716g) {
                    ((C9716g) context2).mo33834f();
                }
                this.f36739h = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo33824b() {
            if (this.f36739h) {
                mo33823a();
            }
        }

        /* renamed from: t1 */
        public void mo32342t1(C9343a aVar, Object obj) {
            if (C9703a.this.f36737i == null || this.f36738g == C9703a.this.f36737i.get() || !(this.f36738g instanceof Activity)) {
                mo33823a();
            } else {
                this.f36739h = true;
            }
        }
    }

    private C9703a(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        m50234h(application);
        C9317b.m49321m().mo32338a(m50231e(application));
    }

    /* renamed from: e */
    private C9704a m50231e(Context context) {
        if (this.f36736h == null) {
            this.f36736h = new WeakHashMap<>();
        }
        C9704a aVar = this.f36736h.get(context);
        if (aVar != null) {
            return aVar;
        }
        C9704a aVar2 = new C9704a(context);
        this.f36736h.put(context, aVar2);
        return aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C9705b m50232f(Context context) {
        if (this.f36735g == null) {
            this.f36735g = new WeakHashMap<>();
        }
        C9705b bVar = this.f36735g.get(context);
        if (bVar != null) {
            return bVar;
        }
        C9705b b = C9705b.m50240b(context);
        this.f36735g.put(context, b);
        return b;
    }

    /* renamed from: g */
    public static C9703a m50233g(Application application) {
        if (f36734j == null) {
            synchronized (C9703a.class) {
                if (f36734j == null) {
                    f36734j = new C9703a(application);
                }
            }
        }
        return f36734j;
    }

    /* renamed from: h */
    private void m50234h(Context context) {
        try {
            C3759g.m16092b(LayoutInflater.from(context), m50232f(context));
        } catch (Throwable unused) {
            C9348d.m49503a("SkinActivity", "A factory has already been set on this LayoutInflater");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m50235i(Context context) {
        return C9317b.m49321m().mo32280t() || context.getClass().getAnnotation(C9321a.class) != null || (context instanceof C9716g);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m50236j(Activity activity) {
        Drawable d;
        if (C9317b.m49321m().mo32281u()) {
            int g = C9333e.m49430g(activity);
            if (C9712c.m50287a(g) != 0 && (d = C9332d.m49407d(activity, g)) != null) {
                activity.getWindow().setBackgroundDrawable(d);
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (m50235i(activity)) {
            m50234h(activity);
            m50236j(activity);
            if (activity instanceof C9716g) {
                ((C9716g) activity).mo33834f();
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (m50235i(activity)) {
            C9317b.m49321m().mo32339b(m50231e(activity));
            this.f36736h.remove(activity);
            this.f36735g.remove(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        this.f36737i = new WeakReference<>(activity);
        if (m50235i(activity)) {
            C9704a e = m50231e(activity);
            C9317b.m49321m().mo32338a(e);
            e.mo33824b();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
