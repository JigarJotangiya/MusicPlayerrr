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
import android.widget.ProgressBar;
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
import coocent.music.player.base.BaseApplication;
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
import p342g.p343a.p344a.p346c.C7949b;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p347d.C7974d;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.c3 */
/* compiled from: RecentFragment */
public class C8071c3 extends C8010a implements C7324c, C7949b, C7963p {

    /* renamed from: z0 */
    public static final String f34095z0 = C8071c3.class.getSimpleName();

    /* renamed from: i0 */
    private View f34096i0;

    /* renamed from: j0 */
    RecyclerView f34097j0;

    /* renamed from: k0 */
    public TrackAdapter f34098k0;

    /* renamed from: l0 */
    public List<Music> f34099l0;

    /* renamed from: m0 */
    private C8075d f34100m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public C7974d f34101n0;

    /* renamed from: o0 */
    private C8076e f34102o0;

    /* renamed from: p0 */
    private C8337n f34103p0;

    /* renamed from: q0 */
    private int f34104q0 = 0;

    /* renamed from: r0 */
    private boolean f34105r0 = false;

    /* renamed from: s0 */
    private C7249s0 f34106s0;

    /* renamed from: t0 */
    private View f34107t0;

    /* renamed from: u0 */
    private DeepDefaultTitle f34108u0;

    /* renamed from: v0 */
    private RelativeLayout f34109v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public C7254t0 f34110w0;

    /* renamed from: x0 */
    private final BaseQuickAdapter.OnItemClickListener f34111x0 = new C8073b();
    @SuppressLint({"NonConstantResourceId"})

    /* renamed from: y0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34112y0 = new C8142m1(this);

    /* renamed from: g.a.a.f.c.c3$a */
    /* compiled from: RecentFragment */
    class C8072a extends C7970w {
        C8072a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: G */
        public /* synthetic */ void mo29663H(int i) {
            C8337n.m46065k0(C8345u.m46327h()).mo30266v2(i);
            C8071c3.this.mo29662h3();
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.week_notify_last_played"));
        }

