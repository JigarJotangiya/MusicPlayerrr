package androidx.work.impl.p009m.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C1405l;
import androidx.work.impl.utils.p014p.C1397a;

/* renamed from: androidx.work.impl.m.f.c */
/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class C1308c<T> extends C1310d<T> {

    /* renamed from: h */
    private static final String f5267h = C1405l.m7462f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    private final BroadcastReceiver f5268g = new C1309a();

    /* renamed from: androidx.work.impl.m.f.c$a */
    /* compiled from: BroadcastReceiverConstraintTracker */
    class C1309a extends BroadcastReceiver {
        C1309a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C1308c.this.mo6661h(context, intent);
            }
        }
    }

    public C1308c(Context context, C1397a aVar) {
        super(context, aVar);
    }

    /* renamed from: e */
    public void mo6664e() {
        C1405l.m7460c().mo6816a(f5267h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f5272b.registerReceiver(this.f5268g, mo6660g());
    }

    /* renamed from: f */
    public void mo6665f() {
        C1405l.m7460c().mo6816a(f5267h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f5272b.unregisterReceiver(this.f5268g);
    }

    /* renamed from: g */
    public abstract IntentFilter mo6660g();

    /* renamed from: h */
    public abstract void mo6661h(Context context, Intent intent);
}
