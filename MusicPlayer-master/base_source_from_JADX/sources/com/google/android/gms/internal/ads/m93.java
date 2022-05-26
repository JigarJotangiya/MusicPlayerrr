package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class m93<V> implements Runnable {

    /* renamed from: g */
    p93<V> f19812g;

    m93(p93<V> p93) {
        this.f19812g = p93;
    }

    public final void run() {
        d93 F;
        String str;
        p93<V> p93 = this.f19812g;
        if (p93 != null && (F = p93.f21374n) != null) {
            this.f19812g = null;
            if (F.isDone()) {
                p93.mo18107y(F);
                return;
            }
            try {
                ScheduledFuture H = p93.f21375o;
                p93.f21375o = null;
                str = "Timed out";
                if (H != null) {
                    long abs = Math.abs(H.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append(str);
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                }
                String obj = F.toString();
                StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
                sb2.append(str);
                sb2.append(": ");
                sb2.append(obj);
                p93.mo18106x(new o93(sb2.toString(), (n93) null));
                F.cancel(true);
            } catch (Throwable th) {
                F.cancel(true);
                throw th;
            }
        }
    }
}
