package p369i.p387z.p389d;

import p369i.p374d0.C8396c;
import p369i.p374d0.C8397d;
import p369i.p374d0.C8398e;
import p369i.p374d0.C8401g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: i.z.d.u */
/* compiled from: Reflection */
public class C8603u {

    /* renamed from: a */
    private static final C8604v f34936a;

    /* renamed from: b */
    private static final C8396c[] f34937b = new C8396c[0];

    static {
        C8604v vVar = null;
        try {
            vVar = (C8604v) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (vVar == null) {
            vVar = new C8604v();
        }
        f34936a = vVar;
    }

    /* renamed from: a */
    public static C8398e m46785a(C8591i iVar) {
        f34936a.mo30639a(iVar);
        return iVar;
    }

    /* renamed from: b */
    public static C8396c m46786b(Class cls) {
        return f34936a.mo30640b(cls);
    }

    /* renamed from: c */
    public static C8397d m46787c(Class cls) {
        return f34936a.mo30641c(cls, BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    public static C8401g m46788d(C8597o oVar) {
        f34936a.mo30642d(oVar);
        return oVar;
    }

    /* renamed from: e */
    public static String m46789e(C8590h hVar) {
        return f34936a.mo30643e(hVar);
    }

    /* renamed from: f */
    public static String m46790f(C8595m mVar) {
        return f34936a.mo30644f(mVar);
    }
}
