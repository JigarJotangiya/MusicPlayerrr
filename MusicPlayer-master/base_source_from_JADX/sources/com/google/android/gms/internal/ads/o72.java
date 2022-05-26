package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o72 implements p91 {

    /* renamed from: a */
    boolean f20942a = false;

    /* renamed from: b */
    final /* synthetic */ n22 f20943b;

    /* renamed from: c */
    final /* synthetic */ mm0 f20944c;

    o72(p72 p72, n22 n22, mm0 mm0) {
        this.f20943b = n22;
        this.f20944c = mm0;
    }

    /* renamed from: a */
    private final void m28313a(zzbew zzbew) {
        int i = 1;
        if (true == ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22612r3)).booleanValue()) {
            i = 3;
        }
        this.f20944c.mo19451e(new o22(i, zzbew));
    }

    /* renamed from: c */
    public final void mo19912c(int i) {
        if (!this.f20942a) {
            m28313a(new zzbew(i, p72.m28920e(this.f20943b.f20466a, i), "undefined", (zzbew) null, (IBinder) null));
        }
    }

    /* renamed from: d */
    public final synchronized void mo19913d(int i, String str) {
        if (!this.f20942a) {
            this.f20942a = true;
            if (str == null) {
                str = p72.m28920e(this.f20943b.f20466a, i);
            }
            m28313a(new zzbew(i, str, "undefined", (zzbew) null, (IBinder) null));
        }
    }

    /* renamed from: f */
    public final synchronized void mo19914f() {
        this.f20944c.mo19449c(null);
    }

    /* renamed from: w0 */
    public final synchronized void mo19915w0(zzbew zzbew) {
        this.f20942a = true;
        m28313a(zzbew);
    }
}
