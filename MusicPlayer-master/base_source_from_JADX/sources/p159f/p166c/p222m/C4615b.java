package p159f.p166c.p222m;

import android.util.Log;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.m.b */
/* compiled from: VideoConfigUtils.kt */
public final class C4615b {

    /* renamed from: a */
    public static final C4615b f13328a = new C4615b();

    private C4615b() {
    }

    /* renamed from: a */
    public static final C4616c m20080a() {
        try {
            Class<?> cls = Class.forName("f.c.m.d");
            if (cls != null) {
                return (C4616c) cls.newInstance();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<com.coocent.videoconfig.VideoConfigWrapper>");
        } catch (ClassNotFoundException e) {
            Log.e("VideoConfigUtils", C8594l.m46777k("ClassNotFoundException  ", e.getMessage()));
            return null;
        } catch (InstantiationException e2) {
            Log.e("VideoConfigUtils", C8594l.m46777k("InstantiationException  ", e2.getMessage()));
            return null;
        } catch (IllegalAccessException e3) {
            Log.e("VideoConfigUtils", C8594l.m46777k("IllegalAccessException  ", e3.getMessage()));
            return null;
        }
    }
}
