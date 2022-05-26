package p342g.p343a.p344a.p349f.p351c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C0885l;
import androidx.viewpager.widget.ViewPager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Album;
import com.coocent.music.base.data.entity.Music;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.adapter.C7021d;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.music.player.widget.NoScrollViewPager;
import coocent.music.player.widget.p275k.C7213i0;
import coocent.musiclibrary.music.p281b.C7324c;
import coocent.musiclibrary.music.p284e.C7332e;
import coocent.musiclibrary.music.p292j.C7397j;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p183a.p184a.C4362b;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.c.o2 */
/* compiled from: ArtistDetailFragment */
public class C8158o2 extends C8010a implements C4362b, C7963p, C7324c {

    /* renamed from: C0 */
    public static final String f34326C0 = C8158o2.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public int f34327A0;

    /* renamed from: B0 */
    private TextView f34328B0;

    /* renamed from: i0 */
    private View f34329i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public DeepDefaultTitle f34330j0;

    /* renamed from: k0 */
    private ImageView f34331k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public long f34332l0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public String f34333m0;

    /* renamed from: n0 */
    private C8163e f34334n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public Toolbar f34335o0;

    /* renamed from: p0 */
    private ImageView f34336p0;

    /* renamed from: q0 */
    private AppBarLayout f34337q0;

    /* renamed from: r0 */
    private TabLayout f34338r0;

    /* renamed from: s0 */
    private String[] f34339s0;

    /* renamed from: t0 */
    public NoScrollViewPager f34340t0;

    /* renamed from: u0 */
    private C7021d f34341u0;

    /* renamed from: v0 */
    private View f34342v0;

    /* renamed from: w0 */
    private RelativeLayout f34343w0;

    /* renamed from: x0 */
    private TabLayout.C6203g f34344x0;

    /* renamed from: y0 */
    private TabLayout.C6203g f34345y0;

    /* renamed from: z0 */
    private ImageView f34346z0;

    /* renamed from: g.a.a.f.c.o2$a */
    /* compiled from: ArtistDetailFragment */
    class C8159a implements ViewTreeObserver.OnGlobalLayoutListener {
        C8159a() {
        }

