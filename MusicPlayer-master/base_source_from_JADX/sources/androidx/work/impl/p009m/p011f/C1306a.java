package androidx.work.impl.p009m.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.C1405l;
import androidx.work.impl.utils.p014p.C1397a;

/* renamed from: androidx.work.impl.m.f.a */
/* compiled from: BatteryChargingTracker */
public class C1306a extends C1308c<Boolean> {

    /* renamed from: i */
    private static final String f5265i = C1405l.m7462f("BatteryChrgTracker");

    public C1306a(Context context, C1397a aVar) {
        super(context, aVar);
    }

    /* renamed from: j */
    private boolean m7192j(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public IntentFilter mo6660g() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r6.equals("android.os.action.DISCHARGING") == false) goto L_0x0029;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6661h(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.work.l r7 = androidx.work.C1405l.m7460c()
            java.lang.String r0 = f5265i
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.mo6816a(r0, r2, r4)
            r6.hashCode()
            r7 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1886648615: goto L_0x004a;
                case -54942926: goto L_0x0041;
                case 948344062: goto L_0x0036;
                case 1019184907: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r1 = -1
            goto L_0x0054
        L_0x002b:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r1 = 3
            goto L_0x0054
        L_0x0036:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r1 = 2
            goto L_0x0054
        L_0x0041:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0054
            goto L_0x0029
        L_0x004a:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0053
            goto L_0x0029
        L_0x0053:
            r1 = 0
        L_0x0054:
            switch(r1) {
                case 0: goto L_0x006a;
                case 1: goto L_0x0064;
                case 2: goto L_0x005e;
                case 3: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x006f
        L_0x0058:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo6669d(r6)
            goto L_0x006f
        L_0x005e:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo6669d(r6)
            goto L_0x006f
        L_0x0064:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.mo6669d(r6)
            goto L_0x006f
        L_0x006a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.mo6669d(r6)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p009m.p011f.C1306a.mo6661h(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: i */
    public Boolean mo6659b() {
        Intent registerReceiver = this.f5272b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m7192j(registerReceiver));
        }
        C1405l.m7460c().mo6817b(f5265i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
