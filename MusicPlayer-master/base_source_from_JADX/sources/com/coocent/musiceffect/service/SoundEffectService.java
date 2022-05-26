package com.coocent.musiceffect.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p001v4.media.MediaBrowserCompat;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p159f.p166c.p201g.C4506a;
import p159f.p166c.p201g.p207o.C4564b;
import p159f.p166c.p201g.p208p.C4565a;
import p159f.p166c.p201g.p208p.C4566b;
import p159f.p166c.p201g.p208p.C4568c;
import p159f.p166c.p201g.p208p.C4572f;
import p159f.p166c.p209h.C4576b;
import p159f.p166c.p209h.C4578c;

public abstract class SoundEffectService extends MediaBrowserServiceCompat implements C4576b.C4577a, C4566b.C4567a, C4564b {

    /* renamed from: o */
    private C4578c f8669o;

    /* renamed from: p */
    protected C4566b f8670p;

    /* renamed from: q */
    protected int f8671q = 0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f8672r;

    /* renamed from: s */
    private boolean f8673s;

    /* renamed from: t */
    protected AudioManager f8674t;

    /* renamed from: u */
    private C2467c f8675u;

    /* renamed from: v */
    private BroadcastReceiver f8676v = new C2466b();

    /* renamed from: com.coocent.musiceffect.service.SoundEffectService$a */
    class C2465a implements Runnable {
        C2465a() {
        }

        public void run() {
            C4566b bVar = SoundEffectService.this.f8670p;
            if (bVar != null) {
                bVar.mo15307n();
                SoundEffectService.this.f8670p.mo15300c();
                if (!SoundEffectService.this.f8672r) {
                    SoundEffectService.this.f8670p.mo15313t(C4565a.m19902a().f13259b);
                    SoundEffectService.this.f8670p.mo15309p(C4565a.m19902a().f13260c);
                    SoundEffectService.this.f8670p.mo15318y(C4565a.m19902a().f13261d);
                } else if (C4565a.m19902a().f13259b) {
                    SoundEffectService.this.f8670p.mo15313t(true);
                    SoundEffectService.this.f8670p.mo15309p(true);
                    SoundEffectService.this.f8670p.mo15318y(true);
                }
            }
            SoundEffectService.this.mo9549m0();
            SoundEffectService.this.sendBroadcast(new Intent(C4506a.m19727a(SoundEffectService.this)));
        }
    }

    /* renamed from: com.coocent.musiceffect.service.SoundEffectService$b */
    class C2466b extends BroadcastReceiver {
        C2466b() {
        }

        public void onReceive(Context context, Intent intent) {
            AudioManager audioManager;
            String action = intent.getAction();
            if ("com.kuxun.equalizer.or.musicplayer.vb.status".equals(action)) {
                if (intent.getBooleanExtra("isOpenVb", false)) {
                    C4565a.m19902a().mo15296g(context, false);
                    SoundEffectService.this.mo9548m(false);
                    SoundEffectService.this.mo9542i0(false);
                }
                SoundEffectService.this.mo9539f0();
            } else if ("android.media.VOLUME_CHANGED_ACTION".equals(action) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (audioManager = SoundEffectService.this.f8674t) != null && audioManager.getStreamVolume(3) == 0) {
                SoundEffectService.this.mo9556t(0);
                C4568c.m19959r(context, 0);
                SoundEffectService.this.sendBroadcast(new Intent(C4506a.m19740n(context)));
            }
        }
    }

    /* renamed from: com.coocent.musiceffect.service.SoundEffectService$c */
    private static class C2467c extends Handler {

        /* renamed from: a */
        private WeakReference f8679a;

        public C2467c(SoundEffectService soundEffectService) {
            super(Looper.getMainLooper());
            this.f8679a = new WeakReference(soundEffectService);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (((SoundEffectService) this.f8679a.get()) == null) {
            }
        }
    }

