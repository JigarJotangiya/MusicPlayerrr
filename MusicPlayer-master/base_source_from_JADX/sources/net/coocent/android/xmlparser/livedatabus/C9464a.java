package net.coocent.android.xmlparser.livedatabus;

import androidx.lifecycle.C0697n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: net.coocent.android.xmlparser.livedatabus.a */
/* compiled from: LiveDataBus */
public final class C9464a {

    /* renamed from: a */
    private final Map<String, C9466b<Object>> f36435a;

    /* renamed from: net.coocent.android.xmlparser.livedatabus.a$b */
    /* compiled from: LiveDataBus */
    private static class C9466b<T> extends LiveEvent<T> implements C9467c<T> {
        private C9466b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public C0697n.C0700c mo32594h() {
            return super.mo32594h();
        }
    }

    /* renamed from: net.coocent.android.xmlparser.livedatabus.a$c */
    /* compiled from: LiveDataBus */
    public interface C9467c<T> {
        /* renamed from: a */
        void mo32605a(T t);
    }

    /* renamed from: net.coocent.android.xmlparser.livedatabus.a$d */
    /* compiled from: LiveDataBus */
    private static class C9468d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C9464a f36436a = new C9464a();
    }

    /* renamed from: a */
    public static C9464a m49831a() {
        return C9468d.f36436a;
    }

    /* renamed from: b */
    public synchronized <T> C9467c<T> mo32604b(String str, Class<T> cls) {
        if (!this.f36435a.containsKey(str)) {
            this.f36435a.put(str, new C9466b());
        }
        return this.f36435a.get(str);
    }

    private C9464a() {
        this.f36435a = new HashMap();
    }
}
