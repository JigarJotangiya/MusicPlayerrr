package p342g.p343a.p344a.p349f.p353e.p354d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import coocent.music.player.widget.NoScrollReverberationTabLayout;
import coocent.music.player.widget.ReverberationLayout;
import java.lang.ref.WeakReference;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p201g.C4506a;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.e.d.p */
/* compiled from: TabReverberationFragment */
public class C8276p extends Fragment implements NoScrollReverberationTabLayout.C7143b {

    /* renamed from: d0 */
    private C8277a f34653d0;

    /* renamed from: e0 */
    private ReverberationLayout f34654e0;

    /* renamed from: g.a.a.f.e.d.p$a */
    /* compiled from: TabReverberationFragment */
    private static class C8277a extends BroadcastReceiver {

        /* renamed from: a */
        WeakReference<C8276p> f34655a;

        public C8277a(C8276p pVar) {
            this.f34655a = new WeakReference<>(pVar);
        }

        public void onReceive(Context context, Intent intent) {
            String action;
            C8276p pVar = (C8276p) this.f34655a.get();
            if (pVar != null && intent != null && (action = intent.getAction()) != null) {
                if (action.equals(C4506a.m19740n(pVar.mo3651a0()))) {
                    pVar.m45694c3();
                } else if (action.equals(C4506a.m19741o(pVar.mo3651a0()))) {
                    boolean booleanExtra = intent.getBooleanExtra("enable", false);
                    if (booleanExtra) {
                        pVar.m45695d3(!booleanExtra);
                    }
                } else if (action.equals(C4506a.m19739m(pVar.mo3651a0()))) {
                    pVar.m45695d3(intent.getBooleanExtra("enable", false));
                }
            }
        }
    }

    /* renamed from: Z2 */
    private void m45691Z2() {
        this.f34653d0 = new C8277a(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C4506a.m19740n(mo3651a0()));
        intentFilter.addAction(C4506a.m19739m(mo3651a0()));
        intentFilter.addAction(C4506a.m19741o(mo3651a0()));
        mo3651a0().registerReceiver(this.f34653d0, intentFilter);
    }

    /* renamed from: a3 */
    private void m45692a3(View view) {
        NoScrollReverberationTabLayout noScrollReverberationTabLayout = (NoScrollReverberationTabLayout) view.findViewById(R.id.reverberationTabLayout);
        noScrollReverberationTabLayout.setSelectTab(C8284c.m45744g(C8345u.m46327h()));
        this.f34654e0 = (ReverberationLayout) view.findViewById(R.id.reverberationLayout);
        noScrollReverberationTabLayout.setSelectedTabIndicatorHeight(0);
        noScrollReverberationTabLayout.setOnTabSelectListener(this);
    }

    /* renamed from: b3 */
    public static Fragment m45693b3() {
        return new C8276p();
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public void m45694c3() {
        this.f34654e0.mo27584M();
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public void m45695d3(boolean z) {
        this.f34654e0.setReverberationEnable(z);
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        if (this.f34653d0 != null) {
            Context a0 = mo3651a0();
            if (a0 != null) {
                a0.unregisterReceiver(this.f34653d0);
            }
            this.f34653d0 = null;
        }
    }

    /* renamed from: n */
    public void mo27530n(TabLayout.C6203g gVar) {
        C8284c.m45762y(gVar.mo24806g());
        C8284c.m45753p(C8345u.m46327h(), gVar.mo24806g());
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_reverberation, (ViewGroup) null);
        m45692a3(inflate);
        m45691Z2();
        return inflate;
    }
}
