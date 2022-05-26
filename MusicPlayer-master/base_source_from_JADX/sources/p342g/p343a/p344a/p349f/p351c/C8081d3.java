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
import coocent.music.player.widget.p275k.C7254t0;
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
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8333k;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.d3 */
/* compiled from: RecentlyAddDetailFragment */
public class C8081d3 extends C8010a implements C7324c, C7949b, C7963p {

    /* renamed from: i0 */
    private View f34122i0;

    /* renamed from: j0 */
    RecyclerView f34123j0;

    /* renamed from: k0 */
    public TrackAdapter f34124k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public List<Music> f34125l0;

    /* renamed from: m0 */
    private C8084c f34126m0;

    /* renamed from: n0 */
    private DeepDefaultTitle f34127n0;

    /* renamed from: o0 */
    private C8337n f34128o0;

    /* renamed from: p0 */
    private C8085d f34129p0;

    /* renamed from: q0 */
    private ImageView f34130q0;

    /* renamed from: r0 */
    private int f34131r0 = 0;

    /* renamed from: s0 */
    private boolean f34132s0 = false;

    /* renamed from: t0 */
    private C7249s0 f34133t0;

    /* renamed from: u0 */
    View f34134u0;

    /* renamed from: v0 */
    private RelativeLayout f34135v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public C7254t0 f34136w0;
    @SuppressLint({"NonConstantResourceId"})

    /* renamed from: x0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34137x0 = new C8215w1(this);

    /* renamed from: y0 */
    private final BaseQuickAdapter.OnItemClickListener f34138y0 = new C8083b();

    /* renamed from: g.a.a.f.c.d3$a */
    /* compiled from: RecentlyAddDetailFragment */
    class C8082a extends C7970w {
        C8082a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: G */
        public /* synthetic */ void mo29683H(int i) {
            C8337n.m46065k0(C8345u.m46327h()).mo30258t2(i);
            C8081d3.this.mo29682h3(false);
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.week_notify_last_added"));
        }

