package p082e.p126k.p129c;

import java.io.InputStream;
import p082e.p126k.p127b.C3813a;
import p082e.p126k.p129c.p131j.C3911c0;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: e.k.c.d */
/* compiled from: PreferencesMapCompat.kt */
public final class C3867d {

    /* renamed from: a */
    public static final C3868a f11963a = new C3868a((C8589g) null);

    /* renamed from: e.k.c.d$a */
    /* compiled from: PreferencesMapCompat.kt */
    public static final class C3868a {
        private C3868a() {
        }

        public /* synthetic */ C3868a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final C3870f mo13354a(InputStream inputStream) {
            C8594l.m46771e(inputStream, "input");
            try {
                C3870f S = C3870f.m16530S(inputStream);
                C8594l.m46770d(S, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return S;
            } catch (C3911c0 e) {
                throw new C3813a("Unable to parse preferences proto.", e);
            }
        }
    }
}
