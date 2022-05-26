package p342g.p343a.p344a.p349f.p350b;

import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import coocent.music.player.widget.ArcProgressView;
import coocent.music.player.widget.PressButton;
import coocent.music.player.widget.RotatView;
import coocent.music.player.widget.SwitchLayout;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7953f;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.b.f */
/* compiled from: ToneVolFragment */
public class C8037f extends Fragment {

    /* renamed from: A0 */
    private PressButton f33971A0;

    /* renamed from: B0 */
    private PressButton f33972B0;

    /* renamed from: C0 */
    private PressButton f33973C0;

    /* renamed from: D0 */
    private SwitchLayout f33974D0;

    /* renamed from: E0 */
    private SwitchLayout f33975E0;

    /* renamed from: F0 */
    private SwitchLayout f33976F0;

    /* renamed from: G0 */
    private SwitchLayout f33977G0;

    /* renamed from: H0 */
    private TextView f33978H0;

    /* renamed from: I0 */
    private TextView f33979I0;

    /* renamed from: J0 */
    private PressButton[] f33980J0;

    /* renamed from: K0 */
    Float f33981K0;

    /* renamed from: L0 */
    int f33982L0;

    /* renamed from: M0 */
    private int f33983M0 = 38;

    /* renamed from: N0 */
    C7953f f33984N0 = new C8039b();

    /* renamed from: O0 */
    private SeekBar.OnSeekBarChangeListener f33985O0 = new C8040c();

    /* renamed from: P0 */
    private SeekBar.OnSeekBarChangeListener f33986P0 = new C8041d();

    /* renamed from: Q0 */
    private final RotatView.C7165b f33987Q0 = new C8042e();

    /* renamed from: R0 */
    private final RotatView.C7165b f33988R0 = new C8043f();

    /* renamed from: S0 */
    private final RotatView.C7165b f33989S0 = new C8044g();

    /* renamed from: d0 */
    private View f33990d0;

    /* renamed from: e0 */
    private ArcProgressView f33991e0;

    /* renamed from: f0 */
    private ArcProgressView f33992f0;

    /* renamed from: g0 */
    private ArcProgressView f33993g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public ArcProgressView f33994h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public ArcProgressView f33995i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public ArcProgressView f33996j0;

    /* renamed from: k0 */
    private RotatView f33997k0;

    /* renamed from: l0 */
    private RotatView f33998l0;

    /* renamed from: m0 */
    private RotatView f33999m0;

    /* renamed from: n0 */
    private Vibrator f34000n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public C8337n f34001o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public SeekBar f34002p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public SeekBar f34003q0;

    /* renamed from: r0 */
    private PressButton f34004r0;

    /* renamed from: s0 */
    private PressButton f34005s0;

    /* renamed from: t0 */
    private PressButton f34006t0;

    /* renamed from: u0 */
    private PressButton f34007u0;

    /* renamed from: v0 */
    private PressButton f34008v0;

    /* renamed from: w0 */
    private PressButton f34009w0;

    /* renamed from: x0 */
    private PressButton f34010x0;

    /* renamed from: y0 */
    private PressButton f34011y0;

    /* renamed from: z0 */
    private PressButton f34012z0;

    /* renamed from: g.a.a.f.b.f$a */
    /* compiled from: ToneVolFragment */
    class C8038a implements View.OnClickListener {
        C8038a() {
        }

        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.timbre_abound:
                    C8037f.this.m44117c4();
                    return;
                case R.id.timbre_amiable:
                    C8037f.this.m44119d4();
                    return;
                case R.id.timbre_bright:
                    C8037f.this.m44101S3();
                    return;
                case R.id.timbre_coloratura:
                    C8037f.this.m44102T3();
                    return;
                case R.id.timbre_crisp:
                    C8037f.this.m44103U3();
                    return;
                case R.id.timbre_express:
                    C8037f.this.m44104V3();
                    return;
                case R.id.timbre_resonant:
                    C8037f.this.m44105W3();
                    return;
                case R.id.timbre_rude:
                    C8037f.this.m44115b4();
                    return;
                case R.id.timbre_solid:
                    C8037f.this.m44107X3();
                    return;
                case R.id.timbre_steady:
                    C8037f.this.m44109Y3();
                    return;
                case R.id.timbre_strong:
                    C8037f.this.m44111Z3();
                    return;
                case R.id.timbre_tall:
                    C8037f.this.m44113a4();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: g.a.a.f.b.f$b */
    /* compiled from: ToneVolFragment */
    class C8039b extends C7953f {
        C8039b() {
        }

