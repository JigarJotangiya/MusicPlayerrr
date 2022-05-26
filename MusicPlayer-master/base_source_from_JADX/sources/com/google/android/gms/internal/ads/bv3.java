package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bv3 {

    /* renamed from: a */
    private final Context f14711a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f14712b;

    /* renamed from: c */
    private final wu3 f14713c;

    /* renamed from: d */
    private final AudioManager f14714d;

    /* renamed from: e */
    private zu3 f14715e;

    /* renamed from: f */
    private int f14716f = 3;

    /* renamed from: g */
    private int f14717g;

    /* renamed from: h */
    private boolean f14718h;

    public bv3(Context context, Handler handler, wu3 wu3) {
        Context applicationContext = context.getApplicationContext();
        this.f14711a = applicationContext;
        this.f14712b = handler;
        this.f14713c = wu3;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        gs1.m24484b(audioManager);
        this.f14714d = audioManager;
        this.f14717g = m21559g(audioManager, 3);
        this.f14718h = m21561i(audioManager, this.f14716f);
        zu3 zu3 = new zu3(this, (yu3) null);
        try {
            applicationContext.registerReceiver(zu3, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f14715e = zu3;
        } catch (RuntimeException e) {
            y92.m34068b("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: g */
    private static int m21559g(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            y92.m34068b("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m21560h() {
        int g = m21559g(this.f14714d, this.f14716f);
        boolean i = m21561i(this.f14714d, this.f14716f);
        if (this.f14717g != g || this.f14718h != i) {
            this.f14717g = g;
            this.f14718h = i;
            Iterator it = ((ru3) this.f14713c).f23211g.f24454h.iterator();
            while (it.hasNext()) {
                ((w60) it.next()).mo17408e(g, i);
            }
        }
    }

    /* renamed from: i */
    private static boolean m21561i(AudioManager audioManager, int i) {
        if (wy2.f25579a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m21559g(audioManager, i) == 0;
    }

    /* renamed from: a */
    public final int mo16411a() {
        return this.f14714d.getStreamMaxVolume(this.f14716f);
    }

    /* renamed from: b */
    public final int mo16412b() {
        if (wy2.f25579a >= 28) {
            return this.f14714d.getStreamMinVolume(this.f14716f);
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo16413e() {
        zu3 zu3 = this.f14715e;
        if (zu3 != null) {
            try {
                this.f14711a.unregisterReceiver(zu3);
            } catch (RuntimeException e) {
                y92.m34068b("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f14715e = null;
        }
    }

    /* renamed from: f */
    public final void mo16414f(int i) {
        if (this.f14716f != 3) {
            this.f14716f = 3;
            m21560h();
            ru3 ru3 = (ru3) this.f14713c;
            e04 d0 = uu3.m32017Q(ru3.f23211g.f24457k);
            if (!d0.equals(ru3.f23211g.f24446C)) {
                ru3.f23211g.f24446C = d0;
                Iterator it = ru3.f23211g.f24454h.iterator();
                while (it.hasNext()) {
                    ((w60) it.next()).mo17429z(d0);
                }
            }
        }
    }
}
