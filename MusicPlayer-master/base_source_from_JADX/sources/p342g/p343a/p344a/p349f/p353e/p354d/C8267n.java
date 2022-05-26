package p342g.p343a.p344a.p349f.p353e.p354d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import coocent.music.player.widget.CmEQView;
import coocent.music.player.widget.EqLayout;
import coocent.music.player.widget.PullPresetList;
import coocent.music.player.widget.SwitchImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p171b.p172a.C4315c;
import p159f.p166c.p201g.C4506a;
import p159f.p166c.p201g.p205m.C4550b;
import p159f.p166c.p201g.p205m.C4555d;
import p159f.p166c.p201g.p207o.C4563a;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.e.d.n */
/* compiled from: TabEqFragment */
public class C8267n extends Fragment implements EqLayout.C7138c, PullPresetList.C7157c, C4563a {

    /* renamed from: d0 */
    private SwitchImageView f34615d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public CmEQView f34616e0;

    /* renamed from: f0 */
    private EqLayout f34617f0;

    /* renamed from: g0 */
    private PullPresetList f34618g0;

    /* renamed from: h0 */
    private ImageView f34619h0;

    /* renamed from: i0 */
    private C8269b f34620i0;

    /* renamed from: j0 */
    private boolean f34621j0;

    /* renamed from: k0 */
    private Vibrator f34622k0;

    /* renamed from: g.a.a.f.e.d.n$a */
    /* compiled from: TabEqFragment */
    class C8268a implements ViewTreeObserver.OnGlobalLayoutListener {
        C8268a() {
        }

        public void onGlobalLayout() {
            C8267n.this.f34616e0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            int[] e = C8284c.m45742e(C8267n.this.mo3651a0());
            int i = 0;
            while (i < e.length) {
                i++;
                C8267n.this.f34616e0.mo27392b(i, ((e[i] + 15) * 100) / 30);
            }
        }
    }

    /* renamed from: g.a.a.f.e.d.n$b */
    /* compiled from: TabEqFragment */
    private static class C8269b extends BroadcastReceiver {

        /* renamed from: a */
        WeakReference<C8267n> f34624a;

        public C8269b(C8267n nVar) {
            this.f34624a = new WeakReference<>(nVar);
        }

