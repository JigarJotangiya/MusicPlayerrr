package p342g.p343a.p344a.p349f.p351c;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.coocent.music.base.data.entity.Playlist;
import java.lang.ref.WeakReference;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p183a.p184a.C4362b;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.f.c.s2 */
/* compiled from: EditPlaylistFragment */
public class C8187s2 extends Fragment implements C4362b {

    /* renamed from: d0 */
    private TextView f34414d0;

    /* renamed from: e0 */
    private TextView f34415e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public long f34416f0 = -1;

    /* renamed from: g0 */
    private C8190c f34417g0;

    /* renamed from: h0 */
    private ImageView f34418h0;

    /* renamed from: i0 */
    public Playlist f34419i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public TextView f34420j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public TextView f34421k0;

    /* renamed from: l0 */
    private String f34422l0 = BuildConfig.FLAVOR;

    /* renamed from: g.a.a.f.c.s2$a */
    /* compiled from: EditPlaylistFragment */
    class C8188a implements TextWatcher {
        C8188a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @SuppressLint({"SetTextI18n"})
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length = charSequence.length();
            TextView X2 = C8187s2.this.f34420j0;
            X2.setText(length + "/100");
        }
    }

    /* renamed from: g.a.a.f.c.s2$b */
    /* compiled from: EditPlaylistFragment */
    class C8189b implements TextWatcher {
        C8189b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @SuppressLint({"SetTextI18n"})
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            TextView Y2 = C8187s2.this.f34421k0;
            Y2.setText(charSequence.length() + "/500");
        }
    }

    /* renamed from: g.a.a.f.c.s2$c */
    /* compiled from: EditPlaylistFragment */
    public static class C8190c extends AsyncTask<Void, Void, Playlist> {

        /* renamed from: a */
        WeakReference<C8187s2> f34425a;

        public C8190c(C8187s2 s2Var) {
            this.f34425a = new WeakReference<>(s2Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Playlist doInBackground(Void... voidArr) {
            C8187s2 s2Var = (C8187s2) this.f34425a.get();
            if (s2Var != null) {
                return C4477c.m19589O(C8345u.m46327h(), s2Var.f34416f0);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Playlist playlist) {
            C8187s2 s2Var;
            super.onPostExecute(playlist);
            if (playlist != null && (s2Var = (C8187s2) this.f34425a.get()) != null) {
                s2Var.f34419i0 = playlist;
                s2Var.m45179q3(playlist);
            }
        }
    }

    static {
        Class<C8187s2> cls = C8187s2.class;
    }

    /* renamed from: b3 */
    private void m45169b3() {
        if (this.f34419i0 != null && mo3651a0() != null) {
            new AlertDialog.Builder(mo3651a0()).setTitle(R.string.music_eq_art_image).setMessage(R.string.artist_work_tip).setPositiveButton(R.string.local, new C8078d0(this)).setNegativeButton(R.string.online, new C8087e0(this)).setNeutralButton(R.string.reset, new C8094f0(this)).create().show();
        }
    }

    /* renamed from: c3 */
    private void m45170c3() {
        FragmentActivity L;
        long j = mo3638V().getLong("playlistId");
        this.f34416f0 = j;
        if (j < 0 && (L = mo3606L()) != null) {
            L.finish();
        }
    }

    /* renamed from: d3 */
    private void m45171d3() {
        if (this.f34417g0 == null) {
            C8190c cVar = new C8190c(this);
            this.f34417g0 = cVar;
            cVar.execute(new Void[0]);
        }
    }

    /* renamed from: e3 */
    private void m45172e3(View view) {
        this.f34414d0 = (TextView) view.findViewById(R.id.et_title);
        this.f34415e0 = (TextView) view.findViewById(R.id.et_des);
        this.f34418h0 = (ImageView) view.findViewById(R.id.iv_artwork);
        this.f34418h0.setImageDrawable(C8343s.m46298f(R.drawable.ic_home_ic_albums));
        this.f34418h0.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        this.f34415e0.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        this.f34415e0.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f34415e0.setHintTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        ((TextView) view.findViewById(R.id.tv_playlist_des)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) view.findViewById(R.id.tv_title)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) view.findViewById(R.id.tv_artwork)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f34414d0.setHintTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        this.f34414d0.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f34420j0 = (TextView) view.findViewById(R.id.count_limit);
        this.f34421k0 = (TextView) view.findViewById(R.id.tv_playlist_des_count_limit);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public /* synthetic */ void mo29846g3(DialogInterface dialogInterface, int i) {
        C4477c.m19614d0(this, this.f34416f0, 10, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public /* synthetic */ void mo29847i3(DialogInterface dialogInterface, int i) {
        C4477c.m19622h0(this, this.f34416f0, 10, this.f34419i0.mo9242g(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public /* synthetic */ void mo29848k3(DialogInterface dialogInterface, int i) {
        Context a0 = mo3651a0();
        if (a0 != null) {
            C4477c.m19630l0(a0, this.f34416f0, 10);
            m45177n3(BuildConfig.FLAVOR);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void mo29849m3(View view) {
        if (view.getId() == R.id.iv_artwork) {
            m45169b3();
        }
    }

    /* renamed from: n3 */
    private void m45177n3(String str) {
        this.f34422l0 = str;
        C8321j.m46006l(str, R.drawable.ic_home_ic_albums, this.f34418h0, C8345u.m46323d(60), C8345u.m46323d(60));
    }

    /* renamed from: o3 */
    public static C8187s2 m45178o3(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("playlistId", j);
        C8187s2 s2Var = new C8187s2();
        s2Var.mo3581C2(bundle);
        return s2Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public void m45179q3(Playlist playlist) {
        this.f34414d0.setText(playlist.mo9242g());
        this.f34415e0.setText(playlist.mo9237d());
        m45177n3(playlist.mo9245i());
    }

    /* renamed from: r3 */
    private void m45180r3() {
        this.f34418h0.setOnClickListener(new C8102g0(this));
        this.f34414d0.addTextChangedListener(new C8188a());
        this.f34415e0.addTextChangedListener(new C8189b());
    }

    /* renamed from: H0 */
    public void mo14800H0(boolean z, long j, String str, int i, int i2) {
        m45177n3(str);
    }

    /* renamed from: e1 */
    public void mo3662e1(int i, int i2, Intent intent) {
        super.mo3662e1(i, i2, intent);
        C4477c.m19608a0(C8345u.m46327h(), i, i2, intent);
    }

    /* renamed from: p1 */
    public Animation mo3691p1(int i, boolean z, int i2) {
        if (z) {
            int c = C8313e.m45969c();
            if (c == 0) {
                return super.mo3691p1(i, z, i2);
            }
            return AnimationUtils.loadAnimation(mo3606L(), c);
        }
        int d = C8313e.m45970d();
        if (d == 0) {
            return super.mo3691p1(i, z, i2);
        }
        return AnimationUtils.loadAnimation(mo3606L(), d);
    }

    /* renamed from: p3 */
    public boolean mo29850p3() {
        Context a0 = mo3651a0();
        String charSequence = this.f34414d0.getText().toString();
        String charSequence2 = this.f34415e0.getText().toString();
        if (charSequence.length() > 100) {
            C8344t.m46316d(C8345u.m46327h(), R.string.name_limit_100);
            return false;
        } else if (charSequence2.length() > 500) {
            C8344t.m46316d(C8345u.m46327h(), R.string.name_limit_500);
            return false;
        } else {
            if (a0 != null) {
                int m = C4477c.m19631m(a0, this.f34416f0, charSequence, this.f34422l0, charSequence2);
                if (m > 0) {
                    C8344t.m46316d(C8345u.m46327h(), R.string.edit_success);
                    Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.edit_playlist_success");
                    intent.putExtra("playlist_id", this.f34416f0);
                    intent.putExtra("playlist_name", charSequence);
                    intent.putExtra("playlist_thumbnail", this.f34422l0);
                    intent.putExtra("playlist_des", charSequence2);
                    C8345u.m46327h().sendBroadcast(intent);
                    return true;
                } else if (m == -3) {
                    C8344t.m46316d(C8345u.m46327h(), R.string.name_limit_100);
                } else if (m == -5) {
                    C8344t.m46316d(C8345u.m46327h(), R.string.name_limit_500);
                } else if (m == -1) {
                    C8344t.m46316d(C8345u.m46327h(), R.string.playlist_renamed_exist);
                } else if (m == -4) {
                    C8344t.m46316d(C8345u.m46327h(), R.string.error);
                }
            }
            return false;
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_playlist_edit, (ViewGroup) null);
        m45170c3();
        m45172e3(inflate);
        m45171d3();
        m45180r3();
        return inflate;
    }
}
