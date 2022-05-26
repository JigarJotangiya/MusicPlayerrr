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
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
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

/* renamed from: g.a.a.f.c.q2 */
/* compiled from: ArtistTracksFragment */
public class C8174q2 extends C8010a implements C7324c, C7949b, C7963p {

    /* renamed from: i0 */
    private View f34379i0;

    /* renamed from: j0 */
    RecyclerView f34380j0;

    /* renamed from: k0 */
    ProgressBar f34381k0;

    /* renamed from: l0 */
    public TrackAdapter f34382l0;

    /* renamed from: m0 */
    public List<Music> f34383m0;

    /* renamed from: n0 */
    private C8178d f34384n0;

    /* renamed from: o0 */
    private C8337n f34385o0;

    /* renamed from: p0 */
    private C8179e f34386p0;

    /* renamed from: q0 */
    private int f34387q0 = 0;

    /* renamed from: r0 */
    private boolean f34388r0 = false;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public long f34389s0 = -1;

    /* renamed from: t0 */
    private View f34390t0;

    /* renamed from: u0 */
    private C7249s0 f34391u0;

    /* renamed from: v0 */
    private RelativeLayout f34392v0;

    /* renamed from: w0 */
    private final BaseQuickAdapter.OnItemClickListener f34393w0 = new C8176b();
    @SuppressLint({"NonConstantResourceId"})

    /* renamed from: x0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34394x0 = new C8046a0(this);

    /* renamed from: g.a.a.f.c.q2$a */
    /* compiled from: ArtistTracksFragment */
    class C8175a implements Runnable {
        C8175a() {
        }

        public void run() {
            C8174q2.this.f34382l0.setDuration(300);
        }
    }

