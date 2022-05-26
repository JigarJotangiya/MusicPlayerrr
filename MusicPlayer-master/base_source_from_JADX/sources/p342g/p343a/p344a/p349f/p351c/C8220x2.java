package p342g.p343a.p344a.p349f.p351c;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: g.a.a.f.c.x2 */
/* compiled from: GenresDetailFragment */
public class C8220x2 extends C8010a implements C7324c, C7949b, C7963p {

    /* renamed from: A0 */
    public static final String f34496A0 = C8220x2.class.getSimpleName();

    /* renamed from: i0 */
    private View f34497i0;

    /* renamed from: j0 */
    RecyclerView f34498j0;

    /* renamed from: k0 */
    public TrackAdapter f34499k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public List<Music> f34500l0;

    /* renamed from: m0 */
    private C8226f f34501m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public long f34502n0 = -1;

    /* renamed from: o0 */
    private String f34503o0;

    /* renamed from: p0 */
    private DeepDefaultTitle f34504p0;

    /* renamed from: q0 */
    private C8337n f34505q0;

    /* renamed from: r0 */
    private C8227g f34506r0;

    /* renamed from: s0 */
    private ImageView f34507s0;

    /* renamed from: t0 */
    private int f34508t0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public boolean f34509u0 = false;

    /* renamed from: v0 */
    private C7249s0 f34510v0;

    /* renamed from: w0 */
    private View f34511w0;

    /* renamed from: x0 */
    private RelativeLayout f34512x0;
    @SuppressLint({"NonConstantResourceId"})

    /* renamed from: y0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34513y0 = new C8181r0(this);

    /* renamed from: z0 */
    private BaseQuickAdapter.OnItemClickListener f34514z0 = new C8224d();

    /* renamed from: g.a.a.f.c.x2$a */
    /* compiled from: GenresDetailFragment */
    class C8221a extends C7970w {
        C8221a() {
        }

