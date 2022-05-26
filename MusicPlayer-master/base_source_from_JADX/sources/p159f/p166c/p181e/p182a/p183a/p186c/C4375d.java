package p159f.p166c.p181e.p182a.p183a.p186c;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import com.coocent.music.base.data.entity.Album;
import com.coocent.music.base.data.entity.Artist;
import com.coocent.music.base.data.entity.Folder;
import com.coocent.music.base.data.entity.Genres;
import com.coocent.music.base.data.entity.Music;
import com.coocent.music.base.data.entity.Playlist;
import java.util.List;
import p159f.p166c.p181e.p182a.p183a.p184a.C4363c;
import p159f.p166c.p181e.p182a.p183a.p185b.C4366b;
import p159f.p166c.p181e.p182a.p183a.p185b.C4368c;
import p159f.p166c.p181e.p182a.p183a.p185b.C4370d;
import p159f.p166c.p181e.p182a.p183a.p187d.C4376a;
import p159f.p166c.p181e.p182a.p183a.p187d.C4379d;
import p159f.p166c.p181e.p182a.p183a.p188e.C4394a;
import p159f.p166c.p181e.p182a.p183a.p188e.C4400b;
import p159f.p166c.p181e.p182a.p183a.p188e.C4401c;
import p159f.p166c.p181e.p182a.p183a.p188e.C4406d;
import p159f.p166c.p181e.p182a.p183a.p188e.C4411e;
import p159f.p166c.p181e.p182a.p183a.p188e.C4412f;
import p159f.p166c.p181e.p182a.p183a.p188e.C4416g;
import p159f.p166c.p181e.p182a.p183a.p188e.C4417h;
import p159f.p166c.p181e.p182a.p183a.p188e.C4421i;
import p159f.p166c.p181e.p182a.p183a.p188e.C4423k;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.c.d */
/* compiled from: MusicFunctionCompatIml.kt */
public final class C4375d implements C4374c {
    /* renamed from: A */
    public int mo14846A(Context context, long j, String str, String str2, String str3) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "playlistName");
        C8594l.m46771e(str2, "artworkUrl");
        C8594l.m46771e(str3, "description");
        return C4370d.f12958c.mo14843a(context).mo14834q(context, j, str, str2, str3);
    }

    /* renamed from: B */
    public List<Album> mo14847B(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4394a.f12992a.mo14955e(context, str);
    }

    /* renamed from: C */
    public boolean mo14848C(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4370d.f12958c.mo14843a(context).mo14829k(context, j);
    }

    /* renamed from: D */
    public List<Artist> mo14849D(Context context) {
        C8594l.m46771e(context, "context");
        return C4406d.f12995a.mo14969c(context);
    }

    /* renamed from: E */
    public int mo14850E(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4366b.f12952c.mo14810a(context).mo14809h(j);
    }

    /* renamed from: F */
    public void mo14851F(Object obj, long j, C4379d.C4380a aVar) {
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(aVar, "deleteMusicListener");
        C4379d.f12971b.mo14938d(obj, j, aVar);
    }

    /* renamed from: G */
    public List<Playlist> mo14852G(Context context) {
        C8594l.m46771e(context, "context");
        return C4370d.f12958c.mo14843a(context).mo14841y(context, false);
    }

    /* renamed from: H */
    public List<Music> mo14853H(Context context) {
        C8594l.m46771e(context, "context");
        C4423k kVar = C4423k.f13002a;
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        return kVar.mo14995m(context, n.mo15126t(), true);
    }

    /* renamed from: I */
    public String mo14854I(Context context) {
        C8594l.m46771e(context, "context");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String e = n.mo15113e();
        C8594l.m46770d(e, "MusicPreference.getInsta…(context).artistSortOrder");
        return e;
    }

    /* renamed from: J */
    public void mo14855J(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15132z(str);
    }

    /* renamed from: K */
    public void mo14856K(Object obj, long j, String str, ContentValues contentValues, C4363c cVar) {
        C8594l.m46771e(obj, "objects");
        C8594l.m46771e(str, "oldTitle");
        C8594l.m46771e(contentValues, "contentValues");
        C8594l.m46771e(cVar, "changeMusicInfoListener");
        if (Build.VERSION.SDK_INT >= 29) {
            C4372a.f12960a.mo14844a(obj, j, str, contentValues, cVar);
        } else {
            C4373b.m19086a(obj, j, str, contentValues, cVar);
        }
    }

    /* renamed from: L */
    public void mo14857L(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15097A(str);
    }

    /* renamed from: M */
    public List<Music> mo14858M(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4411e.f12996a.mo14977b(context, j);
    }

    /* renamed from: N */
    public void mo14859N(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15131y(str);
    }

    /* renamed from: O */
    public int mo14860O(Context context, long[] jArr) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "musicIds");
        return C4370d.f12958c.mo14843a(context).mo14832o(context, jArr);
    }

    /* renamed from: P */
    public List<Playlist> mo14861P(Context context) {
        C8594l.m46771e(context, "context");
        return C4370d.f12958c.mo14843a(context).mo14841y(context, true);
    }

    /* renamed from: Q */
    public <T> void mo14862Q(Context context, long j, int i, T t) {
        C8594l.m46771e(context, "context");
        C4376a.f12965e.mo14927m(context, j, i, t);
    }

    /* renamed from: R */
    public void mo14863R(Context context) {
        C8594l.m46771e(context, "context");
        C4370d.f12958c.mo14843a(context).mo14830m(context);
    }

    /* renamed from: S */
    public List<Artist> mo14864S(Context context) {
        C8594l.m46771e(context, "context");
        return C4368c.f12955c.mo14816a(context).mo14813f(context);
    }

    /* renamed from: T */
    public List<Music> mo14865T(Context context, String str, boolean z) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4423k.f13002a.mo14998u(context, str, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0103 A[SYNTHETIC] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14866U(android.content.Context r15) {
        /*
            r14 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r15, r0)
            f.c.e.a.a.b.d$a r0 = p159f.p166c.p181e.p182a.p183a.p185b.C4370d.f12958c
            f.c.e.a.a.b.d r0 = r0.mo14843a(r15)
            r1 = 0
            java.util.List r0 = r0.mo14841y(r15, r1)
            f.c.e.a.a.e.k r2 = p159f.p166c.p181e.p182a.p183a.p188e.C4423k.f13002a
            java.util.ArrayList r2 = r2.mo14991e(r15)
            int r3 = r0.size()
            r4 = 0
        L_0x001b:
            if (r4 >= r3) goto L_0x0107
            f.c.e.a.a.b.d$a r5 = p159f.p166c.p181e.p182a.p183a.p185b.C4370d.f12958c
            f.c.e.a.a.b.d r5 = r5.mo14843a(r15)
            java.lang.Object r6 = r0.get(r4)
            com.coocent.music.base.data.entity.Playlist r6 = (com.coocent.music.base.data.entity.Playlist) r6
            long[] r6 = r6.mo9241f()
            java.lang.String r7 = r5.mo14842z(r6)
            java.lang.String r5 = ","
            java.lang.String[] r8 = new java.lang.String[]{r5}
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            java.util.List r6 = p369i.p376f0.C8437p.m46547V(r7, r8, r9, r10, r11, r12)
            java.util.List r6 = p369i.p377u.C8490t.m46678C(r6)
            r7 = 1
            int r8 = r6.size()     // Catch:{ Exception -> 0x007d }
            java.util.Iterator r9 = r6.iterator()     // Catch:{ Exception -> 0x007b }
            r10 = 0
        L_0x004d:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x0079 }
            if (r11 == 0) goto L_0x0083
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0079 }
            int r12 = r11.length()     // Catch:{ Exception -> 0x0079 }
            if (r12 <= 0) goto L_0x0061
            r12 = 1
            goto L_0x0062
        L_0x0061:
            r12 = 0
        L_0x0062:
            if (r12 == 0) goto L_0x004d
            long r12 = java.lang.Long.parseLong(r11)     // Catch:{ Exception -> 0x0079 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0079 }
            boolean r12 = r2.contains(r12)     // Catch:{ Exception -> 0x0079 }
            if (r12 != 0) goto L_0x004d
            r6.remove(r11)     // Catch:{ Exception -> 0x0079 }
            int r8 = r8 + -1
            r10 = 1
            goto L_0x004d
        L_0x0079:
            r9 = move-exception
            goto L_0x0080
        L_0x007b:
            r9 = move-exception
            goto L_0x007f
        L_0x007d:
            r9 = move-exception
            r8 = 0
        L_0x007f:
            r10 = 0
        L_0x0080:
            r9.printStackTrace()
        L_0x0083:
            if (r10 == 0) goto L_0x0103
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x008e:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x00ad
            java.lang.Object r10 = r6.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r5)
            java.lang.String r10 = r11.toString()
            r9.append(r10)
            goto L_0x008e
        L_0x00ad:
            java.lang.String r6 = r9.toString()
            java.lang.String r10 = "stringBuffer.toString()"
            p369i.p387z.p389d.C8594l.m46770d(r6, r10)
            r11 = 2
            r12 = 0
            boolean r5 = p369i.p376f0.C8436o.m46518l(r6, r5, r1, r11, r12)
            if (r5 == 0) goto L_0x00c6
            int r5 = r9.length()
            int r5 = r5 - r7
            r9.deleteCharAt(r5)
        L_0x00c6:
            com.coocent.music.base.data.entity.Playlist r5 = new com.coocent.music.base.data.entity.Playlist
            r5.<init>()
            java.lang.Object r6 = r0.get(r4)
            com.coocent.music.base.data.entity.Playlist r6 = (com.coocent.music.base.data.entity.Playlist) r6
            long r6 = r6.mo9239e()
            r5.mo9249m(r6)
            java.lang.Object r6 = r0.get(r4)
            com.coocent.music.base.data.entity.Playlist r6 = (com.coocent.music.base.data.entity.Playlist) r6
            java.lang.String r6 = r6.mo9242g()
            r5.mo9251o(r6)
            r5.mo9252p(r8)
            f.c.e.a.a.b.d$a r6 = p159f.p166c.p181e.p182a.p183a.p185b.C4370d.f12958c
            f.c.e.a.a.b.d r7 = r6.mo14843a(r15)
            java.lang.String r8 = r9.toString()
            p369i.p387z.p389d.C8594l.m46770d(r8, r10)
            long[] r7 = r7.mo14820D(r8)
            r5.mo9250n(r7)
            f.c.e.a.a.b.d r6 = r6.mo14843a(r15)
            r6.mo14823G(r5)
        L_0x0103:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p186c.C4375d.mo14866U(android.content.Context):void");
    }

    /* renamed from: V */
    public List<Genres> mo14867V(Context context) {
        C8594l.m46771e(context, "context");
        return C4417h.f12999a.mo14984a(context);
    }

    /* renamed from: W */
    public List<Folder> mo14868W(Context context) {
        C8594l.m46771e(context, "context");
        return C4412f.f12997a.mo14978b(context);
    }

    /* renamed from: X */
    public int mo14869X(Context context, String str, long j) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4370d.f12958c.mo14843a(context).mo14819C(str, j);
    }

    /* renamed from: Y */
    public void mo14870Y(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "order");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15107K(str);
    }

    /* renamed from: Z */
    public List<Album> mo14871Z(Context context) {
        C8594l.m46771e(context, "context");
        return C4366b.f12952c.mo14810a(context).mo14807f(context);
    }

    /* renamed from: a */
    public List<Artist> mo14872a(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4406d.f12995a.mo14971g(context, str);
    }

    /* renamed from: a0 */
    public void mo14873a0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15128v(str);
    }

    /* renamed from: b */
    public List<Music> mo14874b(Context context) {
        C8594l.m46771e(context, "context");
        return C4416g.f12998a.mo14983c(context);
    }

    /* renamed from: b0 */
    public String mo14875b0(Context context) {
        C8594l.m46771e(context, "context");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String r = n.mo15124r();
        C8594l.m46770d(r, "MusicPreference.getInsta…xt).playlistSongSortOrder");
        return r;
    }

    /* renamed from: c */
    public void mo14876c(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15129w(str);
    }

    /* renamed from: c0 */
    public int mo14877c0(Context context, long[] jArr, long j) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "musicIds");
        return C4370d.f12958c.mo14843a(context).mo14818B(context, jArr, j);
    }

    /* renamed from: d */
    public void mo14878d(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "order");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15106J(str);
    }

    /* renamed from: d0 */
    public boolean mo14879d0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4366b.f12952c.mo14810a(context).mo14806d(j);
    }

    /* renamed from: e */
    public String mo14880e(Context context) {
        C8594l.m46771e(context, "context");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String s = n.mo15125s();
        C8594l.m46770d(s, "MusicPreference.getInsta…ontext).playlistSortOrder");
        return s;
    }

    /* renamed from: e0 */
    public void mo14881e0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15100D(str);
    }

    /* renamed from: f */
    public boolean mo14882f(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4368c.f12955c.mo14816a(context).mo14812d(j);
    }

    /* renamed from: f0 */
    public int mo14883f0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4370d.f12958c.mo14843a(context).mo14822F(context, j);
    }

    /* renamed from: g */
    public List<Music> mo14884g(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4421i.f13000a.mo14988b(context, j);
    }

    /* renamed from: g0 */
    public List<Music> mo14885g0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4370d.f12958c.mo14843a(context).mo14840x(context, j);
    }

    /* renamed from: h */
    public List<Artist> mo14886h(Context context, long[] jArr) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "ids");
        return C4406d.f12995a.mo14970d(context, jArr);
    }

    /* renamed from: h0 */
    public void mo14887h0(Context context, int i) {
        C8594l.m46771e(context, "context");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15098B(i);
    }

    /* renamed from: i */
    public void mo14888i(Context context) {
        C8594l.m46771e(context, "context");
        C4370d.f12958c.mo14843a(context).mo14825d(context);
    }

    /* renamed from: i0 */
    public List<Album> mo14889i0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4401c.f12994a.mo14963b(context, j);
    }

    /* renamed from: j */
    public long mo14890j(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4370d.f12958c.mo14843a(context).mo14831n(context, str);
    }

    /* renamed from: j0 */
    public List<Music> mo14891j0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4400b.f12993a.mo14962b(context, j);
    }

    /* renamed from: k */
    public int mo14892k(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4368c.f12955c.mo14816a(context).mo14815h(j);
    }

    /* renamed from: k0 */
    public List<Album> mo14893k0(Context context, long[] jArr) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "ids");
        return C4394a.f12992a.mo14954b(context, jArr);
    }

    /* renamed from: l */
    public String mo14894l(Context context) {
        C8594l.m46771e(context, "context");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String t = n.mo15126t();
        C8594l.m46770d(t, "MusicPreference.getInsta…e(context).trackSortOrder");
        return t;
    }

    /* renamed from: l0 */
    public int mo14895l0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4370d.f12958c.mo14843a(context).mo14833p(j);
    }

    /* renamed from: m */
    public List<Music> mo14896m(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "path");
        return C4416g.f12998a.mo14982a(context, str);
    }

    /* renamed from: m0 */
    public void mo14897m0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15103G(str);
    }

    /* renamed from: n */
    public Playlist mo14898n(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4370d.f12958c.mo14843a(context).mo14838u(context, j);
    }

    /* renamed from: n0 */
    public boolean mo14899n0(Context context, long j, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "playlistName");
        return C4370d.f12958c.mo14843a(context).mo14828h(context, j, str);
    }

    /* renamed from: o */
    public List<Album> mo14900o(Context context) {
        C8594l.m46771e(context, "context");
        return C4394a.f12992a.mo14953a(context);
    }

    /* renamed from: o0 */
    public List<Playlist> mo14901o0(Context context) {
        C8594l.m46771e(context, "context");
        return C4370d.f12958c.mo14843a(context).mo14835r(context);
    }

    /* renamed from: p */
    public List<Long> mo14902p(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4400b.f12993a.mo14961a(context, j);
    }

    /* renamed from: p0 */
    public void mo14903p0(Object obj, List<Long> list, C4379d.C4380a aVar) {
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(list, "ids");
        C8594l.m46771e(aVar, "deleteMusicListener");
        C4379d.f12971b.mo14940h(obj, list, aVar);
    }

    /* renamed from: q */
    public int mo14904q(Context context, long j, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "playlistName");
        return C4370d.f12958c.mo14843a(context).mo14821E(context, j, str);
    }

    /* renamed from: q0 */
    public List<Long> mo14905q0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4411e.f12996a.mo14976a(context, j);
    }

    /* renamed from: r */
    public Artist mo14906r(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4406d.f12995a.mo14968a(context, j);
    }

    /* renamed from: r0 */
    public int mo14907r0(Context context, long[] jArr, long j) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "musicIds");
        return C4370d.f12958c.mo14843a(context).mo14826f(context, jArr, j);
    }

    /* renamed from: s */
    public Playlist mo14908s(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4370d.f12958c.mo14843a(context).mo14839v(context, str);
    }

    /* renamed from: s0 */
    public String mo14909s0(Context context) {
        C8594l.m46771e(context, "context");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String j = n.mo15118j();
        C8594l.m46770d(j, "MusicPreference.getInsta…(context).folderSortOrder");
        return j;
    }

    /* renamed from: t */
    public void mo14910t(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15102F(str);
    }

    /* renamed from: t0 */
    public List<Music> mo14911t0(Context context) {
        C8594l.m46771e(context, "context");
        return mo14885g0(context, mo14908s(context, "Favorites").mo9239e());
    }

    /* renamed from: u */
    public void mo14912u(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15108M(str);
    }

    /* renamed from: v */
    public void mo14913v(Object obj, long j, C4379d.C4380a aVar) {
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(aVar, "deleteMusicListener");
        C4379d.f12971b.mo14939e(obj, j, aVar);
    }

    /* renamed from: w */
    public String mo14914w(Context context) {
        C8594l.m46771e(context, "context");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String a = n.mo15109a();
        C8594l.m46770d(a, "MusicPreference.getInsta…e(context).albumSortOrder");
        return a;
    }

    /* renamed from: x */
    public List<Music> mo14915x(Context context, int i) {
        C8594l.m46771e(context, "context");
        return C4423k.f13002a.mo15000x(context, i);
    }

    /* renamed from: y */
    public List<Playlist> mo14916y(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4370d.f12958c.mo14843a(context).mo14837t(context, str);
    }

    /* renamed from: z */
    public void mo14917z(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        n.mo15101E(str);
    }
}