        public void onGlobalLayout() {
            C8158o2.this.f34335o0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewGroup.LayoutParams layoutParams = C8158o2.this.f34335o0.getLayoutParams();
            layoutParams.height = C8158o2.this.f34335o0.getHeight() + C8345u.m46332m();
            C8158o2.this.f34335o0.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: g.a.a.f.c.o2$b */
    /* compiled from: ArtistDetailFragment */
    class C8160b extends C7970w {
        C8160b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            r0 = (p342g.p343a.p344a.p349f.p351c.C8174q2) r0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26693b() {
            /*
                r5 = this;
                super.mo26693b()
                g.a.a.f.c.o2 r0 = p342g.p343a.p344a.p349f.p351c.C8158o2.this     // Catch:{ Exception -> 0x0055 }
                androidx.fragment.app.j r0 = r0.mo3642W()     // Catch:{ Exception -> 0x0055 }
                java.util.List r0 = r0.mo3956h0()     // Catch:{ Exception -> 0x0055 }
                if (r0 == 0) goto L_0x0059
                int r1 = r0.size()     // Catch:{ Exception -> 0x0055 }
                if (r1 <= 0) goto L_0x0059
                g.a.a.f.c.o2 r1 = p342g.p343a.p344a.p349f.p351c.C8158o2.this     // Catch:{ Exception -> 0x0055 }
                coocent.music.player.widget.NoScrollViewPager r1 = r1.f34340t0     // Catch:{ Exception -> 0x0055 }
                int r1 = r1.getCurrentItem()     // Catch:{ Exception -> 0x0055 }
                java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0055 }
                androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch:{ Exception -> 0x0055 }
                boolean r1 = r0 instanceof p342g.p343a.p344a.p349f.p351c.C8174q2     // Catch:{ Exception -> 0x0055 }
                if (r1 == 0) goto L_0x0059
                g.a.a.f.c.q2 r0 = (p342g.p343a.p344a.p349f.p351c.C8174q2) r0     // Catch:{ Exception -> 0x0055 }
                coocent.music.player.adapter.TrackAdapter r1 = r0.f34382l0     // Catch:{ Exception -> 0x0055 }
                if (r1 == 0) goto L_0x0059
                r2 = 0
                r4 = 0
                r1.mo26909f(r4, r2)     // Catch:{ Exception -> 0x0055 }
                g.a.a.f.c.o2 r1 = p342g.p343a.p344a.p349f.p351c.C8158o2.this     // Catch:{ Exception -> 0x0055 }
                androidx.fragment.app.FragmentActivity r1 = r1.mo3606L()     // Catch:{ Exception -> 0x0055 }
                if (r1 == 0) goto L_0x0059
                g.a.a.f.c.o2 r1 = p342g.p343a.p344a.p349f.p351c.C8158o2.this     // Catch:{ Exception -> 0x0055 }
                androidx.fragment.app.FragmentActivity r1 = r1.mo3606L()     // Catch:{ Exception -> 0x0055 }
                boolean r2 = r1 instanceof coocent.music.player.activity.LibraryActivity     // Catch:{ Exception -> 0x0055 }
                if (r2 == 0) goto L_0x0059
                coocent.music.player.activity.LibraryActivity r1 = (coocent.music.player.activity.LibraryActivity) r1     // Catch:{ Exception -> 0x0055 }
                java.util.List<com.coocent.music.base.data.entity.Music> r0 = r0.f34383m0     // Catch:{ Exception -> 0x0055 }
                if (r0 != 0) goto L_0x004d
                r0 = 0
                goto L_0x0051
            L_0x004d:
                int r0 = r0.size()     // Catch:{ Exception -> 0x0055 }
            L_0x0051:
                r1.mo26676p2(r4, r0)     // Catch:{ Exception -> 0x0055 }
                goto L_0x0059
            L_0x0055:
                r0 = move-exception
                r0.printStackTrace()
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p349f.p351c.C8158o2.C8160b.mo26693b():void");
        }

        /* renamed from: e */
        public void mo29495e() {
            super.mo29495e();
            C7213i0 i0Var = new C7213i0(C8158o2.this.mo3606L(), 2, 0);
            i0Var.mo27759j(C8158o2.this);
            i0Var.mo27752K(C8158o2.this);
            i0Var.mo27751I(C8158o2.this.f34327A0, C4477c.m19641r(C8345u.m46327h(), C8158o2.this.f34332l0));
            i0Var.mo27743k(C8158o2.this.f34330j0);
        }

        /* renamed from: t */
        public void mo26591t() {
            C8158o2.this.m44978p3();
        }
    }

    /* renamed from: g.a.a.f.c.o2$c */
    /* compiled from: ArtistDetailFragment */
    class C8161c implements ViewPager.C1180i {
        C8161c() {
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
        }

        /* renamed from: r */
        public void mo6209r(int i) {
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            if (C8158o2.this.f34330j0 != null) {
                C8158o2.this.f34330j0.setMutilIcon(i == 0);
                C8158o2.this.f34330j0.setSort(i == 0 ? 11 : 12);
            }
            C8158o2.this.mo29803C3(i);
        }
    }

    /* renamed from: g.a.a.f.c.o2$d */
    /* compiled from: ArtistDetailFragment */
    class C8162d implements C7332e.C7334b {

        /* renamed from: a */
        final /* synthetic */ C7332e f34350a;

        C8162d(C7332e eVar) {
            this.f34350a = eVar;
        }

        /* renamed from: a */
        public void mo26720a() {
            C8158o2 o2Var = C8158o2.this;
            C8314f.m45977f(o2Var, 2, o2Var.f34332l0, C8158o2.this.f34327A0, C8158o2.this.f34333m0);
            this.f34350a.dismiss();
        }

        /* renamed from: b */
        public void mo26721b() {
            C8158o2 o2Var = C8158o2.this;
            C8314f.m45975d(o2Var, o2Var.f34332l0, C8158o2.this.f34327A0, 2);
            this.f34350a.dismiss();
        }

        /* renamed from: c */
        public void mo26722c() {
            C8158o2.this.m44984x3();
            this.f34350a.dismiss();
        }
    }

    /* renamed from: g.a.a.f.c.o2$e */
    /* compiled from: ArtistDetailFragment */
    private class C8163e extends BroadcastReceiver {
        private C8163e() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui")) {
                C8158o2.this.m44985y3(intent);
            }
        }

        /* synthetic */ C8163e(C8158o2 o2Var, C8159a aVar) {
            this();
        }
    }

