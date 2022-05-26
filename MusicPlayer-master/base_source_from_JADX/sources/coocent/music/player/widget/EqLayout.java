package coocent.music.player.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p358i.C8343s;

public class EqLayout extends ConstraintLayout {

    /* renamed from: A */
    private VerticalSeekBar[] f31567A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public TextView[] f31568B;

    /* renamed from: C */
    private VerticalSeekBar[] f31569C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public TextView[] f31570D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C7138c f31571E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int[] f31572F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f31573G = false;

    /* renamed from: coocent.music.player.widget.EqLayout$a */
    class C7136a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: g */
        final /* synthetic */ int f31574g;

        C7136a(int i) {
            this.f31574g = i;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = ((i * 30) / 3000) - 15;
            C8284c.m45759v(this.f31574g, i2);
            EqLayout.this.f31572F[this.f31574g] = i2;
            if (EqLayout.this.f31571E != null) {
                EqLayout.this.f31571E.mo27497b(seekBar, this.f31574g, i2, EqLayout.this.f31572F, EqLayout.this.f31573G);
            }
            EqLayout.this.f31568B[this.f31574g].setText(String.valueOf(i2));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = EqLayout.this.f31573G = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            boolean unused = EqLayout.this.f31573G = false;
            int progress = (seekBar.getProgress() * 30) / 3000;
            if (EqLayout.this.f31571E != null) {
                EqLayout.this.f31571E.mo27496C(seekBar, EqLayout.this.f31572F);
            }
        }
    }

    /* renamed from: coocent.music.player.widget.EqLayout$b */
    class C7137b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: g */
        final /* synthetic */ int f31576g;

        C7137b(int i) {
            this.f31576g = i;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = ((i * 30) / 3000) - 15;
            C8284c.m45759v(this.f31576g, i2);
            EqLayout.this.f31572F[this.f31576g] = i2;
            if (EqLayout.this.f31571E != null) {
                EqLayout.this.f31571E.mo27497b(seekBar, this.f31576g, i2, EqLayout.this.f31572F, EqLayout.this.f31573G);
            }
            EqLayout.this.f31570D[this.f31576g].setText(String.valueOf(i2));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = EqLayout.this.f31573G = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            boolean unused = EqLayout.this.f31573G = false;
            if (EqLayout.this.f31571E != null) {
                EqLayout.this.f31571E.mo27496C(seekBar, EqLayout.this.f31572F);
            }
        }
    }

    /* renamed from: coocent.music.player.widget.EqLayout$c */
    public interface C7138c {
        /* renamed from: C */
        void mo27496C(SeekBar seekBar, int[] iArr);

        /* renamed from: b */
        void mo27497b(SeekBar seekBar, int i, int i2, int[] iArr, boolean z);
    }

    public EqLayout(Context context) {
        super(context);
        m40652I(context);
    }

    /* renamed from: I */
    private void m40652I(Context context) {
        m40654K(context);
        m40653J();
        m40657Q();
    }

    /* renamed from: J */
    private void m40653J() {
        this.f31572F = C8284c.m45742e(getContext());
        m40658R();
    }

    /* renamed from: K */
    private void m40654K(Context context) {
        Context context2 = context;
        if (C8284c.m45749l()) {
            View inflate = View.inflate(context2, R.layout.ten_band_eq_layout, this);
            this.f31567A = new VerticalSeekBar[]{(VerticalSeekBar) inflate.findViewById(R.id.bar1), (VerticalSeekBar) inflate.findViewById(R.id.bar2), (VerticalSeekBar) inflate.findViewById(R.id.bar3), (VerticalSeekBar) inflate.findViewById(R.id.bar4), (VerticalSeekBar) inflate.findViewById(R.id.bar5), (VerticalSeekBar) inflate.findViewById(R.id.bar6), (VerticalSeekBar) inflate.findViewById(R.id.bar7), (VerticalSeekBar) inflate.findViewById(R.id.bar8), (VerticalSeekBar) inflate.findViewById(R.id.bar9), (VerticalSeekBar) inflate.findViewById(R.id.bar10)};
            this.f31568B = new TextView[]{(TextView) inflate.findViewById(R.id.bar1_progress), (TextView) inflate.findViewById(R.id.bar2_progress), (TextView) inflate.findViewById(R.id.bar3_progress), (TextView) inflate.findViewById(R.id.bar4_progress), (TextView) inflate.findViewById(R.id.bar5_progress), (TextView) inflate.findViewById(R.id.bar6_progress), (TextView) inflate.findViewById(R.id.bar7_progress), (TextView) inflate.findViewById(R.id.bar8_progress), (TextView) inflate.findViewById(R.id.bar9_progress), (TextView) inflate.findViewById(R.id.bar10_progress)};
        } else {
            View inflate2 = View.inflate(context2, R.layout.five_band_eq_layout, this);
            this.f31569C = new VerticalSeekBar[]{(VerticalSeekBar) inflate2.findViewById(R.id.bar1), (VerticalSeekBar) inflate2.findViewById(R.id.bar2), (VerticalSeekBar) inflate2.findViewById(R.id.bar3), (VerticalSeekBar) inflate2.findViewById(R.id.bar4), (VerticalSeekBar) inflate2.findViewById(R.id.bar5)};
            this.f31570D = new TextView[]{(TextView) inflate2.findViewById(R.id.bar1_progress), (TextView) inflate2.findViewById(R.id.bar2_progress), (TextView) inflate2.findViewById(R.id.bar3_progress), (TextView) inflate2.findViewById(R.id.bar4_progress), (TextView) inflate2.findViewById(R.id.bar5_progress)};
        }
        VerticalSeekBar[] verticalSeekBarArr = this.f31567A;
        if (verticalSeekBarArr != null) {
            for (VerticalSeekBar a : verticalSeekBarArr) {
                C8343s.m46293a(a);
            }
        }
        VerticalSeekBar[] verticalSeekBarArr2 = this.f31569C;
        if (verticalSeekBarArr2 != null) {
            for (VerticalSeekBar a2 : verticalSeekBarArr2) {
                C8343s.m46293a(a2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void mo27483M(int i, int[] iArr, ValueAnimator valueAnimator) {
        this.f31567A[i].setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f31568B[i].setText(String.valueOf(iArr[i]));
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void mo27484O(int i, int[] iArr, ValueAnimator valueAnimator) {
        this.f31569C[i].setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f31570D[i].setText(String.valueOf(iArr[i]));
    }

    /* renamed from: Q */
    private void m40657Q() {
        int i = 0;
        if (this.f31567A != null) {
            int i2 = 0;
            while (true) {
                VerticalSeekBar[] verticalSeekBarArr = this.f31567A;
                if (i2 >= verticalSeekBarArr.length) {
                    break;
                }
                verticalSeekBarArr[i2].setOnSeekBarChangeListener(new C7136a(i2));
                i2++;
            }
        }
        if (this.f31569C != null) {
            while (true) {
                VerticalSeekBar[] verticalSeekBarArr2 = this.f31569C;
                if (i < verticalSeekBarArr2.length) {
                    verticalSeekBarArr2[i].setOnSeekBarChangeListener(new C7137b(i));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: R */
    private void m40658R() {
        int i = 0;
        if (C8284c.m45749l()) {
            while (true) {
                VerticalSeekBar[] verticalSeekBarArr = this.f31567A;
                if (i < verticalSeekBarArr.length) {
                    verticalSeekBarArr[i].setProgress(((this.f31572F[i] + 15) * 3000) / 30);
                    this.f31568B[i].setText(String.valueOf(this.f31572F[i]));
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                VerticalSeekBar[] verticalSeekBarArr2 = this.f31569C;
                if (i < verticalSeekBarArr2.length) {
                    verticalSeekBarArr2[i].setProgress(((this.f31572F[i] + 15) * 3000) / 30);
                    this.f31570D[i].setText(String.valueOf(this.f31572F[i]));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: H */
    public void mo27482H(int[] iArr) {
        this.f31572F = iArr;
        if (C8284c.m45749l()) {
            for (int i = 0; i < iArr.length; i++) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f31567A[i].getProgress(), ((iArr[i] + 15) * 3000) / 30});
                ofInt.addUpdateListener(new C7179c(this, i, iArr));
                ofInt.setDuration(300);
                ofInt.start();
            }
            return;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{this.f31569C[i2].getProgress(), ((iArr[i2] + 15) * 3000) / 30});
            ofInt2.addUpdateListener(new C7178b(this, i2, iArr));
            ofInt2.setDuration(300);
            ofInt2.start();
        }
    }

    /* renamed from: P */
    public void mo27485P() {
        C8284c.m45752o(getContext(), this.f31572F);
    }

    public int[] getEqValue() {
        return this.f31572F;
    }

    public void setEqEnable(boolean z) {
        VerticalSeekBar[] verticalSeekBarArr = this.f31567A;
        if (verticalSeekBarArr != null) {
            for (VerticalSeekBar enabled : verticalSeekBarArr) {
                enabled.setEnabled(z);
            }
        }
        VerticalSeekBar[] verticalSeekBarArr2 = this.f31569C;
        if (verticalSeekBarArr2 != null) {
            for (VerticalSeekBar enabled2 : verticalSeekBarArr2) {
                enabled2.setEnabled(z);
            }
        }
    }

    public void setEqProgressChangedListener(C7138c cVar) {
        this.f31571E = cVar;
    }

    public void setEqValue(int[] iArr) {
        this.f31572F = iArr;
        m40658R();
    }

    public EqLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40652I(context);
    }

    public EqLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40652I(context);
    }
}
