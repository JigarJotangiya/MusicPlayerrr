package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qs2 implements q12 {

    /* renamed from: a */
    private Message f22017a;

    private qs2() {
    }

    /* synthetic */ qs2(pr2 pr2) {
    }

    /* renamed from: c */
    private final void m29677c() {
        this.f22017a = null;
        rt2.m30321h(this);
    }

    /* renamed from: a */
    public final qs2 mo20503a(Message message, rt2 rt2) {
        this.f22017a = message;
        return this;
    }

    /* renamed from: b */
    public final boolean mo20504b(Handler handler) {
        Message message = this.f22017a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        m29677c();
        return sendMessageAtFrontOfQueue;
    }

    public final void zza() {
        Message message = this.f22017a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        m29677c();
    }
}