        /* renamed from: A */
        public void mo26689A() {
            super.mo26689A();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8071c3.this.mo3606L();
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
                LibraryActivity libraryActivity = (LibraryActivity) C8071c3.this.mo3606L();
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
                LibraryActivity libraryActivity = (LibraryActivity) C8071c3.this.mo3606L();
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
                LibraryActivity libraryActivity = (LibraryActivity) C8071c3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26680r5();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: F */
        public void mo29493F(View view) {
            super.mo29493F(view);
            Context a0 = C8071c3.this.mo3651a0();
            if (a0 != null) {
                int y0 = C8337n.m46065k0(a0).mo30276y0();
                if (C8071c3.this.f34110w0 == null) {
                    C7254t0 unused = C8071c3.this.f34110w0 = new C7254t0(a0);
                }
                C8071c3.this.f34110w0.mo27837s(a0, y0, new C8132l1(this));
                C8071c3.this.f34110w0.mo27759j(C8071c3.this);
                C8071c3.this.f34110w0.mo27743k(view);
            }
        }

        /* renamed from: b */
        public void mo26693b() {
            super.mo26693b();
            C8071c3.this.f34098k0.mo26909f(false, 0);
            if (C8071c3.this.mo3606L() != null) {
                FragmentActivity L = C8071c3.this.mo3606L();
                if (L instanceof LibraryActivity) {
                    LibraryActivity libraryActivity = (LibraryActivity) L;
                    List<Music> list = C8071c3.this.f34099l0;
                    libraryActivity.mo26676p2(false, list == null ? 0 : list.size());
                }
            }
        }

        /* renamed from: o */
        public void mo26694o() {
            super.mo26694o();
        }

        /* renamed from: t */
        public void mo26591t() {
            C8071c3.this.m44378v3();
        }

        /* renamed from: u */
        public void mo26697u() {
            super.mo26697u();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8071c3.this.mo3606L();
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
                LibraryActivity libraryActivity = (LibraryActivity) C8071c3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26659b5(2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: w */
        public void mo26699w() {
            super.mo26699w();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8071c3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26659b5(7);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: x */
        public void mo26700x() {
            super.mo26700x();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8071c3.this.mo3606L();
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
                LibraryActivity libraryActivity = (LibraryActivity) C8071c3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26659b5(4);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: z */
        public void mo26702z() {
            super.mo26702z();
            try {
                LibraryActivity libraryActivity = (LibraryActivity) C8071c3.this.mo3606L();
                if (libraryActivity != null) {
                    libraryActivity.mo26659b5(6);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.f.c.c3$b */
    /* compiled from: RecentFragment */
    class C8073b implements BaseQuickAdapter.OnItemClickListener {
        C8073b() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8287e.m45800P()) {
                C8287e.m45858n0(true);
                C8287e.m45823a0(i, C8071c3.this.f34099l0);
                C8071c3.this.m44377u3();
                return;
            }
            C8071c3.this.m44379w3(i);
        }
    }

    /* renamed from: g.a.a.f.c.c3$c */
    /* compiled from: RecentFragment */
    class C8074c implements Runnable {
        C8074c() {
        }

        public void run() {
            C8071c3.this.f34098k0.setDuration(300);
        }
    }

    /* renamed from: g.a.a.f.c.c3$d */
    /* compiled from: RecentFragment */
    private static class C8075d extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private final WeakReference<C8071c3> f34116a;

        /* synthetic */ C8075d(C8071c3 c3Var, C8072a aVar) {
            this(c3Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Music> doInBackground(Void... voidArr) {
            C8071c3 c3Var = (C8071c3) this.f34116a.get();
            if (c3Var == null) {
                return null;
            }
            if (c3Var.f34101n0 == null) {
                C7974d unused = c3Var.f34101n0 = C7974d.m43656d(c3Var.mo3651a0());
            }
            return c3Var.f34101n0.mo29511e(BaseApplication.f31150n, C8337n.m46065k0(c3Var.mo3651a0()).mo30276y0() + 1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Music> list) {
            C8071c3 c3Var;
            super.onPostExecute(list);
            if (!isCancelled() && (c3Var = (C8071c3) this.f34116a.get()) != null) {
                boolean unused = c3Var.f33734d0 = true;
                c3Var.m44364V3(list);
            }
        }

        private C8075d(C8071c3 c3Var) {
            this.f34116a = new WeakReference<>(c3Var);
        }
    }

    /* renamed from: g.a.a.f.c.c3$e */
    /* compiled from: RecentFragment */
    private class C8076e extends BroadcastReceiver {
        private C8076e() {
        }

        public void onReceive(Context context, Intent intent) {
            TrackAdapter trackAdapter;
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action")) {
                C8071c3.this.mo29662h3();
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.list_notifiy.action")) {
                TrackAdapter trackAdapter2 = C8071c3.this.f34098k0;
                if (trackAdapter2 != null) {
                    trackAdapter2.notifyDataSetChanged();
                }
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.recent_artwork_item_notify")) {
                if (C8071c3.this.f34098k0 != null) {
                    intent.getIntExtra("artwork_position", -1);
                    C8071c3.this.f34098k0.notifyDataSetChanged();
                }
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.detail_update_page")) {
                C8071c3 c3Var = C8071c3.this;
                if (c3Var.f34098k0 != null) {
                    c3Var.mo29662h3();
                }
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.add_to_recent_notify_action")) {
                C8071c3.this.mo29662h3();
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.recent_filter_notifiy")) {
                C8071c3 c3Var2 = C8071c3.this;
                if (c3Var2.f34098k0 != null) {
                    c3Var2.mo29662h3();
                }
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui")) {
                C8071c3.this.m44360P3(intent);
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.clean_list") && (trackAdapter = C8071c3.this.f34098k0) != null) {
                trackAdapter.notifyDataSetChanged();
            }
        }

        /* synthetic */ C8076e(C8071c3 c3Var, C8072a aVar) {
            this();
        }
    }

    /* renamed from: A3 */
    private void m44351A3() {
        this.f34097j0 = (RecyclerView) this.f34096i0.findViewById(R.id.recyclerView);
        this.f34109v0 = (RelativeLayout) this.f34096i0.findViewById(R.id.rl_no);
        TextView textView = (TextView) this.f34096i0.findViewById(R.id.tv_no);
        textView.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        textView.setText(C8345u.m46333n(R.string.music_eq_lbl_no_songs_found));
        ((ImageView) this.f34096i0.findViewById(R.id.iv_no)).setImageDrawable(C8343s.m46303k(R.drawable.ic_lists_no_song, R.color.colorAccent));
        C8343s.m46307o((ImageView) this.f34096i0.findViewById(R.id.iv_bg), false);
        this.f34097j0.getItemAnimator().mo4865w(0);
        this.f34097j0.getItemAnimator().mo4866x(0);
        this.f34097j0.getItemAnimator().mo4868z(0);
        this.f34097j0.getItemAnimator().mo4843A(0);
        ((C0916y) this.f34097j0.getItemAnimator()).mo5428V(false);
        ProgressBar progressBar = (ProgressBar) this.f34096i0.findViewById(R.id.progressbar);
        this.f34103p0 = new C8337n(mo3606L());
        DeepDefaultTitle deepDefaultTitle = (DeepDefaultTitle) this.f34096i0.findViewById(R.id.defualt_title);
        this.f34108u0 = deepDefaultTitle;
        deepDefaultTitle.setMutilIcon(true);
        this.f34108u0.setMenuIcon(false);
        this.f34108u0.setEqIcon(false);
        this.f34108u0.setSearchIcon(false);
        this.f34108u0.setWeekIcon(true);
        this.f34108u0.mo27431B(true, true);
        this.f34108u0.setSort(3);
        this.f34108u0.setTitleText(C8345u.m46333n(R.string.music_eq_recently_played));
        this.f34108u0.setHomeIcon(false);
        this.f34107t0 = m44380x3();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void mo29653C3() {
        try {
            if (mo3606L() != null) {
                mo3627R2(new Intent(mo3606L(), MainActivity.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void mo29654E3(View view) {
        List<Music> list;
        if (!this.f34105r0 && (list = this.f34099l0) != null && list.size() > 0) {
            m44359O3(this.f34099l0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void mo29655G3(View view) {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26657Z4(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void mo29656I3(View view) {
        List<Music> list;
        if (!this.f34105r0 && (list = this.f34099l0) != null && list.size() > 0) {
            m44359O3(this.f34099l0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void mo29657K3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int id = view.getId();
        if (id == R.id.iv_add_to_playlist) {
            m44375s3(i);
        } else if (id == R.id.popup_menu) {
            m44358N3(view, i);
        }
    }

    /* renamed from: M3 */
    private void m44357M3(int i) {
        List<Music> list;
        this.f34098k0 = null;
        TrackAdapter trackAdapter = new TrackAdapter((i != 0 && i == 1) ? R.layout.item_default : R.layout.item_default_grid, this.f34099l0, 1, 0, i, true, 0);
        this.f34098k0 = trackAdapter;
        trackAdapter.isFirstOnly(false);
        this.f34098k0.setHasStableIds(true);
        ViewParent parent = this.f34107t0.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        if (i != 1 || this.f34098k0.getHeaderLayoutCount() != 0 || (list = this.f34099l0) == null || list.size() <= 0) {
            this.f34098k0.removeHeaderView(this.f34107t0);
        } else {
            this.f34098k0.addHeaderView(this.f34107t0);
        }
    }

    /* renamed from: N3 */
    private void m44358N3(View view, int i) {
        if (this.f34106s0 == null) {
            C7249s0 s0Var = new C7249s0(mo3606L(), 1, 0);
            this.f34106s0 = s0Var;
            s0Var.mo27759j(this);
            this.f34106s0.mo27830J(this);
        }
        this.f34106s0.mo27829H(i, this.f34099l0);
        this.f34106s0.mo27743k(view);
    }

    /* renamed from: O3 */
    private void m44359O3(List<Music> list) {
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
    /* renamed from: P3 */
    public void m44360P3(Intent intent) {
        if (intent != null) {
            boolean z = intent.getExtras().getBoolean("disPlaySelectTitle");
            DeepDefaultTitle deepDefaultTitle = this.f34108u0;
            if (deepDefaultTitle != null) {
                deepDefaultTitle.setVisibility(z ? 4 : 0);
            }
        }
    }

    /* renamed from: Q3 */
    private void m44361Q3() {
        if (this.f34098k0 == null) {
            m44357M3(this.f34104q0);
        }
        m44376t3(this.f34104q0);
    }

    /* renamed from: T3 */
    private void m44362T3(int i) {
        if (this.f34099l0 != null) {
            this.f34104q0 = i;
            C8337n.m46065k0(mo3606L()).mo30262u2(this.f34104q0);
            m44357M3(this.f34104q0);
            m44376t3(this.f34104q0);
            return;
        }
        mo29662h3();
    }

    /* renamed from: U3 */
    private void m44363U3() {
        this.f34108u0.setTitleOnClickListener(new C8072a());
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public void m44364V3(List<Music> list) {
        if (list == null) {
            List<Music> list2 = this.f34099l0;
            if (list2 != null) {
                list2.clear();
                TrackAdapter trackAdapter = this.f34098k0;
                if (trackAdapter != null) {
                    trackAdapter.notifyDataSetChanged();
                }
            }
            mo29659R3(true);
        } else if (list.size() > 0) {
            List<Music> list3 = this.f34099l0;
            if (list3 != null) {
                list3.clear();
                this.f34099l0.addAll(list);
            } else {
                this.f34099l0 = list;
            }
            m44361Q3();
            mo29659R3(false);
        } else {
            List<Music> list4 = this.f34099l0;
            if (list4 != null) {
                list4.clear();
                TrackAdapter trackAdapter2 = this.f34098k0;
                if (trackAdapter2 != null) {
                    trackAdapter2.notifyDataSetChanged();
                }
            }
            mo29659R3(true);
        }
    }

    /* renamed from: s3 */
    private void m44375s3(int i) {
        List<Music> list = this.f34099l0;
        if (list != null && list.size() > 0) {
            C8287e.m45818Y(this.f34099l0.get(i));
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46327h().getResources().getString(R.string.success_add_to_next));
        }
    }

    /* renamed from: t3 */
    private void m44376t3(int i) {
        TrackAdapter trackAdapter;
        if (this.f34097j0 != null && (trackAdapter = this.f34098k0) != null) {
            trackAdapter.setOnItemClickListener(this.f34111x0);
            this.f34098k0.setOnItemChildClickListener(this.f34112y0);
            this.f34098k0.mo26921y(this);
            this.f34097j0.setAdapter(this.f34098k0);
            if (i == 1) {
                this.f34097j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34097j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34097j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34097j0.mo4596e1(i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public void m44377u3() {
        if (this.f34103p0.mo30200f()) {
            new Handler().postDelayed(new C8166p1(this), 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public void m44378v3() {
        FragmentActivity L = mo3606L();
        if (L != null) {
            L.onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public void m44379w3(int i) {
        TrackAdapter trackAdapter = this.f34098k0;
        if (trackAdapter != null) {
            trackAdapter.mo26916q(i);
            TrackAdapter trackAdapter2 = this.f34098k0;
            List<Music> list = this.f34099l0;
            trackAdapter2.mo26907A(false, list == null ? 0 : list.size() - mo29547Z2(this.f34099l0.size()));
        }
    }

    /* renamed from: x3 */
    private View m44380x3() {
        View inflate = mo3676k0().inflate(R.layout.head_view_shuffle, (ViewGroup) this.f34097j0.getParent(), false);
        ((ImageView) inflate.findViewById(R.id.iv_shuffle_all)).setImageDrawable(C8343s.m46303k(R.drawable.ic_home01_play_all, R.color.colorAccent));
        ((TextView) inflate.findViewById(R.id.tv_play_all)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((ImageView) inflate.findViewById(R.id.sortOption)).setVisibility(8);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.multiOption);
        imageView.setImageDrawable(C8343s.m46298f(R.drawable.ic_home03_choose));
        inflate.setOnClickListener(new C8173q1(this));
        imageView.setOnClickListener(new C8149n1(this));
        inflate.setOnClickListener(new C8157o1(this));
        return inflate;
    }

    /* renamed from: y3 */
    private void m44381y3() {
        mo29662h3();
    }

    /* renamed from: z3 */
    private void m44382z3() {
        this.f34102o0 = new C8076e(this, (C8072a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.list_notifiy.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.recent_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.detail_update_page");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.add_to_recent_notify_action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.recent_filter_notifiy");
        intentFilter.addAction(C8311c.f34737d);
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
        mo3606L().registerReceiver(this.f34102o0, intentFilter);
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B */
    public void mo29479B(boolean z) {
        this.f34105r0 = z;
        mo29660S3(!z);
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45976e(mo3606L(), i, j, i2, str);
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: L3 */
    public void mo29658L3() {
        m44381y3();
    }

    /* renamed from: Q */
    public void mo26506Q() {
    }

    /* renamed from: R */
    public void mo26507R() {
    }

    /* renamed from: R3 */
    public void mo29659R3(boolean z) {
        RelativeLayout relativeLayout = this.f34109v0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
        TrackAdapter trackAdapter = this.f34098k0;
        if (trackAdapter != null && trackAdapter.getHeaderLayoutCount() == 0) {
            this.f34098k0.addHeaderView(this.f34107t0);
        }
        TrackAdapter trackAdapter2 = this.f34098k0;
        if (trackAdapter2 != null && z) {
            trackAdapter2.removeAllHeaderView();
        }
    }

    /* renamed from: S3 */
    public void mo29660S3(boolean z) {
        List<Music> list;
        this.f34098k0.setDuration(0);
        if (!z) {
            this.f34098k0.removeHeaderView(this.f34107t0);
        } else if (this.f34104q0 == 1 && this.f34098k0.getHeaderLayoutCount() == 0 && (list = this.f34099l0) != null && list.size() > 0) {
            ViewParent parent = this.f34107t0.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f34098k0.addHeaderView(this.f34107t0);
        }
        new Handler().postDelayed(new C8074c(), 500);
    }

    /* renamed from: U */
    public void mo26508U() {
    }

    /* renamed from: W0 */
    public void mo26509W0() {
    }

    /* renamed from: W3 */
    public void mo29661W3(int i) {
        if (this.f34098k0 != null && this.f34097j0 != null && i != this.f34104q0) {
            m44362T3(i);
        }
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8071c3.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29662h3();
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
        }
    }

    /* renamed from: h3 */
    public void mo29662h3() {
        C8075d dVar = this.f34100m0;
        if (dVar != null && dVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34100m0.cancel(true);
            this.f34100m0 = null;
        }
        C8075d dVar2 = new C8075d(this, (C8072a) null);
        this.f34100m0 = dVar2;
        dVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
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
        C8314f.m45974c(mo3606L(), j, i, 1);
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34104q0 = C8337n.m46065k0(mo3606L()).mo30272x0();
        this.f34096i0 = layoutInflater.inflate(R.layout.fragment_recent, (ViewGroup) null);
        m44351A3();
        mo29658L3();
        m44382z3();
        m44363U3();
        mo29550c3();
        return this.f34096i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34098k0, i, j);
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        C8075d dVar = this.f34100m0;
        if (dVar != null) {
            dVar.cancel(true);
            this.f34100m0 = null;
        }
        if (this.f34098k0 != null) {
            this.f34098k0 = null;
        }
        if (this.f34102o0 != null) {
            mo3606L().unregisterReceiver(this.f34102o0);
            this.f34102o0 = null;
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
