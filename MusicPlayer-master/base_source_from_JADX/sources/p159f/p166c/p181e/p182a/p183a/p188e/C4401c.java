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
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.e.c */
/* compiled from: ArtistAlbumLoader.kt */
public final class C4401c {

    /* renamed from: a */
    public static final C4401c f12994a = new C4401c();

    /* renamed from: f.c.e.a.a.e.c$a */
    /* compiled from: Comparisons.kt */
    public static final class C4402a<T> implements Comparator<T> {
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

    /* renamed from: f.c.e.a.a.e.c$b */
    /* compiled from: Comparisons.kt */
    public static final class C4403b<T> implements Comparator<T> {
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

    /* renamed from: f.c.e.a.a.e.c$c */
    /* compiled from: Comparisons.kt */
    public static final class C4404c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(Integer.valueOf(((Album) t2).mo9140g()), Integer.valueOf(((Album) t).mo9140g()));
        }
    }

    /* renamed from: f.c.e.a.a.e.c$d */
    /* compiled from: Comparisons.kt */
    public static final class C4405d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(Integer.valueOf(((Album) t2).mo9143i()), Integer.valueOf(((Album) t).mo9143i()));
        }
    }

    private C4401c() {
    }

    /* renamed from: a */
    private final List<Album> m19297a(Context context, List<Music> list, long j) {
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
                if (album3 != null && j == album3.mo9135d()) {
                    arrayList.add(album3);
                }
            }
            String c = m19298c(context);
            switch (c.hashCode()) {
                case 249789583:
                    if (c.equals("album_key") && arrayList.size() > 1) {
                        C8486p.m46674o(arrayList, new C4402a());
                        break;
                    }
                case 504021881:
                    if (c.equals("numsongs DESC") && arrayList.size() > 1) {
                        C8486p.m46674o(arrayList, new C4404c());
                        break;
                    }
                case 802574978:
                    if (c.equals("minyear DESC") && arrayList.size() > 1) {
                        C8486p.m46674o(arrayList, new C4405d());
                        break;
                    }
                case 1439820674:
                    if (c.equals("album_key DESC") && arrayList.size() > 1) {
                        C8486p.m46674o(arrayList, new C4403b());
                        break;
                    }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: c */
    private final String m19298c(Context context) {
        if (C4434c.f13013c.mo15048a0()) {
            C4441e n = C4441e.m19454n(context);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String a = n.mo15109a();
            C8594l.m46770d(a, "MusicPreference.getInsta…e(context).albumSortOrder");
            return a;
        }
        C4441e n2 = C4441e.m19454n(context);
        C8594l.m46770d(n2, "MusicPreference.getInstance(context)");
        String d = n2.mo15112d();
        C8594l.m46770d(d, "MusicPreference.getInsta…ext).artistAlbumSortOrder");
        return d;
    }

    /* renamed from: b */
    public final List<Album> mo14963b(Context context, long j) {
        C8594l.m46771e(context, "context");
        return m19297a(context, C4411e.f12996a.mo14977b(context, j), j);
    }
}
