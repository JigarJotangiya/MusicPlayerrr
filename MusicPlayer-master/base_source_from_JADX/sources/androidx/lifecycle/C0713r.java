package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.r */
/* compiled from: LifecycleDispatcher */
class C0713r {

    /* renamed from: a */
    private static AtomicBoolean f3335a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.r$a */
    /* compiled from: LifecycleDispatcher */
    static class C0714a extends C0681i {
        C0714a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            ReportFragment.m4167g(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m4278a(Context context) {
        if (!f3335a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0714a());
        }
    }
}
