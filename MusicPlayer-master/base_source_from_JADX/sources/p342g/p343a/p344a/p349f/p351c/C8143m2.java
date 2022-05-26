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
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.adapter.AlbumAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.p275k.C7209h0;
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
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8315g;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.m2 */
/* compiled from: AlbumFragment */
public class C8143m2 extends C8010a implements C7324c, C7963p {

    /* renamed from: i0 */
    private View f34283i0;

    /* renamed from: j0 */
    RecyclerView f34284j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public BaseQuickAdapter f34285k0;

    /* renamed from: l0 */
    private List<Album> f34286l0;

    /* renamed from: m0 */
    private C8145b f34287m0;

    /* renamed from: n0 */
    private C8146c f34288n0;

    /* renamed from: o0 */
    private int f34289o0 = 0;

    /* renamed from: p0 */
    private C7209h0 f34290p0;

    /* renamed from: q0 */
    private View f34291q0;

    /* renamed from: r0 */
    TextView f34292r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public int f34293s0;

    /* renamed from: t0 */
    private RelativeLayout f34294t0;

    /* renamed from: u0 */
    private C7245q0 f34295u0;

    /* renamed from: v0 */
    private final BaseQuickAdapter.OnItemClickListener f34296v0 = new C8164p(this);

    /* renamed from: w0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34297w0 = new C8155o(this);

    /* renamed from: g.a.a.f.c.m2$b */
    /* compiled from: AlbumFragment */
    private static class C8145b extends AsyncTask<Void, Void, List<Album>> {

        /* renamed from: a */
        private final WeakReference<C8143m2> f34298a;

