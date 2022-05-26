package p342g.p343a.p344a.p349f.p351c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Genres;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.adapter.GenresAdapter;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.p275k.C7223l0;
import coocent.musiclibrary.music.p281b.C7324c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.ads.AdHelper;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8315g;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.y2 */
/* compiled from: GenresFragment */
public class C8231y2 extends C8010a implements C7324c, C7963p {

    /* renamed from: i0 */
    private View f34526i0;

    /* renamed from: j0 */
    RecyclerView f34527j0;

    /* renamed from: k0 */
    ProgressBar f34528k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public BaseQuickAdapter f34529l0;

    /* renamed from: m0 */
    private List<Genres> f34530m0;

    /* renamed from: n0 */
    private C8234c f34531n0;

    /* renamed from: o0 */
    private C8235d f34532o0;

    /* renamed from: p0 */
    private int f34533p0 = 0;

    /* renamed from: q0 */
    private C7223l0 f34534q0;

    /* renamed from: r0 */
    private BaseQuickAdapter.OnItemClickListener f34535r0 = new C8232a();

    /* renamed from: s0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34536s0 = new C8233b();

    /* renamed from: g.a.a.f.c.y2$a */
    /* compiled from: GenresFragment */
    class C8232a implements BaseQuickAdapter.OnItemClickListener {
        C8232a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo29919b(int i) {
            C8231y2.this.m45459u3(i);
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8315g.m45979a() && !AdHelper.m49536p().mo32459v(C8231y2.this.mo3606L(), new C8198u0(this, i))) {
                C8231y2.this.m45459u3(i);
            }
        }
    }

    /* renamed from: g.a.a.f.c.y2$b */
    /* compiled from: GenresFragment */
    class C8233b implements BaseQuickAdapter.OnItemChildClickListener {
        C8233b() {
        }

        public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (view.getId() == R.id.popup_menu) {
                C8231y2.this.m45460v3(baseQuickAdapter, view, i);
            }
        }
    }

    /* renamed from: g.a.a.f.c.y2$c */
    /* compiled from: GenresFragment */
    private static class C8234c extends AsyncTask<Void, Void, List<Genres>> {

        /* renamed from: a */
        private final boolean f34539a;

        /* renamed from: b */
        private final WeakReference<C8231y2> f34540b;

        public C8234c(C8231y2 y2Var, boolean z) {
            this.f34539a = z;
            this.f34540b = new WeakReference<>(y2Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Genres> doInBackground(Void... voidArr) {
            C8231y2 y2Var = (C8231y2) this.f34540b.get();
            List<Genres> arrayList = new ArrayList<>();
            if (y2Var != null) {
                arrayList = C4477c.m19575H(C8345u.m46327h());
                if (this.f34539a) {
                    SystemClock.sleep(500);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Genres> list) {
            C8231y2 y2Var;
            super.onPostExecute(list);
            if (!isCancelled() && (y2Var = (C8231y2) this.f34540b.get()) != null) {
                ProgressBar progressBar = y2Var.f34528k0;
                if (progressBar != null && this.f34539a) {
                    progressBar.setVisibility(8);
                }
                boolean unused = y2Var.f33734d0 = true;
                y2Var.m45463y3(list);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ProgressBar progressBar;
            super.onPreExecute();
            C8231y2 y2Var = (C8231y2) this.f34540b.get();
            if (y2Var != null && (progressBar = y2Var.f34528k0) != null && this.f34539a) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* renamed from: g.a.a.f.c.y2$d */
    /* compiled from: GenresFragment */
    private class C8235d extends BroadcastReceiver {
        private C8235d() {
        }

        public void onReceive(Context context, Intent intent) {
            int intExtra;
            if (intent == null) {
                return;
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.album_artwork_item_notify")) {
                if (C8231y2.this.f34529l0 != null && (intExtra = intent.getIntExtra("artwork_position", -1)) >= 0) {
                    C8231y2.this.f34529l0.notifyItemChanged(intExtra + C8231y2.this.f34529l0.getHeaderLayoutCount());
                }
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action") && C8231y2.this.f34529l0 != null) {
                C8231y2 y2Var = C8231y2.this;
                if (y2Var.f34527j0 != null) {
                    boolean unused = y2Var.f33734d0 = false;
                    C8231y2.this.mo29916h3(true);
                }
            }
        }

        /* synthetic */ C8235d(C8231y2 y2Var, C8232a aVar) {
            this();
        }
    }

    /* renamed from: o3 */
    private void m45454o3(int i) {
        BaseQuickAdapter baseQuickAdapter;
        if (this.f34527j0 != null && (baseQuickAdapter = this.f34529l0) != null) {
            baseQuickAdapter.setOnItemClickListener(this.f34535r0);
            this.f34529l0.setOnItemChildClickListener(this.f34536s0);
            this.f34527j0.setAdapter(this.f34529l0);
            if (i == 1) {
                this.f34527j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34527j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34527j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34527j0.mo4596e1(i2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: p3 */
    private void m45455p3() {
        mo29916h3(true);
    }

    /* renamed from: q3 */
    private void m45456q3() {
        this.f34532o0 = new C8235d(this, (C8232a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.album_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action");
        mo3606L().registerReceiver(this.f34532o0, intentFilter);
    }

    /* renamed from: r3 */
    private void m45457r3() {
        View view = this.f34526i0;
        if (view != null) {
            this.f34527j0 = (RecyclerView) view.findViewById(R.id.recyclerView);
            this.f34528k0 = (ProgressBar) this.f34526i0.findViewById(R.id.progressbar);
        }
    }

    /* renamed from: t3 */
    private void m45458t3(int i) {
        this.f34529l0 = null;
        int i2 = R.layout.item_default_grid;
        if (i != 0 && i == 1) {
            i2 = R.layout.item_default;
        }
        GenresAdapter genresAdapter = new GenresAdapter(i2, this.f34530m0, i);
        this.f34529l0 = genresAdapter;
        genresAdapter.openLoadAnimation(2);
        this.f34529l0.isFirstOnly(false);
        this.f34529l0.setHasStableIds(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public void m45459u3(int i) {
        C8216w2.m45361e(mo3606L(), (C8220x2) null, this.f34530m0.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public void m45460v3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (baseQuickAdapter.getItem(i) != null) {
            if (this.f34534q0 == null) {
                C7223l0 l0Var = new C7223l0(mo3606L());
                this.f34534q0 = l0Var;
                l0Var.mo27759j(this);
                this.f34534q0.mo27772v(this);
            }
            Genres genres = (Genres) baseQuickAdapter.getItem(i);
            if (genres != null) {
                this.f34534q0.mo27771t(genres.mo9186d(), genres.mo9190f());
                this.f34534q0.mo27743k(view);
            }
        }
    }

    /* renamed from: w3 */
    private void m45461w3() {
        if (this.f34529l0 == null) {
            m45458t3(this.f34533p0);
        }
        m45454o3(this.f34533p0);
    }

    /* renamed from: x3 */
    private void m45462x3(int i) {
        if (this.f34530m0 != null) {
            this.f34533p0 = i;
            C8337n.m46065k0(mo3606L()).mo30191c2(this.f34533p0);
            m45458t3(this.f34533p0);
            m45454o3(this.f34533p0);
            return;
        }
        mo29916h3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m45463y3(List<Genres> list) {
        if (list != null && list.size() > 0) {
            List<Genres> list2 = this.f34530m0;
            if (list2 != null) {
                list2.clear();
                this.f34530m0.addAll(list);
            } else {
                this.f34530m0 = list;
            }
            m45461w3();
        }
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        C8234c cVar = this.f34531n0;
        if (cVar != null) {
            cVar.cancel(true);
            this.f34531n0 = null;
        }
        if (this.f34532o0 != null) {
            mo3606L().unregisterReceiver(this.f34532o0);
            this.f34532o0 = null;
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45976e(mo3606L(), i, j, i2, str);
    }

    /* renamed from: G */
    public void mo26503G() {
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
        return C8231y2.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29916h3(true);
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page").setPackage(C8345u.m46327h().getPackageName()));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification").setPackage(C8345u.m46327h().getPackageName()));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget").setPackage(C8345u.m46327h().getPackageName()));
        }
    }

    /* renamed from: h3 */
    public void mo29916h3(boolean z) {
        C8234c cVar = this.f34531n0;
        if (cVar != null && cVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34531n0.cancel(true);
            this.f34531n0 = null;
        }
        C8234c cVar2 = new C8234c(this, z);
        this.f34531n0 = cVar2;
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

    /* renamed from: r */
    public void mo28063r(long j, int i) {
        C8314f.m45974c(mo3606L(), j, i, 3);
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: s3 */
    public void mo29917s3() {
        m45457r3();
        m45455p3();
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34526i0 = layoutInflater.inflate(R.layout.recyclerview, (ViewGroup) null);
        mo29917s3();
        m45456q3();
        this.f34533p0 = C8337n.m46065k0(mo3606L()).mo30193d0();
        return this.f34526i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34529l0, i, j);
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

    /* renamed from: z3 */
    public void mo29918z3(int i) {
        if (this.f34529l0 != null && this.f34527j0 != null && i != this.f34533p0) {
            m45462x3(i);
        }
    }
}