        public void onReceive(Context context, Intent intent) {
            String action;
            C8267n nVar = (C8267n) this.f34624a.get();
            if (nVar != null && intent != null && (action = intent.getAction()) != null) {
                if (action.equals(C4506a.m19739m(nVar.mo3651a0()))) {
                    nVar.m45570X2(intent.getBooleanExtra("enable", false), nVar);
                } else if (action.equals(C4506a.m19741o(nVar.mo3651a0())) && intent.getBooleanExtra("enable", false)) {
                    nVar.m45570X2(false, nVar);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public void m45570X2(boolean z, C8267n nVar) {
        nVar.f34615d0.setChecked(z);
        nVar.f34617f0.setEqEnable(z);
        nVar.f34618g0.setEnable(z);
        ImageView imageView = nVar.f34619h0;
        int i = 8;
        if (z && nVar.f34618g0.mo27577M(nVar.f34617f0.getEqValue())) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: a3 */
    private void m45573a3(int[] iArr) {
        this.f34619h0.setVisibility(this.f34618g0.mo27577M(iArr) ? 0 : 8);
    }

    /* renamed from: b3 */
    private void m45574b3() {
        this.f34621j0 = C8337n.m46065k0(C8345u.m46327h()).mo30167X0();
        this.f34622k0 = (Vibrator) C8345u.m46327h().getSystemService("vibrator");
    }

    /* renamed from: c3 */
    private void m45575c3() {
        this.f34620i0 = new C8269b(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C4506a.m19739m(mo3651a0()));
        intentFilter.addAction(C4506a.m19741o(mo3651a0()));
        mo3651a0().registerReceiver(this.f34620i0, intentFilter);
    }

    /* renamed from: d3 */
    private void m45576d3(View view) {
        this.f34615d0 = (SwitchImageView) view.findViewById(R.id.switchLayout);
        CmEQView cmEQView = (CmEQView) view.findViewById(R.id.cmEqView);
        this.f34616e0 = cmEQView;
        cmEQView.setTenBand(C8284c.m45749l());
        this.f34617f0 = (EqLayout) view.findViewById(R.id.eqLayout);
        this.f34618g0 = (PullPresetList) view.findViewById(R.id.pp_reset);
        this.f34619h0 = (ImageView) view.findViewById(R.id.iv_save);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public /* synthetic */ void mo29960f3(View view) {
        if (view.getId() == R.id.iv_save) {
            m45579h3();
        }
    }

    /* renamed from: g3 */
    public static Fragment m45578g3() {
        return new C8267n();
    }

    /* renamed from: h3 */
    private void m45579h3() {
        C4555d dVar = new C4555d(mo3651a0(), this.f34617f0.getEqValue());
        dVar.mo15255f(this);
        dVar.show();
    }

    /* renamed from: i3 */
    private void m45580i3() {
        this.f34616e0.getViewTreeObserver().addOnGlobalLayoutListener(new C8268a());
    }

    /* renamed from: j3 */
    private void m45581j3() {
        boolean k = C8284c.m45748k();
        this.f34615d0.setChecked(k);
        this.f34619h0.setVisibility(8);
        this.f34618g0.setEnable(k);
        this.f34617f0.setEqEnable(k);
        m45580i3();
        m45573a3(C8284c.m45742e(mo3651a0()));
    }

    /* renamed from: k3 */
    private void m45582k3() {
        this.f34615d0.setOnCheckedChangeListener(new C8266m(this));
        this.f34617f0.setEqProgressChangedListener(this);
        this.f34618g0.setPullPresetListener(this);
        this.f34619h0.setOnClickListener(new C8254a(this));
    }

    /* renamed from: C */
    public void mo27496C(SeekBar seekBar, int[] iArr) {
        this.f34617f0.mo27485P();
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        if (this.f34620i0 != null) {
            Context a0 = mo3651a0();
            if (a0 != null) {
                a0.unregisterReceiver(this.f34620i0);
            }
            this.f34620i0 = null;
        }
    }

    /* renamed from: E */
    public void mo9515E(C4315c cVar) {
        this.f34619h0.setVisibility(8);
        this.f34618g0.mo27576L(cVar);
    }

    /* renamed from: b */
    public void mo27497b(SeekBar seekBar, int i, int i2, int[] iArr, boolean z) {
        this.f34616e0.mo27392b(i + 1, ((i2 + 15) * 100) / 30);
        if (z) {
            m45573a3(iArr);
        }
        if (this.f34621j0 && z) {
            this.f34622k0.vibrate(new long[]{0, 10}, -1);
        }
    }

    /* renamed from: g1 */
    public void mo9516g1(int i, C4315c cVar) {
        this.f34619h0.setVisibility(0);
        this.f34618g0.mo27575K(i, cVar);
    }

    /* renamed from: l3 */
    public void mo29961l3(boolean z) {
        C8284c.m45760w(mo3651a0(), z);
        this.f34617f0.setEqEnable(z);
        this.f34618g0.setEnable(z);
        ImageView imageView = this.f34619h0;
        int i = 8;
        if (z && this.f34618g0.mo27577M(this.f34617f0.getEqValue())) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: o1 */
    public void mo9517o1(int i, C4315c cVar, String str) {
        this.f34618g0.mo27572E(i, cVar, str);
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_tab_eq, (ViewGroup) null);
        m45576d3(inflate);
        m45574b3();
        m45581j3();
        m45582k3();
        m45575c3();
        return inflate;
    }

    /* renamed from: w */
    public void mo27581w(int i, C4315c cVar) {
        if (this.f34617f0 != null) {
            int[] g = cVar.mo14718g();
            this.f34617f0.mo27482H(Arrays.copyOf(g, g.length));
        }
        m45573a3(cVar.mo14718g());
        this.f34617f0.mo27485P();
    }

    /* renamed from: y */
    public void mo27582y(int i, C4315c cVar) {
        C4550b bVar = new C4550b(mo3606L(), i, cVar);
        bVar.mo15249n(this);
        bVar.show();
    }
}