        /* renamed from: a */
        public void mo29483a(boolean z, boolean z2) {
            C8037f.this.m44087E3(z, z2);
            C8037f fVar = C8037f.this;
            fVar.m44096N3(fVar.f34002p0, z);
            C8037f fVar2 = C8037f.this;
            fVar2.m44092J3(fVar2.f34003q0, z);
            C8037f.this.f34001o0.mo30144R1(z);
            if (z2) {
                boolean z3 = C8037f.this.f34001o0.mo30138Q() != 54;
                if (z) {
                    if (!z3) {
                        C8287e.m45803Q0(C8037f.this.f34001o0.mo30163W0());
                        C8287e.m45797N0(C8037f.this.f34001o0.mo30159V0());
                    }
                } else if (!z3) {
                    int progress = C8037f.this.f34003q0.getProgress();
                    C8037f fVar3 = C8037f.this;
                    fVar3.f34001o0.mo30169X2((float) (C8037f.this.f34002p0.getProgress() - (C8037f.this.f34002p0.getMax() / 2)));
                    C8037f.this.f34001o0.mo30165W2((float) (progress + fVar3.f33982L0));
                }
                C8037f.this.m44086D3(z2);
            }
        }

        /* renamed from: c */
        public void mo29485c(boolean z, boolean z2) {
            C8037f.this.m44088F3(z);
        }

        /* renamed from: d */
        public void mo29486d(boolean z, boolean z2) {
            C8037f.this.m44089G3(z, z2);
        }

        /* renamed from: g */
        public void mo29489g(boolean z, boolean z2) {
            C8037f.this.m44098P3(z);
        }
    }

    /* renamed from: g.a.a.f.b.f$c */
    /* compiled from: ToneVolFragment */
    class C8040c implements SeekBar.OnSeekBarChangeListener {
        C8040c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            boolean P = C8037f.this.f34001o0.mo30134P();
            if (P) {
                C8037f.this.m44095M3(seekBar, P);
                C8037f.this.m44097O3();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C8037f.this.m44086D3(true);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: g.a.a.f.b.f$d */
    /* compiled from: ToneVolFragment */
    class C8041d implements SeekBar.OnSeekBarChangeListener {
        C8041d() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            boolean P = C8037f.this.f34001o0.mo30134P();
            if (P) {
                C8037f.this.m44093K3(seekBar, P);
                C8037f.this.m44097O3();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C8037f.this.m44086D3(true);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: g.a.a.f.b.f$e */
    /* compiled from: ToneVolFragment */
    class C8042e implements RotatView.C7165b {
        C8042e() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            float f2 = (((float) ((int) ((f * 100.0f) / 332.0f))) * 0.02f) - 1.0f;
            C8287e.m45775C0(f2);
            C8037f.this.f34001o0.mo30234n2(f2);
        }

        /* renamed from: b */
        public void mo27587b() {
        }

        /* renamed from: c */
        public void mo27588c(float f) {
            C8037f.this.f33994h0.setDegree(f);
            C8037f.this.m44097O3();
        }
    }

    /* renamed from: g.a.a.f.b.f$f */
    /* compiled from: ToneVolFragment */
    class C8043f implements RotatView.C7165b {
        C8043f() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            float f2 = ((float) ((int) ((f * 100.0f) / 332.0f))) / 100.0f;
            C8287e.m45809T0(f2);
            C8037f.this.f34001o0.mo30177Z2(f2);
        }

        /* renamed from: b */
        public void mo27587b() {
        }

        /* renamed from: c */
        public void mo27588c(float f) {
            C8037f.this.f33995i0.setDegree(f);
            C8037f.this.m44097O3();
        }
    }

    /* renamed from: g.a.a.f.b.f$g */
    /* compiled from: ToneVolFragment */
    class C8044g implements RotatView.C7165b {
        C8044g() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            C8037f.this.m44086D3(true);
            float f2 = (float) ((int) (((((float) ((int) ((f * 100.0f) / 332.0f))) * 0.02f) - 1.0f) * 10.0f));
            C8287e.m45779E0(f2);
            C8037f.this.f34001o0.mo30242p2(f2);
        }

        /* renamed from: b */
        public void mo27587b() {
        }

        /* renamed from: c */
        public void mo27588c(float f) {
            Log.e("onChange", "dataDegree:" + f);
            C8037f.this.f33996j0.setDegree(f);
            C8037f.this.m44097O3();
        }
    }

