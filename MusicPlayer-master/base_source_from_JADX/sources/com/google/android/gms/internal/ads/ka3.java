package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zn3;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class ka3<KeyFormatProtoT extends zn3, KeyT> {

    /* renamed from: a */
    private final Class<KeyFormatProtoT> f18847a;

    public ka3(Class<KeyFormatProtoT> cls) {
        this.f18847a = cls;
    }

    /* renamed from: a */
    public abstract KeyFormatProtoT mo15753a(kl3 kl3) throws bn3;

    /* renamed from: b */
    public final Class<KeyFormatProtoT> mo18876b() {
        return this.f18847a;
    }

    /* renamed from: c */
    public abstract KeyT mo15754c(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    /* renamed from: d */
    public Map<String, ja3<KeyFormatProtoT>> mo15755d() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    /* renamed from: e */
    public abstract void mo15756e(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
}
