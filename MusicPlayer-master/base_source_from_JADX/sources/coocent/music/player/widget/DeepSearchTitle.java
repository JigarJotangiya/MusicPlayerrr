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
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

public class DeepSearchTitle extends RelativeLayout {

    /* renamed from: g */
    private Context f31549g;

    /* renamed from: h */
    private ImageView f31550h;

    /* renamed from: i */
    private ImageView f31551i;

    /* renamed from: j */
    private View f31552j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C7970w f31553k;

    /* renamed from: coocent.music.player.widget.DeepSearchTitle$a */
    class C7134a implements View.OnClickListener {
        C7134a() {
        }

        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.ico_back:
                    DeepSearchTitle.this.f31553k.mo26591t();
                    return;
                case R.id.ico_clean:
                    DeepSearchTitle.this.f31553k.mo29496q();
                    return;
                default:
                    return;
            }
        }
    }

    public DeepSearchTitle(Context context) {
        super(context);
        this.f31549g = context;
    }

    /* renamed from: b */
    private void m40635b(View view) {
        int m = C8345u.m46332m();
        if (m > 0) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_search_title);
            relativeLayout.getLayoutParams().height += m;
            View findViewById = relativeLayout.findViewById(R.id.rl_title_black);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = m;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    private void m40636c() {
        m40637d();
        m40639f();
    }

    /* renamed from: d */
    private void m40637d() {
        this.f31552j = View.inflate(this.f31549g, R.layout.search_title, this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_search_title);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f31551i = (ImageView) findViewById(R.id.ico_back);
        m40638e();
        ImageView imageView = (ImageView) findViewById(R.id.ico_clean);
    }

    /* renamed from: e */
    private void m40638e() {
        if (!C8345u.m46336q()) {
            this.f31551i.setImageDrawable(C9332d.m49407d(this.f31549g, R.drawable.back));
        } else {
            this.f31551i.setImageDrawable(C9332d.m49407d(this.f31549g, R.drawable.back_rtl));
        }
    }

    /* renamed from: f */
    private void m40639f() {
        C7134a aVar = new C7134a();
        this.f31550h.setOnClickListener(aVar);
        this.f31551i.setOnClickListener(aVar);
    }

    public void setAddStatusHeight(boolean z) {
        if (z) {
            m40635b(this.f31552j);
        }
    }

    public void setTitleOnClickListener(C7970w wVar) {
        this.f31553k = wVar;
    }

    public DeepSearchTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31549g = context;
        m40636c();
    }

    public DeepSearchTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31549g = context;
    }
}
