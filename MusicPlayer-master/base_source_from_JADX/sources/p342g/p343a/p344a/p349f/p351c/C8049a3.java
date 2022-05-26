package p342g.p343a.p344a.p349f.p351c;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Music;
import com.coocent.music.base.data.entity.Playlist;
import com.coocent.music.base.p056ui.view.C2380g;
import com.coocent.music.base.p056ui.view.C2388i;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.adapter.PlaylistAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.p275k.C7234o0;
import coocent.music.player.widget.p275k.C7245q0;
import coocent.musiclibrary.music.p281b.C7324c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.ads.AdHelper;
import p159f.p166c.p181e.p182a.p183a.p184a.C4364d;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p347d.C7974d;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8315g;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.a3 */
/* compiled from: PlayListFragment */
public class C8049a3 extends C8010a implements C7324c, C7963p, C4364d {

    /* renamed from: A0 */
    private BaseQuickAdapter.OnItemClickListener f34024A0 = new C8069c1(this);

    /* renamed from: B0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34025B0 = new C8051b();

    /* renamed from: i0 */
    private View f34026i0;

    /* renamed from: j0 */
    RecyclerView f34027j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public BaseQuickAdapter f34028k0;

    /* renamed from: l0 */
    private List<Playlist> f34029l0;

    /* renamed from: m0 */
    private C8052c f34030m0;

    /* renamed from: n0 */
    private C8056g f34031n0;

    /* renamed from: o0 */
    private int f34032o0 = 0;

    /* renamed from: p0 */
    private C7234o0 f34033p0;

    /* renamed from: q0 */
    TextView f34034q0;

    /* renamed from: r0 */
    RelativeLayout f34035r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public int f34036s0;

    /* renamed from: t0 */
    private long f34037t0 = -1;

    /* renamed from: u0 */
    private LinearLayout f34038u0;

    /* renamed from: v0 */
    private RelativeLayout f34039v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public TextView f34040w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public TextView f34041x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public TextView f34042y0;

    /* renamed from: z0 */
    private C7245q0 f34043z0;

    /* renamed from: g.a.a.f.c.a3$a */
    /* compiled from: PlayListFragment */
    class C8050a implements C2388i {
        C8050a() {
        }

        /* renamed from: a */
        public void mo9365a(Dialog dialog, long j, String str) {
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.playlist.fragment.action"));
            C8049a3.this.mo29610k3(false);
        }

        /* renamed from: b */
        public void mo9366b(Dialog dialog) {
            dialog.dismiss();
        }
    }

    /* renamed from: g.a.a.f.c.a3$b */
    /* compiled from: PlayListFragment */
    class C8051b implements BaseQuickAdapter.OnItemChildClickListener {
        C8051b() {
        }

