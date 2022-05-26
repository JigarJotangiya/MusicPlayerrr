package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p001v4.app.C0001a;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.j */
/* compiled from: NotificationManagerCompat */
public final class C0492j {

    /* renamed from: c */
    private static final Object f2652c = new Object();

    /* renamed from: d */
    private static String f2653d;

    /* renamed from: e */
    private static Set<String> f2654e = new HashSet();

    /* renamed from: f */
    private static final Object f2655f = new Object();

    /* renamed from: g */
    private static C0496d f2656g;

    /* renamed from: a */
    private final Context f2657a;

    /* renamed from: b */
    private final NotificationManager f2658b;

    /* renamed from: androidx.core.app.j$b */
    /* compiled from: NotificationManagerCompat */
    private static class C0494b implements C0498e {

        /* renamed from: a */
        final String f2663a;

        /* renamed from: b */
        final int f2664b;

        /* renamed from: c */
        final String f2665c;

        /* renamed from: d */
        final Notification f2666d;

        C0494b(String str, int i, String str2, Notification notification) {
            this.f2663a = str;
            this.f2664b = i;
            this.f2665c = str2;
            this.f2666d = notification;
        }

        /* renamed from: a */
        public void mo3227a(C0001a aVar) throws RemoteException {
            aVar.mo3r6(this.f2663a, this.f2664b, this.f2665c, this.f2666d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f2663a + ", id:" + this.f2664b + ", tag:" + this.f2665c + "]";
        }
    }

    /* renamed from: androidx.core.app.j$c */
    /* compiled from: NotificationManagerCompat */
    private static class C0495c {

        /* renamed from: a */
        final ComponentName f2667a;

        /* renamed from: b */
        final IBinder f2668b;

        C0495c(ComponentName componentName, IBinder iBinder) {
            this.f2667a = componentName;
            this.f2668b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.j$d */
    /* compiled from: NotificationManagerCompat */
    private static class C0496d implements Handler.Callback, ServiceConnection {

        /* renamed from: g */
        private final Context f2669g;

        /* renamed from: h */
        private final HandlerThread f2670h;

        /* renamed from: i */
        private final Handler f2671i;

        /* renamed from: j */
        private final Map<ComponentName, C0497a> f2672j = new HashMap();

        /* renamed from: k */
        private Set<String> f2673k = new HashSet();

        /* renamed from: androidx.core.app.j$d$a */
        /* compiled from: NotificationManagerCompat */
        private static class C0497a {

            /* renamed from: a */
            final ComponentName f2674a;

            /* renamed from: b */
            boolean f2675b = false;

            /* renamed from: c */
            C0001a f2676c;

            /* renamed from: d */
            ArrayDeque<C0498e> f2677d = new ArrayDeque<>();

            /* renamed from: e */
            int f2678e = 0;

            C0497a(ComponentName componentName) {
                this.f2674a = componentName;
            }
        }

        C0496d(Context context) {
            this.f2669g = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f2670h = handlerThread;
            handlerThread.start();
            this.f2671i = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m3102a(C0497a aVar) {
            if (aVar.f2675b) {
                return true;
            }
            boolean bindService = this.f2669g.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f2674a), this, 33);
            aVar.f2675b = bindService;
            if (bindService) {
                aVar.f2678e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f2674a);
                this.f2669g.unbindService(this);
            }
            return aVar.f2675b;
        }

        /* renamed from: b */
        private void m3103b(C0497a aVar) {
            if (aVar.f2675b) {
                this.f2669g.unbindService(this);
                aVar.f2675b = false;
            }
            aVar.f2676c = null;
        }

        /* renamed from: c */
        private void m3104c(C0498e eVar) {
            m3110j();
            for (C0497a next : this.f2672j.values()) {
                next.f2677d.add(eVar);
                m3108g(next);
            }
        }

        /* renamed from: d */
        private void m3105d(ComponentName componentName) {
            C0497a aVar = this.f2672j.get(componentName);
            if (aVar != null) {
                m3108g(aVar);
            }
        }

        /* renamed from: e */
        private void m3106e(ComponentName componentName, IBinder iBinder) {
            C0497a aVar = this.f2672j.get(componentName);
            if (aVar != null) {
                aVar.f2676c = C0001a.C0002a.m6z(iBinder);
                aVar.f2678e = 0;
                m3108g(aVar);
            }
        }

        /* renamed from: f */
        private void m3107f(ComponentName componentName) {
            C0497a aVar = this.f2672j.get(componentName);
            if (aVar != null) {
                m3103b(aVar);
            }
        }

