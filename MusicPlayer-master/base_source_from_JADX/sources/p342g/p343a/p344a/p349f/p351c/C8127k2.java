package p342g.p343a.p344a.p349f.p351c;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.FragmentActivity;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.base.BaseApplication;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p347d.C7974d;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.k2 */
/* compiled from: AddTrackToPlaylistFragment */
public class C8127k2 extends C8010a {

    /* renamed from: y0 */
    public static final String f34233y0 = C8127k2.class.getSimpleName();

    /* renamed from: i0 */
    private C8129b f34234i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public TextView f34235j0;

    /* renamed from: k0 */
    private TextView f34236k0;

    /* renamed from: l0 */
    private TextView f34237l0;

    /* renamed from: m0 */
    private TextView f34238m0;

    /* renamed from: n0 */
    private TextView f34239n0;

    /* renamed from: o0 */
    private ConstraintLayout f34240o0;

    /* renamed from: p0 */
    private ConstraintLayout f34241p0;

    /* renamed from: q0 */
    private ConstraintLayout f34242q0;

    /* renamed from: r0 */
    private ConstraintLayout f34243r0;

    /* renamed from: s0 */
    private ConstraintLayout f34244s0;

    /* renamed from: t0 */
    private EditText f34245t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public ImageView f34246u0;

    /* renamed from: v0 */
    private long f34247v0;

    /* renamed from: w0 */
    private ConstraintLayout f34248w0;

    /* renamed from: x0 */
    private ImageView f34249x0;

    /* renamed from: g.a.a.f.c.k2$b */
    /* compiled from: AddTrackToPlaylistFragment */
    private class C8129b extends BroadcastReceiver {
        private C8129b() {
        }