        public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (view.getId() == R.id.popup_menu) {
                C8049a3.this.m44173Z3(view, i);
            }
            C8049a3.this.m44195y3();
        }
    }

    /* renamed from: g.a.a.f.c.a3$c */
    /* compiled from: PlayListFragment */
    private final class C8052c extends AsyncTask<Void, Void, List<Playlist>> {
        public C8052c(boolean z) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Playlist> doInBackground(Void... voidArr) {
            if (C8049a3.this.f34036s0 == 1) {
                return C4477c.m19657z(C8345u.m46327h());
            }
            if (C8049a3.this.f34036s0 == 2) {
                String str = BaseApplication.f31146j;
                if (str == null || str.isEmpty()) {
                    return null;
                }
                return C4477c.m19567D(C8345u.m46327h(), BaseApplication.f31146j);
            }
            if (C8049a3.this.f34036s0 == 3) {
                SystemClock.sleep(200);
            }
            return C4477c.m19599T(C8345u.m46327h());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Playlist> list) {
            super.onPostExecute(list);
            if (!isCancelled()) {
                C8049a3.this.m44178f4(list);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: g.a.a.f.c.a3$d */
    /* compiled from: PlayListFragment */
    private static class C8053d extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private WeakReference<C8049a3> f34047a;

        public C8053d(C8049a3 a3Var) {
            this.f34047a = new WeakReference<>(a3Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Music> doInBackground(Void... voidArr) {
            return C4477c.m19653x(C8345u.m46327h());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Music> list) {
            String str;
            super.onPostExecute(list);
            C8049a3 a3Var = (C8049a3) this.f34047a.get();
            if (a3Var != null) {
                TextView q3 = a3Var.f34042y0;
                if (list == null) {
                    str = String.valueOf(0);
                } else {
                    str = String.valueOf(list.size());
                }
                q3.setText(str);
            }
        }
    }

    /* renamed from: g.a.a.f.c.a3$e */
    /* compiled from: PlayListFragment */
    private static class C8054e extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private WeakReference<C8049a3> f34048a;

        public C8054e(C8049a3 a3Var) {
            this.f34048a = new WeakReference<>(a3Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Music> doInBackground(Void... voidArr) {
            return C4477c.m19601U(C8345u.m46327h(), C8337n.m46065k0(C8345u.m46327h()).mo30268w0() + 1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Music> list) {
            String str;
            super.onPostExecute(list);
            C8049a3 a3Var = (C8049a3) this.f34048a.get();
            if (a3Var != null) {
                TextView l3 = a3Var.f34040w0;
                if (list == null) {
                    str = String.valueOf(0);
                } else {
                    str = String.valueOf(list.size());
                }
                l3.setText(str);
            }
        }
    }

    /* renamed from: g.a.a.f.c.a3$f */
    /* compiled from: PlayListFragment */
    private static class C8055f extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private WeakReference<C8049a3> f34049a;

        public C8055f(C8049a3 a3Var) {
            this.f34049a = new WeakReference<>(a3Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Music> doInBackground(Void... voidArr) {
            return C7974d.m43656d(C8345u.m46327h()).mo29511e(BaseApplication.f31150n, C8337n.m46065k0(C8345u.m46327h()).mo30276y0() + 1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Music> list) {
            String str;
            super.onPostExecute(list);
            C8049a3 a3Var = (C8049a3) this.f34049a.get();
            if (a3Var != null) {
                TextView m3 = a3Var.f34041x0;
                if (list == null) {
                    str = String.valueOf(0);
                } else {
                    str = String.valueOf(list.size());
                }
                m3.setText(str);
            }
        }
    }

    /* renamed from: g.a.a.f.c.a3$g */
    /* compiled from: PlayListFragment */
    private class C8056g extends BroadcastReceiver {
        private C8056g() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null) {
                if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.playlist_detail_remove_notify")) {
                    C8049a3.this.mo29610k3(false);
                    C8049a3.this.m44179h3();
                } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.play_rename_notify")) {
                    C8049a3.this.mo29610k3(false);
                } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action")) {
                    if (C8049a3.this.f34028k0 != null) {
                        C8049a3 a3Var = C8049a3.this;
                        if (a3Var.f34027j0 != null) {
                            boolean unused = a3Var.f33734d0 = false;
                            C8049a3.this.mo29610k3(false);
                        }
                    }
                } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.add_to_favorite_notifiy")) {
                    C8049a3.this.mo29610k3(false);
                    C8049a3.this.m44179h3();
                } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.edit_playlist_success")) {
                    C8049a3.this.mo29610k3(false);
                } else if ("2search_update".equals(intent.getAction())) {
                    C8049a3.this.mo29610k3(false);
                } else if ("ADD_TO_PLAYLIST".equals(intent.getAction())) {
                    C8049a3.this.mo29610k3(false);
                } else if ("media.musicplayer.audioplayer.videoplayer.playlist_list_favorite_change".equals(intent.getAction())) {
                    C8049a3.this.mo29610k3(false);
                } else if ("media.musicplayer.audioplayer.videoplayer.music_change_favorite".equals(intent.getAction())) {
                    C8049a3.this.m44179h3();
                } else if ("media.musicplayer.audioplayer.videoplayer.add_playlist_to_favorite".equals(intent.getAction())) {
                    if (C8049a3.this.f34036s0 == 1) {
                        C8049a3.this.mo29610k3(false);
                    }
                } else if ("media.musicplayer.audioplayer.videoplayer.add_to_recent_notify_action".equals(intent.getAction())) {
                    C8049a3.this.m44181j3();
                } else if ("media.musicplayer.audioplayer.videoplayer.week_notify_last_added".equals(intent.getAction())) {
                    C8049a3.this.m44180i3();
                } else if ("media.musicplayer.audioplayer.videoplayer.week_notify_last_played".equals(intent.getAction())) {
                    C8049a3.this.m44181j3();
                }
            }
        }

        /* synthetic */ C8056g(C8049a3 a3Var, C8050a aVar) {
            this();
        }
    }

    /* renamed from: A3 */
    private void m44157A3() {
        FragmentActivity L = mo3606L();
        if (L instanceof LibraryActivity) {
            LibraryActivity libraryActivity = (LibraryActivity) L;
            libraryActivity.mo26648K4();
            libraryActivity.mo26681s3();
        }
    }

    /* renamed from: B3 */
    private void m44158B3() {
        mo29610k3(true);
    }

    /* renamed from: C3 */
    private void m44159C3() {
        this.f34031n0 = new C8056g(this, (C8050a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.playlist_detail_remove_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.play_rename_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.add_to_favorite_notifiy");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.edit_playlist_success");
        intentFilter.addAction("2search_update");
        intentFilter.addAction("ADD_TO_PLAYLIST");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.playlist_list_favorite_change");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.music_change_favorite");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.add_playlist_to_favorite");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.add_to_recent_notify_action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.week_notify_last_added");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.week_notify_last_played");
        mo3606L().registerReceiver(this.f34031n0, intentFilter);
    }

    /* renamed from: D3 */
    private void m44160D3() {
        m44196z3();
        this.f34039v0 = (RelativeLayout) this.f34026i0.findViewById(R.id.rl_no);
        NestedScrollView nestedScrollView = (NestedScrollView) this.f34026i0.findViewById(R.id.nestedScrollView);
        ((ImageView) this.f34026i0.findViewById(R.id.iv_no)).setImageDrawable(C8343s.m46303k(R.drawable.ic_lists_no_song, R.color.colorAccent));
        TextView textView = (TextView) this.f34026i0.findViewById(R.id.tv_no);
        textView.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        textView.setText(C8345u.m46333n(R.string.music_eq_tab_playlist_no_playlist));
        this.f34027j0 = (RecyclerView) this.f34026i0.findViewById(R.id.recyclerView);
        ProgressBar progressBar = (ProgressBar) this.f34026i0.findViewById(R.id.progressbar);
        ImageView imageView = (ImageView) this.f34026i0.findViewById(R.id.iv_recently_add);
        ImageView imageView2 = (ImageView) this.f34026i0.findViewById(R.id.iv_recently_play);
        imageView.setImageDrawable(C8343s.m46298f(R.drawable.ic_home_lists_pressed_added));
        imageView.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        imageView2.setImageDrawable(C8343s.m46298f(R.drawable.ic_home_lists_pressed_play));
        imageView2.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        ((ImageView) this.f34026i0.findViewById(R.id.iv_favorite)).setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        m44159C3();
        this.f33734d0 = false;
        this.f34038u0 = (LinearLayout) this.f34026i0.findViewById(R.id.top_head);
        ((TextView) this.f34026i0.findViewById(R.id.tvAdd)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) this.f34026i0.findViewById(R.id.tvPlay)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) this.f34026i0.findViewById(R.id.tvFavorite)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((LinearLayout) this.f34026i0.findViewById(R.id.ll_recent_add)).setOnClickListener(new C8207v0(this));
        ((LinearLayout) this.f34026i0.findViewById(R.id.ll_recent_play)).setOnClickListener(new C8047a1(this));
        ((LinearLayout) this.f34026i0.findViewById(R.id.ll_favorite)).setOnClickListener(new C8237z0(this));
        this.f34034q0 = (TextView) this.f34026i0.findViewById(R.id.tv_title);
        this.f34035r0 = (RelativeLayout) this.f34026i0.findViewById(R.id.playlist_option_header);
        ImageView imageView3 = (ImageView) this.f34026i0.findViewById(R.id.sortOption);
        ImageView imageView4 = (ImageView) this.f34026i0.findViewById(R.id.createPlaylist);
        ImageView imageView5 = (ImageView) this.f34026i0.findViewById(R.id.multiOption);
        imageView4.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist04_add_queue, R.color.default_text_color));
        if (this.f34036s0 == 1) {
            imageView4.setVisibility(8);
        }
        imageView3.setImageDrawable(C8343s.m46304l(R.drawable.ic_home02_sort, R.color.default_text_color));
        this.f34034q0.setTextColor(C8343s.m46295c(R.color.default_text_color));
        m44175c4();
        imageView3.setOnClickListener(new C8229y0(this));
        imageView4.setOnClickListener(new C8059b1(this));
        int i = this.f34036s0;
        if (i == 1 || i == 2) {
            this.f34038u0.getLayoutParams().height = 0;
        }
        if (this.f34036s0 == 2) {
            this.f34035r0.setVisibility(8);
        }
        if (this.f34036s0 == 3) {
            this.f34038u0.setVisibility(8);
            imageView3.setVisibility(8);
            imageView4.setVisibility(8);
            imageView5.setVisibility(8);
        }
        TextView textView2 = (TextView) this.f34026i0.findViewById(R.id.tvAddCount);
        this.f34040w0 = textView2;
        textView2.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        TextView textView3 = (TextView) this.f34026i0.findViewById(R.id.tvPlayCount);
        this.f34041x0 = textView3;
        textView3.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        TextView textView4 = (TextView) this.f34026i0.findViewById(R.id.tvFavoriteCount);
        this.f34042y0 = textView4;
        textView4.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        m44180i3();
        m44181j3();
        m44179h3();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void mo29599F3(View view) {
        C8216w2.m45363g(mo3606L(), (C8081d3) null);
        m44157A3();
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void mo29600H3(View view) {
        C8216w2.m45364h(mo3606L(), (C8071c3) null, true);
        m44157A3();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void mo29601J3(View view) {
        C8216w2.m45359c(mo3606L(), (C8194t2) null, true);
        m44157A3();
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public /* synthetic */ void mo29602L3(View view) {
        if (this.f34043z0 == null) {
            this.f34043z0 = new C7245q0(mo3606L(), 3);
        }
        this.f34043z0.mo27759j(this);
        this.f34043z0.mo27743k(this.f34026i0);
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void mo29603N3(View view) {
        C2380g.C2381a aVar = new C2380g.C2381a(mo3651a0());
        aVar.mo9334j(C8343s.m46300h());
        aVar.mo9335k(new C8050a());
        aVar.mo9332b().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public /* synthetic */ void mo29605R3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (!C8315g.m45979a() && !AdHelper.m49536p().mo32459v(mo3606L(), new C8218x0(this, i))) {
            m44166O3(i);
        }
        m44195y3();
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public /* synthetic */ boolean mo29606T3(View view, MotionEvent motionEvent) {
        m44195y3();
        return false;
    }

    /* renamed from: V3 */
    private void m44169V3(int i) {
        this.f34028k0 = null;
        PlaylistAdapter playlistAdapter = new PlaylistAdapter((i != 0 && i == 1) ? R.layout.item_default : R.layout.item_default_grid, this.f34029l0, false, i, this.f34036s0);
        this.f34028k0 = playlistAdapter;
        playlistAdapter.isFirstOnly(false);
        this.f34028k0.setHasStableIds(true);
    }

    /* renamed from: W3 */
    public static C8049a3 m44170W3(int i) {
        return m44171X3(i, -1);
    }

    /* renamed from: X3 */
    public static C8049a3 m44171X3(int i, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("pageType", i);
        bundle.putLong("addToPlaylistId", j);
        C8049a3 a3Var = new C8049a3();
        a3Var.mo3581C2(bundle);
        return a3Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public void m44166O3(int i) {
        FragmentActivity L = mo3606L();
        if (L instanceof LibraryActivity) {
            LibraryActivity libraryActivity = (LibraryActivity) L;
            if (this.f34036s0 == 3) {
                C8097f3 G3 = C8097f3.m44561G3(C8183r2.f34408d, this.f34037t0, this.f34029l0.get(i).mo9239e());
                C0620p i2 = libraryActivity.mo3730H1().mo3957i();
                i2.mo4068b(R.id.fragment2, G3);
                i2.mo4073g(C8097f3.f34168y0);
                i2.mo3816j();
                return;
            }
            C8216w2.m45362f(mo3606L(), this.f34029l0.get(i), true, true);
            libraryActivity.mo26681s3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public void m44173Z3(View view, int i) {
        if (this.f34033p0 == null) {
            C7234o0 o0Var = new C7234o0(mo3606L(), this.f34036s0);
            this.f34033p0 = o0Var;
            o0Var.mo27759j(this);
            this.f34033p0.mo27788E(this);
        }
        Playlist playlist = this.f34029l0.get(i);
        if (playlist != null) {
            this.f34033p0.mo27787C(i, playlist);
            this.f34033p0.mo27743k(view);
        }
    }

    /* renamed from: a4 */
    private void m44174a4() {
        if (this.f34028k0 == null) {
            m44169V3(this.f34032o0);
        }
        m44194x3(this.f34032o0);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: c4 */
    private void m44175c4() {
        int i;
        TextView textView = this.f34034q0;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C8345u.m46333n(R.string.playlist));
            sb.append(" (");
            List<Playlist> list = this.f34029l0;
            if (list == null) {
                i = 0;
            } else {
                i = list.size();
            }
            sb.append(i);
            sb.append(")");
            textView.setText(sb.toString());
        }
    }

    /* renamed from: d4 */
    private void m44176d4(int i) {
        if (this.f34029l0 != null) {
            this.f34032o0 = i;
            C8337n.m46065k0(mo3606L()).mo30254s2(this.f34032o0);
            m44169V3(this.f34032o0);
            m44194x3(this.f34032o0);
            return;
        }
        mo29610k3(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: e4 */
    private void m44177e4() {
        if (this.f34036s0 == 2) {
            this.f34027j0.setOnTouchListener(new C8214w0(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public void m44178f4(List<Playlist> list) {
        if (list == null || list.size() < 0) {
            List<Playlist> list2 = this.f34029l0;
            if (list2 != null) {
                list2.clear();
                BaseQuickAdapter baseQuickAdapter = this.f34028k0;
                if (baseQuickAdapter != null) {
                    baseQuickAdapter.notifyDataSetChanged();
                }
            }
            mo29608b4(true);
        } else if (list.size() > 0) {
            List<Playlist> list3 = this.f34029l0;
            if (list3 != null) {
                list3.clear();
                this.f34029l0.addAll(list);
            } else {
                this.f34029l0 = list;
            }
            m44175c4();
            m44174a4();
            this.f33734d0 = true;
            mo29608b4(false);
        } else {
            List<Playlist> list4 = this.f34029l0;
            if (list4 != null) {
                list4.clear();
                BaseQuickAdapter baseQuickAdapter2 = this.f34028k0;
                if (baseQuickAdapter2 != null) {
                    baseQuickAdapter2.notifyDataSetChanged();
                }
            }
            mo29608b4(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public void m44179h3() {
        new C8053d(this).execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public void m44180i3() {
        new C8054e(this).execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public void m44181j3() {
        new C8055f(this).execute(new Void[0]);
    }

    /* renamed from: x3 */
    private void m44194x3(int i) {
        BaseQuickAdapter baseQuickAdapter;
        if (this.f34027j0 != null && (baseQuickAdapter = this.f34028k0) != null) {
            baseQuickAdapter.setOnItemClickListener(this.f34024A0);
            this.f34028k0.setOnItemChildClickListener(this.f34025B0);
            this.f34027j0.setAdapter(this.f34028k0);
            if (i == 1) {
                this.f34027j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34027j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34027j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34027j0.mo4596e1(i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m44195y3() {
        FragmentActivity L;
        if (this.f34036s0 == 2 && (L = mo3606L()) != null) {
            C8345u.m46322c(L);
        }
    }

    /* renamed from: z3 */
    private void m44196z3() {
        if (mo3638V() != null) {
            this.f34036s0 = mo3638V().getInt("pageType", 0);
            this.f34037t0 = mo3638V().getLong("addToPlaylistId", -1);
        }
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
    }

    /* renamed from: F */
    public void mo14802F(boolean z) {
        Log.e("complete", "b:" + z);
        mo29607U3();
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: Q */
    public void mo26506Q() {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26506Q();
        }
    }

    /* renamed from: R */
    public void mo26507R() {
    }

    /* renamed from: U */
    public void mo26508U() {
    }

    /* renamed from: U3 */
    public void mo29607U3() {
        m44158B3();
    }

    /* renamed from: W0 */
    public void mo26509W0() {
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8049a3.class.getSimpleName();
    }

    /* renamed from: b4 */
    public void mo29608b4(boolean z) {
        int i;
        RelativeLayout relativeLayout = this.f34039v0;
        int i2 = 0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
        BaseQuickAdapter baseQuickAdapter = this.f34028k0;
        if (baseQuickAdapter != null && z) {
            baseQuickAdapter.removeAllHeaderView();
        }
        RelativeLayout relativeLayout2 = this.f34035r0;
        if (relativeLayout2 != null && (i = this.f34036s0) != 0) {
            if (i == 2) {
                relativeLayout2.setVisibility(8);
                return;
            }
            if (z) {
                i2 = 8;
            }
            relativeLayout2.setVisibility(i2);
        }
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29610k3(false);
    }

    /* renamed from: g4 */
    public void mo29609g4(int i) {
        if (this.f34028k0 != null && this.f34027j0 != null && i != this.f34032o0) {
            m44176d4(i);
        }
    }

    /* renamed from: i1 */
    public void mo26514i1() {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26514i1();
        }
    }

    /* renamed from: k3 */
    public void mo29610k3(boolean z) {
        C8052c cVar = this.f34030m0;
        if (cVar != null && cVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34030m0.cancel(true);
            this.f34030m0 = null;
        }
        C8052c cVar2 = new C8052c(z);
        this.f34030m0 = cVar2;
        cVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
    }

    /* renamed from: l0 */
    public void mo26515l0() {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26515l0();
        }
    }

    /* renamed from: m1 */
    public void mo26516m1(ArrayList<SoundEffect> arrayList) {
    }

    /* renamed from: n1 */
    public void mo26517n1() {
    }

    /* renamed from: r */
    public void mo28063r(long j, int i) {
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34026i0 = layoutInflater.inflate(R.layout.fragment_playlist, (ViewGroup) null);
        this.f34032o0 = C8337n.m46065k0(mo3606L()).mo30264v0();
        m44160D3();
        mo29607U3();
        m44177e4();
        C4477c.m19606Z(mo3651a0(), this);
        return this.f34026i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        C8052c cVar = this.f34030m0;
        if (cVar != null) {
            cVar.cancel(true);
            this.f34030m0 = null;
        }
        if (this.f34031n0 != null) {
            mo3606L().unregisterReceiver(this.f34031n0);
            this.f34031n0 = null;
        }
    }

    /* renamed from: x */
    public void mo28066x(long j) {
        C8287e.m45853l(C8345u.m46327h(), j);
    }

    /* renamed from: x1 */
    public void mo26519x1(float f) {
        try {
            WindowManager.LayoutParams attributes = mo3606L().getWindow().getAttributes();
            attributes.alpha = f;
            mo3606L().getWindow().setAttributes(attributes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y1 */
    public void mo26520y1() {
    }
}
