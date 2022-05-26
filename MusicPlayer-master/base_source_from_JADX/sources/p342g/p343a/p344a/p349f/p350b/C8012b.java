package p342g.p343a.p344a.p349f.p350b;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.gms.ads.C2921g;
import coocent.music.player.activity.CustomEqActivity;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.ArcProgressView;
import coocent.music.player.widget.AutoMoveView;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.music.player.widget.OpenCloseLayout;
import coocent.music.player.widget.PressButton;
import coocent.music.player.widget.RotatView;
import coocent.music.player.widget.VerticalSeekBar;
import coocent.musiclibrary.music.model.C7408a;
import coocent.musiclibrary.music.p292j.C7397j;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.C9490s;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p346c.C7953f;
import p342g.p343a.p344a.p347d.C7972b;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: g.a.a.f.b.b */
/* compiled from: CustomEqFragment */
public class C8012b extends Fragment {

    /* renamed from: H2 */
    public static final String f33740H2 = C8012b.class.getSimpleName();

    /* renamed from: A0 */
    private AutoMoveView f33741A0;

    /* renamed from: A1 */
    private PressButton f33742A1;

    /* renamed from: A2 */
    private SeekBar.OnSeekBarChangeListener f33743A2;

    /* renamed from: B0 */
    private AutoMoveView f33744B0;

    /* renamed from: B1 */
    private PressButton f33745B1;

    /* renamed from: B2 */
    private final RotatView.C7165b f33746B2;

    /* renamed from: C0 */
    private AutoMoveView f33747C0;

    /* renamed from: C1 */
    private PressButton f33748C1;

    /* renamed from: C2 */
    private final RotatView.C7165b f33749C2;

    /* renamed from: D0 */
    private AutoMoveView f33750D0;

    /* renamed from: D1 */
    private PressButton f33751D1;

    /* renamed from: D2 */
    private final RotatView.C7165b f33752D2;

    /* renamed from: E0 */
    private AutoMoveView f33753E0;

    /* renamed from: E1 */
    private PressButton f33754E1;

    /* renamed from: E2 */
    private final RotatView.C7165b f33755E2;

    /* renamed from: F0 */
    private AutoMoveView f33756F0;

    /* renamed from: F1 */
    private PressButton f33757F1;

    /* renamed from: F2 */
    private final C7953f f33758F2;

    /* renamed from: G0 */
    private AutoMoveView f33759G0;

    /* renamed from: G1 */
    private PressButton f33760G1;

    /* renamed from: G2 */
    C7953f f33761G2;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public AutoMoveView[] f33762H0;

    /* renamed from: H1 */
    private PressButton f33763H1;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public VerticalSeekBar[] f33764I0;

    /* renamed from: I1 */
    private PressButton f33765I1;

    /* renamed from: J0 */
    private Vibrator f33766J0;

    /* renamed from: J1 */
    private LinearLayout f33767J1;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public boolean f33768K0 = false;

    /* renamed from: K1 */
    private LinearLayout f33769K1;

    /* renamed from: L0 */
    private PressButton f33770L0;

    /* renamed from: L1 */
    private LinearLayout f33771L1;

    /* renamed from: M0 */
    private PressButton f33772M0;

    /* renamed from: M1 */
    private LinearLayout f33773M1;

    /* renamed from: N0 */
    private PressButton f33774N0;

    /* renamed from: N1 */
    private LinearLayout f33775N1;

    /* renamed from: O0 */
    private PressButton f33776O0;

    /* renamed from: O1 */
    private LinearLayout f33777O1;

    /* renamed from: P0 */
    private PressButton f33778P0;

    /* renamed from: P1 */
    private LinearLayout f33779P1;

    /* renamed from: Q0 */
    private PressButton f33780Q0;

    /* renamed from: Q1 */
    private LinearLayout f33781Q1;

    /* renamed from: R0 */
    private PressButton f33782R0;

    /* renamed from: R1 */
    private LinearLayout f33783R1;

    /* renamed from: S0 */
    private PressButton f33784S0;

    /* renamed from: S1 */
    private LinearLayout f33785S1;

    /* renamed from: T0 */
    private PressButton f33786T0;

    /* renamed from: T1 */
    private LinearLayout f33787T1;

    /* renamed from: U0 */
    private PressButton f33788U0;

    /* renamed from: U1 */
    private ImageView[] f33789U1;

    /* renamed from: V0 */
    private PressButton f33790V0;

    /* renamed from: V1 */
    private ImageView f33791V1;

    /* renamed from: W0 */
    private PressButton f33792W0;

    /* renamed from: W1 */
    private ImageView f33793W1;

    /* renamed from: X0 */
    private PressButton[] f33794X0;

    /* renamed from: X1 */
    private ImageView f33795X1;

    /* renamed from: Y0 */
    private OpenCloseLayout f33796Y0;

    /* renamed from: Y1 */
    private ImageView f33797Y1;

    /* renamed from: Z0 */
    private OpenCloseLayout f33798Z0;

    /* renamed from: Z1 */
    private ImageView f33799Z1;

    /* renamed from: a1 */
    private OpenCloseLayout f33800a1;

    /* renamed from: a2 */
    private ImageView f33801a2;

    /* renamed from: b1 */
    Float f33802b1;

    /* renamed from: b2 */
    private ImageView f33803b2;

    /* renamed from: c1 */
    int f33804c1;

    /* renamed from: c2 */
    private ImageView f33805c2;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public OpenCloseLayout f33806d0;

    /* renamed from: d1 */
    private int f33807d1;

    /* renamed from: d2 */
    private ImageView f33808d2;

    /* renamed from: e0 */
    private OpenCloseLayout f33809e0;
    /* access modifiers changed from: private */

    /* renamed from: e1 */
    public SeekBar f33810e1;

    /* renamed from: e2 */
    private ImageView f33811e2;

    /* renamed from: f0 */
    private OpenCloseLayout f33812f0;
    /* access modifiers changed from: private */

    /* renamed from: f1 */
    public SeekBar f33813f1;

    /* renamed from: f2 */
    private ImageView f33814f2;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public RotatView f33815g0;

    /* renamed from: g1 */
    private RotatView f33816g1;
    /* access modifiers changed from: private */

    /* renamed from: g2 */
    public LinearLayout[] f33817g2;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public RotatView f33818h0;

    /* renamed from: h1 */
    private RotatView f33819h1;
    /* access modifiers changed from: private */

    /* renamed from: h2 */
    public HorizontalScrollView f33820h2;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public ArcProgressView f33821i0;

    /* renamed from: i1 */
    private TextView f33822i1;

    /* renamed from: i2 */
    private TextView f33823i2;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public ArcProgressView f33824j0;

    /* renamed from: j1 */
    private TextView f33825j1;

    /* renamed from: j2 */
    public int f33826j2;

    /* renamed from: k0 */
    private ArcProgressView f33827k0;
    /* access modifiers changed from: private */

    /* renamed from: k1 */
    public ArcProgressView f33828k1;

    /* renamed from: k2 */
    private C7972b f33829k2;

    /* renamed from: l0 */
    private ArcProgressView f33830l0;
    /* access modifiers changed from: private */

    /* renamed from: l1 */
    public ArcProgressView f33831l1;

    /* renamed from: l2 */
    public List<C7408a> f33832l2;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public C8337n f33833m0;

    /* renamed from: m1 */
    private ArcProgressView f33834m1;

    /* renamed from: m2 */
    public List<C7408a> f33835m2;

    /* renamed from: n0 */
    private VerticalSeekBar f33836n0;

    /* renamed from: n1 */
    private ArcProgressView f33837n1;

    /* renamed from: n2 */
    public float[] f33838n2;

    /* renamed from: o0 */
    private VerticalSeekBar f33839o0;

    /* renamed from: o1 */
    private PressButton f33840o1;

    /* renamed from: o2 */
    private String f33841o2;

    /* renamed from: p0 */
    private VerticalSeekBar f33842p0;

    /* renamed from: p1 */
    private PressButton f33843p1;

    /* renamed from: p2 */
    private ImageView f33844p2;

    /* renamed from: q0 */
    private VerticalSeekBar f33845q0;

    /* renamed from: q1 */
    private PressButton f33846q1;

    /* renamed from: q2 */
    private boolean f33847q2;

    /* renamed from: r0 */
    private VerticalSeekBar f33848r0;

    /* renamed from: r1 */
    private PressButton f33849r1;

    /* renamed from: r2 */
    private SeekBar f33850r2;

    /* renamed from: s0 */
    private VerticalSeekBar f33851s0;

    /* renamed from: s1 */
    private PressButton f33852s1;

    /* renamed from: s2 */
    private SoundEffect f33853s2;

    /* renamed from: t0 */
    private VerticalSeekBar f33854t0;

    /* renamed from: t1 */
    private PressButton f33855t1;

    /* renamed from: t2 */
    private int f33856t2;

    /* renamed from: u0 */
    private VerticalSeekBar f33857u0;

    /* renamed from: u1 */
    private PressButton f33858u1;

    /* renamed from: u2 */
    private int f33859u2;

    /* renamed from: v0 */
    private VerticalSeekBar f33860v0;

    /* renamed from: v1 */
    private PressButton f33861v1;

    /* renamed from: v2 */
    public boolean f33862v2;

    /* renamed from: w0 */
    private VerticalSeekBar f33863w0;

