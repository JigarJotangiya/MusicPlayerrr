package p369i.p376f0;

import p369i.p387z.p389d.C8594l;

/* renamed from: i.f0.r */
/* compiled from: _Strings.kt */
class C8441r extends C8440q {
    /* renamed from: m0 */
    public static final String m46571m0(String str, int i) {
        C8594l.m46771e(str, "$this$drop");
        if (i >= 0) {
            String substring = str.substring(C8392f.m46452c(i, str.length()));
            C8594l.m46770d(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
