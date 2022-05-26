package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p171b.p172a.C4315c;
import p159f.p166c.p201g.C4506a;
import p159f.p166c.p201g.p205m.C4547a;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class PullPresetList extends ConstraintLayout {

    /* renamed from: A */
    private List<C4315c> f31646A;

    /* renamed from: B */
    private ImageView f31647B;

    /* renamed from: C */
    private TextView f31648C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C7157c f31649D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public ImageView f31650E;

    /* renamed from: F */
    View.OnClickListener f31651F = new C7185e(this);

    /* renamed from: coocent.music.player.widget.PullPresetList$a */
    class C7155a implements C4547a.C4549b {
        C7155a() {
        }

        /* renamed from: a */
        public void mo9523a() {
        }

        /* renamed from: b */
        public void mo9524b(int i, C4315c cVar) {
            if (PullPresetList.this.f31649D != null) {
                PullPresetList.this.f31649D.mo27582y(i, cVar);
            }
        }

        /* renamed from: c */
        public void mo9525c(int i, C4315c cVar) {
            if (PullPresetList.this.f31649D != null) {
                PullPresetList.this.f31649D.mo27581w(i, cVar);
            }
            PullPresetList.this.m40746N(cVar);
        }
    }

    /* renamed from: coocent.music.player.widget.PullPresetList$b */
    class C7156b implements PopupWindow.OnDismissListener {
        C7156b() {
        }

        public void onDismiss() {
            PullPresetList.this.f31650E.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24);
        }
    }

    /* renamed from: coocent.music.player.widget.PullPresetList$c */
    public interface C7157c {
        /* renamed from: w */
        void mo27581w(int i, C4315c cVar);

        /* renamed from: y */
        void mo27582y(int i, C4315c cVar);
    }

    public PullPresetList(Context context) {
        super(context);
        mo27573F(context);
    }

    /* renamed from: G */
    private void m40743G() {
        this.f31646A = C8284c.m45743f(getContext());
    }

    /* renamed from: H */
    private void m40744H(Context context) {
        View.inflate(context, R.layout.pull_preset_list, this);
        this.f31647B = (ImageView) findViewById(R.id.iv_preset_icon);
        this.f31647B.setImageDrawable(C8343s.m46304l(R.drawable.icon_custom, R.color.white));
        this.f31648C = (TextView) findViewById(R.id.tv_preset_text);
        this.f31650E = (ImageView) findViewById(R.id.iv_preset_down_up);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void mo27574J(View view) {
        if (isEnabled()) {
            this.f31650E.setImageResource(R.drawable.ic_baseline_arrow_drop_up_24);
            C4547a aVar = new C4547a(getContext(), this.f31646A, false, getWidth(), C8345u.m46323d(300));
            aVar.mo15247c(true);
            aVar.mo15248d(new C7155a());
            aVar.setOnDismissListener(new C7156b());
            aVar.showAsDropDown(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m40746N(C4315c cVar) {
        int i;
        this.f31648C.setText(cVar.mo14714c());
        if (cVar.mo14713b() < C4506a.m19734h().length) {
            i = C4506a.m19734h()[cVar.mo14713b()];
        } else {
            i = C4506a.m19734h()[0];
        }
        this.f31647B.setImageDrawable(C8343s.m46304l(i, R.color.white));
    }

    /* renamed from: E */
    public void mo27572E(int i, C4315c cVar, String str) {
        if (this.f31648C.getText().toString().equals(cVar.mo14714c())) {
            this.f31648C.setText(str);
        }
        this.f31646A.get(i).mo14721j(str);
    }

    /* renamed from: F */
    public void mo27573F(Context context) {
        m40744H(context);
        m40743G();
        setOnClickListener(this.f31651F);
    }

    /* renamed from: K */
    public void mo27575K(int i, C4315c cVar) {
        if (this.f31648C.getText().toString().equals(cVar.mo14714c())) {
            C4315c cVar2 = new C4315c();
            cVar2.mo14721j(C8345u.m46333n(R.string.effect_custom));
            m40746N(cVar2);
        }
        this.f31646A.remove(i);
    }

    /* renamed from: L */
    public void mo27576L(C4315c cVar) {
        List<C4315c> list = this.f31646A;
        if (list != null) {
            list.add(cVar);
        }
        m40746N(cVar);
    }

    /* renamed from: M */
    public boolean mo27577M(int[] iArr) {
        int i;
        boolean z = true;
        if (this.f31646A != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f31646A.size()) {
                    break;
                } else if (Arrays.equals(this.f31646A.get(i2).mo14718g(), iArr)) {
                    if (this.f31646A.size() < C4506a.m19734h().length) {
                        i = C4506a.m19734h()[this.f31646A.get(i2).mo14713b()];
                    } else {
                        i = C4506a.m19734h()[0];
                    }
                    this.f31647B.setImageDrawable(C8343s.m46304l(i, R.color.white));
                    this.f31648C.setText(this.f31646A.get(i2).mo14714c());
                    z = false;
                } else {
                    i2++;
                }
            }
            if (z) {
                this.f31647B.setImageDrawable(C8343s.m46304l(R.drawable.icon_custom, R.color.white));
                this.f31648C.setText(C8345u.m46333n(R.string.custom));
            }
        }
        return z;
    }

    public void setEnable(boolean z) {
        int i;
        TextView textView = this.f31648C;
        if (textView != null) {
            if (z) {
                i = -1;
            } else {
                i = C8345u.m46326g(R.color.half_white);
            }
            textView.setTextColor(i);
        }
        super.setEnabled(z);
    }

    public void setPullPresetListener(C7157c cVar) {
        this.f31649D = cVar;
    }

    public PullPresetList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo27573F(context);
    }

    public PullPresetList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
