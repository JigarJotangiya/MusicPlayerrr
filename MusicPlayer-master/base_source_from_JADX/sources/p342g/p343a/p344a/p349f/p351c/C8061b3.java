package p342g.p343a.p344a.p349f.p351c;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Music;
import com.coocent.music.base.data.entity.Playlist;
import coocent.music.player.activity.EditPlaylistActivity;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.activity.MainActivity;
import coocent.music.player.adapter.TrackAdapter;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.music.player.widget.p275k.C7245q0;
import coocent.music.player.widget.p275k.C7249s0;
import coocent.musiclibrary.music.p281b.C7324c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.ads.AdHelper;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7949b;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8333k;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.b3 */
/* compiled from: PlaylistDetailFragment */
public class C8061b3 extends C8010a implements C7324c, C7949b, C7963p {

    /* renamed from: L0 */
    public static final String f34055L0 = C8061b3.class.getSimpleName();

    /* renamed from: A0 */
    private TextView f34056A0;

    /* renamed from: B0 */
    private TextView f34057B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public Playlist f34058C0;

    /* renamed from: D0 */
    private ImageView f34059D0;

    /* renamed from: E0 */
    private LinearLayout f34060E0;

    /* renamed from: F0 */
    private LinearLayout f34061F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public RelativeLayout f34062G0;

    /* renamed from: H0 */
    private RelativeLayout f34063H0;

    /* renamed from: I0 */
    private C7245q0 f34064I0;

    /* renamed from: J0 */
    private final BaseQuickAdapter.OnItemClickListener f34065J0 = new C8064c();
    @SuppressLint({"NonConstantResourceId"})

    /* renamed from: K0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34066K0 = new C8079d1(this);

    /* renamed from: i0 */
    private View f34067i0;

    /* renamed from: j0 */
    RecyclerView f34068j0;

    /* renamed from: k0 */
    public TrackAdapter f34069k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public List<Music> f34070l0;

    /* renamed from: m0 */
    private C8065d f34071m0;

    /* renamed from: n0 */
    private DeepDefaultTitle f34072n0;

    /* renamed from: o0 */
    private C8066e f34073o0;

    /* renamed from: p0 */
    private ImageView f34074p0;

    /* renamed from: q0 */
    private int f34075q0 = 0;

    /* renamed from: r0 */
    private boolean f34076r0 = false;

    /* renamed from: s0 */
    private C7249s0 f34077s0;

    /* renamed from: t0 */
    private View f34078t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public View f34079u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public int f34080v0;

    /* renamed from: w0 */
    private LinearLayout f34081w0;

    /* renamed from: x0 */
    private ImageView f34082x0;

    /* renamed from: y0 */
    private ConstraintLayout f34083y0;

    /* renamed from: z0 */
    private TextView f34084z0;

    /* renamed from: g.a.a.f.c.b3$a */
    /* compiled from: PlaylistDetailFragment */
    class C8062a implements ViewTreeObserver.OnGlobalLayoutListener {
        C8062a() {
        }

        public void onGlobalLayout() {
            C8061b3.this.f34079u0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int height = C8061b3.this.f34079u0.getHeight();
            if (C8061b3.this.f34080v0 == 0) {
                C8061b3.this.f34062G0.setGravity(1);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C8061b3.this.f34062G0.getLayoutParams();
                layoutParams.topMargin = height + C8345u.m46323d(30);
                C8061b3.this.f34062G0.setLayoutParams(layoutParams);
                return;
            }
            C8061b3.this.f34062G0.setGravity(17);
            ((RelativeLayout.LayoutParams) C8061b3.this.f34062G0.getLayoutParams()).topMargin = height;
        }
    }

    /* renamed from: g.a.a.f.c.b3$b */
    /* compiled from: PlaylistDetailFragment */
    class C8063b extends C7970w {
        C8063b() {
        }

