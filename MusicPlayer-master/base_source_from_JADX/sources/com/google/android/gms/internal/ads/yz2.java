package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yz2 {

    /* renamed from: g */
    private static final HashMap<String, Class<?>> f26600g = new HashMap<>();

    /* renamed from: a */
    private final Context f26601a;

    /* renamed from: b */
    private final zz2 f26602b;

    /* renamed from: c */
    private final dy2 f26603c;

    /* renamed from: d */
    private final yx2 f26604d;

    /* renamed from: e */
    private oz2 f26605e;

    /* renamed from: f */
    private final Object f26606f = new Object();

    public yz2(Context context, zz2 zz2, dy2 dy2, yx2 yx2) {
        this.f26601a = context;
        this.f26602b = zz2;
        this.f26603c = dy2;
        this.f26604d = yx2;
    }

    /* renamed from: d */
    private final synchronized Class<?> m34363d(pz2 pz2) throws xz2 {
        String M = pz2.mo20348a().mo19963M();
        HashMap<String, Class<?>> hashMap = f26600g;
        Class<?> cls = hashMap.get(M);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.f26604d.mo22306a(pz2.mo20350c())) {
                File b = pz2.mo20349b();
                if (!b.exists()) {
                    b.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(pz2.mo20350c().getAbsolutePath(), b.getAbsolutePath(), (String) null, this.f26601a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(M, loadClass);
                return loadClass;
            }
            throw new xz2(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e) {
            throw new xz2(2026, (Throwable) e);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new xz2(2008, e2);
        }
    }

    /* renamed from: a */
    public final gy2 mo22310a() {
        oz2 oz2;
        synchronized (this.f26606f) {
            oz2 = this.f26605e;
        }
        return oz2;
    }

    /* renamed from: b */
    public final pz2 mo22311b() {
        synchronized (this.f26606f) {
            oz2 oz2 = this.f26605e;
            if (oz2 == null) {
                return null;
            }
            pz2 f = oz2.mo20159f();
            return f;
        }
    }

    /* renamed from: c */
    public final boolean mo22312c(pz2 pz2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class<?> d = m34363d(pz2);
            oz2 oz2 = new oz2(d.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.f26601a, "msa-r", pz2.mo20352e(), null, new Bundle(), 2}), pz2, this.f26602b, this.f26603c);
            if (oz2.mo20161h()) {
                int e = oz2.mo20158e();
                if (e == 0) {
                    synchronized (this.f26606f) {
                        oz2 oz22 = this.f26605e;
                        if (oz22 != null) {
                            try {
                                oz22.mo20160g();
                            } catch (xz2 e2) {
                                this.f26603c.mo17048c(e2.zza(), -1, e2);
                            }
                        }
                        this.f26605e = oz2;
                    }
                    this.f26603c.mo17049d(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(e);
                throw new xz2(4001, sb.toString());
            }
            throw new xz2(4000, "init failed");
        } catch (Exception e3) {
            throw new xz2(2004, (Throwable) e3);
        } catch (xz2 e4) {
            this.f26603c.mo17048c(e4.zza(), System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.f26603c.mo17048c(4010, System.currentTimeMillis() - currentTimeMillis, e5);
            return false;
        }
    }
}