        /* renamed from: g */
        private void m3108g(C0497a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f2674a + ", " + aVar.f2677d.size() + " queued tasks");
            }
            if (!aVar.f2677d.isEmpty()) {
                if (!m3102a(aVar) || aVar.f2676c == null) {
                    m3109i(aVar);
                    return;
                }
                while (true) {
                    C0498e peek = aVar.f2677d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo3227a(aVar.f2676c);
                        aVar.f2677d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f2674a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f2674a, e);
                    }
                }
                if (!aVar.f2677d.isEmpty()) {
                    m3109i(aVar);
                }
            }
        }

        /* renamed from: i */
        private void m3109i(C0497a aVar) {
            if (!this.f2671i.hasMessages(3, aVar.f2674a)) {
                int i = aVar.f2678e + 1;
                aVar.f2678e = i;
                if (i > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f2677d.size() + " tasks to " + aVar.f2674a + " after " + aVar.f2678e + " retries");
                    aVar.f2677d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f2671i.sendMessageDelayed(this.f2671i.obtainMessage(3, aVar.f2674a), (long) i2);
            }
        }

        /* renamed from: j */
        private void m3110j() {
            Set<String> g = C0492j.m3090g(this.f2669g);
            if (!g.equals(this.f2673k)) {
                this.f2673k = g;
                List<ResolveInfo> queryIntentServices = this.f2669g.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (g.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f2672j.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f2672j.put(componentName2, new C0497a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C0497a>> it = this.f2672j.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        m3103b((C0497a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: h */
        public void mo3230h(C0498e eVar) {
            this.f2671i.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m3104c((C0498e) message.obj);
                return true;
            } else if (i == 1) {
                C0495c cVar = (C0495c) message.obj;
                m3106e(cVar.f2667a, cVar.f2668b);
                return true;
            } else if (i == 2) {
                m3107f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m3105d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f2671i.obtainMessage(1, new C0495c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f2671i.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: androidx.core.app.j$e */
    /* compiled from: NotificationManagerCompat */
    private interface C0498e {
        /* renamed from: a */
        void mo3227a(C0001a aVar) throws RemoteException;
    }

    private C0492j(Context context) {
        this.f2657a = context;
        this.f2658b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: f */
    public static C0492j m3089f(Context context) {
        return new C0492j(context);
    }

    /* renamed from: g */
    public static Set<String> m3090g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2652c) {
            if (string != null) {
                if (!string.equals(f2653d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f2654e = hashSet;
                    f2653d = string;
                }
            }
            set = f2654e;
        }
        return set;
    }

    /* renamed from: j */
    private void m3091j(C0498e eVar) {
        synchronized (f2655f) {
            if (f2656g == null) {
                f2656g = new C0496d(this.f2657a.getApplicationContext());
            }
            f2656g.mo3230h(eVar);
        }
    }

    /* renamed from: k */
    private static boolean m3092k(Notification notification) {
        Bundle a = C0482g.m3015a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    public boolean mo3220a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f2658b.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2657a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2657a.getApplicationInfo();
        String packageName = this.f2657a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void mo3221b(int i) {
        mo3222c((String) null, i);
    }

    /* renamed from: c */
    public void mo3222c(String str, int i) {
        this.f2658b.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            m3091j(new C0493a(this.f2657a.getPackageName(), i, str));
        }
    }

    /* renamed from: d */
    public void mo3223d() {
        this.f2658b.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            m3091j(new C0493a(this.f2657a.getPackageName()));
        }
    }

    /* renamed from: e */
    public void mo3224e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2658b.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: h */
    public void mo3225h(int i, Notification notification) {
        mo3226i((String) null, i, notification);
    }

    /* renamed from: i */
    public void mo3226i(String str, int i, Notification notification) {
        if (m3092k(notification)) {
            m3091j(new C0494b(this.f2657a.getPackageName(), i, str, notification));
            this.f2658b.cancel(str, i);
            return;
        }
        this.f2658b.notify(str, i, notification);
    }

    /* renamed from: androidx.core.app.j$a */
    /* compiled from: NotificationManagerCompat */
    private static class C0493a implements C0498e {

        /* renamed from: a */
        final String f2659a;

        /* renamed from: b */
        final int f2660b;

        /* renamed from: c */
        final String f2661c;

        /* renamed from: d */
        final boolean f2662d;

        C0493a(String str) {
            this.f2659a = str;
            this.f2660b = 0;
            this.f2661c = null;
            this.f2662d = true;
        }

        /* renamed from: a */
        public void mo3227a(C0001a aVar) throws RemoteException {
            if (this.f2662d) {
                aVar.mo2c2(this.f2659a);
            } else {
                aVar.mo1W3(this.f2659a, this.f2660b, this.f2661c);
            }
        }

        public String toString() {
            return "CancelTask[" + "packageName:" + this.f2659a + ", id:" + this.f2660b + ", tag:" + this.f2661c + ", all:" + this.f2662d + "]";
        }

        C0493a(String str, int i, String str2) {
            this.f2659a = str;
            this.f2660b = i;
            this.f2661c = str2;
            this.f2662d = false;
        }
    }
}
