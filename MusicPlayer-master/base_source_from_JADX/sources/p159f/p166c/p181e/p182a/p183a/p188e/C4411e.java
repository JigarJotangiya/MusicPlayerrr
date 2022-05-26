package p159f.p166c.p181e.p182a.p183a.p188e;

import android.content.Context;
import com.coocent.music.base.data.entity.Music;
import java.util.List;
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.e.e */
/* compiled from: ArtistMusicLoader.kt */
public final class C4411e {

    /* renamed from: a */
    public static final C4411e f12996a = new C4411e();

    private C4411e() {
    }

    /* renamed from: c */
    private final String m19307c(Context context) {
        if (C4434c.f13013c.mo15048a0()) {
            C4441e n = C4441e.m19454n(context);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String t = n.mo15126t();
            C8594l.m46770d(t, "MusicPreference.getInsta…e(context).trackSortOrder");
            return t;
        }
        C4441e n2 = C4441e.m19454n(context);
        C8594l.m46770d(n2, "MusicPreference.getInstance(context)");
        String f = n2.mo15114f();
        C8594l.m46770d(f, "MusicPreference.getInsta…ext).artistTrackSortOrder");
        return f;
    }

    /* renamed from: a */
    public final List<Long> mo14976a(Context context, long j) {
        C8594l.m46771e(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append("artist_id" + '=' + j);
        return C8477h.m46636u(C4423k.f13002a.mo14993h(context, sb.toString(), (String[]) null, m19307c(context)));
    }

    /* renamed from: b */
    public final List<Music> mo14977b(Context context, long j) {
        C8594l.m46771e(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append("artist_id" + '=' + j);
        return C8490t.m46678C(C4423k.m19336p(context, sb.toString(), m19307c(context), true, true, (String) null, 32, (Object) null));
    }
}
