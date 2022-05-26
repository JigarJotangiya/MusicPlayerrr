package p342g.p343a.p344a.p349f.p351c;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.adapter.TrackAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.SoundEffect;
import coocent.musiclibrary.music.p281b.C7324c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7949b;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p347d.C7974d;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.f3 */
/* compiled from: SelectTrackAddToPlaylistFragment */
public class C8097f3 extends C8010a implements C7324c, C7949b, C7963p {

    /* renamed from: y0 */
    public static String f34168y0 = C8097f3.class.getSimpleName();

    /* renamed from: i0 */
    private View f34169i0;

    /* renamed from: j0 */
    RecyclerView f34170j0;

    /* renamed from: k0 */
    public TrackAdapter f34171k0;

    /* renamed from: l0 */
    public List<Music> f34172l0;

    /* renamed from: m0 */
    private C8099b f34173m0;

    /* renamed from: n0 */
    private C8100c f34174n0;

    /* renamed from: o0 */
    private int f34175o0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public int f34176p0;

    /* renamed from: q0 */
    private RelativeLayout f34177q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public long f34178r0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public long f34179s0 = -1;

    /* renamed from: t0 */
    private TextView f34180t0;

    /* renamed from: u0 */
    private ImageView f34181u0;

    /* renamed from: v0 */
    private ImageView f34182v0;
    @SuppressLint({"NonConstantResourceId"})

    /* renamed from: w0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34183w0 = new C8060b2(this);

    /* renamed from: x0 */
    private final BaseQuickAdapter.OnItemClickListener f34184x0 = new C8098a();

