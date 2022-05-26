package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.ads.internal.util.i1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3006i1 {

    /* renamed from: a */
    private final BroadcastReceiver f10020a = new C3002h1(this);

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f10021b = new WeakHashMap();

    /* renamed from: c */
    private boolean f10022c = false;

    /* renamed from: d */
    private boolean f10023d;

    /* renamed from: e */
    private Context f10024e;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void m13365e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f10021b.entrySet()) {
            if (((IntentFilter) next.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) next.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
        }
    }

    /* renamed from: b */
    public final synchronized void mo11041b(Context context) {
        if (!this.f10022c) {
            Context applicationContext = context.getApplicationContext();
            this.f10024e = applicationContext;
            if (applicationContext == null) {
                this.f10024e = context;
            }
            C5503qz.m29790c(this.f10024e);
            this.f10023d = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22523g2)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f10024e.registerReceiver(this.f10020a, intentFilter);
            this.f10022c = true;
        }
    }

    /* renamed from: c */
    public final synchronized void mo11042c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f10023d) {
            this.f10021b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* renamed from: d */
    public final synchronized void mo11043d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f10023d) {
            this.f10021b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
