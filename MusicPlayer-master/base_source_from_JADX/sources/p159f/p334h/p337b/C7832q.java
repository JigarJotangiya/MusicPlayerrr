package p159f.p334h.p337b;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: f.h.b.q */
/* compiled from: MediaType */
public final class C7832q {

    /* renamed from: c */
    private static final Pattern f33288c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d */
    private static final Pattern f33289d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f33290a;

    /* renamed from: b */
    private final String f33291b;

    private C7832q(String str, String str2, String str3, String str4) {
        this.f33290a = str;
        this.f33291b = str4;
    }

    /* renamed from: b */
    public static C7832q m42898b(String str) {
        String str2;
        Matcher matcher = f33288c.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f33289d.matcher(str);
        String str3 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                if (matcher2.group(2) != null) {
                    str2 = matcher2.group(2);
                } else {
                    str2 = matcher2.group(3);
                }
                if (str3 == null || str2.equalsIgnoreCase(str3)) {
                    str3 = str2;
                } else {
                    throw new IllegalArgumentException("Multiple different charsets: " + str);
                }
            }
        }
        return new C7832q(str, lowerCase, lowerCase2, str3);
    }

    /* renamed from: a */
    public Charset mo29169a() {
        String str = this.f33291b;
        if (str != null) {
            return Charset.forName(str);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7832q) && ((C7832q) obj).f33290a.equals(this.f33290a);
    }

    public int hashCode() {
        return this.f33290a.hashCode();
    }

    public String toString() {
        return this.f33290a;
    }
}
