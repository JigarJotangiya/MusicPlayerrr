package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.m0 */
/* compiled from: ViewModel */
public abstract class C0696m0 {

    /* renamed from: a */
    private final Map<String, Object> f3321a = new HashMap();

    /* renamed from: b */
    private volatile boolean f3322b = false;

    /* renamed from: b */
    private static void m4251b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4253a() {
        this.f3322b = true;
        Map<String, Object> map = this.f3321a;
        if (map != null) {
            synchronized (map) {
                for (Object b : this.f3321a.values()) {
                    m4251b(b);
                }
            }
        }
        mo4006d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo4254c(String str) {
        T t;
        Map<String, Object> map = this.f3321a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f3321a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4006d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public <T> T mo4255e(String str, T t) {
        T t2;
        synchronized (this.f3321a) {
            t2 = this.f3321a.get(str);
            if (t2 == null) {
                this.f3321a.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.f3322b) {
            m4251b(t);
        }
        return t;
    }
}
