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

/* renamed from: g.a.a.f.c.u2 */
/* compiled from: FolderDetailFragment */
public class C8200u2 extends C8010a implements C7324c, C7949b, C7963p {

    /* renamed from: B0 */
    public static final String f34440B0 = C8200u2.class.getSimpleName();
    @SuppressLint({"NonConstantResourceId"})

    /* renamed from: A0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34441A0 = new C8131l0(this);

    /* renamed from: i0 */
    private View f34442i0;

    /* renamed from: j0 */
    RecyclerView f34443j0;

    /* renamed from: k0 */
    public TrackAdapter f34444k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public List<Music> f34445l0;

    /* renamed from: m0 */
    private C8204d f34446m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public String f34447n0;

    /* renamed from: o0 */
    private String f34448o0;

    /* renamed from: p0 */
    private DeepDefaultTitle f34449p0;

    /* renamed from: q0 */
    private C8337n f34450q0;

    /* renamed from: r0 */
    private C8205e f34451r0;

    /* renamed from: s0 */
    private ImageView f34452s0;

    /* renamed from: t0 */
    private int f34453t0 = 0;

    /* renamed from: u0 */
    private boolean f34454u0 = false;

    /* renamed from: v0 */
    private C7249s0 f34455v0;

    /* renamed from: w0 */
    private View f34456w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public boolean f34457x0;

    /* renamed from: y0 */
    private RelativeLayout f34458y0;

    /* renamed from: z0 */
    private final BaseQuickAdapter.OnItemClickListener f34459z0 = new C8203c();

    /* renamed from: g.a.a.f.c.u2$a */
    /* compiled from: FolderDetailFragment */
    class C8201a extends C7970w {
        C8201a() {
        }

