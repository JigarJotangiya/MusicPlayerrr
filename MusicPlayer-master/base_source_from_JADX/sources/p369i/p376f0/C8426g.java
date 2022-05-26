package p369i.p376f0;

import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.f0.g */
/* compiled from: Appendable.kt */
class C8426g {
    /* renamed from: a */
    public static <T> void m46507a(Appendable appendable, T t, C8570l<? super T, ? extends CharSequence> lVar) {
        C8594l.m46771e(appendable, "$this$appendElement");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
