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
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Album;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.adapter.AlbumAdapter;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.p275k.C7209h0;
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
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.n2 */
/* compiled from: ArtistAlbumsFragment */
public class C8150n2 extends C8010a implements C7324c, C7963p {

    /* renamed from: i0 */
    private View f34304i0;

    /* renamed from: j0 */
    RecyclerView f34305j0;

    /* renamed from: k0 */
    ProgressBar f34306k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public BaseQuickAdapter f34307l0;

    /* renamed from: m0 */
    public List<Album> f34308m0;

    /* renamed from: n0 */
    private C8153c f34309n0;

    /* renamed from: o0 */
    private C8154d f34310o0;

    /* renamed from: p0 */
    private int f34311p0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public long f34312q0 = -1;

    /* renamed from: r0 */
    private C7209h0 f34313r0;

    /* renamed from: s0 */
    private RelativeLayout f34314s0;

    /* renamed from: t0 */
    private BaseQuickAdapter.OnItemClickListener f34315t0 = new C8151a();

    /* renamed from: u0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34316u0 = new C8152b();

    /* renamed from: g.a.a.f.c.n2$a */
    /* compiled from: ArtistAlbumsFragment */
    class C8151a implements BaseQuickAdapter.OnItemClickListener {
        C8151a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo29795b(int i) {
            C8150n2.this.m44930y3(i);
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (!C8315g.m45979a() && !AdHelper.m49536p().mo32459v(C8150n2.this.mo3606L(), new C8184s(this, i))) {
                C8150n2.this.m44930y3(i);
            }
        }
    }

    /* renamed from: g.a.a.f.c.n2$b */
    /* compiled from: ArtistAlbumsFragment */
    class C8152b implements BaseQuickAdapter.OnItemChildClickListener {
        C8152b() {
        }

