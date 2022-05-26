package p159f.p166c.p181e.p182a.p183a.p188e;

import android.content.Context;
import com.coocent.music.base.data.entity.Artist;
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

/* renamed from: f.c.e.a.a.e.d */
/* compiled from: ArtistLoader.kt */
public final class C4406d {

    /* renamed from: a */
    public static final C4406d f12995a = new C4406d();

    /* renamed from: f.c.e.a.a.e.d$a */
    /* compiled from: Comparisons.kt */
    public static final class C4407a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String g = ((Artist) t).mo9161g();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(g, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = g.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String g2 = ((Artist) t2).mo9161g();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(g2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = g2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    /* renamed from: f.c.e.a.a.e.d$b */
    /* compiled from: Comparisons.kt */
    public static final class C4408b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String g = ((Artist) t2).mo9161g();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(g, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = g.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String g2 = ((Artist) t).mo9161g();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(g2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = g2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    /* renamed from: f.c.e.a.a.e.d$c */
    /* compiled from: Comparisons.kt */
    public static final class C4409c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(Integer.valueOf(((Artist) t2).mo9156d()), Integer.valueOf(((Artist) t).mo9156d()));
        }
    }

    /* renamed from: f.c.e.a.a.e.d$d */
    /* compiled from: Comparisons.kt */
    public static final class C4410d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(Integer.valueOf(((Artist) t2).mo9160f()), Integer.valueOf(((Artist) t).mo9160f()));
        }
    }

    private C4406d() {
    }

    /* renamed from: b */
    private final Artist m19300b(List<Music> list, long j) {
        Artist artist = new Artist();
        ArrayList arrayList = new ArrayList();
        for (Music next : list) {
            if (next.mo9209f() == j) {
                artist.mo9164i(j);
                artist.mo9166k(next.mo9210g());
                artist.mo9165j(artist.mo9160f() + 1);
                if (!arrayList.contains(Long.valueOf(next.mo9205d()))) {
                    arrayList.add(Long.valueOf(next.mo9205d()));
                }
            }
        }
        artist.mo9162h(arrayList.size());
        arrayList.clear();
        return artist;
    }

    /* renamed from: e */
    private final List<Artist> m19301e(Context context, List<Music> list, String str) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        try {
            for (Music next : list) {
                long f = next.mo9209f();
                String g = next.mo9210g();
                long d = next.mo9205d();
                if (!linkedHashMap.containsKey(Long.valueOf(f))) {
                    linkedHashMap.put(Long.valueOf(f), new Artist(f, g, 1, 1));
                    arrayList2.clear();
                    arrayList2.add(Long.valueOf(d));
                } else {
                    Artist artist = (Artist) linkedHashMap.get(Long.valueOf(f));
                    if (artist != null) {
                        artist.mo9165j(artist.mo9160f() + 1);
                        if (!arrayList2.contains(Long.valueOf(d))) {
                            arrayList2.add(Long.valueOf(d));
                            artist.mo9162h(artist.mo9156d() + 1);
                        }
                        linkedHashMap.put(Long.valueOf(f), artist);
                    }
                }
            }
            for (Number longValue : linkedHashMap.keySet()) {
                Artist artist2 = (Artist) linkedHashMap.get(Long.valueOf(longValue.longValue()));
                if (artist2 != null) {
                    if (str2 != null) {
                        String g2 = artist2.mo9161g();
                        Locale locale = Locale.getDefault();
                        C8594l.m46770d(locale, "Locale.getDefault()");
                        if (g2 != null) {
                            String lowerCase = g2.toLowerCase(locale);
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
                    arrayList.add(artist2);
                }
            }
            C4441e n = C4441e.m19454n(context);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String e = n.mo15113e();
            if (e != null) {
                switch (e.hashCode()) {
                    case -1968390501:
                        if (e.equals("number_of_albums DESC") && arrayList.size() > 1) {
                            C8486p.m46674o(arrayList, new C4409c());
                            break;
                        }
                    case -1881408086:
                        if (e.equals("artist_key DESC") && arrayList.size() > 1) {
                            C8486p.m46674o(arrayList, new C4408b());
                            break;
                        }
                    case 91790455:
                        if (e.equals("number_of_tracks DESC") && arrayList.size() > 1) {
                            C8486p.m46674o(arrayList, new C4410d());
                            break;
                        }
                    case 630239591:
                        if (e.equals("artist_key") && arrayList.size() > 1) {
                            C8486p.m46674o(arrayList, new C4407a());
                            break;
                        }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: f */
    static /* synthetic */ List m19302f(C4406d dVar, Context context, List list, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return dVar.m19301e(context, list, str);
    }

    /* renamed from: a */
    public final Artist mo14968a(Context context, long j) {
        C8594l.m46771e(context, "context");
        return m19300b(C4423k.m19335o(context, (String) null, 2, (Object) null), j);
    }

    /* renamed from: c */
    public final List<Artist> mo14969c(Context context) {
        C8594l.m46771e(context, "context");
        return m19302f(this, context, C4423k.m19332k(context, "artist_id"), (String) null, 4, (Object) null);
    }

    /* renamed from: d */
    public final List<Artist> mo14970d(Context context, long[] jArr) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "ids");
        List<Artist> c = mo14969c(context);
        ArrayList arrayList = new ArrayList();
        for (T next : c) {
            if (C8477h.m46627l(jArr, ((Artist) next).mo9158e())) {
                arrayList.add(next);
            }
        }
        return C8490t.m46678C(arrayList);
    }

    /* renamed from: g */
    public final List<Artist> mo14971g(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return m19301e(context, C4423k.m19332k(context, "artist_id"), str);
    }
}
