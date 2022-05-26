package p159f.p166c.p181e.p182a.p183a.p187d;

import android.content.Context;
import p159f.p166c.p181e.p182a.p183a.p184a.C4362b;
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.a.d.a */
/* compiled from: ArtWorkKit.kt */
public final class C4376a {

    /* renamed from: a */
    private static C4362b f12961a = null;

    /* renamed from: b */
    private static long f12962b = -1;

    /* renamed from: c */
    private static int f12963c = -1;

    /* renamed from: d */
    private static int f12964d = -1;

    /* renamed from: e */
    public static final C4376a f12965e = new C4376a();

    private C4376a() {
    }

    /* renamed from: f */
    private final String m19231f(int i) {
        switch (i) {
            case 2:
                return "artist";
            case 3:
                return "album";
            default:
                return "song";
        }
    }

    /* renamed from: g */
    public static final String m19232g(Context context, long j, int i) {
        C8594l.m46771e(context, "context");
        String c = C4441e.m19454n(context).mo15111c(f12965e.m19231f(i), j);
        C8594l.m46770d(c, "MusicPreference.getInsta…WorkUriOrUrl(str, itemId)");
        return c;
    }

    /* renamed from: i */
    public static final void m19233i(Context context, long j, int i) {
        C8594l.m46771e(context, "context");
        C4376a aVar = f12965e;
        aVar.mo14926l(j, i, -1, (C4362b) null);
        aVar.mo14927m(context, j, i, BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public final String mo14918a(int i) {
        return m19231f(i);
    }

    /* renamed from: b */
    public final C4362b mo14919b() {
        return f12961a;
    }

    /* renamed from: c */
    public final long mo14920c() {
        return f12962b;
    }

    /* renamed from: d */
    public final int mo14921d() {
        return f12964d;
    }

    /* renamed from: e */
    public final int mo14922e() {
        return f12963c;
    }

    /* renamed from: h */
    public final String mo14923h(Context context, long j, long j2, int i) {
        C8594l.m46771e(context, "context");
        String c = C4441e.m19454n(context).mo15111c(m19231f(i), j);
        C8594l.m46770d(c, "albumUrl");
        if (!(c.length() == 0)) {
            return c;
        }
        String uri = C4434c.f13013c.mo15072o(j2).toString();
        C8594l.m46770d(uri, "DataBaseApi.getAlbumArtUri(albumId).toString()");
        return uri;
    }

    /* renamed from: j */
    public final void mo14924j() {
        f12962b = -1;
        f12963c = -1;
        f12964d = -1;
        f12961a = null;
    }

    /* renamed from: k */
    public final void mo14925k(C4362b bVar) {
        f12961a = bVar;
    }

    /* renamed from: l */
    public final void mo14926l(long j, int i, int i2, C4362b bVar) {
        f12962b = j;
        f12963c = i;
        f12964d = i2;
        f12961a = bVar;
    }

    /* renamed from: m */
    public final <T> void mo14927m(Context context, long j, int i, T t) {
        C8594l.m46771e(context, "context");
        C4441e.m19454n(context).mo15130x(mo14918a(i), j, String.valueOf(t));
    }
}
