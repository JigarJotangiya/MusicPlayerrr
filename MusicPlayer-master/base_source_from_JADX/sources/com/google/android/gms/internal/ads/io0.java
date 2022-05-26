package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class io0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f18125a;

    /* renamed from: b */
    private final ho0 f18126b;

    /* renamed from: c */
    private boolean f18127c;

    /* renamed from: d */
    private boolean f18128d;

    /* renamed from: e */
    private boolean f18129e;

    /* renamed from: f */
    private float f18130f = 1.0f;

    public io0(Context context, ho0 ho0) {
        this.f18125a = (AudioManager) context.getSystemService("audio");
        this.f18126b = ho0;
    }

    /* renamed from: f */
    private final void m25327f() {
        boolean z = false;
        if (!this.f18128d || this.f18129e || this.f18130f <= 0.0f) {
            if (this.f18127c) {
                AudioManager audioManager = this.f18125a;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.f18127c = z;
                }
                this.f18126b.mo18178k();
            }
        } else if (!this.f18127c) {
            AudioManager audioManager2 = this.f18125a;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.f18127c = z;
            }
            this.f18126b.mo18178k();
        }
    }

    /* renamed from: a */
    public final float mo18449a() {
        float f = this.f18129e ? 0.0f : this.f18130f;
        if (this.f18127c) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo18450b() {
        this.f18128d = true;
        m25327f();
    }

    /* renamed from: c */
    public final void mo18451c() {
        this.f18128d = false;
        m25327f();
    }

    /* renamed from: d */
    public final void mo18452d(boolean z) {
        this.f18129e = z;
        m25327f();
    }

    /* renamed from: e */
    public final void mo18453e(float f) {
        this.f18130f = f;
        m25327f();
    }

    public final void onAudioFocusChange(int i) {
        this.f18127c = i > 0;
        this.f18126b.mo18178k();
    }
}
