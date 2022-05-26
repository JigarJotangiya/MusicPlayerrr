package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C1405l;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: androidx.work.impl.utils.j */
/* compiled from: WakeLocks */
public class C1372j {

    /* renamed from: a */
    private static final String f5384a = C1405l.m7462f("WakeLocks");

    /* renamed from: b */
    private static final WeakHashMap<PowerManager.WakeLock, String> f5385b = new WeakHashMap<>();

    /* renamed from: a */
    public static void m7390a() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f5385b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C1405l.m7460c().mo6820h(f5384a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
    }

    /* renamed from: b */
    public static PowerManager.WakeLock m7391b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f5385b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str2);
        }
        return newWakeLock;
    }
}