        public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (view.getId() == R.id.popup_menu) {
                C8150n2.this.m44931z3(baseQuickAdapter, view, i);
            }
        }
    }

    /* renamed from: g.a.a.f.c.n2$c */
    /* compiled from: ArtistAlbumsFragment */
    private static class C8153c extends AsyncTask<Void, Void, List<Album>> {

        /* renamed from: a */
        private final boolean f34319a;

        /* renamed from: b */
        private final boolean f34320b;

        /* renamed from: c */
        private final WeakReference<C8150n2> f34321c;

        public C8153c(C8150n2 n2Var, boolean z, boolean z2) {
            this.f34319a = z;
            this.f34320b = z2;
            this.f34321c = new WeakReference<>(n2Var);
        }

        /* renamed from: a */
        private void m44963a(List<Album> list, C8150n2 n2Var) {
            FragmentActivity L;
            if (!this.f34320b) {
                return;
            }
            if ((list == null || list.size() == 0) && (L = n2Var.mo3606L()) != null) {
                L.onBackPressed();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public List<Album> doInBackground(Void... voidArr) {
            C8150n2 n2Var = (C8150n2) this.f34321c.get();
            List<Album> arrayList = new ArrayList<>();
            if (n2Var != null) {
                arrayList = C4477c.m19639q(C8345u.m46327h(), n2Var.f34312q0);
                if (this.f34319a) {
                    SystemClock.sleep(200);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(List<Album> list) {
            super.onPostExecute(list);
            if (!isCancelled()) {
                C8150n2 n2Var = (C8150n2) this.f34321c.get();
                if (n2Var != null) {
                    ProgressBar progressBar = n2Var.f34306k0;
                    if (progressBar != null && this.f34319a) {
                        progressBar.setVisibility(8);
                    }
                    boolean unused = n2Var.f33734d0 = true;
                    n2Var.m44914E3(list);
                }
                m44963a(list, n2Var);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ProgressBar progressBar;
            super.onPreExecute();
            C8150n2 n2Var = (C8150n2) this.f34321c.get();
            if (n2Var != null && (progressBar = n2Var.f34306k0) != null && this.f34319a) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* renamed from: g.a.a.f.c.n2$d */
    /* compiled from: ArtistAlbumsFragment */
    private class C8154d extends BroadcastReceiver {
        private C8154d() {
        }

        public void onReceive(Context context, Intent intent) {
            int intExtra;
            if (intent == null) {
                return;
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.album_artwork_item_notify")) {
                if (C8150n2.this.f34307l0 != null && (intExtra = intent.getIntExtra("artwork_position", -1)) >= 0) {
                    C8150n2.this.f34307l0.notifyItemChanged(intExtra + C8150n2.this.f34307l0.getHeaderLayoutCount());
                }
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action")) {
                if (C8150n2.this.f34307l0 != null) {
                    C8150n2 n2Var = C8150n2.this;
                    if (n2Var.f34305j0 != null) {
                        boolean unused = n2Var.f33734d0 = false;
                        C8150n2.this.mo29793h3(false, true);
                    }
                }
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.artist_album_detail_delete_notify_action") && C8150n2.this.f34307l0 != null) {
                C8150n2 n2Var2 = C8150n2.this;
                if (n2Var2.f34305j0 != null) {
                    boolean unused2 = n2Var2.f33734d0 = false;
                    C8150n2.this.mo29793h3(false, true);
                }
            }
        }

        /* synthetic */ C8154d(C8150n2 n2Var, C8151a aVar) {
            this();
        }
    }

    /* renamed from: A3 */
    private void m44911A3() {
        if (this.f34307l0 == null) {
            m44928w3(this.f34311p0);
        }
        m44923q3(this.f34311p0);
    }

    /* renamed from: C3 */
    private void m44912C3() {
        Fragment p0 = mo3690p0();
        if (p0 instanceof C8158o2) {
            ((C8158o2) p0).mo29803C3(1);
        }
    }

    /* renamed from: D3 */
    private void m44913D3(int i) {
        if (this.f34308m0 != null) {
            this.f34311p0 = i;
            C8337n.m46065k0(mo3606L()).mo30265v1(this.f34311p0);
            m44928w3(this.f34311p0);
            m44923q3(this.f34311p0);
            return;
        }
        mo29793h3(false, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public void m44914E3(List<Album> list) {
        if (list == null || list.size() < 0) {
            List<Album> list2 = this.f34308m0;
            if (list2 != null) {
                list2.clear();
                BaseQuickAdapter baseQuickAdapter = this.f34307l0;
                if (baseQuickAdapter != null) {
                    baseQuickAdapter.notifyDataSetChanged();
                }
            }
            mo29791B3(true);
        } else if (list.size() > 0) {
            List<Album> list3 = this.f34308m0;
            if (list3 != null) {
                list3.clear();
                this.f34308m0.addAll(list);
            } else {
                this.f34308m0 = list;
            }
            m44912C3();
            m44911A3();
            mo29791B3(false);
        } else {
            List<Album> list4 = this.f34308m0;
            if (list4 != null) {
                list4.clear();
                BaseQuickAdapter baseQuickAdapter2 = this.f34307l0;
                if (baseQuickAdapter2 != null) {
                    baseQuickAdapter2.notifyDataSetChanged();
                }
            }
            mo29791B3(true);
        }
    }

    /* renamed from: q3 */
    private void m44923q3(int i) {
        BaseQuickAdapter baseQuickAdapter;
        if (this.f34305j0 != null && (baseQuickAdapter = this.f34307l0) != null) {
            baseQuickAdapter.setOnItemClickListener(this.f34315t0);
            this.f34307l0.setOnItemChildClickListener(this.f34316u0);
            this.f34305j0.setAdapter(this.f34307l0);
            if (i == 1) {
                this.f34305j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34305j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34305j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34305j0.mo4596e1(i2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: r3 */
    private void m44924r3() {
        this.f34312q0 = mo3638V().getLong("artist_id", -1);
    }

    /* renamed from: s3 */
    private void m44925s3() {
        if (!this.f33734d0) {
            mo29793h3(false, false);
        }
    }

    /* renamed from: t3 */
    private void m44926t3() {
        this.f34310o0 = new C8154d(this, (C8151a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.album_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.artist_album_detail_delete_notify_action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action");
        mo3606L().registerReceiver(this.f34310o0, intentFilter);
    }

    /* renamed from: u3 */
    private void m44927u3() {
        View view = this.f34304i0;
        if (view != null) {
            this.f34314s0 = (RelativeLayout) view.findViewById(R.id.rl_no);
            ((ImageView) this.f34304i0.findViewById(R.id.iv_no)).setImageDrawable(C8343s.m46303k(R.drawable.ic_lists_no_song, R.color.colorAccent));
            TextView textView = (TextView) this.f34304i0.findViewById(R.id.tv_no);
            textView.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
            textView.setText(C8345u.m46333n(R.string.music_eq_tab_album_no_artist));
            this.f34305j0 = (RecyclerView) this.f34304i0.findViewById(R.id.recyclerView);
            this.f34306k0 = (ProgressBar) this.f34304i0.findViewById(R.id.progressbar);
        }
    }

    /* renamed from: w3 */
    private void m44928w3(int i) {
        this.f34307l0 = null;
        int i2 = R.layout.item_default_grid;
        if (i != 0 && i == 1) {
            i2 = R.layout.item_default;
        }
        AlbumAdapter albumAdapter = new AlbumAdapter(i2, this.f34308m0, i, 0);
        this.f34307l0 = albumAdapter;
        albumAdapter.openLoadAnimation(2);
        this.f34307l0.isFirstOnly(false);
        this.f34307l0.setHasStableIds(true);
    }

    /* renamed from: x3 */
    public static Fragment m44929x3(long j) {
        C8150n2 n2Var = new C8150n2();
        Bundle bundle = new Bundle();
        bundle.putLong("artist_id", j);
        n2Var.mo3581C2(bundle);
        return n2Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m44930y3(int i) {
        C8216w2.m45357a(mo3606L(), (C8133l2) null, this.f34308m0.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public void m44931z3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (baseQuickAdapter.getItem(i) != null) {
            if (this.f34313r0 == null) {
                C7209h0 h0Var = new C7209h0(mo3606L(), 3, 0);
                this.f34313r0 = h0Var;
                h0Var.mo27759j(this);
                this.f34313r0.mo27741J(this);
            }
            Album album = (Album) baseQuickAdapter.getItem(i);
            if (album != null) {
                this.f34313r0.mo27740H(i, album);
                this.f34313r0.mo27743k(view);
            }
        }
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: B3 */
    public void mo29791B3(boolean z) {
        RelativeLayout relativeLayout = this.f34314s0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        C8153c cVar = this.f34309n0;
        if (cVar != null) {
            cVar.cancel(true);
            this.f34309n0 = null;
        }
        if (this.f34310o0 != null) {
            mo3606L().unregisterReceiver(this.f34310o0);
            this.f34310o0 = null;
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45976e(mo3606L(), i, j, i2, str);
    }

    /* renamed from: F3 */
    public void mo29792F3(int i) {
        if (this.f34307l0 != null && this.f34305j0 != null && i != this.f34311p0) {
            m44913D3(i);
        }
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
        return C8150n2.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29793h3(false, true);
        if (mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.artist_track_detail_delete_notify_action"));
        }
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
        }
    }

    /* renamed from: h3 */
    public void mo29793h3(boolean z, boolean z2) {
        C8153c cVar = this.f34309n0;
        if (cVar != null && cVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34309n0.cancel(true);
            this.f34309n0 = null;
        }
        C8153c cVar2 = new C8153c(this, z, z2);
        this.f34309n0 = cVar2;
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

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34304i0 = layoutInflater.inflate(R.layout.fragment_artist_albums, (ViewGroup) null);
        m44924r3();
        m44926t3();
        this.f34311p0 = C8337n.m46065k0(mo3606L()).mo30188c();
        mo29794v3();
        return this.f34304i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34307l0, i, j);
    }

    /* renamed from: v3 */
    public void mo29794v3() {
        m44927u3();
        m44925s3();
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