        /* renamed from: A */
        public void mo26689A() {
            super.mo26689A();
            try {
                ((LibraryActivity) C8220x2.this.mo3606L()).mo26659b5(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: B */
        public void mo26690B() {
            super.mo26690B();
            try {
                ((LibraryActivity) C8220x2.this.mo3606L()).mo26659b5(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: D */
        public void mo26691D() {
            super.mo26691D();
            try {
                ((LibraryActivity) C8220x2.this.mo3606L()).mo26677q5();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: E */
        public void mo26692E() {
            super.mo26692E();
            try {
                ((LibraryActivity) C8220x2.this.mo3606L()).mo26680r5();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public void mo26693b() {
            int i;
            super.mo26693b();
            C8220x2.this.f34499k0.mo26909f(false, 0);
            if (C8220x2.this.mo3606L() != null) {
                FragmentActivity L = C8220x2.this.mo3606L();
                if (L instanceof LibraryActivity) {
                    LibraryActivity libraryActivity = (LibraryActivity) L;
                    if (C8220x2.this.f34500l0 == null) {
                        i = 0;
                    } else {
                        i = C8220x2.this.f34500l0.size();
                    }
                    libraryActivity.mo26676p2(false, i);
                }
            }
        }

        /* renamed from: o */
        public void mo26694o() {
            super.mo26694o();
            C8220x2.this.m45371H3();
        }

        /* renamed from: t */
        public void mo26591t() {
            C8220x2.this.mo3606L().mo3730H1().mo3913F0();
        }

        /* renamed from: u */
        public void mo26697u() {
            super.mo26697u();
            try {
                ((LibraryActivity) C8220x2.this.mo3606L()).mo26659b5(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: v */
        public void mo26698v() {
            super.mo26698v();
            try {
                ((LibraryActivity) C8220x2.this.mo3606L()).mo26659b5(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: x */
        public void mo26700x() {
            super.mo26700x();
            try {
                ((LibraryActivity) C8220x2.this.mo3606L()).mo26659b5(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: y */
        public void mo26701y() {
            super.mo26701y();
            try {
                ((LibraryActivity) C8220x2.this.mo3606L()).mo26659b5(4);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.f.c.x2$b */
    /* compiled from: GenresDetailFragment */
    class C8222b implements Runnable {
        C8222b() {
        }

        public void run() {
            TrackAdapter trackAdapter = C8220x2.this.f34499k0;
            if (trackAdapter != null) {
                trackAdapter.setDuration(300);
            }
        }
    }

    /* renamed from: g.a.a.f.c.x2$c */
    /* compiled from: GenresDetailFragment */
    class C8223c implements View.OnClickListener {
        C8223c() {
        }

        public void onClick(View view) {
            if (!C8220x2.this.f34509u0 && C8220x2.this.f34500l0 != null && C8220x2.this.f34500l0.size() > 0) {
                C8220x2 x2Var = C8220x2.this;
                x2Var.m45374K3(x2Var.f34500l0);
            }
        }
    }

    /* renamed from: g.a.a.f.c.x2$d */
    /* compiled from: GenresDetailFragment */
    class C8224d implements BaseQuickAdapter.OnItemClickListener {
        C8224d() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8287e.m45800P()) {
                C8287e.m45858n0(true);
                C8287e.m45823a0(i, C8220x2.this.f34500l0);
                C8220x2.this.m45394u3();
                return;
            }
            C8220x2.this.m45396w3(i);
        }
    }

    /* renamed from: g.a.a.f.c.x2$e */
    /* compiled from: GenresDetailFragment */
    class C8225e implements Runnable {
        C8225e() {
        }

        public void run() {
            try {
                if (C8220x2.this.mo3606L() != null) {
                    C8220x2.this.mo3627R2(new Intent(C8220x2.this.mo3606L(), MainActivity.class));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.f.c.x2$f */
    /* compiled from: GenresDetailFragment */
    private static class C8226f extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private boolean f34520a;

        /* renamed from: b */
        WeakReference<C8220x2> f34521b;

        public C8226f(C8220x2 x2Var, boolean z) {
            this.f34520a = z;
            this.f34521b = new WeakReference<>(x2Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Music> doInBackground(Void... voidArr) {
            C8220x2 x2Var = (C8220x2) this.f34521b.get();
            if (x2Var == null) {
                return null;
            }
            List<Music> I = C4477c.m19577I(C8345u.m46327h(), x2Var.f34502n0);
            if (!this.f34520a) {
                return I;
            }
            SystemClock.sleep(500);
            return I;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Music> list) {
            C8220x2 x2Var;
            super.onPostExecute(list);
            if (!isCancelled() && (x2Var = (C8220x2) this.f34521b.get()) != null) {
                boolean unused = x2Var.f33734d0 = true;
                x2Var.m45381T3(list);
            }
        }
    }

    /* renamed from: g.a.a.f.c.x2$g */
    /* compiled from: GenresDetailFragment */
    private class C8227g extends BroadcastReceiver {
        private C8227g() {
        }

        public void onReceive(Context context, Intent intent) {
            TrackAdapter trackAdapter;
            TrackAdapter trackAdapter2;
            int intExtra;
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action")) {
                C8220x2.this.mo29906h3(true);
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.genres_track_artwork_item_notify") && C8220x2.this.f34499k0 != null && (intExtra = intent.getIntExtra("artwork_position", -1)) >= 0) {
                TrackAdapter trackAdapter3 = C8220x2.this.f34499k0;
                trackAdapter3.notifyItemChanged(intExtra + trackAdapter3.getHeaderLayoutCount());
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action") && (trackAdapter2 = C8220x2.this.f34499k0) != null) {
                trackAdapter2.notifyDataSetChanged();
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui")) {
                C8220x2.this.m45375L3(intent);
            }
            if ("media.musicplayer.audioplayer.videoplayer.clean_list".equals(intent.getAction()) && (trackAdapter = C8220x2.this.f34499k0) != null) {
                trackAdapter.notifyDataSetChanged();
            }
        }

        /* synthetic */ C8227g(C8220x2 x2Var, C8221a aVar) {
            this();
        }
    }

    /* renamed from: A3 */
    private void m45366A3() {
        this.f34512x0 = (RelativeLayout) this.f34497i0.findViewById(R.id.rl_no);
        RecyclerView recyclerView = (RecyclerView) this.f34497i0.findViewById(R.id.recyclerView);
        this.f34498j0 = recyclerView;
        recyclerView.getItemAnimator().mo4865w(0);
        this.f34498j0.getItemAnimator().mo4866x(0);
        this.f34498j0.getItemAnimator().mo4868z(0);
        this.f34498j0.getItemAnimator().mo4843A(0);
        ((C0916y) this.f34498j0.getItemAnimator()).mo5428V(false);
        this.f34507s0 = (ImageView) this.f34497i0.findViewById(R.id.iv_bg);
        DeepDefaultTitle deepDefaultTitle = (DeepDefaultTitle) this.f34497i0.findViewById(R.id.defualt_title);
        this.f34504p0 = deepDefaultTitle;
        deepDefaultTitle.setMutilIcon(true);
        this.f34504p0.setMenuIcon(true);
        this.f34504p0.setEqIcon(false);
        this.f34504p0.setSearchIcon(false);
        this.f34504p0.mo27431B(true, true);
        this.f34504p0.setSort(8);
        this.f34511w0 = m45397x3();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void mo29901C3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int id = view.getId();
        if (id == R.id.iv_add_to_playlist) {
            m45392s3(i);
        } else if (id == R.id.popup_menu) {
            m45373J3(view, i);
        }
    }

    /* renamed from: D3 */
    static /* synthetic */ void m45368D3(View view) {
    }

    /* renamed from: G3 */
    private void m45370G3(int i) {
        List<Music> list;
        this.f34499k0 = null;
        TrackAdapter trackAdapter = new TrackAdapter((i != 0 && i == 1) ? R.layout.item_default : R.layout.item_default_grid, this.f34500l0, 4, 0, i, true, 0);
        this.f34499k0 = trackAdapter;
        trackAdapter.openLoadAnimation(2);
        this.f34499k0.isFirstOnly(false);
        this.f34499k0.setHasStableIds(true);
        ViewParent parent = this.f34511w0.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        if (i != 1 || this.f34499k0.getHeaderLayoutCount() != 0 || (list = this.f34500l0) == null || list.size() <= 0) {
            this.f34499k0.removeHeaderView(this.f34511w0);
        } else {
            this.f34499k0.addHeaderView(this.f34511w0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public void m45371H3() {
        if (!AdHelper.m49536p().mo32459v(mo3606L(), new C8192t0(this))) {
            m45372I3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public void m45372I3() {
        try {
            mo3634T2(C8333k.m46051b(mo3606L(), 0, C8337n.m46065k0(mo3606L()).mo30119L0(), true), 1029);
        } catch (Exception unused) {
        }
    }

    /* renamed from: J3 */
    private void m45373J3(View view, int i) {
        if (this.f34510v0 == null) {
            C7249s0 s0Var = new C7249s0(mo3606L(), 9, 0);
            this.f34510v0 = s0Var;
            s0Var.mo27759j(this);
            this.f34510v0.mo27830J(this);
        }
        this.f34510v0.mo27829H(i, this.f34500l0);
        this.f34510v0.mo27743k(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public void m45374K3(List<Music> list) {
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
    /* renamed from: L3 */
    public void m45375L3(Intent intent) {
        if (intent != null) {
            boolean z = intent.getExtras().getBoolean("disPlaySelectTitle");
            DeepDefaultTitle deepDefaultTitle = this.f34504p0;
            if (deepDefaultTitle != null) {
                deepDefaultTitle.setVisibility(z ? 4 : 0);
            }
        }
    }

    /* renamed from: M3 */
    private void m45376M3() {
        if (this.f34499k0 == null) {
            m45370G3(this.f34508t0);
        }
        m45393t3(this.f34508t0);
    }

    /* renamed from: P3 */
    private boolean m45377P3() {
        if (mo3638V() != null) {
            this.f34502n0 = mo3638V().getLong("genres_id");
            this.f34503o0 = mo3638V().getString("genres_title");
        }
        return this.f34502n0 <= 0;
    }

    /* renamed from: Q3 */
    private void m45378Q3(int i) {
        if (this.f34500l0 != null) {
            this.f34508t0 = i;
            C8337n.m46065k0(mo3606L()).mo30186b2(this.f34508t0);
            m45370G3(this.f34508t0);
            m45393t3(this.f34508t0);
            return;
        }
        mo29906h3(true);
    }

    /* renamed from: R3 */
    private void m45379R3() {
        this.f34504p0.setTitleOnClickListener(new C8221a());
    }

    /* renamed from: S3 */
    private void m45380S3() {
        this.f34504p0.setTitleText(this.f34503o0);
        this.f34504p0.setHomeIcon(false);
        this.f34507s0.setImageDrawable(C9332d.m49407d(mo3651a0(), R.drawable.splash_skin_1_bg_shape));
        this.f34507s0.setOnClickListener(C8185s0.f34412g);
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public void m45381T3(List<Music> list) {
        if (list == null || list.size() < 0) {
            List<Music> list2 = this.f34500l0;
            if (list2 != null) {
                list2.clear();
                TrackAdapter trackAdapter = this.f34499k0;
                if (trackAdapter != null) {
                    trackAdapter.notifyDataSetChanged();
                }
            }
            mo29903N3(true);
        } else if (list.size() > 0) {
            List<Music> list3 = this.f34500l0;
            if (list3 != null) {
                list3.clear();
                this.f34500l0.addAll(list);
            } else {
                this.f34500l0 = list;
            }
            m45376M3();
            mo29903N3(false);
        } else {
            List<Music> list4 = this.f34500l0;
            if (list4 != null) {
                list4.clear();
                TrackAdapter trackAdapter2 = this.f34499k0;
                if (trackAdapter2 != null) {
                    trackAdapter2.notifyDataSetChanged();
                }
            }
            mo29903N3(true);
        }
    }

    /* renamed from: s3 */
    private void m45392s3(int i) {
        List<Music> list = this.f34500l0;
        if (list != null && list.size() > 0) {
            C8287e.m45818Y(this.f34500l0.get(i));
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46327h().getResources().getString(R.string.success_add_to_next));
        }
    }

    /* renamed from: t3 */
    private void m45393t3(int i) {
        TrackAdapter trackAdapter;
        if (this.f34498j0 != null && (trackAdapter = this.f34499k0) != null) {
            trackAdapter.setOnItemClickListener(this.f34514z0);
            this.f34499k0.setOnItemChildClickListener(this.f34513y0);
            this.f34499k0.mo26921y(this);
            this.f34498j0.setAdapter(this.f34499k0);
            if (i == 1) {
                this.f34498j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34498j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34498j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34498j0.mo4596e1(i2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public void m45394u3() {
        if (this.f34505q0.mo30200f()) {
            new Handler().postDelayed(new C8225e(), 500);
        }
    }

    /* renamed from: v3 */
    private void m45395v3() {
        C8287e.m45793L0(false);
        C8287e.m45791K0(-1);
        C8287e.m45849j();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public void m45396w3(int i) {
        int i2;
        TrackAdapter trackAdapter = this.f34499k0;
        if (trackAdapter != null) {
            trackAdapter.mo26916q(i);
            TrackAdapter trackAdapter2 = this.f34499k0;
            List<Music> list = this.f34500l0;
            if (list == null) {
                i2 = 0;
            } else {
                i2 = list.size() - mo29547Z2(this.f34500l0.size());
            }
            trackAdapter2.mo26907A(false, i2);
        }
    }

    /* renamed from: x3 */
    private View m45397x3() {
        View inflate = mo3676k0().inflate(R.layout.head_view_shuffle, (ViewGroup) this.f34498j0.getParent(), false);
        ((ImageView) inflate.findViewById(R.id.iv_shuffle_all)).setImageDrawable(C8343s.m46303k(R.drawable.ic_home01_play_all, R.color.colorAccent));
        inflate.setOnClickListener(new C8223c());
        return inflate;
    }

    /* renamed from: y3 */
    private void m45398y3() {
        if (!m45377P3()) {
            this.f34505q0 = new C8337n(mo3606L());
            mo29906h3(true);
        }
    }

    /* renamed from: z3 */
    private void m45399z3() {
        this.f34506r0 = new C8227g(this, (C8221a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.genres_track_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
        mo3606L().registerReceiver(this.f34506r0, intentFilter);
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B */
    public void mo29479B(boolean z) {
        this.f34509u0 = z;
        mo29904O3(!z);
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        m45395v3();
        if (this.f34499k0 != null) {
            this.f34499k0 = null;
        }
        if (this.f34498j0 != null) {
            this.f34498j0 = null;
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45976e(mo3606L(), i, j, i2, str);
    }

    /* renamed from: F3 */
    public void mo29902F3() {
        m45398y3();
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: N3 */
    public void mo29903N3(boolean z) {
        RelativeLayout relativeLayout = this.f34512x0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: O3 */
    public void mo29904O3(boolean z) {
        List<Music> list;
        this.f34499k0.setDuration(0);
        if (!z) {
            this.f34499k0.removeHeaderView(this.f34511w0);
        } else if (this.f34508t0 == 1 && this.f34499k0.getHeaderLayoutCount() == 0 && (list = this.f34500l0) != null && list.size() > 0) {
            ViewParent parent = this.f34511w0.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f34499k0.addHeaderView(this.f34511w0);
        }
        new Handler().postDelayed(new C8222b(), 500);
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

    /* renamed from: U3 */
    public void mo29905U3(int i) {
        if (this.f34499k0 != null && this.f34498j0 != null && i != this.f34508t0) {
            m45378Q3(i);
        }
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
        return C8220x2.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29906h3(true);
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
        }
    }

    /* renamed from: h3 */
    public void mo29906h3(boolean z) {
        C8226f fVar = this.f34501m0;
        if (fVar != null && fVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34501m0.cancel(true);
            this.f34501m0 = null;
        }
        C8226f fVar2 = new C8226f(this, z);
        this.f34501m0 = fVar2;
        fVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
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
        C8314f.m45974c(mo3606L(), j, i, 9);
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34497i0 = layoutInflater.inflate(R.layout.title_recyclerview, (ViewGroup) null);
        m45366A3();
        m45379R3();
        this.f34508t0 = C8337n.m46065k0(mo3606L()).mo30189c0();
        mo29902F3();
        m45380S3();
        m45399z3();
        m45395v3();
        return this.f34497i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34499k0, i, j);
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        C8226f fVar = this.f34501m0;
        if (fVar != null) {
            fVar.cancel(true);
            this.f34501m0 = null;
        }
        if (this.f34506r0 != null) {
            mo3606L().unregisterReceiver(this.f34506r0);
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
