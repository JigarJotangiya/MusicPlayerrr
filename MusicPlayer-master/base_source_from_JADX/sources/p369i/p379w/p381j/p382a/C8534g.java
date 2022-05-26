package p369i.p379w.p381j.p382a;

import java.lang.reflect.Field;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.w.j.a.g */
/* compiled from: DebugMetadata.kt */
public final class C8534g {
    /* renamed from: a */
    private static final void m46731a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final C8533f m46732b(C8528a aVar) {
        return (C8533f) aVar.getClass().getAnnotation(C8533f.class);
    }

    /* renamed from: c */
    private static final int m46733c(C8528a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            C8594l.m46770d(declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m46734d(C8528a aVar) {
        int i;
        String str;
        C8594l.m46771e(aVar, "$this$getStackTraceElementImpl");
        C8533f b = m46732b(aVar);
        if (b == null) {
            return null;
        }
        m46731a(1, b.mo30603v());
        int c = m46733c(aVar);
        if (c < 0) {
            i = -1;
        } else {
            i = b.mo30601l()[c];
        }
        String b2 = C8536i.f34919c.mo30604b(aVar);
        if (b2 == null) {
            str = b.mo30599c();
        } else {
            str = b2 + '/' + b.mo30599c();
        }
        return new StackTraceElement(str, b.mo30602m(), b.mo30600f(), i);
    }
}
