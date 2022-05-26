package androidx.work.impl.p009m.p011f;

import android.content.Context;
import androidx.work.impl.utils.p014p.C1397a;

/* renamed from: androidx.work.impl.m.f.g */
/* compiled from: Trackers */
public class C1316g {

    /* renamed from: e */
    private static C1316g f5285e;

    /* renamed from: a */
    private C1306a f5286a;

    /* renamed from: b */
    private C1307b f5287b;

    /* renamed from: c */
    private C1312e f5288c;

    /* renamed from: d */
    private C1315f f5289d;

    private C1316g(Context context, C1397a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5286a = new C1306a(applicationContext, aVar);
        this.f5287b = new C1307b(applicationContext, aVar);
        this.f5288c = new C1312e(applicationContext, aVar);
        this.f5289d = new C1315f(applicationContext, aVar);
    }

    /* renamed from: c */
    public static synchronized C1316g m7222c(Context context, C1397a aVar) {
        C1316g gVar;
        synchronized (C1316g.class) {
            if (f5285e == null) {
                f5285e = new C1316g(context, aVar);
            }
            gVar = f5285e;
        }
        return gVar;
    }

    /* renamed from: a */
    public C1306a mo6678a() {
        return this.f5286a;
    }

    /* renamed from: b */
    public C1307b mo6679b() {
        return this.f5287b;
    }

    /* renamed from: d */
    public C1312e mo6680d() {
        return this.f5288c;
    }

    /* renamed from: e */
    public C1315f mo6681e() {
        return this.f5289d;
    }
}
