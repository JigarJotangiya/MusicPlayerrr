package p342g.p343a.p344a.p349f.p350b;

import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import coocent.music.player.widget.ArcProgressView;
import coocent.music.player.widget.AutoMoveView;
import coocent.music.player.widget.CmEQView;
import coocent.music.player.widget.PullPopuList;
import coocent.music.player.widget.RotatView;
import coocent.music.player.widget.SwitchLayout;
import coocent.music.player.widget.VerticalSeekBar;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7951d;
import p342g.p343a.p344a.p346c.C7953f;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8337n;

/* renamed from: g.a.a.f.b.d */
/* compiled from: EqFragment */
public class C8029d extends Fragment implements C7951d {

    /* renamed from: A0 */
    private AutoMoveView f33893A0;

    /* renamed from: B0 */
    private AutoMoveView f33894B0;

    /* renamed from: C0 */
    private AutoMoveView f33895C0;

    /* renamed from: D0 */
    private AutoMoveView f33896D0;

    /* renamed from: E0 */
    private AutoMoveView f33897E0;

    /* renamed from: F0 */
    private AutoMoveView f33898F0;

    /* renamed from: G0 */
    private AutoMoveView f33899G0;

    /* renamed from: H0 */
    private AutoMoveView f33900H0;

    /* renamed from: I0 */
    private AutoMoveView f33901I0;

    /* renamed from: J0 */
    private AutoMoveView f33902J0;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public AutoMoveView[] f33903K0;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public VerticalSeekBar[] f33904L0;

    /* renamed from: M0 */
    private Vibrator f33905M0;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public boolean f33906N0 = false;

    /* renamed from: O0 */
    private final RotatView.C7165b f33907O0 = new C8032c();

    /* renamed from: P0 */
    private final RotatView.C7165b f33908P0 = new C8033d();

    /* renamed from: Q0 */
    private final C7953f f33909Q0 = new C8034e();

    /* renamed from: d0 */
    private View f33910d0;

    /* renamed from: e0 */
    private PullPopuList f33911e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public CmEQView f33912f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public SwitchLayout f33913g0;

    /* renamed from: h0 */
    private SwitchLayout f33914h0;

    /* renamed from: i0 */
    private SwitchLayout f33915i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public RotatView f33916j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public RotatView f33917k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public ArcProgressView f33918l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public ArcProgressView f33919m0;

    /* renamed from: n0 */
    private ArcProgressView f33920n0;

    /* renamed from: o0 */
    private ArcProgressView f33921o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public C8337n f33922p0;

    /* renamed from: q0 */
    private VerticalSeekBar f33923q0;

    /* renamed from: r0 */
    private VerticalSeekBar f33924r0;

    /* renamed from: s0 */
    private VerticalSeekBar f33925s0;

    /* renamed from: t0 */
    private VerticalSeekBar f33926t0;

    /* renamed from: u0 */
    private VerticalSeekBar f33927u0;

    /* renamed from: v0 */
    private VerticalSeekBar f33928v0;

    /* renamed from: w0 */
    private VerticalSeekBar f33929w0;

    /* renamed from: x0 */
    private VerticalSeekBar f33930x0;

    /* renamed from: y0 */
    private VerticalSeekBar f33931y0;

    /* renamed from: z0 */
    private VerticalSeekBar f33932z0;

    /* renamed from: g.a.a.f.b.d$a */
    /* compiled from: EqFragment */
    class C8030a implements ViewTreeObserver.OnGlobalLayoutListener {
        C8030a() {
        }

        public void onGlobalLayout() {
            C8029d.this.f33912f0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C8029d.this.m44010v3();
        }
    }

    /* renamed from: g.a.a.f.b.d$b */
    /* compiled from: EqFragment */
    class C8031b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: g */
        final /* synthetic */ int f33934g;

        C8031b(int i) {
            this.f33934g = i;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C8029d.this.f33912f0.mo27392b(this.f33934g + 1, i);
            if (C8029d.this.f33906N0) {
                C8029d.this.f33903K0[this.f33934g].mo27378r(C8029d.this.f33904L0[this.f33934g], true);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = C8029d.this.f33906N0 = true;
            C8029d.this.m44014z3(true);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (C8029d.this.f33913g0.mo27663d()) {
                C8029d.this.m43975I3(seekBar.getProgress(), this.f33934g, true);
                C8287e.m45839f1();
                C8029d.this.f33903K0[this.f33934g].mo27379s();
            }
        }
    }

    /* renamed from: g.a.a.f.b.d$c */
    /* compiled from: EqFragment */
    class C8032c implements RotatView.C7165b {
        C8032c() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            C8029d.this.m44013y3(f);
            C8029d.this.f33922p0.mo30282z2(C8029d.this.f33916j0.getDegree());
            C8029d.this.m44014z3(true);
        }

