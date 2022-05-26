package p342g.p343a.p344a.p349f.p351c;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Album;
import com.coocent.music.base.data.entity.Artist;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.adapter.ArtistAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.p275k.C7213i0;
import coocent.music.player.widget.p275k.C7245q0;
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
import p342g.p343a.p344a.p356h.p357g.C8307a;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.p2 */
/* compiled from: ArtistFragment2 */
public class C8167p2 extends C8010a implements C7324c, C7963p {

    /* renamed from: i0 */
    private View f34357i0;

    /* renamed from: j0 */
    RecyclerView f34358j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public ArtistAdapter f34359k0;

    /* renamed from: l0 */
    private List<Artist> f34360l0;

    /* renamed from: m0 */
    private C8169b f34361m0;

    /* renamed from: n0 */
    private C8170c f34362n0;

    /* renamed from: o0 */
    private int f34363o0 = -1;

    /* renamed from: p0 */
    private int f34364p0 = 0;

    /* renamed from: q0 */
    private C7213i0 f34365q0;

    /* renamed from: r0 */
    private View f34366r0;

    /* renamed from: s0 */
    TextView f34367s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public int f34368t0;

    /* renamed from: u0 */
    private RelativeLayout f34369u0;

    /* renamed from: v0 */
    private C7245q0 f34370v0;
    @SuppressLint({"NonConstantResourceId"})

    /* renamed from: w0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34371w0 = new C8228y(this);

    /* renamed from: g.a.a.f.c.p2$b */
    /* compiled from: ArtistFragment2 */
    private static class C8169b extends AsyncTask<Void, Void, List<Artist>> {

        /* renamed from: a */
        private final WeakReference<C8167p2> f34372a;