        /* renamed from: A */
        public void mo26689A() {
            super.mo26689A();
            try {
                ((LibraryActivity) C8200u2.this.mo3606L()).mo26659b5(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: B */
        public void mo26690B() {
            super.mo26690B();
            try {
                ((LibraryActivity) C8200u2.this.mo3606L()).mo26659b5(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: D */
        public void mo26691D() {
            super.mo26691D();
            try {
                ((LibraryActivity) C8200u2.this.mo3606L()).mo26677q5();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: E */
        public void mo26692E() {
            super.mo26692E();
            try {
                ((LibraryActivity) C8200u2.this.mo3606L()).mo26680r5();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public void mo26693b() {
            int i;
            super.mo26693b();
            TrackAdapter trackAdapter = C8200u2.this.f34444k0;
            if (trackAdapter != null) {
                trackAdapter.mo26909f(false, 0);
            }
            if (C8200u2.this.mo3606L() != null) {
                FragmentActivity L = C8200u2.this.mo3606L();
                if (L instanceof LibraryActivity) {
                    LibraryActivity libraryActivity = (LibraryActivity) L;
                    if (C8200u2.this.f34445l0 == null) {
                        i = 0;
                    } else {
                        i = C8200u2.this.f34445l0.size();
                    }
                    libraryActivity.mo26676p2(false, i);
                }
            }
        }

        /* renamed from: o */
        public void mo26694o() {
            super.mo26694o();
            C8200u2.this.m45219N3();
        }

        /* renamed from: t */
        public void mo26591t() {
            C8200u2.this.m45243v3();
        }

        /* renamed from: u */
        public void mo26697u() {
            super.mo26697u();
            try {
                ((LibraryActivity) C8200u2.this.mo3606L()).mo26659b5(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: v */
        public void mo26698v() {
            super.mo26698v();
            try {
                ((LibraryActivity) C8200u2.this.mo3606L()).mo26659b5(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: x */
        public void mo26700x() {
            super.mo26700x();
            try {
                ((LibraryActivity) C8200u2.this.mo3606L()).mo26659b5(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: y */
        public void mo26701y() {
            super.mo26701y();
            try {
                ((LibraryActivity) C8200u2.this.mo3606L()).mo26659b5(4);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.f.c.u2$b */
    /* compiled from: FolderDetailFragment */
    class C8202b implements Runnable {
        C8202b() {
        }

        public void run() {
            C8200u2.this.f34444k0.setDuration(300);
        }
    }

    /* renamed from: g.a.a.f.c.u2$c */
    /* compiled from: FolderDetailFragment */
    class C8203c implements BaseQuickAdapter.OnItemClickListener {
        C8203c() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8287e.m45800P()) {
                C8287e.m45858n0(true);
                C8287e.m45823a0(i, C8200u2.this.f34445l0);
                C8200u2.this.m45242u3();
                return;
            }
            C8200u2.this.m45245x3(i);
        }
    }

    /* renamed from: g.a.a.f.c.u2$d */
    /* compiled from: FolderDetailFragment */
    private static class C8204d extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private final WeakReference<C8200u2> f34463a;

        /* synthetic */ C8204d(C8200u2 u2Var, C8201a aVar) {
            this(u2Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Music> doInBackground(Void... voidArr) {
            C8200u2 u2Var = (C8200u2) this.f34463a.get();
            if (u2Var == null) {
                return null;
            }
            if (u2Var.f34457x0) {
                return C4477c.m19583L(C8345u.m46327h());
            }
            return C4477c.m19569E(C8345u.m46327h(), u2Var.f34447n0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Music> list) {
            C8200u2 u2Var;
            super.onPostExecute(list);
            if (!isCancelled() && (u2Var = (C8200u2) this.f34463a.get()) != null) {
                boolean unused = u2Var.f33734d0 = true;
                u2Var.m45229Z3(list);
            }
        }

        private C8204d(C8200u2 u2Var) {
            this.f34463a = new WeakReference<>(u2Var);
        }
    }

    /* renamed from: g.a.a.f.c.u2$e */
    /* compiled from: FolderDetailFragment */
    private class C8205e extends BroadcastReceiver {
        private C8205e() {
        }

        public void onReceive(Context context, Intent intent) {
            TrackAdapter trackAdapter;
            TrackAdapter trackAdapter2;
            int intExtra;
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.playlist_detail_remove_notify")) {
                C8200u2.this.mo29874h3();
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action")) {
                C8200u2.this.mo29874h3();
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.folder_track_artwork_item_notify") && C8200u2.this.f34444k0 != null && (intExtra = intent.getIntExtra("artwork_position", -1)) >= 0) {
                TrackAdapter trackAdapter3 = C8200u2.this.f34444k0;
                trackAdapter3.notifyItemChanged(intExtra + trackAdapter3.getHeaderLayoutCount());
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action") && (trackAdapter2 = C8200u2.this.f34444k0) != null) {
                trackAdapter2.notifyDataSetChanged();
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui")) {
                C8200u2.this.m45223R3(intent);
            }
            if ("media.musicplayer.audioplayer.videoplayer.clean_list".equals(intent.getAction()) && (trackAdapter = C8200u2.this.f34444k0) != null) {
                trackAdapter.notifyDataSetChanged();
            }
        }

        /* synthetic */ C8205e(C8200u2 u2Var, C8201a aVar) {
            this();
        }
    }

    /* renamed from: A3 */
    private void m45211A3() {
        this.f34451r0 = new C8205e(this, (C8201a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.folder_track_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
        mo3606L().registerReceiver(this.f34451r0, intentFilter);
    }

    /* renamed from: B3 */
    private void m45212B3() {
        this.f34443j0 = (RecyclerView) this.f34442i0.findViewById(R.id.recyclerView);
        this.f34458y0 = (RelativeLayout) this.f34442i0.findViewById(R.id.rl_no);
        this.f34443j0.getItemAnimator().mo4865w(0);
        this.f34443j0.getItemAnimator().mo4866x(0);
        this.f34443j0.getItemAnimator().mo4868z(0);
        this.f34443j0.getItemAnimator().mo4843A(0);
        ((C0916y) this.f34443j0.getItemAnimator()).mo5428V(false);
        this.f34449p0 = (DeepDefaultTitle) this.f34442i0.findViewById(R.id.defualt_title);
        this.f34452s0 = (ImageView) this.f34442i0.findViewById(R.id.iv_bg);
        this.f34449p0.setMutilIcon(true);
        this.f34449p0.setMenuIcon(false);
        this.f34449p0.setEqIcon(false);
        this.f34449p0.setSearchIcon(false);
        this.f34449p0.mo27431B(true, true);
        this.f34449p0.setSort(9);
        this.f34456w0 = m45246y3();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void mo29866E3() {
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
    public /* synthetic */ void mo29867G3(View view) {
        List<Music> list;
        if (!this.f34454u0 && (list = this.f34445l0) != null && list.size() > 0) {
            m45222Q3(this.f34445l0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void mo29868I3(View view) {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26657Z4(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void mo29869K3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int id = view.getId();
        if (id == R.id.iv_add_to_playlist) {
            m45240s3(i);
        } else if (id == R.id.popup_menu) {
            m45221P3(view, i);
        }
    }

    /* renamed from: M3 */
    private void m45218M3(int i) {
        List<Music> list;
        this.f34444k0 = null;
        TrackAdapter trackAdapter = new TrackAdapter((i != 0 && i == 1) ? R.layout.item_default : R.layout.item_default_grid, this.f34445l0, 5, 0, i, true, 0);
        this.f34444k0 = trackAdapter;
        trackAdapter.isFirstOnly(false);
        this.f34444k0.setHasStableIds(true);
        ViewParent parent = this.f34456w0.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        if (i != 1 || this.f34444k0.getHeaderLayoutCount() != 0 || (list = this.f34445l0) == null || list.size() <= 0) {
            this.f34444k0.removeHeaderView(this.f34456w0);
        } else {
            this.f34444k0.addHeaderView(this.f34456w0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public void m45219N3() {
        if (!AdHelper.m49536p().mo32459v(mo3606L(), new C8121j0(this))) {
            m45220O3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public void m45220O3() {
        try {
            mo3634T2(C8333k.m46051b(mo3606L(), 0, C8337n.m46065k0(mo3606L()).mo30119L0(), true), 1029);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: P3 */
    private void m45221P3(View view, int i) {
        if (this.f34455v0 == null) {
            C7249s0 s0Var = new C7249s0(mo3606L(), 6, 0);
            this.f34455v0 = s0Var;
            s0Var.mo27759j(this);
            this.f34455v0.mo27830J(this);
        }
        this.f34455v0.mo27829H(i, this.f34445l0);
        this.f34455v0.mo27743k(view);
    }

    /* renamed from: Q3 */
    private void m45222Q3(List<Music> list) {
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
    /* renamed from: R3 */
    public void m45223R3(Intent intent) {
        if (intent != null) {
            boolean z = intent.getExtras().getBoolean("disPlaySelectTitle");
            DeepDefaultTitle deepDefaultTitle = this.f34449p0;
            if (deepDefaultTitle != null) {
                deepDefaultTitle.setVisibility(z ? 4 : 0);
            }
        }
    }

    /* renamed from: S3 */
    private void m45224S3() {
        if (this.f34444k0 == null) {
            m45218M3(this.f34453t0);
        }
        m45241t3(this.f34453t0);
    }

    /* renamed from: V3 */
    private boolean m45225V3() {
        if (mo3638V() != null) {
            this.f34447n0 = mo3638V().getString("folder_detail_path");
            this.f34448o0 = mo3638V().getString("folder_detail_title");
            this.f34457x0 = mo3638V().getBoolean("slider");
        }
        if (this.f34447n0 != null) {
            return false;
        }
        C8345u.m46340u(R.string.error);
        return true;
    }

    /* renamed from: W3 */
    private void m45226W3(int i) {
        if (this.f34445l0 != null) {
            this.f34453t0 = i;
            C8337n.m46065k0(mo3606L()).mo30176Z1(this.f34453t0);
            m45218M3(this.f34453t0);
            m45241t3(this.f34453t0);
            return;
        }
        mo29874h3();
    }

    /* renamed from: X3 */
    private void m45227X3() {
        this.f34449p0.setTitleOnClickListener(new C8201a());
    }

    /* renamed from: Y3 */
    private void m45228Y3() {
        this.f34449p0.setTitleText(this.f34448o0);
        this.f34449p0.setHomeIcon(false);
        C8343s.m46307o(this.f34452s0, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public void m45229Z3(List<Music> list) {
        if (list == null || list.size() < 0) {
            List<Music> list2 = this.f34445l0;
            if (list2 != null) {
                list2.clear();
                TrackAdapter trackAdapter = this.f34444k0;
                if (trackAdapter != null) {
                    trackAdapter.notifyDataSetChanged();
                }
            }
            mo29871T3(true);
        } else if (list.size() > 0) {
            List<Music> list3 = this.f34445l0;
            if (list3 != null) {
                list3.clear();
                this.f34445l0.addAll(list);
            } else {
                this.f34445l0 = list;
            }
            m45224S3();
            mo29871T3(false);
        } else {
            List<Music> list4 = this.f34445l0;
            if (list4 != null) {
                list4.clear();
                TrackAdapter trackAdapter2 = this.f34444k0;
                if (trackAdapter2 != null) {
                    trackAdapter2.notifyDataSetChanged();
                }
            }
            mo29871T3(true);
        }
    }

    /* renamed from: s3 */
    private void m45240s3(int i) {
        List<Music> list = this.f34445l0;
        if (list != null && list.size() > 0) {
            C8287e.m45818Y(this.f34445l0.get(i));
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46327h().getResources().getString(R.string.success_add_to_next));
        }
    }

    /* renamed from: t3 */
    private void m45241t3(int i) {
        TrackAdapter trackAdapter;
        if (this.f34443j0 != null && (trackAdapter = this.f34444k0) != null) {
            trackAdapter.setOnItemClickListener(this.f34459z0);
            this.f34444k0.setOnItemChildClickListener(this.f34441A0);
            this.f34444k0.mo26921y(this);
            this.f34443j0.setAdapter(this.f34444k0);
            if (i == 1) {
                this.f34443j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34443j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34443j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34443j0.mo4596e1(i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public void m45242u3() {
        if (this.f34450q0.mo30200f()) {
            new Handler().postDelayed(new C8117i0(this), 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public void m45243v3() {
        FragmentActivity L = mo3606L();
        if (L != null) {
            L.onBackPressed();
        }
    }

    /* renamed from: w3 */
    private void m45244w3() {
        C8287e.m45793L0(false);
        C8287e.m45791K0(-1);
        C8287e.m45849j();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public void m45245x3(int i) {
        int i2;
        TrackAdapter trackAdapter = this.f34444k0;
        if (trackAdapter != null) {
            trackAdapter.mo26916q(i);
            TrackAdapter trackAdapter2 = this.f34444k0;
            List<Music> list = this.f34445l0;
            if (list == null) {
                i2 = 0;
            } else {
                i2 = list.size() - mo29547Z2(this.f34445l0.size());
            }
            trackAdapter2.mo26907A(false, i2);
        }
    }

    /* renamed from: y3 */
    private View m45246y3() {
        View inflate = mo3676k0().inflate(R.layout.head_view_shuffle, (ViewGroup) this.f34443j0.getParent(), false);
        ((ImageView) inflate.findViewById(R.id.iv_shuffle_all)).setImageDrawable(C8343s.m46303k(R.drawable.ic_home01_play_all, R.color.colorAccent));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.sortOption);
        imageView.setImageDrawable(C8343s.m46298f(R.drawable.ic_home02_sort));
        imageView.setVisibility(8);
        ((TextView) inflate.findViewById(R.id.tv_play_all)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.multiOption);
        imageView2.setImageDrawable(C8343s.m46298f(R.drawable.ic_home03_choose));
        inflate.setOnClickListener(new C8125k0(this));
        imageView2.setOnClickListener(new C8141m0(this));
        return inflate;
    }

    /* renamed from: z3 */
    private void m45247z3() {
        if (!m45225V3()) {
            this.f34450q0 = new C8337n(mo3606L());
            mo29874h3();
        }
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B */
    public void mo29479B(boolean z) {
        this.f34454u0 = z;
        mo29872U3(!z);
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        m45244w3();
        if (this.f34444k0 != null) {
            this.f34444k0 = null;
        }
        if (this.f34443j0 != null) {
            this.f34443j0 = null;
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45976e(mo3606L(), i, j, i2, str);
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: L3 */
    public void mo29870L3() {
        m45212B3();
        m45247z3();
        m45228Y3();
        m45211A3();
        m45227X3();
        m45244w3();
    }

    /* renamed from: Q */
    public void mo26506Q() {
    }

    /* renamed from: R */
    public void mo26507R() {
    }

    /* renamed from: T3 */
    public void mo29871T3(boolean z) {
        RelativeLayout relativeLayout = this.f34458y0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: U */
    public void mo26508U() {
    }

    /* renamed from: U3 */
    public void mo29872U3(boolean z) {
        List<Music> list;
        this.f34444k0.setDuration(0);
        if (!z) {
            this.f34444k0.removeHeaderView(this.f34456w0);
        } else if (this.f34453t0 == 1 && this.f34444k0.getHeaderLayoutCount() == 0 && (list = this.f34445l0) != null && list.size() > 0) {
            ViewParent parent = this.f34456w0.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f34444k0.addHeaderView(this.f34456w0);
        }
        new Handler().postDelayed(new C8202b(), 500);
    }

    /* renamed from: W0 */
    public void mo26509W0() {
    }

    /* renamed from: a4 */
    public void mo29873a4(int i) {
        if (this.f34444k0 != null && this.f34443j0 != null && i != this.f34453t0) {
            m45226W3(i);
        }
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8200u2.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29874h3();
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
        }
    }

    /* renamed from: h3 */
    public void mo29874h3() {
        C8204d dVar = this.f34446m0;
        if (dVar != null && dVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34446m0.cancel(true);
            this.f34446m0 = null;
        }
        C8204d dVar2 = new C8204d(this, (C8201a) null);
        this.f34446m0 = dVar2;
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
        C8314f.m45974c(mo3606L(), j, i, 6);
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34442i0 = layoutInflater.inflate(R.layout.title_recyclerview, (ViewGroup) null);
        this.f34453t0 = C8337n.m46065k0(mo3606L()).mo30179a0();
        mo29870L3();
        mo29550c3();
        return this.f34442i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34444k0, i, j);
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        C8204d dVar = this.f34446m0;
        if (dVar != null) {
            dVar.cancel(true);
            this.f34446m0 = null;
        }
        if (this.f34451r0 != null) {
            mo3606L().unregisterReceiver(this.f34451r0);
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
