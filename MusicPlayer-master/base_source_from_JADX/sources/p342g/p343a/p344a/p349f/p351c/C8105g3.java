package p342g.p343a.p344a.p349f.p351c;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
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
import coocent.music.player.widget.PositionImageView;
import coocent.music.player.widget.p275k.C7245q0;
import coocent.music.player.widget.p275k.C7249s0;
import coocent.musiclibrary.music.p281b.C7324c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7949b;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: g.a.a.f.c.g3 */
/* compiled from: TrackFragment */
public class C8105g3 extends C8010a implements C7324c, C7949b, C7963p {

    /* renamed from: i0 */
    private View f34193i0;

    /* renamed from: j0 */
    RecyclerView f34194j0;

    /* renamed from: k0 */
    public TrackAdapter f34195k0;

    /* renamed from: l0 */
    public List<Music> f34196l0;

    /* renamed from: m0 */
    private C8110e f34197m0;

    /* renamed from: n0 */
    private C8111f f34198n0;

    /* renamed from: o0 */
    private int f34199o0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public boolean f34200p0 = false;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public PositionImageView f34201q0;

    /* renamed from: r0 */
    private C7249s0 f34202r0;

    /* renamed from: s0 */
    private View f34203s0;

    /* renamed from: t0 */
    private TextView f34204t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public int f34205u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public long f34206v0 = -1;

    /* renamed from: w0 */
    private RelativeLayout f34207w0;

    /* renamed from: x0 */
    private C7245q0 f34208x0;

    /* renamed from: y0 */
    private final BaseQuickAdapter.OnItemClickListener f34209y0 = new C8108c();
    @SuppressLint({"NonConstantResourceId"})

    /* renamed from: z0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34210z0 = new C8104g2(this);

    /* renamed from: g.a.a.f.c.g3$a */
    /* compiled from: TrackFragment */
    class C8106a extends RecyclerView.C0817t {
        C8106a() {
        }

        /* renamed from: a */
        public void mo4984a(RecyclerView recyclerView, int i) {
            super.mo4984a(recyclerView, i);
            if (i == 1 && C8105g3.this.f34201q0 != null && !C8105g3.this.f34200p0) {
                C8105g3.this.f34201q0.mo27545o();
            }
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
            super.mo4985b(recyclerView, i, i2);
        }
    }

    /* renamed from: g.a.a.f.c.g3$b */
    /* compiled from: TrackFragment */
    class C8107b implements Runnable {
        C8107b() {
        }

        public void run() {
            C8105g3.this.f34201q0.mo27547r();
        }
    }

