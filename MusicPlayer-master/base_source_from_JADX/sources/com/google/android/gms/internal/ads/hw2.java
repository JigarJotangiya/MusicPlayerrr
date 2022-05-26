package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hw2 extends ContentObserver {

    /* renamed from: a */
    private final Context f17774a;

    /* renamed from: b */
    private final AudioManager f17775b;

    /* renamed from: c */
    private float f17776c;

    /* renamed from: d */
    private final qw2 f17777d;

    public hw2(Handler handler, Context context, fw2 fw2, qw2 qw2, byte[] bArr) {
        super(handler);
        this.f17774a = context;
        this.f17775b = (AudioManager) context.getSystemService("audio");
        this.f17777d = qw2;
    }

    /* renamed from: c */
    private final float m24950c() {
        int streamVolume = this.f17775b.getStreamVolume(3);
        int streamMaxVolume = this.f17775b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: d */
    private final void m24951d() {
        this.f17777d.mo20518d(this.f17776c);
    }

    /* renamed from: a */
    public final void mo18219a() {
        this.f17776c = m24950c();
        m24951d();
        this.f17774a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo18220b() {
        this.f17774a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m24950c();
        if (c != this.f17776c) {
            this.f17776c = c;
            m24951d();
        }
    }
}