        /* renamed from: A */
        public void mo26689A() {
            super.mo26689A();
            try {
                ((LibraryActivity) C8081d3.this.mo3606L()).mo26659b5(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: B */
        public void mo26690B() {
            super.mo26690B();
            try {
                ((LibraryActivity) C8081d3.this.mo3606L()).mo26659b5(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: D */
        public void mo26691D() {
            super.mo26691D();
            try {
                ((LibraryActivity) C8081d3.this.mo3606L()).mo26677q5();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: E */
        public void mo26692E() {
            super.mo26692E();
            try {
                ((LibraryActivity) C8081d3.this.mo3606L()).mo26680r5();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: F */
        public void mo29493F(View view) {
            super.mo29493F(view);
            Context a0 = C8081d3.this.mo3651a0();
            if (a0 != null) {
                int w0 = C8337n.m46065k0(a0).mo30268w0();
                if (C8081d3.this.f34136w0 == null) {
                    C7254t0 unused = C8081d3.this.f34136w0 = new C7254t0(a0);
                }
                C8081d3.this.f34136w0.mo27837s(a0, w0, new C8182r1(this));
                C8081d3.this.f34136w0.mo27838v(C8345u.m46333n(R.string.week_add_tip));
                C8081d3.this.f34136w0.mo27759j(C8081d3.this);
                C8081d3.this.f34136w0.mo27743k(view);
            }
        }

        /* renamed from: b */
        public void mo26693b() {
            super.mo26693b();
            C8081d3.this.f34124k0.mo26909f(false, 0);
            if (C8081d3.this.mo3606L() != null) {
                FragmentActivity L = C8081d3.this.mo3606L();
                if (L instanceof LibraryActivity) {
                    ((LibraryActivity) L).mo26676p2(false, C8081d3.this.f34125l0 == null ? 0 : C8081d3.this.f34125l0.size());
                }
            }
        }

        /* renamed from: o */
        public void mo26694o() {
            super.mo26694o();
            C8081d3.this.m44447P3();
        }

        /* renamed from: t */
        public void mo26591t() {
            C8081d3.this.m44470v3();
        }

        /* renamed from: u */
        public void mo26697u() {
            super.mo26697u();
            try {
                ((LibraryActivity) C8081d3.this.mo3606L()).mo26659b5(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: v */
        public void mo26698v() {
            super.mo26698v();
            try {
                ((LibraryActivity) C8081d3.this.mo3606L()).mo26659b5(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: w */
        public void mo26699w() {
            super.mo26699w();
            try {
                ((LibraryActivity) C8081d3.this.mo3606L()).mo26659b5(7);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: x */
        public void mo26700x() {
            super.mo26700x();
            try {
                ((LibraryActivity) C8081d3.this.mo3606L()).mo26659b5(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: y */
        public void mo26701y() {
            super.mo26701y();
            try {
                ((LibraryActivity) C8081d3.this.mo3606L()).mo26659b5(4);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: z */
        public void mo26702z() {
            super.mo26702z();
            try {
                ((LibraryActivity) C8081d3.this.mo3606L()).mo26659b5(6);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.f.c.d3$b */
    /* compiled from: RecentlyAddDetailFragment */
    class C8083b implements BaseQuickAdapter.OnItemClickListener {
        C8083b() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8287e.m45800P()) {
                C8287e.m45858n0(true);
                C8287e.m45823a0(i, C8081d3.this.f34125l0);
                C8081d3.this.m44469u3();
                return;
            }
            C8081d3.this.m44472x3(i);
        }
    }

    /* renamed from: g.a.a.f.c.d3$c */
    /* compiled from: RecentlyAddDetailFragment */
    private static class C8084c extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private final WeakReference<C8081d3> f34141a;

        public C8084c(C8081d3 d3Var, boolean z) {
            this.f34141a = new WeakReference<>(d3Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Music> doInBackground(Void... voidArr) {
            if (((C8081d3) this.f34141a.get()) == null) {
                return null;
            }
            return C4477c.m19601U(C8345u.m46327h(), C8337n.m46065k0(C8345u.m46327h()).mo30268w0() + 1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Music> list) {
            C8081d3 d3Var;
            super.onPostExecute(list);
            if (!isCancelled() && (d3Var = (C8081d3) this.f34141a.get()) != null) {
                boolean unused = d3Var.f33734d0 = true;
                d3Var.m44456a4(list);
            }
        }
    }

    /* renamed from: g.a.a.f.c.d3$d */
    /* compiled from: RecentlyAddDetailFragment */
    private class C8085d extends BroadcastReceiver {
        private C8085d() {
        }

        public void onReceive(Context context, Intent intent) {
            TrackAdapter trackAdapter;
            TrackAdapter trackAdapter2;
            int intExtra;
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.playlist_detail_remove_notify")) {
                C8081d3.this.mo29682h3(true);
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action")) {
                C8081d3.this.mo29682h3(true);
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.album_track_artwork_item_notify") && C8081d3.this.f34124k0 != null && (intExtra = intent.getIntExtra("artwork_position", -1)) >= 0) {
                TrackAdapter trackAdapter3 = C8081d3.this.f34124k0;
                trackAdapter3.notifyItemChanged(intExtra + trackAdapter3.getHeaderLayoutCount());
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action") && (trackAdapter2 = C8081d3.this.f34124k0) != null) {
                trackAdapter2.notifyDataSetChanged();
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui")) {
                C8081d3.this.m44451T3(intent);
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.clean_list") && (trackAdapter = C8081d3.this.f34124k0) != null) {
                trackAdapter.notifyDataSetChanged();
            }
        }

        /* synthetic */ C8085d(C8081d3 d3Var, C8082a aVar) {
            this();
        }
    }

    static {
        Class<C8081d3> cls = C8081d3.class;
    }

    /* renamed from: A3 */
    private void m44438A3() {
        this.f34129p0 = new C8085d(this, (C8082a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.album_track_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
        mo3606L().registerReceiver(this.f34129p0, intentFilter);
    }

    /* renamed from: B3 */
    private void m44439B3() {
        this.f34123j0 = (RecyclerView) this.f34122i0.findViewById(R.id.recyclerView);
        this.f34135v0 = (RelativeLayout) this.f34122i0.findViewById(R.id.rl_no);
        ImageView imageView = (ImageView) this.f34122i0.findViewById(R.id.iv_no);
        TextView textView = (TextView) this.f34122i0.findViewById(R.id.tv_no);
        textView.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        textView.setText(C8345u.m46333n(R.string.music_eq_lbl_no_songs_found));
        this.f34123j0.getItemAnimator().mo4865w(0);
        this.f34123j0.getItemAnimator().mo4866x(0);
        this.f34123j0.getItemAnimator().mo4868z(0);
        this.f34123j0.getItemAnimator().mo4843A(0);
        ((C0916y) this.f34123j0.getItemAnimator()).mo5428V(false);
        this.f34127n0 = (DeepDefaultTitle) this.f34122i0.findViewById(R.id.defualt_title);
        this.f34130q0 = (ImageView) this.f34122i0.findViewById(R.id.iv_bg);
        this.f34127n0.setMutilIcon(true);
        this.f34127n0.setMenuIcon(false);
        this.f34127n0.setEqIcon(false);
        this.f34127n0.setSearchIcon(false);
        this.f34127n0.setWeekIcon(true);
        this.f34127n0.mo27431B(true, true);
        this.f34127n0.setSort(13);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void mo29673E3() {
        try {
            if (mo3606L() != null) {
                mo3627R2(new Intent(mo3606L(), MainActivity.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void mo29674G3(View view) {
        List<Music> list;
        if (!this.f34132s0 && (list = this.f34125l0) != null && list.size() > 0) {
            m44450S3(this.f34125l0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void mo29675I3(View view) {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26657Z4(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void mo29676K3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int id = view.getId();
        if (id == R.id.iv_add_to_playlist) {
            m44467s3(i);
        } else if (id == R.id.popup_menu) {
            m44449R3(view, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public /* synthetic */ void mo29677M3() {
        this.f34124k0.setDuration(300);
    }

    /* renamed from: O3 */
    private void m44446O3(int i) {
        List<Music> list;
        this.f34124k0 = null;
        TrackAdapter trackAdapter = new TrackAdapter((i != 0 && i == 1) ? R.layout.item_default : R.layout.item_default_grid, this.f34125l0, 3, 0, i, true, 0);
        this.f34124k0 = trackAdapter;
        trackAdapter.isFirstOnly(false);
        this.f34124k0.setHasStableIds(true);
        if (i != 1 || this.f34124k0.getHeaderLayoutCount() != 0 || (list = this.f34125l0) == null || list.size() <= 0) {
            this.f34124k0.removeAllHeaderView();
            return;
        }
        View y3 = m44473y3();
        this.f34134u0 = y3;
        if (y3 != null) {
            this.f34124k0.addHeaderView(y3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public void m44447P3() {
        if (!AdHelper.m49536p().mo32459v(mo3606L(), new C8186s1(this))) {
            m44448Q3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public void m44448Q3() {
        try {
            mo3634T2(C8333k.m46051b(mo3606L(), 0, C8337n.m46065k0(mo3606L()).mo30119L0(), true), 1029);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: R3 */
    private void m44449R3(View view, int i) {
        if (this.f34133t0 == null) {
            C7249s0 s0Var = new C7249s0(mo3606L(), 5, 0);
            this.f34133t0 = s0Var;
            s0Var.mo27759j(this);
            this.f34133t0.mo27830J(this);
        }
        this.f34133t0.mo27829H(i, this.f34125l0);
        this.f34133t0.mo27743k(view);
    }

    /* renamed from: S3 */
    private void m44450S3(List<Music> list) {
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
    /* renamed from: T3 */
    public void m44451T3(Intent intent) {
        if (intent != null) {
            boolean z = intent.getExtras().getBoolean("disPlaySelectTitle");
            DeepDefaultTitle deepDefaultTitle = this.f34127n0;
            if (deepDefaultTitle != null) {
                deepDefaultTitle.setVisibility(z ? 4 : 0);
            }
        }
    }

    /* renamed from: U3 */
    private void m44452U3() {
        if (this.f34124k0 == null) {
            m44446O3(this.f34131r0);
        }
        m44468t3(this.f34131r0);
    }

    /* renamed from: X3 */
    private void m44453X3(int i) {
        if (this.f34125l0 != null) {
            this.f34131r0 = i;
            C8337n.m46065k0(mo3606L()).mo30253s1(this.f34131r0);
            m44446O3(this.f34131r0);
            m44468t3(this.f34131r0);
            return;
        }
        mo29682h3(true);
    }

    /* renamed from: Y3 */
    private void m44454Y3() {
        this.f34127n0.setTitleOnClickListener(new C8082a());
    }

    /* renamed from: Z3 */
    private void m44455Z3() {
        this.f34127n0.setTitleText(C8345u.m46333n(R.string.last_added));
        this.f34127n0.setHomeIcon(false);
        C8343s.m46307o(this.f34130q0, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public void m44456a4(List<Music> list) {
        if (list == null) {
            List<Music> list2 = this.f34125l0;
            if (list2 != null) {
                list2.clear();
                TrackAdapter trackAdapter = this.f34124k0;
                if (trackAdapter != null) {
                    trackAdapter.notifyDataSetChanged();
                }
            }
            mo29679V3(true);
        } else if (list.size() > 0) {
            List<Music> list3 = this.f34125l0;
            if (list3 != null) {
                list3.clear();
                this.f34125l0.addAll(list);
            } else {
                this.f34125l0 = list;
            }
            m44452U3();
            mo29679V3(false);
        } else {
            List<Music> list4 = this.f34125l0;
            if (list4 != null) {
                list4.clear();
                TrackAdapter trackAdapter2 = this.f34124k0;
                if (trackAdapter2 != null) {
                    trackAdapter2.notifyDataSetChanged();
                }
            }
            mo29679V3(true);
        }
    }

    /* renamed from: s3 */
    private void m44467s3(int i) {
        List<Music> list = this.f34125l0;
        if (list != null && list.size() > 0) {
            C8287e.m45818Y(this.f34125l0.get(i));
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46327h().getResources().getString(R.string.success_add_to_next));
        }
    }

    /* renamed from: t3 */
    private void m44468t3(int i) {
        TrackAdapter trackAdapter;
        if (this.f34123j0 != null && (trackAdapter = this.f34124k0) != null) {
            trackAdapter.setOnItemClickListener(this.f34138y0);
            this.f34124k0.setOnItemChildClickListener(this.f34137x0);
            this.f34124k0.mo26921y(this);
            this.f34123j0.setAdapter(this.f34124k0);
            if (i == 1) {
                this.f34123j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34123j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34123j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34123j0.mo4596e1(i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public void m44469u3() {
        if (this.f34128o0.mo30200f()) {
            new Handler().postDelayed(new C8193t1(this), 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public void m44470v3() {
        FragmentActivity L = mo3606L();
        if (L != null) {
            L.onBackPressed();
        }
    }

    /* renamed from: w3 */
    private void m44471w3() {
        C8287e.m45793L0(false);
        C8287e.m45791K0(-1);
        C8287e.m45849j();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public void m44472x3(int i) {
        TrackAdapter trackAdapter = this.f34124k0;
        if (trackAdapter != null) {
            trackAdapter.mo26916q(i);
            TrackAdapter trackAdapter2 = this.f34124k0;
            List<Music> list = this.f34125l0;
            trackAdapter2.mo26907A(false, list == null ? 0 : list.size() - mo29547Z2(this.f34125l0.size()));
        }
    }

    /* renamed from: y3 */
    private View m44473y3() {
        View view = null;
        try {
            view = mo3676k0().inflate(R.layout.head_view_shuffle, (ViewGroup) this.f34123j0.getParent(), false);
            ((ImageView) view.findViewById(R.id.iv_shuffle_all)).setImageDrawable(C8343s.m46303k(R.drawable.ic_home01_play_all, R.color.colorAccent));
            ((TextView) view.findViewById(R.id.tv_play_all)).setTextColor(C8343s.m46295c(R.color.default_text_color));
            ((ImageView) view.findViewById(R.id.sortOption)).setVisibility(8);
            ImageView imageView = (ImageView) view.findViewById(R.id.multiOption);
            imageView.setImageDrawable(C8343s.m46298f(R.drawable.ic_home03_choose));
            view.setOnClickListener(new C8199u1(this));
            imageView.setOnClickListener(new C8208v1(this));
            return view;
        } catch (Exception e) {
            e.printStackTrace();
            return view;
        }
    }

    /* renamed from: z3 */
    private void m44474z3() {
        this.f34128o0 = new C8337n(mo3606L());
        mo29682h3(true);
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B */
    public void mo29479B(boolean z) {
        this.f34132s0 = z;
        mo29680W3(!z);
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        m44471w3();
        if (this.f34124k0 != null) {
            this.f34124k0 = null;
        }
        if (this.f34123j0 != null) {
            this.f34123j0 = null;
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45976e(mo3606L(), i, j, i2, str);
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: N3 */
    public void mo29678N3() {
        m44474z3();
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

    /* renamed from: V3 */
    public void mo29679V3(boolean z) {
        RelativeLayout relativeLayout = this.f34135v0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
        TrackAdapter trackAdapter = this.f34124k0;
        if (trackAdapter != null && trackAdapter.getHeaderLayoutCount() == 0) {
            this.f34124k0.addHeaderView(this.f34134u0);
        }
        TrackAdapter trackAdapter2 = this.f34124k0;
        if (trackAdapter2 != null && z) {
            trackAdapter2.removeAllHeaderView();
        }
    }

    /* renamed from: W0 */
    public void mo26509W0() {
    }

    /* renamed from: W3 */
    public void mo29680W3(boolean z) {
        List<Music> list;
        this.f34124k0.setDuration(0);
        if (!z) {
            this.f34124k0.removeHeaderView(this.f34134u0);
        } else if (this.f34131r0 == 1 && this.f34124k0.getHeaderLayoutCount() == 0 && (list = this.f34125l0) != null && list.size() > 0) {
            ViewParent parent = this.f34134u0.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f34124k0.addHeaderView(this.f34134u0);
        }
        new Handler().postDelayed(new C8219x1(this), 500);
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8081d3.class.getSimpleName();
    }

    /* renamed from: b4 */
    public void mo29681b4(int i) {
        if (this.f34124k0 != null && this.f34123j0 != null && i != this.f34131r0) {
            m44453X3(i);
        }
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29682h3(true);
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
        }
    }

    /* renamed from: h3 */
    public void mo29682h3(boolean z) {
        C8084c cVar = this.f34126m0;
        if (cVar != null && cVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34126m0.cancel(true);
            this.f34126m0 = null;
        }
        C8084c cVar2 = new C8084c(this, z);
        this.f34126m0 = cVar2;
        cVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
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

    @SuppressLint({"InflateParams"})
    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34122i0 = layoutInflater.inflate(R.layout.title_recyclerview, (ViewGroup) null);
        m44439B3();
        m44454Y3();
        mo29678N3();
        m44455Z3();
        m44438A3();
        this.f34131r0 = C8337n.m46065k0(mo3606L()).mo30178a();
        m44471w3();
        return this.f34122i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34124k0, i, j);
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        C8084c cVar = this.f34126m0;
        if (cVar != null) {
            cVar.cancel(true);
            this.f34126m0 = null;
        }
        if (this.f34129p0 != null) {
            mo3606L().unregisterReceiver(this.f34129p0);
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
