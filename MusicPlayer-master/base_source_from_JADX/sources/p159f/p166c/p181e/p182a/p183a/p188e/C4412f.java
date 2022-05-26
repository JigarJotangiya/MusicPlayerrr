package p159f.p166c.p181e.p182a.p183a.p188e;

import android.content.Context;
import com.coocent.music.base.data.entity.Folder;
import com.coocent.music.base.data.entity.Music;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p183a.p189f.C4433b;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.e.f */
/* compiled from: FolderLoader.kt */
public final class C4412f {

    /* renamed from: a */
    public static final C4412f f12997a = new C4412f();

    /* renamed from: f.c.e.a.a.e.f$a */
    /* compiled from: Comparisons.kt */
    public static final class C4413a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String e = ((Folder) t).mo9175e();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(e, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = e.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String e2 = ((Folder) t2).mo9175e();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(e2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = e2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    /* renamed from: f.c.e.a.a.e.f$b */
    /* compiled from: Comparisons.kt */
    public static final class C4414b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(Integer.valueOf(((Folder) t2).mo9173d()), Integer.valueOf(((Folder) t).mo9173d()));
        }
    }

    /* renamed from: f.c.e.a.a.e.f$c */
    /* compiled from: Comparisons.kt */
    public static final class C4415c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String e = ((Folder) t2).mo9175e();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(e, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = e.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String e2 = ((Folder) t).mo9175e();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(e2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = e2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    private C4412f() {
    }

    /* renamed from: a */
    private final List<Folder> m19310a(Context context, List<Music> list) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                File parentFile = new File(list.get(i).mo9211h()).getParentFile();
                if (parentFile != null) {
                    String name = parentFile.getName();
                    String path = parentFile.getPath();
                    if (!linkedHashMap.containsKey(path)) {
                        C8594l.m46770d(path, "path");
                        linkedHashMap.put(path, new Folder((long) i, name, path, 1));
                    } else {
                        Folder folder = (Folder) linkedHashMap.get(path);
                        if (folder != null) {
                            folder.mo9178g(folder.mo9173d() + 1);
                            C8594l.m46770d(path, "path");
                            linkedHashMap.put(path, folder);
                        }
                    }
                }
            }
            for (String str : linkedHashMap.keySet()) {
                Folder folder2 = (Folder) linkedHashMap.get(str);
                if (folder2 != null) {
                    arrayList.add(folder2);
                }
            }
            C4441e n = C4441e.m19454n(context);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String j = n.mo15118j();
            if (j != null) {
                int hashCode = j.hashCode();
                if (hashCode != -1911936056) {
                    if (hashCode != 90810505) {
                        if (hashCode == 334844154) {
                            if (j.equals("songCount") && arrayList.size() > 1) {
                                C8486p.m46674o(arrayList, new C4414b());
                            }
                        }
                    } else if (j.equals("_data") && arrayList.size() > 1) {
                        C8486p.m46674o(arrayList, new C4413a());
                    }
                } else if (j.equals("_data DESC") && arrayList.size() > 1) {
                    C8486p.m46674o(arrayList, new C4415c());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<Folder> mo14978b(Context context) {
        C8594l.m46771e(context, "context");
        return m19310a(context, C4423k.m19335o(context, (String) null, 2, (Object) null));
    }
}
