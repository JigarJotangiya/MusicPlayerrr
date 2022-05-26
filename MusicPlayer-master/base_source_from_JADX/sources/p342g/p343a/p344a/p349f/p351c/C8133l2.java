package p342g.p343a.p344a.p349f.p351c;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.activity.MainActivity;
import coocent.music.player.adapter.TrackAdapter;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.music.player.widget.p275k.C7249s0;
import coocent.musiclibrary.music.p281b.C7324c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.ads.C9387i;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7949b;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8333k;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.l2 */
/* compiled from: AlbumDetailFragment */
public class C8133l2 extends C8010a implements C7324c, C7949b, C7963p {

    /* renamed from: A0 */
    public static final String f34254A0 = C8133l2.class.getSimpleName();

    /* renamed from: i0 */
    private View f34255i0;

    /* renamed from: j0 */
    RecyclerView f34256j0;

    /* renamed from: k0 */
    public TrackAdapter f34257k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public List<Music> f34258l0;

    /* renamed from: m0 */
    private C8138e f34259m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public long f34260n0 = -1;

    /* renamed from: o0 */
    private String f34261o0;

    /* renamed from: p0 */
    private DeepDefaultTitle f34262p0;

    /* renamed from: q0 */
    private C8337n f34263q0;

    /* renamed from: r0 */
    private C8139f f34264r0;

    /* renamed from: s0 */
    private ImageView f34265s0;

    /* renamed from: t0 */
    private int f34266t0 = 0;

    /* renamed from: u0 */
    private boolean f34267u0 = false;

    /* renamed from: v0 */
    private C7249s0 f34268v0;

    /* renamed from: w0 */
    View f34269w0;

    /* renamed from: x0 */
    private RelativeLayout f34270x0;
    @SuppressLint({"NonConstantResourceId"})

    /* renamed from: y0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34271y0 = new C8120j(this);

    /* renamed from: z0 */
    private BaseQuickAdapter.OnItemClickListener f34272z0 = new C8136c();

    /* renamed from: g.a.a.f.c.l2$a */
    /* compiled from: AlbumDetailFragment */
    class C8134a extends C7970w {
        C8134a() {
        }

