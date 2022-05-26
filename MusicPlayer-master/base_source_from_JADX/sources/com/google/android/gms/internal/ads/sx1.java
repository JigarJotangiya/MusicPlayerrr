package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sx1 implements o83<np2> {

    /* renamed from: a */
    final /* synthetic */ tx1 f23647a;

    sx1(tx1 tx1) {
        this.f23647a = tx1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        np2 np2 = (np2) obj;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22469Z3)).booleanValue()) {
            this.f23647a.f24055e.mo16003g(np2.f20683b.f20121b.f16053e);
            this.f23647a.f24055e.mo16004h(np2.f20683b.f20121b.f16054f);
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22469Z3)).booleanValue()) {
            Matcher matcher = tx1.f24050f.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f23647a.f24055e.mo16003g(Integer.parseInt(matcher.group(1)));
            }
        }
    }
}
