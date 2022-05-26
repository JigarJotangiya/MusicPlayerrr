package p342g.p343a.p344a.p348e;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C0584b;
import androidx.fragment.app.FragmentActivity;
import com.coocent.music.base.data.entity.Music;
import com.coocent.music.base.data.entity.Playlist;
import com.coocent.music.base.p056ui.view.C2380g;
import com.coocent.music.base.p056ui.view.C2388i;
import coocent.musiclibrary.music.p283d.C7327b;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p160a.p161a.C4269f;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7952e;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: g.a.a.e.h */
/* compiled from: AddPlaylistDialog */
public class C7985h extends C0584b implements C7952e {

    /* renamed from: g.a.a.e.h$a */
    /* compiled from: AddPlaylistDialog */
    class C7986a implements C2388i {
        C7986a() {
        }

        /* renamed from: a */
        public void mo9365a(Dialog dialog, long j, String str) {
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.playlist.fragment.action").setPackage(C8345u.m46327h().getPackageName()));
            C7985h.this.m43693s3();
        }

        /* renamed from: b */
        public void mo9366b(Dialog dialog) {
            dialog.dismiss();
        }
    }

    /* renamed from: j3 */
    private void m43686j3(int i, List<Playlist> list, int i2, long[] jArr) {
        int a = C4477c.m19607a(mo3606L(), jArr, list.get(i2 - i).mo9239e());
        if (a >= 0) {
            Toast.makeText(mo3606L(), R.string.music_eq_msg_add_songs_to_playlist_ok, 0).show();
            C8287e.m45820Z();
        } else if (a == -1) {
            Toast.makeText(mo3606L(), R.string.music_eq_msg_playlist_name_exist, 0).show();
        } else {
            Toast.makeText(mo3606L(), R.string.coocent_msgs_operation_failure, 0).show();
        }
    }

    /* renamed from: k3 */
    private void m43687k3(long[] jArr) {
        C2380g.C2381a aVar = new C2380g.C2381a(mo3651a0());
        aVar.mo9334j(C8343s.m46300h());
        aVar.mo9333i(jArr);
        aVar.mo9335k(new C7986a());
        aVar.mo9332b().show();
    }

    /* renamed from: l3 */
    private void m43688l3(long[] jArr) {
        FragmentActivity L = mo3606L();
        if ((L instanceof AppCompatActivity) && !L.isFinishing()) {
            if (jArr != null && jArr.length > 1) {
                C8287e.m45834e(C8287e.m45798O());
            } else if (jArr != null && jArr.length == 1) {
                C8287e.m45831d(C7327b.m41495c(mo3606L(), jArr[0]), true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void mo29533n3(int i, int i2, List list) {
        Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.playlist.fragment.action");
        if (i >= i2 && ((Playlist) list.get(i - i2)).mo9242g().equals(C8345u.m46327h().getResources().getString(R.string.favorites))) {
            intent.putExtra("favorite_opption", true);
        }
        C8345u.m46327h().sendBroadcast(intent.setPackage(C8345u.m46327h().getPackageName()));
        m43693s3();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void mo29534p3(boolean z, int i, List list, C4269f fVar, View view, int i2, CharSequence charSequence) {
        long[] longArray = mo3638V().getLongArray("songs");
        if (i2 == 0) {
            if (z) {
                m43688l3(longArray);
            } else {
                m43687k3(longArray);
            }
        } else if (i2 != 1) {
            m43686j3(i, list, i2, longArray);
        } else if (z) {
            m43687k3(longArray);
            return;
        } else {
            m43686j3(i, list, i2, longArray);
        }
        new Handler().postDelayed(new C7978a(this, i2, i, list), 100);
    }

    /* renamed from: q3 */
    public static C7985h m43691q3(Music music) {
        return m43692r3(new long[]{music.mo9215k()}, true);
    }

    /* renamed from: r3 */
    public static C7985h m43692r3(long[] jArr, boolean z) {
        C7985h hVar = new C7985h();
        Bundle bundle = new Bundle();
        bundle.putLongArray("songs", jArr);
        bundle.putBoolean("showQueue", z);
        hVar.mo3581C2(bundle);
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public void m43693s3() {
        C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.add_to_favorite_notifiy").setPackage(C8345u.m46327h().getPackageName()));
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        CharSequence[] charSequenceArr;
        boolean z = mo3638V().getBoolean("showQueue");
        int i = z ? 2 : 1;
        List<Playlist> S = C4477c.m19597S(mo3606L());
        int i2 = 0;
        if (z) {
            charSequenceArr = new CharSequence[(S.size() + 2)];
            charSequenceArr[0] = C8345u.m46327h().getResources().getString(R.string.now_playing_list);
            charSequenceArr[1] = C8345u.m46327h().getResources().getString(R.string.create_playlist);
        } else {
            charSequenceArr = new CharSequence[(S.size() + 1)];
            charSequenceArr[0] = C8345u.m46327h().getResources().getString(R.string.create_playlist);
        }
        if (z) {
            while (i2 < S.size()) {
                charSequenceArr[i2 + 2] = S.get(i2).mo9242g();
                i2++;
            }
        } else {
            while (i2 < S.size()) {
                int i3 = i2 + 1;
                charSequenceArr[i3] = S.get(i2).mo9242g();
                i2 = i3;
            }
        }
        C4269f.C4274d dVar = new C4269f.C4274d(mo3606L());
        dVar.mo14622I(R.string.add_playlist);
        dVar.mo14624K(C8345u.m46326g(R.color.black));
        dVar.mo14647v(C9332d.m49406c(mo3651a0(), R.color.colorAccent));
        dVar.mo14618E(C9332d.m49406c(mo3651a0(), R.color.colorAccent));
        dVar.mo14635j(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14644s(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14643r(C8345u.m46326g(R.color.black));
        dVar.mo14626M(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14650y(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14630d(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14628b(C8345u.m46326g(R.color.white));
        dVar.mo14632g(C8345u.m46326g(R.color.color_bbb));
        dVar.mo14639n(charSequenceArr);
        dVar.mo14640o(new C7979b(this, z, i, S));
        return dVar.mo14629c();
    }

    /* renamed from: p */
    public void mo27366p() {
        m43693s3();
    }
}