        @SuppressLint({"SetTextI18n"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "media.musicplayer.audioplayer.videoplayer.select_track_to_updata_num".equals(intent.getAction())) {
                List<Music> O = C8287e.m45798O();
                if (O == null || O.size() <= 0) {
                    TextView h3 = C8127k2.this.f34235j0;
                    h3.setText(C8345u.m46333n(R.string.has_select) + 0 + C8345u.m46333n(R.string.track));
                    if (C8127k2.this.f34246u0 != null) {
                        C8127k2.this.f34246u0.setVisibility(8);
                        return;
                    }
                    return;
                }
                TextView h32 = C8127k2.this.f34235j0;
                h32.setText(C8345u.m46333n(R.string.has_select) + O.size() + C8345u.m46333n(R.string.track));
                if (C8127k2.this.f34246u0 != null) {
                    C8127k2.this.f34246u0.setVisibility(0);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void mo29747B3() {
        C8345u.m46339t(new C8093f(this, C4477c.m19585M(C8345u.m46327h())));
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void mo29748D3(List list) {
        TextView textView = this.f34238m0;
        textView.setText(list.size() + C8345u.m46327h().getString(R.string.track));
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void mo29749F3() {
        C8345u.m46339t(new C8116i(this, C4477c.m19653x(C8345u.m46327h())));
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void mo29750H3(List list) {
        TextView textView = this.f34236k0;
        textView.setText(list.size() + C8345u.m46327h().getString(R.string.track));
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void mo29751J3() {
        C8345u.m46339t(new C8101g(this, C4477c.m19601U(C8345u.m46327h(), C8337n.m46065k0(C8345u.m46327h()).mo30268w0() + 1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public /* synthetic */ void mo29752L3(List list) {
        TextView textView = this.f34237l0;
        textView.setText(list.size() + C8345u.m46327h().getString(R.string.track));
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void mo29753N3() {
        C8345u.m46339t(new C8067c(this, C7974d.m43656d(C8345u.m46327h()).mo29511e(BaseApplication.f31150n, C8337n.m46065k0(C8345u.m46327h()).mo30276y0() + 1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void mo29754P3(View view) {
        switch (view.getId()) {
            case R.id.ctAllTrack:
                m44728p3();
                return;
            case R.id.ctFavorite:
                m44729q3();
                return;
            case R.id.ctRecentlyAdd:
                m44730r3();
                return;
            case R.id.ctRecentlyPlay:
                m44731s3();
                return;
            case R.id.et_search:
            case R.id.search_title:
                m44732t3();
                return;
            case R.id.ico_back:
                FragmentActivity L = mo3606L();
                if (L != null) {
                    L.onBackPressed();
                    return;
                }
                return;
            case R.id.ivDone:
                m44718R3();
                return;
            default:
                return;
        }
    }

    /* renamed from: Q3 */
    public static C8127k2 m44717Q3(long j) {
        Bundle bundle = new Bundle();
        C8127k2 k2Var = new C8127k2();
        bundle.putLong("playlistId", j);
        k2Var.mo3581C2(bundle);
        return k2Var;
    }

    /* renamed from: R3 */
    private void m44718R3() {
        try {
            List<Music> O = C8287e.m45798O();
            if (O != null) {
                if (O.size() != 0) {
                    long[] jArr = new long[O.size()];
                    for (int i = 0; i < O.size(); i++) {
                        jArr[i] = O.get(i).mo9215k();
                    }
                    int a = C4477c.m19607a(C8345u.m46327h(), jArr, this.f34247v0);
                    if (a > 0) {
                        C8344t.m46316d(C8345u.m46327h(), R.string.music_eq_msg_add_songs_to_playlist_ok);
                        C8345u.m46327h().sendBroadcast(new Intent("ADD_TO_PLAYLIST").setPackage(C8345u.m46327h().getPackageName()));
                        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
                        if (libraryActivity != null) {
                            libraryActivity.mo3730H1().mo3920J0(C8061b3.f34055L0, 0);
                            libraryActivity.mo26668h5();
                            return;
                        }
                        return;
                    } else if (a == -1) {
                        C8344t.m46316d(C8345u.m46327h(), R.string.already_exists);
                        return;
                    } else {
                        return;
                    }
                }
            }
            C8344t.m46316d(C8345u.m46327h(), R.string.not_select_file);
        } catch (Exception e) {
            e.printStackTrace();
            C8344t.m46316d(C8345u.m46327h(), R.string.error);
        }
    }

    /* renamed from: S3 */
    private void m44719S3() {
        C8077d dVar = new C8077d(this);
        this.f34240o0.setOnClickListener(dVar);
        this.f34241p0.setOnClickListener(dVar);
        this.f34242q0.setOnClickListener(dVar);
        this.f34243r0.setOnClickListener(dVar);
        this.f34244s0.setOnClickListener(dVar);
        this.f34245t0.setOnClickListener(dVar);
        this.f34246u0.setOnClickListener(dVar);
        this.f34248w0.setOnClickListener(dVar);
        this.f34249x0.setOnClickListener(dVar);
    }

    /* renamed from: j3 */
    private void m44722j3() {
        C8287e.m45793L0(false);
        C8287e.m45791K0(-1);
        C8287e.m45849j();
        Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.list_notifiy.action");
        intent.setPackage(C8345u.m46327h().getPackageName());
        C8345u.m46327h().sendBroadcast(intent);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: k3 */
    private void m44723k3() {
        new Thread(new C8112h(this)).start();
    }

    /* renamed from: l3 */
    private void m44724l3() {
        this.f34247v0 = mo3638V().getLong("playlistId");
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: m3 */
    private void m44725m3() {
        new Thread(new C8057b(this)).start();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: n3 */
    private void m44726n3() {
        new Thread(new C8045a(this)).start();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: o3 */
    private void m44727o3() {
        new Thread(new C8086e(this)).start();
    }

    /* renamed from: p3 */
    private void m44728p3() {
        C8097f3 F3 = C8097f3.m44560F3(C8183r2.f34409e, this.f34247v0);
        FragmentActivity L = mo3606L();
        if (L != null) {
            C0620p i = L.mo3730H1().mo3957i();
            i.mo4068b(R.id.fragment2, F3);
            i.mo4073g(C8097f3.f34168y0);
            i.mo3816j();
        }
    }

    /* renamed from: q3 */
    private void m44729q3() {
        C8097f3 F3 = C8097f3.m44560F3(C8183r2.f34407c, this.f34247v0);
        FragmentActivity L = mo3606L();
        if (L != null) {
            C0620p i = L.mo3730H1().mo3957i();
            i.mo4068b(R.id.fragment2, F3);
            i.mo4073g(C8097f3.f34168y0);
            i.mo3816j();
        }
    }

    /* renamed from: r3 */
    private void m44730r3() {
        C8097f3 F3 = C8097f3.m44560F3(C8183r2.f34405a, this.f34247v0);
        FragmentActivity L = mo3606L();
        if (L != null) {
            C0620p i = L.mo3730H1().mo3957i();
            i.mo4068b(R.id.fragment2, F3);
            i.mo4073g(C8097f3.f34168y0);
            i.mo3816j();
        }
    }

    /* renamed from: s3 */
    private void m44731s3() {
        C8097f3 F3 = C8097f3.m44560F3(C8183r2.f34406b, this.f34247v0);
        FragmentActivity L = mo3606L();
        if (L != null) {
            C0620p i = L.mo3730H1().mo3957i();
            i.mo4068b(R.id.fragment2, F3);
            i.mo4073g(C8097f3.f34168y0);
            i.mo3816j();
        }
    }

    /* renamed from: t3 */
    private void m44732t3() {
        C8090e3 y3 = C8090e3.m44549y3(4, this.f34247v0);
        FragmentActivity L = mo3606L();
        if (L != null) {
            C0620p i = L.mo3730H1().mo3957i();
            i.mo4068b(R.id.fragment, y3);
            i.mo4073g(C8090e3.f34149t0);
            i.mo3816j();
        }
    }

    /* renamed from: u3 */
    private void m44733u3() {
        m44726n3();
        m44727o3();
        m44725m3();
        m44723k3();
    }

    /* renamed from: v3 */
    private void m44734v3() {
        C0620p i = mo3642W().mo3957i();
        i.mo4068b(R.id.fragment, C8049a3.m44171X3(3, this.f34247v0));
        i.mo4073g(f34233y0);
        i.mo3816j();
    }

    /* renamed from: w3 */
    private void m44735w3() {
        this.f34234i0 = new C8129b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_num");
        mo3606L().registerReceiver(this.f34234i0, intentFilter);
    }

    /* renamed from: x3 */
    private void m44736x3(View view) {
        this.f34235j0 = (TextView) view.findViewById(R.id.sub_title);
        this.f34236k0 = (TextView) view.findViewById(R.id.tv_recently_add_count);
        this.f34237l0 = (TextView) view.findViewById(R.id.tv_recently_play_count);
        this.f34238m0 = (TextView) view.findViewById(R.id.tv_favorite_count);
        this.f34239n0 = (TextView) view.findViewById(R.id.tv_all_track_count);
        ImageView imageView = (ImageView) view.findViewById(R.id.ico_back);
        this.f34249x0 = imageView;
        imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_toolbar_03, R.color.default_text_color));
        ((RelativeLayout) view.findViewById(R.id.search_layout)).setBackground(C8343s.m46298f(R.drawable.search_shape));
        ((TextView) view.findViewById(R.id.tv_recently_add)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f34236k0.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        ((TextView) view.findViewById(R.id.tv_recently_play)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f34237l0.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        ((TextView) view.findViewById(R.id.tv_favorite)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f34238m0.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        ((TextView) view.findViewById(R.id.tv_all_track)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f34239n0.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.iv_recently_add);
        appCompatImageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_home_lists_pressed_added, R.color.app_sub_title_color));
        appCompatImageView.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.iv_recently_play);
        appCompatImageView2.setImageDrawable(C8343s.m46304l(R.drawable.ic_home_lists_pressed_play, R.color.app_sub_title_color));
        appCompatImageView2.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        ((AppCompatImageView) view.findViewById(R.id.iv_favorite)).setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(R.id.iv_all_track);
        appCompatImageView3.setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_play, R.color.app_sub_title_color));
        appCompatImageView3.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        mo29554g3((AppCompatImageView) view.findViewById(R.id.iv_next_1));
        mo29554g3((AppCompatImageView) view.findViewById(R.id.iv_next_2));
        mo29554g3((AppCompatImageView) view.findViewById(R.id.iv_next_3));
        mo29554g3((AppCompatImageView) view.findViewById(R.id.iv_next_4));
        this.f34240o0 = (ConstraintLayout) view.findViewById(R.id.ctRecentlyAdd);
        this.f34241p0 = (ConstraintLayout) view.findViewById(R.id.ctRecentlyPlay);
        this.f34242q0 = (ConstraintLayout) view.findViewById(R.id.ctFavorite);
        this.f34243r0 = (ConstraintLayout) view.findViewById(R.id.ctAllTrack);
        this.f34246u0 = (ImageView) view.findViewById(R.id.ivDone);
        this.f34248w0 = (ConstraintLayout) view.findViewById(R.id.layout_add_to_playlist);
        EditText editText = (EditText) view.findViewById(R.id.et_search);
        this.f34245t0 = editText;
        editText.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        this.f34245t0.setHintTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        this.f34244s0 = (ConstraintLayout) view.findViewById(R.id.search_title);
        this.f34245t0.setFocusable(false);
        this.f34245t0.setCursorVisible(false);
        this.f34245t0.setTextIsSelectable(false);
        int i = 8;
        ((ImageView) view.findViewById(R.id.back)).setVisibility(8);
        view.findViewById(R.id.statusView).getLayoutParams().height = BaseApplication.f31145H;
        ((TextView) view.findViewById(R.id.title)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f34246u0.setImageDrawable(C8343s.m46304l(R.drawable.ic_toolbar_04, R.color.default_text_color));
        View findViewById = view.findViewById(R.id.bg_cover);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.library_bg);
        if (findViewById != null) {
            if (C8343s.f34787b) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
        C8343s.m46307o(imageView2, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void mo29755z3(List list) {
        TextView textView = this.f34239n0;
        textView.setText(list.size() + C8345u.m46327h().getString(R.string.track));
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        m44722j3();
        if (this.f34234i0 != null) {
            mo3606L().unregisterReceiver(this.f34234i0);
            this.f34234i0 = null;
        }
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        super.mo3636U1(view, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8127k2.class.getSimpleName();
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

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m44724l3();
        View inflate = layoutInflater.inflate(R.layout.fragment_add_track_to_playlist, (ViewGroup) null);
        m44736x3(inflate);
        m44733u3();
        m44719S3();
        m44734v3();
        m44735w3();
        return inflate;
    }
}
