package p369i.p376f0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p369i.C8446k;
import p369i.C8453p;
import p369i.p373c0.C8385a;
import p369i.p373c0.C8388c;
import p369i.p375e0.C8407b;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: i.f0.p */
/* compiled from: Strings.kt */
class C8437p extends C8436o {

    /* renamed from: i.f0.p$a */
    /* compiled from: Strings.kt */
    static final class C8438a extends C8595m implements C8574p<CharSequence, Integer, C8446k<? extends Integer, ? extends Integer>> {
        final /* synthetic */ List $delimitersList;
        final /* synthetic */ boolean $ignoreCase;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8438a(List list, boolean z) {
            super(2);
            this.$delimitersList = list;
            this.$ignoreCase = z;
        }

        public final C8446k<Integer, Integer> invoke(CharSequence charSequence, int i) {
            C8594l.m46771e(charSequence, "$receiver");
            C8446k t = C8437p.m46567w(charSequence, this.$delimitersList, i, this.$ignoreCase, false);
            if (t != null) {
                return C8453p.m46576a(t.getFirst(), Integer.valueOf(((String) t.getSecond()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: i.f0.p$b */
    /* compiled from: Strings.kt */
    static final class C8439b extends C8595m implements C8570l<C8388c, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8439b(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        public final String invoke(C8388c cVar) {
            C8594l.m46771e(cVar, "it");
            return C8437p.m46550Y(this.$this_splitToSequence, cVar);
        }
    }

    /* renamed from: A */
    public static final int m46526A(CharSequence charSequence, String str, int i, boolean z) {
        C8594l.m46771e(charSequence, "$this$indexOf");
        C8594l.m46771e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m46528C(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: B */
    private static final int m46527B(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C8385a aVar;
        if (!z2) {
            aVar = new C8388c(C8392f.m46450a(i, 0), C8392f.m46452c(i2, charSequence.length()));
        } else {
            aVar = C8392f.m46455f(C8392f.m46452c(i, m46569y(charSequence)), C8392f.m46450a(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int d = aVar.mo30355d();
            int p = aVar.mo30360p();
            int s = aVar.mo30361s();
            if (s >= 0) {
                if (d > p) {
                    return -1;
                }
            } else if (d < p) {
                return -1;
            }
            while (true) {
                if (m46543R(charSequence2, 0, charSequence, d, charSequence2.length(), z)) {
                    return d;
                }
                if (d == p) {
                    return -1;
                }
                d += s;
            }
        } else {
            int d2 = aVar.mo30355d();
            int p2 = aVar.mo30360p();
            int s2 = aVar.mo30361s();
            if (s2 >= 0) {
                if (d2 > p2) {
                    return -1;
                }
            } else if (d2 < p2) {
                return -1;
            }
            while (true) {
                if (C8436o.m46521o((String) charSequence2, 0, (String) charSequence, d2, charSequence2.length(), z)) {
                    return d2;
                }
                if (d2 == p2) {
                    return -1;
                }
                d2 += s2;
            }
        }
    }

    /* renamed from: C */
    static /* synthetic */ int m46528C(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m46527B(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: D */
    public static /* synthetic */ int m46529D(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m46570z(charSequence, c, i, z);
    }

    /* renamed from: E */
    public static /* synthetic */ int m46530E(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m46526A(charSequence, str, i, z);
    }

    /* renamed from: F */
    public static final int m46531F(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C8594l.m46771e(charSequence, "$this$indexOfAny");
        C8594l.m46771e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C8392f.m46450a(i, 0);
            int y = m46569y(charSequence);
            if (a > y) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (C8421c.m46474d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return a;
                }
                if (a == y) {
                    return -1;
                }
                a++;
            }
        } else {
            return ((String) charSequence).indexOf(C8477h.m46631p(cArr), i);
        }
    }

    /* renamed from: G */
    public static final int m46532G(CharSequence charSequence, char c, int i, boolean z) {
        C8594l.m46771e(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m46536K(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: H */
    public static final int m46533H(CharSequence charSequence, String str, int i, boolean z) {
        C8594l.m46771e(charSequence, "$this$lastIndexOf");
        C8594l.m46771e(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m46527B(charSequence, str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: I */
    public static /* synthetic */ int m46534I(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m46569y(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m46532G(charSequence, c, i, z);
    }

    /* renamed from: J */
    public static /* synthetic */ int m46535J(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m46569y(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m46533H(charSequence, str, i, z);
    }

    /* renamed from: K */
    public static final int m46536K(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C8594l.m46771e(charSequence, "$this$lastIndexOfAny");
        C8594l.m46771e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int c = C8392f.m46452c(i, m46569y(charSequence)); c >= 0; c--) {
                char charAt = charSequence.charAt(c);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C8421c.m46474d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return c;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C8477h.m46631p(cArr), i);
    }

    /* renamed from: L */
    public static final C8407b<String> m46537L(CharSequence charSequence) {
        C8594l.m46771e(charSequence, "$this$lineSequence");
        return m46549X(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: M */
    public static final List<String> m46538M(CharSequence charSequence) {
        C8594l.m46771e(charSequence, "$this$lines");
        return C8414h.m46466f(m46537L(charSequence));
    }

    /* renamed from: N */
    public static final CharSequence m46539N(CharSequence charSequence, int i, char c) {
        C8594l.m46771e(charSequence, "$this$padStart");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
    }

    /* renamed from: O */
    public static String m46540O(String str, int i, char c) {
        C8594l.m46771e(str, "$this$padStart");
        return m46539N(str, i, c).toString();
    }

    /* renamed from: P */
    private static final C8407b<C8388c> m46541P(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m46544S(i2);
        return new C8423e(charSequence, i, i2, new C8438a(C8475g.m46615b(strArr), z));
    }

    /* renamed from: Q */
    static /* synthetic */ C8407b m46542Q(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m46541P(charSequence, strArr, i, z, i2);
    }

    /* renamed from: R */
    public static final boolean m46543R(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C8594l.m46771e(charSequence, "$this$regionMatchesImpl");
        C8594l.m46771e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C8421c.m46474d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: S */
    public static final void m46544S(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: T */
    public static final List<String> m46545T(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C8594l.m46771e(charSequence, "$this$split");
        C8594l.m46771e(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m46546U(charSequence, str, z, i);
            }
        }
        Iterable<C8388c> c = C8414h.m46463c(m46542Q(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C8483m.m46672m(c, 10));
        for (C8388c Y : c) {
            arrayList.add(m46550Y(charSequence, Y));
        }
        return arrayList;
    }

    /* renamed from: U */
    private static final List<String> m46546U(CharSequence charSequence, String str, boolean z, int i) {
        m46544S(i);
        int i2 = 0;
        int A = m46526A(charSequence, str, 0, z);
        if (A == -1 || i == 1) {
            return C8481k.m46661b(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2) {
            i3 = C8392f.m46452c(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, A).toString());
            i2 = str.length() + A;
            if ((z2 && arrayList.size() == i - 1) || (A = m46526A(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, A).toString());
            i2 = str.length() + A;
            break;
        } while ((A = m46526A(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: V */
    public static /* synthetic */ List m46547V(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m46545T(charSequence, strArr, z, i);
    }

    /* renamed from: W */
    public static final C8407b<String> m46548W(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C8594l.m46771e(charSequence, "$this$splitToSequence");
        C8594l.m46771e(strArr, "delimiters");
        return C8414h.m46464d(m46542Q(charSequence, strArr, 0, z, i, 2, (Object) null), new C8439b(charSequence));
    }

    /* renamed from: X */
    public static /* synthetic */ C8407b m46549X(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m46548W(charSequence, strArr, z, i);
    }

    /* renamed from: Y */
    public static final String m46550Y(CharSequence charSequence, C8388c cVar) {
        C8594l.m46771e(charSequence, "$this$substring");
        C8594l.m46771e(cVar, "range");
        return charSequence.subSequence(cVar.mo30368x().intValue(), cVar.mo30367v().intValue() + 1).toString();
    }

    /* renamed from: Z */
    public static final String m46551Z(String str, String str2, String str3) {
        C8594l.m46771e(str, "$this$substringAfter");
        C8594l.m46771e(str2, "delimiter");
        C8594l.m46771e(str3, "missingDelimiterValue");
        int E = m46530E(str, str2, 0, false, 6, (Object) null);
        if (E == -1) {
            return str3;
        }
        String substring = str.substring(E + str2.length(), str.length());
        C8594l.m46770d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a0 */
    public static /* synthetic */ String m46552a0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m46551Z(str, str2, str3);
    }

    /* renamed from: b0 */
    public static String m46553b0(String str, char c, String str2) {
        C8594l.m46771e(str, "$this$substringAfterLast");
        C8594l.m46771e(str2, "missingDelimiterValue");
        int I = m46534I(str, c, 0, false, 6, (Object) null);
        if (I == -1) {
            return str2;
        }
        String substring = str.substring(I + 1, str.length());
        C8594l.m46770d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c0 */
    public static String m46554c0(String str, String str2, String str3) {
        C8594l.m46771e(str, "$this$substringAfterLast");
        C8594l.m46771e(str2, "delimiter");
        C8594l.m46771e(str3, "missingDelimiterValue");
        int J = m46535J(str, str2, 0, false, 6, (Object) null);
        if (J == -1) {
            return str3;
        }
        String substring = str.substring(J + str2.length(), str.length());
        C8594l.m46770d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d0 */
    public static /* synthetic */ String m46555d0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m46553b0(str, c, str2);
    }

    /* renamed from: e0 */
    public static /* synthetic */ String m46556e0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m46554c0(str, str2, str3);
    }

    /* renamed from: f0 */
    public static final String m46557f0(String str, char c, String str2) {
        C8594l.m46771e(str, "$this$substringBefore");
        C8594l.m46771e(str2, "missingDelimiterValue");
        int D = m46529D(str, c, 0, false, 6, (Object) null);
        if (D == -1) {
            return str2;
        }
        String substring = str.substring(0, D);
        C8594l.m46770d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: g0 */
    public static final String m46558g0(String str, String str2, String str3) {
        C8594l.m46771e(str, "$this$substringBefore");
        C8594l.m46771e(str2, "delimiter");
        C8594l.m46771e(str3, "missingDelimiterValue");
        int E = m46530E(str, str2, 0, false, 6, (Object) null);
        if (E == -1) {
            return str3;
        }
        String substring = str.substring(0, E);
        C8594l.m46770d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: h0 */
    public static /* synthetic */ String m46559h0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m46557f0(str, c, str2);
    }

    /* renamed from: i0 */
    public static /* synthetic */ String m46560i0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m46558g0(str, str2, str3);
    }

    /* renamed from: j0 */
    public static String m46561j0(String str, String str2, String str3) {
        C8594l.m46771e(str, "$this$substringBeforeLast");
        C8594l.m46771e(str2, "delimiter");
        C8594l.m46771e(str3, "missingDelimiterValue");
        int J = m46535J(str, str2, 0, false, 6, (Object) null);
        if (J == -1) {
            return str3;
        }
        String substring = str.substring(0, J);
        C8594l.m46770d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: k0 */
    public static /* synthetic */ String m46562k0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m46561j0(str, str2, str3);
    }

    /* renamed from: l0 */
    public static CharSequence m46563l0(CharSequence charSequence) {
        C8594l.m46771e(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = C8420b.m46473c(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: u */
    public static final boolean m46565u(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C8594l.m46771e(charSequence, "$this$contains");
        C8594l.m46771e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m46530E(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m46528C(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m46566v(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m46565u(charSequence, charSequence2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final C8446k<Integer, String> m46567w(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        T t;
        T t2;
        if (z || collection.size() != 1) {
            C8385a cVar = !z2 ? new C8388c(C8392f.m46450a(i, 0), charSequence.length()) : C8392f.m46455f(C8392f.m46452c(i, m46569y(charSequence)), 0);
            if (charSequence instanceof String) {
                int d = cVar.mo30355d();
                int p = cVar.mo30360p();
                int s = cVar.mo30361s();
                if (s < 0 ? d >= p : d <= p) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str = (String) t2;
                            if (C8436o.m46521o(str, 0, (String) charSequence, d, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) t2;
                        if (str2 == null) {
                            if (d == p) {
                                break;
                            }
                            d += s;
                        } else {
                            return C8453p.m46576a(Integer.valueOf(d), str2);
                        }
                    }
                }
            } else {
                int d2 = cVar.mo30355d();
                int p2 = cVar.mo30360p();
                int s2 = cVar.mo30361s();
                if (s2 < 0 ? d2 >= p2 : d2 <= p2) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            String str3 = (String) t;
                            if (m46543R(str3, 0, charSequence, d2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) t;
                        if (str4 == null) {
                            if (d2 == p2) {
                                break;
                            }
                            d2 += s2;
                        } else {
                            return C8453p.m46576a(Integer.valueOf(d2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C8490t.m46686w(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i2 = i;
        int E = !z2 ? m46530E(charSequence2, str6, i2, false, 4, (Object) null) : m46535J(charSequence2, str6, i2, false, 4, (Object) null);
        if (E < 0) {
            return null;
        }
        return C8453p.m46576a(Integer.valueOf(E), str5);
    }

    /* renamed from: x */
    public static final C8388c m46568x(CharSequence charSequence) {
        C8594l.m46771e(charSequence, "$this$indices");
        return new C8388c(0, charSequence.length() - 1);
    }

    /* renamed from: y */
    public static final int m46569y(CharSequence charSequence) {
        C8594l.m46771e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: z */
    public static final int m46570z(CharSequence charSequence, char c, int i, boolean z) {
        C8594l.m46771e(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m46531F(charSequence, new char[]{c}, i, z);
    }
}
