package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.C2834b;
import com.google.ads.mediation.C2845f;
import com.google.android.gms.ads.mediation.C3062a;
import com.google.android.gms.ads.mediation.C3075f;
import com.google.android.gms.ads.mediation.customevent.C3065a;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class za0 extends bb0 {

    /* renamed from: g */
    private Map<Class<? extends Object>, Object> f26715g;

    /* renamed from: b0 */
    public final bd0 mo15736b0(String str) throws RemoteException {
        try {
            return new md0((RtbAdapter) Class.forName(str, false, fd0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    /* renamed from: f7 */
    public final void mo22352f7(Map<Class<? extends Object>, Object> map) {
        this.f26715g = map;
    }

    /* renamed from: p */
    public final fb0 mo15737p(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, za0.class.getClassLoader());
            if (C2834b.class.isAssignableFrom(cls)) {
                C2834b bVar = (C2834b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new gc0(bVar, (C2845f) this.f26715g.get(bVar.getAdditionalParametersType()));
            } else if (C3075f.class.isAssignableFrom(cls)) {
                return new bc0((C3075f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (C3062a.class.isAssignableFrom(cls)) {
                    return new bc0((C3062a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                ul0.m31862g(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            ul0.m31863h(sb2.toString(), th);
        }
        throw new RemoteException();
    }

    /* renamed from: q */
    public final boolean mo15738q(String str) throws RemoteException {
        try {
            return C3062a.class.isAssignableFrom(Class.forName(str, false, za0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            ul0.m31862g(sb.toString());
            return false;
        }
    }

    /* renamed from: v */
    public final boolean mo15739v(String str) throws RemoteException {
        try {
            return C3065a.class.isAssignableFrom(Class.forName(str, false, za0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            ul0.m31862g(sb.toString());
            return false;
        }
    }
}
