package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3268d1;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.p078l.C3334c;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.stats.a */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3352a {

    /* renamed from: b */
    private static final Object f10761b = new Object();

    /* renamed from: c */
    private static volatile C3352a f10762c;
    @RecentlyNonNull

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f10763a = new ConcurrentHashMap<>();

    private C3352a() {
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C3352a m14414b() {
        if (f10762c == null) {
            synchronized (f10761b) {
                if (f10762c == null) {
                    f10762c = new C3352a();
                }
            }
        }
        C3352a aVar = f10762c;
        C3292l.m14240h(aVar);
        return aVar;
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: e */
    private final boolean m14415e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C3334c.m14368a(context).mo11910c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m14416f(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection putIfAbsent = this.f10763a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            this.f10763a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: f */
    private static boolean m14416f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof C3268d1);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: g */
    private static void m14417g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: a */
    public boolean mo11980a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        return m14415e(context, context.getClass().getName(), intent, serviceConnection, i, true);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: c */
    public void mo11981c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!m14416f(serviceConnection) || !this.f10763a.containsKey(serviceConnection)) {
            m14417g(context, serviceConnection);
            return;
        }
        try {
            m14417g(context, this.f10763a.get(serviceConnection));
        } finally {
            this.f10763a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo11982d(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        return m14415e(context, str, intent, serviceConnection, i, true);
    }
}
