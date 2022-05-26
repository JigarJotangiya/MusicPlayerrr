package p159f.p166c.p181e.p182a.p190b.p197l;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.widget.Toast;
import com.coocent.music.base.data.entity.Album;
import com.coocent.music.base.data.entity.Artist;
import com.coocent.music.base.data.entity.Folder;
import com.coocent.music.base.data.entity.Genres;
import com.coocent.music.base.data.entity.Music;
import com.coocent.music.base.data.entity.Playlist;
import com.coocent.music.base.p056ui.activity.InternetArtworkActivity;
import com.coocent.music.base.p056ui.activity.SuspensionPermissionActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p183a.p184a.C4361a;
import p159f.p166c.p181e.p182a.p183a.p184a.C4362b;
import p159f.p166c.p181e.p182a.p183a.p184a.C4363c;
import p159f.p166c.p181e.p182a.p183a.p184a.C4364d;
import p159f.p166c.p181e.p182a.p183a.p187d.C4376a;
import p159f.p166c.p181e.p182a.p183a.p187d.C4377b;
import p159f.p166c.p181e.p182a.p183a.p187d.C4379d;
import p159f.p166c.p181e.p182a.p183a.p187d.C4389e;
import p159f.p166c.p181e.p182a.p183a.p189f.C4430a;
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p159f.p166c.p181e.p182a.p190b.C4452f;
import p159f.p166c.p181e.p182a.p190b.p196k.C4472a;
import p159f.p166c.p181e.p182a.p190b.p196k.C4473b;
import p159f.p166c.p181e.p182a.p190b.p196k.C4474c;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.b.l.c */
/* compiled from: MusicBaseApi.kt */
public final class C4477c {
    /* renamed from: A */
    public static final List<Album> m19561A(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4434c.f13013c.mo15026G(context, str);
    }