    /* renamed from: g.a.a.f.c.q2$b */
    /* compiled from: ArtistTracksFragment */
    class C8176b implements BaseQuickAdapter.OnItemClickListener {
        C8176b() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8287e.m45800P()) {
                C8287e.m45858n0(true);
                C8287e.m45823a0(i, C8174q2.this.f34383m0);
                C8174q2.this.m45114p3();
                return;
            }
            C8174q2.this.m45116r3(i);
        }
    }

    /* renamed from: g.a.a.f.c.q2$c */
    /* compiled from: ArtistTracksFragment */
    class C8177c implements Runnable {
        C8177c() {
        }

        public void run() {
            try {
                if (C8174q2.this.mo3606L() != null) {
                    C8174q2.this.mo3627R2(new Intent(C8174q2.this.mo3606L(), MainActivity.class));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.f.c.q2$d */
    /* compiled from: ArtistTracksFragment */
    private static class C8178d extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private final boolean f34398a;

        /* renamed from: b */
        private final boolean f34399b;

        /* renamed from: c */
        private final WeakReference<C8174q2> f34400c;

        public C8178d(C8174q2 q2Var, boolean z, boolean z2) {
            this.f34398a = z;
            this.f34399b = z2;
            this.f34400c = new WeakReference<>(q2Var);
        }

        /* renamed from: a */
        private void m45158a(List<Music> list, C8174q2 q2Var) {
            FragmentActivity L;
            if (!this.f34399b) {
                return;
            }
            if ((list == null || list.size() == 0) && (L = q2Var.mo3606L()) != null) {
                L.onBackPressed();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public List<Music> doInBackground(Void... voidArr) {
            C8174q2 q2Var = (C8174q2) this.f34400c.get();
            if (q2Var == null) {
                return null;
            }
            List<Music> t = C4477c.m19645t(C8345u.m46327h(), q2Var.f34389s0);
            if (!this.f34398a) {
                return t;
            }
            SystemClock.sleep(500);
            return t;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(List<Music> list) {
            C8174q2 q2Var;
            super.onPostExecute(list);
            if (!isCancelled() && (q2Var = (C8174q2) this.f34400c.get()) != null) {
                ProgressBar progressBar = q2Var.f34381k0;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                boolean unused = q2Var.f33734d0 = true;
                q2Var.m45106O3(list);
                m45158a(list, q2Var);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ProgressBar progressBar;
            super.onPreExecute();
            C8174q2 q2Var = (C8174q2) this.f34400c.get();
            if (q2Var != null && (progressBar = q2Var.f34381k0) != null && this.f34398a) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* renamed from: g.a.a.f.c.q2$e */
    /* compiled from: ArtistTracksFragment */
    private class C8179e extends BroadcastReceiver {
        private C8179e() {
        }

        public void onReceive(Context context, Intent intent) {
            TrackAdapter trackAdapter;
            int intExtra;
            if (intent == null) {
                return;
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action")) {
                C8174q2.this.mo29834h3(false, true);
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.list_notifiy.action")) {
                TrackAdapter trackAdapter2 = C8174q2.this.f34382l0;
                if (trackAdapter2 != null) {
                    trackAdapter2.notifyDataSetChanged();
                }
            } else if (!intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.artist_track_artwork_item_notify")) {
                String action = intent.getAction();
                if (action.equals(C8174q2.this.mo3651a0().getPackageName() + C8311c.f34734a)) {
                    C8174q2 q2Var = C8174q2.this;
                    if (q2Var.f34382l0 != null) {
                        q2Var.mo29834h3(false, false);
                    }
                } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.artist_track_detail_delete_notify_action")) {
                    C8174q2 q2Var2 = C8174q2.this;
                    if (q2Var2.f34382l0 != null) {
                        q2Var2.mo29834h3(false, false);
                    }
                } else if ("media.musicplayer.audioplayer.videoplayer.clean_list".equals(intent.getAction()) && (trackAdapter = C8174q2.this.f34382l0) != null) {
                    trackAdapter.notifyDataSetChanged();
                }
            } else if (C8174q2.this.f34382l0 != null && (intExtra = intent.getIntExtra("artwork_position", -1)) >= 0) {
                TrackAdapter trackAdapter3 = C8174q2.this.f34382l0;
                trackAdapter3.notifyItemChanged(intExtra + trackAdapter3.getHeaderLayoutCount());
            }
        }

        /* synthetic */ C8179e(C8174q2 q2Var, C8175a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void mo29829C3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int id = view.getId();
        if (id == R.id.iv_add_to_playlist) {
            m45112n3(i);
        } else if (id == R.id.popup_menu) {
            m45100G3(view, i);
        }
    }

    /* renamed from: E3 */
    private void m45098E3(int i) {
        List<Music> list;
        this.f34382l0 = null;
        TrackAdapter trackAdapter = new TrackAdapter((i != 0 && i == 1) ? R.layout.item_default : R.layout.item_default_grid, this.f34383m0, 2, 0, i, true, 0);
        this.f34382l0 = trackAdapter;
        trackAdapter.isFirstOnly(false);
        this.f34382l0.setHasStableIds(true);
        ViewParent parent = this.f34390t0.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        if (i != 1 || this.f34382l0.getHeaderLayoutCount() != 0 || (list = this.f34383m0) == null || list.size() <= 0) {
            this.f34382l0.removeHeaderView(this.f34390t0);
        } else {
            this.f34382l0.addHeaderView(this.f34390t0);
        }
    }

    /* renamed from: F3 */
    public static Fragment m45099F3(long j) {
        C8174q2 q2Var = new C8174q2();
        Bundle bundle = new Bundle();
        bundle.putLong("artist_id", j);
        q2Var.mo3581C2(bundle);
        return q2Var;
    }

    /* renamed from: G3 */
    private void m45100G3(View view, int i) {
        if (this.f34391u0 == null) {
            C7249s0 s0Var = new C7249s0(mo3606L(), 10, 0);
            this.f34391u0 = s0Var;
            s0Var.mo27759j(this);
            this.f34391u0.mo27830J(this);
        }
        this.f34391u0.mo27829H(i, this.f34383m0);
        this.f34391u0.mo27743k(view);
    }

    /* renamed from: H3 */
    private void m45101H3(List<Music> list) {
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

    /* renamed from: I3 */
    private void m45102I3() {
        if (this.f34382l0 == null) {
            m45098E3(this.f34387q0);
        }
        m45113o3(this.f34387q0);
    }

    /* renamed from: L3 */
    private void m45103L3() {
        Fragment p0 = mo3690p0();
        if (p0 instanceof C8158o2) {
            ((C8158o2) p0).mo29803C3(0);
        }
    }

    /* renamed from: M3 */
    private void m45104M3(int i) {
        if (this.f34383m0 != null) {
            this.f34387q0 = i;
            C8337n.m46065k0(mo3606L()).mo30273x1(this.f34387q0);
            m45098E3(this.f34387q0);
            m45113o3(this.f34387q0);
            return;
        }
        mo29834h3(false, false);
    }

    /* renamed from: N3 */
    private void m45105N3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public void m45106O3(List<Music> list) {
        if (list != null) {
            try {
                if (list.size() >= 0) {
                    if (list.size() > 0) {
                        List<Music> list2 = this.f34383m0;
                        if (list2 != null) {
                            list2.clear();
                            this.f34383m0.addAll(list);
                        } else {
                            this.f34383m0 = list;
                        }
                        m45103L3();
                        m45102I3();
                        mo29831J3(false);
                        return;
                    }
                    List<Music> list3 = this.f34383m0;
                    if (list3 != null) {
                        list3.clear();
                        TrackAdapter trackAdapter = this.f34382l0;
                        if (trackAdapter != null) {
                            trackAdapter.notifyDataSetChanged();
                        }
                    }
                    mo29831J3(true);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        List<Music> list4 = this.f34383m0;
        if (list4 != null) {
            list4.clear();
            TrackAdapter trackAdapter2 = this.f34382l0;
            if (trackAdapter2 != null) {
                trackAdapter2.notifyDataSetChanged();
            }
        }
        mo29831J3(true);
    }

    /* renamed from: n3 */
    private void m45112n3(int i) {
        List<Music> list = this.f34383m0;
        if (list != null && list.size() > 0) {
            C8287e.m45818Y(this.f34383m0.get(i));
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46327h().getResources().getString(R.string.success_add_to_next));
        }
    }

    /* renamed from: o3 */
    private void m45113o3(int i) {
        TrackAdapter trackAdapter;
        if (this.f34380j0 != null && (trackAdapter = this.f34382l0) != null) {
            trackAdapter.setOnItemClickListener(this.f34393w0);
            this.f34382l0.setOnItemChildClickListener(this.f34394x0);
            this.f34382l0.mo26921y(this);
            this.f34380j0.setAdapter(this.f34382l0);
            if (i == 1) {
                this.f34380j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34380j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34380j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34380j0.mo4596e1(i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public void m45114p3() {
        if (this.f34385o0.mo30200f()) {
            new Handler().postDelayed(new C8177c(), 500);
        }
    }

    /* renamed from: q3 */
    private void m45115q3() {
        C8287e.m45793L0(false);
        C8287e.m45791K0(-1);
        C8287e.m45849j();
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public void m45116r3(int i) {
        int i2;
        TrackAdapter trackAdapter = this.f34382l0;
        if (trackAdapter != null) {
            trackAdapter.mo26916q(i);
            TrackAdapter trackAdapter2 = this.f34382l0;
            List<Music> list = this.f34383m0;
            if (list == null) {
                i2 = 0;
            } else {
                i2 = list.size() - mo29547Z2(this.f34383m0.size());
            }
            trackAdapter2.mo26907A(false, i2);
        }
    }

    /* renamed from: s3 */
    private View m45117s3() {
        View inflate = mo3676k0().inflate(R.layout.head_view_shuffle, (ViewGroup) this.f34380j0.getParent(), false);
        ((ImageView) inflate.findViewById(R.id.iv_shuffle_all)).setImageDrawable(C8343s.m46303k(R.drawable.ic_home01_play_all, R.color.colorAccent));
        ((TextView) inflate.findViewById(R.id.tv_play_all)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.multiOption);
        imageView.setImageDrawable(C8343s.m46298f(R.drawable.ic_home03_choose));
        ((ImageView) inflate.findViewById(R.id.sortOption)).setVisibility(8);
        inflate.setOnClickListener(new C8058b0(this));
        imageView.setOnClickListener(new C8068c0(this));
        return inflate;
    }

    /* renamed from: t3 */
    private void m45118t3() {
        this.f34389s0 = mo3638V().getLong("artist_id", -1);
    }

    /* renamed from: u3 */
    private void m45119u3() {
        if (!this.f33734d0) {
            mo29834h3(false, false);
        }
    }

    /* renamed from: v3 */
    private void m45120v3() {
        this.f34386p0 = new C8179e(this, (C8175a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.list_notifiy.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.artwork_item_notify");
        intentFilter.addAction(mo3651a0().getPackageName() + C8311c.f34734a);
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.artist_track_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.artist_track_detail_delete_notify_action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
        mo3606L().registerReceiver(this.f34386p0, intentFilter);
    }

    /* renamed from: w3 */
    private void m45121w3() {
        this.f34380j0 = (RecyclerView) this.f34379i0.findViewById(R.id.recyclerView);
        this.f34392v0 = (RelativeLayout) this.f34379i0.findViewById(R.id.rl_no);
        this.f34380j0.getItemAnimator().mo4865w(0);
        this.f34380j0.getItemAnimator().mo4866x(0);
        this.f34380j0.getItemAnimator().mo4868z(0);
        this.f34380j0.getItemAnimator().mo4843A(0);
        ((C0916y) this.f34380j0.getItemAnimator()).mo5428V(false);
        this.f34381k0 = (ProgressBar) this.f34379i0.findViewById(R.id.progressbar);
        this.f34385o0 = new C8337n(mo3606L());
        this.f34390t0 = m45117s3();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void mo29835y3(View view) {
        List<Music> list;
        if (!this.f34388r0 && (list = this.f34383m0) != null && list.size() > 0) {
            m45101H3(this.f34383m0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void mo29828A3(View view) {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26657Z4(0);
        }
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B */
    public void mo29479B(boolean z) {
        this.f34388r0 = z;
        mo29832K3(!z);
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        m45115q3();
        C8178d dVar = this.f34384n0;
        if (dVar != null) {
            dVar.cancel(true);
            this.f34384n0 = null;
        }
        if (this.f34382l0 != null) {
            this.f34382l0 = null;
        }
        if (this.f34386p0 != null) {
            mo3606L().unregisterReceiver(this.f34386p0);
            this.f34386p0 = null;
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45976e(mo3606L(), i, j, i2, str);
    }

    /* renamed from: D3 */
    public void mo29830D3() {
        m45119u3();
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: J3 */
    public void mo29831J3(boolean z) {
        RelativeLayout relativeLayout = this.f34392v0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: K3 */
    public void mo29832K3(boolean z) {
        List<Music> list;
        this.f34382l0.setDuration(0);
        if (!z) {
            this.f34382l0.removeHeaderView(this.f34390t0);
        } else if (this.f34387q0 == 1 && this.f34382l0.getHeaderLayoutCount() == 0 && (list = this.f34383m0) != null && list.size() > 0) {
            ViewParent parent = this.f34390t0.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f34382l0.addHeaderView(this.f34390t0);
        }
        new Handler().postDelayed(new C8175a(), 500);
    }

    /* renamed from: P3 */
    public void mo29833P3(int i) {
        if (this.f34382l0 != null && this.f34380j0 != null && i != this.f34387q0) {
            m45104M3(i);
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
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8174q2.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29834h3(false, true);
        if (mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.artist_album_detail_delete_notify_action").setPackage(C8345u.m46327h().getPackageName()));
        }
        if (music != null && C8287e.m45873v() != null && music.mo9215k() == C8287e.m45873v().mo9215k() && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page").setPackage(C8345u.m46327h().getPackageName()));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification").setPackage(C8345u.m46327h().getPackageName()));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget").setPackage(C8345u.m46327h().getPackageName()));
        }
    }

    /* renamed from: h3 */
    public void mo29834h3(boolean z, boolean z2) {
        C8178d dVar = this.f34384n0;
        if (dVar != null && dVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34384n0.cancel(true);
            this.f34384n0 = null;
        }
        C8178d dVar2 = new C8178d(this, z, z2);
        this.f34384n0 = dVar2;
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

    /* renamed from: r */
    public void mo28063r(long j, int i) {
        C8314f.m45974c(mo3606L(), j, i, 10);
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34379i0 = layoutInflater.inflate(R.layout.fragment_artist_tracks, (ViewGroup) null);
        m45118t3();
        m45121w3();
        mo29830D3();
        m45105N3();
        m45120v3();
        this.f34387q0 = C8337n.m46065k0(mo3606L()).mo30196e();
        m45115q3();
        return this.f34379i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34382l0, i, j);
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
