package coocent.musiclibrary.music.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import coocent.musiclibrary.music.p292j.C7397j;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;

public class PermissionRequestDetailView extends RelativeLayout {

    /* renamed from: g */
    private TextView f32582g;

    /* renamed from: h */
    private TextView f32583h;

    /* renamed from: i */
    private ImageView f32584i;

    /* renamed from: j */
    private TextView f32585j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C7412b f32586k;

    /* renamed from: l */
    private RelativeLayout f32587l;

    /* renamed from: coocent.musiclibrary.music.view.PermissionRequestDetailView$a */
    class C7411a implements View.OnClickListener {
        C7411a() {
        }

        public void onClick(View view) {
            if (view.getId() != C8350d.button_allow) {
                view.getId();
            } else if (PermissionRequestDetailView.this.f32586k != null) {
                PermissionRequestDetailView.this.f32586k.mo26682u0();
            }
        }
    }

    /* renamed from: coocent.musiclibrary.music.view.PermissionRequestDetailView$b */
    public interface C7412b {
        /* renamed from: u0 */
        void mo26682u0();
    }

    public PermissionRequestDetailView(Context context) {
        super(context);
        m41779b(context);
    }

    /* renamed from: b */
    private void m41779b(Context context) {
        m41780c(context);
        m41782e();
        m41783f();
    }

    /* renamed from: c */
    private void m41780c(Context context) {
        View inflate = View.inflate(context, C8351e.view_permission_request_detail, this);
        this.f32582g = (TextView) inflate.findViewById(C8350d.tv_title);
        this.f32583h = (TextView) inflate.findViewById(C8350d.tv_detail);
        this.f32584i = (ImageView) inflate.findViewById(C8350d.iv_icon);
        this.f32585j = (TextView) inflate.findViewById(C8350d.button_allow);
        this.f32587l = (RelativeLayout) inflate.findViewById(C8350d.request_bg);
    }

    /* renamed from: d */
    private void m41781d() {
        ((RelativeLayout.LayoutParams) this.f32582g.getLayoutParams()).topMargin = C7397j.m41733c(getContext());
    }

    /* renamed from: e */
    private void m41782e() {
        m41781d();
    }

    /* renamed from: f */
    private void m41783f() {
        C7411a aVar = new C7411a();
        this.f32585j.setOnClickListener(aVar);
        this.f32587l.setOnClickListener(aVar);
    }

    public void setAllowButtonBg(int i) {
        this.f32585j.setBackgroundResource(i);
    }

    public void setAllowButtonText(int i) {
        this.f32585j.setText(i);
    }

    public void setAllowPermissionListener(C7412b bVar) {
        this.f32586k = bVar;
    }

    public void setDetail(int i) {
        this.f32583h.setText(i);
    }

    public void setIcon(int i) {
        this.f32584i.setImageResource(i);
    }

    public void setTitle(int i) {
        this.f32582g.setText(i);
    }

    public void setViewBg(int i) {
        this.f32587l.setBackgroundResource(i);
    }

    public void setViewBg(Drawable drawable) {
        this.f32587l.setBackground(drawable);
    }

    public PermissionRequestDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m41779b(context);
    }

    public PermissionRequestDetailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m41779b(context);
    }
}
