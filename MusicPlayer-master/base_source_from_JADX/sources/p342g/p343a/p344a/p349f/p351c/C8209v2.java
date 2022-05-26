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
import com.coocent.music.base.data.entity.Folder;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.adapter.FolderAdapter;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.p275k.C7221k0;
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
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8315g;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.v2 */
/* compiled from: FolderFragment */
public class C8209v2 extends C8010a implements C7324c, C7963p {

    /* renamed from: i0 */
    private View f34468i0;

    /* renamed from: j0 */
    RecyclerView f34469j0;

    /* renamed from: k0 */
    ProgressBar f34470k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public BaseQuickAdapter f34471l0;

    /* renamed from: m0 */
    private List<Folder> f34472m0;

    /* renamed from: n0 */
    private C8211b f34473n0;

    /* renamed from: o0 */
    private C8212c f34474o0;

    /* renamed from: p0 */
    private int f34475p0 = 0;

    /* renamed from: q0 */
    private C7221k0 f34476q0;

    /* renamed from: r0 */
    private View f34477r0;

    /* renamed from: s0 */
    TextView f34478s0;

    /* renamed from: t0 */
    private RelativeLayout f34479t0;

    /* renamed from: u0 */
    private C7245q0 f34480u0;

    /* renamed from: v0 */
    private final BaseQuickAdapter.OnItemClickListener f34481v0 = new C8156o0(this);

    /* renamed from: w0 */
    private final BaseQuickAdapter.OnItemChildClickListener f34482w0 = new C8148n0(this);

    /* renamed from: g.a.a.f.c.v2$b */
    /* compiled from: FolderFragment */
    private static class C8211b extends AsyncTask<Void, Void, List<Folder>> {

        /* renamed from: a */
        boolean f34483a;

        /* renamed from: b */
        WeakReference<C8209v2> f34484b;

