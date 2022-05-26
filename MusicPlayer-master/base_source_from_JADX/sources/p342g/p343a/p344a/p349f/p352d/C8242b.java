package p342g.p343a.p344a.p349f.p352d;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.adapter.C7031k;
import coocent.music.player.skin.net.MySkinEntity;
import coocent.music.player.widget.AutoViewPager;
import coocent.music.player.widget.DeepDefaultTitle;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;

/* renamed from: g.a.a.f.d.b */
/* compiled from: SplashSkinFragment */
public class C8242b extends Fragment {

    /* renamed from: G0 */
    public static String f34557G0 = C8242b.class.getSimpleName();

    /* renamed from: A0 */
    public int f34558A0 = 2016;

    /* renamed from: B0 */
    private TextView f34559B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public List<MySkinEntity> f34560C0;

    /* renamed from: D0 */
    private ImageView f34561D0;

    /* renamed from: E0 */
    private DeepDefaultTitle f34562E0;

    /* renamed from: F0 */
    private boolean f34563F0;

    /* renamed from: d0 */
    private TextView f34564d0;

    /* renamed from: e0 */
    private TextView f34565e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public AutoViewPager f34566f0;

    /* renamed from: g0 */
    private TextView f34567g0;

    /* renamed from: h0 */
    private TextView f34568h0;

    /* renamed from: i0 */
    private TextView f34569i0;

    /* renamed from: j0 */
    private TextView f34570j0;

    /* renamed from: k0 */
    private TextView f34571k0;

    /* renamed from: l0 */
    private TextView f34572l0;

    /* renamed from: m0 */
    private TextView f34573m0;

    /* renamed from: n0 */
    private TextView f34574n0;

    /* renamed from: o0 */
    private TextView f34575o0;

    /* renamed from: p0 */
    private TextView f34576p0;

    /* renamed from: q0 */
    private TextView f34577q0;

    /* renamed from: r0 */
    private TextView f34578r0;

    /* renamed from: s0 */
    private TextView[] f34579s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public TextView[] f34580t0;

    /* renamed from: u0 */
    private int[] f34581u0 = {R.drawable.splash_skin_1_shape, R.drawable.splash_skin_2_shape, R.drawable.splash_skin_3_shape, R.drawable.splash_skin_4_shape, R.drawable.splash_skin_5_shape, R.drawable.splash_skin_6_shape};

    /* renamed from: v0 */
    private int[] f34582v0 = null;

    /* renamed from: w0 */
    private int[] f34583w0 = {R.color.splash_1_bg_color, R.color.splash_2_bg_color, R.color.splash_3_bg_color, R.color.splash_4_bg_color, R.color.splash_5_bg_color, R.color.splash_6_bg_color};
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public int f34584x0 = 0;

    /* renamed from: y0 */
    private C7031k f34585y0;

    /* renamed from: z0 */
    public View f34586z0;

    /* renamed from: g.a.a.f.d.b$a */
    /* compiled from: SplashSkinFragment */
    class C8243a implements View.OnClickListener {
        C8243a() {
        }

        public void onClick(View view) {
            C8242b.this.mo29933r3((MySkinEntity) C8242b.this.f34560C0.get(C8242b.this.f34566f0.getCurrentRealItem()));
        }
    }

    /* renamed from: g.a.a.f.d.b$b */
    /* compiled from: SplashSkinFragment */
    class C8244b implements ViewPager.C1180i {
        C8244b() {
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
        }

        /* renamed from: r */
        public void mo6209r(int i) {
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            C8242b bVar = C8242b.this;
            int unused = bVar.f34584x0 = i % bVar.f34580t0.length;
            C8242b.this.m45529l3();
            C8242b.this.m45526i3();
            C8242b.this.m45528k3();
        }
    }

    /* renamed from: g.a.a.f.d.b$c */
    /* compiled from: SplashSkinFragment */
    class C8245c implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ int f34589g;

        C8245c(int i) {
            this.f34589g = i;
        }