    /* renamed from: g.a.a.f.c.g3$c */
    /* compiled from: TrackFragment */
    class C8108c implements BaseQuickAdapter.OnItemClickListener {
        C8108c() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8287e.m45800P()) {
                C8287e.m45858n0(true);
                ArrayList arrayList = new ArrayList(C8105g3.this.f34196l0);
                C8287e.m45823a0(C8105g3.this.mo29548a3(arrayList, i), arrayList);
                C8105g3.this.m44660y3();
                if (C8105g3.this.f34205u0 == 2) {
                    C8345u.m46322c(C8105g3.this.mo3606L());
                    return;
                }
                return;
            }
            C8105g3.this.m44661z3(i);
        }
    }

    /* renamed from: g.a.a.f.c.g3$d */
    /* compiled from: TrackFragment */
    class C8109d implements Runnable {
        C8109d() {
        }

        public void run() {
            try {
                if (C8105g3.this.mo3606L() != null) {
                    C8105g3.this.mo3627R2(new Intent(C8105g3.this.mo3606L(), MainActivity.class));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.f.c.g3$e */
    /* compiled from: TrackFragment */
    private static class C8110e extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private final WeakReference<C8105g3> f34215a;

        public C8110e(C8105g3 g3Var, boolean z) {
            this.f34215a = new WeakReference<>(g3Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Music> doInBackground(Void... voidArr) {
            C8105g3 g3Var = (C8105g3) this.f34215a.get();
            List<Music> list = null;
            if (g3Var != null) {
                if (g3Var.f34205u0 == 0) {
                    List<Music> M = C4477c.m19585M(C8345u.m46327h());
                    g3Var.mo29546X2(M);
                    return M;
                } else if (g3Var.f34205u0 == 1) {
                    return C4477c.m19653x(C8345u.m46327h());
                } else {
                    String str = BaseApplication.f31146j;
                    if (str != null && !str.isEmpty()) {
                        list = C4477c.m19565C(C8345u.m46327h(), BaseApplication.f31146j, false);
                        if (g3Var.f34205u0 == 4) {
                            g3Var.mo29553f3(g3Var.mo29551d3(g3Var.f34205u0, list, C4477c.m19591P(C8345u.m46327h(), g3Var.f34206v0)));
                        }
                        C8010a.m43743Y2(list);
                    }
                }
            }
            return list;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Music> list) {
            C8105g3 g3Var;
            super.onPostExecute(list);
            if (!isCancelled() && (g3Var = (C8105g3) this.f34215a.get()) != null) {
                boolean unused = g3Var.f33734d0 = true;
                g3Var.m44644h4(list);
            }
        }
    }

    /* renamed from: g.a.a.f.c.g3$f */
    /* compiled from: TrackFragment */
    private class C8111f extends BroadcastReceiver {
        private C8111f() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action")) {
                C8105g3.this.mo29726h3(false);
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.list_notifiy.action")) {
                TrackAdapter trackAdapter = C8105g3.this.f34195k0;
                if (trackAdapter != null) {
                    trackAdapter.notifyDataSetChanged();
                }
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.track_artwork_item_notify")) {
                TrackAdapter trackAdapter2 = C8105g3.this.f34195k0;
                if (trackAdapter2 != null) {
                    trackAdapter2.notifyDataSetChanged();
                }
            } else {
                String action = intent.getAction();
                if (action.equals(C8105g3.this.mo3651a0().getPackageName() + C8311c.f34734a)) {
                    C8105g3 g3Var = C8105g3.this;
                    if (g3Var.f34195k0 != null) {
                        g3Var.mo29726h3(false);
                    }
                } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.detail_update_page")) {
                    C8105g3 g3Var2 = C8105g3.this;
                    if (g3Var2.f34195k0 != null) {
                        g3Var2.mo29726h3(false);
                    }
                } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.track_filter_notifiy")) {
                    C8105g3 g3Var3 = C8105g3.this;
                    if (g3Var3.f34195k0 != null) {
                        g3Var3.mo29726h3(false);
                    }
                } else if ("media.musicplayer.audioplayer.videoplayer.clean_list".equals(intent.getAction())) {
                    TrackAdapter trackAdapter3 = C8105g3.this.f34195k0;
                    if (trackAdapter3 != null) {
                        trackAdapter3.notifyDataSetChanged();
                    }
                } else if ("4search_update".equals(intent.getAction())) {
                    C8105g3.this.mo29726h3(false);
                } else if ("2search_update".equals(intent.getAction())) {
                    C8105g3.this.mo29726h3(false);
                }
            }
        }

        /* synthetic */ C8111f(C8105g3 g3Var, C8106a aVar) {
            this();
        }
    }

    /* renamed from: A3 */
    private void m44621A3() {
        FragmentActivity L;
        if (this.f34205u0 == 2 && (L = mo3606L()) != null) {
            C8345u.m46322c(L);
        }
    }

    /* renamed from: B3 */
    private void m44622B3() {
        Bundle V = mo3638V();
        if (V != null) {
            this.f34205u0 = V.getInt("pageType", 0);
            this.f34206v0 = V.getLong("toPlaylistId", -1);
        }
    }

    /* renamed from: C3 */
    private View m44623C3() {
        View inflate = mo3676k0().inflate(R.layout.head_view_shuffle, (ViewGroup) this.f34194j0.getParent(), false);
        this.f34204t0 = (TextView) inflate.findViewById(R.id.tv_play_all);
        ((ImageView) inflate.findViewById(R.id.iv_shuffle_all)).setImageDrawable(C8343s.m46303k(R.drawable.ic_home01_play_all, R.color.colorAccent));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.shuffle_header);
        if (this.f34205u0 == 2) {
            relativeLayout.setVisibility(8);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.sortOption);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.multiOption);
        imageView2.setImageDrawable(C8343s.m46304l(R.drawable.ic_home03_choose, R.color.default_text_color));
        imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_home02_sort, R.color.default_text_color));
        this.f34204t0.setTextColor(C9332d.m49405b(C8345u.m46327h(), R.color.default_text_color));
        inflate.setOnClickListener(new C8115h2(this));
        imageView.setOnClickListener(new C8089e2(this, inflate));
        imageView2.setOnClickListener(new C8080d2(this));
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        r1 = r3;
     */
    /* renamed from: D3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m44624D3() {
        /*
            r9 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r9.f34194j0     // Catch:{ Exception -> 0x0088 }
            if (r0 == 0) goto L_0x008c
            com.coocent.music.base.data.entity.Music r0 = p342g.p343a.p344a.p355g.C8287e.m45873v()     // Catch:{ Exception -> 0x0088 }
            java.util.List<com.coocent.music.base.data.entity.Music> r1 = r9.f34196l0     // Catch:{ Exception -> 0x0088 }
            if (r1 == 0) goto L_0x008c
            int r1 = r1.size()     // Catch:{ Exception -> 0x0088 }
            if (r1 <= 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
            r1 = -1
            r2 = 0
            r3 = 0
        L_0x0017:
            java.util.List<com.coocent.music.base.data.entity.Music> r4 = r9.f34196l0     // Catch:{ Exception -> 0x0088 }
            int r4 = r4.size()     // Catch:{ Exception -> 0x0088 }
            if (r3 >= r4) goto L_0x007a
            long r4 = r0.mo9215k()     // Catch:{ Exception -> 0x0088 }
            java.util.List<com.coocent.music.base.data.entity.Music> r6 = r9.f34196l0     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ Exception -> 0x0088 }
            com.coocent.music.base.data.entity.Music r6 = (com.coocent.music.base.data.entity.Music) r6     // Catch:{ Exception -> 0x0088 }
            long r6 = r6.mo9215k()     // Catch:{ Exception -> 0x0088 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0079
            java.lang.String r4 = r0.mo9218n()     // Catch:{ Exception -> 0x0088 }
            java.util.List<com.coocent.music.base.data.entity.Music> r5 = r9.f34196l0     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ Exception -> 0x0088 }
            com.coocent.music.base.data.entity.Music r5 = (com.coocent.music.base.data.entity.Music) r5     // Catch:{ Exception -> 0x0088 }
            java.lang.String r5 = r5.mo9218n()     // Catch:{ Exception -> 0x0088 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0088 }
            if (r4 == 0) goto L_0x0076
            java.lang.String r4 = r0.mo9210g()     // Catch:{ Exception -> 0x0088 }
            java.util.List<com.coocent.music.base.data.entity.Music> r5 = r9.f34196l0     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ Exception -> 0x0088 }
            com.coocent.music.base.data.entity.Music r5 = (com.coocent.music.base.data.entity.Music) r5     // Catch:{ Exception -> 0x0088 }
            java.lang.String r5 = r5.mo9210g()     // Catch:{ Exception -> 0x0088 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0088 }
            if (r4 == 0) goto L_0x0076
            java.lang.String r4 = r0.mo9207e()     // Catch:{ Exception -> 0x0088 }
            java.util.List<com.coocent.music.base.data.entity.Music> r5 = r9.f34196l0     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ Exception -> 0x0088 }
            com.coocent.music.base.data.entity.Music r5 = (com.coocent.music.base.data.entity.Music) r5     // Catch:{ Exception -> 0x0088 }
            java.lang.String r5 = r5.mo9207e()     // Catch:{ Exception -> 0x0088 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0088 }
            if (r4 == 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0079:
            r1 = r3
        L_0x007a:
            if (r1 < 0) goto L_0x008c
            androidx.recyclerview.widget.RecyclerView r0 = r9.f34194j0     // Catch:{ Exception -> 0x0088 }
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.getLayoutManager()     // Catch:{ Exception -> 0x0088 }
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0     // Catch:{ Exception -> 0x0088 }
            r9.mo29727i3(r0, r1, r2)     // Catch:{ Exception -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            r0.printStackTrace()
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p349f.p351c.C8105g3.m44624D3():void");
    }

    /* renamed from: E3 */
    private void m44625E3() {
        mo29726h3(true);
    }

    /* renamed from: F3 */
    private void m44626F3() {
        this.f34198n0 = new C8111f(this, (C8106a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.list_notifiy.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.track_artwork_item_notify");
        intentFilter.addAction(mo3651a0().getPackageName() + C8311c.f34734a);
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.detail_update_page");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.track_filter_notifiy");
        intentFilter.addAction(C8311c.f34737d);
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
        int i = this.f34205u0;
        if (i == 2) {
            intentFilter.addAction("2search_update");
        } else if (i == 4) {
            intentFilter.addAction("4search_update");
        }
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.playlist_detail_list_favorite_change");
        mo3606L().registerReceiver(this.f34198n0, intentFilter);
    }

    /* renamed from: G3 */
    private void m44627G3() {
        m44622B3();
        this.f34194j0 = (RecyclerView) this.f34193i0.findViewById(R.id.recyclerView);
        this.f34207w0 = (RelativeLayout) this.f34193i0.findViewById(R.id.rl_no);
        TextView textView = (TextView) this.f34193i0.findViewById(R.id.tv_no);
        textView.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        textView.setText(C8345u.m46333n(R.string.music_eq_lbl_no_songs_found));
        ((ImageView) this.f34193i0.findViewById(R.id.iv_no)).setImageDrawable(C8343s.m46303k(R.drawable.ic_lists_no_song, R.color.colorAccent));
        this.f34194j0.getItemAnimator().mo4865w(0);
        this.f34194j0.getItemAnimator().mo4866x(0);
        this.f34194j0.getItemAnimator().mo4868z(0);
        this.f34194j0.getItemAnimator().mo4843A(0);
        ((C0916y) this.f34194j0.getItemAnimator()).mo5428V(false);
        ProgressBar progressBar = (ProgressBar) this.f34193i0.findViewById(R.id.progressbar);
        PositionImageView positionImageView = (PositionImageView) this.f34193i0.findViewById(R.id.iv_position);
        this.f34201q0 = positionImageView;
        positionImageView.setImageDrawable(C8343s.m46304l(R.drawable.library_ic_position, R.color.white));
        this.f34203s0 = m44623C3();
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void mo29716I3(View view) {
        List<Music> list;
        if (!this.f34200p0 && (list = this.f34196l0) != null && list.size() > 0) {
            m44638Z3(this.f34196l0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void mo29717K3(View view, View view2) {
        if (this.f34208x0 == null) {
            this.f34208x0 = new C7245q0(mo3606L(), 0);
        }
        this.f34208x0.mo27759j(this);
        this.f34208x0.mo27743k(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public /* synthetic */ void mo29718M3(View view) {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26657Z4(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public /* synthetic */ void mo29719O3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int id = view.getId();
        if (id == R.id.iv_add_to_playlist) {
            m44658w3(i);
        } else if (id == R.id.popup_menu) {
            m44637Y3(view, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public /* synthetic */ void mo29720Q3() {
        this.f34195k0.setDuration(300);
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void mo29721S3(View view) {
        if (view.getId() == R.id.iv_position) {
            m44624D3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public /* synthetic */ boolean mo29722U3(View view, MotionEvent motionEvent) {
        m44621A3();
        return false;
    }

    /* renamed from: W3 */
    private void m44635W3(int i) {
        List<Music> list;
        this.f34195k0 = null;
        int i2 = (i != 0 && i == 1) ? R.layout.item_default : R.layout.item_default_grid;
        int i3 = this.f34205u0;
        TrackAdapter trackAdapter = new TrackAdapter(i2, this.f34196l0, 0, 0, i, !(i3 == 2 || i3 == 4), this.f34205u0);
        this.f34195k0 = trackAdapter;
        trackAdapter.isFirstOnly(false);
        this.f34195k0.setHasStableIds(true);
        if (this.f34205u0 != 4) {
            ViewParent parent = this.f34203s0.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeAllViews();
            }
            if (i != 1 || this.f34195k0.getHeaderLayoutCount() != 0 || (list = this.f34196l0) == null || list.size() <= 0) {
                this.f34195k0.removeHeaderView(this.f34203s0);
            } else {
                this.f34195k0.addHeaderView(this.f34203s0);
            }
        }
    }

    /* renamed from: X3 */
    public static C8105g3 m44636X3(int i, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("pageType", i);
        bundle.putLong("toPlaylistId", j);
        C8105g3 g3Var = new C8105g3();
        g3Var.mo3581C2(bundle);
        return g3Var;
    }

    /* renamed from: Y3 */
    private void m44637Y3(View view, int i) {
        if (this.f34202r0 == null) {
            C7249s0 s0Var = new C7249s0(mo3606L(), 0, this.f34205u0);
            this.f34202r0 = s0Var;
            s0Var.mo27759j(this);
            this.f34202r0.mo27830J(this);
        }
        this.f34202r0.mo27829H(i, this.f34196l0);
        this.f34202r0.mo27743k(view);
    }

    /* renamed from: Z3 */
    private void m44638Z3(List<Music> list) {
        if (list != null) {
            try {
                int nextInt = new Random().nextInt(list.size());
                C8287e.m45781F0(5, (ImageView) null, 0, true);
                C8287e.m45858n0(true);
                C8287e.m45823a0(mo29548a3(list, nextInt), list);
                ((LibraryActivity) mo3606L()).mo26674m4();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a4 */
    private void m44639a4() {
        List<Music> list;
        if (this.f34195k0 == null) {
            m44635W3(this.f34199o0);
        }
        if (this.f34205u0 == 4 && (list = this.f33738h0) != null && list.size() > 0) {
            this.f34195k0.mo26920v(this.f33738h0);
        }
        m44659x3(this.f34199o0);
    }

    /* renamed from: b4 */
    private void m44640b4() {
        List<Music> list = this.f34196l0;
        if (list != null) {
            list.clear();
            TrackAdapter trackAdapter = this.f34195k0;
            if (trackAdapter != null) {
                trackAdapter.notifyDataSetChanged();
            }
        }
        mo29724c4(true);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: d4 */
    private void m44641d4(List<Music> list) {
        List<Music> list2 = this.f34196l0;
        if (list2 != null) {
            list2.clear();
            this.f34196l0.addAll(list);
        } else {
            this.f34196l0 = list;
        }
        TextView textView = this.f34204t0;
        if (textView != null) {
            textView.setText(C8345u.m46333n(R.string.shuffle_all) + "(" + (this.f34196l0.size() - mo29547Z2(this.f34196l0.size())) + ")");
        }
        m44639a4();
        mo29724c4(false);
    }

    /* renamed from: f4 */
    private void m44642f4(int i) {
        if (this.f34196l0 != null) {
            this.f34199o0 = i;
            C8337n.m46065k0(mo3606L()).mo30133O2(this.f34199o0);
            m44635W3(this.f34199o0);
            m44659x3(this.f34199o0);
            return;
        }
        mo29726h3(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: g4 */
    private void m44643g4() {
        this.f34201q0.setOnClickListener(new C8123j2(this));
        RecyclerView recyclerView = this.f34194j0;
        if (recyclerView != null) {
            recyclerView.mo4634l(new C8106a());
            if (this.f34205u0 == 2) {
                this.f34194j0.setOnTouchListener(new C8096f2(this));
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* renamed from: h4 */
    public void m44644h4(List<Music> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Log.e("setupList", "size>0");
                    if (list.size() != 1) {
                        m44641d4(list);
                    } else if (list.get(0).mo9261a() == 6) {
                        m44640b4();
                    } else {
                        m44641d4(list);
                    }
                } else {
                    m44640b4();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else {
            m44640b4();
        }
        if (this.f34205u0 == 4) {
            this.f34195k0.mo26917r(true);
        }
        int i = this.f34205u0;
        if (i == 2 || i == 4) {
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.search_result"));
        }
    }

    /* renamed from: w3 */
    private void m44658w3(int i) {
        List<Music> list = this.f34196l0;
        if (list != null && list.size() > 0) {
            C8287e.m45818Y(this.f34196l0.get(i));
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46327h().getResources().getString(R.string.success_add_to_next));
        }
    }

    /* renamed from: x3 */
    private void m44659x3(int i) {
        TrackAdapter trackAdapter;
        if (this.f34194j0 != null && (trackAdapter = this.f34195k0) != null) {
            trackAdapter.setOnItemClickListener(this.f34209y0);
            this.f34195k0.setOnItemChildClickListener(this.f34210z0);
            this.f34195k0.mo26921y(this);
            this.f34194j0.setAdapter(this.f34195k0);
            if (i == 1) {
                this.f34194j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34194j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34194j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34194j0.mo4596e1(i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m44660y3() {
        if (C8337n.m46065k0(C8345u.m46327h()).mo30200f()) {
            new Handler().postDelayed(new C8109d(), 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public void m44661z3(int i) {
        int i2;
        TrackAdapter trackAdapter = this.f34195k0;
        if (trackAdapter != null) {
            trackAdapter.mo26916q(i);
            TrackAdapter trackAdapter2 = this.f34195k0;
            List<Music> list = this.f34196l0;
            if (list == null) {
                i2 = 0;
            } else {
                i2 = list.size() - mo29547Z2(this.f34196l0.size());
            }
            trackAdapter2.mo26907A(false, i2);
        }
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
        this.f34200p0 = z;
        mo29725e4(!z);
        if (z) {
            this.f34201q0.mo27547r();
        } else {
            this.f34201q0.mo27545o();
        }
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
        C8110e eVar = this.f34197m0;
        if (eVar != null) {
            eVar.cancel(true);
            this.f34197m0 = null;
        }
        if (this.f34195k0 != null) {
            this.f34195k0 = null;
        }
        if (this.f34198n0 != null) {
            mo3606L().unregisterReceiver(this.f34198n0);
            this.f34198n0 = null;
        }
        PositionImageView positionImageView = this.f34201q0;
        if (positionImageView != null) {
            positionImageView.mo27544n();
            this.f34201q0 = null;
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

    /* renamed from: L1 */
    public void mo3608L1() {
        super.mo3608L1();
        m44621A3();
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
    public void mo29723V3() {
        m44625E3();
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
        return C8105g3.class.getSimpleName();
    }

    /* renamed from: c4 */
    public void mo29724c4(boolean z) {
        RelativeLayout relativeLayout = this.f34207w0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
        TrackAdapter trackAdapter = this.f34195k0;
        if (trackAdapter != null && z) {
            trackAdapter.removeAllHeaderView();
        }
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: e4 */
    public void mo29725e4(boolean z) {
        List<Music> list;
        this.f34195k0.setDuration(0);
        if (!z) {
            this.f34195k0.removeHeaderView(this.f34203s0);
        } else if (this.f34199o0 == 1 && this.f34195k0.getHeaderLayoutCount() == 0 && (list = this.f34196l0) != null && list.size() > 0) {
            ViewParent parent = this.f34203s0.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f34195k0.addHeaderView(this.f34203s0);
        }
        new Handler().postDelayed(new C8119i2(this), 500);
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29726h3(false);
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
        }
    }

    /* renamed from: h3 */
    public void mo29726h3(boolean z) {
        C8110e eVar = this.f34197m0;
        if (eVar != null && eVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34197m0.cancel(true);
            this.f34197m0 = null;
        }
        C8110e eVar2 = new C8110e(this, z);
        this.f34197m0 = eVar2;
        eVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
    }

    /* renamed from: i1 */
    public void mo26514i1() {
    }

    /* renamed from: i3 */
    public void mo29727i3(LinearLayoutManager linearLayoutManager, int i, boolean z) {
        try {
            linearLayoutManager.mo4470A2(i, 0);
            linearLayoutManager.mo4426D2(z);
            new Handler().postDelayed(new C8107b(), 500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i4 */
    public void mo29728i4(int i) {
        if (this.f34195k0 != null && this.f34194j0 != null && i != this.f34199o0) {
            m44642f4(i);
        }
    }

    /* renamed from: l0 */
    public void mo26515l0() {
    }

    /* renamed from: m1 */
    public void mo26516m1(ArrayList<SoundEffect> arrayList) {
    }

    /* renamed from: n1 */
    public void mo26517n1() {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26517n1();
        }
    }

    /* renamed from: r */
    public void mo28063r(long j, int i) {
        C8314f.m45974c(mo3606L(), j, i, 0);
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34193i0 = layoutInflater.inflate(R.layout.recyclerview, (ViewGroup) null);
        this.f34199o0 = C8337n.m46065k0(mo3606L()).mo30143R0();
        m44627G3();
        mo29723V3();
        m44643g4();
        m44626F3();
        return this.f34193i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34195k0, i, j);
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
