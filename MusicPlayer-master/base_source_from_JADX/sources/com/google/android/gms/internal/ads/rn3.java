package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rn3 implements uo3 {

    /* renamed from: b */
    private static final xn3 f22937b = new pn3();

    /* renamed from: a */
    private final xn3 f22938a;

    public rn3() {
        xn3 xn3;
        xn3[] xn3Arr = new xn3[2];
        xn3Arr[0] = mm3.m27352c();
        try {
            xn3 = (xn3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            xn3 = f22937b;
        }
        xn3Arr[1] = xn3;
        qn3 qn3 = new qn3(xn3Arr);
        zm3.m34701f(qn3, "messageInfoFactory");
        this.f22938a = qn3;
    }

    /* renamed from: a */
    private static boolean m30274a(wn3 wn3) {
        return wn3.mo18475b() == 1;
    }

    /* renamed from: c */
    public final <T> to3<T> mo20722c(Class<T> cls) {
        Class<qm3> cls2 = qm3.class;
        vo3.m32597g(cls);
        wn3 a = this.f22938a.mo19456a(cls);
        if (a.mo18474a()) {
            if (cls2.isAssignableFrom(cls)) {
                return do3.m22624j(vo3.m32591b(), gm3.m24449b(), a.zza());
            }
            return do3.m22624j(vo3.m32592b0(), gm3.m24448a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m30274a(a)) {
                return co3.m22021J(cls, a, go3.m24465b(), nn3.m27951e(), vo3.m32591b(), gm3.m24449b(), vn3.m32493b());
            }
            return co3.m22021J(cls, a, go3.m24465b(), nn3.m27951e(), vo3.m32591b(), (dm3<?>) null, vn3.m32493b());
        } else if (m30274a(a)) {
            return co3.m22021J(cls, a, go3.m24464a(), nn3.m27950d(), vo3.m32592b0(), gm3.m24448a(), vn3.m32492a());
        } else {
            return co3.m22021J(cls, a, go3.m24464a(), nn3.m27950d(), vo3.m32589a(), (dm3<?>) null, vn3.m32492a());
        }
    }
}