        /* renamed from: A */
        public void mo26689A() {
            super.mo26689A();
            try {
                ((LibraryActivity) C8133l2.this.mo3606L()).mo26659b5(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: B */
        public void mo26690B() {
            super.mo26690B();
            try {
                ((LibraryActivity) C8133l2.this.mo3606L()).mo26659b5(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: D */
        public void mo26691D() {
            super.mo26691D();
            try {
                ((LibraryActivity) C8133l2.this.mo3606L()).mo26677q5();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: E */
        public void mo26692E() {
            super.mo26692E();
            try {
                ((LibraryActivity) C8133l2.this.mo3606L()).mo26680r5();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public void mo26693b() {
            super.mo26693b();
            C8133l2.this.f34257k0.mo26909f(false, 0);
            if (C8133l2.this.mo3606L() != null) {
                FragmentActivity L = C8133l2.this.mo3606L();
                if (L instanceof LibraryActivity) {
                    ((LibraryActivity) L).mo26676p2(false, C8133l2.this.f34258l0 == null ? 0 : C8133l2.this.f34258l0.size());
                }
            }
        }

        /* renamed from: o */
        public void mo26694o() {
            super.mo26694o();
            C8133l2.this.m44760M3();
        }

        /* renamed from: t */
        public void mo26591t() {
            C8133l2.this.m44784v3();
        }

        /* renamed from: u */
        public void mo26697u() {
            super.mo26697u();
            try {
                ((LibraryActivity) C8133l2.this.mo3606L()).mo26659b5(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: v */
        public void mo26698v() {
            super.mo26698v();
            try {
                ((LibraryActivity) C8133l2.this.mo3606L()).mo26659b5(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: w */
        public void mo26699w() {
            super.mo26699w();
            try {
                ((LibraryActivity) C8133l2.this.mo3606L()).mo26659b5(7);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: x */
        public void mo26700x() {
            super.mo26700x();
            try {
                ((LibraryActivity) C8133l2.this.mo3606L()).mo26659b5(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: y */
        public void mo26701y() {
            super.mo26701y();
            try {
                ((LibraryActivity) C8133l2.this.mo3606L()).mo26659b5(4);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: z */
        public void mo26702z() {
            super.mo26702z();
            try {
                ((LibraryActivity) C8133l2.this.mo3606L()).mo26659b5(6);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.f.c.l2$b */
    /* compiled from: AlbumDetailFragment */
    class C8135b implements C9387i {
        C8135b() {
        }

        /* renamed from: a */
        public void mo26565a() {
            C8133l2.this.m44761N3();
        }
    }

    /* renamed from: g.a.a.f.c.l2$c */
    /* compiled from: AlbumDetailFragment */
    class C8136c implements BaseQuickAdapter.OnItemClickListener {
        C8136c() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8287e.m45800P()) {
                C8287e.m45858n0(true);
                C8287e.m45823a0(i, C8133l2.this.f34258l0);
                C8133l2.this.m44783u3();
                return;
            }
            C8133l2.this.m44786x3(i);
        }
    }

    /* renamed from: g.a.a.f.c.l2$d */
    /* compiled from: AlbumDetailFragment */
    class C8137d implements Runnable {
        C8137d() {
        }

        public void run() {
            try {
                if (C8133l2.this.mo3606L() != null) {
                    C8133l2.this.mo3627R2(new Intent(C8133l2.this.mo3606L(), MainActivity.class));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.f.c.l2$e */
    /* compiled from: AlbumDetailFragment */
    private static final class C8138e extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private final WeakReference<C8133l2> f34277a;

        /* renamed from: b */
        private final boolean f34278b;

        public C8138e(C8133l2 l2Var, boolean z, boolean z2) {
            this.f34278b = z2;
            this.f34277a = new WeakReference<>(l2Var);
        }

        /* renamed from: a */
        private void m44840a(List<Music> list, C8133l2 l2Var) {
            FragmentActivity L;
            if (!this.f34278b) {
                return;
            }
            if ((list == null || list.size() == 0) && (L = l2Var.mo3606L()) != null) {
                L.onBackPressed();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public List<Music> doInBackground(Void... voidArr) {
            C8133l2 l2Var = (C8133l2) this.f34277a.get();
            if (l2Var != null) {
                return C4477c.m19635o(C8345u.m46327h(), l2Var.f34260n0);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(List<Music> list) {
            C8133l2 l2Var;
            super.onPostExecute(list);
            if (!isCancelled() && (l2Var = (C8133l2) this.f34277a.get()) != null) {
                boolean unused = l2Var.f33734d0 = true;
                l2Var.m44770Y3(list);
                m44840a(list, l2Var);
            }
        }
    }

    /* renamed from: g.a.a.f.c.l2$f */
    /* compiled from: AlbumDetailFragment */
    private class C8139f extends BroadcastReceiver {
        private C8139f() {
        }

        public void onReceive(Context context, Intent intent) {
            TrackAdapter trackAdapter;
            TrackAdapter trackAdapter2;
            int intExtra;
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.playlist_detail_remove_notify")) {
                C8133l2.this.mo29766h3(true, true);
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action")) {
                C8133l2.this.mo29766h3(true, true);
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.album_track_artwork_item_notify") && C8133l2.this.f34257k0 != null && (intExtra = intent.getIntExtra("artwork_position", -1)) >= 0) {
                TrackAdapter trackAdapter3 = C8133l2.this.f34257k0;
                trackAdapter3.notifyItemChanged(intExtra + trackAdapter3.getHeaderLayoutCount());
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action") && (trackAdapter2 = C8133l2.this.f34257k0) != null) {
                trackAdapter2.notifyDataSetChanged();
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui")) {
                C8133l2.this.m44764Q3(intent);
            }
            if ("media.musicplayer.audioplayer.videoplayer.clean_list".equals(intent.getAction()) && (trackAdapter = C8133l2.this.f34257k0) != null) {
                trackAdapter.notifyDataSetChanged();
            }
        }

        /* synthetic */ C8139f(C8133l2 l2Var, C8134a aVar) {
            this();
        }
    }

    /* renamed from: A3 */
    private void m44753A3() {
        this.f34264r0 = new C8139f(this, (C8134a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.album_track_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
        mo3606L().registerReceiver(this.f34264r0, intentFilter);
    }

    /* renamed from: B3 */
    private void m44754B3() {
        this.f34256j0 = (RecyclerView) this.f34255i0.findViewById(R.id.recyclerView);
        this.f34270x0 = (RelativeLayout) this.f34255i0.findViewById(R.id.rl_no);
        TextView textView = (TextView) this.f34255i0.findViewById(R.id.tv_no);
        textView.setText(C8345u.m46333n(R.string.music_eq_lbl_no_songs_found));
        textView.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        ((ImageView) this.f34255i0.findViewById(R.id.iv_no)).setImageDrawable(C8343s.m46303k(R.drawable.ic_lists_no_song, R.color.colorAccent));
        this.f34255i0.findViewById(R.id.bg_cover).setVisibility(C8343s.f34787b ? 0 : 8);
        this.f34256j0.getItemAnimator().mo4865w(0);
        this.f34256j0.getItemAnimator().mo4866x(0);
        this.f34256j0.getItemAnimator().mo4868z(0);
        this.f34256j0.getItemAnimator().mo4843A(0);
        ((C0916y) this.f34256j0.getItemAnimator()).mo5428V(false);
        this.f34262p0 = (DeepDefaultTitle) this.f34255i0.findViewById(R.id.defualt_title);
        this.f34265s0 = (ImageView) this.f34255i0.findViewById(R.id.iv_bg);
        this.f34262p0.setMutilIcon(true);
        this.f34262p0.setMenuIcon(false);
        this.f34262p0.setEqIcon(false);
        this.f34262p0.setSearchIcon(false);
        this.f34262p0.mo27431B(true, true);
        this.f34262p0.setSort(7);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void mo29758D3(View view) {
        List<Music> list;
        if (!this.f34267u0 && (list = this.f34258l0) != null && list.size() > 0) {
            m44763P3(this.f34258l0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void mo29759F3(View view) {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26657Z4(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void mo29760H3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int id = view.getId();
        if (id == R.id.iv_add_to_playlist) {
            m44781s3(i);
        } else if (id == R.id.popup_menu) {
            m44762O3(view, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void mo29761J3() {
        TrackAdapter trackAdapter = this.f34257k0;
        if (trackAdapter != null) {
            trackAdapter.setDuration(300);
        }
    }

    /* renamed from: L3 */
    private void m44759L3(int i) {
        List<Music> list;
        this.f34257k0 = null;
        TrackAdapter trackAdapter = new TrackAdapter((i != 0 && i == 1) ? R.layout.item_default : R.layout.item_default_grid, this.f34258l0, 3, 0, i, true, 0);
        this.f34257k0 = trackAdapter;
        trackAdapter.isFirstOnly(false);
        this.f34257k0.setHasStableIds(true);
        if (i != 1 || this.f34257k0.getHeaderLayoutCount() != 0 || (list = this.f34258l0) == null || list.size() <= 0) {
            this.f34257k0.removeAllHeaderView();
            return;
        }
        View y3 = m44787y3();
        this.f34269w0 = y3;
        if (y3 != null) {
            this.f34257k0.addHeaderView(y3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public void m44760M3() {
        if (!AdHelper.m49536p().mo32459v(mo3606L(), new C8135b())) {
            m44761N3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public void m44761N3() {
        try {
            mo3634T2(C8333k.m46051b(mo3606L(), 0, C8337n.m46065k0(mo3606L()).mo30119L0(), true), 1029);
        } catch (Exception unused) {
        }
    }

    /* renamed from: O3 */
    private void m44762O3(View view, int i) {
        if (this.f34268v0 == null) {
            C7249s0 s0Var = new C7249s0(mo3606L(), 5, 0);
            this.f34268v0 = s0Var;
            s0Var.mo27759j(this);
            this.f34268v0.mo27830J(this);
        }
        this.f34268v0.mo27829H(i, this.f34258l0);
        this.f34268v0.mo27743k(view);
    }

    /* renamed from: P3 */
    private void m44763P3(List<Music> list) {
        if (list != null) {
            try {
                int nextInt = new Random().nextInt(list.size());
                C8287e.m45781F0(5, (ImageView) null, 0, true);
                C8287e.m45858n0(true);
                C8287e.m45823a0(nextInt, list);
                ((LibraryActivity) mo3606L()).mo26674m4();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public void m44764Q3(Intent intent) {
        if (intent != null) {
            boolean z = intent.getExtras().getBoolean("disPlaySelectTitle");
            DeepDefaultTitle deepDefaultTitle = this.f34262p0;
            if (deepDefaultTitle != null) {
                deepDefaultTitle.setVisibility(z ? 4 : 0);
            }
        }
    }

    /* renamed from: R3 */
    private void m44765R3() {
        if (this.f34257k0 == null) {
            m44759L3(this.f34266t0);
        }
        m44782t3(this.f34266t0);
    }

    /* renamed from: U3 */
    private boolean m44766U3() {
        if (mo3638V() != null) {
            this.f34260n0 = mo3638V().getLong("album_id");
            this.f34261o0 = mo3638V().getString("album_title");
        }
        if (this.f34260n0 > 0) {
            return false;
        }
        C8345u.m46340u(R.string.error);
        return true;
    }

    /* renamed from: V3 */
    private void m44767V3(int i) {
        if (this.f34258l0 != null) {
            this.f34266t0 = i;
            C8337n.m46065k0(mo3606L()).mo30253s1(this.f34266t0);
            m44759L3(this.f34266t0);
            m44782t3(this.f34266t0);
            return;
        }
        mo29766h3(true, false);
    }

    /* renamed from: W3 */
    private void m44768W3() {
        this.f34262p0.setTitleOnClickListener(new C8134a());
    }

    /* renamed from: X3 */
    private void m44769X3() {
        this.f34262p0.setTitleText(this.f34261o0);
        this.f34262p0.setHomeIcon(false);
        C8343s.m46307o(this.f34265s0, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public void m44770Y3(List<Music> list) {
        if (list == null) {
            List<Music> list2 = this.f34258l0;
            if (list2 != null) {
                list2.clear();
                TrackAdapter trackAdapter = this.f34257k0;
                if (trackAdapter != null) {
                    trackAdapter.notifyDataSetChanged();
                }
            }
            mo29763S3(true);
        } else if (list.size() > 0) {
            List<Music> list3 = this.f34258l0;
            if (list3 != null) {
                list3.clear();
                this.f34258l0.addAll(list);
            } else {
                this.f34258l0 = list;
            }
            m44765R3();
            mo29763S3(false);
        } else {
            List<Music> list4 = this.f34258l0;
            if (list4 != null) {
                list4.clear();
                TrackAdapter trackAdapter2 = this.f34257k0;
                if (trackAdapter2 != null) {
                    trackAdapter2.notifyDataSetChanged();
                }
            }
            mo29763S3(true);
        }
    }

    /* renamed from: s3 */
    private void m44781s3(int i) {
        List<Music> list = this.f34258l0;
        if (list != null && list.size() > 0) {
            C8287e.m45818Y(this.f34258l0.get(i));
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46327h().getResources().getString(R.string.success_add_to_next));
        }
    }

    /* renamed from: t3 */
    private void m44782t3(int i) {
        TrackAdapter trackAdapter;
        if (this.f34256j0 != null && (trackAdapter = this.f34257k0) != null) {
            trackAdapter.setOnItemClickListener(this.f34272z0);
            this.f34257k0.setOnItemChildClickListener(this.f34271y0);
            this.f34257k0.mo26921y(this);
            this.f34256j0.setAdapter(this.f34257k0);
            if (i == 1) {
                this.f34256j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34256j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34256j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34256j0.mo4596e1(i2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public void m44783u3() {
        if (this.f34263q0.mo30200f()) {
            new Handler().postDelayed(new C8137d(), 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public void m44784v3() {
        FragmentActivity L = mo3606L();
        if (L != null) {
            L.onBackPressed();
        }
    }

    /* renamed from: w3 */
    private void m44785w3() {
        C8287e.m45793L0(false);
        C8287e.m45791K0(-1);
        C8287e.m45849j();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public void m44786x3(int i) {
        int i2;
        TrackAdapter trackAdapter = this.f34257k0;
        if (trackAdapter != null) {
            trackAdapter.mo26916q(i);
            TrackAdapter trackAdapter2 = this.f34257k0;
            List<Music> list = this.f34258l0;
            if (list == null) {
                i2 = 0;
            } else {
                i2 = list.size() - mo29547Z2(this.f34258l0.size());
            }
            trackAdapter2.mo26907A(false, i2);
        }
    }

    /* renamed from: y3 */
    private View m44787y3() {
        View view = null;
        try {
            view = mo3676k0().inflate(R.layout.head_view_shuffle, (ViewGroup) this.f34256j0.getParent(), false);
            ((ImageView) view.findViewById(R.id.iv_shuffle_all)).setImageDrawable(C8343s.m46303k(R.drawable.ic_home01_play_all, R.color.colorAccent));
            ImageView imageView = (ImageView) view.findViewById(R.id.multiOption);
            imageView.setImageDrawable(C8343s.m46298f(R.drawable.ic_home03_choose));
            ((TextView) view.findViewById(R.id.tv_play_all)).setTextColor(C8343s.m46295c(R.color.default_text_color));
            ((ImageView) view.findViewById(R.id.sortOption)).setVisibility(8);
            view.setOnClickListener(new C8140m(this));
            imageView.setOnClickListener(new C8124k(this));
            return view;
        } catch (Exception e) {
            e.printStackTrace();
            return view;
        }
    }

    /* renamed from: z3 */
    private void m44788z3() {
        if (!m44766U3()) {
            this.f34263q0 = new C8337n(mo3606L());
            mo29766h3(true, false);
        }
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B */
    public void mo29479B(boolean z) {
        this.f34267u0 = z;
        mo29764T3(!z);
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        m44785w3();
        if (this.f34257k0 != null) {
            this.f34257k0 = null;
        }
        if (this.f34256j0 != null) {
            this.f34256j0 = null;
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45976e(mo3606L(), i, j, i2, str);
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: K3 */
    public void mo29762K3() {
        m44788z3();
    }

    /* renamed from: Q */
    public void mo26506Q() {
    }

    /* renamed from: R */
    public void mo26507R() {
    }

    /* renamed from: S3 */
    public void mo29763S3(boolean z) {
        RelativeLayout relativeLayout = this.f34270x0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: T3 */
    public void mo29764T3(boolean z) {
        List<Music> list;
        this.f34257k0.setDuration(0);
        if (!z) {
            this.f34257k0.removeHeaderView(this.f34269w0);
        } else if (this.f34266t0 == 1 && this.f34257k0.getHeaderLayoutCount() == 0 && (list = this.f34258l0) != null && list.size() > 0) {
            ViewParent parent = this.f34269w0.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f34257k0.addHeaderView(this.f34269w0);
        }
        new Handler().postDelayed(new C8130l(this), 500);
    }

    /* renamed from: U */
    public void mo26508U() {
    }

    /* renamed from: W0 */
    public void mo26509W0() {
    }

    /* renamed from: Z3 */
    public void mo29765Z3(int i) {
        if (this.f34257k0 != null && this.f34256j0 != null && i != this.f34266t0) {
            m44767V3(i);
        }
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8133l2.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29766h3(true, true);
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
        }
    }

    /* renamed from: h3 */
    public void mo29766h3(boolean z, boolean z2) {
        C8138e eVar = this.f34259m0;
        if (eVar != null && eVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34259m0.cancel(true);
            this.f34259m0 = null;
        }
        C8138e eVar2 = new C8138e(this, z, z2);
        this.f34259m0 = eVar2;
        eVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
    }

    /* renamed from: i1 */
    public void mo26514i1() {
    }

    /* renamed from: l0 */
    public void mo26515l0() {
    }

    /* renamed from: m1 */
    public void mo26516m1(ArrayList<SoundEffect> arrayList) {
    }

    /* renamed from: n1 */
    public void mo26517n1() {
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

    /* renamed from: r */
    public void mo28063r(long j, int i) {
        C8314f.m45974c(mo3606L(), j, i, 5);
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34255i0 = layoutInflater.inflate(R.layout.title_recyclerview, (ViewGroup) null);
        m44754B3();
        m44768W3();
        mo29762K3();
        m44769X3();
        m44753A3();
        mo29550c3();
        this.f34266t0 = C8337n.m46065k0(mo3606L()).mo30178a();
        m44785w3();
        return this.f34255i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34257k0, i, j);
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        C8138e eVar = this.f34259m0;
        if (eVar != null) {
            eVar.cancel(true);
            this.f34259m0 = null;
        }
        if (this.f34264r0 != null) {
            mo3606L().unregisterReceiver(this.f34264r0);
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
