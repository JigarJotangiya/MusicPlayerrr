package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fb3 {

    /* renamed from: a */
    private static final Logger f16505a = Logger.getLogger(fb3.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, db3> f16506b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, cb3> f16507c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, Boolean> f16508d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<String, y93<?>> f16509e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap<Class<?>, wa3<?, ?>> f16510f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final ConcurrentMap<String, ha3> f16511g = new ConcurrentHashMap();

    private fb3() {
    }

    @Deprecated
    /* renamed from: a */
    public static y93<?> m23598a(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap<String, y93<?>> concurrentMap = f16509e;
            Locale locale = Locale.US;
            y93<?> y93 = (y93) concurrentMap.get(str.toLowerCase(locale));
            if (y93 != null) {
                return y93;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(locale).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: b */
    public static ea3<?> m23599b(String str) throws GeneralSecurityException {
        return m23613p(str).mo15743a();
    }

    /* renamed from: c */
    public static synchronized oh3 m23600c(rh3 rh3) throws GeneralSecurityException {
        oh3 f;
        synchronized (fb3.class) {
            ea3<?> b = m23599b(rh3.mo20662H());
            if (((Boolean) f16508d.get(rh3.mo20662H())).booleanValue()) {
                f = b.mo17147f(rh3.mo20661G());
            } else {
                String valueOf = String.valueOf(rh3.mo20662H());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return f;
    }

    /* renamed from: d */
    public static synchronized zn3 m23601d(rh3 rh3) throws GeneralSecurityException {
        zn3 e;
        synchronized (fb3.class) {
            ea3<?> b = m23599b(rh3.mo20662H());
            if (((Boolean) f16508d.get(rh3.mo20662H())).booleanValue()) {
                e = b.mo17146e(rh3.mo20661G());
            } else {
                String valueOf = String.valueOf(rh3.mo20662H());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return e;
    }

    /* renamed from: e */
    public static Class<?> m23602e(Class<?> cls) {
        wa3 wa3 = (wa3) f16510f.get(cls);
        if (wa3 == null) {
            return null;
        }
        return wa3.zza();
    }

    /* renamed from: f */
    public static <P> P m23603f(oh3 oh3, Class<P> cls) throws GeneralSecurityException {
        return m23614q(oh3.mo19999H(), oh3.mo19998G(), cls);
    }

    /* renamed from: g */
    public static <P> P m23604g(String str, zn3 zn3, Class<P> cls) throws GeneralSecurityException {
        return m23612o(str, cls).mo17142a(zn3);
    }

    /* renamed from: h */
    public static <P> P m23605h(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return m23614q(str, kl3.zzv(bArr), cls);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.va3<B>, com.google.android.gms.internal.ads.va3] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <B, P> P m23606i(com.google.android.gms.internal.ads.va3<B> r4, java.lang.Class<P> r5) throws java.security.GeneralSecurityException {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.ads.wa3<?, ?>> r0 = f16510f
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.internal.ads.wa3 r5 = (com.google.android.gms.internal.ads.wa3) r5
            if (r5 != 0) goto L_0x002e
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.Class r4 = r4.mo21456d()
            java.lang.String r4 = r4.getName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "No wrapper found for "
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0025
            java.lang.String r4 = r0.concat(r4)
            goto L_0x002a
        L_0x0025:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x002a:
            r5.<init>(r4)
            throw r5
        L_0x002e:
            java.lang.Class r0 = r5.zza()
            java.lang.Class r1 = r4.mo21456d()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0041
            java.lang.Object r4 = r5.mo17899b(r4)
            return r4
        L_0x0041:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Class r5 = r5.zza()
            java.lang.String r5 = r5.toString()
            java.lang.Class r4 = r4.mo21456d()
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r5.length()
            int r2 = r2 + 44
            int r3 = r4.length()
            int r2 = r2 + r3
            r1.<init>(r2)
            java.lang.String r2 = "Wrong input primitive class, expected "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ", got "
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fb3.m23606i(com.google.android.gms.internal.ads.va3, java.lang.Class):java.lang.Object");
    }

    /* renamed from: j */
    static synchronized Map<String, ha3> m23607j() {
        Map<String, ha3> unmodifiableMap;
        synchronized (fb3.class) {
            unmodifiableMap = Collections.unmodifiableMap(f16511g);
        }
        return unmodifiableMap;
    }

    /* renamed from: k */
    public static synchronized <KeyProtoT extends zn3, PublicKeyProtoT extends zn3> void m23608k(ya3<KeyProtoT, PublicKeyProtoT> ya3, ma3<PublicKeyProtoT> ma3, boolean z) throws GeneralSecurityException {
        Class<?> f;
        synchronized (fb3.class) {
            m23615r("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ya3.getClass(), ya3.mo16216a().mo15755d(), true);
            m23615r("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", ma3.getClass(), Collections.emptyMap(), false);
            if (!rc3.m30058a(1)) {
                String valueOf = String.valueOf(ya3.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            } else if (rc3.m30058a(1)) {
                ConcurrentMap<String, db3> concurrentMap = f16506b;
                if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (f = ((db3) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).mo15746f()) != null) {
                    if (!f.getName().equals(ma3.getClass().getName())) {
                        f16505a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{ya3.getClass().getName(), f.getName(), ma3.getClass().getName()}));
                    }
                }
                if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || ((db3) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).mo15746f() == null) {
                    concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new bb3(ya3, ma3));
                    f16507c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new cb3(ya3));
                    m23616s("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ya3.mo16216a().mo15755d());
                }
                ConcurrentMap<String, Boolean> concurrentMap2 = f16508d;
                concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
                if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new ab3(ma3));
                }
                concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
            } else {
                String valueOf2 = String.valueOf(ma3.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 61);
                sb2.append("failed to register key manager ");
                sb2.append(valueOf2);
                sb2.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
    }

    /* renamed from: l */
    public static synchronized <P> void m23609l(ea3<P> ea3, boolean z) throws GeneralSecurityException {
        synchronized (fb3.class) {
            if (ea3 != null) {
                String c = ea3.mo17144c();
                m23615r(c, ea3.getClass(), Collections.emptyMap(), z);
                f16506b.putIfAbsent(c, new za3(ea3));
                f16508d.put(c, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: m */
    public static synchronized <KeyProtoT extends zn3> void m23610m(ma3<KeyProtoT> ma3, boolean z) throws GeneralSecurityException {
        synchronized (fb3.class) {
            String f = ma3.mo16218f();
            m23615r(f, ma3.getClass(), ma3.mo16216a().mo15755d(), true);
            if (rc3.m30058a(ma3.mo19370i())) {
                ConcurrentMap<String, db3> concurrentMap = f16506b;
                if (!concurrentMap.containsKey(f)) {
                    concurrentMap.put(f, new ab3(ma3));
                    f16507c.put(f, new cb3(ma3));
                    m23616s(f, ma3.mo16216a().mo15755d());
                }
                f16508d.put(f, Boolean.TRUE);
            } else {
                String valueOf = String.valueOf(ma3.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
        }
    }

    /* renamed from: n */
    public static synchronized <B, P> void m23611n(wa3<B, P> wa3) throws GeneralSecurityException {
        synchronized (fb3.class) {
            if (wa3 != null) {
                Class<P> a = wa3.mo17898a();
                ConcurrentMap<Class<?>, wa3<?, ?>> concurrentMap = f16510f;
                if (concurrentMap.containsKey(a)) {
                    wa3 wa32 = (wa3) concurrentMap.get(a);
                    if (!wa3.getClass().getName().equals(wa32.getClass().getName())) {
                        f16505a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(a.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{a.getName(), wa32.getClass().getName(), wa3.getClass().getName()}));
                    }
                }
                concurrentMap.put(a, wa3);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: o */
    private static <P> ea3<P> m23612o(String str, Class<P> cls) throws GeneralSecurityException {
        db3 p = m23613p(str);
        if (p.zze().contains(cls)) {
            return p.mo15745c(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(p.mo15744b());
        Set<Class<?>> zze = p.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : zze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + sb2.length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    /* renamed from: p */
    private static synchronized db3 m23613p(String str) throws GeneralSecurityException {
        db3 db3;
        String str2;
        synchronized (fb3.class) {
            ConcurrentMap<String, db3> concurrentMap = f16506b;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "No key manager found for key type ".concat(valueOf);
                } else {
                    str2 = new String("No key manager found for key type ");
                }
                throw new GeneralSecurityException(str2);
            }
            db3 = (db3) concurrentMap.get(str);
        }
        return db3;
    }

    /* renamed from: q */
    private static <P> P m23614q(String str, kl3 kl3, Class<P> cls) throws GeneralSecurityException {
        return m23612o(str, cls).mo17145d(kl3);
    }

    /* renamed from: r */
    private static synchronized <KeyProtoT extends zn3, KeyFormatProtoT extends zn3> void m23615r(String str, Class cls, Map<String, ja3<KeyFormatProtoT>> map, boolean z) throws GeneralSecurityException {
        String str2;
        String str3;
        String str4;
        synchronized (fb3.class) {
            ConcurrentMap<String, db3> concurrentMap = f16506b;
            db3 db3 = (db3) concurrentMap.get(str);
            if (db3 != null && !db3.mo15744b().equals(cls)) {
                Logger logger = f16505a;
                Level level = Level.WARNING;
                if (str.length() != 0) {
                    str4 = "Attempted overwrite of a registered key manager for key type ".concat(str);
                } else {
                    str4 = new String("Attempted overwrite of a registered key manager for key type ");
                }
                logger.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str4);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, db3.mo15744b().getName(), cls.getName()}));
            } else if (z) {
                ConcurrentMap<String, Boolean> concurrentMap2 = f16508d;
                if (concurrentMap2.containsKey(str) && !((Boolean) concurrentMap2.get(str)).booleanValue()) {
                    if (str.length() != 0) {
                        str3 = "New keys are already disallowed for key type ".concat(str);
                    } else {
                        str3 = new String("New keys are already disallowed for key type ");
                    }
                    throw new GeneralSecurityException(str3);
                } else if (concurrentMap.containsKey(str)) {
                    for (Map.Entry next : map.entrySet()) {
                        if (!f16511g.containsKey(next.getKey())) {
                            String str5 = (String) next.getKey();
                            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 79 + str.length());
                            sb.append("Attempted to register a new key template ");
                            sb.append(str5);
                            sb.append(" from an existing key manager of type ");
                            sb.append(str);
                            throw new GeneralSecurityException(sb.toString());
                        }
                    }
                } else {
                    for (Map.Entry next2 : map.entrySet()) {
                        if (f16511g.containsKey(next2.getKey())) {
                            String valueOf = String.valueOf((String) next2.getKey());
                            if (valueOf.length() != 0) {
                                str2 = "Attempted overwrite of a registered key template ".concat(valueOf);
                            } else {
                                str2 = new String("Attempted overwrite of a registered key template ");
                            }
                            throw new GeneralSecurityException(str2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private static <KeyFormatProtoT extends zn3> void m23616s(String str, Map<String, ja3<KeyFormatProtoT>> map) {
        for (Map.Entry next : map.entrySet()) {
            f16511g.put((String) next.getKey(), ha3.m24748d(str, ((ja3) next.getValue()).f18410a.mo21561e(), ((ja3) next.getValue()).f18411b));
        }
    }
}