    /* renamed from: w1 */
    private PressButton f33864w1;

    /* renamed from: w2 */
    private LinearLayout f33865w2;

    /* renamed from: x0 */
    private AutoMoveView f33866x0;

    /* renamed from: x1 */
    private PressButton f33867x1;

    /* renamed from: x2 */
    private boolean f33868x2;

    /* renamed from: y0 */
    private AutoMoveView f33869y0;

    /* renamed from: y1 */
    private PressButton f33870y1;

    /* renamed from: y2 */
    private SeekBar.OnSeekBarChangeListener f33871y2;

    /* renamed from: z0 */
    private AutoMoveView f33872z0;

    /* renamed from: z1 */
    private PressButton f33873z1;

    /* renamed from: z2 */
    private SeekBar.OnSeekBarChangeListener f33874z2;

    /* renamed from: g.a.a.f.b.b$a */
    /* compiled from: CustomEqFragment */
    class C8013a implements RotatView.C7165b {
        C8013a() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            C8012b.this.m43809T4(true);
            int i = (int) (((((float) ((int) ((f * 100.0f) / 332.0f))) * 0.02f) - 1.0f) * 10.0f);
            float f2 = (float) i;
            C8287e.m45779E0(f2);
            C8012b.this.f33833m0.mo30242p2(f2);
            C8012b.this.m43756A5(i);
        }

        /* renamed from: b */
        public void mo27587b() {
        }

