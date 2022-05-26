package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class va3<P> {

    /* renamed from: a */
    private final ConcurrentMap<ua3, List<sa3<P>>> f24665a = new ConcurrentHashMap();

    /* renamed from: b */
    private sa3<P> f24666b;

    /* renamed from: c */
    private final Class<P> f24667c;

    private va3(Class<P> cls) {
        this.f24667c = cls;
    }

    /* renamed from: c */
    public static <P> va3<P> m32253c(Class<P> cls) {
        return new va3<>(cls);
    }

    /* renamed from: a */
    public final sa3<P> mo21454a(P p, yh3 yh3) throws GeneralSecurityException {
        byte[] bArr;
        if (yh3.mo22200H() == 3) {
            int I = yh3.mo22201I() - 2;
            if (I != 1) {
                if (I != 2) {
                    if (I == 3) {
                        bArr = z93.f26713a;
                    } else if (I != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(yh3.mo22197D()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(yh3.mo22197D()).array();
            }
            sa3 sa3 = new sa3(p, bArr, yh3.mo22200H(), yh3.mo22201I(), yh3.mo22197D());
            ArrayList arrayList = new ArrayList();
            arrayList.add(sa3);
            ua3 ua3 = new ua3(sa3.mo20814b(), (ta3) null);
            List list = (List) this.f24665a.put(ua3, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(sa3);
                this.f24665a.put(ua3, Collections.unmodifiableList(arrayList2));
            }
            return sa3;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    /* renamed from: b */
    public final sa3<P> mo21455b() {
        return this.f24666b;
    }

    /* renamed from: d */
    public final Class<P> mo21456d() {
        return this.f24667c;
    }

    /* renamed from: e */
    public final void mo21457e(sa3<P> sa3) {
        if (sa3.mo20815c() == 3) {
            List list = (List) this.f24665a.get(new ua3(sa3.mo20814b(), (ta3) null));
            if (list == null) {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                this.f24666b = sa3;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        throw new IllegalArgumentException("the primary entry has to be ENABLED");
    }
}