        public C8145b(C8143m2 m2Var, boolean z) {
            this.f34298a = new WeakReference<>(m2Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Album> doInBackground(Void... voidArr) {
            String str;
            C8143m2 m2Var = (C8143m2) this.f34298a.get();
            if (m2Var != null) {
                if (m2Var.f34293s0 == 0) {
                    List<Album> n = C4477c.m19633n(C8345u.m46327h());
                    m2Var.mo29546X2(n);
                    return n;
                } else if (m2Var.f34293s0 == 1) {
                    return C4477c.m19649v(C8345u.m46327h());
                } else {
                    if (m2Var.f34293s0 == 2 && (str = BaseApplication.f31146j) != null && !str.isEmpty()) {
                        return C4477c.m19561A(C8345u.m46327h(), BaseApplication.f31146j);
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Album> list) {
            C8143m2 m2Var;
            super.onPostExecute(list);
            if (!isCancelled() && (m2Var = (C8143m2) this.f34298a.get()) != null) {
                boolean unused = m2Var.f33734d0 = true;
                m2Var.m44856T3(list);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: g.a.a.f.c.m2$c */
    /* compiled from: AlbumFragment */
    private class C8146c extends BroadcastReceiver {
        private C8146c() {
        }

        public void onReceive(Context context, Intent intent) {
            int intExtra;
            if (intent == null) {
                return;
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.album_artwork_item_notify")) {
                if (C8143m2.this.f34285k0 != null && (intExtra = intent.getIntExtra("artwork_position", -1)) >= 0) {
                    C8143m2.this.f34285k0.notifyItemChanged(intExtra + C8143m2.this.f34285k0.getHeaderLayoutCount());
                }
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action")) {
                if (C8143m2.this.f34285k0 != null) {
                    C8143m2 m2Var = C8143m2.this;
                    if (m2Var.f34284j0 != null) {
                        boolean unused = m2Var.f33734d0 = false;
                        C8143m2.this.mo29782h3(true);
                    }
                }
            } else if ("2search_update".equals(intent.getAction())) {
                C8143m2.this.mo29782h3(false);
            } else if ("media.musicplayer.audioplayer.videoplayer.detail_update_page".equals(intent.getAction())) {
                C8143m2.this.mo29782h3(false);
            } else if ("media.musicplayer.audioplayer.videoplayer.album_list_favorite_change".equals(intent.getAction())) {
                C8143m2.this.m44866r3(intent);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void mo29776C3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (!C8315g.m45979a() && !AdHelper.m49536p().mo32459v(mo3606L(), new C8147n(this, i))) {
            m44873z3(i);
        }
        m44865q3();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void mo29777E3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (view.getId() == R.id.popup_menu) {
            m44849L3(baseQuickAdapter, view, i);
        }
        m44865q3();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ boolean mo29778G3(View view, MotionEvent motionEvent) {
        m44865q3();
        return false;
    }

    /* renamed from: I3 */
    private void m44846I3(int i) {
        this.f34285k0 = null;
        int i2 = R.layout.item_default_grid;
        if (i != 0 && i == 1) {
            i2 = R.layout.item_default;
        }
        AlbumAdapter albumAdapter = new AlbumAdapter(i2, this.f34286l0, i, this.f34293s0);
        this.f34285k0 = albumAdapter;
        albumAdapter.isFirstOnly(false);
        this.f34285k0.setHasStableIds(true);
        ViewParent parent = this.f34291q0.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        if (this.f34285k0.getHeaderLayoutCount() == 0) {
            this.f34285k0.addHeaderView(this.f34291q0);
        }
    }

    /* renamed from: J3 */
    public static C8143m2 m44847J3(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("pageType", i);
        C8143m2 m2Var = new C8143m2();
        m2Var.mo3581C2(bundle);
        return m2Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public void m44873z3(int i) {
        if (this.f34293s0 != 1) {
            FragmentActivity L = mo3606L();
            if (L instanceof LibraryActivity) {
                LibraryActivity libraryActivity = (LibraryActivity) L;
                libraryActivity.mo26648K4();
                libraryActivity.mo26681s3();
            }
        }
        C8216w2.m45357a(mo3606L(), (C8133l2) null, this.f34286l0.get(i));
    }

    /* renamed from: L3 */
    private void m44849L3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (baseQuickAdapter.getItem(i) != null) {
            if (this.f34290p0 == null) {
                C7209h0 h0Var = new C7209h0(mo3606L(), 3, this.f34293s0);
                this.f34290p0 = h0Var;
                h0Var.mo27759j(this);
                this.f34290p0.mo27741J(this);
            }
            Album album = (Album) baseQuickAdapter.getItem(i);
            if (album != null) {
                this.f34290p0.mo27740H(i, album);
                this.f34290p0.mo27743k(view);
            }
        }
    }

    /* renamed from: M3 */
    private void m44850M3() {
        if (this.f34285k0 == null) {
            m44846I3(this.f34289o0);
        }
        m44864p3(this.f34289o0);
    }

    /* renamed from: N3 */
    private void m44851N3() {
        List<Album> list = this.f34286l0;
        if (list != null) {
            list.clear();
            BaseQuickAdapter baseQuickAdapter = this.f34285k0;
            if (baseQuickAdapter != null) {
                baseQuickAdapter.notifyDataSetChanged();
            }
        }
        mo29780O3(true);
    }

    /* renamed from: P3 */
    private void m44852P3(List<Album> list) {
        List<Album> list2 = this.f34286l0;
        if (list2 != null) {
            list2.clear();
            this.f34286l0.addAll(list);
        } else {
            this.f34286l0 = list;
        }
        m44853Q3();
        m44850M3();
        mo29780O3(false);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: Q3 */
    private void m44853Q3() {
        int i;
        TextView textView = this.f34292r0;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C8345u.m46333n(R.string.music_eq_albums));
            sb.append(" (");
            List<Album> list = this.f34286l0;
            if (list == null) {
                i = 0;
            } else {
                i = list.size() - mo29547Z2(this.f34286l0.size());
            }
            sb.append(i);
            sb.append(")");
            textView.setText(sb.toString());
        }
    }

    /* renamed from: R3 */
    private void m44854R3(int i) {
        if (this.f34286l0 != null) {
            this.f34289o0 = i;
            C8337n.m46065k0(mo3606L()).mo30257t1(this.f34289o0);
            m44846I3(this.f34289o0);
            m44864p3(this.f34289o0);
            return;
        }
        mo29782h3(true);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: S3 */
    private void m44855S3() {
        if (this.f34293s0 == 2) {
            this.f34284j0.setOnTouchListener(new C8180r(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public void m44856T3(List<Album> list) {
        if (list == null) {
            m44851N3();
        } else if (list.size() <= 0) {
            m44851N3();
        } else if (list.size() != 1) {
            m44852P3(list);
        } else if (list.get(0).mo9261a() == 6) {
            m44851N3();
        } else {
            m44852P3(list);
        }
    }

    /* renamed from: p3 */
    private void m44864p3(int i) {
        BaseQuickAdapter baseQuickAdapter;
        if (this.f34284j0 != null && (baseQuickAdapter = this.f34285k0) != null) {
            baseQuickAdapter.setOnItemClickListener(this.f34296v0);
            this.f34285k0.setOnItemChildClickListener(this.f34297w0);
            this.f34284j0.setAdapter(this.f34285k0);
            if (i == 1) {
                this.f34284j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34284j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34284j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34284j0.mo4596e1(i2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: q3 */
    private void m44865q3() {
        FragmentActivity L;
        if (this.f34293s0 == 2 && (L = mo3606L()) != null) {
            C8345u.m46322c(L);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public void m44866r3(Intent intent) {
        int intExtra;
        BaseQuickAdapter baseQuickAdapter;
        if (this.f34293s0 == 1 && (intExtra = intent.getIntExtra("position", -1)) >= 0 && (baseQuickAdapter = this.f34285k0) != null) {
            baseQuickAdapter.remove(intExtra);
            if (this.f34285k0.getData().size() == 0) {
                m44851N3();
            }
        }
    }

    /* renamed from: s3 */
    private void m44867s3() {
        Bundle V = mo3638V();
        if (V != null) {
            this.f34293s0 = V.getInt("pageType", 0);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: t3 */
    private View m44868t3() {
        View inflate = mo3676k0().inflate(R.layout.head_view_default, (ViewGroup) this.f34284j0.getParent(), false);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.default_header);
        if (this.f34293s0 == 2) {
            relativeLayout.setVisibility(8);
        }
        this.f34292r0 = (TextView) inflate.findViewById(R.id.tv_title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.sortOption);
        imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_home02_sort, R.color.default_text_color));
        this.f34292r0.setTextColor(C8343s.m46295c(R.color.default_text_color));
        m44853Q3();
        imageView.setOnClickListener(new C8171q(this, inflate));
        return inflate;
    }

    /* renamed from: u3 */
    private void m44869u3() {
        mo29782h3(true);
    }

    /* renamed from: v3 */
    private void m44870v3() {
        this.f34288n0 = new C8146c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.album_artwork_item_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action");
        intentFilter.addAction("2search_update");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.detail_update_page");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.album_list_favorite_change");
        mo3606L().registerReceiver(this.f34288n0, intentFilter);
    }

    /* renamed from: w3 */
    private void m44871w3() {
        View view = this.f34283i0;
        if (view != null) {
            this.f34294t0 = (RelativeLayout) view.findViewById(R.id.rl_no);
            ((ImageView) this.f34283i0.findViewById(R.id.iv_no)).setImageDrawable(C8343s.m46303k(R.drawable.ic_lists_no_song, R.color.colorAccent));
            TextView textView = (TextView) this.f34283i0.findViewById(R.id.tv_no);
            textView.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
            textView.setText(C8345u.m46333n(R.string.music_eq_tab_album_no_artist));
            this.f34284j0 = (RecyclerView) this.f34283i0.findViewById(R.id.recyclerView);
            ProgressBar progressBar = (ProgressBar) this.f34283i0.findViewById(R.id.progressbar);
        }
        m44867s3();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void mo29783y3(View view, View view2) {
        if (this.f34295u0 == null) {
            this.f34295u0 = new C7245q0(mo3606L(), 2);
        }
        this.f34295u0.mo27759j(this);
        this.f34295u0.mo27743k(view);
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
        C8145b bVar = this.f34287m0;
        if (bVar != null) {
            bVar.cancel(true);
            this.f34287m0 = null;
        }
        if (this.f34288n0 != null) {
            mo3606L().unregisterReceiver(this.f34288n0);
            this.f34288n0 = null;
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
    public void mo29779H3() {
        m44871w3();
        m44869u3();
        m44855S3();
    }

    /* renamed from: O3 */
    public void mo29780O3(boolean z) {
        RelativeLayout relativeLayout = this.f34294t0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
        BaseQuickAdapter baseQuickAdapter = this.f34285k0;
        if (baseQuickAdapter != null && z) {
            baseQuickAdapter.removeAllHeaderView();
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

    /* renamed from: U3 */
    public void mo29781U3(int i) {
        if (this.f34285k0 != null && this.f34284j0 != null && i != this.f34289o0) {
            m44854R3(i);
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
        return C8143m2.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29782h3(true);
        if (music != null && C8287e.m45873v() != null && mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
        }
    }

    /* renamed from: h3 */
    public void mo29782h3(boolean z) {
        C8145b bVar = this.f34287m0;
        if (bVar != null && bVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34287m0.cancel(true);
            this.f34287m0 = null;
        }
        C8145b bVar2 = new C8145b(this, z);
        this.f34287m0 = bVar2;
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
        this.f34289o0 = C8337n.m46065k0(mo3606L()).mo30183b();
        this.f34283i0 = layoutInflater.inflate(R.layout.recyclerview, (ViewGroup) null);
        mo29779H3();
        m44870v3();
        this.f34291q0 = m44868t3();
        return this.f34283i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        C8314f.m45978g(this.f34285k0, i, j);
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
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26520y1();
        }
    }
}
