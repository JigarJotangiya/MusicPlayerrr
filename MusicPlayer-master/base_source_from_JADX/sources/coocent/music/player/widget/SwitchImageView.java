package coocent.music.player.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class SwitchImageView extends RelativeLayout {

    /* renamed from: g */
    private ImageView f31746g;

    /* renamed from: h */
    private ImageView f31747h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Boolean f31748i = Boolean.FALSE;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7171b f31749j;

    /* renamed from: coocent.music.player.widget.SwitchImageView$a */
    class C7170a implements View.OnClickListener {
        C7170a() {
        }

        public void onClick(View view) {
            if (view.getId() == R.id.switch_layout && SwitchImageView.this.f31749j != null) {
                SwitchImageView switchImageView = SwitchImageView.this;
                switchImageView.setChecked(!switchImageView.f31748i.booleanValue());
                SwitchImageView.this.f31749j.mo27662a(SwitchImageView.this.f31748i.booleanValue());
            }
        }
    }

    /* renamed from: coocent.music.player.widget.SwitchImageView$b */
    public interface C7171b {
        /* renamed from: a */
        void mo27662a(boolean z);
    }

    public SwitchImageView(Context context) {
        super(context);
        m40814c(context);
    }

    /* renamed from: c */
    private void m40814c(Context context) {
        View.inflate(context, R.layout.switch_layout, this);
        this.f31746g = (ImageView) findViewById(R.id.switch_track);
        this.f31747h = (ImageView) findViewById(R.id.switch_thumb);
        ((RelativeLayout) findViewById(R.id.switch_layout)).setOnClickListener(new C7170a());
    }

    public void setChecked(boolean z) {
        Drawable drawable;
        this.f31748i = Boolean.valueOf(z);
        this.f31747h.setImageDrawable(C8345u.m46329j(z ? R.drawable.eq_checkbox_on : R.drawable.eq_checkbox_off));
        ImageView imageView = this.f31746g;
        if (z) {
            drawable = C8343s.m46303k(R.drawable.eq_checkbox_on_2, R.color.colorAccent);
        } else {
            drawable = C8343s.m46298f(R.drawable.eq_checkbox_off_2);
        }
        imageView.setImageDrawable(drawable);
    }

    public void setOnCheckedChangeListener(C7171b bVar) {
        this.f31749j = bVar;
    }

    public SwitchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40814c(context);
    }

    public SwitchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40814c(context);
    }
}
