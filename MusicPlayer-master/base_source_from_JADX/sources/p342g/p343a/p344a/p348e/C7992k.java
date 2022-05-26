package p342g.p343a.p344a.p348e;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.C0584b;
import androidx.fragment.app.FragmentActivity;
import coocent.musiclibrary.music.model.Song;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p160a.p161a.C4269f;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7952e;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.e.k */
/* compiled from: CreatePlaylistDialog */
public class C7992k extends C0584b {

    /* renamed from: q0 */
    private C7952e f33713q0;

    /* renamed from: i3 */
    public static long m43709i3(Context context, String str) {
        return C4477c.m19621h(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public /* synthetic */ void mo29535k3(C4269f fVar, CharSequence charSequence) {
        long[] longArray = mo3638V().getLongArray("songs");
        long i3 = m43709i3(mo3606L(), charSequence.toString());
        if (i3 >= 0) {
            if (longArray == null || longArray.length == 0) {
                Toast.makeText(mo3606L(), R.string.music_eq_msg_playlist_create_ok, 0).show();
                mo3831X2();
            } else {
                FragmentActivity L = mo3606L();
                if (L != null) {
                    int a = C4477c.m19607a(L, longArray, i3);
                    if (a >= 0) {
                        Toast.makeText(mo3606L(), R.string.music_eq_msg_add_songs_to_playlist_ok, 0).show();
                        mo3831X2();
                    } else if (a == -1) {
                        Toast.makeText(mo3606L(), R.string.music_eq_msg_playlist_name_exist, 0).show();
                    } else {
                        Toast.makeText(mo3606L(), R.string.coocent_msgs_operation_failure, 0).show();
                    }
                }
            }
            C7952e eVar = this.f33713q0;
            if (eVar != null) {
                eVar.mo27366p();
            }
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.playlist.fragment.action").setPackage(C8345u.m46327h().getPackageName()));
        } else if (i3 == -1) {
            Toast.makeText(mo3606L(), R.string.music_eq_msg_playlist_name_exist, 0).show();
        } else if (i3 == -2) {
            Toast.makeText(mo3606L(), R.string.playlist_name_empty, 0).show();
        } else if (i3 == -3) {
            Toast.makeText(mo3606L(), R.string.name_limit_100, 0).show();
        } else if (i3 == -4) {
            Toast.makeText(mo3606L(), R.string.coocent_msgs_operation_failure, 0).show();
        }
    }

    /* renamed from: m3 */
    public static C7992k m43712m3() {
        return m43713n3((Song) null);
    }

    /* renamed from: n3 */
    public static C7992k m43713n3(Song song) {
        long[] jArr;
        if (song == null) {
            jArr = new long[0];
        } else {
            jArr = new long[]{song.f32559l};
        }
        return m43714o3(jArr);
    }

    /* renamed from: o3 */
    public static C7992k m43714o3(long[] jArr) {
        C7992k kVar = new C7992k();
        Bundle bundle = new Bundle();
        bundle.putLongArray("songs", jArr);
        kVar.mo3581C2(bundle);
        return kVar;
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        C4269f.C4274d dVar = new C4269f.C4274d(mo3606L());
        dVar.mo14624K(C8345u.m46326g(R.color.black));
        dVar.mo14627a(false);
        dVar.mo14628b(C8345u.m46326g(R.color.white));
        dVar.mo14632g(C8345u.m46326g(R.color.color_bbb));
        dVar.mo14647v(C9332d.m49406c(mo3651a0(), R.color.colorAccent));
        dVar.mo14618E(C9332d.m49406c(mo3651a0(), R.color.colorAccent));
        dVar.mo14619F(R.string.create);
        dVar.mo14648w(17039360);
        dVar.mo14635j(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14644s(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14643r(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14626M(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14650y(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14630d(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14638m(mo3698s0().getString(R.string.input_list_name), BuildConfig.FLAVOR, false, new C7980c(this));
        dVar.mo14615B(C7981d.f33701a);
        return dVar.mo14629c();
    }

    /* renamed from: p3 */
    public void mo29536p3(C7952e eVar) {
        this.f33713q0 = eVar;
    }
}
