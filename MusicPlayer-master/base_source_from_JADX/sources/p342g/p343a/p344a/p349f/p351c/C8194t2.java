package p342g.p343a.p344a.p349f.p351c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.C6210c;
import com.google.android.material.tabs.TabLayout;
import coocent.music.player.adapter.C7023f;
import coocent.music.player.widget.DeepDefaultTitle;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.t2 */
/* compiled from: FavoriteFragment */
public class C8194t2 extends C8010a {

    /* renamed from: i0 */
    private View f34429i0;

    /* renamed from: j0 */
    public DeepDefaultTitle f34430j0;

    /* renamed from: k0 */
    private TabLayout f34431k0;

    /* renamed from: l0 */
    private ViewPager2 f34432l0;

    /* renamed from: m0 */
    private C8196b f34433m0;

    /* renamed from: g.a.a.f.c.t2$a */
    /* compiled from: FavoriteFragment */
    class C8195a extends C7970w {
        C8195a() {
        }

        /* renamed from: t */
        public void mo26591t() {
            C8194t2.this.m45196j3();
        }
    }

    /* renamed from: g.a.a.f.c.t2$b */
    /* compiled from: FavoriteFragment */
    private class C8196b extends BroadcastReceiver {
        private C8196b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui")) {
                C8194t2.this.m45201p3(intent);
            }
        }

        /* synthetic */ C8196b(C8194t2 t2Var, C8195a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public void m45196j3() {
        FragmentActivity L = mo3606L();
        if (L != null) {
            L.onBackPressed();
        }
    }

    /* renamed from: l3 */
    private void m45197l3() {
        this.f34432l0.setAdapter(new C7023f(mo3606L(), 1));
        this.f34432l0.setOffscreenPageLimit(4);
        new C6210c(this.f34431k0, this.f34432l0, C8113h0.f34218a).mo24836a();
    }

    /* renamed from: m3 */
    private void m45198m3() {
        this.f34433m0 = new C8196b(this, (C8195a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui");
        mo3606L().registerReceiver(this.f34433m0, intentFilter);
    }

    /* renamed from: n3 */
    private void m45199n3() {
        this.f34430j0 = (DeepDefaultTitle) this.f34429i0.findViewById(R.id.defualt_title);
        TabLayout tabLayout = (TabLayout) this.f34429i0.findViewById(R.id.tabLayout);
        this.f34431k0 = tabLayout;
        tabLayout.mo24728K(C8343s.m46295c(R.color.artist_detail_tab_text_color), C8343s.m46300h());
        this.f34431k0.setSelectedTabIndicatorColor(C8343s.m46300h());
        this.f34431k0.setTabRippleColor(ColorStateList.valueOf(C8343s.m46295c(R.color.ripple_color)));
        this.f34432l0 = (ViewPager2) this.f34429i0.findViewById(R.id.viewPager2);
        ImageView imageView = (ImageView) this.f34429i0.findViewById(R.id.iv_bg);
        this.f34429i0.findViewById(R.id.bg_cover).setVisibility(C8343s.f34787b ? 0 : 8);
        C8343s.m46307o(imageView, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public void m45201p3(Intent intent) {
        if (intent != null) {
            boolean z = intent.getExtras().getBoolean("disPlaySelectTitle");
            DeepDefaultTitle deepDefaultTitle = this.f34430j0;
            int i = 0;
            if (deepDefaultTitle != null) {
                deepDefaultTitle.setVisibility(z ? 4 : 0);
            }
            TabLayout tabLayout = this.f34431k0;
            if (tabLayout != null) {
                if (z) {
                    i = 8;
                }
                tabLayout.setVisibility(i);
            }
            ViewPager2 viewPager2 = this.f34432l0;
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(!z);
            }
        }
    }

    /* renamed from: q3 */
    private void m45202q3() {
        this.f34430j0.setHomeIcon(false);
        this.f34430j0.setMutilIcon(false);
        this.f34430j0.setSearchIcon(false);
        this.f34430j0.setSort(0);
        this.f34430j0.setTitleText(C8345u.m46333n(R.string.favorite));
        this.f34430j0.setMenuIcon(false);
        this.f34430j0.setTitleBackgroundColor(C8343s.m46295c(R.color.library_title_backgroud_color));
        this.f34430j0.mo27431B(true, true);
    }

    /* renamed from: r3 */
    private void m45203r3() {
        this.f34430j0.setTitleOnClickListener(new C8195a());
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        if (this.f34433m0 != null) {
            mo3606L().unregisterReceiver(this.f34433m0);
            this.f34433m0 = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8194t2.class.getSimpleName();
    }

    /* renamed from: k3 */
    public int mo29862k3() {
        ViewPager2 viewPager2 = this.f34432l0;
        if (viewPager2 != null) {
            return viewPager2.getCurrentItem();
        }
        return 0;
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

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34429i0 = layoutInflater.inflate(R.layout.fragment_favorite, (ViewGroup) null);
        m45199n3();
        m45197l3();
        m45202q3();
        m45203r3();
        m45198m3();
        mo29550c3();
        return this.f34429i0;
    }
}
