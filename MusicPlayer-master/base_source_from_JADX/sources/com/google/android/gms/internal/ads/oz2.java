package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class oz2 implements gy2 {

    /* renamed from: a */
    private final Object f21250a;

    /* renamed from: b */
    private final pz2 f21251b;

    /* renamed from: c */
    private final zz2 f21252c;

    /* renamed from: d */
    private final dy2 f21253d;

    oz2(Object obj, pz2 pz2, zz2 zz2, dy2 dy2) {
        this.f21250a = obj;
        this.f21251b = pz2;
        this.f21252c = zz2;
        this.f21253d = dy2;
    }

    /* renamed from: i */
    private static String m28795i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C5032e9 D = C5070f9.m23542D();
        D.mo17134t(5);
        D.mo17132r(kl3.zzv(bArr));
        return Base64.encodeToString(((C5070f9) D.mo19761n()).mo21561e(), 11);
    }

    /* renamed from: j */
    private final synchronized byte[] m28796j(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.f21253d.mo17048c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f21250a.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.f21250a, new Object[]{null, map2});
    }

    /* renamed from: a */
    public final synchronized String mo18046a(Context context, String str) {
        Map<String, Object> a;
        a = this.f21252c.mo20417a();
        a.put("f", "q");
        a.put("ctx", context);
        a.put("aid", (Object) null);
        return m28795i(m28796j((Map<String, String>) null, a));
    }

    /* renamed from: b */
    public final synchronized void mo18047b(String str, MotionEvent motionEvent) throws xz2 {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.f21250a.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.f21250a, new Object[]{hashMap});
            this.f21253d.mo17049d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new xz2(2005, (Throwable) e);
        }
    }

    /* renamed from: c */
    public final synchronized String mo18048c(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zza;
        zza = this.f21252c.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", (Object) null);
        zza.put("view", view);
        zza.put("act", activity);
        return m28795i(m28796j((Map<String, String>) null, zza));
    }

    /* renamed from: d */
    public final synchronized String mo18049d(Context context, String str, View view, Activity activity) {
        Map<String, Object> b;
        b = this.f21252c.mo20418b();
        b.put("f", "v");
        b.put("ctx", context);
        b.put("aid", (Object) null);
        b.put("view", view);
        b.put("act", (Object) null);
        return m28795i(m28796j((Map<String, String>) null, b));
    }

    /* renamed from: e */
    public final synchronized int mo20158e() throws xz2 {
        try {
        } catch (Exception e) {
            throw new xz2(2006, (Throwable) e);
        }
        return ((Integer) this.f21250a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f21250a, new Object[0])).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final pz2 mo20159f() {
        return this.f21251b;
    }

    /* renamed from: g */
    public final synchronized void mo20160g() throws xz2 {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f21250a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f21250a, new Object[0]);
            this.f21253d.mo17049d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new xz2(2003, (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized boolean mo20161h() throws xz2 {
        try {
        } catch (Exception e) {
            throw new xz2(2001, (Throwable) e);
        }
        return ((Boolean) this.f21250a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f21250a, new Object[0])).booleanValue();
    }
}
