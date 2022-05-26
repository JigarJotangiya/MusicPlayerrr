package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o53 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final Handler f20931a;

    /* renamed from: b */
    final /* synthetic */ b83 f20932b;

    public o53(b83 b83, Handler handler) {
        this.f20932b = b83;
        this.f20931a = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.f20931a.post(new o43(this, i));
    }
}
