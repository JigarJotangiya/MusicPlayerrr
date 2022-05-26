package p159f.p166c.p181e.p182a.p183a.p188e;

import android.content.Context;
import com.coocent.music.base.data.entity.Music;
import java.util.List;
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.e.b */
/* compiled from: AlbumMusicLoader.kt */
public final class C4400b {

    /* renamed from: a */
    public static final C4400b f12993a = new C4400b();

    private C4400b() {
    }

    /* renamed from: c */
    private final String m19294c(Context context) {
        if (C4434c.f13013c.mo15048a0()) {
            C4441e n = C4441e.m19454n(context);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String t = n.mo15126t();
            C8594l.m46770d(t, "MusicPreference.getInsta…e(context).trackSortOrder");
            return t;
        }
        C4441e n2 = C4441e.m19454n(context);
        C8594l.m46770d(n2, "MusicPreference.getInstance(context)");
        String b = n2.mo15110b();
        C8594l.m46770d(b, "MusicPreference.getInsta…text).albumTrackSortOrder");
        return b;
    }

    /* renamed from: a */
    public final List<Long> mo14961a(Context context, long j) {
        C8594l.m46771e(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append("album_id" + '=' + j);
        return C8477h.m46636u(C4423k.f13002a.mo14993h(context, sb.toString(), (String[]) null, m19294c(context)));
    }

    /* renamed from: b */
    public final List<Music> mo14962b(Context context, long j) {
        C8594l.m46771e(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append("album_id" + '=' + j);
        return C8490t.m46678C(C4423k.m19336p(context, sb.toString(), m19294c(context), true, true, (String) null, 32, (Object) null));
    }
}
