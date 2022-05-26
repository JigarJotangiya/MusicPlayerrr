package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zn3;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class ma3<KeyProtoT extends zn3> {

    /* renamed from: a */
    private final Class<KeyProtoT> f20005a;

    /* renamed from: b */
    private final Map<Class<?>, la3<?, KeyProtoT>> f20006b;

    /* renamed from: c */
    private final Class<?> f20007c;

    @SafeVarargs
    protected ma3(Class<KeyProtoT> cls, la3<?, KeyProtoT>... la3Arr) {
        String str;
        this.f20005a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            la3<?, KeyProtoT> la3 = la3Arr[i];
            if (hashMap.containsKey(la3.mo19113a())) {
                String valueOf = String.valueOf(la3.mo19113a().getCanonicalName());
                if (valueOf.length() != 0) {
                    str = "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf);
                } else {
                    str = new String("KeyTypeManager constructed with duplicate factories for primitive ");
                }
                throw new IllegalArgumentException(str);
            }
            hashMap.put(la3.mo19113a(), la3);
        }
        this.f20007c = la3Arr[0].mo19113a();
        this.f20006b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public ka3<?, KeyProtoT> mo16216a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract KeyProtoT mo16217b(kl3 kl3) throws bn3;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Class<?> mo19366c() {
        return this.f20007c;
    }

    /* renamed from: d */
    public final Class<KeyProtoT> mo19367d() {
        return this.f20005a;
    }

    /* renamed from: e */
    public final <P> P mo19368e(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        la3 la3 = this.f20006b.get(cls);
        if (la3 != null) {
            return la3.mo15750b(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public abstract String mo16218f();

    /* renamed from: g */
    public final Set<Class<?>> mo19369g() {
        return this.f20006b.keySet();
    }

    /* renamed from: h */
    public abstract void mo16219h(KeyProtoT keyprotot) throws GeneralSecurityException;

    /* renamed from: i */
    public int mo19370i() {
        return 1;
    }

    /* renamed from: j */
    public abstract int mo16220j();
}
