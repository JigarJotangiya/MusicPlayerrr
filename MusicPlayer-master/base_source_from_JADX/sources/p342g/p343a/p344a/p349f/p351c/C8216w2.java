package p342g.p343a.p344a.p349f.p351c;

import android.os.Bundle;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.FragmentActivity;
import com.coocent.music.base.data.entity.Album;
import com.coocent.music.base.data.entity.Artist;
import com.coocent.music.base.data.entity.Genres;
import com.coocent.music.base.data.entity.Playlist;
import media.musicplayer.audioplayer.videoplayer.R;

/* renamed from: g.a.a.f.c.w2 */
/* compiled from: FragmentManager */
public class C8216w2 {
    /* renamed from: a */
    public static void m45357a(FragmentActivity fragmentActivity, C8133l2 l2Var, Album album) {
        if (l2Var == null) {
            try {
                l2Var = new C8133l2();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        C0620p i = fragmentActivity.mo3730H1().mo3957i();
        Bundle bundle = new Bundle();
        bundle.putLong("album_id", album.mo9139f());
        bundle.putString("album_title", album.mo9141h());
        l2Var.mo3581C2(bundle);
        i.mo4068b(R.id.fragment, l2Var);
        i.mo4073g(C8133l2.f34254A0);
        i.mo3816j();
    }

    /* renamed from: b */
    public static void m45358b(FragmentActivity fragmentActivity, Artist artist, int i) {
        try {
            C8158o2 o2Var = new C8158o2();
            C0620p i2 = fragmentActivity.mo3730H1().mo3957i();
            Bundle bundle = new Bundle();
            bundle.putLong("artist_id", artist.mo9158e());
            bundle.putString("artist_title", artist.mo9161g());
            bundle.putInt("artist_position", i);
            o2Var.mo3581C2(bundle);
            i2.mo4068b(R.id.fragment, o2Var);
            i2.mo4073g(C8158o2.f34326C0);
            i2.mo3816j();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m45359c(FragmentActivity fragmentActivity, C8194t2 t2Var, boolean z) {
        if (t2Var == null) {
            try {
                t2Var = new C8194t2();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        C0620p i = fragmentActivity.mo3730H1().mo3957i();
        i.mo4068b(R.id.fragment, t2Var);
        if (z) {
            i.mo4073g(C8071c3.f34095z0);
        }
        i.mo3816j();
    }

    /* renamed from: d */
    public static void m45360d(FragmentActivity fragmentActivity, C8200u2 u2Var, String str, String str2, boolean z) {
        if (u2Var == null) {
            try {
                u2Var = new C8200u2();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        C0620p i = fragmentActivity.mo3730H1().mo3957i();
        Bundle bundle = new Bundle();
        bundle.putString("folder_detail_path", str);
        bundle.putString("folder_detail_title", str2);
        bundle.putBoolean("slider", z);
        u2Var.mo3581C2(bundle);
        i.mo4068b(R.id.fragment, u2Var);
        i.mo4073g(C8200u2.f34440B0);
        i.mo3816j();
    }

    /* renamed from: e */
    public static void m45361e(FragmentActivity fragmentActivity, C8220x2 x2Var, Genres genres) {
        if (x2Var == null) {
            try {
                x2Var = new C8220x2();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        C0620p i = fragmentActivity.mo3730H1().mo3957i();
        Bundle bundle = new Bundle();
        bundle.putLong("genres_id", genres.mo9186d());
        bundle.putString("genres_title", genres.mo9190f());
        x2Var.mo3581C2(bundle);
        i.mo4068b(R.id.fragment, x2Var);
        i.mo4073g(C8220x2.f34496A0);
        i.mo3816j();
    }

    /* renamed from: f */
    public static void m45362f(FragmentActivity fragmentActivity, Playlist playlist, boolean z, boolean z2) {
        try {
            C0620p i = fragmentActivity.mo3730H1().mo3957i();
            i.mo4068b(R.id.fragment, C8061b3.m44266d4(playlist, 0, z2));
            if (z) {
                i.mo4073g(C8061b3.f34055L0);
            }
            i.mo3816j();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m45363g(FragmentActivity fragmentActivity, C8081d3 d3Var) {
        if (d3Var == null) {
            try {
                d3Var = new C8081d3();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        C0620p i = fragmentActivity.mo3730H1().mo3957i();
        Bundle bundle = new Bundle();
        bundle.putLong("numWeekAge", 2);
        d3Var.mo3581C2(bundle);
        i.mo4068b(R.id.fragment, d3Var);
        i.mo4073g(C8133l2.f34254A0);
        i.mo3816j();
    }

    /* renamed from: h */
    public static void m45364h(FragmentActivity fragmentActivity, C8071c3 c3Var, boolean z) {
        if (c3Var == null) {
            try {
                c3Var = new C8071c3();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        C0620p i = fragmentActivity.mo3730H1().mo3957i();
        i.mo4068b(R.id.fragment, c3Var);
        if (z) {
            i.mo4073g(C8071c3.f34095z0);
        }
        i.mo3816j();
    }
}
