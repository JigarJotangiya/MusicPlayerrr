package coocent.music.player.widget.p275k;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import coocent.music.player.base.BaseApplication;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: coocent.music.player.widget.k.q0 */
/* compiled from: SortPopup */
public class C7245q0 extends C7217j0 {

    /* renamed from: A */
    private LinearLayout f31995A;

    /* renamed from: B */
    private LinearLayout f31996B;

    /* renamed from: C */
    private LinearLayout f31997C;

    /* renamed from: k */
    private final Activity f31998k;

    /* renamed from: l */
    private final int f31999l;

    /* renamed from: m */
    private View f32000m;

    /* renamed from: n */
    private ImageView f32001n;

    /* renamed from: o */
    private TextView f32002o;

    /* renamed from: p */
    private LinearLayout[] f32003p;

    /* renamed from: q */
    private RadioButton[] f32004q;

    /* renamed from: r */
    private int f32005r = 0;

    /* renamed from: s */
    private LinearLayout f32006s;

    /* renamed from: t */
    private LinearLayout f32007t;

    /* renamed from: u */
    private LinearLayout f32008u;

    /* renamed from: v */
    private LinearLayout f32009v;

    /* renamed from: w */
    private LinearLayout f32010w;

    /* renamed from: x */
    private LinearLayout f32011x;

    /* renamed from: y */
    private LinearLayout f32012y;

    /* renamed from: z */
    private LinearLayout f32013z;

    public C7245q0(Activity activity, int i) {
        super(activity);
        this.f31998k = activity;
        this.f31999l = i;
        m41101t();
        m41092D();
        m41090A();
    }

