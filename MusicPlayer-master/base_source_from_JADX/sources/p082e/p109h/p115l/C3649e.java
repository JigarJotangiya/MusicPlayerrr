package p082e.p109h.p115l;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: e.h.l.e */
/* compiled from: LocaleListCompat */
public final class C3649e {

    /* renamed from: a */
    private C3651g f11621a;

    static {
        m15708a(new Locale[0]);
    }

    private C3649e(C3651g gVar) {
        this.f11621a = gVar;
    }

    /* renamed from: a */
    public static C3649e m15708a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m15710d(new LocaleList(localeArr));
        }
        return new C3649e(new C3650f(localeArr));
    }

    /* renamed from: b */
    static Locale m15709b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: d */
    public static C3649e m15710d(LocaleList localeList) {
        return new C3649e(new C3652h(localeList));
    }

    /* renamed from: c */
    public Locale mo12908c(int i) {
        return this.f11621a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3649e) && this.f11621a.equals(((C3649e) obj).f11621a);
    }

    public int hashCode() {
        return this.f11621a.hashCode();
    }

    public String toString() {
        return this.f11621a.toString();
    }
}