        /* renamed from: c */
        public void mo27588c(float f) {
            C8012b.this.f33831l1.setDegree(f);
            C8012b.this.m43797O5();
        }
    }

    /* renamed from: g.a.a.f.b.b$b */
    /* compiled from: CustomEqFragment */
    class C8014b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: g */
        final /* synthetic */ int f33876g;

        C8014b(int i) {
            this.f33876g = i;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (C8012b.this.f33768K0) {
                C8012b.this.f33762H0[this.f33876g].mo27378r(C8012b.this.f33764I0[this.f33876g], true);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = C8012b.this.f33768K0 = true;
            C8012b.this.m43809T4(true);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (C8012b.this.f33806d0.mo27538d()) {
                C8012b.this.m43846d5(seekBar.getProgress(), this.f33876g, true);
                C8287e.m45839f1();
                C8012b.this.f33762H0[this.f33876g].mo27379s();
            }
        }
    }

    /* renamed from: g.a.a.f.b.b$c */
    /* compiled from: CustomEqFragment */
    class C8015c implements RotatView.C7165b {
        C8015c() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            C8012b.this.m43802Q4(f);
            C8012b.this.f33833m0.mo30282z2(C8012b.this.f33815g0.getDegree());
            C8012b bVar = C8012b.this;
            bVar.m43770E5(bVar.f33815g0.getDegree());
            C8012b.this.m43809T4(true);
        }

        /* renamed from: b */
        public void mo27587b() {
        }

        /* renamed from: c */
        public void mo27588c(float f) {
            C8012b.this.f33821i0.setDegree(f);
            C8012b.this.m43797O5();
        }
    }

    /* renamed from: g.a.a.f.b.b$d */
    /* compiled from: CustomEqFragment */
    class C8016d implements RotatView.C7165b {
        C8016d() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            C8012b.this.m43799P4(f);
            C8012b.this.f33833m0.mo30274x2(C8012b.this.f33818h0.getDegree());
            C8012b bVar = C8012b.this;
            bVar.m43764C5(bVar.f33818h0.getDegree());
            C8012b.this.m43809T4(true);
        }

        /* renamed from: b */
        public void mo27587b() {
        }

        /* renamed from: c */
        public void mo27588c(float f) {
            C8012b.this.f33824j0.setDegree(f);
            C8012b.this.m43797O5();
        }
    }

    /* renamed from: g.a.a.f.b.b$e */
    /* compiled from: CustomEqFragment */
    class C8017e extends C7953f {
        C8017e() {
        }

        /* renamed from: b */
        public void mo29484b(boolean z, boolean z2) {
            C8012b.this.m43763C4(z, z2);
        }

        /* renamed from: e */
        public void mo29487e(boolean z, boolean z2) {
            C8012b.this.m43812U4(z, z2);
        }

        /* renamed from: f */
        public void mo29488f(boolean z, boolean z2) {
            C8012b.this.m43815V4(z, z2);
        }
    }

    /* renamed from: g.a.a.f.b.b$f */
    /* compiled from: CustomEqFragment */
    class C8018f extends C7953f {
        C8018f() {
        }

        /* renamed from: a */
        public void mo29483a(boolean z, boolean z2) {
            C8012b.this.m43838b5(z, z2);
            C8012b bVar = C8012b.this;
            bVar.m43794N5(bVar.f33810e1, z);
            C8012b bVar2 = C8012b.this;
            bVar2.m43894p5(bVar2.f33813f1, z);
            C8012b.this.m43772F5(z);
            C8012b.this.f33833m0.mo30144R1(z);
            if (z2) {
                int Q = C8012b.this.f33833m0.mo30138Q();
                boolean z3 = Q != 54;
                if (z) {
                    if (z3) {
                        C8012b.this.m43774G5(Q);
                    } else {
                        C8287e.m45803Q0(C8012b.this.f33833m0.mo30163W0());
                        C8287e.m45797N0(C8012b.this.f33833m0.mo30159V0());
                        C8012b bVar3 = C8012b.this;
                        bVar3.m43780I5(bVar3.f33833m0.mo30163W0());
                        C8012b bVar4 = C8012b.this;
                        bVar4.m43777H5(bVar4.f33833m0.mo30159V0());
                    }
                } else if (!z3) {
                    float progress = (float) (C8012b.this.f33810e1.getProgress() - (C8012b.this.f33810e1.getMax() / 2));
                    int progress2 = C8012b.this.f33813f1.getProgress();
                    C8012b bVar5 = C8012b.this;
                    float f = (float) (progress2 + bVar5.f33804c1);
                    bVar5.f33833m0.mo30169X2(progress);
                    C8012b.this.f33833m0.mo30165W2(f);
                    C8012b.this.m43780I5(progress);
                    C8012b.this.m43777H5(f);
                }
                C8012b.this.m43809T4(z2);
            }
            C8012b.this.mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.main_page_tempo_val"));
        }

        /* renamed from: c */
        public void mo29485c(boolean z, boolean z2) {
            C8012b.this.m43854f5(z, z2);
        }

        /* renamed from: d */
        public void mo29486d(boolean z, boolean z2) {
            C8012b.this.m43858g5(z, z2);
        }

        /* renamed from: g */
        public void mo29489g(boolean z, boolean z2) {
            C8012b.this.m43806R5(z);
        }
    }

    /* renamed from: g.a.a.f.b.b$g */
    /* compiled from: CustomEqFragment */
    class C8019g extends C9490s {
        C8019g() {
        }

        /* renamed from: e */
        public void mo26768e() {
            super.mo26768e();
            C8012b.this.m43921w4();
        }
    }

    /* renamed from: g.a.a.f.b.b$h */
    /* compiled from: CustomEqFragment */
    class C8020h implements View.OnClickListener {
        C8020h() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.iv_volume_booster_button) {
                C8012b.this.m43765C6();
            } else if (id != R.id.ll_preset_classical) {
                switch (id) {
                    case R.id.auto_wah_fast:
                        C8012b.this.m43816V5();
                        return;
                    case R.id.auto_wah_hit_fast:
                        C8012b.this.m43819W5();
                        return;
                    case R.id.auto_wah_slow:
                        C8012b.this.m43823X5();
                        return;
                    default:
                        switch (id) {
                            case R.id.chorus_Devil:
                                C8012b.this.m43839b6();
                                return;
                            case R.id.chorus_airplance:
                                C8012b.this.m43831Z5();
                                return;
                            case R.id.chorus_chipmunk:
                                C8012b.this.m43835a6();
                                return;
                            case R.id.chorus_egr:
                                C8012b.this.m43843c6();
                                return;
                            case R.id.chorus_flanger:
                                C8012b.this.m43847d6();
                                return;
                            case R.id.chorus_motocycle:
                                C8012b.this.m43851e6();
                                return;
                            case R.id.chorus_voices:
                                C8012b.this.m43855f6();
                                return;
                            case R.id.chorus_water:
                                C8012b.this.m43859g6();
                                return;
                            default:
                                switch (id) {
                                    case R.id.compress_hard:
                                        C8012b.this.m43867i6();
                                        return;
                                    case R.id.compress_soft:
                                        C8012b.this.m43871j6();
                                        return;
                                    default:
                                        switch (id) {
                                            case R.id.ll_preset_dance:
                                                C8012b.this.m43862h5(1);
                                                return;
                                            case R.id.ll_preset_flat:
                                                C8012b.this.m43862h5(6);
                                                return;
                                            case R.id.ll_preset_folk:
                                                C8012b.this.m43862h5(2);
                                                return;
                                            case R.id.ll_preset_heavy_metal:
                                                C8012b.this.m43862h5(7);
                                                return;
                                            case R.id.ll_preset_hip_hop:
                                                C8012b.this.m43862h5(3);
                                                return;
                                            case R.id.ll_preset_jazz:
                                                C8012b.this.m43862h5(8);
                                                return;
                                            case R.id.ll_preset_normal:
                                                C8012b.this.m43862h5(0);
                                                return;
                                            case R.id.ll_preset_pop:
                                                C8012b.this.m43862h5(4);
                                                return;
                                            case R.id.ll_preset_rock:
                                                C8012b.this.m43862h5(9);
                                                return;
                                            default:
                                                switch (id) {
                                                    case R.id.pharse_basic:
                                                        C8012b.this.m43883m6();
                                                        return;
                                                    case R.id.pharse_fast:
                                                        C8012b.this.m43887n6();
                                                        return;
                                                    case R.id.pharse_invert:
                                                        C8012b.this.m43891o6();
                                                        return;
                                                    case R.id.pharse_med:
                                                        C8012b.this.m43895p6();
                                                        return;
                                                    case R.id.pharse_slow_shift:
                                                        C8012b.this.m43903r6();
                                                        return;
                                                    case R.id.pharse_tremolo:
                                                        C8012b.this.m43907s6();
                                                        return;
                                                    case R.id.pharse_wfb:
                                                        C8012b.this.m43911t6();
                                                        return;
                                                    case R.id.phaser_shift:
                                                        C8012b.this.m43899q6();
                                                        return;
                                                    default:
                                                        switch (id) {
                                                            case R.id.timbre_abound:
                                                                C8012b.this.m43757A6();
                                                                return;
                                                            case R.id.timbre_amiable:
                                                                C8012b.this.m43761B6();
                                                                return;
                                                            case R.id.timbre_bright:
                                                                C8012b.this.m43827Y5();
                                                                return;
                                                            case R.id.timbre_coloratura:
                                                                C8012b.this.m43863h6();
                                                                return;
                                                            case R.id.timbre_crisp:
                                                                C8012b.this.m43875k6();
                                                                return;
                                                            case R.id.timbre_express:
                                                                C8012b.this.m43879l6();
                                                                return;
                                                            case R.id.timbre_resonant:
                                                                C8012b.this.m43915u6();
                                                                return;
                                                            case R.id.timbre_rude:
                                                                C8012b.this.m43932z6();
                                                                return;
                                                            case R.id.timbre_solid:
                                                                C8012b.this.m43919v6();
                                                                return;
                                                            case R.id.timbre_steady:
                                                                C8012b.this.m43923w6();
                                                                return;
                                                            case R.id.timbre_strong:
                                                                C8012b.this.m43926x6();
                                                                return;
                                                            case R.id.timbre_tall:
                                                                C8012b.this.m43929y6();
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                C8012b.this.m43862h5(5);
            }
        }
    }

    /* renamed from: g.a.a.f.b.b$i */
    /* compiled from: CustomEqFragment */
    class C8021i implements SeekBar.OnSeekBarChangeListener {
        C8021i(C8012b bVar) {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C8287e.m45801P0(i);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: g.a.a.f.b.b$j */
    /* compiled from: CustomEqFragment */
    class C8022j implements Runnable {

        /* renamed from: g */
        final /* synthetic */ boolean f33884g;

        C8022j(boolean z) {
            this.f33884g = z;
        }

        public void run() {
            float f = this.f33884g ? 1.0f : 0.8f;
            C8287e.m45809T0(f);
            C8012b.this.f33833m0.mo30177Z2(f);
            C8012b.this.f33833m0.mo30182a3(this.f33884g);
            C8012b.this.f33833m0.mo30124M1(this.f33884g);
            C8012b.this.m43783J5(this.f33884g);
        }
    }

    /* renamed from: g.a.a.f.b.b$k */
    /* compiled from: CustomEqFragment */
    class C8023k implements Runnable {

        /* renamed from: g */
        final /* synthetic */ int f33886g;

        C8023k(int i) {
            this.f33886g = i;
        }

        public void run() {
            C8012b.this.f33820h2.smoothScrollTo(C8012b.this.f33817g2[this.f33886g].getLeft() - ((C9566f.f36725a / 2) - (C8012b.this.f33817g2[this.f33886g].getWidth() / 2)), 0);
        }
    }

    /* renamed from: g.a.a.f.b.b$l */
    /* compiled from: CustomEqFragment */
    class C8024l implements Runnable {
        C8024l() {
        }

        public void run() {
            C8012b.this.f33820h2.fullScroll(66);
        }
    }

    /* renamed from: g.a.a.f.b.b$m */
    /* compiled from: CustomEqFragment */
    class C8025m implements SeekBar.OnSeekBarChangeListener {
        C8025m() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            boolean P = C8012b.this.f33833m0.mo30134P();
            if (P) {
                C8012b.this.m43792M5(seekBar, P);
                C8012b.this.m43797O5();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C8012b.this.m43809T4(true);
            C8012b.this.f33833m0.mo30148S1(54);
            C8012b.this.m43774G5(54);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C8012b.this.mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.main_page_tempo_val"));
        }
    }

    /* renamed from: g.a.a.f.b.b$n */
    /* compiled from: CustomEqFragment */
    class C8026n implements SeekBar.OnSeekBarChangeListener {
        C8026n() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            boolean P = C8012b.this.f33833m0.mo30134P();
            if (P) {
                C8012b.this.m43898q5(seekBar, P);
                C8012b.this.m43797O5();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C8012b.this.m43809T4(true);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: g.a.a.f.b.b$o */
    /* compiled from: CustomEqFragment */
    class C8027o implements RotatView.C7165b {
        C8027o() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            C8012b.this.m43809T4(true);
            float f2 = (((float) ((int) ((f * 100.0f) / 332.0f))) * 0.02f) - 1.0f;
            C8287e.m45775C0(f2);
            C8012b.this.f33833m0.mo30234n2(f2);
            C8012b.this.m43925x5(f2);
        }

        /* renamed from: b */
        public void mo27587b() {
        }

        /* renamed from: c */
        public void mo27588c(float f) {
            C8012b.this.f33828k1.setDegree(f);
            C8012b.this.m43797O5();
        }
    }

    public C8012b() {
        Float valueOf = Float.valueOf(44100.0f);
        this.f33802b1 = valueOf;
        this.f33804c1 = (int) (valueOf.floatValue() * 0.7f);
        this.f33807d1 = 38;
        this.f33832l2 = null;
        this.f33835m2 = null;
        this.f33838n2 = new float[10];
        this.f33847q2 = false;
        this.f33856t2 = -1;
        this.f33859u2 = -1;
        this.f33862v2 = false;
        this.f33868x2 = false;
        this.f33871y2 = new C8021i(this);
        this.f33874z2 = new C8025m();
        this.f33743A2 = new C8026n();
        this.f33746B2 = new C8027o();
        this.f33749C2 = new C8013a();
        this.f33752D2 = new C8015c();
        this.f33755E2 = new C8016d();
        this.f33758F2 = new C8017e();
        this.f33761G2 = new C8018f();
    }

    /* renamed from: A4 */
    private void m43755A4() {
        m43764C5(this.f33818h0.getDegree());
        this.f33833m0.mo30274x2(this.f33818h0.getDegree());
        C8287e.m45852k0();
    }

    /* access modifiers changed from: private */
    /* renamed from: A5 */
    public void m43756A5(int i) {
        this.f33853s2.mo27033l0(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: A6 */
    public void m43757A6() {
        m43809T4(true);
    }

    /* renamed from: B4 */
    private void m43759B4() {
        this.f33833m0.mo30282z2(this.f33815g0.getDegree());
        m43770E5(this.f33815g0.getDegree());
        C8287e.m45854l0();
    }

    /* renamed from: B5 */
    private void m43760B5(boolean z) {
        this.f33853s2.mo27039o0(z ? 1 : 0);
        this.f33833m0.mo30080B1(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: B6 */
    public void m43761B6() {
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public void m43763C4(boolean z, boolean z2) {
        C8287e.m45878x0(z);
        this.f33833m0.mo30229m1(z);
        int i = 0;
        if (z) {
            mo29565y4(false);
        } else if (z2) {
            m43822X4();
        }
        while (true) {
            VerticalSeekBar[] verticalSeekBarArr = this.f33764I0;
            if (i < verticalSeekBarArr.length) {
                verticalSeekBarArr[i].setEnabled(z);
                i++;
            } else {
                m43914u5(z);
                m43866i5(this.f33826j2, z);
                m43809T4(z2);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C5 */
    public void m43764C5(float f) {
        this.f33853s2.mo27037n0((int) f);
    }

    /* access modifiers changed from: private */
    /* renamed from: C6 */
    public void m43765C6() {
        boolean z = !this.f33847q2;
        this.f33847q2 = z;
        m43800P5(z);
    }

    /* renamed from: D5 */
    private void m43767D5(boolean z) {
        this.f33853s2.mo27043q0(z ? 1 : 0);
        this.f33833m0.mo30084C1(z);
    }

    /* renamed from: E4 */
    private void m43769E4() {
        Bundle V = mo3638V();
        this.f33856t2 = V.getInt("pageType", -1);
        this.f33859u2 = V.getInt("editSoundEffectId", -1);
        V.getBoolean("isSystem", false);
        V.getBoolean("sideBar", false);
        if (this.f33856t2 == -1) {
            Toast.makeText(mo3606L(), R.string.error, 0).show();
            if (mo3606L() != null) {
                mo3606L().finish();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E5 */
    public void m43770E5(float f) {
        this.f33853s2.mo27041p0((int) f);
    }

    /* access modifiers changed from: private */
    /* renamed from: F5 */
    public void m43772F5(boolean z) {
        this.f33853s2.mo27055w0(z ? 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: G5 */
    public void m43774G5(int i) {
        this.f33853s2.mo27058x0(i);
        this.f33833m0.mo30153T2(i);
    }

    /* renamed from: H4 */
    private void m43776H4() {
        if (this.f33865w2 != null) {
            AdHelper.m49536p().mo32442c(mo3651a0(), this.f33865w2, new C8019g());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H5 */
    public void m43777H5(float f) {
        this.f33853s2.mo27047s0((int) f);
    }

    /* renamed from: I4 */
    private void m43779I4() {
        this.f33853s2 = new SoundEffect();
        this.f33766J0 = (Vibrator) mo3606L().getSystemService("vibrator");
        this.f33833m0 = C8337n.m46065k0(mo3606L());
        this.f33804c1 = (int) (this.f33802b1.floatValue() * 0.7f);
        this.f33807d1 = this.f33833m0.mo30138Q();
        C7972b bVar = new C7972b(C8345u.m46327h());
        this.f33829k2 = bVar;
        this.f33832l2 = bVar.mo29501c();
        this.f33835m2 = this.f33829k2.mo29501c();
        mo29565y4(true);
        m43785K4();
        m43782J4();
    }

    /* access modifiers changed from: private */
    /* renamed from: I5 */
    public void m43780I5(float f) {
        this.f33853s2.mo27053v0((int) f);
    }

    /* renamed from: J4 */
    private void m43782J4() {
        this.f33840o1.setType((byte) 1);
        this.f33843p1.setType((byte) 2);
        this.f33846q1.setType((byte) 3);
        this.f33849r1.setType((byte) 1);
        this.f33852s1.setType((byte) 2);
        this.f33855t1.setType((byte) 3);
        this.f33858u1.setType((byte) 4);
        this.f33861v1.setType((byte) 5);
        this.f33864w1.setType((byte) 6);
        this.f33867x1.setType((byte) 7);
        this.f33870y1.setType((byte) 8);
        this.f33873z1.setType((byte) 1);
        this.f33742A1.setType((byte) 2);
        this.f33745B1.setType((byte) 3);
        this.f33748C1.setType((byte) 4);
        this.f33751D1.setType((byte) 5);
        this.f33754E1.setType((byte) 6);
        this.f33757F1.setType((byte) 7);
        this.f33760G1.setType((byte) 8);
        this.f33763H1.setType((byte) 19);
        this.f33765I1.setType((byte) 20);
    }

    /* access modifiers changed from: private */
    /* renamed from: J5 */
    public void m43783J5(boolean z) {
        this.f33853s2.mo27062z0(z ? 1 : 0);
    }

    /* renamed from: K4 */
    private void m43785K4() {
        this.f33770L0.setType((byte) 24);
        this.f33772M0.setType((byte) 25);
        this.f33774N0.setType((byte) 32);
        this.f33776O0.setType((byte) 33);
        this.f33778P0.setType((byte) 34);
        this.f33780Q0.setType((byte) 35);
        PressButton pressButton = this.f33782R0;
        this.f33794X0 = new PressButton[]{this.f33770L0, this.f33772M0, this.f33774N0, this.f33776O0, this.f33778P0, this.f33780Q0, pressButton, this.f33784S0, this.f33786T0, this.f33788U0, this.f33790V0, this.f33792W0};
        pressButton.setType((byte) 39);
        this.f33784S0.setType((byte) 40);
        this.f33786T0.setType((byte) 41);
        this.f33788U0.setType((byte) 48);
        this.f33790V0.setType((byte) 49);
        this.f33792W0.setType((byte) 51);
    }

    /* renamed from: K5 */
    private void m43786K5() {
        this.f33806d0.setType(1);
        this.f33809e0.setType(2);
        this.f33812f0.setType(3);
    }

    /* renamed from: L4 */
    private View m43788L4() {
        View inflate = View.inflate(mo3606L(), R.layout.fragment_customeq, (ViewGroup) null);
        this.f33810e1 = (SeekBar) inflate.findViewById(R.id.seekbar_tempo);
        this.f33813f1 = (SeekBar) inflate.findViewById(R.id.seekbar_simpelerate);
        this.f33816g1 = (RotatView) inflate.findViewById(R.id.rv_balance);
        this.f33819h1 = (RotatView) inflate.findViewById(R.id.rv_pitch);
        this.f33822i1 = (TextView) inflate.findViewById(R.id.tempo_value);
        this.f33825j1 = (TextView) inflate.findViewById(R.id.simpelerate_value);
        this.f33828k1 = (ArcProgressView) inflate.findViewById(R.id.ac_balance_level);
        this.f33831l1 = (ArcProgressView) inflate.findViewById(R.id.ac_pitch_level);
        this.f33770L0 = (PressButton) inflate.findViewById(R.id.timbre_rude);
        this.f33772M0 = (PressButton) inflate.findViewById(R.id.timbre_solid);
        this.f33774N0 = (PressButton) inflate.findViewById(R.id.timbre_abound);
        this.f33776O0 = (PressButton) inflate.findViewById(R.id.timbre_strong);
        this.f33778P0 = (PressButton) inflate.findViewById(R.id.timbre_steady);
        this.f33780Q0 = (PressButton) inflate.findViewById(R.id.timbre_resonant);
        this.f33782R0 = (PressButton) inflate.findViewById(R.id.timbre_amiable);
        this.f33784S0 = (PressButton) inflate.findViewById(R.id.timbre_tall);
        this.f33786T0 = (PressButton) inflate.findViewById(R.id.timbre_coloratura);
        this.f33788U0 = (PressButton) inflate.findViewById(R.id.timbre_crisp);
        this.f33790V0 = (PressButton) inflate.findViewById(R.id.timbre_bright);
        this.f33792W0 = (PressButton) inflate.findViewById(R.id.timbre_express);
        OpenCloseLayout openCloseLayout = (OpenCloseLayout) inflate.findViewById(R.id.effect_switch);
        this.f33796Y0 = openCloseLayout;
        openCloseLayout.setType(4);
        OpenCloseLayout openCloseLayout2 = (OpenCloseLayout) inflate.findViewById(R.id.balance_switch);
        this.f33798Z0 = openCloseLayout2;
        openCloseLayout2.setType(5);
        this.f33844p2 = (ImageView) inflate.findViewById(R.id.iv_volume_booster_button);
        OpenCloseLayout openCloseLayout3 = (OpenCloseLayout) inflate.findViewById(R.id.pitch_switch);
        this.f33800a1 = openCloseLayout3;
        openCloseLayout3.setType(7);
        this.f33840o1 = (PressButton) inflate.findViewById(R.id.auto_wah_slow);
        this.f33843p1 = (PressButton) inflate.findViewById(R.id.auto_wah_fast);
        this.f33846q1 = (PressButton) inflate.findViewById(R.id.auto_wah_hit_fast);
        this.f33849r1 = (PressButton) inflate.findViewById(R.id.phaser_shift);
        this.f33852s1 = (PressButton) inflate.findViewById(R.id.pharse_slow_shift);
        this.f33855t1 = (PressButton) inflate.findViewById(R.id.pharse_basic);
        this.f33858u1 = (PressButton) inflate.findViewById(R.id.pharse_wfb);
        this.f33861v1 = (PressButton) inflate.findViewById(R.id.pharse_med);
        this.f33864w1 = (PressButton) inflate.findViewById(R.id.pharse_fast);
        this.f33867x1 = (PressButton) inflate.findViewById(R.id.pharse_invert);
        this.f33870y1 = (PressButton) inflate.findViewById(R.id.pharse_tremolo);
        this.f33873z1 = (PressButton) inflate.findViewById(R.id.chorus_flanger);
        this.f33742A1 = (PressButton) inflate.findViewById(R.id.chorus_egr);
        this.f33745B1 = (PressButton) inflate.findViewById(R.id.chorus_motocycle);
        this.f33748C1 = (PressButton) inflate.findViewById(R.id.chorus_Devil);
        this.f33751D1 = (PressButton) inflate.findViewById(R.id.chorus_voices);
        this.f33754E1 = (PressButton) inflate.findViewById(R.id.chorus_chipmunk);
        this.f33757F1 = (PressButton) inflate.findViewById(R.id.chorus_water);
        this.f33760G1 = (PressButton) inflate.findViewById(R.id.chorus_airplance);
        this.f33763H1 = (PressButton) inflate.findViewById(R.id.compress_soft);
        this.f33765I1 = (PressButton) inflate.findViewById(R.id.compress_hard);
        this.f33767J1 = (LinearLayout) inflate.findViewById(R.id.ll_preset_normal);
        this.f33769K1 = (LinearLayout) inflate.findViewById(R.id.ll_preset_dance);
        this.f33771L1 = (LinearLayout) inflate.findViewById(R.id.ll_preset_folk);
        this.f33773M1 = (LinearLayout) inflate.findViewById(R.id.ll_preset_hip_hop);
        this.f33775N1 = (LinearLayout) inflate.findViewById(R.id.ll_preset_pop);
        this.f33777O1 = (LinearLayout) inflate.findViewById(R.id.ll_preset_classical);
        this.f33779P1 = (LinearLayout) inflate.findViewById(R.id.ll_preset_flat);
        this.f33781Q1 = (LinearLayout) inflate.findViewById(R.id.ll_preset_heavy_metal);
        this.f33783R1 = (LinearLayout) inflate.findViewById(R.id.ll_preset_jazz);
        this.f33785S1 = (LinearLayout) inflate.findViewById(R.id.ll_preset_rock);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_preset_customize);
        this.f33787T1 = linearLayout;
        this.f33817g2 = new LinearLayout[]{this.f33767J1, this.f33769K1, this.f33771L1, this.f33773M1, this.f33775N1, this.f33777O1, this.f33779P1, this.f33781Q1, this.f33783R1, this.f33785S1, linearLayout};
        this.f33791V1 = (ImageView) inflate.findViewById(R.id.iv_preset_normal);
        this.f33793W1 = (ImageView) inflate.findViewById(R.id.iv_preset_dance);
        this.f33795X1 = (ImageView) inflate.findViewById(R.id.iv_preset_folk);
        this.f33797Y1 = (ImageView) inflate.findViewById(R.id.iv_preset_hip_hop);
        this.f33799Z1 = (ImageView) inflate.findViewById(R.id.iv_preset_pop);
        this.f33801a2 = (ImageView) inflate.findViewById(R.id.iv_preset_classical);
        this.f33803b2 = (ImageView) inflate.findViewById(R.id.iv_preset_flat);
        this.f33805c2 = (ImageView) inflate.findViewById(R.id.iv_preset_heavy_metal);
        this.f33808d2 = (ImageView) inflate.findViewById(R.id.iv_preset_jazz);
        this.f33811e2 = (ImageView) inflate.findViewById(R.id.iv_preset_rock);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_preset_customize);
        this.f33814f2 = imageView;
        this.f33789U1 = new ImageView[]{this.f33791V1, this.f33793W1, this.f33795X1, this.f33797Y1, this.f33799Z1, this.f33801a2, this.f33803b2, this.f33805c2, this.f33808d2, this.f33811e2, imageView};
        this.f33820h2 = (HorizontalScrollView) inflate.findViewById(R.id.horizontal_preset);
        this.f33823i2 = (TextView) inflate.findViewById(R.id.tv_custom);
        this.f33806d0 = (OpenCloseLayout) inflate.findViewById(R.id.equalizer_swicth);
        this.f33809e0 = (OpenCloseLayout) inflate.findViewById(R.id.switch_rotate);
        this.f33812f0 = (OpenCloseLayout) inflate.findViewById(R.id.switch_reverse);
        this.f33836n0 = (VerticalSeekBar) inflate.findViewById(R.id.bar1);
        this.f33839o0 = (VerticalSeekBar) inflate.findViewById(R.id.bar2);
        this.f33842p0 = (VerticalSeekBar) inflate.findViewById(R.id.bar3);
        this.f33845q0 = (VerticalSeekBar) inflate.findViewById(R.id.bar4);
        this.f33848r0 = (VerticalSeekBar) inflate.findViewById(R.id.bar5);
        this.f33851s0 = (VerticalSeekBar) inflate.findViewById(R.id.bar6);
        this.f33854t0 = (VerticalSeekBar) inflate.findViewById(R.id.bar7);
        this.f33857u0 = (VerticalSeekBar) inflate.findViewById(R.id.bar8);
        this.f33860v0 = (VerticalSeekBar) inflate.findViewById(R.id.bar9);
        this.f33863w0 = (VerticalSeekBar) inflate.findViewById(R.id.bar10);
        this.f33866x0 = (AutoMoveView) inflate.findViewById(R.id.follow_txtbass_1);
        this.f33869y0 = (AutoMoveView) inflate.findViewById(R.id.follow_txtbass_2);
        this.f33872z0 = (AutoMoveView) inflate.findViewById(R.id.follow_txtbass_3);
        this.f33741A0 = (AutoMoveView) inflate.findViewById(R.id.follow_txtbass_4);
        this.f33744B0 = (AutoMoveView) inflate.findViewById(R.id.follow_txtbass_5);
        this.f33747C0 = (AutoMoveView) inflate.findViewById(R.id.follow_txtbass_6);
        this.f33750D0 = (AutoMoveView) inflate.findViewById(R.id.follow_txtbass_7);
        this.f33753E0 = (AutoMoveView) inflate.findViewById(R.id.follow_txtbass_8);
        this.f33756F0 = (AutoMoveView) inflate.findViewById(R.id.follow_txtbass_9);
        AutoMoveView autoMoveView = (AutoMoveView) inflate.findViewById(R.id.follow_txtbass_10);
        this.f33759G0 = autoMoveView;
        this.f33762H0 = new AutoMoveView[]{this.f33866x0, this.f33869y0, this.f33872z0, this.f33741A0, this.f33744B0, this.f33747C0, this.f33750D0, this.f33753E0, this.f33756F0, autoMoveView};
        this.f33815g0 = (RotatView) inflate.findViewById(R.id.rv_rotate);
        this.f33818h0 = (RotatView) inflate.findViewById(R.id.rv_reverse);
        this.f33824j0 = (ArcProgressView) inflate.findViewById(R.id.ac_reverse_level);
        this.f33821i0 = (ArcProgressView) inflate.findViewById(R.id.ac_rotate_level);
        this.f33827k0 = (ArcProgressView) inflate.findViewById(R.id.ac_rotate_bg);
        this.f33830l0 = (ArcProgressView) inflate.findViewById(R.id.ac_reverse_bg);
        this.f33834m1 = (ArcProgressView) inflate.findViewById(R.id.ac_balance_bg);
        this.f33837n1 = (ArcProgressView) inflate.findViewById(R.id.ac_pitch_bg);
        this.f33850r2 = (SeekBar) inflate.findViewById(R.id.seekbar_volume);
        this.f33865w2 = (LinearLayout) inflate.findViewById(R.id.ad_layout);
        this.f33764I0 = new VerticalSeekBar[]{this.f33836n0, this.f33839o0, this.f33842p0, this.f33845q0, this.f33848r0, this.f33851s0, this.f33854t0, this.f33857u0, this.f33860v0, this.f33863w0};
        this.f33806d0.setOnEqSwitchCallBack(this.f33758F2);
        this.f33809e0.setOnEqSwitchCallBack(this.f33758F2);
        this.f33812f0.setOnEqSwitchCallBack(this.f33758F2);
        return inflate;
    }

    /* renamed from: L5 */
    private void m43789L5() {
        boolean P = this.f33833m0.mo30134P();
        m43794N5(this.f33810e1, P);
        m43894p5(this.f33813f1, P);
        this.f33796Y0.setOnEqSwitchCallBack(this.f33761G2);
        this.f33796Y0.mo27539f(P, false);
        boolean q0 = this.f33833m0.mo30244q0();
        this.f33816g1.setEnabled(q0);
        this.f33798Z0.setOnEqSwitchCallBack(this.f33761G2);
        this.f33798Z0.mo27539f(q0, false);
        this.f33833m0.mo30180a1();
        boolean t0 = this.f33833m0.mo30256t0();
        this.f33819h1.setEnabled(t0);
        this.f33800a1.setOnEqSwitchCallBack(this.f33761G2);
        this.f33800a1.mo27539f(t0, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: M4 */
    public /* synthetic */ void mo29559N4(ValueAnimator valueAnimator) {
        try {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            LinearLayout linearLayout = this.f33865w2;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = intValue;
                this.f33865w2.setLayoutParams(layoutParams);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f33868x2 = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: M5 */
    public void m43792M5(SeekBar seekBar, boolean z) {
        float progress = (float) (seekBar.getProgress() - (seekBar.getMax() / 2));
        C8287e.m45803Q0(progress);
        m43780I5(progress);
        this.f33833m0.mo30169X2(progress);
        m43794N5(seekBar, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: N5 */
    public void m43794N5(SeekBar seekBar, boolean z) {
        float floatValue = new BigDecimal((double) ((((float) seekBar.getProgress()) * 2.0f) / ((float) seekBar.getMax()))).setScale(1, 4).floatValue();
        if (floatValue <= 0.1f) {
            floatValue = 0.1f;
        }
        TextView textView = this.f33822i1;
        textView.setText(String.valueOf(floatValue) + "x");
        this.f33822i1.setTextColor(C9332d.m49405b(mo3606L(), z ? R.color.default_text_color : R.color.gray_light));
    }

    /* renamed from: O4 */
    public static C8012b m43796O4(int i, int i2, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        C8012b bVar = new C8012b();
        bundle.putInt("pageType", i);
        bundle.putInt("editSoundEffectId", i2);
        bundle.putBoolean("isSystem", z);
        bundle.putBoolean("sideBar", z2);
        bVar.mo3581C2(bundle);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: O5 */
    public void m43797O5() {
        if (this.f33833m0.mo30167X0()) {
            this.f33766J0.vibrate(new long[]{0, 5}, -1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P4 */
    public void m43799P4(float f) {
        int i = (int) ((f * 20.0f) / 332.0f);
        C8287e.m45787I0((float) (i > 3 ? Math.log(((double) i) / 20.0d) * 20.0d : -96.0d), true);
    }

    /* renamed from: P5 */
    private void m43800P5(boolean z) {
        C8287e.m45809T0(0.0f);
        new Handler().postDelayed(new C8022j(z), 50);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q4 */
    public void m43802Q4(float f) {
        C8287e.m45789J0(((f * 100.0f) / 332.0f) * 0.01f, true);
    }

    /* renamed from: Q5 */
    private void m43803Q5() {
        this.f33850r2.setMax(C8287e.m45786I());
        this.f33850r2.setProgress(C8287e.m45784H());
        this.f33847q2 = this.f33833m0.mo30175Z0();
    }

    /* renamed from: R4 */
    private void m43805R4() {
        if (this.f33859u2 != 0) {
            C8287e.m45852k0();
            C8337n.m46065k0(mo3606L()).mo30270w2(false);
        }
        if (this.f33859u2 != 1) {
            C8287e.m45854l0();
            C8337n.m46065k0(mo3606L()).mo30278y2(false);
        }
        C8287e.m45850j0();
        C8337n.m46065k0(mo3606L()).mo30229m1(false);
        C8337n.m46065k0(mo3606L()).mo30144R1(false);
        C8337n.m46065k0(mo3606L()).mo30246q2(false);
        C8337n.m46065k0(mo3606L()).mo30148S1(38);
        C8337n.m46065k0(mo3606L()).mo30101G2(-1);
        C8337n.m46065k0(mo3606L()).mo30085C2(13230);
        C8337n.m46065k0(mo3606L()).mo30129N2(30);
        if (C8337n.m46065k0(mo3606L()).mo30127N0()) {
            C8337n.m46065k0(mo3606L()).mo30242p2((float) ((int) (((((float) 15) * 0.02f) - 1.0f) * 10.0f)));
            C8287e.m45779E0(0.0f);
        } else if (C8337n.m46065k0(mo3606L()).mo30131O0()) {
            C8337n.m46065k0(mo3606L()).mo30242p2((float) ((int) (((((float) 36) * 0.02f) - 1.0f) * 10.0f)));
            C8287e.m45779E0(0.0f);
        }
        C8287e.m45775C0(0.0f);
        C8337n.m46065k0(mo3606L()).mo30234n2(0.0f);
        C8337n.m46065k0(mo3606L()).mo30238o2(false);
        C8287e.m45779E0(0.0f);
        C8337n.m46065k0(mo3606L()).mo30242p2(0.0f);
        C8287e.m45809T0(0.8f);
        C8337n.m46065k0(mo3606L()).mo30182a3(false);
        this.f33862v2 = true;
        m43779I4();
        m43810T5();
    }

    /* access modifiers changed from: private */
    /* renamed from: R5 */
    public void m43806R5(boolean z) {
        this.f33833m0.mo30187b3(z);
        if (z) {
            C8287e.m45809T0(this.f33833m0.mo30171Y0());
        }
        m43809T4(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: T4 */
    public void m43809T4(boolean z) {
        CustomEqActivity customEqActivity;
        DeepDefaultTitle deepDefaultTitle;
        if (z) {
            this.f33862v2 = true;
            this.f33833m0.mo30101G2(-1);
            if (mo3606L() != null && (mo3606L() instanceof CustomEqActivity) && (customEqActivity = (CustomEqActivity) mo3606L()) != null && (deepDefaultTitle = customEqActivity.f30546z) != null) {
                deepDefaultTitle.setEqSaveIcon(this.f33862v2);
                customEqActivity.mo26594j2(this.f33862v2);
            }
        }
    }

    /* renamed from: T5 */
    private void m43810T5() {
        m43786K5();
        m43870j5();
        m43834a5();
        m43874k5();
        m43882m5();
        m43842c5();
        m43789L5();
        m43850e5();
        m43803Q5();
    }

    /* access modifiers changed from: private */
    /* renamed from: U4 */
    public void m43812U4(boolean z, boolean z2) {
        if (z2) {
            m43878l5(z);
            m43809T4(z2);
        }
    }

    /* renamed from: U5 */
    private void m43813U5() {
        C8020h hVar = new C8020h();
        m43890o5();
        this.f33815g0.setOnChangeListener(this.f33752D2);
        this.f33818h0.setOnChangeListener(this.f33755E2);
        this.f33770L0.setOnClickListener(hVar);
        this.f33772M0.setOnClickListener(hVar);
        this.f33774N0.setOnClickListener(hVar);
        this.f33776O0.setOnClickListener(hVar);
        this.f33778P0.setOnClickListener(hVar);
        this.f33780Q0.setOnClickListener(hVar);
        this.f33782R0.setOnClickListener(hVar);
        this.f33784S0.setOnClickListener(hVar);
        this.f33786T0.setOnClickListener(hVar);
        this.f33788U0.setOnClickListener(hVar);
        this.f33790V0.setOnClickListener(hVar);
        this.f33792W0.setOnClickListener(hVar);
        this.f33816g1.setOnChangeListener(this.f33746B2);
        this.f33819h1.setOnChangeListener(this.f33749C2);
        this.f33810e1.setOnSeekBarChangeListener(this.f33874z2);
        this.f33813f1.setOnSeekBarChangeListener(this.f33743A2);
        this.f33850r2.setOnSeekBarChangeListener(this.f33871y2);
        this.f33840o1.setOnClickListener(hVar);
        this.f33843p1.setOnClickListener(hVar);
        this.f33846q1.setOnClickListener(hVar);
        this.f33849r1.setOnClickListener(hVar);
        this.f33852s1.setOnClickListener(hVar);
        this.f33855t1.setOnClickListener(hVar);
        this.f33858u1.setOnClickListener(hVar);
        this.f33861v1.setOnClickListener(hVar);
        this.f33864w1.setOnClickListener(hVar);
        this.f33867x1.setOnClickListener(hVar);
        this.f33870y1.setOnClickListener(hVar);
        this.f33873z1.setOnClickListener(hVar);
        this.f33742A1.setOnClickListener(hVar);
        this.f33745B1.setOnClickListener(hVar);
        this.f33748C1.setOnClickListener(hVar);
        this.f33751D1.setOnClickListener(hVar);
        this.f33754E1.setOnClickListener(hVar);
        this.f33757F1.setOnClickListener(hVar);
        this.f33760G1.setOnClickListener(hVar);
        this.f33763H1.setOnClickListener(hVar);
        this.f33765I1.setOnClickListener(hVar);
        this.f33767J1.setOnClickListener(hVar);
        this.f33769K1.setOnClickListener(hVar);
        this.f33771L1.setOnClickListener(hVar);
        this.f33773M1.setOnClickListener(hVar);
        this.f33775N1.setOnClickListener(hVar);
        this.f33777O1.setOnClickListener(hVar);
        this.f33779P1.setOnClickListener(hVar);
        this.f33781Q1.setOnClickListener(hVar);
        this.f33783R1.setOnClickListener(hVar);
        this.f33785S1.setOnClickListener(hVar);
        this.f33787T1.setOnClickListener(hVar);
        this.f33844p2.setOnClickListener(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: V4 */
    public void m43815V4(boolean z, boolean z2) {
        if (z2) {
            m43886n5(z);
            m43809T4(z2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V5 */
    public void m43816V5() {
        m43902r5(1);
        m43809T4(true);
    }

    /* renamed from: W4 */
    private void m43818W4() {
        if (this.f33841o2.equals("Custom")) {
            this.f33826j2 = -1;
            this.f33833m0.mo30185b1(((((float) this.f33836n0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33833m0.mo30194d1(((((float) this.f33839o0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33833m0.mo30198e1(((((float) this.f33842p0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33833m0.mo30202f1(((((float) this.f33845q0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33833m0.mo30206g1(((((float) this.f33848r0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33833m0.mo30210h1(((((float) this.f33851s0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33833m0.mo30214i1(((((float) this.f33854t0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33833m0.mo30218j1(((((float) this.f33857u0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33833m0.mo30221k1(((((float) this.f33860v0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33833m0.mo30190c1(((((float) this.f33863w0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
        }
        this.f33833m0.mo30233n1(this.f33826j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: W5 */
    public void m43819W5() {
        m43902r5(0);
        m43809T4(true);
    }

    /* renamed from: X4 */
    private void m43822X4() {
        m43818W4();
        m43826Y4();
    }

    /* access modifiers changed from: private */
    /* renamed from: X5 */
    public void m43823X5() {
        m43902r5(2);
        m43809T4(true);
    }

    /* renamed from: Y4 */
    private void m43826Y4() {
        this.f33833m0.mo30249r1(this.f33815g0.getDegree());
        this.f33833m0.mo30245q1(this.f33818h0.getDegree());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y5 */
    public void m43827Y5() {
        m43809T4(true);
    }

    /* renamed from: Z4 */
    private void m43830Z4(float[] fArr) {
        this.f33768K0 = false;
        if (this.f33764I0 != null) {
            int i = 0;
            while (true) {
                VerticalSeekBar[] verticalSeekBarArr = this.f33764I0;
                if (i < verticalSeekBarArr.length) {
                    int i2 = (int) (((fArr[i] / 1000.0f) + 15.0f) / 0.3f);
                    verticalSeekBarArr[i].setProgress(i2);
                    m43846d5(i2, i, false);
                    i++;
                } else {
                    C8287e.m45839f1();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z5 */
    public void m43831Z5() {
        m43906s5(7);
        m43809T4(true);
    }

    /* renamed from: a5 */
    private void m43834a5() {
        this.f33827k0.setDegree(360.0f);
        this.f33830l0.setDegree(360.0f);
        this.f33815g0.setArc(28);
        this.f33818h0.setArc(28);
        this.f33815g0.setDegree(this.f33833m0.mo30083C0());
        this.f33818h0.setDegree(this.f33833m0.mo30280z0());
        this.f33821i0.setDegree(this.f33833m0.mo30083C0());
        this.f33824j0.setDegree(this.f33833m0.mo30280z0());
        this.f33834m1.setDegree(360.0f);
        this.f33837n1.setDegree(360.0f);
        this.f33816g1.setArc(28);
        this.f33819h1.setArc(28);
        this.f33816g1.setDegree((((this.f33833m0.mo30240p0() + 1.0f) / 0.02f) / 100.0f) * 332.0f);
        this.f33819h1.setDegree(((((this.f33833m0.mo30252s0() / 10.0f) + 1.0f) / 0.02f) * 332.0f) / 100.0f);
        this.f33828k1.setDegree((((this.f33833m0.mo30240p0() + 1.0f) / 0.02f) / 100.0f) * 332.0f);
        this.f33831l1.setDegree(((((this.f33833m0.mo30252s0() / 10.0f) + 1.0f) / 0.02f) * 332.0f) / 100.0f);
        if (this.f33833m0.mo30119L0() == -1) {
            int Q0 = this.f33833m0.mo30139Q0();
            int H0 = this.f33833m0.mo30103H0();
            this.f33810e1.setProgress(Q0);
            this.f33813f1.setProgress(H0);
            return;
        }
        C8287e.m45870t0(this.f33833m0, this.f33810e1, this.f33813f1);
        m43780I5(this.f33833m0.mo30135P0());
        m43777H5(this.f33833m0.mo30107I0());
        m43772F5(this.f33833m0.mo30134P());
        m43774G5(this.f33833m0.mo30138Q());
    }

    /* access modifiers changed from: private */
    /* renamed from: a6 */
    public void m43835a6() {
        m43906s5(5);
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b5 */
    public void m43838b5(boolean z, boolean z2) {
        this.f33810e1.setEnabled(z);
        this.f33813f1.setEnabled(z);
        int i = 0;
        while (true) {
            PressButton[] pressButtonArr = this.f33794X0;
            if (i < pressButtonArr.length) {
                pressButtonArr[i].setEnabled(z);
                this.f33794X0[i].setPressTextColor(z ? C9332d.m49405b(mo3651a0(), R.color.default_text_color) : C8345u.m46326g(R.color.gray_light));
                if (z2) {
                    if (this.f33794X0[i].mo27549a()) {
                        this.f33794X0[i].setPressEnable(z);
                    }
                } else if (this.f33794X0[i].getType() == this.f33807d1) {
                    this.f33794X0[i].setPress(true);
                    this.f33794X0[i].setPressEnable(z);
                } else {
                    this.f33794X0[i].mo27550b(false, z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b6 */
    public void m43839b6() {
        m43906s5(3);
        m43809T4(true);
    }

    /* renamed from: c5 */
    private void m43842c5() {
        this.f33806d0.mo27539f(this.f33833m0.mo30126N(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c6 */
    public void m43843c6() {
        m43906s5(1);
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: d5 */
    public void m43846d5(int i, int i2, boolean z) {
        OpenCloseLayout openCloseLayout = this.f33806d0;
        if (openCloseLayout != null && openCloseLayout.mo27538d()) {
            float f = (((float) i) * 0.3f) - 15.0f;
            C8287e.m45777D0(i2, f);
            float f2 = f * 1000.0f;
            this.f33838n2[i2] = f2;
            C8287e.m45836e1(i2, f2);
            if (z) {
                mo29566z4();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d6 */
    public void m43847d6() {
        m43906s5(0);
        m43809T4(true);
    }

    /* renamed from: e5 */
    private void m43850e5() {
        m43910t5(this.f33833m0.mo30251s());
        int g = this.f33833m0.mo30204g();
        m43902r5(g);
        this.f33833m0.mo30248r0();
        m43928y5(g);
        m43906s5(this.f33833m0.mo30247r());
    }

    /* access modifiers changed from: private */
    /* renamed from: e6 */
    public void m43851e6() {
        m43906s5(2);
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: f5 */
    public void m43854f5(boolean z, boolean z2) {
        this.f33816g1.setEnabled(z);
        this.f33828k1.setEnabled(z);
        this.f33828k1.setImageResource(z ? 2131231045 : 2131231043);
        this.f33833m0.mo30238o2(z);
        m43922w5(z);
        if (z) {
            C8287e.m45775C0(this.f33833m0.mo30240p0());
        } else {
            float degree = (((float) ((int) ((this.f33816g1.getDegree() * 100.0f) / 332.0f))) * 0.02f) - 1.0f;
            this.f33833m0.mo30234n2(degree);
            m43925x5(degree);
            C8287e.m45775C0(0.0f);
        }
        m43809T4(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: f6 */
    public void m43855f6() {
        m43906s5(4);
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: g5 */
    public void m43858g5(boolean z, boolean z2) {
        m43809T4(z2);
        this.f33819h1.setEnabled(z);
        this.f33831l1.setEnabled(z);
        this.f33831l1.setImageResource(z ? 2131231045 : 2131231043);
        this.f33833m0.mo30246q2(z);
        m43931z5(z);
        if (z) {
            C8287e.m45779E0(this.f33833m0.mo30252s0());
            return;
        }
        int degree = (int) (((((float) ((int) ((this.f33819h1.getDegree() * 100.0f) / 332.0f))) * 0.02f) - 1.0f) * 10.0f);
        this.f33833m0.mo30242p2((float) degree);
        m43756A5(degree);
        C8287e.m45779E0(0.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: g6 */
    public void m43859g6() {
        m43906s5(6);
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: h5 */
    public void m43862h5(int i) {
        mo29564x4(i);
        m43866i5(i, true);
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: h6 */
    public void m43863h6() {
        m43809T4(true);
    }

    /* renamed from: i5 */
    private void m43866i5(int i, boolean z) {
        ImageView[] imageViewArr;
        this.f33826j2 = i;
        if (i < 0 || i >= this.f33835m2.size()) {
            this.f33841o2 = "Custom";
        } else {
            this.f33841o2 = this.f33835m2.get(this.f33826j2).mo28248b();
        }
        int i2 = 0;
        while (true) {
            imageViewArr = this.f33789U1;
            if (i2 >= imageViewArr.length) {
                break;
            }
            this.f33817g2[i2].setEnabled(z);
            if (!(i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6)) {
            }
            i2++;
        }
        if (i >= 0) {
            imageViewArr[imageViewArr.length - 1].setVisibility(8);
            this.f33823i2.setVisibility(8);
            this.f33820h2.post(new C8023k(i));
        } else {
            imageViewArr[imageViewArr.length - 1].setVisibility(0);
            this.f33823i2.setVisibility(0);
            new Handler().postDelayed(new C8024l(), 50);
        }
        m43918v5();
    }

    /* access modifiers changed from: private */
    /* renamed from: i6 */
    public void m43867i6() {
        m43910t5(1);
        m43809T4(true);
    }

    /* renamed from: j5 */
    private void m43870j5() {
        this.f33827k0.setImageResource(2131231042);
        this.f33830l0.setImageResource(2131231042);
        this.f33834m1.setImageResource(2131231042);
        this.f33837n1.setImageResource(2131231042);
    }

    /* access modifiers changed from: private */
    /* renamed from: j6 */
    public void m43871j6() {
        m43910t5(0);
        m43809T4(true);
    }

    /* renamed from: k5 */
    private void m43874k5() {
        boolean A0 = this.f33833m0.mo30075A0();
        m43878l5(A0);
        this.f33812f0.mo27539f(A0, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: k6 */
    public void m43875k6() {
        m43809T4(true);
    }

    /* renamed from: l5 */
    private void m43878l5(boolean z) {
        this.f33824j0.setEnabled(z);
        this.f33818h0.setEnabled(z);
        this.f33824j0.setImageResource(z ? 2131231045 : 2131231043);
        m43760B5(z);
        this.f33833m0.mo30270w2(z);
        if (z) {
            m43799P4(this.f33833m0.mo30079B0());
        } else {
            m43755A4();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l6 */
    public void m43879l6() {
        m43809T4(true);
    }

    /* renamed from: m5 */
    private void m43882m5() {
        boolean D0 = this.f33833m0.mo30087D0();
        m43886n5(D0);
        this.f33809e0.mo27539f(D0, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: m6 */
    public void m43883m6() {
        m43928y5(2);
        m43809T4(true);
    }

    /* renamed from: n5 */
    private void m43886n5(boolean z) {
        this.f33821i0.setEnabled(z);
        this.f33815g0.setEnabled(z);
        this.f33821i0.setImageResource(z ? 2131231045 : 2131231043);
        m43767D5(z);
        this.f33833m0.mo30278y2(z);
        if (z) {
            m43802Q4(this.f33833m0.mo30091E0());
        } else {
            m43759B4();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n6 */
    public void m43887n6() {
        m43928y5(5);
        m43809T4(true);
    }

    /* renamed from: o5 */
    private void m43890o5() {
        int i = 0;
        while (true) {
            VerticalSeekBar[] verticalSeekBarArr = this.f33764I0;
            if (i < verticalSeekBarArr.length) {
                verticalSeekBarArr[i].setOnSeekBarChangeListener(new C8014b(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o6 */
    public void m43891o6() {
        m43928y5(6);
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: p5 */
    public void m43894p5(SeekBar seekBar, boolean z) {
        this.f33825j1.setText(String.valueOf((seekBar.getProgress() * 15) / seekBar.getMax()));
        this.f33825j1.setTextColor(C9332d.m49405b(mo3606L(), z ? R.color.default_text_color : R.color.gray_light));
    }

    /* access modifiers changed from: private */
    /* renamed from: p6 */
    public void m43895p6() {
        m43928y5(4);
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: q5 */
    public void m43898q5(SeekBar seekBar, boolean z) {
        float progress = (float) (seekBar.getProgress() + this.f33804c1);
        C8287e.m45797N0(progress);
        m43777H5(progress);
        this.f33833m0.mo30165W2(progress);
        m43894p5(seekBar, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: q6 */
    public void m43899q6() {
        m43928y5(0);
        m43809T4(true);
    }

    /* renamed from: r5 */
    private void m43902r5(int i) {
        int g = this.f33833m0.mo30204g();
        this.f33853s2.mo27000O(g);
        this.f33833m0.mo30141Q2(g);
    }

    /* access modifiers changed from: private */
    /* renamed from: r6 */
    public void m43903r6() {
        m43928y5(1);
        m43809T4(true);
    }

    /* renamed from: s5 */
    private void m43906s5(int i) {
        int r = this.f33833m0.mo30247r();
        this.f33853s2.mo27003R(r);
        this.f33833m0.mo30145R2(r);
    }

    /* access modifiers changed from: private */
    /* renamed from: s6 */
    public void m43907s6() {
        m43928y5(7);
        m43809T4(true);
    }

    /* renamed from: t5 */
    private void m43910t5(int i) {
        int s = this.f33833m0.mo30251s();
        this.f33853s2.mo27004S(s);
        this.f33833m0.mo30149S2(s);
    }

    /* access modifiers changed from: private */
    /* renamed from: t6 */
    public void m43911t6() {
        m43928y5(3);
        m43809T4(true);
    }

    /* renamed from: u5 */
    private void m43914u5(boolean z) {
        this.f33853s2.mo27020e0(z ? 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: u6 */
    public void m43915u6() {
        m43809T4(true);
    }

    /* renamed from: v5 */
    private void m43918v5() {
        if (this.f33841o2.equals("Custom")) {
            this.f33853s2.mo27026h0(-1);
            this.f33853s2.mo27005U(((((float) this.f33836n0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33853s2.mo27007W(((((float) this.f33839o0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33853s2.mo27008X(((((float) this.f33842p0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33853s2.mo27009Y(((((float) this.f33845q0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33853s2.mo27010Z(((((float) this.f33848r0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33853s2.mo27012a0(((((float) this.f33851s0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33853s2.mo27014b0(((((float) this.f33854t0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33853s2.mo27015c0(((((float) this.f33857u0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33853s2.mo27017d0(((((float) this.f33860v0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33853s2.mo27006V(((((float) this.f33863w0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            return;
        }
        this.f33853s2.mo27026h0(this.f33826j2);
        this.f33853s2.mo27005U(this.f33832l2.get(this.f33826j2).mo28249c()[0]);
        this.f33853s2.mo27007W(this.f33832l2.get(this.f33826j2).mo28249c()[1]);
        this.f33853s2.mo27008X(this.f33832l2.get(this.f33826j2).mo28249c()[2]);
        this.f33853s2.mo27009Y(this.f33832l2.get(this.f33826j2).mo28249c()[3]);
        this.f33853s2.mo27010Z(this.f33832l2.get(this.f33826j2).mo28249c()[4]);
        this.f33853s2.mo27012a0(this.f33832l2.get(this.f33826j2).mo28249c()[5]);
        this.f33853s2.mo27014b0(this.f33832l2.get(this.f33826j2).mo28249c()[6]);
        this.f33853s2.mo27015c0(this.f33832l2.get(this.f33826j2).mo28249c()[7]);
        this.f33853s2.mo27017d0(this.f33832l2.get(this.f33826j2).mo28249c()[8]);
        this.f33853s2.mo27006V(this.f33832l2.get(this.f33826j2).mo28249c()[9]);
    }

    /* access modifiers changed from: private */
    /* renamed from: v6 */
    public void m43919v6() {
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public void m43921w4() {
        try {
            if (!this.f33868x2) {
                DisplayMetrics displayMetrics = mo3698s0().getDisplayMetrics();
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, C7397j.m41731a(mo3651a0(), C2921g.m13016a(mo3651a0(), (int) (((float) displayMetrics.widthPixels) / displayMetrics.density)).mo10794b())});
                ofInt.setDuration(1000);
                ofInt.addUpdateListener(new C8011a(this));
                ofInt.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: w5 */
    private void m43922w5(boolean z) {
        this.f33853s2.mo27002Q(z ? 1 : 0);
        this.f33833m0.mo30281z1(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: w6 */
    public void m43923w6() {
        m43809T4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: x5 */
    public void m43925x5(float f) {
        this.f33853s2.mo27001P(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: x6 */
    public void m43926x6() {
        m43809T4(true);
    }

    /* renamed from: y5 */
    private void m43928y5(int i) {
        int r0 = this.f33833m0.mo30248r0();
        this.f33853s2.mo27031k0(r0);
        this.f33833m0.mo30161V2(r0);
    }

    /* access modifiers changed from: private */
    /* renamed from: y6 */
    public void m43929y6() {
        m43809T4(true);
    }

    /* renamed from: z5 */
    private void m43931z5(boolean z) {
        this.f33853s2.mo27035m0(z ? 1 : 0);
        this.f33833m0.mo30076A1(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: z6 */
    public void m43932z6() {
        m43809T4(true);
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        this.f33868x2 = false;
    }

    /* renamed from: D4 */
    public void mo29556D4() {
        m43822X4();
        SeekBar seekBar = this.f33810e1;
        if (seekBar != null) {
            this.f33833m0.mo30129N2(seekBar.getProgress());
        }
        SeekBar seekBar2 = this.f33813f1;
        if (seekBar2 != null) {
            this.f33833m0.mo30085C2(seekBar2.getProgress());
        }
    }

    /* renamed from: F4 */
    public void mo29557F4(int i) {
        if (this.f33789U1 != null) {
            m43866i5(i, true);
        }
    }

    /* renamed from: G4 */
    public SoundEffect mo29558G4() {
        SoundEffect soundEffect = this.f33853s2;
        if (soundEffect != null) {
            return soundEffect;
        }
        return null;
    }

    /* renamed from: S4 */
    public void mo29560S4() {
        m43805R4();
    }

    /* renamed from: S5 */
    public void mo29561S5(int i) {
        SeekBar seekBar = this.f33850r2;
        if (seekBar != null) {
            seekBar.setProgress(i);
        }
    }

    /* renamed from: a */
    public void mo29562a(int i, float[] fArr) {
        m43830Z4(fArr);
    }

    /* renamed from: q */
    public void mo29563q(float[] fArr) {
        m43830Z4(fArr);
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f33833m0 = new C8337n(mo3606L());
        m43769E4();
        View L4 = m43788L4();
        m43779I4();
        m43810T5();
        m43813U5();
        m43776H4();
        return L4;
    }

    /* renamed from: x4 */
    public void mo29564x4(int i) {
        List<C7408a> list = this.f33832l2;
        if (list != null) {
            list.clear();
            this.f33832l2.addAll(this.f33829k2.mo29501c());
        } else {
            this.f33832l2 = this.f33829k2.mo29501c();
        }
        mo29562a(i, this.f33832l2.get(i).mo28249c());
    }

    /* renamed from: y4 */
    public void mo29565y4(boolean z) {
        int O = this.f33833m0.mo30130O();
        this.f33826j2 = O;
        if (O < 0) {
            this.f33838n2[0] = this.f33833m0.mo30208h();
            this.f33838n2[1] = this.f33833m0.mo30216j();
            this.f33838n2[2] = this.f33833m0.mo30220k();
            this.f33838n2[3] = this.f33833m0.mo30223l();
            this.f33838n2[4] = this.f33833m0.mo30227m();
            this.f33838n2[5] = this.f33833m0.mo30231n();
            this.f33838n2[6] = this.f33833m0.mo30235o();
            this.f33838n2[7] = this.f33833m0.mo30239p();
            this.f33838n2[8] = this.f33833m0.mo30243q();
            this.f33838n2[9] = this.f33833m0.mo30212i();
        } else {
            this.f33838n2 = this.f33832l2.get(O).mo28249c();
        }
        if (z) {
            mo29566z4();
        }
        mo29563q(this.f33838n2);
    }

    /* renamed from: z4 */
    public void mo29566z4() {
        List<C7408a> list = this.f33835m2;
        if (list != null && list.size() > 0) {
            String arrays = Arrays.toString(this.f33838n2);
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f33835m2.size()) {
                    break;
                } else if (arrays.equals(Arrays.toString(this.f33835m2.get(i).mo28249c()))) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f33841o2 = "Custom";
                mo29557F4(-1);
                return;
            }
            this.f33841o2 = this.f33835m2.get(i).mo28248b();
            mo29557F4(i);
        }
    }
}
