package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

public class DeepCropTitle extends RelativeLayout {

    /* renamed from: g */
    private Context f31512g;

    /* renamed from: h */
    private RelativeLayout f31513h;

    /* renamed from: i */
    private TextView f31514i;

    /* renamed from: j */
    private ImageView f31515j;

    /* renamed from: k */
    private View f31516k;

    /* renamed from: l */
    private ImageView f31517l;

    /* renamed from: m */
    private ImageView f31518m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C7970w f31519n;

    /* renamed from: coocent.music.player.widget.DeepCropTitle$a */
    class C7132a implements View.OnClickListener {
        C7132a() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id != R.id.ico_back) {
                if (id != R.id.ico_reset) {
                    if (id == R.id.ico_save && DeepCropTitle.this.f31519n != null) {
                        DeepCropTitle.this.f31519n.mo26590j();
                    }
                } else if (DeepCropTitle.this.f31519n != null) {
                    DeepCropTitle.this.f31519n.mo26589i();
                }
            } else if (DeepCropTitle.this.f31519n != null) {
                DeepCropTitle.this.f31519n.mo26591t();
            }
        }
    }

    public DeepCropTitle(Context context) {
        super(context);
        this.f31512g = context;
    }

    /* renamed from: b */
    private void m40576b(View view) {
        int m = C8345u.m46332m();
        if (m > 0) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_default_title);
            relativeLayout.getLayoutParams().height += m;
            View findViewById = relativeLayout.findViewById(R.id.rl_title_black);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = m;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    private void m40577c() {
        m40578d();
        m40580f();
    }

    /* renamed from: d */
    private void m40578d() {
        this.f31516k = View.inflate(this.f31512g, R.layout.crop_title, this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_default_title);
        this.f31513h = relativeLayout;
        relativeLayout.setBackgroundColor(C8343s.m46295c(R.color.select_title_bg_color));
        this.f31514i = (TextView) findViewById(R.id.title);
        this.f31515j = (ImageView) findViewById(R.id.ico_back);
        m40579e();
        this.f31517l = (ImageView) findViewById(R.id.ico_save);
        this.f31518m = (ImageView) findViewById(R.id.ico_reset);
    }

    /* renamed from: e */
    private void m40579e() {
        if (!C8345u.m46336q()) {
            this.f31515j.setImageDrawable(C9332d.m49407d(this.f31512g, R.drawable.back));
        } else {
            this.f31515j.setImageDrawable(C9332d.m49407d(this.f31512g, R.drawable.back_rtl));
        }
    }

    /* renamed from: f */
    private void m40580f() {
        C7132a aVar = new C7132a();
        this.f31515j.setOnClickListener(aVar);
        this.f31517l.setOnClickListener(aVar);
        this.f31518m.setOnClickListener(aVar);
        this.f31514i.setOnClickListener(aVar);
    }

    public void setAddStatusHeight(boolean z) {
        if (z) {
            m40576b(this.f31516k);
        }
    }

    public void setCropTitleOnClickListener(C7970w wVar) {
        this.f31519n = wVar;
    }

    public void setTitleBackgroundColor(int i) {
        this.f31513h.setBackgroundColor(i);
    }

    public void setTitleHomeClick(View.OnClickListener onClickListener) {
        this.f31515j.setOnClickListener(onClickListener);
    }

    public void setTitleText(String str) {
        this.f31514i.setText(str);
    }

    public DeepCropTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31512g = context;
        m40577c();
    }

    public DeepCropTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31512g = context;
    }
}