    /* renamed from: A */
    private void m41090A() {
        this.f32002o.setOnClickListener(new C7260y(this));
        int i = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f32003p;
            if (i < linearLayoutArr.length) {
                linearLayoutArr[i].setOnClickListener(new C7259x(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: B */
    private void m41091B() {
        setWidth(C8345u.m46331l());
        setHeight(-2);
        setContentView(this.f32000m);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(R.style.nowplaylist);
    }

    /* renamed from: D */
    private void m41092D() {
        int i = this.f31999l;
        if (i == 0) {
            m41100s();
        } else if (i == 1) {
            m41095n();
        } else if (i == 2) {
            m41094m();
        } else if (i == 3) {
            m41098q();
        } else if (i == 4) {
            m41096o();
        } else if (i == 5) {
            m41097p();
        }
        int i2 = 0;
        while (true) {
            RadioButton[] radioButtonArr = this.f32004q;
            if (i2 < radioButtonArr.length) {
                radioButtonArr[i2].setButtonTintList(C8343s.m46302j());
                this.f32004q[i2].setChecked(i2 == this.f32005r);
                i2++;
            } else {
                mo27815C(this.f31999l);
                return;
            }
        }
    }

    /* renamed from: l */
    private void m41093l(int i) {
        switch (i) {
            case 0:
                this.f31889h.mo26500A0();
                break;
            case 1:
                this.f31889h.mo26503G();
                break;
            case 2:
                this.f31889h.mo26517n1();
                break;
            case 3:
                this.f31889h.mo26501B1();
                break;
            case 4:
                this.f31889h.mo26512b1();
                break;
            case 5:
                this.f31889h.mo26514i1();
                break;
            case 6:
                this.f31889h.mo26520y1();
                break;
            case 7:
                this.f31889h.mo26506Q();
                break;
            case 8:
                this.f31889h.mo26515l0();
                break;
            case 10:
                this.f31889h.mo26509W0();
                break;
        }
        dismiss();
    }

    /* renamed from: m */
    private void m41094m() {
        m41099r(C4477c.m19637p(C8345u.m46327h()));
    }

    /* renamed from: n */
    private void m41095n() {
        m41099r(C4477c.m19647u(C8345u.m46327h()));
    }

    /* renamed from: o */
    private void m41096o() {
        m41099r(C4477c.m19571F(C8345u.m46327h()));
    }

    /* renamed from: p */
    private void m41097p() {
        m41099r(C4477c.m19593Q(C8345u.m46327h()));
    }

    /* renamed from: q */
    private void m41098q() {
        m41099r(C4477c.m19595R(C8345u.m46327h()));
    }

    /* renamed from: r */
    private void m41099r(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2135424008:
                if (str.equals("title_key")) {
                    c = 0;
                    break;
                }
                break;
            case -1510731038:
                if (str.equals("date_added DESC")) {
                    c = 1;
                    break;
                }
                break;
            case -1409097913:
                if (str.equals("artist")) {
                    c = 2;
                    break;
                }
                break;
            case -539558764:
                if (str.equals("year DESC")) {
                    c = 3;
                    break;
                }
                break;
            case 93626:
                if (str.equals("_ID")) {
                    c = 4;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 5;
                    break;
                }
                break;
            case 80999837:
                if (str.equals("duration DESC")) {
                    c = 6;
                    break;
                }
                break;
            case 90810505:
                if (str.equals("_data")) {
                    c = 7;
                    break;
                }
                break;
            case 91790455:
                if (str.equals("number_of_tracks DESC")) {
                    c = 8;
                    break;
                }
                break;
            case 249789583:
                if (str.equals("album_key")) {
                    c = 9;
                    break;
                }
                break;
            case 334844154:
                if (str.equals("songCount")) {
                    c = 10;
                    break;
                }
                break;
            case 504021881:
                if (str.equals("numsongs DESC")) {
                    c = 11;
                    break;
                }
                break;
            case 630239591:
                if (str.equals("artist_key")) {
                    c = 12;
                    break;
                }
                break;
            case 1297818103:
                if (str.equals("songCount DESC")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f32005r = 0;
                return;
            case 1:
                this.f32005r = 1;
                return;
            case 2:
            case 12:
                this.f32005r = 3;
                return;
            case 3:
                this.f32005r = 2;
                return;
            case 4:
                this.f32005r = 7;
                return;
            case 5:
                this.f32005r = 8;
                return;
            case 6:
                this.f32005r = 4;
                return;
            case 7:
                this.f32005r = 10;
                return;
            case 8:
            case 10:
            case 11:
            case 13:
                this.f32005r = 5;
                return;
            case 9:
                this.f32005r = 6;
                return;
            default:
                return;
        }
    }

    /* renamed from: s */
    private void m41100s() {
        m41099r(C4477c.m19587N(C8345u.m46327h()));
    }

    /* renamed from: t */
    private void m41101t() {
        this.f32000m = LayoutInflater.from(this.f31998k).inflate(R.layout.sort_popup, (ViewGroup) null);
        m41091B();
        this.f32001n = (ImageView) this.f32000m.findViewById(R.id.iv_play_backgroud);
        mo27819z();
        TextView textView = (TextView) this.f32000m.findViewById(R.id.tv_cancel);
        this.f32002o = textView;
        textView.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f32006s = (LinearLayout) this.f32000m.findViewById(R.id.ll_song_name);
        this.f32007t = (LinearLayout) this.f32000m.findViewById(R.id.ll_add_date);
        this.f32008u = (LinearLayout) this.f32000m.findViewById(R.id.ll_album_year);
        this.f32009v = (LinearLayout) this.f32000m.findViewById(R.id.ll_artist_name);
        this.f32010w = (LinearLayout) this.f32000m.findViewById(R.id.ll_song_duration);
        this.f32011x = (LinearLayout) this.f32000m.findViewById(R.id.ll_song_count);
        this.f32012y = (LinearLayout) this.f32000m.findViewById(R.id.ll_album_name);
        this.f32013z = (LinearLayout) this.f32000m.findViewById(R.id.ll_create_time);
        this.f31995A = (LinearLayout) this.f32000m.findViewById(R.id.ll_playlist_name);
        this.f31996B = (LinearLayout) this.f32000m.findViewById(R.id.ll_folder_name);
        this.f31997C = (LinearLayout) this.f32000m.findViewById(R.id.ll_drag_to_sort);
        TextView textView2 = (TextView) this.f32000m.findViewById(R.id.tv_sort_by_drag_to_sort);
        TextView textView3 = (TextView) this.f32000m.findViewById(R.id.tv_sort_by_song_count);
        TextView textView4 = (TextView) this.f32000m.findViewById(R.id.tv_sort_by_duration);
        TextView textView5 = (TextView) this.f32000m.findViewById(R.id.tv_sort_by_artist);
        TextView textView6 = (TextView) this.f32000m.findViewById(R.id.tv_sort_by_album);
        TextView textView7 = (TextView) this.f32000m.findViewById(R.id.tv_sort_by_album_year);
        TextView textView8 = (TextView) this.f32000m.findViewById(R.id.tv_sort_by_time);
        TextView textView9 = (TextView) this.f32000m.findViewById(R.id.tv_sort_by_name);
        TextView textView10 = (TextView) this.f32000m.findViewById(R.id.tv_sort_by_playlist_name);
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_create_time)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup02_time, R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_playlist_name)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup09_lists_, R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_folder_name)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup09_name, R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_name)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup03_name, R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_time)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup02_time, R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_year)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup04_years, R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_album)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup05_singer, R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_artist)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup05_singer, R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_duration)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup06_songtime, R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_song_count)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup08_n, R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.iv_sort_by_drag_to_sort)).setImageDrawable(C8343s.m46304l(R.drawable.ic_sort_popup07_manual, R.color.default_text_color));
        ((TextView) this.f32000m.findViewById(R.id.sort_title)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) this.f32000m.findViewById(R.id.tv_sort_by_create_time)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView10.setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) this.f32000m.findViewById(R.id.tv_sort_by_folder_name)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView9.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView8.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView7.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView6.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView5.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView4.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView3.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView2.setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((ImageView) this.f32000m.findViewById(R.id.sort_icon)).setImageDrawable(C8343s.m46304l(R.drawable.ic_home02_sort, R.color.default_text_color));
        int i = 8;
        this.f32004q = new RadioButton[]{(RadioButton) this.f32000m.findViewById(R.id.rb_1), (RadioButton) this.f32000m.findViewById(R.id.rb_2), (RadioButton) this.f32000m.findViewById(R.id.rb_3), (RadioButton) this.f32000m.findViewById(R.id.rb_4), (RadioButton) this.f32000m.findViewById(R.id.rb_5), (RadioButton) this.f32000m.findViewById(R.id.rb_6), (RadioButton) this.f32000m.findViewById(R.id.rb_7), (RadioButton) this.f32000m.findViewById(R.id.rb_8), (RadioButton) this.f32000m.findViewById(R.id.rb_9), (RadioButton) this.f32000m.findViewById(R.id.rb_10), (RadioButton) this.f32000m.findViewById(R.id.rb_11)};
        this.f32003p = new LinearLayout[]{this.f32006s, this.f32007t, this.f32008u, this.f32009v, this.f32010w, this.f32011x, this.f32012y, this.f32013z, this.f31995A, this.f31997C, this.f31996B};
        View findViewById = this.f32000m.findViewById(R.id.cover_view);
        if (C8343s.f34787b) {
            i = 0;
        }
        findViewById.setVisibility(i);
        C8343s.m46311s(this.f32001n, false);
        View findViewById2 = this.f32000m.findViewById(R.id.top_line);
        View findViewById3 = this.f32000m.findViewById(R.id.bottom_line);
        findViewById2.setBackgroundColor(C8343s.m46295c(R.color.popup_line_skin2));
        findViewById3.setBackgroundColor(C8343s.m46295c(R.color.popup_line_skin2));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void mo27816v(View view) {
        if (view.getId() == R.id.tv_cancel) {
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void mo27817x(int i, View view) {
        int i2 = 0;
        while (true) {
            RadioButton[] radioButtonArr = this.f32004q;
            if (i2 < radioButtonArr.length) {
                if (i2 == i) {
                    radioButtonArr[i2].setChecked(true);
                    m41093l(i2);
                } else {
                    radioButtonArr[i2].setChecked(false);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: C */
    public void mo27815C(int i) {
        if (i == 0) {
            this.f32011x.setVisibility(8);
            this.f32007t.setVisibility(0);
        } else if (i == 1) {
            this.f32006s.setVisibility(8);
            this.f32007t.setVisibility(8);
            this.f32008u.setVisibility(8);
            this.f32010w.setVisibility(8);
            this.f32011x.setVisibility(0);
        } else if (i == 2) {
            this.f32006s.setVisibility(8);
            this.f32007t.setVisibility(8);
            this.f32008u.setVisibility(8);
            this.f32010w.setVisibility(8);
            this.f32011x.setVisibility(0);
            this.f32012y.setVisibility(0);
        } else if (i == 3) {
            this.f32006s.setVisibility(8);
            this.f32007t.setVisibility(8);
            this.f32008u.setVisibility(8);
            this.f32010w.setVisibility(8);
            this.f32011x.setVisibility(0);
            this.f32013z.setVisibility(0);
            this.f31995A.setVisibility(0);
            this.f32012y.setVisibility(8);
            this.f32009v.setVisibility(8);
        } else if (i == 4) {
            this.f32006s.setVisibility(8);
            this.f32007t.setVisibility(8);
            this.f32008u.setVisibility(8);
            this.f32010w.setVisibility(8);
            this.f32011x.setVisibility(0);
            this.f31996B.setVisibility(0);
            this.f32013z.setVisibility(8);
            this.f31995A.setVisibility(8);
            this.f32012y.setVisibility(8);
            this.f32009v.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo27742i() {
        super.mo27742i();
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
        mo27818y();
    }

    /* renamed from: y */
    public void mo27818y() {
    }

    /* renamed from: z */
    public void mo27819z() {
        ImageView imageView = this.f32001n;
        if (imageView != null) {
            C8343s.m46307o(imageView, false);
        }
    }
}