    /* renamed from: e0 */
    private void m11555e0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.kuxun.equalizer.or.musicplayer.vb.status");
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        registerReceiver(this.f8676v, intentFilter);
    }

    /* renamed from: B */
    public void mo9531B(boolean z, int i) {
        Log.d("xxx", "openMasterAudioEffect: " + z + " " + i);
        if (i == -1) {
            if (this.f8672r) {
                mo9547l0(z);
            } else {
                mo9545k0(z);
            }
        } else if (i == -3) {
            mo9534a0();
        } else if (i == -2) {
            mo9549m0();
        }
    }

    /* renamed from: C */
    public void mo9532C(boolean z) {
        if (z) {
            mo9535b0();
        }
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            bVar.mo15318y(z);
        }
    }

    /* renamed from: L */
    public MediaBrowserServiceCompat.C0733e mo4310L(String str, int i, Bundle bundle) {
        return new MediaBrowserServiceCompat.C0733e("root", (Bundle) null);
    }

    /* renamed from: M */
    public void mo4311M(String str, MediaBrowserServiceCompat.C0750m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.mo4355f(new ArrayList());
    }

    /* renamed from: Z */
    public void mo9533Z(MediaPlayer mediaPlayer, int i) {
        if (mediaPlayer != null) {
            mediaPlayer.attachAuxEffect(i);
            mediaPlayer.setAuxEffectSendLevel(1.0f);
        }
    }

    /* renamed from: a0 */
    public void mo9534a0() {
        new Thread(new C2465a()).start();
    }

    /* renamed from: b0 */
    public void mo9535b0() {
        C4566b bVar;
        if (this.f8673s && C4565a.m19902a().f13264g >= 0) {
            if (C4565a.m19902a().f13263f && (bVar = this.f8670p) != null) {
                bVar.mo15313t(false);
                this.f8670p.mo15309p(false);
                this.f8670p.mo15318y(false);
            }
            C4565a.m19902a().mo15297h(this, false);
            C4565a.m19902a().mo15298i(this, -1);
            mo9541h0(false);
        }
    }

    /* renamed from: c0 */
    public void mo9536c0(boolean z, boolean z2) {
        this.f8672r = z;
        this.f8673s = z2;
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            if (!z) {
                bVar.mo15313t(C4565a.m19902a().f13259b);
                this.f8670p.mo15309p(C4565a.m19902a().f13260c);
                this.f8670p.mo15318y(C4565a.m19902a().f13261d);
                this.f8670p.mo15316w(true);
            } else if (C4565a.m19902a().f13259b) {
                this.f8670p.mo15313t(true);
                this.f8670p.mo15309p(true);
                this.f8670p.mo15318y(true);
                this.f8670p.mo15316w(true);
            }
        }
        mo9549m0();
    }

    /* renamed from: d */
    public void mo9537d(int i, int i2) {
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            bVar.mo15312s(i, i2);
        }
    }

    /* renamed from: d0 */
    public void mo9538d0(boolean z) {
        if (this.f8670p != null) {
            if (z) {
                if (this.f8674t.getStreamVolume(3) == this.f8674t.getStreamMaxVolume(3)) {
                    this.f8671q = C4568c.m19946e(this);
                } else {
                    this.f8671q = 0;
                }
                this.f8670p.mo15301d(this.f8671q);
            } else {
                this.f8671q = C4568c.m19946e(this);
                if (C4565a.m19902a().f13262e) {
                    this.f8670p.mo15301d(this.f8671q);
                } else {
                    this.f8670p.mo15301d(-1);
                }
            }
            this.f8670p.mo15315v(true);
        }
        sendBroadcast(new Intent("ask.com.kuxun.equalizer.vb.status"));
    }

    /* renamed from: f0 */
    public abstract void mo9539f0();

    /* renamed from: g0 */
    public void mo9540g0(boolean z) {
        Intent intent = new Intent(C4506a.m19739m(this));
        intent.putExtra("enable", z);
        sendBroadcast(intent);
    }

    /* renamed from: h0 */
    public void mo9541h0(boolean z) {
        Intent intent = new Intent(C4506a.m19741o(this));
        intent.putExtra("enable", z);
        sendBroadcast(intent);
    }

    /* renamed from: i0 */
    public void mo9542i0(boolean z) {
        Intent intent = new Intent(C4506a.m19742p(this));
        intent.putExtra("enable", z);
        sendBroadcast(intent);
    }

    /* renamed from: j */
    public void mo9543j(boolean z) {
        if (z) {
            mo9535b0();
        }
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            bVar.mo15309p(z);
        }
    }

    /* renamed from: j0 */
    public void mo9544j0(boolean z, int i) {
        C4578c cVar = this.f8669o;
        if (cVar != null) {
            cVar.mo15328l(z, i);
        } else {
            mo9531B(z, i);
        }
    }

    /* renamed from: k0 */
    public void mo9545k0(boolean z) {
        if (z) {
            mo9535b0();
        }
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            bVar.mo15313t(z);
        }
    }

    /* renamed from: l */
    public void mo9546l() {
        mo9544j0(C4565a.m19902a().f13263f, -2);
    }

    /* renamed from: l0 */
    public void mo9547l0(boolean z) {
        if (z) {
            mo9535b0();
        }
        C4566b bVar = this.f8670p;
        if (bVar == null) {
            return;
        }
        if (z) {
            bVar.mo15313t(true);
            this.f8670p.mo15309p(true);
            this.f8670p.mo15318y(true);
            this.f8670p.mo15316w(true);
            return;
        }
        bVar.mo15307n();
        this.f8670p.mo15316w(false);
    }

    /* renamed from: m */
    public boolean mo9548m(boolean z) {
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            if (z) {
                sendBroadcast(new Intent("com.kuxun.equalizer.or.musicplayer.close.vb.service"));
                this.f8670p.mo15301d(this.f8671q);
                return this.f8670p.mo15315v(true);
            }
            bVar.mo15315v(false);
        }
        return false;
    }

    /* renamed from: m0 */
    public void mo9549m0() {
        if (this.f8673s) {
            boolean z = C4565a.m19902a().f13263f;
            int i = C4565a.m19902a().f13264g;
            if (i >= 0) {
                C4565a.m19902a().mo15294e(this, false);
                C4565a.m19902a().mo15293d(this, false);
                C4565a.m19902a().mo15299j(this, false);
                mo9541h0(z);
                C4566b bVar = this.f8670p;
                if (bVar != null) {
                    bVar.mo15313t(false);
                    this.f8670p.mo15309p(false);
                    this.f8670p.mo15318y(false);
                    if (z) {
                        this.f8670p.mo15304k(i);
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public void mo9550n() {
        Log.d("xxx", "releaseMasterAudioEffect: ");
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            bVar.mo15306m();
        }
        C4565a.m19902a().mo15294e(this, false);
        C4565a.m19902a().mo15293d(this, false);
        C4565a.m19902a().mo15299j(this, false);
        C4565a.m19902a().mo15297h(this, false);
        mo9540g0(false);
        mo9541h0(false);
        mo9539f0();
    }

    /* renamed from: o */
    public boolean mo9551o() {
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            return bVar.mo15302h();
        }
        return false;
    }

    public void onCreate() {
        super.onCreate();
        C4572f.m19975b().mo15325d(this);
        this.f8669o = new C4578c(this, this);
        this.f8670p = new C4566b(this, this);
        this.f8674t = (AudioManager) getSystemService("audio");
        this.f8675u = new C2467c(this);
        m11555e0();
    }

    public void onDestroy() {
        super.onDestroy();
        C4578c cVar = this.f8669o;
        if (cVar != null) {
            cVar.mo15326j();
            this.f8669o = null;
        }
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            bVar.mo15306m();
            this.f8670p.mo15308o();
        }
        C4572f.m19974a();
        try {
            unregisterReceiver(this.f8676v);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C2467c cVar2 = this.f8675u;
        if (cVar2 != null) {
            cVar2.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: p */
    public void mo9553p(int[] iArr) {
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            bVar.mo15314u(iArr);
        }
    }

    /* renamed from: r */
    public void mo9554r(boolean z) {
        mo9544j0(z, -1);
    }

    /* renamed from: s */
    public void mo9555s(int i) {
        this.f8671q = i;
        C4566b bVar = this.f8670p;
        if (bVar == null) {
            return;
        }
        if (bVar.mo15302h() || i <= 0) {
            this.f8670p.mo15311r(i);
        } else {
            mo9548m(true);
        }
    }

    /* renamed from: t */
    public void mo9556t(int i) {
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            bVar.mo15317x(i);
        }
    }

    /* renamed from: x */
    public void mo9557x() {
        mo9544j0(true, -3);
    }

    /* renamed from: y */
    public void mo9558y(int i) {
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            bVar.mo15310q(i);
        }
    }

    /* renamed from: z */
    public void mo9559z(int i) {
        C4566b bVar = this.f8670p;
        if (bVar != null) {
            bVar.mo15319z(i);
        }
    }
}