        public void onClick(View view) {
            C8242b.this.f34566f0.mo27385W();
            C8242b.this.f34566f0.setCurrentItem(((C8242b.this.f34566f0.getCurrentItem() / 6) * 6) + this.f34589g);
        }
    }

    /* renamed from: g.a.a.f.d.b$d */
    /* compiled from: SplashSkinFragment */
    class C8246d implements View.OnClickListener {
        C8246d() {
        }

        public void onClick(View view) {
            if (view.getId() == R.id.tv_skip) {
                C8242b.this.mo29932q3();
            }
        }
    }

    /* renamed from: g.a.a.f.d.b$e */
    /* compiled from: SplashSkinFragment */
    class C8247e extends C7970w {
        C8247e() {
        }

        /* renamed from: t */
        public void mo26591t() {
            FragmentActivity L = C8242b.this.mo3606L();
            if (L != null) {
                L.finish();
            }
        }
    }

    /* renamed from: e3 */
    private void m45522e3() {
        MySkinEntity mySkinEntity = new MySkinEntity(1, "Violet blue");
        MySkinEntity mySkinEntity2 = new MySkinEntity(2, "Deep gray");
        MySkinEntity mySkinEntity3 = new MySkinEntity(3, "Ink cyan");
        MySkinEntity mySkinEntity4 = new MySkinEntity(4, "Haze blue");
        MySkinEntity mySkinEntity5 = new MySkinEntity(5, "Electric violet");
        MySkinEntity mySkinEntity6 = new MySkinEntity(6, "Burning orange");
        ArrayList arrayList = new ArrayList();
        this.f34560C0 = arrayList;
        arrayList.add(mySkinEntity);
        this.f34560C0.add(mySkinEntity2);
        this.f34560C0.add(mySkinEntity3);
        this.f34560C0.add(mySkinEntity4);
        this.f34560C0.add(mySkinEntity5);
        this.f34560C0.add(mySkinEntity6);
    }

    /* renamed from: f3 */
    private void m45523f3() {
        this.f34563F0 = C8337n.m46065k0(mo3651a0()).mo30155U0();
        m45522e3();
    }

    /* renamed from: g3 */
    private View m45524g3(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_splash_select_skin, (ViewGroup) null);
        this.f34562E0 = (DeepDefaultTitle) inflate.findViewById(R.id.defualt_title);
        this.f34564d0 = (TextView) inflate.findViewById(R.id.tv_skip);
        this.f34565e0 = (TextView) inflate.findViewById(R.id.tv_skin_name);
        this.f34566f0 = (AutoViewPager) inflate.findViewById(R.id.view_pager);
        this.f34567g0 = (TextView) inflate.findViewById(R.id.tv_splash_1_select);
        this.f34568h0 = (TextView) inflate.findViewById(R.id.tv_splash_2_select);
        this.f34569i0 = (TextView) inflate.findViewById(R.id.tv_splash_3_select);
        this.f34570j0 = (TextView) inflate.findViewById(R.id.tv_splash_4_select);
        this.f34571k0 = (TextView) inflate.findViewById(R.id.tv_splash_5_select);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_splash_6_select);
        this.f34572l0 = textView;
        this.f34579s0 = new TextView[]{this.f34567g0, this.f34568h0, this.f34569i0, this.f34570j0, this.f34571k0, textView};
        this.f34573m0 = (TextView) inflate.findViewById(R.id.tv_splash_1_bg);
        this.f34574n0 = (TextView) inflate.findViewById(R.id.tv_splash_2_bg);
        this.f34575o0 = (TextView) inflate.findViewById(R.id.tv_splash_3_bg);
        this.f34576p0 = (TextView) inflate.findViewById(R.id.tv_splash_4_bg);
        this.f34577q0 = (TextView) inflate.findViewById(R.id.tv_splash_5_bg);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_splash_6_bg);
        this.f34578r0 = textView2;
        this.f34580t0 = new TextView[]{this.f34573m0, this.f34574n0, this.f34575o0, this.f34576p0, this.f34577q0, textView2};
        this.f34586z0 = inflate.findViewById(R.id.navigation_view);
        this.f34561D0 = (ImageView) inflate.findViewById(R.id.root_image);
        this.f34559B0 = (TextView) inflate.findViewById(R.id.tv_open1);
        return inflate;
    }

    /* renamed from: h3 */
    public static C8242b m45525h3() {
        return new C8242b();
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public void m45526i3() {
        try {
            this.f34561D0.setBackgroundResource(this.f34583w0[this.f34584x0]);
        } catch (Exception unused) {
        }
    }

    /* renamed from: j3 */
    private void m45527j3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public void m45528k3() {
        try {
            TextView textView = this.f34565e0;
            if (textView != null) {
                textView.setText(this.f34560C0.get(this.f34584x0).mo27309e());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public void m45529l3() {
        int i = 0;
        while (true) {
            try {
                TextView[] textViewArr = this.f34579s0;
                if (i < textViewArr.length) {
                    if (this.f34584x0 == i) {
                        textViewArr[i].setVisibility(0);
                    } else {
                        textViewArr[i].setVisibility(4);
                    }
                    i++;
                } else {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    /* renamed from: m3 */
    private void m45530m3() {
        int i = 0;
        while (true) {
            try {
                TextView[] textViewArr = this.f34580t0;
                if (i < textViewArr.length) {
                    textViewArr[i].setBackground(mo3698s0().getDrawable(this.f34581u0[i]));
                    i++;
                } else {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    /* renamed from: n3 */
    private void m45531n3() {
        this.f34562E0.mo27431B(true, true);
        this.f34562E0.setHomeIcon(false);
        this.f34562E0.setSearchIcon(false);
        this.f34562E0.setThemeIcon(false);
        this.f34562E0.setMyText(false);
        this.f34562E0.setEqIconAdd(false);
        this.f34562E0.setTitleText(mo3698s0().getString(R.string.theme));
        if (this.f34563F0) {
            this.f34564d0.setVisibility(0);
            this.f34562E0.setVisibility(8);
            return;
        }
        this.f34564d0.setVisibility(8);
        this.f34562E0.setVisibility(0);
    }

    /* renamed from: o3 */
    private void m45532o3() {
        m45531n3();
        m45527j3();
        C7031k kVar = new C7031k(mo3651a0(), this.f34582v0);
        this.f34585y0 = kVar;
        this.f34566f0.setAdapter(kVar);
        if (this.f34563F0) {
            this.f34566f0.setCurrentItem(this.f34558A0);
            this.f34566f0.mo27384V();
        } else {
            this.f34566f0.setCurrentItem((this.f34558A0 + C8343s.f34788c) - 1);
        }
        this.f34566f0.setOffscreenPageLimit(6);
        this.f34584x0 = this.f34566f0.getCurrentItem() % this.f34580t0.length;
        m45526i3();
        m45530m3();
        m45529l3();
    }

    /* renamed from: p3 */
    private void m45533p3() {
        this.f34559B0.setOnClickListener(new C8243a());
        this.f34566f0.setOnPageChangeListener(new C8244b());
        int i = 0;
        while (true) {
            try {
                TextView[] textViewArr = this.f34580t0;
                if (i >= textViewArr.length) {
                    break;
                }
                textViewArr[i].setOnClickListener(new C8245c(i));
                i++;
            } catch (Exception unused) {
            }
        }
        this.f34564d0.setOnClickListener(new C8246d());
        this.f34562E0.setTitleOnClickListener(new C8247e());
    }

    /* renamed from: q3 */
    public void mo29932q3() {
        try {
            mo29933r3(this.f34560C0.get(0));
        } catch (Exception unused) {
        }
    }

    /* renamed from: r3 */
    public void mo29933r3(MySkinEntity mySkinEntity) {
        try {
            FragmentActivity L = mo3606L();
            if (L != null) {
                C8337n.m46065k0(L).mo30117K2(true);
                C8343s.m46306n(mySkinEntity.mo27305a());
                C8337n.m46065k0(L).mo30277y1(mySkinEntity.mo27305a());
                C8337n.m46065k0(L).mo30157U2(false);
                L.sendBroadcast(new Intent(C8311c.f34737d));
                mo3627R2(new Intent(mo3606L(), LibraryActivity.class));
                mo3606L().finish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View g3 = m45524g3(layoutInflater);
        m45523f3();
        m45532o3();
        m45533p3();
        return g3;
    }
}
