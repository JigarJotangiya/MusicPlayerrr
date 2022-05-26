package p369i.p387z;

import java.util.Objects;
import p369i.p374d0.C8396c;
import p369i.p387z.p389d.C8586d;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8603u;

/* renamed from: i.z.a */
/* compiled from: JvmClassMapping.kt */
public final class C8557a {
    /* renamed from: a */
    public static final <T> Class<T> m46759a(C8396c<T> cVar) {
        C8594l.m46771e(cVar, "$this$javaObjectType");
        Class a = ((C8586d) cVar).mo30621a();
        if (!a.isPrimitive()) {
            Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.Class<T>");
            return a;
        }
        String name = a.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        a = Double.class;
                        break;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        a = Integer.class;
                        break;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        a = Byte.class;
                        break;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        a = Character.class;
                        break;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        a = Long.class;
                        break;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        a = Void.class;
                        break;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        a = Boolean.class;
                        break;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        a = Float.class;
                        break;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        a = Short.class;
                        break;
                    }
                    break;
            }
        }
        Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.Class<T>");
        return a;
    }

    /* renamed from: b */
    public static final <T> C8396c<T> m46760b(Class<T> cls) {
        C8594l.m46771e(cls, "$this$kotlin");
        return C8603u.m46786b(cls);
    }
}
