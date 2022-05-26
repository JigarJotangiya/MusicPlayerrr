package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0697n;

public class ReportFragment extends Fragment {

    /* renamed from: g */
    private C0648a f3255g;

    /* renamed from: androidx.lifecycle.ReportFragment$a */
    interface C0648a {
        /* renamed from: a */
        void mo4175a();

        void onCreate();

        void onResume();
    }

    /* renamed from: androidx.lifecycle.ReportFragment$b */
    static class C0649b implements Application.ActivityLifecycleCallbacks {
        C0649b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C0649b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            ReportFragment.m4161a(activity, C0697n.C0699b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            ReportFragment.m4161a(activity, C0697n.C0699b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            ReportFragment.m4161a(activity, C0697n.C0699b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            ReportFragment.m4161a(activity, C0697n.C0699b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            ReportFragment.m4161a(activity, C0697n.C0699b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            ReportFragment.m4161a(activity, C0697n.C0699b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m4161a(Activity activity, C0697n.C0699b bVar) {
        if (activity instanceof C0722y) {
            ((C0722y) activity).mo390v().mo4268h(bVar);
        } else if (activity instanceof C0718v) {
            C0697n v = ((C0718v) activity).mo390v();
            if (v instanceof C0720x) {
                ((C0720x) v).mo4268h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m4162b(C0697n.C0699b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m4161a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m4163c(C0648a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: d */
    private void m4164d(C0648a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: e */
    private void m4165e(C0648a aVar) {
        if (aVar != null) {
            aVar.mo4175a();
        }
    }

    /* renamed from: f */
    static ReportFragment m4166f(Activity activity) {
        return (ReportFragment) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m4167g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0649b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4168h(C0648a aVar) {
        this.f3255g = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4163c(this.f3255g);
        m4162b(C0697n.C0699b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m4162b(C0697n.C0699b.ON_DESTROY);
        this.f3255g = null;
    }

    public void onPause() {
        super.onPause();
        m4162b(C0697n.C0699b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m4164d(this.f3255g);
        m4162b(C0697n.C0699b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m4165e(this.f3255g);
        m4162b(C0697n.C0699b.ON_START);
    }

    public void onStop() {
        super.onStop();
        m4162b(C0697n.C0699b.ON_STOP);
    }
}
