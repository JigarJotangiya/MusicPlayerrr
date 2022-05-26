package coocent.music.player.activity;

import android.app.Dialog;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.core.content.p003d.C0524f;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import coocent.music.player.adapter.C7032l;
import coocent.music.player.adapter.WidgetAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.C7060e;
import coocent.music.player.widget.C7192i;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.music.player.widget.desktop.Widget2x2Grid;
import coocent.music.player.widget.desktop.Widget4x1;
import coocent.music.player.widget.desktop.Widget4x4Grid;
import coocent.musiclibrary.music.p292j.C7397j;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8339p;
import p342g.p343a.p344a.p358i.C8340q;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class WidgetActivity extends AnimationActivity {

    /* renamed from: A */
    private RelativeLayout f30966A;

    /* renamed from: B */
    private List<C7060e> f30967B;

    /* renamed from: C */
    private int[] f30968C = {R.drawable.desktop_4and4_01, R.drawable.desktop_4and2, R.drawable.desktop_4and1_02};
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int[] f30969D = {R.string.widget_step1, R.string.widget_step2, R.string.widget_step3, R.string.widget_step4};
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int[] f30970E = {R.drawable.img_widget01_failure, R.drawable.img_widget02_failure, R.drawable.img_widget03_failure, R.drawable.img_widget04_failure};

    /* renamed from: F */
    private String[] f30971F = {"4x4 Widget", "2x2 Widget", "4x1 Widget"};

    /* renamed from: G */
    private WidgetAdapter f30972G;

    /* renamed from: H */
    private RecyclerView f30973H;

    /* renamed from: I */
    private DeepDefaultTitle f30974I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f30975J = 0;

    /* renamed from: z */
    private ImageView f30976z;

    /* renamed from: coocent.music.player.activity.WidgetActivity$a */
    class C6941a implements View.OnSystemUiVisibilityChangeListener {
        C6941a() {
        }

        public void onSystemUiVisibilityChange(int i) {
            if (i == 1) {
                WidgetActivity.this.m39904t2(BaseApplication.f31157u);
                return;
            }
            WidgetActivity widgetActivity = WidgetActivity.this;
            widgetActivity.m39904t2(C9566f.m50190a(widgetActivity, 5));
        }
    }

    /* renamed from: coocent.music.player.activity.WidgetActivity$b */
    class C6942b extends C7970w {
        C6942b() {
        }

        /* renamed from: t */
        public void mo26591t() {
            WidgetActivity.this.m39900p2();
        }
    }

    /* renamed from: coocent.music.player.activity.WidgetActivity$c */
    class C6943c implements BaseQuickAdapter.OnItemClickListener {
        C6943c() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (Build.VERSION.SDK_INT < 26) {
                WidgetActivity.this.m39908x2();
            } else if (i == 0) {
                WidgetActivity.this.m39899o2(Widget4x4Grid.class, Widget4x4Grid.m40854b().mo27701c(WidgetActivity.this, BuildConfig.FLAVOR));
            } else if (i == 1) {
                WidgetActivity.this.m39899o2(Widget2x2Grid.class, Widget2x2Grid.m40838b().mo27691c(WidgetActivity.this, BuildConfig.FLAVOR));
            } else if (i == 2) {
                WidgetActivity.this.m39899o2(Widget4x1.class, Widget4x1.m40846b().mo27696c(WidgetActivity.this, BuildConfig.FLAVOR));
            }
        }
    }

    /* renamed from: coocent.music.player.activity.WidgetActivity$d */
    class C6944d implements ViewPager.C1180i {

        /* renamed from: a */
        final /* synthetic */ TextView f30980a;

        /* renamed from: b */
        final /* synthetic */ RadioGroup f30981b;

        /* renamed from: c */
        final /* synthetic */ int[] f30982c;

        /* renamed from: d */
        final /* synthetic */ ImageView f30983d;

        /* renamed from: e */
        final /* synthetic */ ImageView f30984e;

        C6944d(TextView textView, RadioGroup radioGroup, int[] iArr, ImageView imageView, ImageView imageView2) {
            this.f30980a = textView;
            this.f30981b = radioGroup;
            this.f30982c = iArr;
            this.f30983d = imageView;
            this.f30984e = imageView2;
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
        }

        /* renamed from: r */
        public void mo6209r(int i) {
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            int unused = WidgetActivity.this.f30975J = i;
            TextView textView = this.f30980a;
            WidgetActivity widgetActivity = WidgetActivity.this;
            textView.setText(widgetActivity.getString(widgetActivity.f30969D[i]));
            this.f30981b.check(this.f30982c[i]);
            if (i == 0) {
                this.f30983d.setImageResource(R.drawable.btn_widget_left_off);
            } else {
                this.f30983d.setImageResource(R.drawable.btn_widget_left);
            }
            if (i >= WidgetActivity.this.f30969D.length - 1) {
                this.f30984e.setImageResource(R.drawable.btn_widget_right_off);
            } else {
                this.f30984e.setImageResource(R.drawable.btn_widget_right);
            }
        }
    }

    /* renamed from: coocent.music.player.activity.WidgetActivity$e */
    class C6945e implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ ImageView f30986g;

        /* renamed from: h */
        final /* synthetic */ ViewPager f30987h;

        /* renamed from: i */
        final /* synthetic */ ImageView f30988i;

        /* renamed from: j */
        final /* synthetic */ RadioGroup f30989j;

        /* renamed from: k */
        final /* synthetic */ int[] f30990k;

        /* renamed from: l */
        final /* synthetic */ TextView f30991l;

        C6945e(ImageView imageView, ViewPager viewPager, ImageView imageView2, RadioGroup radioGroup, int[] iArr, TextView textView) {
            this.f30986g = imageView;
            this.f30987h = viewPager;
            this.f30988i = imageView2;
            this.f30989j = radioGroup;
            this.f30990k = iArr;
            this.f30991l = textView;
        }

        public void onClick(View view) {
            WidgetActivity.m39896l2(WidgetActivity.this);
            if (WidgetActivity.this.f30975J <= 0) {
                int unused = WidgetActivity.this.f30975J = 0;
                this.f30986g.setImageResource(R.drawable.btn_widget_left_off);
            } else {
                this.f30986g.setImageResource(R.drawable.btn_widget_left);
            }
            this.f30987h.setCurrentItem(WidgetActivity.this.f30975J);
            this.f30988i.setImageResource(R.drawable.btn_widget_right);
            this.f30989j.check(this.f30990k[WidgetActivity.this.f30975J]);
            TextView textView = this.f30991l;
            WidgetActivity widgetActivity = WidgetActivity.this;
            textView.setText(widgetActivity.getString(widgetActivity.f30969D[WidgetActivity.this.f30975J]));
        }
    }

    /* renamed from: coocent.music.player.activity.WidgetActivity$f */
    class C6946f implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ ImageView f30993g;

        /* renamed from: h */
        final /* synthetic */ ViewPager f30994h;

        /* renamed from: i */
        final /* synthetic */ ImageView f30995i;

        /* renamed from: j */
        final /* synthetic */ RadioGroup f30996j;

        /* renamed from: k */
        final /* synthetic */ int[] f30997k;

        /* renamed from: l */
        final /* synthetic */ TextView f30998l;

        C6946f(ImageView imageView, ViewPager viewPager, ImageView imageView2, RadioGroup radioGroup, int[] iArr, TextView textView) {
            this.f30993g = imageView;
            this.f30994h = viewPager;
            this.f30995i = imageView2;
            this.f30996j = radioGroup;
            this.f30997k = iArr;
            this.f30998l = textView;
        }

        public void onClick(View view) {
            WidgetActivity.m39895k2(WidgetActivity.this);
            if (WidgetActivity.this.f30975J >= WidgetActivity.this.f30970E.length - 1) {
                WidgetActivity widgetActivity = WidgetActivity.this;
                int unused = widgetActivity.f30975J = widgetActivity.f30970E.length - 1;
                this.f30993g.setImageResource(R.drawable.btn_widget_right_off);
            } else {
                this.f30993g.setImageResource(R.drawable.btn_widget_right);
            }
            this.f30994h.setCurrentItem(WidgetActivity.this.f30975J);
            this.f30995i.setImageResource(R.drawable.btn_widget_left);
            this.f30996j.check(this.f30997k[WidgetActivity.this.f30975J]);
            TextView textView = this.f30998l;
            WidgetActivity widgetActivity2 = WidgetActivity.this;
            textView.setText(widgetActivity2.getString(widgetActivity2.f30969D[WidgetActivity.this.f30975J]));
        }
    }

    /* renamed from: coocent.music.player.activity.WidgetActivity$g */
    class C6947g implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ ViewPager f31000g;

        /* renamed from: h */
        final /* synthetic */ int f31001h;

        /* renamed from: i */
        final /* synthetic */ RadioGroup f31002i;

        /* renamed from: j */
        final /* synthetic */ int[] f31003j;

        C6947g(WidgetActivity widgetActivity, ViewPager viewPager, int i, RadioGroup radioGroup, int[] iArr) {
            this.f31000g = viewPager;
            this.f31001h = i;
            this.f31002i = radioGroup;
            this.f31003j = iArr;
        }

        public void onClick(View view) {
            this.f31000g.setCurrentItem(this.f31001h);
            this.f31002i.check(this.f31003j[this.f31001h]);
        }
    }

    /* renamed from: k2 */
    static /* synthetic */ int m39895k2(WidgetActivity widgetActivity) {
        int i = widgetActivity.f30975J;
        widgetActivity.f30975J = i + 1;
        return i;
    }

    /* renamed from: l2 */
    static /* synthetic */ int m39896l2(WidgetActivity widgetActivity) {
        int i = widgetActivity.f30975J;
        widgetActivity.f30975J = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public void m39899o2(Class cls, RemoteViews remoteViews) {
        AppWidgetManager instance = AppWidgetManager.getInstance(this);
        ComponentName componentName = new ComponentName(this, cls);
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (instance.isRequestPinAppWidgetSupported()) {
            try {
                if (!C8339p.m46286c()) {
                    PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(this, MainActivity.class), 134217728);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("appWidgetPreview", remoteViews);
                    instance.requestPinAppWidget(componentName, bundle, broadcast);
                    return;
                }
                m39908x2();
            } catch (Exception unused) {
                m39908x2();
            }
        } else {
            m39908x2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public void m39900p2() {
        finish();
    }

    /* renamed from: q2 */
    private void m39901q2() {
        m39902r2();
    }

    /* renamed from: r2 */
    private void m39902r2() {
        this.f30967B = new ArrayList();
        int i = 0;
        while (true) {
            int[] iArr = this.f30968C;
            if (i < iArr.length) {
                C7060e eVar = new C7060e();
                eVar.mo27091c(iArr[i]);
                eVar.mo27092d(this.f30971F[i]);
                this.f30967B.add(eVar);
                i++;
            } else {
                WidgetAdapter widgetAdapter = new WidgetAdapter(R.layout.item_widget, this.f30967B);
                this.f30972G = widgetAdapter;
                widgetAdapter.setHasStableIds(true);
                ((C0916y) this.f30973H.getItemAnimator()).mo5428V(false);
                this.f30973H.mo4622h(new C7192i(C8345u.m46323d(5), 1));
                this.f30973H.setLayoutManager(new GridLayoutManager(this, 2));
                this.f30973H.setAdapter(this.f30972G);
                return;
            }
        }
    }

    /* renamed from: s2 */
    private void m39903s2() {
        setContentView((int) R.layout.activity_widget);
        this.f30974I = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        this.f30976z = (ImageView) findViewById(R.id.iv_bg);
        findViewById(R.id.bg_cover).setVisibility(C8343s.f34787b ? 0 : 8);
        this.f30966A = (RelativeLayout) findViewById(R.id.bottom_control);
        this.f30973H = (RecyclerView) findViewById(R.id.gridView);
        AdHelper.m49536p().mo32441b(this, (ViewGroup) findViewById(R.id.ad_layout));
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public void m39904t2(int i) {
        RelativeLayout relativeLayout = this.f30966A;
        if (relativeLayout != null) {
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), this.f30966A.getPaddingTop(), this.f30966A.getPaddingRight(), i);
        }
    }

    /* renamed from: u2 */
    private void m39905u2() {
        this.f30974I.setTitleText(getResources().getString(R.string.widget));
        this.f30974I.mo27431B(true, true);
        this.f30974I.setHomeIcon(false);
        this.f30974I.setSearchIcon(false);
        this.f30974I.setThemeIcon(false);
        C8343s.m46307o(this.f30976z, false);
    }

    /* renamed from: v2 */
    private void m39906v2() {
        this.f30974I.setTitleOnClickListener(new C6942b());
        this.f30972G.setOnItemClickListener(new C6943c());
    }

    /* renamed from: w2 */
    private void m39907w2() {
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            window.setNavigationBarColor(C0524f.m3223d(getResources(), R.color.sound_effect_bg_color, (Resources.Theme) null));
        }
        if (C8343s.f34788c == BaseApplication.f31162z) {
            window.getDecorView().setSystemUiVisibility(8208);
            if (i >= 21) {
                window.setNavigationBarColor(-1);
            }
        }
        C7397j.m41734d(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public void m39908x2() {
        Dialog dialog = new Dialog(this, R.style.widget_theme);
        dialog.show();
        Window window = dialog.getWindow();
        dialog.setCanceledOnTouchOutside(true);
        window.setContentView(R.layout.dialog_widget_add);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.flags = 2;
        attributes.dimAmount = 0.5f;
        window.setGravity(17);
        window.setAttributes(attributes);
        int[] iArr = {R.id.rb_widget1, R.id.rb_widget2, R.id.rb_widget3, R.id.rb_widget4};
        RadioButton[] radioButtonArr = {(RadioButton) dialog.findViewById(R.id.rb_widget1), (RadioButton) dialog.findViewById(R.id.rb_widget2), (RadioButton) dialog.findViewById(R.id.rb_widget3), (RadioButton) dialog.findViewById(R.id.rb_widget4)};
        TextView textView = (TextView) dialog.findViewById(R.id.tv_detail);
        RadioGroup radioGroup = (RadioGroup) dialog.findViewById(R.id.rg_widget);
        ImageView imageView = (ImageView) dialog.findViewById(R.id.iv_left);
        ImageView imageView2 = (ImageView) dialog.findViewById(R.id.iv_right);
        ViewPager viewPager = (ViewPager) dialog.findViewById(R.id.view_pager);
        viewPager.setAdapter(new C7032l(this, this.f30970E));
        viewPager.setCurrentItem(0);
        this.f30975J = 0;
        textView.setText(getString(this.f30969D[0]));
        radioGroup.check(R.id.rb_widget1);
        imageView.setImageResource(R.drawable.btn_widget_left_off);
        C6944d dVar = r0;
        ViewPager viewPager2 = viewPager;
        C6944d dVar2 = new C6944d(textView, radioGroup, iArr, imageView, imageView2);
        viewPager2.setOnPageChangeListener(dVar);
        ViewPager viewPager3 = viewPager2;
        ImageView imageView3 = imageView2;
        RadioGroup radioGroup2 = radioGroup;
        int[] iArr2 = iArr;
        ImageView imageView4 = imageView2;
        TextView textView2 = textView;
        imageView.setOnClickListener(new C6945e(imageView, viewPager3, imageView3, radioGroup2, iArr2, textView2));
        ImageView imageView5 = imageView4;
        imageView5.setOnClickListener(new C6946f(imageView5, viewPager3, imageView, radioGroup2, iArr2, textView2));
        for (int i = 0; i < 4; i++) {
            radioButtonArr[i].setOnClickListener(new C6947g(this, viewPager2, i, radioGroup, iArr));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m39907w2();
        m39903s2();
        m39901q2();
        m39905u2();
        m39906v2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f30966A != null) {
            this.f30966A = null;
        }
        C8321j.m45995a(this.f30976z);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C8340q.m46288b(this, new C6941a());
    }
}
