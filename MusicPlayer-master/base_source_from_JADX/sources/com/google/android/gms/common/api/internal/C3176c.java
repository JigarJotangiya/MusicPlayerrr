package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.C3369n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3176c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: k */
    private static final C3176c f10362k = new C3176c();

    /* renamed from: g */
    private final AtomicBoolean f10363g = new AtomicBoolean();

    /* renamed from: h */
    private final AtomicBoolean f10364h = new AtomicBoolean();

    /* renamed from: i */
    private final ArrayList<C3177a> f10365i = new ArrayList<>();

    /* renamed from: j */
    private boolean f10366j = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface C3177a {
        /* renamed from: a */
        void mo11570a(boolean z);
    }

    private C3176c() {
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C3176c m13834b() {
        return f10362k;
    }

    /* renamed from: c */
    public static void m13835c(@RecentlyNonNull Application application) {
        C3176c cVar = f10362k;
        synchronized (cVar) {
            if (!cVar.f10366j) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f10366j = true;
            }
        }
    }

    /* renamed from: f */
    private final void m13836f(boolean z) {
        synchronized (f10362k) {
            Iterator<C3177a> it = this.f10365i.iterator();
            while (it.hasNext()) {
                it.next().mo11570a(z);
            }
        }
    }

    /* renamed from: a */
    public void mo11557a(@RecentlyNonNull C3177a aVar) {
        synchronized (f10362k) {
            this.f10365i.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo11558d() {
        return this.f10363g.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean mo11559e(boolean z) {
        if (!this.f10364h.get()) {
            if (!C3369n.m14470b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f10364h.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f10363g.set(true);
            }
        }
        return mo11558d();
    }

    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f10363g.compareAndSet(true, false);
        this.f10364h.set(true);
        if (compareAndSet) {
            m13836f(false);
        }
    }

    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean compareAndSet = this.f10363g.compareAndSet(true, false);
        this.f10364h.set(true);
        if (compareAndSet) {
            m13836f(false);
        }
    }

    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f10363g.compareAndSet(false, true)) {
            this.f10364h.set(true);
            m13836f(true);
        }
    }
}
