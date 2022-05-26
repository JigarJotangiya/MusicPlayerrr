package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.C2971s;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mc2 implements sg2<nc2> {

    /* renamed from: a */
    private final e93 f20015a;

    /* renamed from: b */
    private final Context f20016b;

    public mc2(e93 e93, Context context) {
        this.f20015a = e93;
        this.f20016b = context;
    }

    /* renamed from: a */
    public final d93<nc2> mo15767a() {
        return this.f20015a.mo17138A0(new lc2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ nc2 mo19373b() throws Exception {
        AudioManager audioManager = (AudioManager) this.f20016b.getSystemService("audio");
        return new nc2(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), C2971s.m13216s().mo11029a(), C2971s.m13216s().mo11032e());
    }
}