        /* renamed from: b */
        public void mo27587b() {
        }

        /* renamed from: c */
        public void mo27588c(float f) {
            C8029d.this.f33918l0.setDegree(f);
            C8029d.this.m43983Q3();
        }
    }

    /* renamed from: g.a.a.f.b.d$d */
    /* compiled from: EqFragment */
    class C8033d implements RotatView.C7165b {
        C8033d() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            C8029d.this.m44012x3(f);
            C8029d.this.f33922p0.mo30274x2(C8029d.this.f33917k0.getDegree());
            C8029d.this.m44014z3(true);
        }

        /* renamed from: b */
        public void mo27587b() {
        }

        /* renamed from: c */
        public void mo27588c(float f) {
            C8029d.this.f33919m0.setDegree(f);
            C8029d.this.m43983Q3();
        }
    }

    /* renamed from: g.a.a.f.b.d$e */
    /* compiled from: EqFragment */
    class C8034e extends C7953f {
        C8034e() {
        }

        /* renamed from: b */
        public void mo29484b(boolean z, boolean z2) {
            C8029d.this.m44008t3(z, z2);
        }

        /* renamed from: e */
        public void mo29487e(boolean z, boolean z2) {
            C8029d.this.m43967A3(z, z2);
        }

        /* renamed from: f */
        public void mo29488f(boolean z, boolean z2) {
            C8029d.this.m43968B3(z, z2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public void m43967A3(boolean z, boolean z2) {
        if (z2) {
            m43978L3(z);
            m44014z3(z2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public void m43968B3(boolean z, boolean z2) {
        if (z2) {
            m43980N3(z);
            m44014z3(z2);
        }
    }

    /* renamed from: C3 */
    private void m43969C3() {
        if (this.f33911e0.f31624h.getText().toString().trim().equals("Custom")) {
            this.f33911e0.f31627k = -1;
            this.f33922p0.mo30185b1(((((float) this.f33923q0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33922p0.mo30194d1(((((float) this.f33924r0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33922p0.mo30198e1(((((float) this.f33925s0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33922p0.mo30202f1(((((float) this.f33926t0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33922p0.mo30206g1(((((float) this.f33927u0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33922p0.mo30210h1(((((float) this.f33928v0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33922p0.mo30214i1(((((float) this.f33929w0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33922p0.mo30218j1(((((float) this.f33930x0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33922p0.mo30221k1(((((float) this.f33931y0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            this.f33922p0.mo30190c1(((((float) this.f33932z0.getProgress()) * 0.3f) - 15.0f) * 1000.0f);
            Log.e("eq", "save");
        }
        this.f33922p0.mo30233n1(this.f33911e0.f31627k);
    }

    /* renamed from: D3 */
    private void m43970D3() {
        m43969C3();
        m43971E3();
    }

    /* renamed from: E3 */
    private void m43971E3() {
        this.f33922p0.mo30249r1(this.f33916j0.getDegree());
        this.f33922p0.mo30245q1(this.f33917k0.getDegree());
    }

    /* renamed from: F3 */
    private void m43972F3(float[] fArr) {
        this.f33906N0 = false;
        if (this.f33904L0 != null) {
            int i = 0;
            while (true) {
                VerticalSeekBar[] verticalSeekBarArr = this.f33904L0;
                if (i < verticalSeekBarArr.length) {
                    int i2 = (int) (((fArr[i] / 1000.0f) + 15.0f) / 0.3f);
                    verticalSeekBarArr[i].setProgress(i2);
                    m43975I3(i2, i, false);
                    i++;
                    this.f33912f0.mo27392b(i, i2);
                } else {
                    C8287e.m45839f1();
                    return;
                }
            }
        }
    }

    /* renamed from: G3 */
    private void m43973G3() {
        this.f33920n0.setDegree(360.0f);
        this.f33921o0.setDegree(360.0f);
        this.f33916j0.setArc(50);
        this.f33917k0.setArc(50);
        this.f33916j0.setDegree(this.f33922p0.mo30083C0());
        this.f33917k0.setDegree(this.f33922p0.mo30280z0());
        this.f33918l0.setDegree(this.f33922p0.mo30083C0());
        this.f33919m0.setDegree(this.f33922p0.mo30280z0());
    }

    /* renamed from: H3 */
    private void m43974H3() {
        this.f33913g0.mo27664f(this.f33922p0.mo30126N(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public void m43975I3(int i, int i2, boolean z) {
        SwitchLayout switchLayout = this.f33913g0;
        if (switchLayout != null && switchLayout.mo27663d()) {
            float f = (((float) i) * 0.3f) - 15.0f;
            C8287e.m45777D0(i2, f);
            float f2 = f * 1000.0f;
            this.f33911e0.f31629m[i2] = f2;
            C8287e.m45836e1(i2, f2);
            if (z) {
                this.f33911e0.mo27558g();
            }
        }
    }

    /* renamed from: J3 */
    private void m43976J3() {
    }

    /* renamed from: K3 */
    private void m43977K3() {
        boolean A0 = this.f33922p0.mo30075A0();
        m43978L3(A0);
        this.f33915i0.mo27664f(A0, false);
    }

    /* renamed from: L3 */
    private void m43978L3(boolean z) {
        this.f33919m0.setEnabled(z);
        this.f33917k0.setEnabled(z);
        this.f33922p0.mo30270w2(z);
        if (z) {
            m44012x3(this.f33922p0.mo30079B0());
        } else {
            m44006r3();
        }
    }

    /* renamed from: M3 */
    private void m43979M3() {
        boolean D0 = this.f33922p0.mo30087D0();
        m43980N3(D0);
        this.f33914h0.mo27664f(D0, false);
    }

    /* renamed from: N3 */
    private void m43980N3(boolean z) {
        this.f33918l0.setEnabled(z);
        this.f33916j0.setEnabled(z);
        this.f33922p0.mo30278y2(z);
        if (z) {
            m44013y3(this.f33922p0.mo30091E0());
        } else {
            m44007s3();
        }
    }

    /* renamed from: O3 */
    private void m43981O3() {
        int i = 0;
        while (true) {
            VerticalSeekBar[] verticalSeekBarArr = this.f33904L0;
            if (i < verticalSeekBarArr.length) {
                verticalSeekBarArr[i].setOnSeekBarChangeListener(new C8031b(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: P3 */
    private void m43982P3() {
        this.f33913g0.setType(1);
        this.f33914h0.setType(2);
        this.f33915i0.setType(3);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public void m43983Q3() {
        if (this.f33922p0.mo30167X0()) {
            this.f33905M0.vibrate(new long[]{0, 5}, -1);
        }
    }

    /* renamed from: R3 */
    private void m43984R3() {
        m43982P3();
        m43976J3();
        m43973G3();
        m43977K3();
        m43979M3();
        m43974H3();
    }

    /* renamed from: S3 */
    private void m43985S3() {
        m43981O3();
        this.f33916j0.setOnChangeListener(this.f33907O0);
        this.f33917k0.setOnChangeListener(this.f33908P0);
    }

    /* renamed from: r3 */
    private void m44006r3() {
        this.f33922p0.mo30274x2(this.f33917k0.getDegree());
        C8287e.m45852k0();
    }

    /* renamed from: s3 */
    private void m44007s3() {
        this.f33922p0.mo30282z2(this.f33916j0.getDegree());
        C8287e.m45854l0();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public void m44008t3(boolean z, boolean z2) {
        C8287e.m45878x0(z);
        this.f33922p0.mo30229m1(z);
        int i = 0;
        if (z) {
            PullPopuList pullPopuList = this.f33911e0;
            if (pullPopuList != null) {
                pullPopuList.mo27557f(false);
            }
        } else if (z2) {
            m43970D3();
        }
        while (true) {
            VerticalSeekBar[] verticalSeekBarArr = this.f33904L0;
            if (i < verticalSeekBarArr.length) {
                verticalSeekBarArr[i].setEnabled(z);
                i++;
            } else {
                this.f33911e0.setPullViewEnabled(z);
                m44014z3(z2);
                return;
            }
        }
    }

    /* renamed from: u3 */
    private void m44009u3() {
        this.f33905M0 = (Vibrator) mo3606L().getSystemService("vibrator");
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public void m44010v3() {
        this.f33913g0 = (SwitchLayout) this.f33910d0.findViewById(R.id.equalizer_swicth);
        this.f33914h0 = (SwitchLayout) this.f33910d0.findViewById(R.id.switch_rotate);
        this.f33915i0 = (SwitchLayout) this.f33910d0.findViewById(R.id.switch_reverse);
        this.f33923q0 = (VerticalSeekBar) this.f33910d0.findViewById(R.id.bar1);
        this.f33924r0 = (VerticalSeekBar) this.f33910d0.findViewById(R.id.bar2);
        this.f33925s0 = (VerticalSeekBar) this.f33910d0.findViewById(R.id.bar3);
        this.f33926t0 = (VerticalSeekBar) this.f33910d0.findViewById(R.id.bar4);
        this.f33927u0 = (VerticalSeekBar) this.f33910d0.findViewById(R.id.bar5);
        this.f33928v0 = (VerticalSeekBar) this.f33910d0.findViewById(R.id.bar6);
        this.f33929w0 = (VerticalSeekBar) this.f33910d0.findViewById(R.id.bar7);
        this.f33930x0 = (VerticalSeekBar) this.f33910d0.findViewById(R.id.bar8);
        this.f33931y0 = (VerticalSeekBar) this.f33910d0.findViewById(R.id.bar9);
        this.f33932z0 = (VerticalSeekBar) this.f33910d0.findViewById(R.id.bar10);
        this.f33893A0 = (AutoMoveView) this.f33910d0.findViewById(R.id.follow_txtbass_1);
        this.f33894B0 = (AutoMoveView) this.f33910d0.findViewById(R.id.follow_txtbass_2);
        this.f33895C0 = (AutoMoveView) this.f33910d0.findViewById(R.id.follow_txtbass_3);
        this.f33896D0 = (AutoMoveView) this.f33910d0.findViewById(R.id.follow_txtbass_4);
        this.f33897E0 = (AutoMoveView) this.f33910d0.findViewById(R.id.follow_txtbass_5);
        this.f33898F0 = (AutoMoveView) this.f33910d0.findViewById(R.id.follow_txtbass_6);
        this.f33899G0 = (AutoMoveView) this.f33910d0.findViewById(R.id.follow_txtbass_7);
        this.f33900H0 = (AutoMoveView) this.f33910d0.findViewById(R.id.follow_txtbass_8);
        this.f33901I0 = (AutoMoveView) this.f33910d0.findViewById(R.id.follow_txtbass_9);
        AutoMoveView autoMoveView = (AutoMoveView) this.f33910d0.findViewById(R.id.follow_txtbass_10);
        this.f33902J0 = autoMoveView;
        this.f33903K0 = new AutoMoveView[]{this.f33893A0, this.f33894B0, this.f33895C0, this.f33896D0, this.f33897E0, this.f33898F0, this.f33899G0, this.f33900H0, this.f33901I0, autoMoveView};
        this.f33916j0 = (RotatView) this.f33910d0.findViewById(R.id.rv_rotate);
        this.f33917k0 = (RotatView) this.f33910d0.findViewById(R.id.rv_reverse);
        this.f33919m0 = (ArcProgressView) this.f33910d0.findViewById(R.id.ac_reverse_level);
        this.f33918l0 = (ArcProgressView) this.f33910d0.findViewById(R.id.ac_rotate_level);
        this.f33920n0 = (ArcProgressView) this.f33910d0.findViewById(R.id.ac_rotate_bg);
        this.f33921o0 = (ArcProgressView) this.f33910d0.findViewById(R.id.ac_reverse_bg);
        this.f33904L0 = new VerticalSeekBar[]{this.f33923q0, this.f33924r0, this.f33925s0, this.f33926t0, this.f33927u0, this.f33928v0, this.f33929w0, this.f33930x0, this.f33931y0, this.f33932z0};
        PullPopuList pullPopuList = (PullPopuList) this.f33910d0.findViewById(R.id.pullPopulist);
        this.f33911e0 = pullPopuList;
        pullPopuList.setPresetCallBack(this);
        this.f33913g0.setOnEqSwitchCallBack(this.f33909Q0);
        this.f33914h0.setOnEqSwitchCallBack(this.f33909Q0);
        this.f33915i0.setOnEqSwitchCallBack(this.f33909Q0);
        this.f33911e0.mo27559k();
        m44009u3();
        m43984R3();
        m43985S3();
    }

    /* renamed from: w3 */
    private void m44011w3() {
        View inflate = View.inflate(mo3606L(), R.layout.fragment_eq, (ViewGroup) null);
        this.f33910d0 = inflate;
        CmEQView cmEQView = (CmEQView) inflate.findViewById(R.id.cmEqView);
        this.f33912f0 = cmEQView;
        cmEQView.getViewTreeObserver().addOnGlobalLayoutListener(new C8030a());
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public void m44012x3(float f) {
        int i = (int) ((f * 20.0f) / 332.0f);
        C8287e.m45787I0((float) (i > 3 ? Math.log(((double) i) / 20.0d) * 20.0d : -96.0d), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m44013y3(float f) {
        C8287e.m45789J0(((f * 100.0f) / 332.0f) * 0.01f, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public void m44014z3(boolean z) {
        if (z) {
            this.f33922p0.mo30101G2(-1);
        }
    }

    /* renamed from: a */
    public void mo29481a(int i, float[] fArr) {
        m43972F3(fArr);
    }

    /* renamed from: q */
    public void mo29482q(float[] fArr) {
        m43972F3(fArr);
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f33922p0 = new C8337n(mo3606L());
        m44011w3();
        return this.f33910d0;
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        m43970D3();
    }
}