    /* renamed from: g.a.a.f.c.f3$a */
    /* compiled from: SelectTrackAddToPlaylistFragment */
    class C8098a implements BaseQuickAdapter.OnItemClickListener {
        C8098a() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8287e.m45800P()) {
                C8287e.m45858n0(true);
                C8287e.m45823a0(i, C8097f3.this.f34172l0);
                return;
            }
            C8097f3.this.m44581u3(i);
        }
    }

    /* renamed from: g.a.a.f.c.f3$b */
    /* compiled from: SelectTrackAddToPlaylistFragment */
    private static class C8099b extends AsyncTask<Void, Void, List<Music>> {

        /* renamed from: a */
        private final WeakReference<C8097f3> f34186a;

        public C8099b(C8097f3 f3Var) {
            this.f34186a = new WeakReference<>(f3Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Music> doInBackground(Void... voidArr) {
            C8097f3 f3Var = (C8097f3) this.f34186a.get();
            List<Music> arrayList = new ArrayList<>();
            new ArrayList();
            if (f3Var != null) {
                if (f3Var.f34176p0 == C8183r2.f34409e) {
                    arrayList = C4477c.m19585M(C8345u.m46327h());
                } else if (f3Var.f34176p0 == C8183r2.f34407c) {
                    arrayList = C4477c.m19653x(C8345u.m46327h());
                } else if (f3Var.f34176p0 == C8183r2.f34408d) {
                    arrayList = C4477c.m19591P(C8345u.m46327h(), f3Var.f34179s0);
                } else if (f3Var.f34176p0 == C8183r2.f34405a) {
                    arrayList = C4477c.m19601U(C8345u.m46327h(), C8337n.m46065k0(C8345u.m46327h()).mo30268w0() + 1);
                } else if (f3Var.f34176p0 == C8183r2.f34406b) {
                    arrayList = C7974d.m43656d(C8345u.m46327h()).mo29511e(BaseApplication.f31150n, C8337n.m46065k0(C8345u.m46327h()).mo30276y0() + 1);
                }
                f3Var.mo29553f3(f3Var.mo29551d3(f3Var.f34176p0, arrayList, C4477c.m19591P(C8345u.m46327h(), f3Var.f34178r0)));
                C8010a.m43743Y2(arrayList);
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Music> list) {
            C8097f3 f3Var;
            super.onPostExecute(list);
            if (!isCancelled() && (f3Var = (C8097f3) this.f34186a.get()) != null) {
                boolean unused = f3Var.f33734d0 = true;
                f3Var.m44568O3(list);
            }
        }
    }

    /* renamed from: g.a.a.f.c.f3$c */
    /* compiled from: SelectTrackAddToPlaylistFragment */
    private class C8100c extends BroadcastReceiver {
        private C8100c() {
        }

        @SuppressLint({"SetTextI18n"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "media.musicplayer.audioplayer.videoplayer.select_track_to_updata_num".equals(intent.getAction())) {
                C8097f3.this.m44565L3();
            }
        }

        /* synthetic */ C8100c(C8097f3 f3Var, C8098a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void mo29704C3(View view) {
        int id = view.getId();
        if (id == R.id.ico_back) {
            LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
            if (libraryActivity != null) {
                libraryActivity.onBackPressed();
            }
        } else if (id == R.id.ivDone) {
            m44562H3();
        }
    }

    /* renamed from: E3 */
    private void m44559E3(int i) {
        this.f34171k0 = null;
        TrackAdapter trackAdapter = new TrackAdapter(R.layout.item_default, this.f34172l0, 0, 0, i, false, this.f34176p0);
        this.f34171k0 = trackAdapter;
        trackAdapter.isFirstOnly(false);
        this.f34171k0.setHasStableIds(true);
    }

    /* renamed from: F3 */
    public static C8097f3 m44560F3(int i, long j) {
        return m44561G3(i, j, -1);
    }

    /* renamed from: G3 */
    public static C8097f3 m44561G3(int i, long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putInt("pageType", i);
        bundle.putLong("toPlaylistId", j);
        bundle.putLong("fromPlaylistId", j2);
        C8097f3 f3Var = new C8097f3();
        f3Var.mo3581C2(bundle);
        return f3Var;
    }

    /* renamed from: H3 */
    private void m44562H3() {
        try {
            List<Music> O = C8287e.m45798O();
            if (O != null) {
                if (O.size() != 0) {
                    long[] jArr = new long[O.size()];
                    for (int i = 0; i < O.size(); i++) {
                        jArr[i] = O.get(i).mo9215k();
                    }
                    int a = C4477c.m19607a(C8345u.m46327h(), jArr, this.f34178r0);
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

    /* renamed from: I3 */
    private void m44563I3() {
        if (this.f34171k0 == null) {
            m44559E3(this.f34175o0);
        }
        List<Music> list = this.f33738h0;
        if (list != null && list.size() > 0) {
            this.f34171k0.mo26920v(this.f33738h0);
        }
        m44580t3(this.f34175o0);
    }

    /* renamed from: J3 */
    private void m44564J3() {
        List<Music> O = C8287e.m45798O();
        if (O == null || O.size() <= 0) {
            this.f34181u0.setVisibility(4);
        } else {
            this.f34181u0.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* renamed from: L3 */
    public void m44565L3() {
        List<Music> O = C8287e.m45798O();
        if (O == null || O.size() <= 0) {
            TextView textView = this.f34180t0;
            textView.setText(C8345u.m46333n(R.string.has_select) + 0 + C8345u.m46333n(R.string.track));
            ImageView imageView = this.f34181u0;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f34180t0;
        textView2.setText(C8345u.m46333n(R.string.has_select) + O.size() + C8345u.m46333n(R.string.track));
        ImageView imageView2 = this.f34181u0;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
    }

    /* renamed from: M3 */
    private void m44566M3() {
        C8070c2 c2Var = new C8070c2(this);
        this.f34181u0.setOnClickListener(c2Var);
        this.f34182v0.setOnClickListener(c2Var);
    }

    /* renamed from: N3 */
    private void m44567N3() {
        m44564J3();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* renamed from: O3 */
    public void m44568O3(List<Music> list) {
        if (list != null) {
            try {
                if (list.size() >= 0) {
                    if (list.size() > 0) {
                        List<Music> list2 = this.f34172l0;
                        if (list2 != null) {
                            list2.clear();
                            this.f34172l0.addAll(list);
                        } else {
                            this.f34172l0 = list;
                        }
                        m44563I3();
                        mo29706K3(false);
                        this.f34171k0.mo26917r(true);
                        return;
                    }
                    List<Music> list3 = this.f34172l0;
                    if (list3 != null) {
                        list3.clear();
                        TrackAdapter trackAdapter = this.f34171k0;
                        if (trackAdapter != null) {
                            trackAdapter.notifyDataSetChanged();
                        }
                    }
                    mo29706K3(true);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        List<Music> list4 = this.f34172l0;
        if (list4 != null) {
            list4.clear();
            TrackAdapter trackAdapter2 = this.f34171k0;
            if (trackAdapter2 != null) {
                trackAdapter2.notifyDataSetChanged();
            }
        }
        mo29706K3(true);
    }

    /* renamed from: s3 */
    private void m44579s3(int i) {
        List<Music> list = this.f34172l0;
        if (list != null && list.size() > 0) {
            C8287e.m45818Y(this.f34172l0.get(i));
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46327h().getResources().getString(R.string.success_add_to_next));
        }
    }

    /* renamed from: t3 */
    private void m44580t3(int i) {
        TrackAdapter trackAdapter;
        if (this.f34170j0 != null && (trackAdapter = this.f34171k0) != null) {
            trackAdapter.setOnItemClickListener(this.f34184x0);
            this.f34171k0.setOnItemChildClickListener(this.f34183w0);
            this.f34171k0.mo26921y(this);
            this.f34170j0.setAdapter(this.f34171k0);
            if (i == 1) {
                this.f34170j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34170j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34170j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34170j0.mo4596e1(i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public void m44581u3(int i) {
        int i2;
        TrackAdapter trackAdapter = this.f34171k0;
        if (trackAdapter != null) {
            trackAdapter.mo26916q(i);
            TrackAdapter trackAdapter2 = this.f34171k0;
            List<Music> list = this.f34172l0;
            if (list == null) {
                i2 = 0;
            } else {
                i2 = list.size() - mo29547Z2(this.f34172l0.size());
            }
            trackAdapter2.mo26907A(false, i2);
        }
    }

    /* renamed from: v3 */
    private void m44582v3() {
        Bundle V = mo3638V();
        if (V != null) {
            this.f34176p0 = V.getInt("pageType", C8183r2.f34409e);
            this.f34178r0 = V.getLong("toPlaylistId", -1);
            this.f34179s0 = V.getLong("fromPlaylistId", -1);
        }
    }

    /* renamed from: w3 */
    private void m44583w3() {
        mo29707h3();
    }

    /* renamed from: x3 */
    private void m44584x3() {
        this.f34174n0 = new C8100c(this, (C8098a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_num");
        mo3606L().registerReceiver(this.f34174n0, intentFilter);
    }

    /* renamed from: y3 */
    private void m44585y3() {
        m44582v3();
        this.f34170j0 = (RecyclerView) this.f34169i0.findViewById(R.id.recyclerView);
        this.f34180t0 = (TextView) this.f34169i0.findViewById(R.id.sub_title);
        ((ConstraintLayout) this.f34169i0.findViewById(R.id.select_track_add_to_root)).setOnClickListener((View.OnClickListener) null);
        m44565L3();
        ((TextView) this.f34169i0.findViewById(R.id.title)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f34177q0 = (RelativeLayout) this.f34169i0.findViewById(R.id.rl_no);
        ((ImageView) this.f34169i0.findViewById(R.id.iv_no)).setImageDrawable(C8343s.m46303k(R.drawable.ic_lists_no_song, R.color.colorAccent));
        this.f34169i0.findViewById(R.id.statusView).getLayoutParams().height = BaseApplication.f31145H;
        this.f34170j0.getItemAnimator().mo4865w(0);
        this.f34170j0.getItemAnimator().mo4866x(0);
        this.f34170j0.getItemAnimator().mo4868z(0);
        this.f34170j0.getItemAnimator().mo4843A(0);
        ((C0916y) this.f34170j0.getItemAnimator()).mo5428V(false);
        ImageView imageView = (ImageView) this.f34169i0.findViewById(R.id.ico_back);
        this.f34182v0 = imageView;
        mo29552e3(imageView);
        ProgressBar progressBar = (ProgressBar) this.f34169i0.findViewById(R.id.progressbar);
        ImageView imageView2 = (ImageView) this.f34169i0.findViewById(R.id.ivDone);
        this.f34181u0 = imageView2;
        imageView2.setImageDrawable(C8343s.m46304l(R.drawable.ic_toolbar_04, R.color.default_text_color));
        ImageView imageView3 = (ImageView) this.f34169i0.findViewById(R.id.bg);
        this.f34169i0.findViewById(R.id.bg_cover).setVisibility(C8343s.f34787b ? 0 : 8);
        C8343s.m46307o(imageView3, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void mo29703A3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (view.getId() == R.id.iv_add_to_playlist) {
            m44579s3(i);
        }
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B */
    public void mo29479B(boolean z) {
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        C8099b bVar = this.f34173m0;
        if (bVar != null) {
            bVar.cancel(true);
            this.f34173m0 = null;
        }
        if (this.f34171k0 != null) {
            this.f34171k0 = null;
        }
        if (this.f34174n0 != null) {
            mo3606L().unregisterReceiver(this.f34174n0);
            this.f34174n0 = null;
        }
        C8287e.m45793L0(false);
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
    }

    /* renamed from: D3 */
    public void mo29705D3() {
        m44583w3();
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: K3 */
    public void mo29706K3(boolean z) {
        RelativeLayout relativeLayout = this.f34177q0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
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
        return C8097f3.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
    }

    /* renamed from: h3 */
    public void mo29707h3() {
        C8099b bVar = this.f34173m0;
        if (bVar != null && bVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34173m0.cancel(true);
            this.f34173m0 = null;
        }
        C8099b bVar2 = new C8099b(this);
        this.f34173m0 = bVar2;
        bVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
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
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34169i0 = layoutInflater.inflate(R.layout.fragment_select_track_add_to_playlist, (ViewGroup) null);
        this.f34175o0 = C8337n.m46065k0(mo3606L()).mo30143R0();
        m44585y3();
        mo29705D3();
        m44567N3();
        m44566M3();
        m44584x3();
        return this.f34169i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
    }

    /* renamed from: x */
    public void mo28066x(long j) {
    }

    /* renamed from: x1 */
    public void mo26519x1(float f) {
    }

    /* renamed from: y1 */
    public void mo26520y1() {
    }
}
