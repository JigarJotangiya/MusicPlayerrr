package coocent.music.player.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
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

public class DeepSelectTitle extends RelativeLayout {

    /* renamed from: g */
    private Context f31555g;

    /* renamed from: h */
    private RelativeLayout f31556h;

    /* renamed from: i */
    private TextView f31557i;

    /* renamed from: j */
    private ImageView f31558j;

    /* renamed from: k */
    private View f31559k;

    /* renamed from: l */
    private ImageView f31560l;

    /* renamed from: m */
    private ImageView f31561m;

    /* renamed from: n */
    private ImageView f31562n;

    /* renamed from: o */
    private ImageView f31563o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C7970w f31564p;

    /* renamed from: q */
    private ImageView f31565q;

    /* renamed from: coocent.music.player.widget.DeepSelectTitle$a */
    class C7135a implements View.OnClickListener {
        C7135a() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id != R.id.ico_delete) {
                if (id != R.id.ico_remove) {
                    switch (id) {
                        case R.id.ico_add_to_nowplaying:
                            if (DeepSelectTitle.this.f31564p != null) {
                                DeepSelectTitle.this.f31564p.mo26704k();
                                return;
                            }
                            return;
                        case R.id.ico_add_to_playlist:
                            if (DeepSelectTitle.this.f31564p != null) {
                                DeepSelectTitle.this.f31564p.mo26705l();
                                return;
                            }
                            return;
                        case R.id.ico_add_to_select_all:
                            if (DeepSelectTitle.this.f31564p != null) {
                                DeepSelectTitle.this.f31564p.mo26703C();
                                return;
                            }
                            return;
                        case R.id.ico_back:
                            if (DeepSelectTitle.this.f31564p != null) {
                                DeepSelectTitle.this.f31564p.mo26591t();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } else if (DeepSelectTitle.this.f31564p != null) {
                    DeepSelectTitle.this.f31564p.mo26707n();
                }
            } else if (DeepSelectTitle.this.f31564p != null) {
                DeepSelectTitle.this.f31564p.mo26706m();
            }
        }
    }

    public DeepSelectTitle(Context context) {
        super(context);
        this.f31555g = context;
    }

    /* renamed from: b */
    private void m40641b(View view) {
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
    private void m40642c() {
        m40643d();
        m40644f();
    }

    /* renamed from: d */
    private void m40643d() {
        this.f31559k = View.inflate(this.f31555g, R.layout.select_title, this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_default_title);
        this.f31556h = relativeLayout;
        relativeLayout.setBackgroundColor(C8343s.m46295c(R.color.select_title_bg_color));
        TextView textView = (TextView) findViewById(R.id.title);
        this.f31557i = textView;
        textView.setTextColor(C8343s.m46295c(R.color.default_text_color));
        ImageView imageView = (ImageView) findViewById(R.id.ico_back);
        this.f31558j = imageView;
        imageView.setImageDrawable(C8343s.m46298f(R.drawable.ic_toolbar_03));
        this.f31560l = (ImageView) findViewById(R.id.ico_delete);
        this.f31561m = (ImageView) findViewById(R.id.ico_remove);
        this.f31562n = (ImageView) findViewById(R.id.ico_add_to_playlist);
        this.f31563o = (ImageView) findViewById(R.id.ico_add_to_nowplaying);
        ImageView imageView2 = (ImageView) findViewById(R.id.ico_add_to_select_all);
        this.f31565q = imageView2;
        imageView2.setImageDrawable(C8343s.m46298f(R.drawable.ic_toolbar_06));
        this.f31563o.setVisibility(8);
    }

    /* renamed from: f */
    private void m40644f() {
        C7135a aVar = new C7135a();
        this.f31558j.setOnClickListener(aVar);
        this.f31560l.setOnClickListener(aVar);
        this.f31561m.setOnClickListener(aVar);
        this.f31562n.setOnClickListener(aVar);
        this.f31563o.setOnClickListener(aVar);
        this.f31565q.setOnClickListener(aVar);
    }

    /* renamed from: e */
    public void mo27476e(boolean z, String str) {
        Drawable drawable;
        ImageView imageView = this.f31565q;
        if (z) {
            drawable = C8343s.m46303k(R.drawable.ic_toolbar_07, R.color.colorAccent);
        } else {
            drawable = C8343s.m46298f(R.drawable.ic_toolbar_06);
        }
        imageView.setImageDrawable(drawable);
        this.f31557i.setText(str);
    }

    public void setAddStatusHeight(boolean z) {
        if (z) {
            m40641b(this.f31559k);
        }
    }

    public void setSelectTitleOnClickListener(C7970w wVar) {
        this.f31564p = wVar;
    }

    public void setTitleBackgroundColor(int i) {
        this.f31556h.setBackgroundColor(i);
    }

    public void setTitleHomeClick(View.OnClickListener onClickListener) {
        this.f31558j.setOnClickListener(onClickListener);
    }

    public DeepSelectTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31555g = context;
        m40642c();
    }

    public DeepSelectTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31555g = context;
    }
}
