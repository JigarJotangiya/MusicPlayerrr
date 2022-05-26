package p082e.p109h.p115l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: e.h.l.f */
/* compiled from: LocaleListCompatWrapper */
final class C3650f implements C3651g {

    /* renamed from: b */
    private static final Locale[] f11622b = new Locale[0];

    /* renamed from: a */
    private final Locale[] f11623a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        C3649e.m15709b("en-Latn");
    }

    C3650f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f11623a = f11622b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m15712b(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f11623a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        sb.toString();
    }

    /* renamed from: b */
    static void m15712b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    /* renamed from: a */
    public Object mo12912a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3650f)) {
            return false;
        }
        Locale[] localeArr = ((C3650f) obj).f11623a;
        if (this.f11623a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f11623a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f11623a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f11623a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f11623a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f11623a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
