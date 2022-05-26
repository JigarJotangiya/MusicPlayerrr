package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qo3 implements Iterator<hl3> {

    /* renamed from: g */
    private final ArrayDeque<so3> f21985g;

    /* renamed from: h */
    private hl3 f21986h;

    /* synthetic */ qo3(kl3 kl3, po3 po3) {
        if (kl3 instanceof so3) {
            so3 so3 = (so3) kl3;
            ArrayDeque<so3> arrayDeque = new ArrayDeque<>(so3.zzf());
            this.f21985g = arrayDeque;
            arrayDeque.push(so3);
            this.f21986h = m29643b(so3.zzd);
            return;
        }
        this.f21985g = null;
        this.f21986h = (hl3) kl3;
    }

    /* renamed from: b */
    private final hl3 m29643b(kl3 kl3) {
        while (kl3 instanceof so3) {
            so3 so3 = (so3) kl3;
            this.f21985g.push(so3);
            kl3 = so3.zzd;
        }
        return (hl3) kl3;
    }

    /* renamed from: a */
    public final hl3 next() {
        hl3 hl3;
        hl3 hl32 = this.f21986h;
        if (hl32 != null) {
            do {
                ArrayDeque<so3> arrayDeque = this.f21985g;
                hl3 = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.f21986h = hl3;
                } else {
                    hl3 = m29643b(this.f21985g.pop().zze);
                }
            } while (hl3.zzD());
            this.f21986h = hl3;
            return hl32;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f21986h != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