        public C8211b(C8209v2 v2Var, boolean z) {
            this.f34483a = z;
            this.f34484b = new WeakReference<>(v2Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Folder> doInBackground(Void... voidArr) {
            C8209v2 v2Var = (C8209v2) this.f34484b.get();
            List<Folder> list = null;
            if (v2Var == null) {
                return null;
            }
            try {
                list = C4477c.m19573G(C8345u.m46327h());
                v2Var.mo29546X2(list);
                return list;
            } catch (Exception e) {
                e.printStackTrace();
                return list;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<Folder> list) {
            C8209v2 v2Var;
            super.onPostExecute(list);
            if (!isCancelled() && (v2Var = (C8209v2) this.f34484b.get()) != null) {
                ProgressBar progressBar = v2Var.f34470k0;
                if (progressBar != null && this.f34483a) {
                    progressBar.setVisibility(8);
                }
                boolean unused = v2Var.f33734d0 = true;
                v2Var.m45306K3(list);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ProgressBar progressBar;
            super.onPreExecute();
            C8209v2 v2Var = (C8209v2) this.f34484b.get();
            if (v2Var != null && (progressBar = v2Var.f34470k0) != null && this.f34483a) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* renamed from: g.a.a.f.c.v2$c */
    /* compiled from: FolderFragment */
    private class C8212c extends BroadcastReceiver {
        private C8212c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(C8311c.f34735b)) {
                C8209v2.this.mo29887h3(false);
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action") && C8209v2.this.f34471l0 != null) {
                C8209v2 v2Var = C8209v2.this;
                if (v2Var.f34469j0 != null) {
                    boolean unused = v2Var.f33734d0 = false;
                    C8209v2.this.mo29887h3(false);
                }
            }
        }
    }

    /* renamed from: B3 */
    private void m45298B3(int i) {
        this.f34471l0 = null;
        int i2 = R.layout.item_default_grid;
        if (i != 0 && i == 1) {
            i2 = R.layout.item_default;
        }
        FolderAdapter folderAdapter = new FolderAdapter(i2, this.f34472m0, i);
        this.f34471l0 = folderAdapter;
        folderAdapter.isFirstOnly(false);
        this.f34471l0.setHasStableIds(true);
        ViewParent parent = this.f34477r0.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        if (this.f34471l0.getHeaderLayoutCount() == 0) {
            this.f34471l0.addHeaderView(this.f34477r0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public void m45318u3(int i) {
        C8216w2.m45360d(mo3606L(), (C8200u2) null, this.f34472m0.get(i).mo9177f(), C8345u.m46334o(this.f34472m0.get(i).mo9175e()), false);
        FragmentActivity L = mo3606L();
        if (L instanceof LibraryActivity) {
            LibraryActivity libraryActivity = (LibraryActivity) L;
            libraryActivity.mo26648K4();
            libraryActivity.mo26681s3();
        }
    }

    /* renamed from: D3 */
    private void m45300D3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (baseQuickAdapter.getItem(i) != null) {
            if (this.f34476q0 == null) {
                C7221k0 k0Var = new C7221k0(mo3606L());
                this.f34476q0 = k0Var;
                k0Var.mo27759j(this);
                this.f34476q0.mo27768y(this);
            }
            Folder folder = (Folder) baseQuickAdapter.getItem(i);
            if (folder != null) {
                this.f34476q0.mo27767w(folder);
                this.f34476q0.mo27743k(view);
            }
        }
    }

    /* renamed from: E3 */
    private void m45301E3() {
        m45298B3(this.f34475p0);
        m45312n3(this.f34475p0);
    }

    /* renamed from: F3 */
    private void m45302F3() {
        List<Folder> list = this.f34472m0;
        if (list != null) {
            list.clear();
            BaseQuickAdapter baseQuickAdapter = this.f34471l0;
            if (baseQuickAdapter != null) {
                baseQuickAdapter.notifyDataSetChanged();
            }
        }
        mo29885G3(true);
    }

    /* renamed from: H3 */
    private void m45303H3(List<Folder> list) {
        List<Folder> list2 = this.f34472m0;
        if (list2 != null) {
            list2.clear();
            this.f34472m0.addAll(list);
        } else {
            this.f34472m0 = list;
        }
        m45304I3();
        m45301E3();
        mo29885G3(false);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: I3 */
    private void m45304I3() {
        int i;
        TextView textView = this.f34478s0;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C8345u.m46333n(R.string.folder2));
            sb.append(" (");
            List<Folder> list = this.f34472m0;
            if (list == null) {
                i = 0;
            } else {
                i = list.size() - mo29547Z2(this.f34472m0.size());
            }
            sb.append(i);
            sb.append(")");
            textView.setText(sb.toString());
        }
    }

    /* renamed from: J3 */
    private void m45305J3(int i) {
        if (this.f34472m0 != null) {
            this.f34475p0 = i;
            C8337n.m46065k0(mo3606L()).mo30181a2(this.f34475p0);
            m45298B3(this.f34475p0);
            m45312n3(this.f34475p0);
            return;
        }
        mo29887h3(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public void m45306K3(List<Folder> list) {
        if (list == null) {
            m45302F3();
        } else if (list.size() <= 0) {
            m45302F3();
        } else if (list.size() != 1) {
            m45303H3(list);
        } else if (list.get(0).mo9261a() == 6) {
            m45302F3();
        } else {
            m45303H3(list);
        }
    }

    /* renamed from: n3 */
    private void m45312n3(int i) {
        BaseQuickAdapter baseQuickAdapter;
        if (this.f34469j0 != null && (baseQuickAdapter = this.f34471l0) != null) {
            baseQuickAdapter.setOnItemClickListener(this.f34481v0);
            this.f34471l0.setOnItemChildClickListener(this.f34482w0);
            this.f34469j0.setAdapter(this.f34471l0);
            if (i == 1) {
                this.f34469j0.setLayoutManager(new LinearLayoutManager(mo3606L()));
                return;
            }
            this.f34469j0.setLayoutManager(new GridLayoutManager(mo3606L(), 2));
            try {
                int itemDecorationCount = this.f34469j0.getItemDecorationCount();
                for (int i2 = 0; i2 < itemDecorationCount; i2++) {
                    this.f34469j0.mo4596e1(i2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: o3 */
    private View m45313o3() {
        View inflate = mo3676k0().inflate(R.layout.head_view_default, (ViewGroup) this.f34469j0.getParent(), false);
        this.f34478s0 = (TextView) inflate.findViewById(R.id.tv_title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.sortOption);
        imageView.setImageDrawable(C8343s.m46298f(R.drawable.ic_home02_sort));
        this.f34478s0.setTextColor(C8343s.m46295c(R.color.default_text_color));
        m45304I3();
        imageView.setOnClickListener(new C8165p0(this, inflate));
        return inflate;
    }

    /* renamed from: p3 */
    private void m45314p3() {
        mo29887h3(true);
    }

    /* renamed from: q3 */
    private void m45315q3() {
        this.f34474o0 = new C8212c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C8311c.f34735b);
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action");
        mo3606L().registerReceiver(this.f34474o0, intentFilter);
    }

    /* renamed from: r3 */
    private void m45316r3() {
        View view = this.f34468i0;
        if (view != null) {
            this.f34479t0 = (RelativeLayout) view.findViewById(R.id.rl_no);
            TextView textView = (TextView) this.f34468i0.findViewById(R.id.tv_no);
            textView.setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
            textView.setText(C8345u.m46333n(R.string.music_eq_lbl_no_folders));
            ((ImageView) this.f34468i0.findViewById(R.id.iv_no)).setImageDrawable(C8343s.m46303k(R.drawable.ic_lists_no_song, R.color.colorAccent));
            this.f34469j0 = (RecyclerView) this.f34468i0.findViewById(R.id.recyclerView);
            this.f34470k0 = (ProgressBar) this.f34468i0.findViewById(R.id.progressbar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void mo29888t3(View view, View view2) {
        if (this.f34480u0 == null) {
            this.f34480u0 = new C7245q0(mo3606L(), 4);
        }
        this.f34480u0.mo27759j(this);
        this.f34480u0.mo27743k(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void mo29890x3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (!C8315g.m45979a() && !AdHelper.m49536p().mo32459v(mo3606L(), new C8172q0(this, i))) {
            m45318u3(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void mo29891z3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (view.getId() == R.id.popup_menu) {
            m45300D3(baseQuickAdapter, view, i);
        }
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: A3 */
    public void mo29884A3() {
        m45316r3();
        m45314p3();
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        C8211b bVar = this.f34473n0;
        if (bVar != null) {
            bVar.cancel(true);
            this.f34473n0 = null;
        }
        if (this.f34474o0 != null) {
            mo3606L().unregisterReceiver(this.f34474o0);
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: G3 */
    public void mo29885G3(boolean z) {
        RelativeLayout relativeLayout = this.f34479t0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: L3 */
    public void mo29886L3(int i) {
        if (this.f34471l0 != null && this.f34469j0 != null && i != this.f34475p0) {
            m45305J3(i);
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
        LibraryActivity libraryActivity = (LibraryActivity) mo3606L();
        if (libraryActivity != null) {
            libraryActivity.mo26509W0();
        }
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8209v2.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        mo29887h3(true);
    }

    /* renamed from: h3 */
    public void mo29887h3(boolean z) {
        C8211b bVar = this.f34473n0;
        if (bVar != null && bVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34473n0.cancel(true);
            this.f34473n0 = null;
        }
        C8211b bVar2 = new C8211b(this, z);
        this.f34473n0 = bVar2;
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
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34475p0 = C8337n.m46065k0(mo3606L()).mo30184b0();
        this.f34468i0 = layoutInflater.inflate(R.layout.recyclerview, (ViewGroup) null);
        mo29884A3();
        m45315q3();
        this.f34477r0 = m45313o3();
        return this.f34468i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
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
