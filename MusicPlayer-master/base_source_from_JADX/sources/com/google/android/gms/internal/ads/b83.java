package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b83 {

    /* renamed from: a */
    private final AudioManager f14369a;

    /* renamed from: b */
    private final o53 f14370b;

    /* renamed from: c */
    private p63 f14371c;

    /* renamed from: d */
    private int f14372d;

    /* renamed from: e */
    private float f14373e = 1.0f;

    public b83(Context context, Handler handler, p63 p63) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f14369a = audioManager;
        this.f14371c = p63;
        this.f14370b = new o53(this, handler);
        this.f14372d = 0;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m21180c(b83 b83, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                b83.m21183g(3);
                return;
            }
            b83.m21182f(0);
            b83.m21183g(2);
        } else if (i == -1) {
            b83.m21182f(-1);
            b83.m21181e();
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.w("AudioFocusManager", sb.toString());
        } else {
            b83.m21183g(1);
            b83.m21182f(1);
        }
    }

    /* renamed from: e */
    private final void m21181e() {
        if (this.f14372d != 0) {
            if (wy2.f25579a < 26) {
                this.f14369a.abandonAudioFocus(this.f14370b);
            }
            m21183g(0);
        }
    }

    /* renamed from: f */
    private final void m21182f(int i) {
        p63 p63 = this.f14371c;
        if (p63 != null) {
            ru3 ru3 = (ru3) p63;
            boolean O = ru3.f23211g.mo21375O();
            ru3.f23211g.m32022V(O, i, uu3.m32016P(O, i));
        }
    }

    /* renamed from: g */
    private final void m21183g(int i) {
        if (this.f14372d != i) {
            this.f14372d = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f14373e != f) {
                this.f14373e = f;
                p63 p63 = this.f14371c;
                if (p63 != null) {
                    ((ru3) p63).f23211g.m32020T();
                }
            }
        }
    }

    /* renamed from: a */
    public final float mo16148a() {
        return this.f14373e;
    }

    /* renamed from: b */
    public final int mo16149b(boolean z, int i) {
        m21181e();
        return z ? 1 : -1;
    }

    /* renamed from: d */
    public final void mo16150d() {
        this.f14371c = null;
        m21181e();
    }
}
