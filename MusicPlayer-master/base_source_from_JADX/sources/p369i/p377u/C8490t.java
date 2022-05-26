package p369i.p377u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: i.u.t */
/* compiled from: _Collections.kt */
class C8490t extends C8489s {
    /* renamed from: A */
    public static long[] m46676A(Collection<Long> collection) {
        C8594l.m46771e(collection, "$this$toLongArray");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long longValue : collection) {
            jArr[i] = longValue.longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: B */
    public static final <T> List<T> m46677B(Iterable<? extends T> iterable) {
        C8594l.m46771e(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return m46678C((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m46688y(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: C */
    public static <T> List<T> m46678C(Collection<? extends T> collection) {
        C8594l.m46771e(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    /* renamed from: D */
    public static <T> Set<T> m46679D(Iterable<? extends T> iterable) {
        C8594l.m46771e(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C8476g0.m46625b();
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C8466b0.m46586a(collection.size()));
                m46688y(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return C8474f0.m46614a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m46688y(iterable, linkedHashSet2);
        return C8476g0.m46626c(linkedHashSet2);
    }

    /* renamed from: q */
    public static final <T, A extends Appendable> A m46680q(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C8570l<? super T, ? extends CharSequence> lVar) {
        C8594l.m46771e(iterable, "$this$joinTo");
        C8594l.m46771e(a, "buffer");
        C8594l.m46771e(charSequence, "separator");
        C8594l.m46771e(charSequence2, "prefix");
        C8594l.m46771e(charSequence3, "postfix");
        C8594l.m46771e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C8426g.m46507a(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: r */
    public static /* synthetic */ Appendable m46681r(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C8570l lVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        int i3 = i2 & 4;
        CharSequence charSequence5 = BuildConfig.FLAVOR;
        CharSequence charSequence6 = i3 != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        m46680q(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
        return appendable;
    }

    /* renamed from: s */
    public static final <T> String m46682s(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C8570l<? super T, ? extends CharSequence> lVar) {
        C8594l.m46771e(iterable, "$this$joinToString");
        C8594l.m46771e(charSequence, "separator");
        C8594l.m46771e(charSequence2, "prefix");
        C8594l.m46771e(charSequence3, "postfix");
        C8594l.m46771e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m46680q(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, lVar);
        String sb2 = sb.toString();
        C8594l.m46770d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: t */
    public static /* synthetic */ String m46683t(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C8570l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        int i3 = i2 & 2;
        CharSequence charSequence5 = BuildConfig.FLAVOR;
        CharSequence charSequence6 = i3 != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i4 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m46682s(iterable, charSequence, charSequence6, charSequence5, i4, charSequence7, lVar);
    }

    /* renamed from: u */
    public static <T extends Comparable<? super T>> T m46684u(Iterable<? extends T> iterable) {
        C8594l.m46771e(iterable, "$this$minOrNull");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: v */
    public static <T> List<T> m46685v(Collection<? extends T> collection, T t) {
        C8594l.m46771e(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: w */
    public static <T> T m46686w(Iterable<? extends T> iterable) {
        C8594l.m46771e(iterable, "$this$single");
        if (iterable instanceof List) {
            return m46687x((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: x */
    public static final <T> T m46687x(List<? extends T> list) {
        C8594l.m46771e(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: y */
    public static final <T, C extends Collection<? super T>> C m46688y(Iterable<? extends T> iterable, C c) {
        C8594l.m46771e(iterable, "$this$toCollection");
        C8594l.m46771e(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: z */
    public static <T> List<T> m46689z(Iterable<? extends T> iterable) {
        C8594l.m46771e(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return C8482l.m46669j(m46677B(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C8482l.m46665f();
        }
        if (size != 1) {
            return m46678C(collection);
        }
        return C8481k.m46661b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }
}