    /* renamed from: A3 */
    private void m44966A3() {
        if (mo3606L() != null) {
            C8321j.m46008n(C8314f.m45972a(C8345u.m46327h(), 2, this.f34332l0), C8343s.m46304l(R.drawable.artist_bg, R.color.icon_tint_color), this.f34336p0, C8345u.m46323d(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION), C8345u.m46323d(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION), false, false);
        }
    }

    /* renamed from: B3 */
    private void m44967B3() {
        this.f34330j0.setTitleOnClickListener(new C8160b());
        this.f34337q0.mo22743b(new C8191t(this));
        this.f34340t0.setOnPageChangeListener(new C8161c());
        this.f34346z0.setOnClickListener(new C8197u(this));
    }

    /* renamed from: E3 */
    private void m44968E3() {
        this.f34330j0.setTitleText(this.f34333m0);
        this.f34328B0.setText(this.f34333m0);
        this.f34330j0.setSort(11);
        C8343s.m46307o(this.f34331k0, false);
        this.f34335o0.getViewTreeObserver().addOnGlobalLayoutListener(new C8159a());
        mo29804D3();
    }

    /* renamed from: F3 */
    private void m44969F3() {
        C7332e eVar = new C7332e(mo3606L(), C8345u.m46333n(R.string.button1), C8345u.m46333n(R.string.button2), C8345u.m46333n(R.string.button3), C8345u.m46333n(R.string.artist_work), C8345u.m46333n(R.string.artist_work_tip), C8343s.m46300h(), C8345u.m46326g(R.color.color_bbb), C8345u.m46326g(R.color.white), false, true);
        eVar.requestWindowFeature(1);
        eVar.show();
        eVar.mo28071c(new C8162d(eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public void m44978p3() {
        FragmentActivity L = mo3606L();
        if (L != null) {
            L.onBackPressed();
        }
    }

    /* renamed from: q3 */
    private void m44979q3() {
        C7021d dVar = new C7021d(mo3642W(), this.f34332l0);
        this.f34341u0 = dVar;
        dVar.mo26928w(this.f34339s0);
        this.f34340t0.setAdapter(this.f34341u0);
        this.f34340t0.setOffscreenPageLimit(2);
        this.f34338r0.mo24728K(C8343s.m46295c(R.color.artist_detail_tab_text_color), C8343s.m46300h());
        this.f34344x0 = this.f34338r0.mo24783x(0);
        this.f34345y0 = this.f34338r0.mo24783x(1);
    }

    /* renamed from: r3 */
    private void m44980r3() {
        this.f34334n0 = new C8163e(this, (C8159a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui");
        mo3606L().registerReceiver(this.f34334n0, intentFilter);
    }

    /* renamed from: s3 */
    private void m44981s3() {
        ProgressBar progressBar = (ProgressBar) this.f34329i0.findViewById(R.id.progressbar);
        this.f34330j0 = (DeepDefaultTitle) this.f34329i0.findViewById(R.id.defualt_title);
        this.f34335o0 = (Toolbar) this.f34329i0.findViewById(R.id.toolbar);
        this.f34343w0 = (RelativeLayout) this.f34329i0.findViewById(R.id.rl_artist_art);
        this.f34331k0 = (ImageView) this.f34329i0.findViewById(R.id.iv_bg);
        this.f34329i0.findViewById(R.id.bg_cover).setVisibility(C8343s.f34787b ? 0 : 8);
        ImageView imageView = (ImageView) this.f34329i0.findViewById(R.id.top_bar_bg);
        this.f34336p0 = imageView;
        if (C8343s.f34788c == 2) {
            imageView.setBackgroundColor(-16777216);
        }
        TabLayout tabLayout = (TabLayout) this.f34329i0.findViewById(R.id.tab);
        this.f34338r0 = tabLayout;
        tabLayout.setTabRippleColor(ColorStateList.valueOf(C8343s.m46295c(R.color.ripple_color)));
        this.f34338r0.setSelectedTabIndicatorColor(C8343s.m46300h());
        this.f34340t0 = (NoScrollViewPager) this.f34329i0.findViewById(R.id.viewpager);
        this.f34339s0 = mo3698s0().getStringArray(R.array.artist_tab_name);
        this.f34338r0.setupWithViewPager(this.f34340t0);
        this.f34337q0 = (AppBarLayout) this.f34329i0.findViewById(R.id.applayout);
        this.f34342v0 = this.f34329i0.findViewById(R.id.ivmianbgcover);
        this.f34346z0 = (ImageView) this.f34329i0.findViewById(R.id.iv_change_artwork);
        this.f34328B0 = (TextView) this.f34329i0.findViewById(R.id.artist_content_text);
        this.f34330j0.setMutilIcon(true);
        this.f34330j0.setMenuIcon(true);
        this.f34330j0.setEqIcon(false);
        this.f34330j0.setSearchIcon(false);
        this.f34330j0.mo27431B(true, true);
        this.f34330j0.setHomeIcon(false);
        this.f34330j0.setMoreMenuCallBack(true);
        this.f34330j0.mo27435H();
        m44979q3();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void mo29805u3(AppBarLayout appBarLayout, int i) {
        float abs = this.f34337q0.getHeight() != 0 ? ((float) Math.abs(i)) / ((float) appBarLayout.getTotalScrollRange()) : 0.0f;
        this.f34330j0.setTitleTextAlpha(abs);
        float f = 1.0f - abs;
        this.f34336p0.setAlpha(f);
        this.f34342v0.setAlpha(f);
        this.f34346z0.setAlpha(f);
        this.f34328B0.setAlpha(f);
        if (C8343s.f34788c != 1) {
            return;
        }
        if (abs == 1.0f) {
            this.f34330j0.setTitleTextColor(-16777216);
            this.f34330j0.mo27440W(R.color.black);
            this.f34330j0.mo27441X(R.color.black);
            return;
        }
        this.f34330j0.setTitleTextColor(-1);
        this.f34330j0.mo27440W(R.color.white);
        this.f34330j0.mo27441X(R.color.white);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void mo29806w3(View view) {
        if (view.getId() == R.id.iv_change_artwork) {
            m44969F3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public void m44984x3() {
        C8314f.m45978g((BaseQuickAdapter) null, 2, this.f34332l0);
        m44966A3();
        Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.artist_artwork_item_notify");
        intent.putExtra("artwork_position", this.f34327A0);
        C8345u.m46327h().sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m44985y3(Intent intent) {
        if (intent != null) {
            boolean z = intent.getExtras().getBoolean("disPlaySelectTitle");
            NoScrollViewPager noScrollViewPager = this.f34340t0;
            if (noScrollViewPager != null) {
                noScrollViewPager.setScroll(z);
            }
            TabLayout tabLayout = this.f34338r0;
            int i = 0;
            if (tabLayout != null) {
                tabLayout.setVisibility(z ? 8 : 0);
            }
            DeepDefaultTitle deepDefaultTitle = this.f34330j0;
            if (deepDefaultTitle != null) {
                deepDefaultTitle.setVisibility(z ? 4 : 0);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34343w0.getLayoutParams();
            if (!z) {
                i = C7397j.m41731a(mo3651a0(), 300);
            }
            layoutParams.height = i;
            this.f34343w0.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: z3 */
    private void m44986z3() {
        if (mo3638V() != null) {
            this.f34332l0 = mo3638V().getLong("artist_id");
            this.f34333m0 = mo3638V().getString("artist_title");
            this.f34327A0 = mo3638V().getInt("artist_position");
        }
        if (this.f34332l0 <= 0) {
            C8345u.m46340u(R.string.error);
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
        if (this.f34340t0 != null) {
            this.f34340t0 = null;
        }
        if (this.f34338r0 != null) {
            this.f34338r0 = null;
        }
        if (this.f34334n0 != null) {
            try {
                mo3606L().unregisterReceiver(this.f34334n0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f34334n0 = null;
        }
        ImageView imageView = this.f34336p0;
        if (imageView != null) {
            imageView.setBackground((Drawable) null);
            this.f34336p0.setBackgroundDrawable((Drawable) null);
            this.f34336p0.setImageBitmap((Bitmap) null);
            this.f34336p0 = null;
        }
    }

    /* renamed from: C3 */
    public void mo29803C3(int i) {
        C7021d dVar = this.f34341u0;
        NoScrollViewPager noScrollViewPager = this.f34340t0;
        Fragment fragment = (Fragment) dVar.mo4041j(noScrollViewPager, noScrollViewPager.getCurrentItem());
        if (fragment != null) {
            int i2 = 0;
            if (i == 0) {
                try {
                    List<Music> list = ((C8174q2) fragment).f34383m0;
                    if (list != null) {
                        i2 = list.size();
                    }
                    TabLayout.C6203g gVar = this.f34344x0;
                    gVar.mo24818s(C8345u.m46333n(R.string.track) + " " + i2);
                    this.f34345y0.mo24818s(C8345u.m46333n(R.string.album));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    List<Album> list2 = ((C8150n2) fragment).f34308m0;
                    if (list2 != null) {
                        i2 = list2.size();
                    }
                    this.f34344x0.mo24818s(C8345u.m46333n(R.string.track));
                    TabLayout.C6203g gVar2 = this.f34345y0;
                    gVar2.mo24818s(C8345u.m46333n(R.string.album) + " " + i2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: D */
    public void mo28061D(int i, long j, int i2, String str) {
        C8314f.m45977f(this, i, j, i2, str);
    }

    /* renamed from: D3 */
    public void mo29804D3() {
        if (this.f34336p0 != null) {
            m44966A3();
        }
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: H0 */
    public void mo14800H0(boolean z, long j, String str, int i, int i2) {
        if (this.f34336p0 != null) {
            m44966A3();
            FragmentActivity L = mo3606L();
            if (L instanceof LibraryActivity) {
                ((LibraryActivity) L).mo14800H0(z, j, str, i, i2);
            }
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
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8158o2.class.getSimpleName();
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: e1 */
    public void mo3662e1(int i, int i2, Intent intent) {
        super.mo3662e1(i, i2, intent);
        C4477c.m19608a0(C8345u.m46327h(), i, i2, intent);
    }

    /* renamed from: f */
    public void mo28062f(Music music) {
        C8287e.m45842g1(mo3606L(), music);
        FragmentActivity L = mo3606L();
        if (L != null) {
            L.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
            m44978p3();
            C8345u.m46340u(R.string.music_eq_message_delete_success);
        }
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

    /* renamed from: r */
    public void mo28063r(long j, int i) {
        C8314f.m45975d(this, j, i, 2);
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: s */
    public void mo28064s(SecurityException securityException, long[] jArr) {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34329i0 = layoutInflater.inflate(R.layout.fragment_artist_detail, (ViewGroup) null);
        m44986z3();
        m44981s3();
        m44967B3();
        m44968E3();
        m44980r3();
        mo29550c3();
        return this.f34329i0;
    }

    /* renamed from: u */
    public void mo28065u(int i, long j, int i2, String str) {
        m44984x3();
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
