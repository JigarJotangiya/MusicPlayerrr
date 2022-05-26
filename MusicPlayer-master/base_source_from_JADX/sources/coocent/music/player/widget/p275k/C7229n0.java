package coocent.music.player.widget.p275k;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.adapter.OptionAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.C7058c;
import coocent.musiclibrary.music.p281b.C7322a;
import coocent.musiclibrary.music.p284e.C7340g;
import coocent.musiclibrary.music.p284e.C7344h;
import coocent.musiclibrary.music.p292j.C7382d;
import coocent.musiclibrary.music.p292j.C7401l;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p183a.p184a.C4363c;
import p159f.p166c.p181e.p182a.p183a.p187d.C4379d;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p369i.C8446k;
import p369i.C8457t;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.music.player.widget.k.n0 */
/* compiled from: OptionPopu */
public class C7229n0 extends C7217j0 implements C4363c, C7401l {

    /* renamed from: k */
    private List<C7058c> f31927k = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Activity f31928l;

    /* renamed from: m */
    private View f31929m;

    /* renamed from: n */
    private RecyclerView f31930n;

    /* renamed from: o */
    private ImageView f31931o;

    /* renamed from: p */
    private TextView f31932p;

    /* renamed from: q */
    private ImageView f31933q;

    /* renamed from: r */
    private OptionAdapter f31934r;

    /* renamed from: s */
    private TextView f31935s;

    /* renamed from: t */
    private TextView f31936t;

    /* renamed from: u */
    private C7344h f31937u;

    /* renamed from: coocent.music.player.widget.k.n0$a */
    /* compiled from: OptionPopu */
    class C7230a implements C7322a {

        /* renamed from: a */
        final /* synthetic */ long[] f31938a;

        /* renamed from: coocent.music.player.widget.k.n0$a$a */
        /* compiled from: OptionPopu */
        class C7231a implements C4379d.C4380a {
            C7231a() {
            }

            /* renamed from: a */
            public void mo14943a() {
                C8344t.m46316d(C7229n0.this.f31928l, R.string.music_eq_lbl_delete_file_failed);
            }

            /* renamed from: b */
            public void mo14944b(List<Long> list) {
                if (C7229n0.this.f31928l != null) {
                    C8287e.m45853l(C8345u.m46327h(), list.get(0).longValue());
                    C7229n0.this.f31928l.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
                    C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
                    C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
                }
            }

            /* renamed from: c */
            public void mo14945c(int i, int i2, long j) {
            }
        }

        C7230a(long[] jArr) {
            this.f31938a = jArr;
        }

        /* renamed from: a */
        public void mo26686a(DialogInterface dialogInterface) {
            C4477c.m19627k(C7229n0.this.f31928l, this.f31938a, new C7231a());
        }

