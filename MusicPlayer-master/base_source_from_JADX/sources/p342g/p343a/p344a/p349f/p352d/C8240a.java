package p342g.p343a.p344a.p349f.p352d;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import coocent.music.player.adapter.SkinListAdapter;
import coocent.music.player.skin.net.C7114a;
import coocent.music.player.skin.net.MySkinEntity;
import coocent.music.player.skin.p272a.C7099a;
import coocent.music.player.widget.C7192i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8333k;
import p342g.p343a.p344a.p358i.C8334l;

/* renamed from: g.a.a.f.d.a */
/* compiled from: SkinFragment */
public class C8240a extends Fragment implements C7099a {

    /* renamed from: n0 */
    public static final String f34545n0 = C8240a.class.getSimpleName();

    /* renamed from: d0 */
    private int f34546d0 = 0;

    /* renamed from: e0 */
    private boolean f34547e0 = true;

    /* renamed from: f0 */
    private boolean f34548f0 = false;

    /* renamed from: g0 */
    private RecyclerView f34549g0;

    /* renamed from: h0 */
    private SkinListAdapter f34550h0;

    /* renamed from: i0 */
    private C7114a f34551i0;

    /* renamed from: j0 */
    private List<MySkinEntity> f34552j0;

    /* renamed from: k0 */
    private ProgressBar f34553k0;

    /* renamed from: l0 */
    private TextView f34554l0;

    /* renamed from: m0 */
    private BaseQuickAdapter.OnItemClickListener f34555m0 = new C8241a();

    /* renamed from: g.a.a.f.d.a$a */
    /* compiled from: SkinFragment */
    class C8241a implements BaseQuickAdapter.OnItemClickListener {
        C8241a() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (baseQuickAdapter.getData() != null && baseQuickAdapter.getData().size() > 0) {
                C8240a.this.mo3634T2(new Intent(C8333k.m46052c(C8240a.this.mo3651a0(), (MySkinEntity) baseQuickAdapter.getData().get(i))), 12365);
            }
        }
    }

    /* renamed from: Y2 */
    private void m45497Y2(boolean z) {
        m45500b3();
    }

    /* renamed from: Z2 */
    private void m45498Z2() {
        Bundle V = mo3638V();
        this.f34547e0 = V.getBoolean("lzyLoadGo");
        this.f34546d0 = V.getInt("pageType");
        if (!this.f34547e0) {
            mo29930g3();
        }
    }

    /* renamed from: a3 */
    private void m45499a3(boolean z) {
        int i = this.f34546d0;
        if (i == 0) {
            mo29928X2(z);
        } else if (i == 1) {
            m45497Y2(z);
        }
    }

    /* renamed from: b3 */
    private void m45500b3() {
        if (C8334l.m46054a(mo3606L()) || this.f34546d0 != 0) {
            mo29931k3(false);
            C7114a aVar = this.f34551i0;
            if (aVar != null && aVar.getStatus() == AsyncTask.Status.RUNNING) {
                this.f34551i0.cancel(true);
                this.f34551i0 = null;
            }
            C7114a aVar2 = new C7114a(this.f34546d0);
            this.f34551i0 = aVar2;
            aVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
            this.f34551i0.mo27329f(this);
            this.f34553k0.setVisibility(0);
            return;
        }
        mo29931k3(true);
    }

    /* renamed from: d3 */
    private void m45501d3() {
        m45499a3(false);
    }

    /* renamed from: e3 */
    private void m45502e3() {
        this.f34552j0 = new ArrayList();
        SkinListAdapter skinListAdapter = new SkinListAdapter(R.layout.item_skin, this.f34552j0);
        this.f34550h0 = skinListAdapter;
        skinListAdapter.setHasStableIds(true);
        ((C0916y) this.f34549g0.getItemAnimator()).mo5428V(false);
        this.f34549g0.setAdapter(this.f34550h0);
        this.f34549g0.mo4622h(new C7192i(SkinListAdapter.f31102b, 3));
        this.f34549g0.setLayoutManager(new GridLayoutManager(mo3606L(), 3));
    }

    /* renamed from: f3 */
    private View m45503f3(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_skin_list, (ViewGroup) null);
        this.f34549g0 = (RecyclerView) inflate.findViewById(R.id.recylerview);
        this.f34553k0 = (ProgressBar) inflate.findViewById(R.id.progress);
        this.f34554l0 = (TextView) inflate.findViewById(R.id.net_tip);
        m45502e3();
        return inflate;
    }

    /* renamed from: h3 */
    public static C8240a m45504h3(int i, boolean z) {
        C8240a aVar = new C8240a();
        Bundle bundle = new Bundle();
        bundle.putInt("pageType", i);
        bundle.putBoolean("lzyLoadGo", z);
        aVar.mo3581C2(bundle);
        return aVar;
    }

    /* renamed from: i3 */
    private void m45505i3() {
        this.f34548f0 = false;
        C7114a aVar = this.f34551i0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f34551i0 = null;
        }
    }

    /* renamed from: j3 */
    private void m45506j3(List<MySkinEntity> list) {
        if (list != null && list.size() > 0) {
            if (this.f34552j0 == null) {
                this.f34552j0 = new ArrayList();
            }
            this.f34552j0.clear();
            this.f34552j0.addAll(list);
            this.f34550h0.notifyDataSetChanged();
        }
    }

    /* renamed from: l3 */
    private void m45507l3() {
        this.f34550h0.setOnItemClickListener(this.f34555m0);
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        m45505i3();
    }

    /* renamed from: X2 */
    public void mo29928X2(boolean z) {
        m45500b3();
    }

    /* renamed from: c3 */
    public SkinListAdapter mo29929c3() {
        return this.f34550h0;
    }

    /* renamed from: d */
    public void mo27286d(List<MySkinEntity> list) {
        this.f34553k0.setVisibility(8);
        m45506j3(list);
    }

    /* renamed from: g3 */
    public void mo29930g3() {
        if (!this.f34548f0) {
            m45501d3();
            m45507l3();
            this.f34548f0 = true;
        }
    }

    /* renamed from: k3 */
    public void mo29931k3(boolean z) {
        TextView textView = this.f34554l0;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View f3 = m45503f3(layoutInflater);
        m45498Z2();
        return f3;
    }
}