    public C8037f() {
        Float valueOf = Float.valueOf(44100.0f);
        this.f33981K0 = valueOf;
        this.f33982L0 = (int) (valueOf.floatValue() * 0.7f);
    }

    /* renamed from: A3 */
    private void m44083A3() {
        this.f34004r0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_rude);
        this.f34005s0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_solid);
        this.f34006t0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_abound);
        this.f34007u0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_strong);
        this.f34008v0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_steady);
        this.f34009w0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_resonant);
        this.f34010x0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_amiable);
        this.f34011y0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_tall);
        this.f34012z0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_coloratura);
        this.f33971A0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_crisp);
        this.f33972B0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_bright);
        this.f33973C0 = (PressButton) this.f33990d0.findViewById(R.id.timbre_express);
        SwitchLayout switchLayout = (SwitchLayout) this.f33990d0.findViewById(R.id.effect_switch);
        this.f33974D0 = switchLayout;
        switchLayout.setType(4);
        SwitchLayout switchLayout2 = (SwitchLayout) this.f33990d0.findViewById(R.id.balance_switch);
        this.f33975E0 = switchLayout2;
        switchLayout2.setType(5);
        SwitchLayout switchLayout3 = (SwitchLayout) this.f33990d0.findViewById(R.id.volume_switch);
        this.f33976F0 = switchLayout3;
        switchLayout3.setType(6);
        SwitchLayout switchLayout4 = (SwitchLayout) this.f33990d0.findViewById(R.id.pitch_switch);
        this.f33977G0 = switchLayout4;
        switchLayout4.setType(7);
    }

    /* renamed from: B3 */
    private void m44084B3() {
        this.f34004r0.setType((byte) 24);
        this.f34005s0.setType((byte) 25);
        this.f34006t0.setType((byte) 32);
        this.f34007u0.setType((byte) 33);
        this.f34008v0.setType((byte) 34);
        this.f34009w0.setType((byte) 35);
        PressButton pressButton = this.f34010x0;
        this.f33980J0 = new PressButton[]{this.f34004r0, this.f34005s0, this.f34006t0, this.f34007u0, this.f34008v0, this.f34009w0, pressButton, this.f34011y0, this.f34012z0, this.f33971A0, this.f33972B0, this.f33973C0};
        pressButton.setType((byte) 39);
        this.f34011y0.setType((byte) 40);
        this.f34012z0.setType((byte) 41);
        this.f33971A0.setType((byte) 48);
        this.f33972B0.setType((byte) 49);
        this.f33973C0.setType((byte) 51);
    }

    /* renamed from: C3 */
    private void m44085C3() {
        View inflate = View.inflate(mo3606L(), R.layout.fragment_tonevol, (ViewGroup) null);
        this.f33990d0 = inflate;
        this.f33991e0 = (ArcProgressView) inflate.findViewById(R.id.ac_balance_bg);
        this.f33992f0 = (ArcProgressView) this.f33990d0.findViewById(R.id.ac_volume_bg);
        this.f33993g0 = (ArcProgressView) this.f33990d0.findViewById(R.id.ac_pitch_bg);
        this.f33997k0 = (RotatView) this.f33990d0.findViewById(R.id.rv_balance);
        this.f33998l0 = (RotatView) this.f33990d0.findViewById(R.id.rv_volume);
        this.f33999m0 = (RotatView) this.f33990d0.findViewById(R.id.rv_pitch);
        this.f34002p0 = (SeekBar) this.f33990d0.findViewById(R.id.seekbar_tempo);
        this.f34003q0 = (SeekBar) this.f33990d0.findViewById(R.id.seekbar_simpelerate);
        this.f33994h0 = (ArcProgressView) this.f33990d0.findViewById(R.id.ac_balance_level);
        this.f33995i0 = (ArcProgressView) this.f33990d0.findViewById(R.id.ac_volume_level);
        this.f33996j0 = (ArcProgressView) this.f33990d0.findViewById(R.id.ac_pitch_level);
        this.f33975E0 = (SwitchLayout) this.f33990d0.findViewById(R.id.balance_switch);
        this.f33976F0 = (SwitchLayout) this.f33990d0.findViewById(R.id.volume_switch);
        this.f33977G0 = (SwitchLayout) this.f33990d0.findViewById(R.id.pitch_switch);
        this.f33978H0 = (TextView) this.f33990d0.findViewById(R.id.tempo_value);
        this.f33979I0 = (TextView) this.f33990d0.findViewById(R.id.simpelerate_value);
        m44083A3();
        this.f34000n0 = (Vibrator) mo3606L().getSystemService("vibrator");
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public void m44086D3(boolean z) {
        if (z) {
            this.f34001o0.mo30101G2(-1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public void m44087E3(boolean z, boolean z2) {
        this.f34002p0.setEnabled(z);
        this.f34003q0.setEnabled(z);
        int i = 0;
        while (true) {
            PressButton[] pressButtonArr = this.f33980J0;
            if (i < pressButtonArr.length) {
                pressButtonArr[i].setEnabled(z);
                this.f33980J0[i].setPressTextColor(C8345u.m46326g(z ? R.color.half_white : R.color.gray_light));
                if (z2) {
                    if (this.f33980J0[i].mo27549a()) {
                        this.f33980J0[i].setPressEnable(z);
                    }
                } else if (this.f33980J0[i].getType() == this.f33983M0) {
                    this.f33980J0[i].setPress(true);
                    this.f33980J0[i].setPressEnable(z);
                } else {
                    this.f33980J0[i].mo27550b(false, z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public void m44088F3(boolean z) {
        this.f33997k0.setEnabled(z);
        this.f33994h0.setEnabled(z);
        this.f34001o0.mo30238o2(z);
        if (z) {
            C8287e.m45775C0(this.f34001o0.mo30240p0());
            return;
        }
        this.f34001o0.mo30234n2((((float) ((int) ((this.f33997k0.getDegree() * 100.0f) / 332.0f))) * 0.02f) - 1.0f);
        C8287e.m45775C0(0.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public void m44089G3(boolean z, boolean z2) {
        m44086D3(z2);
        this.f33999m0.setEnabled(z);
        this.f33996j0.setEnabled(z);
        this.f34001o0.mo30246q2(z);
        if (z) {
            C8287e.m45779E0(this.f34001o0.mo30252s0());
            return;
        }
        this.f34001o0.mo30242p2((float) ((int) (((((float) ((int) ((this.f33999m0.getDegree() * 100.0f) / 332.0f))) * 0.02f) - 1.0f) * 10.0f)));
        C8287e.m45779E0(0.0f);
    }

    /* renamed from: H3 */
    private void m44090H3() {
    }

    /* renamed from: I3 */
    private void m44091I3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public void m44092J3(SeekBar seekBar, boolean z) {
        this.f33979I0.setText(String.valueOf((seekBar.getProgress() * 15) / seekBar.getMax()));
        this.f33979I0.setTextColor(C8345u.m46326g(z ? R.color.white : R.color.gray_light));
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public void m44093K3(SeekBar seekBar, boolean z) {
        float progress = (float) (seekBar.getProgress() + this.f33982L0);
        C8287e.m45797N0(progress);
        this.f34001o0.mo30165W2(progress);
        m44092J3(seekBar, z);
    }

    /* renamed from: L3 */
    private void m44094L3() {
        boolean P = this.f34001o0.mo30134P();
        m44096N3(this.f34002p0, P);
        m44092J3(this.f34003q0, P);
        this.f33974D0.setOnEqSwitchCallBack(this.f33984N0);
        this.f33974D0.mo27664f(P, false);
        boolean q0 = this.f34001o0.mo30244q0();
        this.f33997k0.setEnabled(q0);
        this.f33975E0.setOnEqSwitchCallBack(this.f33984N0);
        this.f33975E0.mo27664f(q0, false);
        boolean a1 = this.f34001o0.mo30180a1();
        this.f33998l0.setEnabled(a1);
        this.f33976F0.setOnEqSwitchCallBack(this.f33984N0);
        this.f33976F0.mo27664f(a1, false);
        boolean t0 = this.f34001o0.mo30256t0();
        this.f33999m0.setEnabled(t0);
        this.f33977G0.setOnEqSwitchCallBack(this.f33984N0);
        this.f33977G0.mo27664f(t0, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public void m44095M3(SeekBar seekBar, boolean z) {
        float progress = (float) (seekBar.getProgress() - (seekBar.getMax() / 2));
        C8287e.m45803Q0(progress);
        this.f34001o0.mo30169X2(progress);
        m44096N3(seekBar, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public void m44096N3(SeekBar seekBar, boolean z) {
        this.f33978H0.setText(String.valueOf((seekBar.getProgress() * 15) / seekBar.getMax()));
        this.f33978H0.setTextColor(C8345u.m46326g(z ? R.color.white : R.color.gray_light));
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public void m44097O3() {
        if (this.f34001o0.mo30167X0()) {
            this.f34000n0.vibrate(new long[]{0, 5}, -1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public void m44098P3(boolean z) {
        this.f33998l0.setEnabled(z);
        this.f33995i0.setEnabled(z);
        this.f34001o0.mo30187b3(z);
        if (z) {
            C8287e.m45809T0(this.f34001o0.mo30171Y0());
            return;
        }
        this.f34001o0.mo30177Z2(((float) ((int) ((this.f33998l0.getDegree() * 100.0f) / 332.0f))) / 100.0f);
        C8287e.m45809T0(0.0f);
    }

    /* renamed from: Q3 */
    private void m44099Q3() {
        m44090H3();
        m44091I3();
        this.f33991e0.setDegree(360.0f);
        this.f33992f0.setDegree(360.0f);
        this.f33993g0.setDegree(360.0f);
        this.f33997k0.setArc(28);
        this.f33998l0.setArc(28);
        this.f33999m0.setArc(28);
        this.f33997k0.setDegree((((this.f34001o0.mo30240p0() + 1.0f) / 0.02f) / 100.0f) * 332.0f);
        this.f33998l0.setDegree(((this.f34001o0.mo30171Y0() * 100.0f) / 100.0f) * 332.0f);
        this.f33999m0.setDegree(((((this.f34001o0.mo30252s0() / 10.0f) + 1.0f) / 0.02f) * 332.0f) / 100.0f);
        this.f33994h0.setDegree((((this.f34001o0.mo30240p0() + 1.0f) / 0.02f) / 100.0f) * 332.0f);
        this.f33995i0.setDegree(((this.f34001o0.mo30171Y0() * 100.0f) / 100.0f) * 332.0f);
        this.f33996j0.setDegree(((((this.f34001o0.mo30252s0() / 10.0f) + 1.0f) / 0.02f) * 332.0f) / 100.0f);
        if (this.f34001o0.mo30119L0() == -1) {
            int Q0 = this.f34001o0.mo30139Q0();
            int H0 = this.f34001o0.mo30103H0();
            this.f34002p0.setProgress(Q0);
            this.f34003q0.setProgress(H0);
        } else {
            C8287e.m45870t0(this.f34001o0, this.f34002p0, this.f34003q0);
        }
        m44094L3();
    }

    /* renamed from: R3 */
    private void m44100R3() {
        C8038a aVar = new C8038a();
        this.f34004r0.setOnClickListener(aVar);
        this.f34005s0.setOnClickListener(aVar);
        this.f34006t0.setOnClickListener(aVar);
        this.f34007u0.setOnClickListener(aVar);
        this.f34008v0.setOnClickListener(aVar);
        this.f34009w0.setOnClickListener(aVar);
        this.f34010x0.setOnClickListener(aVar);
        this.f34011y0.setOnClickListener(aVar);
        this.f34012z0.setOnClickListener(aVar);
        this.f33971A0.setOnClickListener(aVar);
        this.f33972B0.setOnClickListener(aVar);
        this.f33973C0.setOnClickListener(aVar);
        this.f33997k0.setOnChangeListener(this.f33987Q0);
        this.f33998l0.setOnChangeListener(this.f33988R0);
        this.f33999m0.setOnChangeListener(this.f33989S0);
        this.f34002p0.setOnSeekBarChangeListener(this.f33985O0);
        this.f34003q0.setOnSeekBarChangeListener(this.f33986P0);
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public void m44101S3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public void m44102T3() {
        m44086D3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public void m44103U3() {
        m44086D3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public void m44104V3() {
        m44086D3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public void m44105W3() {
        m44086D3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public void m44107X3() {
        m44086D3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public void m44109Y3() {
        m44086D3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public void m44111Z3() {
        m44086D3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public void m44113a4() {
        m44086D3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public void m44115b4() {
        m44086D3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public void m44117c4() {
        m44086D3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public void m44119d4() {
        m44086D3(true);
    }

    /* renamed from: z3 */
    private void m44141z3() {
        this.f34001o0 = new C8337n(mo3606L());
        this.f33982L0 = (int) (this.f33981K0.floatValue() * 0.7f);
        this.f33983M0 = this.f34001o0.mo30138Q();
        m44084B3();
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        SeekBar seekBar = this.f34002p0;
        if (seekBar != null) {
            this.f34001o0.mo30129N2(seekBar.getProgress());
        }
        SeekBar seekBar2 = this.f34003q0;
        if (seekBar2 != null) {
            this.f34001o0.mo30085C2(seekBar2.getProgress());
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m44085C3();
        m44141z3();
        m44099Q3();
        m44100R3();
        return this.f33990d0;
    }
}
