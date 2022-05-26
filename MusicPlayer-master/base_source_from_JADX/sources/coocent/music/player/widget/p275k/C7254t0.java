package coocent.music.player.widget.p275k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import coocent.music.player.base.BaseApplication;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: coocent.music.player.widget.k.t0 */
/* compiled from: WeekSetPopup */
public class C7254t0 extends C7217j0 {

    /* renamed from: k */
    private View f32043k;

    /* renamed from: l */
    private RadioButton[] f32044l;

    /* renamed from: m */
    private C7255a f32045m;

    /* renamed from: n */
    private int f32046n;

    /* renamed from: o */
    private TextView f32047o;

    /* renamed from: p */
    private TextView f32048p;

    /* renamed from: coocent.music.player.widget.k.t0$a */
    /* compiled from: WeekSetPopup */
    public interface C7255a {
        /* renamed from: a */
        void mo27839a(int i);
    }

    public C7254t0(Context context) {
        super(context);
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: l */
    private void m41165l(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.popup_week, (ViewGroup) null);
        this.f32043k = inflate;
        TextView textView = (TextView) this.f32043k.findViewById(R.id.cancel);
        this.f32047o = textView;
        textView.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f32048p = (TextView) this.f32043k.findViewById(R.id.tv_sub_title);
        ((TextView) this.f32043k.findViewById(R.id.tv_title)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f32048p.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f32044l = new RadioButton[]{(RadioButton) inflate.findViewById(R.id.rb_1), (RadioButton) this.f32043k.findViewById(R.id.rb_2), (RadioButton) this.f32043k.findViewById(R.id.rb_3), (RadioButton) this.f32043k.findViewById(R.id.rb_4)};
        m41171u();
        m41166m();
        m41170t();
        this.f32043k.findViewById(R.id.cover_view).setVisibility(C8343s.f34787b ? 0 : 8);
        C8343s.m46311s((ImageView) this.f32043k.findViewById(R.id.iv_play_backgroud), false);
    }

    /* renamed from: m */
    private void m41166m() {
        m41169r();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void mo27835o(int i, CompoundButton compoundButton, boolean z) {
        this.f32045m.mo27839a(i);
        this.f32044l[i].setChecked(true);
        dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void mo27836q(View view) {
        dismiss();
    }

    /* renamed from: r */
    private void m41169r() {
        int i = 0;
        while (true) {
            RadioButton[] radioButtonArr = this.f32044l;
            if (i < radioButtonArr.length) {
                radioButtonArr[i].setChecked(this.f32046n == i);
                this.f32044l[i].setTextColor(C8343s.m46295c(R.color.default_text_color));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    private void m41170t() {
        int i = 0;
        while (true) {
            RadioButton[] radioButtonArr = this.f32044l;
            if (i < radioButtonArr.length) {
                radioButtonArr[i].setOnCheckedChangeListener(new C7207g0(this, i));
                i++;
            } else {
                this.f32047o.setOnClickListener(new C7205f0(this));
                return;
            }
        }
    }

    /* renamed from: u */
    private void m41171u() {
        setWidth(C8345u.m46331l());
        setHeight(-2);
        setContentView(this.f32043k);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(R.style.nowplaylist);
    }

    /* renamed from: k */
    public void mo27743k(View view) {
        super.mo27743k(view);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (BaseApplication.f31159w && BaseApplication.f31158v) {
            setSoftInputMode(48);
        }
        showAtLocation(view, 83, 0, -iArr[1]);
        setOnDismissListener(this.f31891j);
    }

    /* renamed from: s */
    public void mo27837s(Context context, int i, C7255a aVar) {
        this.f32045m = aVar;
        this.f32046n = i;
        m41165l(context);
    }

    /* renamed from: v */
    public void mo27838v(String str) {
        TextView textView = this.f32048p;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