    /* renamed from: A0 */
    public static final void m19562A0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4434c.f13013c.mo15087v0(context, str);
    }

    /* renamed from: B */
    public static final List<Artist> m19563B(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4434c.f13013c.mo15028H(context, str);
    }

    /* renamed from: B0 */
    public static final void m19564B0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4434c.f13013c.mo15089w0(context, str);
    }

    /* renamed from: C */
    public static final List<Music> m19565C(Context context, String str, boolean z) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4434c.f13013c.mo15030I(context, str, z);
    }

    /* renamed from: C0 */
    public static final void m19566C0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4434c.f13013c.mo15091x0(context, str);
    }

    /* renamed from: D */
    public static final List<Playlist> m19567D(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4434c.f13013c.mo15031J(context, str);
    }

    /* renamed from: D0 */
    public static final void m19568D0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4434c.f13013c.mo15093y0(context, str);
    }

    /* renamed from: E */
    public static final List<Music> m19569E(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "path");
        return C4434c.f13013c.mo15032K(context, str);
    }

    /* renamed from: E0 */
    public static final void m19570E0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "order");
        C4434c.f13013c.mo15015A0(context, str);
    }

    /* renamed from: F */
    public static final String m19571F(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15033L(context);
    }

    /* renamed from: F0 */
    public static final void m19572F0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "order");
        C4434c.f13013c.mo15095z0(context, str);
    }

    /* renamed from: G */
    public static final List<Folder> m19573G(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15034M(context);
    }

    /* renamed from: G0 */
    public static final void m19574G0(boolean z) {
        C4434c.f13013c.mo15017B0(z);
    }

    /* renamed from: H */
    public static final List<Genres> m19575H(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15035N(context);
    }

    /* renamed from: H0 */
    public static final <T> void m19576H0(Context context, long j, int i, T t) {
        C8594l.m46771e(context, "context");
        C4434c.f13013c.mo15019C0(context, j, i, t);
    }

    /* renamed from: I */
    public static final List<Music> m19577I(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15036O(context, j);
    }

    /* renamed from: I0 */
    public static final void m19578I0(Context context, long j) {
        C8594l.m46771e(context, "context");
        C4481e.m19678b(context, j);
    }

    /* renamed from: J */
    public static final String m19579J() {
        return C4434c.f13013c.mo15037P();
    }

    /* renamed from: J0 */
    public static final void m19580J0(Context context, long j) {
        C8594l.m46771e(context, "context");
        C4481e.m19679c(context, j);
    }

    /* renamed from: K */
    public static final String[] m19581K(Context context, long j, String str, String str2, String str3) {
        if (str == null) {
            str = "unKnow";
        }
        if (str2 == null) {
            str2 = "unKnow";
        }
        if (str3 == null) {
            str3 = "unKnow";
        }
        if (context != null) {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    C4377b bVar = C4377b.f12966a;
                    return C4377b.m19244d(context, j, str, str2, str3);
                }
                return new String[]{str, str2, str3};
            } catch (Exception e) {
                e.printStackTrace();
                return new String[]{str, str2, str3};
            }
        } else {
            return new String[]{str, str2, str3};
        }
    }

    /* renamed from: K0 */
    public static final void m19582K0(Context context) {
        C8594l.m46771e(context, "context");
        SuspensionPermissionActivity.f8258C.mo9285a(context, 1028);
    }

    /* renamed from: L */
    public static final List<Music> m19583L(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15038Q(context);
    }

    /* renamed from: L0 */
    public static final void m19584L0(Fragment fragment, C4473b bVar) {
        C8594l.m46771e(fragment, "fragment");
        C8594l.m46771e(bVar, "floatWindowPermissionListener");
        C4472a.f13059a.mo15174b(bVar);
        SuspensionPermissionActivity.f8258C.mo9286b(fragment, 1028);
    }

    /* renamed from: M */
    public static final List<Music> m19585M(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15039R(context);
    }

    /* renamed from: M0 */
    public static final void m19586M0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "musicName");
        C4474c cVar = C4474c.f13061a;
        C4474c.m19557b(context, str);
    }

    /* renamed from: N */
    public static final String m19587N(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15040S(context);
    }

    /* renamed from: N0 */
    public static final void m19588N0(Context context, String str, C4361a aVar) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "musicName");
        C8594l.m46771e(aVar, "bindLyricListener");
        C4474c.f13061a.mo15177c(context, str, aVar);
    }

    /* renamed from: O */
    public static final Playlist m19589O(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15041T(context, j);
    }

    /* renamed from: O0 */
    public static final int m19590O0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15021D0(context, j);
    }

    /* renamed from: P */
    public static final List<Music> m19591P(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15042U(context, j);
    }

    /* renamed from: P0 */
    public static final int m19592P0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15023E0(context, j);
    }

    /* renamed from: Q */
    public static final String m19593Q(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15043V(context);
    }

    /* renamed from: Q0 */
    public static final int m19594Q0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15025F0(context, j, "Favorites");
    }

    /* renamed from: R */
    public static final String m19595R(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15044W(context);
    }

    /* renamed from: R0 */
    public static final int m19596R0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15025F0(context, j, "Favorites");
    }

    /* renamed from: S */
    public static final List<Playlist> m19597S(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15045X(context);
    }

    /* renamed from: S0 */
    public static final int m19598S0(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15027G0(context, j);
    }

    /* renamed from: T */
    public static final List<Playlist> m19599T(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15046Y(context);
    }

    /* renamed from: T0 */
    public static final void m19600T0(Activity activity, long j, String str, String str2, String str3, String str4, C4363c cVar) {
        Activity activity2 = activity;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        C8594l.m46771e(activity, "activity");
        String str8 = str;
        C8594l.m46771e(str, "oldTitle");
        C8594l.m46771e(str2, "newTitle");
        C8594l.m46771e(str3, "newAlbum");
        C8594l.m46771e(str4, "newArtist");
        C8594l.m46771e(cVar, "changeMusicInfoListener");
        if (m19613d(activity, str2, str3, str4)) {
            cVar.mo14801a(false, j, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        } else {
            C4434c.f13013c.mo15029H0(activity, j, str, str2, str3, str4, cVar);
        }
    }

    /* renamed from: U */
    public static final List<Music> m19601U(Context context, int i) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15047Z(context, i);
    }

    /* renamed from: V */
    public static final String m19602V(Context context, long j, int i) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15050b0(context, j, i);
    }

    /* renamed from: W */
    public static final String m19603W(Context context, long j, long j2, int i) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15052c0(context, j, j2, i);
    }

    /* renamed from: X */
    public static final void m19604X(Context context) {
        C8594l.m46771e(context, "context");
        m19605Y(context, true);
    }

    /* renamed from: Y */
    public static final void m19605Y(Context context, boolean z) {
        C8594l.m46771e(context, "context");
        C4434c.f13013c.mo15054d0(context, z);
    }

    /* renamed from: Z */
    public static final void m19606Z(Context context, C4364d dVar) {
        C8594l.m46771e(dVar, "initPlaylistInfoListener");
        if (context != null) {
            C4434c.f13013c.mo15057f0(context, dVar);
        }
    }

    /* renamed from: a */
    public static final int m19607a(Context context, long[] jArr, long j) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "musicIds");
        return C4434c.f13013c.mo15049b(context, jArr, j);
    }

    /* renamed from: a0 */
    public static final void m19608a0(Context context, int i, int i2, Intent intent) {
        C8594l.m46771e(context, "context");
        if (i == 1020) {
            m19636o0(context, i2, intent);
        } else if (i == 1021 && i2 == 1022) {
            m19642r0(context, intent);
        } else if (i == 1023) {
            m19638p0(i2, intent);
        } else if (i == 1026) {
            m19640q0(i2);
        } else if (i == 1029) {
            m19634n0(i2, intent);
        }
    }

    /* renamed from: b */
    public static final boolean m19609b(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15051c(context, j);
    }

    /* renamed from: b0 */
    public static final void m19610b0(Activity activity, long j, int i, int i2, C4362b bVar) {
        C8594l.m46771e(activity, "activity");
        C8594l.m46771e(bVar, "changeArtWorkListener");
        try {
            C4376a.f12965e.mo14926l(j, i, i2, bVar);
            activity.startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1020);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static final boolean m19611c(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15053d(context, j);
    }

    /* renamed from: c0 */
    public static final void m19612c0(androidx.fragment.app.Fragment fragment, long j, int i, int i2, C4362b bVar) {
        C8594l.m46771e(fragment, "fragment");
        C8594l.m46771e(bVar, "changeArtWorkListener");
        try {
            C4376a.f12965e.mo14926l(j, i, i2, bVar);
            fragment.mo3634T2(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1020);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private static final boolean m19613d(Context context, String str, String str2, String str3) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = C8594l.m46773g(str.charAt(!z ? i : length), 32) <= 0;
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!z2) {
                break;
            } else {
                length--;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            Toast.makeText(context, C4452f.music_name_not_null, 0).show();
            return true;
        }
        int length2 = str2.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = C8594l.m46773g(str2.charAt(!z3 ? i2 : length2), 32) <= 0;
            if (!z3) {
                if (!z4) {
                    z3 = true;
                } else {
                    i2++;
                }
            } else if (!z4) {
                break;
            } else {
                length2--;
            }
        }
        if (str2.subSequence(i2, length2 + 1).toString().length() == 0) {
            Toast.makeText(context, C4452f.music_album_not_null, 0).show();
            return true;
        }
        int length3 = str3.length() - 1;
        int i3 = 0;
        boolean z5 = false;
        while (i3 <= length3) {
            boolean z6 = C8594l.m46773g(str3.charAt(!z5 ? i3 : length3), 32) <= 0;
            if (!z5) {
                if (!z6) {
                    z5 = true;
                } else {
                    i3++;
                }
            } else if (!z6) {
                break;
            } else {
                length3--;
            }
        }
        if (str3.subSequence(i3, length3 + 1).toString().length() == 0) {
            Toast.makeText(context, C4452f.music_artist_not_null, 0).show();
            return true;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        if (C8437p.m46566v(C8437p.m46563l0(str).toString(), ",", false, 2, (Object) null)) {
            Toast.makeText(context, C4452f.input_can_not_contain, 0).show();
            return true;
        }
        Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.CharSequence");
        if (C8437p.m46566v(C8437p.m46563l0(str3).toString(), ",", false, 2, (Object) null)) {
            Toast.makeText(context, C4452f.input_can_not_contain, 0).show();
            return true;
        }
        Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
        if (C8437p.m46566v(C8437p.m46563l0(str2).toString(), ",", false, 2, (Object) null)) {
            Toast.makeText(context, C4452f.input_can_not_contain, 0).show();
            return true;
        }
        int length4 = str3.length() - 1;
        int i4 = 0;
        boolean z7 = false;
        while (i4 <= length4) {
            boolean z8 = C8594l.m46773g(str3.charAt(!z7 ? i4 : length4), 32) <= 0;
            if (!z7) {
                if (!z8) {
                    z7 = true;
                } else {
                    i4++;
                }
            } else if (!z8) {
                break;
            } else {
                length4--;
            }
        }
        if (str3.subSequence(i4, length4 + 1).toString().length() > 100) {
            Toast.makeText(context, C4452f.name_limit_100, 0).show();
            return true;
        }
        int length5 = str2.length() - 1;
        int i5 = 0;
        boolean z9 = false;
        while (i5 <= length5) {
            boolean z10 = C8594l.m46773g(str2.charAt(!z9 ? i5 : length5), 32) <= 0;
            if (!z9) {
                if (!z10) {
                    z9 = true;
                } else {
                    i5++;
                }
            } else if (!z10) {
                break;
            } else {
                length5--;
            }
        }
        if (str2.subSequence(i5, length5 + 1).toString().length() > 100) {
            Toast.makeText(context, C4452f.name_limit_100, 0).show();
            return true;
        }
        int length6 = str.length() - 1;
        int i6 = 0;
        boolean z11 = false;
        while (i6 <= length6) {
            boolean z12 = C8594l.m46773g(str.charAt(!z11 ? i6 : length6), 32) <= 0;
            if (!z11) {
                if (!z12) {
                    z11 = true;
                } else {
                    i6++;
                }
            } else if (!z12) {
                break;
            } else {
                length6--;
            }
        }
        if (str.subSequence(i6, length6 + 1).toString().length() <= 100) {
            return false;
        }
        Toast.makeText(context, C4452f.name_limit_100, 0).show();
        return true;
    }

    /* renamed from: d0 */
    public static final void m19614d0(androidx.fragment.app.Fragment fragment, long j, int i, C4362b bVar) {
        C8594l.m46771e(fragment, "fragment");
        C8594l.m46771e(bVar, "changeArtWorkListener");
        m19616e0(fragment, j, i, 0, bVar, 8, (Object) null);
    }

    /* renamed from: e */
    public static final boolean m19615e(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15055e(context, j, "Favorites");
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m19616e0(androidx.fragment.app.Fragment fragment, long j, int i, int i2, C4362b bVar, int i3, Object obj) {
        m19612c0(fragment, j, i, (i3 & 8) != 0 ? -1 : i2, bVar);
    }

    /* renamed from: f */
    public static final boolean m19617f(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15055e(context, j, "Favorites");
    }

    /* renamed from: f0 */
    public static final void m19618f0(Activity activity, long j, int i, int i2, String str, C4362b bVar) {
        C8594l.m46771e(activity, "activity");
        C8594l.m46771e(bVar, "changeArtWorkListener");
        C4376a.f12965e.mo14926l(j, i, i2, bVar);
        InternetArtworkActivity.m11082E2(activity, j, i, i2, str);
    }

    /* renamed from: g */
    public static final boolean m19619g(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15056f(context, j);
    }

    /* renamed from: g0 */
    public static final void m19620g0(androidx.fragment.app.Fragment fragment, long j, int i, int i2, String str, C4362b bVar) {
        C8594l.m46771e(fragment, "fragment");
        C8594l.m46771e(bVar, "changeArtWorkListener");
        C4376a.f12965e.mo14926l(j, i, i2, bVar);
        InternetArtworkActivity.m11083F2(fragment, j, i, i2, str);
    }

    /* renamed from: h */
    public static final long m19621h(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4434c.f13013c.mo15058g(context, str);
    }

    /* renamed from: h0 */
    public static final void m19622h0(androidx.fragment.app.Fragment fragment, long j, int i, String str, C4362b bVar) {
        C8594l.m46771e(fragment, "fragment");
        C8594l.m46771e(bVar, "changeArtWorkListener");
        m19620g0(fragment, j, i, -1, str, bVar);
    }

    /* renamed from: i */
    public static final void m19623i(Object obj, long j, C4379d.C4380a aVar) {
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(aVar, "deleteMusicListener");
        C4434c.f13013c.mo15059h(obj, j, aVar);
    }

    /* renamed from: i0 */
    public static final int m19624i0(Context context, long[] jArr, long j) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "musicIds");
        return C4434c.f13013c.mo15061i0(context, jArr, j);
    }

    /* renamed from: j */
    public static final void m19625j(Object obj, long j, C4379d.C4380a aVar) {
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(aVar, "deleteMusicListener");
        C4434c.f13013c.mo15060i(obj, j, aVar);
    }

    /* renamed from: j0 */
    public static final int m19626j0(Context context, String str, long j) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        return C4434c.f13013c.mo15063j0(context, str, j);
    }

    /* renamed from: k */
    public static final void m19627k(Object obj, long[] jArr, C4379d.C4380a aVar) {
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(jArr, "ids");
        C8594l.m46771e(aVar, "deleteMusicListener");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            long j = jArr[i];
            i++;
            arrayList.add(Long.valueOf(j));
        }
        C4434c.f13013c.mo15066l(obj, arrayList, aVar);
    }

    /* renamed from: k0 */
    public static final void m19628k0(Context context) {
        C8594l.m46771e(context, "context");
        C4434c.f13013c.mo15065k0(context);
    }

    /* renamed from: l */
    public static final int m19629l(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15068m(context, j);
    }

    /* renamed from: l0 */
    public static final void m19630l0(Context context, long j, int i) {
        C8594l.m46771e(context, "context");
        C4434c.f13013c.mo15067l0(context, j, i);
    }

    /* renamed from: m */
    public static final int m19631m(Context context, long j, String str, String str2, String str3) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "playlistName");
        C8594l.m46771e(str2, "artworkUrl");
        C8594l.m46771e(str3, "description");
        return C4434c.f13013c.mo15070n(context, j, str, str2, str3);
    }

    /* renamed from: m0 */
    public static final void m19632m0(String str, C4361a aVar) {
        C8594l.m46771e(str, "musicName");
        C8594l.m46771e(aVar, "bindLyricListener");
        C4474c.f13061a.mo15176a(str, aVar);
    }

    /* renamed from: n */
    public static final List<Album> m19633n(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15074p(context);
    }

    /* renamed from: n0 */
    public static final void m19634n0(int i, Intent intent) {
        if (i == -1 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("hasFloatWindowPermission", false);
            int intExtra = intent.getIntExtra("permissionType", 1027);
            C4472a aVar = C4472a.f13059a;
            C4473b a = aVar.mo15173a();
            if (a != null) {
                a.mo15175a(intExtra, booleanExtra);
            }
            aVar.mo15174b((C4473b) null);
        }
    }

    /* renamed from: o */
    public static final List<Music> m19635o(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15080s(context, j);
    }

    /* renamed from: o0 */
    private static final void m19636o0(Context context, int i, Intent intent) {
        String str;
        boolean z;
        if (i == -1) {
            if (intent != null) {
                Uri data = intent.getData();
                C4376a aVar = C4376a.f12965e;
                m19576H0(context, aVar.mo14920c(), aVar.mo14922e(), data);
                str = String.valueOf(data);
                z = true;
            } else {
                str = BuildConfig.FLAVOR;
                z = false;
            }
            C4376a aVar2 = C4376a.f12965e;
            C4362b b = aVar2.mo14919b();
            if (b != null) {
                b.mo14800H0(z, aVar2.mo14920c(), str, aVar2.mo14922e(), aVar2.mo14921d());
            }
        } else {
            C4376a.f12965e.mo14924j();
        }
        C4376a.f12965e.mo14925k((C4362b) null);
    }

    /* renamed from: p */
    public static final String m19637p(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15082t(context);
    }

    /* renamed from: p0 */
    private static final void m19638p0(int i, Intent intent) {
        if (i == -1) {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    C4389e eVar = C4389e.f12981f;
                    C4389e.C4391b c = eVar.mo14948c();
                    if (c != null) {
                        c.mo14951a(intent);
                    }
                    eVar.mo14949j((C4389e.C4391b) null);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (Build.VERSION.SDK_INT >= 29) {
            C4389e eVar2 = C4389e.f12981f;
            C4389e.C4391b c2 = eVar2.mo14948c();
            if (c2 != null) {
                c2.mo14952b();
            }
            eVar2.mo14949j((C4389e.C4391b) null);
        }
    }

    /* renamed from: q */
    public static final List<Album> m19639q(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15084u(context, j);
    }

    /* renamed from: q0 */
    public static final void m19640q0(int i) {
        if (i == -1) {
            C4379d dVar = C4379d.f12971b;
            C4379d.C4381b i2 = dVar.mo14941i();
            if (i2 != null) {
                i2.mo14946a();
            }
            dVar.mo14942k((C4379d.C4381b) null);
        }
    }

    /* renamed from: r */
    public static final Artist m19641r(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15086v(context, j);
    }

    /* renamed from: r0 */
    private static final void m19642r0(Context context, Intent intent) {
        String str;
        boolean z;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("artwork_url");
            C4376a aVar = C4376a.f12965e;
            m19576H0(context, aVar.mo14920c(), aVar.mo14922e(), stringExtra);
            str = stringExtra;
            z = true;
        } else {
            str = BuildConfig.FLAVOR;
            z = false;
        }
        C4376a aVar2 = C4376a.f12965e;
        C4362b b = aVar2.mo14919b();
        if (b != null) {
            b.mo14800H0(z, aVar2.mo14920c(), str, aVar2.mo14922e(), aVar2.mo14921d());
        }
        aVar2.mo14925k((C4362b) null);
    }

    /* renamed from: s */
    public static final List<Artist> m19643s(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15088w(context);
    }

    /* renamed from: s0 */
    public static final void m19644s0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4434c.f13013c.mo15071n0(context, str);
    }

    /* renamed from: t */
    public static final List<Music> m19645t(Context context, long j) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15094z(context, j);
    }

    /* renamed from: t0 */
    public static final void m19646t0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4434c.f13013c.mo15073o0(context, str);
    }

    /* renamed from: u */
    public static final String m19647u(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15014A(context);
    }

    /* renamed from: u0 */
    public static final void m19648u0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4434c.f13013c.mo15075p0(context, str);
    }

    /* renamed from: v */
    public static final List<Album> m19649v(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15016B(context);
    }

    /* renamed from: v0 */
    public static final void m19650v0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4434c.f13013c.mo15077q0(context, str);
    }

    /* renamed from: w */
    public static final List<Artist> m19651w(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15018C(context);
    }

    /* renamed from: w0 */
    public static final void m19652w0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4434c.f13013c.mo15079r0(context, str);
    }

    /* renamed from: x */
    public static final List<Music> m19653x(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15020D(context);
    }

    /* renamed from: x0 */
    public static final void m19654x0(C4430a.C4431a aVar) {
        C8594l.m46771e(aVar, "focusChangeListener");
        C4434c.f13013c.mo15081s0(aVar);
    }

    /* renamed from: y */
    public static final Playlist m19655y(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15022E(context, "Favorites");
    }

    /* renamed from: y0 */
    public static final void m19656y0(Context context, int i) {
        C8594l.m46771e(context, "context");
        C4434c.f13013c.mo15083t0(context, i);
    }

    /* renamed from: z */
    public static final List<Playlist> m19657z(Context context) {
        C8594l.m46771e(context, "context");
        return C4434c.f13013c.mo15024F(context);
    }

    /* renamed from: z0 */
    public static final void m19658z0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4434c.f13013c.mo15085u0(context, str);
    }
}