        public C8169b(C8167p2 p2Var, boolean z) {
            this.f34372a = new WeakReference<>(p2Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Artist> doInBackground(Void... voidArr) {
            C8167p2 p2Var = (C8167p2) this.f34372a.get();
            ArrayList arrayList = new ArrayList();
            if (p2Var == null) {
                return arrayList;
            }
            if (p2Var.f34368t0 == 0) {
                List<Artist> s = C4477c.m19643s(C8345u.m46327h());
                p2Var.mo29546X2(s);
                return s;
            } else if (p2Var.f34368t0 == 1) {
                return C4477c.m19651w(C8345u.m46327h());
            } else {
                String str = BaseApplication.f31146j;
                if (str == null || str.isEmpty()) {
                    return null;
                }
                return C4477c.m19563B(C8345u.m46327h(), BaseApplication.f31146j);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Artist> list) {
            C8167p2 p2Var;
            super.onPostExecute(list);
            if (!isCancelled() && (p2Var = (C8167p2) this.f34372a.get()) != null) {
                boolean unused = p2Var.f33734d0 = true;
                p2Var.m45042U3(list);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: g.a.a.f.c.p2$c */
    /* compiled from: ArtistFragment2 */
    private class C8170c extends BroadcastReceiver {
        private C8170c() {
        }

        public void onReceive(Context context, Intent intent) {
            int intExtra;
            if (intent == null) {
                return;
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.artist_artwork_item_notify") || intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.album_artwork_item_notify")) {
                if (C8167p2.this.f34359k0 != null && (intExtra = intent.getIntExtra("artwork_position", -1)) >= 0) {
                    C8167p2.this.f34359k0.notifyItemChanged(intExtra + C8167p2.this.f34359k0.getHeaderLayoutCount());
                }
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action")) {
                if (C8167p2.this.f34359k0 != null) {
                    C8167p2 p2Var = C8167p2.this;
                    if (p2Var.f34358j0 != null) {
                        boolean unused = p2Var.f33734d0 = false;
                        C8167p2.this.mo29818h3(true);
                    }
                }
            } else if ("2search_update".equals(intent.getAction())) {
                C8167p2.this.mo29818h3(false);
            } else if ("media.musicplayer.audioplayer.videoplayer.detail_update_page".equals(intent.getAction())) {
                C8167p2.this.mo29818h3(false);
            } else if ("media.musicplayer.audioplayer.videoplayer.artist_list_favorite_change".equals(intent.getAction())) {
                C8167p2.this.m45052r3(intent);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void mo29812C3(View view, View view2) {
        if (this.f34370v0 == null) {
            this.f34370v0 = new C7245q0(mo3606L(), 1);
        }
        this.f34370v0.mo27759j(this);
        this.f34370v0.mo27743k(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void mo29813E3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int id = view.getId();
        if (id == R.id.album_popup_menu) {
            m45034L3(baseQuickAdapter, view, i);
        } else if (id == R.id.artist_popup_menu || id == R.id.popup_menu) {
            m45035M3(baseQuickAdapter, view, i);
        }
        m45051q3();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ boolean mo29814G3(View view, MotionEvent motionEvent) {
        m45051q3();
        return false;
    }

    /* renamed from: I3 */
    private void m45031I3(int i) {
        this.f34359k0 = null;
        int i2 = R.layout.item_default_grid;
        if (i != 0 && i == 1) {
            i2 = R.layout.item_default;
        }
        ArtistAdapter artistAdapter = new ArtistAdapter(i2, this.f34360l0, i, this.f34368t0);
        this.f34359k0 = artistAdapter;
        artistAdapter.setHasStableIds(true);
        ViewParent parent = this.f34366r0.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        if (this.f34359k0.getHeaderLayoutCount() == 0) {
            this.f34359k0.addHeaderView(this.f34366r0);
        }
    }

    /* renamed from: J3 */
    public static C8167p2 m45032J3(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("pageType", i);
        C8167p2 p2Var = new C8167p2();
        p2Var.mo3581C2(bundle);
        return p2Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public void m45058x3(Artist artist, int i) {
        if (artist != null) {
            C8216w2.m45358b(mo3606L(), artist, i);
            if (this.f34368t0 != 1) {
                FragmentActivity L = mo3606L();
                if (L instanceof LibraryActivity) {
                    LibraryActivity libraryActivity = (LibraryActivity) L;
                    libraryActivity.mo26648K4();
                    libraryActivity.mo26681s3();
                }
            }
        }
    }

    /* renamed from: L3 */
    private void m45034L3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (baseQuickAdapter.getItem(i) != null) {
            C8307a aVar = new C8307a(mo3606L(), 3);
            this.f34363o0 = 3;
            aVar.mo30041f0(((Album) baseQuickAdapter.getItem(i)).mo9139f(), i, ((Album) baseQuickAdapter.getItem(i)).mo9141h());
            aVar.mo30042g0(this);
            aVar.mo30013U(view);
        }
    }

    /* renamed from: M3 */
    private void m45035M3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        List<Artist> list = this.f34360l0;
        if (list != null && list.size() > 0) {
            this.f34363o0 = 2;
            if (this.f34365q0 == null) {
                C7213i0 i0Var = new C7213i0(mo3606L(), 2, this.f34368t0);
                this.f34365q0 = i0Var;
                i0Var.mo27759j(this);
                this.f34365q0.mo27752K(this);
            }
            Artist artist = (Artist) baseQuickAdapter.getItem(i);
            if (artist != null) {
                this.f34365q0.mo27751I(i, artist);
                this.f34365q0.mo27743k(view);
            }
        }
    }

    /* renamed from: N3 */
    private void m45036N3() {
        m45031I3(this.f34364p0);
        m45050p3(this.f34364p0);
    }

    /* renamed from: O3 */
    private void m45037O3() {
        List<Artist> list = this.f34360l0;
        if (list != null) {
            list.clear();
            ArtistAdapter artistAdapter = this.f34359k0;
            if (artistAdapter != null) {
                artistAdapter.notifyDataSetChanged();
            }
        }
        mo29816P3(true);
    }

    /* renamed from: Q3 */
    private void m45038Q3(List<Artist> list) {
        List<Artist> list2 = this.f34360l0;
        if (list2 != null) {
            list2.clear();
            this.f34360l0.addAll(list);
        } else {
            this.f34360l0 = list;
        }
        m45039R3();
        m45036N3();
        mo29816P3(false);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: R3 */
    private void m45039R3() {
        int i;
        TextView textView = this.f34367s0;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C8345u.m46333n(R.string.music_eq_artists));
            sb.append(" (");
            List<Artist> list = this.f34360l0;
            if (list == null) {
                i = 0;
            } else {
                i = list.size() - mo29547Z2(this.f34360l0.size());
            }
            sb.append(i);
            sb.append(")");
            textView.setText(sb.toString());
        }
    }

    /* renamed from: S3 */
    private void m45040S3(int i) {
        if (this.f34360l0 != null) {
            this.f34364p0 = i;
            C8337n.m46065k0(mo3606L()).mo30269w1(this.f34364p0);
            m45031I3(this.f34364p0);
            m45050p3(this.f34364p0);
            return;
        }
        mo29818h3(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: T3 */
    private void m45041T3() {
        if (this.f34368t0 == 2) {
            this.f34358j0.setOnTouchListener(new C8206v(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public void m45042U3(List<Artist> list) {
        if (list == null) {
            m45037O3();
        } else if (list.size() <= 0) {
            m45037O3();
        } else if (list.size() != 1) {
            m45038Q3(list);
        } else if (list.get(0).mo9261a() == 6) {
            m45037O3();
        } else {
            m45038Q3(list);
        }
    }

    /* renamed from: p3 */
    private void m45050p3(int i) {
        ArtistAdapter artistAdapter;
        if (this.f34358j0 != null && (artistAdapter = this.f34359k0) != null) {
            artistAdapter.setOnItemChildClickListener(this.f34371w0);
            this.f34359k0.setOnItemClickListener(new C8236z(this));
            this.f34358j0.setAdapter(this.f34359k0);
            if (i == 1) {
                this.f34358j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34358j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34358j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34358j0.mo4596e1(i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: q3 */
    private void m45051q3() {
        FragmentActivity L;
        if (this.f34368t0 == 2 && (L = mo3606L()) != null) {
            C8345u.m46322c(L);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public void m45052r3(Intent intent) {
        int intExtra;
        ArtistAdapter artistAdapter;
        if (this.f34368t0 == 1 && (intExtra = intent.getIntExtra("position", -1)) >= 0 && (artistAdapter = this.f34359k0) != null) {
            artistAdapter.remove(intExtra);
            if (this.f34359k0.getData().size() == 0) {
                m45037O3();
            }
        }
    }

    /* renamed from: s3 */
    private void m45053s3() {
        Bundle V = mo3638V();
        if (V != null) {
            this.f34368t0 = V.getInt("pageType", 0);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: t3 */
    private View m45054t3() {
        View inflate = mo3676k0().inflate(R.layout.head_view_default, (ViewGroup) this.f34358j0.getParent(), false);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.default_header);
        if (this.f34368t0 == 2) {
            relativeLayout.setVisibility(8);
        }
        this.f34367s0 = (TextView) inflate.findViewById(R.id.tv_title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.sortOption);
        imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_home02_sort, R.color.default_text_color));
        this.f34367s0.setTextColor(C8343s.m46295c(R.color.default_text_color));
        m45039R3();
        imageView.setOnClickListener(new C8217x(this, inflate));
        return inflate;
    }

    /* renamed from: u3 */
    private void m45055u3() {
        mo29818h3(true);
    }

    /* renamed from: v3 */
    private void m45056v3() {
        this.f34362n0 = new C8170c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.artist_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.artist_list_favorite_change");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.album_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action");
        intentFilter.addAction("2search_update");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.detail_update_page");
        mo3606L().registerReceiver(this.f34362n0, intentFilter);
    }

    /* renamed from: w3 */
    private void m45057w3() {
        this.f34358j0 = (RecyclerView) this.f34357i0.findViewById(R.id.recyclerView);
        this.f34369u0 = (RelativeLayout) this.f34357i0.findViewById(R.id.rl_no);
        ((ImageView) this.f34357i0.findViewById(R.id.iv_no)).setImageDrawable(C8343s.m46303k(R.drawable.ic_lists_no_song, R.color.colorAccent));
        TextView textView = (TextView) this.f34357i0.findViewById(R.id.tv_no);
        textView.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        textView.setText(C8345u.m46333n(R.string.music_eq_tab_artist_no_artist));
        ProgressBar progressBar = (ProgressBar) this.f34357i0.findViewById(R.id.progressbar);
        m45053s3();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void mo29811A3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Artist artist = (Artist) baseQuickAdapter.getData().get(i);
        if (!AdHelper.m49536p().mo32459v(mo3606L(), new C8213w(this, artist, i))) {
            m45058x3(artist, i);
        }
        m45051q3();
    }

    /* renamed from: A0 */
    public void mo26500A0() {
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
        C8169b bVar = this.f34361m0;
        if (bVar != null) {
            bVar.cancel(true);
            this.f34361m0 = null;
        }
        if (this.f34362n0 != null) {
            mo3606L().unregisterReceiver(this.f34362n0);
            this.f34362n0 = null;
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45976e(mo3606L(), i, j, i2, str);
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: H3 */
    public void mo29815H3() {
        if (this.f34357i0 != null) {
            m45057w3();
            m45041T3();
            m45055u3();
        }
    }

    /* renamed from: P3 */
    public void mo29816P3(boolean z) {
        RelativeLayout relativeLayout = this.f34369u0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
        ArtistAdapter artistAdapter = this.f34359k0;
        if (artistAdapter != null && z) {
            artistAdapter.removeAllHeaderView();
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

    /* renamed from: V3 */
    public void mo29817V3(int i) {
        if (this.f34359k0 != null && this.f34358j0 != null && i != this.f34364p0) {
            m45040S3(i);
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
        return C8167p2.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29818h3(true);
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page").setPackage(C8345u.m46327h().getPackageName()));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification").setPackage(C8345u.m46327h().getPackageName()));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget").setPackage(C8345u.m46327h().getPackageName()));
        }
    }

    /* renamed from: h3 */
    public void mo29818h3(boolean z) {
        C8169b bVar = this.f34361m0;
        if (bVar != null && bVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34361m0.cancel(true);
            this.f34361m0 = null;
        }
        C8169b bVar2 = new C8169b(this, z);
        this.f34361m0 = bVar2;
        bVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
    }

    /* renamed from: i1 */
    public void mo26514i1() {
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26514i1();
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
    }

    /* renamed from: r */
    public void mo28063r(long j, int i) {
        C8314f.m45974c(mo3606L(), j, i, this.f34363o0);
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34364p0 = C8337n.m46065k0(mo3606L()).mo30192d();
        this.f34357i0 = layoutInflater.inflate(R.layout.recyclerview, (ViewGroup) null);
        mo29815H3();
        m45056v3();
        this.f34366r0 = m45054t3();
        return this.f34357i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34359k0, i, j);
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
