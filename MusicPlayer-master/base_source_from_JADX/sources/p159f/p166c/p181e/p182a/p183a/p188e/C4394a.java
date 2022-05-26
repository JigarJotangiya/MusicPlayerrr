package p159f.p166c.p181e.p182a.p183a.p188e;

import android.content.Context;
import com.coocent.music.base.data.entity.Album;
import com.coocent.music.base.data.entity.Music;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p183a.p189f.C4433b;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.e.a */
/* compiled from: AlbumLoader.kt */
public final class C4394a {

    /* renamed from: a */
    public static final C4394a f12992a = new C4394a();

    /* renamed from: f.c.e.a.a.e.a$a */
    /* compiled from: Comparisons.kt */
    public static final class C4395a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String h = ((Album) t).mo9141h();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(h, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = h.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String h2 = ((Album) t2).mo9141h();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(h2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = h2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    /* renamed from: f.c.e.a.a.e.a$b */
    /* compiled from: Comparisons.kt */
    public static final class C4396b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String e = ((Album) t).mo9137e();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(e, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = e.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String e2 = ((Album) t2).mo9137e();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(e2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = e2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    /* renamed from: f.c.e.a.a.e.a$c */
    /* compiled from: Comparisons.kt */
    public static final class C4397c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String h = ((Album) t2).mo9141h();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(h, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = h.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String h2 = ((Album) t).mo9141h();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(h2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = h2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    /* renamed from: f.c.e.a.a.e.a$d */
    /* compiled from: Comparisons.kt */
    public static final class C4398d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(Integer.valueOf(((Album) t2).mo9140g()), Integer.valueOf(((Album) t).mo9140g()));
        }
    }

    /* renamed from: f.c.e.a.a.e.a$e */
    /* compiled from: Comparisons.kt */
    public static final class C4399e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(Integer.valueOf(((Album) t2).mo9143i()), Integer.valueOf(((Album) t).mo9143i()));
        }
    }

    private C4394a() {
    }

    /* renamed from: c */
    private final List<Album> m19289c(Context context, List<Music> list, String str) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (Music next : list) {
                long d = next.mo9205d();
                long f = next.mo9209f();
                String e = next.mo9207e();
                String g = next.mo9210g();
                int p = next.mo9220p();
                if (!linkedHashMap.containsKey(Long.valueOf(d))) {
                    Album album = new Album();
                    album.mo9146l(d);
                    album.mo9148n(e);
                    album.mo9144j(f);
                    album.mo9145k(g);
                    album.mo9149o(p);
                    album.mo9147m(1);
                    linkedHashMap.put(Long.valueOf(d), album);
                } else {
                    Album album2 = (Album) linkedHashMap.get(Long.valueOf(d));
                    if (album2 != null) {
                        album2.mo9147m(album2.mo9140g() + 1);
                        linkedHashMap.put(Long.valueOf(d), album2);
                    }
                }
            }
            for (Number longValue : linkedHashMap.keySet()) {
                Album album3 = (Album) linkedHashMap.get(Long.valueOf(longValue.longValue()));
                if (album3 != null) {
                    if (str2 != null) {
                        String h = album3.mo9141h();
                        Locale locale = Locale.getDefault();
                        C8594l.m46770d(locale, "Locale.getDefault()");
                        if (h != null) {
                            String lowerCase = h.toLowerCase(locale);
                            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            Locale locale2 = Locale.getDefault();
                            C8594l.m46770d(locale2, "Locale.getDefault()");
                            String lowerCase2 = str2.toLowerCase(locale2);
                            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                            if (C8437p.m46566v(lowerCase, lowerCase2, false, 2, (Object) null)) {
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    arrayList.add(album3);
                }
            }
            C4441e n = C4441e.m19454n(context);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String a = n.mo15109a();
            if (a != null) {
                switch (a.hashCode()) {
                    case -1409097913:
                        if (a.equals("artist") && arrayList.size() > 1) {
                            C8486p.m46674o(arrayList, new C4396b());
                            break;
                        }
                    case 249789583:
                        if (a.equals("album_key") && arrayList.size() > 1) {
                            C8486p.m46674o(arrayList, new C4395a());
                            break;
                        }
                    case 504021881:
                        if (a.equals("numsongs DESC") && arrayList.size() > 1) {
                            C8486p.m46674o(arrayList, new C4398d());
                            break;
                        }
                    case 802574978:
                        if (a.equals("minyear DESC") && arrayList.size() > 1) {
                            C8486p.m46674o(arrayList, new C4399e());
                            break;
                        }
                    case 1439820674:
                        if (a.equals("album_key DESC") && arrayList.size() > 1) {
                            C8486p.m46674o(arrayList, new C4397c());
                            break;
                        }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: d */
    static /* synthetic */ List m19290d(C4394a aVar, Context context, List list, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return aVar.m19289c(context, list, str);
    }

    /* renamed from: a */
    public final List<Album> mo14953a(Context context) {
        C8594l.m46771e(context, "context");
        return m19290d(this, context, C4423k.m19335o(context, (String) null, 2, (Object) null), (String) null, 4, (Object) null);
    }

    /* renamed from: b */
    public final List<Album> mo14954b(Context context, long[] jArr) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "ids");
        List<Album> a = f12992a.mo14953a(context);
        ArrayList arrayList = new ArrayList();
        for (T next : a) {
            if (C8477h.m46627l(jArr, ((Album) next).mo9139f())) {
                arrayList.add(next);
            }
        }
        return C8490t.m46678C(arrayList);
    }

    /* renamed from: e */
    public final List<Album> mo14955e(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return m19289c(context, C4423k.m19335o(context, (String) null, 2, (Object) null), str);
    }
}
