package p369i.p376f0;

import java.util.ArrayList;
import java.util.List;
import p369i.p377u.C8480j;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: i.f0.h */
/* compiled from: Indent.kt */
class C8427h extends C8426g {

    /* renamed from: i.f0.h$a */
    /* compiled from: Indent.kt */
    static final class C8428a extends C8595m implements C8570l<String, String> {
        public static final C8428a INSTANCE = new C8428a();

        C8428a() {
            super(1);
        }

        public final String invoke(String str) {
            C8594l.m46771e(str, "line");
            return str;
        }
    }

    /* renamed from: i.f0.h$b */
    /* compiled from: Indent.kt */
    static final class C8429b extends C8595m implements C8570l<String, String> {
        final /* synthetic */ String $indent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8429b(String str) {
            super(1);
            this.$indent = str;
        }

        public final String invoke(String str) {
            C8594l.m46771e(str, "line");
            return this.$indent + str;
        }
    }

    /* renamed from: b */
    private static final C8570l<String, String> m46508b(String str) {
        if (str.length() == 0) {
            return C8428a.INSTANCE;
        }
        return new C8429b(str);
    }

    /* renamed from: c */
    private static final int m46509c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C8420b.m46473c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: d */
    public static final String m46510d(String str, String str2) {
        String invoke;
        C8594l.m46771e(str, "$this$replaceIndent");
        C8594l.m46771e(str2, "newIndent");
        List<String> M = C8437p.m46538M(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : M) {
            if (!C8436o.m46520n((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C8483m.m46672m(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(m46509c(c)));
        }
        Integer num = (Integer) C8490t.m46684u(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * M.size());
        C8570l<String, String> b = m46508b(str2);
        int g = C8482l.m46666g(M);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : M) {
            int i2 = i + 1;
            String str3 = null;
            if (i >= 0) {
                String str4 = (String) next2;
                if (!(i == 0 || i == g) || !C8436o.m46520n(str4)) {
                    String m0 = C8441r.m46571m0(str4, intValue);
                    str3 = (m0 == null || (invoke = b.invoke(m0)) == null) ? str4 : invoke;
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i = i2;
            } else {
                C8480j.m46649l();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length);
        Appendable unused = C8490t.m46681r(arrayList3, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C8570l) null, 124, (Object) null);
        String sb2 = sb.toString();
        C8594l.m46770d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* renamed from: e */
    public static String m46511e(String str) {
        C8594l.m46771e(str, "$this$trimIndent");
        return m46510d(str, BuildConfig.FLAVOR);
    }
}
