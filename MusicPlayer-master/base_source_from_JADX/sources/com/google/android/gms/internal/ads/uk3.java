package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.uk3;
import com.google.android.gms.internal.ads.vk3;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class uk3<MessageType extends vk3<MessageType, BuilderType>, BuilderType extends uk3<MessageType, BuilderType>> implements yn3 {
    /* renamed from: Y */
    public final /* bridge */ /* synthetic */ yn3 mo21301Y(zn3 zn3) {
        if (mo15911c().getClass().isInstance(zn3)) {
            mo19757i((vk3) zn3);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract BuilderType mo19757i(MessageType messagetype);
}