        /* renamed from: A */
        public void mo26689A() {
            super.mo26689A();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8061b3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26659b5(5);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: B */
        public void mo26690B() {
            super.mo26690B();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8061b3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26659b5(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: D */
        public void mo26691D() {
            super.mo26691D();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8061b3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26677q5();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: E */
        public void mo26692E() {
            super.mo26692E();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8061b3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26680r5();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public void mo26693b() {
            super.mo26693b();
            C8061b3 b3Var = C8061b3.this;
            TrackAdapter trackAdapter = b3Var.f34069k0;
            if (trackAdapter != null && (trackAdapter instanceof TrackAdapter)) {
                trackAdapter.mo26909f(true, b3Var.f34058C0.mo9239e());
            }
            if (C8061b3.this.mo3606L() != null) {
                FragmentActivity L = C8061b3.this.mo3606L();
                if (L instanceof LibraryActivity) {
                    ((LibraryActivity) L).mo26676p2(false, C8061b3.this.f34070l0 == null ? 0 : C8061b3.this.f34070l0.size());
                }
            }
        }

        /* renamed from: o */
        public void mo26694o() {
            super.mo26694o();
            C8061b3.this.m44267e4();
        }

        /* renamed from: t */
        public void mo26591t() {
            C8061b3.this.m44296y3();
        }

        /* renamed from: u */
        public void mo26697u() {
            super.mo26697u();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8061b3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26659b5(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: v */
        public void mo26698v() {
            super.mo26698v();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8061b3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26659b5(2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: x */
        public void mo26700x() {
            super.mo26700x();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8061b3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26659b5(3);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: y */
        public void mo26701y() {
            super.mo26701y();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8061b3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26659b5(4);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.f.c.b3$c */
    /* compiled from: PlaylistDetailFragment */
    class C8064c implements BaseQuickAdapter.OnItemClickListener {
        C8064c() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8287e.m45800P()) {
                C8287e.m45858n0(true);
                C8287e.m45823a0(i, C8061b3.this.f34070l0);
                C8061b3.this.m44295x3();
            } else if (C8287e.m45800P() && C8061b3.this.f34058C0.mo9239e() != 1000) {
                C8061b3.this.m44245A3(i);
            }
        }
    }

    /* renamed from: g.a.a.f.c.b3$d */
    /* compiled from: PlaylistDetailFragment */
    private static class C8065d extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private final WeakReference<C8061b3> f34088a;

        public C8065d(C8061b3 b3Var) {
            this.f34088a = new WeakReference<>(b3Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Music> doInBackground(Void... voidArr) {
            ArrayList arrayList = new ArrayList();
            C8061b3 b3Var = (C8061b3) this.f34088a.get();
            if (b3Var == null) {
                return arrayList;
            }
            if (b3Var.f34080v0 != 1) {
                return C4477c.m19591P(C8345u.m46327h(), b3Var.f34058C0.mo9239e());
            }
            return C4477c.m19653x(C8345u.m46327h());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Music> list) {
            C8061b3 b3Var;
            super.onPostExecute(list);
            if (!isCancelled() && (b3Var = (C8061b3) this.f34088a.get()) != null) {
                b3Var.m44288r4(list);
            }
        }
    }

    /* renamed from: g.a.a.f.c.b3$e */
    /* compiled from: PlaylistDetailFragment */
    private class C8066e extends BroadcastReceiver {
        private C8066e() {
        }

        public void onReceive(Context context, Intent intent) {
            TrackAdapter trackAdapter;
            TrackAdapter trackAdapter2;
            int intExtra;
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.playlist_detail_remove_notify")) {
                C8061b3.this.mo29640h3();
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action")) {
                C8061b3.this.mo29640h3();
            }
            if ((intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.playlist_track_artwork_item_notify") || intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.toprate_track_artwork_item_notify")) && C8061b3.this.f34069k0 != null && (intExtra = intent.getIntExtra("artwork_position", -1)) >= 0) {
                TrackAdapter trackAdapter3 = C8061b3.this.f34069k0;
                if (trackAdapter3 instanceof TrackAdapter) {
                    trackAdapter3.notifyItemChanged(intExtra + trackAdapter3.getHeaderLayoutCount());
                }
            }
            if (intent.getAction().equals(C8311c.f34736c)) {
                C8061b3.this.mo29640h3();
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action") && (trackAdapter2 = C8061b3.this.f34069k0) != null) {
                trackAdapter2.notifyDataSetChanged();
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui")) {
                C8061b3.this.m44272i4(intent);
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.edit_playlist_success")) {
                C8061b3.this.m44247C3(intent.getStringExtra("playlist_name"), intent.getStringExtra("playlist_thumbnail"), intent.getStringExtra("playlist_des"));
            }
            if (intent.getAction().equals("ADD_TO_PLAYLIST")) {
                C8061b3.this.mo29640h3();
            }
            if ("media.musicplayer.audioplayer.videoplayer.playlist_detail_list_favorite_change".equals(intent.getAction())) {
                C8061b3.this.m44248D3(intent);
            }
            if ("media.musicplayer.audioplayer.videoplayer.clean_list".equals(intent.getAction()) && (trackAdapter = C8061b3.this.f34069k0) != null) {
                trackAdapter.notifyDataSetChanged();
            }
        }

        /* synthetic */ C8066e(C8061b3 b3Var, C8062a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public void m44245A3(int i) {
        TrackAdapter trackAdapter = this.f34069k0;
        if (trackAdapter != null && (trackAdapter instanceof TrackAdapter)) {
            trackAdapter.mo26916q(i);
            TrackAdapter trackAdapter2 = this.f34069k0;
            List<Music> list = this.f34070l0;
            trackAdapter2.mo26907A(false, list == null ? 0 : list.size() - mo29547Z2(this.f34070l0.size()));
        }
    }

    /* renamed from: B3 */
    private void m44246B3() {
        EditPlaylistActivity.m39039F2(mo3651a0(), this.f34058C0.mo9239e());
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public void m44247C3(String str, String str2, String str3) {
        this.f34058C0.mo9251o(str);
        this.f34058C0.mo9253q(str2);
        this.f34058C0.mo9247k(str3);
        TextView textView = this.f34084z0;
        if (textView != null) {
            textView.setText(str);
        }
        if (this.f34056A0 != null) {
            if (!str3.isEmpty()) {
                this.f34056A0.setText(str3);
            } else {
                this.f34056A0.setText(C8345u.m46333n(R.string.playlist_des));
            }
        }
        this.f34072n0.setTitleText(C8345u.m46333n(R.string.playlist));
        m44264a4(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public void m44248D3(Intent intent) {
        int intExtra;
        TrackAdapter trackAdapter;
        if (this.f34080v0 == 1 && (intExtra = intent.getIntExtra("position", -1)) >= 0 && (trackAdapter = this.f34069k0) != null) {
            trackAdapter.remove(intExtra);
            if (this.f34069k0.getData().size() == 0) {
                mo29641l4(true);
            }
        }
    }

    /* renamed from: E3 */
    private void m44249E3() {
        int S0 = C4477c.m19598S0(C8345u.m46327h(), this.f34058C0.mo9239e());
        if (S0 == 1) {
            this.f34082x0.setImageDrawable(C8343s.m46298f(R.drawable.ic_library_more_favorite_2));
        } else if (S0 == 2) {
            this.f34082x0.setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_favorite_3, R.color.icon_tint_color_black));
        } else {
            C8344t.m46316d(C8345u.m46327h(), R.string.error);
        }
        C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.add_playlist_to_favorite").setPackage(C8345u.m46327h().getPackageName()));
    }

    /* renamed from: F3 */
    private View m44250F3() {
        View inflate = mo3676k0().inflate(R.layout.head_view_shuffle, (ViewGroup) this.f34068j0.getParent(), false);
        ((ImageView) inflate.findViewById(R.id.iv_shuffle_all)).setImageDrawable(C8343s.m46303k(R.drawable.ic_home01_play_all, R.color.colorAccent));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.sortOption);
        imageView.setImageDrawable(C8343s.m46298f(R.drawable.ic_home02_sort));
        ((TextView) inflate.findViewById(R.id.tv_play_all)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        if (this.f34080v0 != 1) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.multiOption);
        imageView2.setImageDrawable(C8343s.m46298f(R.drawable.ic_home03_choose));
        inflate.setOnClickListener(new C8126k1(this));
        imageView.setOnClickListener(new C8088e1(this, inflate));
        imageView2.setOnClickListener(new C8122j1(this));
        return inflate;
    }

    /* renamed from: G3 */
    private View m44251G3() {
        View inflate = mo3676k0().inflate(R.layout.playlist_top_header, (ViewGroup) this.f34068j0.getParent(), false);
        this.f34081w0 = (LinearLayout) inflate.findViewById(R.id.ll_favorite);
        this.f34060E0 = (LinearLayout) inflate.findViewById(R.id.ll_sort);
        this.f34061F0 = (LinearLayout) inflate.findViewById(R.id.ll_add_track);
        this.f34082x0 = (ImageView) inflate.findViewById(R.id.iv_favorite);
        this.f34083y0 = (ConstraintLayout) inflate.findViewById(R.id.cl_control);
        this.f34084z0 = (TextView) inflate.findViewById(R.id.playlist_title);
        this.f34056A0 = (TextView) inflate.findViewById(R.id.playlist_des);
        this.f34057B0 = (TextView) inflate.findViewById(R.id.tv_edit_playlist);
        this.f34063H0 = (RelativeLayout) inflate.findViewById(R.id.rl_playlist_des);
        TextView textView = this.f34057B0;
        if (textView != null) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, C8343s.m46304l(C8345u.m46336q() ? R.drawable.ic_next1_rtl : R.drawable.ic_next1, R.color.tv_edit_playlist_color), (Drawable) null);
        }
        this.f34059D0 = (ImageView) inflate.findViewById(R.id.iv_art);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_add_track);
        if (imageView != null) {
            imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_add_tracks, R.color.icon_tint_color_black));
            imageView.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        }
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.iv_sort);
        if (imageView2 != null) {
            imageView2.setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_sort, R.color.icon_tint_color_black));
            imageView2.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        }
        ImageView imageView3 = this.f34082x0;
        if (imageView3 != null) {
            imageView3.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        }
        ImageView imageView4 = this.f34059D0;
        if (imageView4 != null) {
            imageView4.setImageDrawable(C8343s.m46304l(R.drawable.ic_home_ic_albums, R.color.icon_tint_color_black));
            this.f34059D0.setBackground(C8343s.m46298f(R.drawable.playlist_top_item_bg_shape));
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.tvFavorite);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tvAdd);
        TextView textView4 = (TextView) inflate.findViewById(R.id.tvSort);
        TextView textView5 = this.f34084z0;
        if (textView5 != null) {
            textView5.setTextColor(C8343s.m46295c(R.color.default_text_color));
        }
        TextView textView6 = this.f34056A0;
        if (textView6 != null) {
            textView6.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        }
        TextView textView7 = this.f34057B0;
        if (textView7 != null) {
            textView7.setTextColor(C8343s.m46295c(R.color.default_text_color));
        }
        if (textView2 != null) {
            textView2.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        }
        if (textView3 != null) {
            textView3.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        }
        if (textView4 != null) {
            textView4.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        }
        return inflate;
    }

    /* renamed from: H3 */
    private void m44252H3() {
        AppCompatActivity appCompatActivity = (AppCompatActivity) mo3606L();
        if (appCompatActivity != null) {
            C0620p i = appCompatActivity.mo3730H1().mo3957i();
            i.mo4068b(R.id.fragment, C8127k2.m44717Q3(this.f34058C0.mo9239e()));
            i.mo4073g(C8127k2.f34233y0);
            i.mo3816j();
            if (appCompatActivity instanceof LibraryActivity) {
                ((LibraryActivity) appCompatActivity).mo26679r3();
            }
        }
    }

    /* renamed from: I3 */
    private void m44253I3() {
        mo29640h3();
    }

    /* renamed from: J3 */
    private void m44254J3() {
        this.f34073o0 = new C8066e(this, (C8062a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.playlist_detail_remove_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.playlist_track_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.toprate_track_artwork_item_notify");
        intentFilter.addAction(C8311c.f34736c);
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.edit_playlist_success");
        intentFilter.addAction("ADD_TO_PLAYLIST");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.playlist_detail_list_favorite_change");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
        FragmentActivity L = mo3606L();
        if (L != null) {
            L.registerReceiver(this.f34073o0, intentFilter);
        }
    }

    /* renamed from: K3 */
    private void m44255K3() {
        this.f34068j0 = (RecyclerView) this.f34067i0.findViewById(R.id.recyclerView);
        this.f34062G0 = (RelativeLayout) this.f34067i0.findViewById(R.id.rl_no);
        ((ImageView) this.f34067i0.findViewById(R.id.iv_no)).setImageDrawable(C8343s.m46303k(R.drawable.ic_lists_no_song, R.color.colorAccent));
        TextView textView = (TextView) this.f34067i0.findViewById(R.id.tv_no);
        textView.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        textView.setText(C8345u.m46333n(R.string.music_eq_lbl_no_songs_found));
        View findViewById = this.f34067i0.findViewById(R.id.bg_cover);
        if (findViewById != null) {
            int i = 8;
            if (this.f34080v0 != 1 && C8343s.f34787b) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
        RecyclerView.C0803m itemAnimator = this.f34068j0.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.mo4865w(0);
            itemAnimator.mo4866x(0);
            itemAnimator.mo4868z(0);
            itemAnimator.mo4843A(0);
        }
        ((C0916y) this.f34068j0.getItemAnimator()).mo5428V(false);
        this.f34072n0 = (DeepDefaultTitle) this.f34067i0.findViewById(R.id.defualt_title);
        ImageView imageView = (ImageView) this.f34067i0.findViewById(R.id.iv_bg);
        this.f34074p0 = imageView;
        int i2 = this.f34080v0;
        if (!(i2 == 1 || i2 == 2)) {
            C8343s.m46307o(imageView, false);
        }
        this.f34070l0 = new ArrayList();
        if (!m44280n4()) {
            this.f34072n0.setMutilIcon(this.f34058C0.mo9239e() != 1000);
            this.f34072n0.setEqIcon(false);
            this.f34072n0.setSearchIcon(false);
            this.f34072n0.setMenuIcon(false);
            if (this.f34080v0 == 1) {
                this.f34072n0.getLayoutParams().height = 0;
            }
            this.f34079u0 = m44251G3();
            this.f34078t0 = m44250F3();
            this.f34079u0.getViewTreeObserver().addOnGlobalLayoutListener(new C8062a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void mo29632N3() {
        try {
            if (mo3606L() != null) {
                mo3627R2(new Intent(mo3606L(), MainActivity.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void mo29633P3(View view) {
        List<Music> list;
        if (!this.f34076r0 && (list = this.f34070l0) != null && list.size() > 0) {
            m44270h4(this.f34070l0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public /* synthetic */ void mo29634R3(View view, View view2) {
        m44290s4(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public /* synthetic */ void mo29635T3(View view) {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26657Z4(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public /* synthetic */ void mo29636V3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int id = view.getId();
        if (id == R.id.iv_add_to_playlist) {
            m44293v3(i);
        } else if (id == R.id.popup_menu) {
            m44269g4(view, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public /* synthetic */ void mo29637X3() {
        this.f34069k0.setDuration(300);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public /* synthetic */ void mo29638Z3(View view) {
        switch (view.getId()) {
            case R.id.ll_add_track:
                m44252H3();
                return;
            case R.id.ll_favorite:
                m44249E3();
                return;
            case R.id.ll_sort:
                m44290s4(this.f34060E0);
                return;
            case R.id.rl_playlist_des:
            case R.id.tv_edit_playlist:
                m44246B3();
                return;
            default:
                return;
        }
    }

    /* renamed from: a4 */
    private void m44264a4(String str) {
        if (this.f34059D0 == null) {
            return;
        }
        if (str == null || str.isEmpty()) {
            this.f34059D0.setImageDrawable(C8343s.m46304l(R.drawable.ic_home_ic_albums, R.color.icon_tint_color));
        } else {
            C8321j.m46006l(str, R.drawable.ic_home_ic_albums, this.f34059D0, C8345u.m46323d(60), C8345u.m46323d(60));
        }
    }

    /* renamed from: c4 */
    private void m44265c4(int i) {
        this.f34069k0 = null;
        TrackAdapter trackAdapter = new TrackAdapter(R.layout.item_default, this.f34070l0, 6, this.f34058C0.mo9239e(), i, false, 0);
        this.f34069k0 = trackAdapter;
        trackAdapter.isFirstOnly(false);
        this.f34069k0.setHasStableIds(true);
        ViewParent parent = this.f34078t0.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        if (i == 1 && this.f34069k0.getHeaderLayoutCount() == 0 && this.f34070l0 != null) {
            if (this.f34080v0 == 0) {
                this.f34069k0.addHeaderView(this.f34079u0);
            }
            if (this.f34070l0.size() > 0) {
                this.f34069k0.addHeaderView(this.f34078t0);
                return;
            }
            return;
        }
        if (this.f34080v0 == 0) {
            this.f34069k0.removeHeaderView(this.f34079u0);
        }
        this.f34069k0.removeHeaderView(this.f34078t0);
    }

    /* renamed from: d4 */
    public static C8061b3 m44266d4(Playlist playlist, int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("pageType", i);
        bundle.putBoolean("playlist_animation", z);
        bundle.putParcelable("playlist", playlist);
        C8061b3 b3Var = new C8061b3();
        b3Var.mo3581C2(bundle);
        return b3Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public void m44267e4() {
        if (!AdHelper.m49536p().mo32459v(mo3606L(), new C8114h1(this))) {
            m44268f4();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public void m44268f4() {
        try {
            mo3634T2(C8333k.m46051b(mo3606L(), 0, C8337n.m46065k0(mo3606L()).mo30119L0(), true), 1029);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g4 */
    private void m44269g4(View view, int i) {
        if (this.f34077s0 == null) {
            C7249s0 s0Var = new C7249s0(mo3606L(), 7, this.f34080v0);
            this.f34077s0 = s0Var;
            s0Var.mo27831K(this.f34058C0.mo9239e());
            this.f34077s0.mo27759j(this);
            this.f34077s0.mo27830J(this);
        }
        this.f34077s0.mo27829H(i, this.f34070l0);
        this.f34077s0.mo27743k(view);
    }

    /* renamed from: h4 */
    private void m44270h4(List<Music> list) {
        if (list != null) {
            try {
                int nextInt = new Random().nextInt(list.size());
                C8287e.m45781F0(5, (ImageView) null, 0, true);
                C8287e.m45858n0(true);
                C8287e.m45823a0(nextInt, list);
                FragmentActivity L = mo3606L();
                if (L != null) {
                    ((LibraryActivity) L).mo26674m4();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public void m44272i4(Intent intent) {
        if (intent != null) {
            boolean z = intent.getExtras().getBoolean("disPlaySelectTitle");
            DeepDefaultTitle deepDefaultTitle = this.f34072n0;
            if (deepDefaultTitle != null) {
                deepDefaultTitle.setVisibility(z ? 4 : 0);
            }
        }
    }

    /* renamed from: j4 */
    private void m44274j4() {
        if (this.f34069k0 == null) {
            m44265c4(this.f34075q0);
        }
        m44294w3(this.f34075q0);
    }

    /* renamed from: k4 */
    private void m44276k4(boolean z) {
        ConstraintLayout constraintLayout = this.f34083y0;
        if (constraintLayout == null) {
            return;
        }
        if (z) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
        }
    }

    /* renamed from: n4 */
    private boolean m44280n4() {
        if (mo3638V() != null) {
            mo3638V().getBoolean("playlist_animation");
            this.f34080v0 = mo3638V().getInt("pageType", 0);
            this.f34058C0 = (Playlist) mo3638V().getParcelable("playlist");
        }
        if (this.f34058C0 != null) {
            return false;
        }
        C8345u.m46340u(R.string.error);
        return true;
    }

    /* renamed from: o4 */
    private void m44282o4(int i) {
        if (this.f34070l0 != null) {
            this.f34075q0 = i;
            C8337n.m46065k0(mo3606L()).mo30250r2(this.f34075q0);
            m44265c4(this.f34075q0);
            m44294w3(this.f34075q0);
            return;
        }
        mo29640h3();
    }

    /* renamed from: p4 */
    private void m44284p4() {
        this.f34072n0.setTitleOnClickListener(new C8063b());
        C8095f1 f1Var = new C8095f1(this);
        LinearLayout linearLayout = this.f34081w0;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(f1Var);
        }
        TextView textView = this.f34057B0;
        if (textView != null) {
            textView.setOnClickListener(f1Var);
        }
        LinearLayout linearLayout2 = this.f34060E0;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(f1Var);
        }
        LinearLayout linearLayout3 = this.f34061F0;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(f1Var);
        }
        RelativeLayout relativeLayout = this.f34063H0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(f1Var);
        }
    }

    /* renamed from: q4 */
    private void m44286q4() {
        this.f34072n0.setHomeIcon(false);
        this.f34072n0.setMenuIcon(false);
        this.f34072n0.setEqIcon(false);
        this.f34072n0.mo27431B(true, true);
        this.f34072n0.setSort(10);
        boolean g = C4477c.m19619g(C8345u.m46327h(), this.f34058C0.mo9239e());
        ImageView imageView = this.f34082x0;
        if (imageView != null) {
            if (g) {
                imageView.setImageDrawable(C8343s.m46298f(R.drawable.ic_library_more_favorite_2));
            } else {
                imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_favorite_3, R.color.icon_tint_color_black));
            }
        }
        m44247C3(this.f34058C0.mo9242g(), this.f34058C0.mo9245i(), this.f34058C0.mo9237d());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* renamed from: r4 */
    public void m44288r4(List<Music> list) {
        if (list == null || list.size() < 0) {
            List<Music> list2 = this.f34070l0;
            if (list2 != null) {
                list2.clear();
                TrackAdapter trackAdapter = this.f34069k0;
                if (trackAdapter != null) {
                    trackAdapter.notifyDataSetChanged();
                }
            }
            mo29641l4(true);
        } else if (list.size() > 0) {
            List<Music> list3 = this.f34070l0;
            if (list3 != null) {
                list3.clear();
                this.f34070l0.addAll(list);
            } else {
                this.f34070l0 = list;
            }
            m44274j4();
            mo29641l4(false);
        } else {
            List<Music> list4 = this.f34070l0;
            if (list4 != null) {
                list4.clear();
                m44274j4();
            }
            mo29641l4(true);
        }
    }

    /* renamed from: s4 */
    private void m44290s4(View view) {
        if (this.f34064I0 == null) {
            this.f34064I0 = new C7245q0(mo3606L(), 5);
        }
        this.f34064I0.mo27759j(this);
        this.f34064I0.mo27743k(view);
    }

    /* renamed from: v3 */
    private void m44293v3(int i) {
        List<Music> list = this.f34070l0;
        if (list != null && list.size() > 0) {
            C8287e.m45818Y(this.f34070l0.get(i));
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46327h().getResources().getString(R.string.success_add_to_next));
        }
    }

    /* renamed from: w3 */
    private void m44294w3(int i) {
        TrackAdapter trackAdapter;
        if (this.f34068j0 != null && (trackAdapter = this.f34069k0) != null) {
            trackAdapter.setOnItemClickListener(this.f34065J0);
            this.f34069k0.setOnItemChildClickListener(this.f34066K0);
            TrackAdapter trackAdapter2 = this.f34069k0;
            if (trackAdapter2 instanceof TrackAdapter) {
                trackAdapter2.mo26921y(this);
            }
            this.f34068j0.setAdapter(this.f34069k0);
            if (i == 1) {
                this.f34068j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34068j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34068j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34068j0.mo4596e1(i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public void m44295x3() {
        if (C8337n.m46065k0(C8345u.m46327h()).mo30200f()) {
            new Handler().postDelayed(new C8118i1(this), 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m44296y3() {
        FragmentActivity L = mo3606L();
        if (L != null) {
            L.onBackPressed();
        }
    }

    /* renamed from: z3 */
    private void m44297z3() {
        C8287e.m45793L0(false);
        C8287e.m45791K0(-1);
        C8287e.m45849j();
    }

    /* renamed from: A0 */
    public void mo26500A0() {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26500A0();
        }
    }

    /* renamed from: B */
    public void mo29479B(boolean z) {
        this.f34076r0 = z;
        mo29642m4(!z);
        m44276k4(z);
    }

    /* renamed from: B1 */
    public void mo26501B1() {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26501B1();
        }
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        m44297z3();
        if (this.f34069k0 != null) {
            this.f34069k0 = null;
        }
        if (this.f34068j0 != null) {
            this.f34068j0 = null;
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45976e(mo3606L(), i, j, i2, str);
    }

    /* renamed from: G */
    public void mo26503G() {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26503G();
        }
    }

    /* renamed from: Q */
    public void mo26506Q() {
    }

    /* renamed from: R */
    public void mo26507R() {
    }

    /* renamed from: U */
    public void mo26508U() {
    }

    /* renamed from: W0 */
    public void mo26509W0() {
    }

    /* renamed from: b1 */
    public void mo26512b1() {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26512b1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8061b3.class.getSimpleName();
    }

    /* renamed from: b4 */
    public void mo29639b4() {
        m44253I3();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29640h3();
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page").setPackage(C8345u.m46327h().getPackageName()));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification").setPackage(C8345u.m46327h().getPackageName()));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget").setPackage(C8345u.m46327h().getPackageName()));
        }
    }

    /* renamed from: h3 */
    public void mo29640h3() {
        C8065d dVar = this.f34071m0;
        if (dVar != null && dVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34071m0.cancel(true);
            this.f34071m0 = null;
        }
        C8065d dVar2 = new C8065d(this);
        this.f34071m0 = dVar2;
        dVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
    }

    /* renamed from: i1 */
    public void mo26514i1() {
    }

    /* renamed from: l0 */
    public void mo26515l0() {
    }

    /* renamed from: l4 */
    public void mo29641l4(boolean z) {
        RelativeLayout relativeLayout = this.f34062G0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
        TrackAdapter trackAdapter = this.f34069k0;
        if (trackAdapter != null && z) {
            trackAdapter.removeHeaderView(this.f34078t0);
        }
    }

    /* renamed from: m1 */
    public void mo26516m1(ArrayList<SoundEffect> arrayList) {
    }

    /* renamed from: m4 */
    public void mo29642m4(boolean z) {
        this.f34069k0.setDuration(0);
        if (!z) {
            if (this.f34080v0 == 0) {
                this.f34069k0.removeHeaderView(this.f34079u0);
            }
            this.f34069k0.removeHeaderView(this.f34078t0);
        } else if (this.f34075q0 == 1 && this.f34069k0.getHeaderLayoutCount() == 0 && this.f34070l0 != null) {
            ViewParent parent = this.f34078t0.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeAllViews();
            }
            if (this.f34080v0 == 0) {
                this.f34069k0.addHeaderView(this.f34079u0);
            }
            if (this.f34070l0.size() > 0) {
                this.f34069k0.addHeaderView(this.f34078t0);
            }
        }
        new Handler().postDelayed(new C8103g1(this), 500);
    }

    /* renamed from: n1 */
    public void mo26517n1() {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26517n1();
        }
    }

    /* renamed from: p1 */
    public Animation mo3691p1(int i, boolean z, int i2) {
        if (z) {
            int c = C8313e.m45969c();
            if (c == 0) {
                return super.mo3691p1(i, true, i2);
            }
            return AnimationUtils.loadAnimation(mo3606L(), c);
        }
        int d = C8313e.m45970d();
        if (d == 0) {
            return super.mo3691p1(i, false, i2);
        }
        return AnimationUtils.loadAnimation(mo3606L(), d);
    }

    /* renamed from: r */
    public void mo28063r(long j, int i) {
        C8314f.m45974c(mo3606L(), j, i, this.f34058C0.mo9239e() == 1000 ? 8 : 7);
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle V = mo3638V();
        if (V != null) {
            this.f34080v0 = V.getInt("pageType", 0);
        }
        int i = this.f34080v0;
        if (i == 1) {
            this.f34067i0 = layoutInflater.inflate(R.layout.title_recyclerview, (ViewGroup) null);
        } else if (i == 2) {
            this.f34067i0 = layoutInflater.inflate(R.layout.fragment_playlist_detail, (ViewGroup) null);
        } else {
            this.f34067i0 = layoutInflater.inflate(R.layout.fragment_playlist_detail, (ViewGroup) null);
        }
        m44255K3();
        this.f34075q0 = C8337n.m46065k0(mo3606L()).mo30260u0();
        m44284p4();
        mo29639b4();
        m44286q4();
        m44297z3();
        m44254J3();
        mo29550c3();
        return this.f34067i0;
    }

    /* renamed from: t4 */
    public void mo29643t4(int i) {
        if (this.f34069k0 != null && this.f34068j0 != null && i != this.f34075q0) {
            m44282o4(i);
        }
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34069k0, i, j);
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        FragmentActivity L;
        super.mo3707v1();
        C8065d dVar = this.f34071m0;
        if (dVar != null) {
            dVar.cancel(true);
            this.f34071m0 = null;
        }
        if (this.f34073o0 != null && (L = mo3606L()) != null) {
            L.unregisterReceiver(this.f34073o0);
        }
    }

    /* renamed from: x */
    public void mo28066x(long j) {
        C8287e.m45853l(C8345u.m46327h(), j);
    }

    /* renamed from: x1 */
    public void mo26519x1(float f) {
        try {
            FragmentActivity L = mo3606L();
            if (L != null) {
                WindowManager.LayoutParams attributes = L.getWindow().getAttributes();
                attributes.alpha = f;
                mo3606L().getWindow().setAttributes(attributes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y1 */
    public void mo26520y1() {
    }
}
