package coocent.music.player.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coocent.music.player.widget.RotatView;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class ReverberationLayout extends ConstraintLayout {

    /* renamed from: A */
    private ArcProgressView f31654A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public ArcProgressView f31655B;

    /* renamed from: C */
    private RotatView f31656C;

    /* renamed from: D */
    private ArcProgressView f31657D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public ArcProgressView f31658E;

    /* renamed from: F */
    private RotatView f31659F;

    /* renamed from: G */
    private TextView f31660G;

    /* renamed from: H */
    private TextView f31661H;

    /* renamed from: I */
    private ImageView f31662I;

    /* renamed from: J */
    private ImageView f31663J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f31664K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public Vibrator f31665L;

    /* renamed from: coocent.music.player.widget.ReverberationLayout$a */
    class C7158a implements RotatView.C7165b {
        C7158a() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            C8284c.m45750m(C8345u.m46327h(), (int) (((f - 28.0f) * 1000.0f) / 304.0f));
        }

        /* renamed from: b */
        public void mo27587b() {
            boolean z = !C8284c.m45739b(C8345u.m46327h());
            C8284c.m45756s(C8345u.m46327h(), z);
            ReverberationLayout.this.setBassEnable(z);
        }

        @SuppressLint({"SetTextI18n"})
        /* renamed from: c */
        public void mo27588c(float f) {
            ReverberationLayout.this.f31655B.setDegree(f);
            C8284c.m45757t((int) (((f - 28.0f) * 1000.0f) / 304.0f));
            ReverberationLayout.this.m40770O();
            if (ReverberationLayout.this.f31664K) {
                ReverberationLayout.this.f31665L.vibrate(new long[]{0, 10}, -1);
            }
        }
    }

    /* renamed from: coocent.music.player.widget.ReverberationLayout$b */
    class C7159b implements RotatView.C7165b {
        C7159b() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
            C8284c.m45754q(C8345u.m46327h(), (int) (((f - 28.0f) * 1000.0f) / 304.0f));
        }

        /* renamed from: b */
        public void mo27587b() {
            boolean z = !C8284c.m45745h(C8345u.m46327h());
            C8284c.m45763z(C8345u.m46327h(), z);
            ReverberationLayout.this.set3dEnable(z);
        }

        @SuppressLint({"SetTextI18n"})
        /* renamed from: c */
        public void mo27588c(float f) {
            ReverberationLayout.this.f31658E.setDegree(f);
            C8284c.m45736A((int) (((f - 28.0f) * 1000.0f) / 304.0f));
            ReverberationLayout.this.m40769N();
            if (ReverberationLayout.this.f31664K) {
                ReverberationLayout.this.f31665L.vibrate(new long[]{0, 10}, -1);
            }
        }
    }

    public ReverberationLayout(Context context) {
        super(context);
        mo27583J(context);
    }

    /* renamed from: K */
    private void m40767K() {
        this.f31664K = C8337n.m46065k0(C8345u.m46327h()).mo30167X0();
        this.f31665L = (Vibrator) C8345u.m46327h().getSystemService("vibrator");
    }

    /* renamed from: L */
    private void m40768L(Context context) {
        View.inflate(context, R.layout.view_reverberation, this);
        this.f31654A = (ArcProgressView) findViewById(R.id.ac_bass_bg);
        ArcProgressView arcProgressView = (ArcProgressView) findViewById(R.id.ac_bass_level);
        this.f31655B = arcProgressView;
        arcProgressView.mo27372b();
        RotatView rotatView = (RotatView) findViewById(R.id.rv_bass);
        this.f31656C = rotatView;
        rotatView.mo27619e();
        this.f31657D = (ArcProgressView) findViewById(R.id.ac_3d_bg);
        ArcProgressView arcProgressView2 = (ArcProgressView) findViewById(R.id.ac_3d_level);
        this.f31658E = arcProgressView2;
        arcProgressView2.mo27372b();
        RotatView rotatView2 = (RotatView) findViewById(R.id.rv_3d);
        this.f31659F = rotatView2;
        rotatView2.mo27619e();
        this.f31660G = (TextView) findViewById(R.id.tv_bass_val);
        this.f31661H = (TextView) findViewById(R.id.tv_3d_val);
        this.f31662I = (ImageView) findViewById(R.id.iv_3d_switch);
        this.f31663J = (ImageView) findViewById(R.id.iv_bass_switch);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* renamed from: N */
    public void m40769N() {
        TextView textView = this.f31661H;
        textView.setText(((int) (((this.f31659F.getDegree() - 28.0f) * 100.0f) / 304.0f)) + "%");
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* renamed from: O */
    public void m40770O() {
        TextView textView = this.f31660G;
        textView.setText(((int) (((this.f31656C.getDegree() - 28.0f) * 100.0f) / 304.0f)) + "%");
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: P */
    private void m40771P() {
        this.f31654A.setDegree(360.0f);
        this.f31657D.setDegree(360.0f);
        this.f31656C.setArc(28);
        this.f31659F.setArc(28);
        this.f31654A.setImageResource(2131231044);
        this.f31657D.setImageResource(2131231044);
        mo27584M();
    }

    /* renamed from: Q */
    private void m40772Q() {
        this.f31656C.setOnChangeListener(new C7158a());
        this.f31659F.setOnChangeListener(new C7159b());
    }

    /* access modifiers changed from: private */
    public void set3dEnable(boolean z) {
        Drawable drawable;
        this.f31659F.setEnabled(z);
        this.f31658E.setEnabled(z);
        this.f31658E.setImageResource(z ? 2131231047 : 2131231046);
        ImageView imageView = this.f31662I;
        if (z) {
            drawable = C8343s.m46303k(2131231065, R.color.colorAccent);
        } else {
            drawable = C8345u.m46329j(2131231036);
        }
        imageView.setImageDrawable(drawable);
    }

    /* access modifiers changed from: private */
    public void setBassEnable(boolean z) {
        Drawable drawable;
        this.f31656C.setEnabled(z);
        this.f31655B.setEnabled(z);
        this.f31655B.setImageResource(z ? 2131231047 : 2131231046);
        ImageView imageView = this.f31663J;
        if (z) {
            drawable = C8343s.m46303k(2131231065, R.color.colorAccent);
        } else {
            drawable = C8345u.m46329j(2131231036);
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: J */
    public void mo27583J(Context context) {
        m40768L(context);
        m40767K();
        m40771P();
        m40772Q();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: M */
    public void mo27584M() {
        float c = ((float) ((C8284c.m45740c(C8345u.m46327h()) * 304) / 1000)) + 28.0f;
        this.f31656C.setDegree(c);
        this.f31655B.setDegree(c);
        float i = ((float) ((C8284c.m45746i(C8345u.m46327h()) * 304) / 1000)) + 28.0f;
        this.f31659F.setDegree(i);
        this.f31658E.setDegree(i);
        m40770O();
        m40769N();
        setBassEnable(C8284c.m45739b(C8345u.m46327h()));
        set3dEnable(C8284c.m45745h(C8345u.m46327h()));
    }

    public void setReverberationEnable(boolean z) {
        setBassEnable(z);
        set3dEnable(z);
    }

    public ReverberationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo27583J(context);
    }

    public ReverberationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo27583J(context);
    }
}