        /* renamed from: b */
        public void mo26687b(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: coocent.music.player.widget.k.n0$b */
    /* compiled from: OptionPopu */
    class C7232b implements C7340g.C7342b {

        /* renamed from: a */
        final /* synthetic */ Music f31941a;

        C7232b(Music music) {
            this.f31941a = music;
        }

        /* renamed from: a */
        public void mo27784a(Dialog dialog, String str, String str2, String str3) {
            C4477c.m19600T0(C7229n0.this.f31928l, this.f31941a.mo9215k(), this.f31941a.mo9218n(), str, str2, str3, C7229n0.this);
            dialog.dismiss();
        }

        /* renamed from: b */
        public void mo27785b(Dialog dialog) {
            dialog.dismiss();
        }
    }

    public C7229n0(Activity activity) {
        super(activity);
        C8287e.m45799O0(this);
        this.f31928l = activity;
        m41002q();
        m40996B();
    }

    /* renamed from: B */
    private void m40996B() {
        C7233o oVar = new C7233o(this);
        C7226m mVar = C7226m.f31921a;
        this.f31934r.setOnItemClickListener(oVar);
        this.f31934r.setOnItemChildClickListener(mVar);
        C7228n nVar = new C7228n(this);
        this.f31931o.setOnClickListener(nVar);
        this.f31935s.setOnClickListener(nVar);
        this.f31932p.setOnClickListener(nVar);
    }

    /* renamed from: C */
    private void m40997C() {
        setWidth(C8345u.m46331l());
        setHeight(-2);
        if (BaseApplication.f31159w) {
            boolean z = BaseApplication.f31158v;
        }
        setContentView(this.f31929m);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(R.style.nowplaylist);
    }

    /* renamed from: D */
    private void m40998D() {
        C7344h i = C7344h.m41524i(this.f31928l, C8337n.m46065k0(C8345u.m46327h()).mo30111J0(), C8337n.m46065k0(C8345u.m46327h()).mo30236o0(), C7237p.f31961g);
        this.f31937u = i;
        i.show();
    }

    /* renamed from: m */
    private void m41000m() {
        Music v = C8287e.m45873v();
        if (v == null) {
            return;
        }
        if (v.mo9261a() == 7) {
            Toast.makeText(C8345u.m46327h(), R.string.video_style_can_not_option, 0).show();
            return;
        }
        C7963p pVar = this.f31889h;
        if (pVar != null) {
            pVar.mo26507R();
        }
        dismiss();
    }

    /* renamed from: n */
    private void m41001n() {
        try {
            Music v = C8287e.m45873v();
            if (v != null) {
                long[] jArr = {v.mo9215k()};
                C7382d.m41679j(this.f31928l, v.mo9218n(), jArr, C8343s.m46300h(), C8345u.m46326g(R.color.white), C8345u.m46326g(R.color.color_bbb), new C7230a(jArr));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        dismiss();
    }

    /* renamed from: q */
    private void m41002q() {
        this.f31929m = LayoutInflater.from(this.f31928l).inflate(R.layout.option_list, (ViewGroup) null);
        m40997C();
        this.f31933q = (ImageView) this.f31929m.findViewById(R.id.iv_play_backgroud);
        mo27783z();
        this.f31930n = (RecyclerView) this.f31929m.findViewById(R.id.recyclerview);
        ((RelativeLayout) this.f31929m.findViewById(R.id.playListLayout)).setBackground(C8345u.m46329j(R.drawable.popup_bg_black));
        this.f31931o = (ImageView) this.f31929m.findViewById(R.id.popu_back);
        this.f31935s = (TextView) this.f31929m.findViewById(R.id.tv_cancel);
        TextView textView = (TextView) this.f31929m.findViewById(R.id.option_title);
        this.f31932p = textView;
        textView.setTextColor(-1);
        this.f31932p.setCompoundDrawablesWithIntrinsicBounds(C8343s.m46304l(R.drawable.ic_library_more_play, R.color.white), (Drawable) null, C8343s.m46304l(R.drawable.ic_library_more_edit, R.color.white), (Drawable) null);
        this.f31932p.setCompoundDrawablePadding(C8345u.m46323d(10));
        TextView textView2 = (TextView) this.f31929m.findViewById(R.id.option_sub_title);
        this.f31936t = textView2;
        textView2.setTextColor(-1);
        ((C0916y) this.f31930n.getItemAnimator()).mo5428V(false);
        this.f31930n.setLayoutManager(new GridLayoutManager(this.f31928l, 4));
        OptionAdapter optionAdapter = new OptionAdapter(R.layout.item_option, this.f31927k);
        this.f31934r = optionAdapter;
        optionAdapter.setHasStableIds(true);
        this.f31930n.setAdapter(this.f31934r);
        View findViewById = this.f31929m.findViewById(R.id.top_line);
        View findViewById2 = this.f31929m.findViewById(R.id.bottom_line);
        findViewById.setBackgroundColor(C8343s.m46295c(R.color.popup_line_skin2));
        findViewById2.setBackgroundColor(C8343s.m46295c(R.color.popup_line_skin2));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo27780s(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Music v;
        if (i == 0) {
            m41007x();
        } else if (i == 1) {
            m40998D();
        } else if (i == 2) {
            m41000m();
        } else if (i != 3 || (v = C8287e.m45873v()) == null) {
        } else {
            if (v.mo9261a() == 7) {
                Toast.makeText(C8345u.m46327h(), R.string.video_style_can_not_option, 0).show();
            } else {
                m41001n();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void mo27781v(View view) {
        int id = view.getId();
        if (id == R.id.option_title) {
            mo27779p();
        } else if (id == R.id.popu_back || id == R.id.tv_cancel) {
            dismiss();
        }
    }

    /* renamed from: w */
    static /* synthetic */ C8457t m41006w(Integer num, Long l, C8446k kVar) {
        if (num.intValue() == 0) {
            C8287e.m45824a1();
        } else if (num.intValue() == 6) {
            C8287e.m45817X0(l);
        } else {
            C8287e.m45817X0(Long.valueOf(((long) (num.intValue() * 15 * 60)) * 1000));
        }
        C8337n.m46065k0(C8345u.m46327h()).mo30093E2(num.intValue());
        C8337n.m46065k0(C8345u.m46327h()).mo30230m2(((Boolean) kVar.getFirst()).booleanValue());
        C8287e.m45805R0(kVar);
        return null;
    }

    /* renamed from: x */
    private void m41007x() {
        Activity activity;
        Music v = C8287e.m45873v();
        if (v == null || (activity = this.f31928l) == null) {
            C8344t.m46316d(this.f31928l, R.string.not_found);
        } else {
            C8287e.m45822a(activity, v);
        }
        dismiss();
    }

    /* renamed from: A */
    public void mo27777A() {
        List<C7058c> list = this.f31927k;
        if (list != null) {
            list.clear();
        } else {
            this.f31927k = new ArrayList();
        }
        String[] f = C8345u.m46325f(R.array.option);
        for (int i = 0; i < f.length; i++) {
            C7058c cVar = new C7058c();
            cVar.mo27085b(i);
            cVar.mo27086c(f[i]);
            this.f31927k.add(cVar);
        }
        this.f31934r.notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo14801a(boolean z, long j, String str, String str2, String str3) {
        Activity activity;
        Music music = new Music();
        music.mo9231y(j);
        music.mo9202C(str);
        music.mo9223s(str2);
        music.mo9224t(str3);
        C8287e.m45842g1(this.f31928l, music);
        if (C8287e.m45873v() != null && music.mo9215k() == C8287e.m45873v().mo9215k() && (activity = this.f31928l) != null) {
            activity.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_notification"));
        }
    }

    /* renamed from: f */
    public void mo26664f() {
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
        mo27782y();
    }

    /* renamed from: k1 */
    public void mo26670k1(long j) {
        C7344h hVar = this.f31937u;
        if (hVar != null && this.f31928l != null) {
            hVar.mo28087r(j / 1000);
        }
    }

    /* renamed from: o */
    public void mo27778o() {
        ImageView imageView = this.f31933q;
        if (imageView != null) {
            imageView.setBackground((Drawable) null);
            this.f31933q.setImageBitmap((Bitmap) null);
            this.f31933q.setImageDrawable((Drawable) null);
            this.f31933q = null;
        }
        List<C7058c> list = this.f31927k;
        if (list != null) {
            list.clear();
            this.f31927k = null;
        }
        if (this.f31930n != null) {
            this.f31930n = null;
        }
        ImageView imageView2 = this.f31931o;
        if (imageView2 != null) {
            imageView2.setImageBitmap((Bitmap) null);
            this.f31931o.setBackground((Drawable) null);
            this.f31931o.setImageDrawable((Drawable) null);
            this.f31931o.setBackgroundDrawable((Drawable) null);
            this.f31931o = null;
        }
        ImageView imageView3 = this.f31933q;
        if (imageView3 != null) {
            imageView3.setImageBitmap((Bitmap) null);
            this.f31933q.setBackground((Drawable) null);
            this.f31933q.setImageDrawable((Drawable) null);
            this.f31933q.setBackgroundDrawable((Drawable) null);
            this.f31933q = null;
        }
        if (this.f31932p != null) {
            this.f31932p = null;
        }
        if (this.f31934r != null) {
            this.f31934r = null;
        }
        if (this.f31929m != null) {
            this.f31929m = null;
        }
    }

    /* renamed from: p */
    public void mo27779p() {
        Music v;
        if (!(C8287e.m45873v() == null || this.f31928l == null || (v = C8287e.m45873v()) == null)) {
            C7382d.m41680k(this.f31928l, v, C8345u.m46326g(R.color.white), -16777216, -16777216, false, new C7232b(v));
        }
        dismiss();
    }

    /* renamed from: y */
    public void mo27782y() {
        if (C8287e.m45873v() != null) {
            this.f31932p.setText(C8287e.m45875w());
            this.f31936t.setText(C8287e.m45861p());
        }
    }

    /* renamed from: z */
    public void mo27783z() {
        if (this.f31933q != null) {
            if (C8287e.m45873v() != null) {
                C8321j.m45999e(C8314f.m45973b(C8345u.m46327h(), 0, C8287e.m45873v().mo9215k(), C8287e.m45859o()), R.drawable.home_intermediate1_speaker04_01, this.f31933q, 50, 10);
            } else {
                C8321j.m45999e(BuildConfig.FLAVOR, R.drawable.home_intermediate1_speaker04_01, this.f31933q, 50, 10);
            }
            this.f31933q.setAlpha(C8343s.m46297e().mo27068a());
        }
    }
}
