package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0513c;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.l */
/* compiled from: TwilightManager */
class C0150l {

    /* renamed from: d */
    private static C0150l f511d;

    /* renamed from: a */
    private final Context f512a;

    /* renamed from: b */
    private final LocationManager f513b;

    /* renamed from: c */
    private final C0151a f514c = new C0151a();

    /* renamed from: androidx.appcompat.app.l$a */
    /* compiled from: TwilightManager */
    private static class C0151a {

        /* renamed from: a */
        boolean f515a;

        /* renamed from: b */
        long f516b;

        /* renamed from: c */
        long f517c;

        /* renamed from: d */
        long f518d;

        /* renamed from: e */
        long f519e;

        /* renamed from: f */
        long f520f;

        C0151a() {
        }
    }

    C0150l(Context context, LocationManager locationManager) {
        this.f512a = context;
        this.f513b = locationManager;
    }

    /* renamed from: a */
    static C0150l m827a(Context context) {
        if (f511d == null) {
            Context applicationContext = context.getApplicationContext();
            f511d = new C0150l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f511d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m828b() {
        Location location = null;
        Location c = C0513c.m3173b(this.f512a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m829c("network") : null;
        if (C0513c.m3173b(this.f512a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m829c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    /* renamed from: c */
    private Location m829c(String str) {
        try {
            if (this.f513b.isProviderEnabled(str)) {
                return this.f513b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m830e() {
        return this.f514c.f520f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m831f(Location location) {
        long j;
        C0151a aVar = this.f514c;
        long currentTimeMillis = System.currentTimeMillis();
        C0149k b = C0149k.m825b();
        C0149k kVar = b;
        kVar.mo686a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.f508a;
        kVar.mo686a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.f510c == 1;
        long j3 = b.f509b;
        long j4 = j2;
        long j5 = b.f508a;
        long j6 = j3;
        boolean z2 = z;
        b.mo686a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b.f509b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f515a = z2;
        aVar.f516b = j4;
        aVar.f517c = j6;
        aVar.f518d = j5;
        aVar.f519e = j7;
        aVar.f520f = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo687d() {
        C0151a aVar = this.f514c;
        if (m830e()) {
            return aVar.f515a;
        }
        Location b = m828b();
        if (b != null) {
            m831f(b);
            return aVar.f515a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
