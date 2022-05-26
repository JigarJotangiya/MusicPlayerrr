package p082e.p109h.p115l;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: e.h.l.h */
/* compiled from: LocaleListPlatformWrapper */
final class C3652h implements C3651g {

    /* renamed from: a */
    private final LocaleList f11624a;

    C3652h(LocaleList localeList) {
        this.f11624a = localeList;
    }

    /* renamed from: a */
    public Object mo12912a() {
        return this.f11624a;
    }

    public boolean equals(Object obj) {
        return this.f11624a.equals(((C3651g) obj).mo12912a());
    }

    public Locale get(int i) {
        return this.f11624a.get(i);
    }

    public int hashCode() {
        return this.f11624a.hashCode();
    }

    public String toString() {
        return this.f11624a.toString();
    }
}
